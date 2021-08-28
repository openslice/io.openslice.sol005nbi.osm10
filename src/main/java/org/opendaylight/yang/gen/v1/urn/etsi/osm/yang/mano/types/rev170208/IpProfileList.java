package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.list.IpProfiles;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.list.IpProfilesKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping ip-profile-list {
 *   list ip-profiles {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     uses ip-profile-info;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ip-profile-list</i>
 *
 */
public interface IpProfileList
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profile-list");

    @Override
    Class<? extends IpProfileList> implementedInterface();
    
    /**
     * List of IP Profiles. IP Profile describes the IP characteristics for the
     * Virtual-Link
     *
     *
     *
     * @return <code>java.util.Map</code> <code>ipProfiles</code>, or <code>null</code> if not present
     */
    @Nullable Map<IpProfilesKey, IpProfiles> getIpProfiles();
    
    /**
     * @return <code>java.util.Map</code> <code>ipProfiles</code>, or an empty list if it is not present
     */
    default @NonNull Map<IpProfilesKey, IpProfiles> nonnullIpProfiles() {
        return CodeHelpers.nonnull(getIpProfiles());
    }

}

