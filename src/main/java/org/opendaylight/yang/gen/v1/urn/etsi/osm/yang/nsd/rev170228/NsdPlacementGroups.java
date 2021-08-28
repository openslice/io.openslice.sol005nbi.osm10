package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.placement.groups.PlacementGroups;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.placement.groups.PlacementGroupsKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * grouping nsd-placement-groups {
 *   list placement-groups {
 *     key name;
 *     uses manotypes:placement-group-info;
 *     list member-vnfd {
 *       key member-vnf-index-ref;
 *       leaf member-vnf-index-ref {
 *         type leafref {
 *           path ../../../constituent-vnfd/member-vnf-index;
 *         }
 *       }
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-placement-groups</i>
 *
 */
public interface NsdPlacementGroups
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-placement-groups");

    @Override
    Class<? extends NsdPlacementGroups> implementedInterface();
    
    /**
     * List of placement groups at NS level
     *
     *
     *
     * @return <code>java.util.Map</code> <code>placementGroups</code>, or <code>null</code> if not present
     */
    @Nullable Map<PlacementGroupsKey, PlacementGroups> getPlacementGroups();
    
    /**
     * @return <code>java.util.Map</code> <code>placementGroups</code>, or an empty list if it is not present
     */
    default @NonNull Map<PlacementGroupsKey, PlacementGroups> nonnullPlacementGroups() {
        return CodeHelpers.nonnull(getPlacementGroups());
    }

}

