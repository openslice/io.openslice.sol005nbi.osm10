package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_params;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldParams;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list vnfd-connection-point-ref {
 *   key "member-vnf-index-ref vnfd-connection-point-ref";
 *   leaf member-vnf-index-ref {
 *     type leafref {
 *       path /nsd:nsd-catalog/nsd:nsd/nsd:constituent-vnfd/nsd:member-vnf-index;
 *     }
 *   }
 *   leaf vnfd-connection-point-ref {
 *     type leafref {
 *       path /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:connection-point/vnfd:name;
 *     }
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vld_params/vnfd-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link VnfdConnectionPointRefBuilder}.
 * @see VnfdConnectionPointRefBuilder
 * @see VnfdConnectionPointRefKey
 *
 */
public interface VnfdConnectionPointRef
    extends
    ChildOf<VldParams>,
    Augmentable<VnfdConnectionPointRef>,
    Identifiable<VnfdConnectionPointRefKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-connection-point-ref");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_params.VnfdConnectionPointRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_params.VnfdConnectionPointRef.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable String getMemberVnfIndexRef();
    
    /**
     * @return <code>java.lang.String</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfdConnectionPointRef();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getIpAddress();
    
    @Override
    VnfdConnectionPointRefKey key();

}

