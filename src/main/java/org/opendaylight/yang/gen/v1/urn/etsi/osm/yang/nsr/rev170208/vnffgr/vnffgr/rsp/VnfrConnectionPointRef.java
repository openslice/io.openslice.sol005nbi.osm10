package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.Rsp;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ServiceFunctionForwarder;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnfr-connection-point-ref {
 *   key hop-number;
 *   leaf hop-number {
 *     type uint8;
 *   }
 *   leaf service-function-type {
 *     type string;
 *   }
 *   leaf member-vnf-index-ref {
 *     type string;
 *   }
 *   leaf vnfd-id-ref {
 *     type string;
 *   }
 *   leaf vnfr-id-ref {
 *     type leafref {
 *       path ../../../../../../vnfr:vnfr-catalog/vnfr:vnfr/vnfr:id;
 *     }
 *   }
 *   leaf vnfr-name-ref {
 *     type leafref {
 *       path ../../../../../../vnfr:vnfr-catalog/vnfr:vnfr/vnfr:name;
 *     }
 *   }
 *   leaf vnfr-ingress-connection-point-ref {
 *     type leafref {
 *       path "../../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:connection-point/vnfr:name";
 *     }
 *   }
 *   leaf vnfr-egress-connection-point-ref {
 *     type leafref {
 *       path "../../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:connection-point/vnfr:name";
 *     }
 *   }
 *   leaf service-index {
 *     type uint8;
 *   }
 *   container connection-point-params {
 *     leaf mgmt-address {
 *       type inet:ip-address;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf port-id {
 *       type string;
 *     }
 *     leaf vm-id {
 *       type string;
 *     }
 *     leaf address {
 *       type inet:ip-address;
 *     }
 *     leaf port {
 *       type inet:port-number;
 *     }
 *   }
 *   container service-function-forwarder {
 *     leaf name {
 *       type string;
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf port {
 *       type inet:port-number;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr/rsp/vnfr-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link VnfrConnectionPointRefBuilder}.
 * @see VnfrConnectionPointRefBuilder
 * @see VnfrConnectionPointRefKey
 *
 */
public interface VnfrConnectionPointRef
    extends
    ChildOf<Rsp>,
    Augmentable<VnfrConnectionPointRef>,
    Identifiable<VnfrConnectionPointRefKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfr-connection-point-ref");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef.class;
    }
    
    /**
     * Monotonically increasing number to show service path hop order
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint8</code> <code>hopNumber</code>, or <code>null</code> if not present
     */
    @Nullable Uint8 getHopNumber();
    
    /**
     * Type of Service Function. NOTE: This needs to map with Service Function Type in
     * ODL to support VNFFG. Service Function Type is mandatory param in ODL SFC. This
     * is temporarily set to string for ease of use
     *
     *
     *
     * @return <code>java.lang.String</code> <code>serviceFunctionType</code>, or <code>null</code> if not present
     */
    @Nullable String getServiceFunctionType();
    
    /**
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable String getMemberVnfIndexRef();
    
    /**
     * Reference to VNF Descriptor Id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfdIdRef();
    
    /**
     * A reference to a vnfr id
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfrIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfrIdRef();
    
    /**
     * A reference to a vnfr name
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfrNameRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfrNameRef();
    
    /**
     * A reference to a vnfr connection point.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfrIngressConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfrIngressConnectionPointRef();
    
    /**
     * A reference to a vnfr connection point.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfrEgressConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfrEgressConnectionPointRef();
    
    /**
     * Location within the service path
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint8</code> <code>serviceIndex</code>, or <code>null</code> if not present
     */
    @Nullable Uint8 getServiceIndex();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams</code> <code>connectionPointParams</code>, or <code>null</code> if not present
     */
    @Nullable ConnectionPointParams getConnectionPointParams();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ServiceFunctionForwarder</code> <code>serviceFunctionForwarder</code>, or <code>null</code> if not present
     */
    @Nullable ServiceFunctionForwarder getServiceFunctionForwarder();
    
    @Override
    VnfrConnectionPointRefKey key();

}

