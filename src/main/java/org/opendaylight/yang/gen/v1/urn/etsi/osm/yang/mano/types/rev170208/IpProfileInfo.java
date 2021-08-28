package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.IpProfileParams;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping for IP-Profile
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping ip-profile-info {
 *   container ip-profile-params {
 *     leaf ip-version {
 *       type inet:ip-version;
 *       default ipv4;
 *     }
 *     leaf subnet-address {
 *       type inet:ip-prefix;
 *     }
 *     leaf gateway-address {
 *       type inet:ip-address;
 *     }
 *     leaf security-group {
 *       type string;
 *     }
 *     list dns-server {
 *       key address;
 *       leaf address {
 *         type inet:ip-address;
 *       }
 *     }
 *     container dhcp-params {
 *       leaf enabled {
 *         type boolean;
 *         default true;
 *       }
 *       leaf start-address {
 *         type inet:ip-address;
 *       }
 *       leaf count {
 *         type uint32;
 *       }
 *     }
 *     leaf subnet-prefix-pool {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ip-profile-info</i>
 *
 */
public interface IpProfileInfo
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profile-info");

    @Override
    Class<? extends IpProfileInfo> implementedInterface();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.IpProfileParams</code> <code>ipProfileParams</code>, or <code>null</code> if not present
     */
    @Nullable IpProfileParams getIpProfileParams();

}

