package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.placement.group.info.PlacementGroupsInfo;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.placement.group.info.PlacementGroupsInfoKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * grouping placement-group-info {
 *   list placement-groups-info {
 *     key name;
 *     uses manotypes:placement-group-info;
 *     uses manotypes:placement-group-input;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/placement-group-info</i>
 *
 */
public interface PlacementGroupInfo
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("placement-group-info");

    @Override
    Class<? extends PlacementGroupInfo> implementedInterface();
    
    /**
     *  Placement groups to which this VDU belongs and its cloud construct 
     *
     *
     *
     * @return <code>java.util.Map</code> <code>placementGroupsInfo</code>, or <code>null</code> if not present
     */
    @Nullable Map<PlacementGroupsInfoKey, PlacementGroupsInfo> getPlacementGroupsInfo();
    
    /**
     * @return <code>java.util.Map</code> <code>placementGroupsInfo</code>, or an empty list if it is not present
     */
    default @NonNull Map<PlacementGroupsInfoKey, PlacementGroupsInfo> nonnullPlacementGroupsInfo() {
        return CodeHelpers.nonnull(getPlacementGroupsInfo());
    }

}

