package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdusKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of placement groups at VNF level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list placement-groups {
 *   key name;
 *   uses manotypes:placement-group-info;
 *   list member-vdus {
 *     key member-vdu-ref;
 *     leaf member-vdu-ref {
 *       type leafref {
 *         path ../../../vdu/id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/placement-groups</i>
 * 
 * <p>To create instances of this class use {@link PlacementGroupsBuilder}.
 * @see PlacementGroupsBuilder
 * @see PlacementGroupsKey
 *
 */
public interface PlacementGroups
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<PlacementGroups>,
    PlacementGroupInfo,
    Identifiable<PlacementGroupsKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("placement-groups");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups.class;
    }
    
    /**
     * List of VDUs that are part of this placement group
     *
     *
     *
     * @return <code>java.util.Map</code> <code>memberVdus</code>, or <code>null</code> if not present
     */
    @Nullable Map<MemberVdusKey, MemberVdus> getMemberVdus();
    
    /**
     * @return <code>java.util.Map</code> <code>memberVdus</code>, or an empty list if it is not present
     */
    default @NonNull Map<MemberVdusKey, MemberVdus> nonnullMemberVdus() {
        return CodeHelpers.nonnull(getMemberVdus());
    }
    
    @Override
    PlacementGroupsKey key();

}

