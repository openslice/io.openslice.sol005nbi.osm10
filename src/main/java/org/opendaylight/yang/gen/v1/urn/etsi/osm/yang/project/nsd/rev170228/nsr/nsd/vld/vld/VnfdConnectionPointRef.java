package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.vld.vld;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.vld.Vld;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A list of references to connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list vnfd-connection-point-ref {
 *   key "member-vnf-index-ref vnfd-connection-point-ref";
 *   leaf member-vnf-index-ref {
 *     type leafref {
 *       path ../../../constituent-vnfd/member-vnf-index;
 *     }
 *   }
 *   leaf vnfd-id-ref {
 *     type string;
 *   }
 *   leaf vnfd-connection-point-ref {
 *     type leafref {
 *       path "../../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:connection-point/project-vnfd:name";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-vld/vld/vnfd-connection-point-ref</i>
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
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.vld.vld.VnfdConnectionPointRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.vld.vld.VnfdConnectionPointRef.class;
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
     * A reference to a vnfd. This is a leafref to path: ../../nsd:constituent-vnfd +
     * [nsd:id = current()/../nsd:id-ref] + /nsd:vnfd-id-ref NOTE: An issue with confd
     * is preventing the use of xpath. Seems to be an issue with leafref to leafref,
     * whose target is in a different module. Once that is resolved this will switched
     * to use leafref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfdIdRef();
    
    /**
     * A reference to a connection point name
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfdConnectionPointRef();
    
    @Override
    VnfdConnectionPointRefKey key();

}

