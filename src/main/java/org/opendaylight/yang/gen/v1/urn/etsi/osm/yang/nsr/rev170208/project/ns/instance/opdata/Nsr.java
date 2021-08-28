package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ConfigStates;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsOperationalStatus;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Vnffgr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.NsInstanceOpdata;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJobKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConnectionPointKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRefKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParamKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.NsConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecord;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecordKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.Vlr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.VlrKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list nsr {
 *   key ns-instance-config-ref;
 *   leaf ns-instance-config-ref {
 *     type leafref {
 *       path ../../../ns-instance-config/nsr/id;
 *     }
 *   }
 *   leaf name-ref {
 *     type leafref {
 *       path ../../../ns-instance-config/nsr[id=current()/../ns-instance-config-ref]/name;
 *     }
 *   }
 *   leaf nsd-ref {
 *     type leafref {
 *       path ../../../ns-instance-config/nsr[id=current()/../ns-instance-config-ref]/nsd/id;
 *     }
 *   }
 *   leaf nsd-name-ref {
 *     type leafref {
 *       path ../../../ns-instance-config/nsr[id=current()/../ns-instance-config-ref]/nsd/name;
 *     }
 *   }
 *   leaf create-time {
 *     type uint32;
 *   }
 *   leaf uptime {
 *     type uint32;
 *   }
 *   list connection-point {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf type {
 *       type manotypes:connection-point-type;
 *     }
 *   }
 *   list vlr {
 *     key vlr-ref;
 *     leaf vlr-ref {
 *       type leafref {
 *         path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *       }
 *     }
 *     list vnfr-connection-point-ref {
 *       key vnfr-id;
 *       leaf vnfr-id {
 *         type leafref {
 *           path ../../../../../vnfr:vnfr-catalog/vnfr:vnfr/vnfr:id;
 *         }
 *       }
 *       leaf connection-point {
 *         type leafref {
 *           path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id]/vnfr:connection-point/vnfr:name";
 *         }
 *       }
 *     }
 *   }
 *   list constituent-vnfr-ref {
 *     key vnfr-id;
 *     leaf vnfr-id {
 *       type string;
 *     }
 *   }
 *   list scaling-group-record {
 *     key scaling-group-name-ref;
 *     leaf scaling-group-name-ref {
 *       type leafref {
 *         path ../../../../ns-instance-config/nsr[id=current()/../../ns-instance-config-ref]/nsd/scaling-group-descriptor/name;
 *       }
 *     }
 *     list instance {
 *       key instance-id;
 *       leaf instance-id {
 *         type uint16;
 *       }
 *       leaf is-default {
 *         type boolean;
 *       }
 *       leaf op-status {
 *         type enumeration {
 *           enum init;
 *           enum vnf-init-phase;
 *           enum running;
 *           enum terminate;
 *           enum vnf-terminate-phase;
 *           enum terminated;
 *           enum failed;
 *         }
 *       }
 *       leaf config-status {
 *         type config-states;
 *       }
 *       leaf error-msg {
 *         type string;
 *       }
 *       leaf create-time {
 *         type uint32;
 *       }
 *       leaf-list vnfrs {
 *         type leafref {
 *           path ../../../constituent-vnfr-ref/vnfr-id;
 *         }
 *       }
 *     }
 *   }
 *   uses vnffgr;
 *   leaf operational-status {
 *     type ns-operational-status;
 *   }
 *   container ns-configuration {
 *     uses manotypes:vca-configuration;
 *   }
 *   leaf config-status {
 *     type config-states;
 *   }
 *   list monitoring-param {
 *     key id;
 *     uses manotypes:monitoring-param-value;
 *     uses manotypes:monitoring-param-ui-data;
 *     uses manotypes:monitoring-param-aggregation;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf nsd-mon-param-ref {
 *       type leafref {
 *         path "../../../../project-nsd:nsd-catalog/project-nsd:nsd[project-nsd:id = current()/../../nsd-ref]/project-nsd:monitoring-param/project-nsd:id";
 *       }
 *     }
 *     list vnfr-mon-param-ref {
 *       key "vnfr-id-ref vnfr-mon-param-ref";
 *       leaf vnfr-id-ref {
 *         type yang:uuid;
 *       }
 *       leaf vnfr-mon-param-ref {
 *         type leafref {
 *           path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:monitoring-param/vnfr:id";
 *         }
 *       }
 *     }
 *   }
 *   list config-agent-job {
 *     key job-id;
 *     leaf job-id {
 *       type uint64;
 *     }
 *     leaf job-name {
 *       type string;
 *     }
 *     leaf job-status {
 *       type enumeration {
 *         enum pending;
 *         enum success;
 *         enum failure;
 *       }
 *     }
 *     leaf triggered-by {
 *       type trigger-type;
 *     }
 *     leaf create-time {
 *       type uint32;
 *     }
 *     leaf job-status-details {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *     list parameter-group {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *     }
 *     list vnfr {
 *       key id;
 *       leaf id {
 *         type yang:uuid;
 *       }
 *       leaf vnf-job-status {
 *         type enumeration {
 *           enum pending;
 *           enum success;
 *           enum failure;
 *         }
 *       }
 *       list primitive {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         uses manotypes:primitive-parameter-value;
 *         leaf execution-id {
 *           type string;
 *         }
 *         leaf execution-status {
 *           type enumeration {
 *             enum pending;
 *             enum success;
 *             enum failure;
 *           }
 *         }
 *         leaf execution-error-details {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:etsi:osm:yang:nsr?revision=2017-02-08)ns-instance-opdata/nsr</i>
 * 
 * <p>To create instances of this class use {@link NsrBuilder}.
 * @see NsrBuilder
 * @see NsrKey
 *
 */
public interface Nsr
    extends
    ChildOf<NsInstanceOpdata>,
    Augmentable<Nsr>,
    Vnffgr,
    Identifiable<NsrKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsr");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.Nsr> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.Nsr.class;
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>nsInstanceConfigRef</code>, or <code>null</code> if not present
     */
    @Nullable Uuid getNsInstanceConfigRef();
    
    /**
     * Network service name reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nameRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getNameRef();
    
    /**
     * Network service descriptor id reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getNsdRef();
    
    /**
     * Network service descriptor name reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsdNameRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getNsdNameRef();
    
    /**
     * Creation timestamp of this Network Service. The timestamp is expressed as
     * seconds since unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>createTime</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getCreateTime();
    
    /**
     * Active period of this Network Service. Uptime is expressed in seconds
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>uptime</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getUptime();
    
    /**
     * List for external connection points. Each NS has one or more external connection
     * points. As the name implies that external connection points are used for
     * connecting the NS to other NS or to external networks. Each NS exposes these
     * connection points to the orchestrator. The orchestrator can construct network
     * service chains by connecting the connection points between different NS.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>connectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable Map<ConnectionPointKey, ConnectionPoint> getConnectionPoint();
    
    /**
     * @return <code>java.util.Map</code> <code>connectionPoint</code>, or an empty list if it is not present
     */
    default @NonNull Map<ConnectionPointKey, ConnectionPoint> nonnullConnectionPoint() {
        return CodeHelpers.nonnull(getConnectionPoint());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>vlr</code>, or <code>null</code> if not present
     */
    @Nullable Map<VlrKey, Vlr> getVlr();
    
    /**
     * @return <code>java.util.Map</code> <code>vlr</code>, or an empty list if it is not present
     */
    default @NonNull Map<VlrKey, Vlr> nonnullVlr() {
        return CodeHelpers.nonnull(getVlr());
    }
    
    /**
     * List of VNFRs that are part of this network service.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>constituentVnfrRef</code>, or <code>null</code> if not present
     */
    @Nullable Map<ConstituentVnfrRefKey, ConstituentVnfrRef> getConstituentVnfrRef();
    
    /**
     * @return <code>java.util.Map</code> <code>constituentVnfrRef</code>, or an empty list if it is not present
     */
    default @NonNull Map<ConstituentVnfrRefKey, ConstituentVnfrRef> nonnullConstituentVnfrRef() {
        return CodeHelpers.nonnull(getConstituentVnfrRef());
    }
    
    /**
     * List of scaling group records
     *
     *
     *
     * @return <code>java.util.Map</code> <code>scalingGroupRecord</code>, or <code>null</code> if not present
     */
    @Nullable Map<ScalingGroupRecordKey, ScalingGroupRecord> getScalingGroupRecord();
    
    /**
     * @return <code>java.util.Map</code> <code>scalingGroupRecord</code>, or an empty list if it is not present
     */
    default @NonNull Map<ScalingGroupRecordKey, ScalingGroupRecord> nonnullScalingGroupRecord() {
        return CodeHelpers.nonnull(getScalingGroupRecord());
    }
    
    /**
     * The operational status of the NS instance init : The network service has just
     * started. vl-init-phase : The VLs in the NS are being instantiated.
     * vnf-init-phase : The VNFs in the NS are being instantiated. running : The NS is
     * in running state. terminate : The NS is being terminated. vnf-terminate-phase :
     * The NS is terminating the VNFs in the NS. vl-terminate-phase : The NS is
     * terminating the VLs in the NS. terminated : The NS is in the terminated state.
     * failed : The NS instantiation failed. scaling-out : The NS is scaling out
     * scaling-in : The NS is scaling in vl-instantiate : The NS is initiating a new VL
     * vl-terminate : The NS is terminating a VL 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsOperationalStatus</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    @Nullable NsOperationalStatus getOperationalStatus();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.NsConfiguration</code> <code>nsConfiguration</code>, or <code>null</code> if not present
     */
    @Nullable NsConfiguration getNsConfiguration();
    
    /**
     * The configuration status of the NS instance configuring: At least one of the
     * VNFs in this instance is in configuring state configured: All the VNFs in this
     * NS instance are configured or config-not-needed state 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ConfigStates</code> <code>configStatus</code>, or <code>null</code> if not present
     */
    @Nullable ConfigStates getConfigStatus();
    
    /**
     * List of NS level params.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>monitoringParam</code>, or <code>null</code> if not present
     */
    @Nullable Map<MonitoringParamKey, MonitoringParam> getMonitoringParam();
    
    /**
     * @return <code>java.util.Map</code> <code>monitoringParam</code>, or an empty list if it is not present
     */
    default @NonNull Map<MonitoringParamKey, MonitoringParam> nonnullMonitoringParam() {
        return CodeHelpers.nonnull(getMonitoringParam());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>configAgentJob</code>, or <code>null</code> if not present
     */
    @Nullable Map<ConfigAgentJobKey, ConfigAgentJob> getConfigAgentJob();
    
    /**
     * @return <code>java.util.Map</code> <code>configAgentJob</code>, or an empty list if it is not present
     */
    default @NonNull Map<ConfigAgentJobKey, ConfigAgentJob> nonnullConfigAgentJob() {
        return CodeHelpers.nonnull(getConfigAgentJob());
    }
    
    @Override
    NsrKey key();

}

