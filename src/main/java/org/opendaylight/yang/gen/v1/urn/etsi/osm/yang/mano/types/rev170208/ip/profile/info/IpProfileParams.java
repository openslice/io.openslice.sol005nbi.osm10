package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileInfo;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServerKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpVersion;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container ip-profile-params {
 *   leaf ip-version {
 *     type inet:ip-version;
 *     default ipv4;
 *   }
 *   leaf subnet-address {
 *     type inet:ip-prefix;
 *   }
 *   leaf gateway-address {
 *     type inet:ip-address;
 *   }
 *   leaf security-group {
 *     type string;
 *   }
 *   list dns-server {
 *     key address;
 *     leaf address {
 *       type inet:ip-address;
 *     }
 *   }
 *   container dhcp-params {
 *     leaf enabled {
 *       type boolean;
 *       default true;
 *     }
 *     leaf start-address {
 *       type inet:ip-address;
 *     }
 *     leaf count {
 *       type uint32;
 *     }
 *   }
 *   leaf subnet-prefix-pool {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ip-profile-info/ip-profile-params</i>
 * 
 * <p>To create instances of this class use {@link IpProfileParamsBuilder}.
 * @see IpProfileParamsBuilder
 *
 */
public interface IpProfileParams
    extends
    ChildOf<IpProfileInfo>,
    Augmentable<IpProfileParams>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profile-params");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.IpProfileParams> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.IpProfileParams.class;
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpVersion</code> <code>ipVersion</code>, or <code>null</code> if not present
     */
    @Nullable IpVersion getIpVersion();
    
    /**
     * Subnet IP prefix associated with IP Profile
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix</code> <code>subnetAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpPrefix getSubnetAddress();
    
    /**
     * IP Address of the default gateway associated with IP Profile
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>gatewayAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getGatewayAddress();
    
    /**
     * Name of the security group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>securityGroup</code>, or <code>null</code> if not present
     */
    @Nullable String getSecurityGroup();
    
    /**
     * @return <code>java.util.Map</code> <code>dnsServer</code>, or <code>null</code> if not present
     */
    @Nullable Map<DnsServerKey, DnsServer> getDnsServer();
    
    /**
     * @return <code>java.util.Map</code> <code>dnsServer</code>, or an empty list if it is not present
     */
    default @NonNull Map<DnsServerKey, DnsServer> nonnullDnsServer() {
        return CodeHelpers.nonnull(getDnsServer());
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams</code> <code>dhcpParams</code>, or <code>null</code> if not present
     */
    @Nullable DhcpParams getDhcpParams();
    
    /**
     * VIM Specific reference to pre-created subnet prefix
     *
     *
     *
     * @return <code>java.lang.String</code> <code>subnetPrefixPool</code>, or <code>null</code> if not present
     */
    @Nullable String getSubnetPrefixPool();

}

