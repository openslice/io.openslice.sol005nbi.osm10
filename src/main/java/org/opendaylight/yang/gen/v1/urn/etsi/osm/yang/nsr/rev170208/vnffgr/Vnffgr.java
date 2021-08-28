package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.VnffgrOperationalStatus;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.Classifier;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.ClassifierKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.Rsp;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.RspKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnffgr {
 *   key id;
 *   leaf id {
 *     type yang:uuid;
 *   }
 *   leaf vnffgd-id-ref {
 *     type leafref {
 *       path ../../../../ns-instance-config/nsr[id=current()/../../ns-instance-config-ref]/nsd/vnffgd/id;
 *     }
 *   }
 *   leaf vnffgd-name-ref {
 *     type leafref {
 *       path ../../../../ns-instance-config/nsr[id=current()/../../ns-instance-config-ref]/nsd/vnffgd[id=current()/../vnffgd-id-ref]/name;
 *     }
 *   }
 *   leaf sdn-account {
 *     type string;
 *   }
 *   leaf cloud-account {
 *     type string;
 *   }
 *   leaf operational-status {
 *     type vnffgr-operational-status;
 *   }
 *   list rsp {
 *     key id;
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf rsp-id {
 *       type yang:uuid;
 *     }
 *     leaf vnffgd-rsp-id-ref {
 *       type leafref {
 *         path ../../../../../ns-instance-config/nsr[id=current()/../../../ns-instance-config-ref]/nsd/vnffgd[id=current()/../../vnffgd-id-ref]/rsp/id;
 *       }
 *     }
 *     leaf vnffgd-rsp-name-ref {
 *       type leafref {
 *         path ../../../../../ns-instance-config/nsr[id=current()/../../../ns-instance-config-ref]/nsd/vnffgd[id=current()/../../vnffgd-id-ref]/rsp[id=current()/../vnffgd-rsp-id-ref]/name;
 *       }
 *     }
 *     leaf classifier-name {
 *       type string;
 *     }
 *     leaf path-id {
 *       type uint32;
 *     }
 *     list vnfr-connection-point-ref {
 *       key hop-number;
 *       leaf hop-number {
 *         type uint8;
 *       }
 *       leaf service-function-type {
 *         type string;
 *       }
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf vnfd-id-ref {
 *         type string;
 *       }
 *       leaf vnfr-id-ref {
 *         type leafref {
 *           path ../../../../../../vnfr:vnfr-catalog/vnfr:vnfr/vnfr:id;
 *         }
 *       }
 *       leaf vnfr-name-ref {
 *         type leafref {
 *           path ../../../../../../vnfr:vnfr-catalog/vnfr:vnfr/vnfr:name;
 *         }
 *       }
 *       leaf vnfr-ingress-connection-point-ref {
 *         type leafref {
 *           path "../../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:connection-point/vnfr:name";
 *         }
 *       }
 *       leaf vnfr-egress-connection-point-ref {
 *         type leafref {
 *           path "../../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:connection-point/vnfr:name";
 *         }
 *       }
 *       leaf service-index {
 *         type uint8;
 *       }
 *       container connection-point-params {
 *         leaf mgmt-address {
 *           type inet:ip-address;
 *         }
 *         leaf name {
 *           type string;
 *         }
 *         leaf port-id {
 *           type string;
 *         }
 *         leaf vm-id {
 *           type string;
 *         }
 *         leaf address {
 *           type inet:ip-address;
 *         }
 *         leaf port {
 *           type inet:port-number;
 *         }
 *       }
 *       container service-function-forwarder {
 *         leaf name {
 *           type string;
 *         }
 *         leaf ip-address {
 *           type inet:ip-address;
 *         }
 *         leaf port {
 *           type inet:port-number;
 *         }
 *       }
 *     }
 *   }
 *   list classifier {
 *     key id;
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf-list classifier-id {
 *       type yang:uuid;
 *     }
 *     leaf rsp-id-ref {
 *       type leafref {
 *         path ../../rsp/id;
 *       }
 *     }
 *     leaf rsp-name {
 *       type string;
 *     }
 *     leaf vnfr-id-ref {
 *       type leafref {
 *         path ../../../../../vnfr:vnfr-catalog/vnfr:vnfr/vnfr:id;
 *       }
 *     }
 *     leaf vnfr-name-ref {
 *       type leafref {
 *         path ../../../../../vnfr:vnfr-catalog/vnfr:vnfr/vnfr:name;
 *       }
 *     }
 *     leaf vnfr-connection-point-ref {
 *       type leafref {
 *         path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:connection-point/vnfr:name";
 *       }
 *     }
 *     leaf port-id {
 *       type string;
 *     }
 *     leaf vm-id {
 *       type string;
 *     }
 *     leaf ip-address {
 *       type string;
 *     }
 *     leaf sff-name {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr</i>
 * 
 * <p>To create instances of this class use {@link VnffgrBuilder}.
 * @see VnffgrBuilder
 * @see VnffgrKey
 *
 */
public interface Vnffgr
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Vnffgr>,
    Augmentable<Vnffgr>,
    Identifiable<VnffgrKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgr");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.Vnffgr> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.Vnffgr.class;
    }
    
    /**
     * Identifier for the VNFFGR.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable Uuid getId();
    
    /**
     * VNFFG descriptor id reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnffgdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnffgdIdRef();
    
    /**
     * VNFFG descriptor name reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnffgdNameRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnffgdNameRef();
    
    /**
     * The SDN account to use when requesting resources for this vnffgr
     *
     *
     *
     * @return <code>java.lang.String</code> <code>sdnAccount</code>, or <code>null</code> if not present
     */
    @Nullable String getSdnAccount();
    
    /**
     * Cloud Account in which NSR is instantiated
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cloudAccount</code>, or <code>null</code> if not present
     */
    @Nullable String getCloudAccount();
    
    /**
     * The operational status of the VNFFGR instance init : The VNFFGR has just
     * started. running : The VNFFGR is in running state. terminate : The VNFFGR is
     * being terminated. terminated : The VNFFGR is in the terminated state. failed :
     * The VNFFGR instantiation failed 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.VnffgrOperationalStatus</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    @Nullable VnffgrOperationalStatus getOperationalStatus();
    
    /**
     * @return <code>java.util.Map</code> <code>rsp</code>, or <code>null</code> if not present
     */
    @Nullable Map<RspKey, Rsp> getRsp();
    
    /**
     * @return <code>java.util.Map</code> <code>rsp</code>, or an empty list if it is not present
     */
    default @NonNull Map<RspKey, Rsp> nonnullRsp() {
        return CodeHelpers.nonnull(getRsp());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>classifier</code>, or <code>null</code> if not present
     */
    @Nullable Map<ClassifierKey, Classifier> getClassifier();
    
    /**
     * @return <code>java.util.Map</code> <code>classifier</code>, or an empty list if it is not present
     */
    default @NonNull Map<ClassifierKey, Classifier> nonnullClassifier() {
        return CodeHelpers.nonnull(getClassifier());
    }
    
    @Override
    VnffgrKey key();

}

