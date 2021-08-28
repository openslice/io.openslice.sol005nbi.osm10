package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.placement.group.info;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.PlacementGroupInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 *  Placement groups to which this VDU belongs and its cloud construct 
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list placement-groups-info {
 *   key name;
 *   uses manotypes:placement-group-info;
 *   uses manotypes:placement-group-input;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/placement-group-info/placement-groups-info</i>
 * 
 * <p>To create instances of this class use {@link PlacementGroupsInfoBuilder}.
 * @see PlacementGroupsInfoBuilder
 * @see PlacementGroupsInfoKey
 *
 */
public interface PlacementGroupsInfo
    extends
    ChildOf<PlacementGroupInfo>,
    Augmentable<PlacementGroupsInfo>,
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInfo,
    PlacementGroupInput,
    Identifiable<PlacementGroupsInfoKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("placement-groups-info");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.placement.group.info.PlacementGroupsInfo> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.placement.group.info.PlacementGroupsInfo.class;
    }
    
    @Override
    PlacementGroupsInfoKey key();

}

