package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * A list of references to connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list vnfd-connection-point-ref {
 *   key member-vnf-index-ref;
 *   leaf member-vnf-index-ref {
 *     type leafref {
 *       path ../../../../constituent-vnfd/member-vnf-index;
 *     }
 *   }
 *   leaf order {
 *     type uint8;
 *   }
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path "../../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *     }
 *   }
 *   leaf vnfd-ingress-connection-point-ref {
 *     type string;
 *   }
 *   leaf vnfd-egress-connection-point-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd/rsp/vnfd-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link VnfdConnectionPointRefBuilder}.
 * @see VnfdConnectionPointRefBuilder
 * @see VnfdConnectionPointRefKey
 *
 */
public interface VnfdConnectionPointRef
    extends
    ChildOf<Rsp>,
    Augmentable<VnfdConnectionPointRef>,
    Identifiable<VnfdConnectionPointRefKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-connection-point-ref");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef.class;
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
     * A number that denotes the order of a VNF in a chain
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint8</code> <code>order</code>, or <code>null</code> if not present
     */
    @Nullable Uint8 getOrder();
    
    /**
     * A reference to a vnfd. This is a leafref to path:
     * ../../../../nsd:constituent-vnfd + [nsd:id = current()/../nsd:id-ref] +
     * /nsd:vnfd-id-ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfdIdRef();
    
    /**
     * A reference to a connection point name in a vnfd. This is a leafref to path:
     * /vnfd:vnfd-catalog/vnfd:vnfd + [vnfd:id = current()/../nsd:vnfd-id-ref] +
     * /vnfd:connection-point/vnfd:name NOTE: An issue with confd is preventing the use
     * of xpath. Seems to be an issue with leafref to leafref, whose target is in a
     * different module. Once that is resolved this will switched to use leafref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdIngressConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfdIngressConnectionPointRef();
    
    /**
     * A reference to a connection point name in a vnfd. This is a leafref to path:
     * /vnfd:vnfd-catalog/vnfd:vnfd + [vnfd:id = current()/../nsd:vnfd-id-ref] +
     * /vnfd:connection-point/vnfd:name NOTE: An issue with confd is preventing the use
     * of xpath. Seems to be an issue with leafref to leafref, whose target is in a
     * different module. Once that is resolved this will switched to use leafref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdEgressConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfdEgressConnectionPointRef();
    
    @Override
    VnfdConnectionPointRefKey key();

}

