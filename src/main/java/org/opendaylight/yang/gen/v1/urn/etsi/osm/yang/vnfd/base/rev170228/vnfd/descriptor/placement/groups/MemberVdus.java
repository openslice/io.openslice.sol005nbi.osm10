package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.placement.groups;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of VDUs that are part of this placement group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list member-vdus {
 *   key member-vdu-ref;
 *   leaf member-vdu-ref {
 *     type leafref {
 *       path ../../../vdu/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/placement-groups/member-vdus</i>
 * 
 * <p>To create instances of this class use {@link MemberVdusBuilder}.
 * @see MemberVdusBuilder
 * @see MemberVdusKey
 *
 */
public interface MemberVdus
    extends
    ChildOf<PlacementGroups>,
    Augmentable<MemberVdus>,
    Identifiable<MemberVdusKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("member-vdus");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>memberVduRef</code>, or <code>null</code> if not present
     */
    @Nullable String getMemberVduRef();
    
    @Override
    MemberVdusKey key();

}

