package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.placement.groups.placement.groups;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.placement.groups.PlacementGroups;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of VNFDs that are part of this placement group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list member-vnfd {
 *   key member-vnf-index-ref;
 *   leaf member-vnf-index-ref {
 *     type leafref {
 *       path ../../../constituent-vnfd/member-vnf-index;
 *     }
 *   }
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path ../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd/project-vnfd:id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-placement-groups/placement-groups/member-vnfd</i>
 * 
 * <p>To create instances of this class use {@link MemberVnfdBuilder}.
 * @see MemberVnfdBuilder
 * @see MemberVnfdKey
 *
 */
public interface MemberVnfd
    extends
    ChildOf<PlacementGroups>,
    Augmentable<MemberVnfd>,
    Identifiable<MemberVnfdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("member-vnfd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.placement.groups.placement.groups.MemberVnfd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.placement.groups.placement.groups.MemberVnfd.class;
    }
    
    /**
     * member VNF index of this member VNF
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getMemberVnfIndexRef();
    
    /**
     * Identifier for the VNFD.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfdIdRef();
    
    @Override
    MemberVnfdKey key();

}

