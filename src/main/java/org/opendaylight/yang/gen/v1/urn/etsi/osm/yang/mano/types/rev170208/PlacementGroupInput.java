package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.CloudProvider;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping placement-group-input {
 *   leaf cloud-type {
 *     type manotypes:cloud-account-type;
 *   }
 *   choice cloud-provider {
 *     case openstack {
 *       container availability-zone {
 *         leaf name {
 *           type string;
 *         }
 *       }
 *       container server-group {
 *         leaf name {
 *           type string;
 *         }
 *       }
 *       uses host-aggregate;
 *     }
 *     case aws {
 *       leaf aws-construct {
 *         type empty;
 *       }
 *     }
 *     case openmano {
 *       leaf openmano-construct {
 *         type empty;
 *       }
 *     }
 *     case vsphere {
 *       leaf vsphere-construct {
 *         type empty;
 *       }
 *     }
 *     case mock {
 *       leaf mock-construct {
 *         type empty;
 *       }
 *     }
 *     case cloudsim {
 *       leaf cloudsim-construct {
 *         type empty;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input</i>
 *
 */
public interface PlacementGroupInput
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("placement-group-input");

    @Override
    Class<? extends PlacementGroupInput> implementedInterface();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudAccountType</code> <code>cloudType</code>, or <code>null</code> if not present
     */
    @Nullable CloudAccountType getCloudType();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.CloudProvider</code> <code>cloudProvider</code>, or <code>null</code> if not present
     */
    @Nullable CloudProvider getCloudProvider();

}

