package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.placement.groups;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.NsdPlacementGroups;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.placement.groups.placement.groups.MemberVnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.placement.groups.placement.groups.MemberVnfdKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of placement groups at NS level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list placement-groups {
 *   key name;
 *   uses manotypes:placement-group-info;
 *   list member-vnfd {
 *     key member-vnf-index-ref;
 *     leaf member-vnf-index-ref {
 *       type leafref {
 *         path ../../../constituent-vnfd/member-vnf-index;
 *       }
 *     }
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path ../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd/project-vnfd:id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-placement-groups/placement-groups</i>
 * 
 * <p>To create instances of this class use {@link PlacementGroupsBuilder}.
 * @see PlacementGroupsBuilder
 * @see PlacementGroupsKey
 *
 */
public interface PlacementGroups
    extends
    ChildOf<NsdPlacementGroups>,
    Augmentable<PlacementGroups>,
    PlacementGroupInfo,
    Identifiable<PlacementGroupsKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("placement-groups");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.placement.groups.PlacementGroups> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.placement.groups.PlacementGroups.class;
    }
    
    /**
     * List of VNFDs that are part of this placement group
     *
     *
     *
     * @return <code>java.util.Map</code> <code>memberVnfd</code>, or <code>null</code> if not present
     */
    @Nullable Map<MemberVnfdKey, MemberVnfd> getMemberVnfd();
    
    /**
     * @return <code>java.util.Map</code> <code>memberVnfd</code>, or an empty list if it is not present
     */
    default @NonNull Map<MemberVnfdKey, MemberVnfd> nonnullMemberVnfd() {
        return CodeHelpers.nonnull(getMemberVnfd());
    }
    
    @Override
    PlacementGroupsKey key();

}

