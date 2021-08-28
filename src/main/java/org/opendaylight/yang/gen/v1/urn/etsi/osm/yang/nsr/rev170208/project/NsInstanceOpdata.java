package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Project3;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.Nsr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.NsrKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container ns-instance-opdata {
 *   config false;
 *   list nsr {
 *     key ns-instance-config-ref;
 *     leaf ns-instance-config-ref {
 *       type leafref {
 *         path ../../../ns-instance-config/nsr/id;
 *       }
 *     }
 *     leaf name-ref {
 *       type leafref {
 *         path ../../../ns-instance-config/nsr[id=current()/../ns-instance-config-ref]/name;
 *       }
 *     }
 *     leaf nsd-ref {
 *       type leafref {
 *         path ../../../ns-instance-config/nsr[id=current()/../ns-instance-config-ref]/nsd/id;
 *       }
 *     }
 *     leaf nsd-name-ref {
 *       type leafref {
 *         path ../../../ns-instance-config/nsr[id=current()/../ns-instance-config-ref]/nsd/name;
 *       }
 *     }
 *     leaf create-time {
 *       type uint32;
 *     }
 *     leaf uptime {
 *       type uint32;
 *     }
 *     list connection-point {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf type {
 *         type manotypes:connection-point-type;
 *       }
 *     }
 *     list vlr {
 *       key vlr-ref;
 *       leaf vlr-ref {
 *         type leafref {
 *           path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *         }
 *       }
 *       list vnfr-connection-point-ref {
 *         key vnfr-id;
 *         leaf vnfr-id {
 *           type leafref {
 *             path ../../../../../vnfr:vnfr-catalog/vnfr:vnfr/vnfr:id;
 *           }
 *         }
 *         leaf connection-point {
 *           type leafref {
 *             path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id]/vnfr:connection-point/vnfr:name";
 *           }
 *         }
 *       }
 *     }
 *     list constituent-vnfr-ref {
 *       key vnfr-id;
 *       leaf vnfr-id {
 *         type string;
 *       }
 *     }
 *     list scaling-group-record {
 *       key scaling-group-name-ref;
 *       leaf scaling-group-name-ref {
 *         type leafref {
 *           path ../../../../ns-instance-config/nsr[id=current()/../../ns-instance-config-ref]/nsd/scaling-group-descriptor/name;
 *         }
 *       }
 *       list instance {
 *         key instance-id;
 *         leaf instance-id {
 *           type uint16;
 *         }
 *         leaf is-default {
 *           type boolean;
 *         }
 *         leaf op-status {
 *           type enumeration {
 *             enum init;
 *             enum vnf-init-phase;
 *             enum running;
 *             enum terminate;
 *             enum vnf-terminate-phase;
 *             enum terminated;
 *             enum failed;
 *           }
 *         }
 *         leaf config-status {
 *           type config-states;
 *         }
 *         leaf error-msg {
 *           type string;
 *         }
 *         leaf create-time {
 *           type uint32;
 *         }
 *         leaf-list vnfrs {
 *           type leafref {
 *             path ../../../constituent-vnfr-ref/vnfr-id;
 *           }
 *         }
 *       }
 *     }
 *     uses vnffgr;
 *     leaf operational-status {
 *       type ns-operational-status;
 *     }
 *     container ns-configuration {
 *       uses manotypes:vca-configuration;
 *     }
 *     leaf config-status {
 *       type config-states;
 *     }
 *     list monitoring-param {
 *       key id;
 *       uses manotypes:monitoring-param-value;
 *       uses manotypes:monitoring-param-ui-data;
 *       uses manotypes:monitoring-param-aggregation;
 *       leaf id {
 *         type string;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       leaf nsd-mon-param-ref {
 *         type leafref {
 *           path "../../../../project-nsd:nsd-catalog/project-nsd:nsd[project-nsd:id = current()/../../nsd-ref]/project-nsd:monitoring-param/project-nsd:id";
 *         }
 *       }
 *       list vnfr-mon-param-ref {
 *         key "vnfr-id-ref vnfr-mon-param-ref";
 *         leaf vnfr-id-ref {
 *           type yang:uuid;
 *         }
 *         leaf vnfr-mon-param-ref {
 *           type leafref {
 *             path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:monitoring-param/vnfr:id";
 *           }
 *         }
 *       }
 *     }
 *     list config-agent-job {
 *       key job-id;
 *       leaf job-id {
 *         type uint64;
 *       }
 *       leaf job-name {
 *         type string;
 *       }
 *       leaf job-status {
 *         type enumeration {
 *           enum pending;
 *           enum success;
 *           enum failure;
 *         }
 *       }
 *       leaf triggered-by {
 *         type trigger-type;
 *       }
 *       leaf create-time {
 *         type uint32;
 *       }
 *       leaf job-status-details {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *       list parameter-group {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         uses manotypes:primitive-parameter-value;
 *       }
 *       list vnfr {
 *         key id;
 *         leaf id {
 *           type yang:uuid;
 *         }
 *         leaf vnf-job-status {
 *           type enumeration {
 *             enum pending;
 *             enum success;
 *             enum failure;
 *           }
 *         }
 *         list primitive {
 *           key name;
 *           leaf name {
 *             type string;
 *           }
 *           uses manotypes:primitive-parameter-value;
 *           leaf execution-id {
 *             type string;
 *           }
 *           leaf execution-status {
 *             type enumeration {
 *               enum pending;
 *               enum success;
 *               enum failure;
 *             }
 *           }
 *           leaf execution-error-details {
 *             type string;
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:etsi:osm:yang:nsr?revision=2017-02-08)ns-instance-opdata</i>
 * 
 * <p>To create instances of this class use {@link NsInstanceOpdataBuilder}.
 * @see NsInstanceOpdataBuilder
 *
 */
public interface NsInstanceOpdata
    extends
    ChildOf<Project3>,
    Augmentable<NsInstanceOpdata>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ns-instance-opdata");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.NsInstanceOpdata> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.NsInstanceOpdata.class;
    }
    
    /**
     * @return <code>java.util.Map</code> <code>nsr</code>, or <code>null</code> if not present
     */
    @Nullable Map<NsrKey, Nsr> getNsr();
    
    /**
     * @return <code>java.util.Map</code> <code>nsr</code>, or an empty list if it is not present
     */
    default @NonNull Map<NsrKey, Nsr> nonnullNsr() {
        return CodeHelpers.nonnull(getNsr());
    }

}

