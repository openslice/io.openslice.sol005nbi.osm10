package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.vld.vld;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.vld.Vld;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A list of references to connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vnfd-connection-point-ref {
 *   key "member-vnf-index-ref vnfd-connection-point-ref";
 *   leaf member-vnf-index-ref {
 *     type leafref {
 *       path ../../../constituent-vnfd/member-vnf-index;
 *     }
 *   }
 *   leaf vnfd-connection-point-ref {
 *     type leafref {
 *       path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:connection-point/vnfd:name";
 *     }
 *   }
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *     }
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-vld/vld/vnfd-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link VnfdConnectionPointRefBuilder}.
 * @see VnfdConnectionPointRefBuilder
 * @see VnfdConnectionPointRefKey
 *
 */
public interface VnfdConnectionPointRef
    extends
    ChildOf<Vld>,
    Augmentable<VnfdConnectionPointRef>,
    Identifiable<VnfdConnectionPointRefKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-connection-point-ref");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.vld.vld.VnfdConnectionPointRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.vld.vld.VnfdConnectionPointRef.class;
    }
    
    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getMemberVnfIndexRef();
    
    /**
     * A reference to a connection point name
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfdConnectionPointRef();
    
    /**
     * A reference to a VNFD
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfdIdRef();
    
    /**
     * IP address of the connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getIpAddress();
    
    @Override
    VnfdConnectionPointRefKey key();

}

