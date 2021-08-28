package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostAggregate;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.CloudProvider;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider.openstack.AvailabilityZone;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider.openstack.ServerGroup;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case openstack {
 *   container availability-zone {
 *     leaf name {
 *       type string;
 *     }
 *   }
 *   container server-group {
 *     leaf name {
 *       type string;
 *     }
 *   }
 *   uses host-aggregate;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider/openstack</i>
 *
 */
public interface Openstack
    extends
    DataObject,
    Augmentable<Openstack>,
    HostAggregate,
    CloudProvider
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("openstack");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider.Openstack> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider.Openstack.class;
    }
    
    /**
     * Name of the Availability Zone
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider.openstack.AvailabilityZone</code> <code>availabilityZone</code>, or <code>null</code> if not present
     */
    @Nullable AvailabilityZone getAvailabilityZone();
    
    /**
     * Name of the Affinity/Anti-Affinity Server Group
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider.openstack.ServerGroup</code> <code>serverGroup</code>, or <code>null</code> if not present
     */
    @Nullable ServerGroup getServerGroup();

}

