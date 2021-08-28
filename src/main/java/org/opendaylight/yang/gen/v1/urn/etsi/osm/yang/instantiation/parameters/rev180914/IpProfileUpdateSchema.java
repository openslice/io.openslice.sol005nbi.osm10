package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ip.profile.update.schema.DhcpParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ip.profile.update.schema.DnsServer;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ip.profile.update.schema.DnsServerKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpVersion;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * grouping ip-profile-update-schema {
 *   leaf ip-version {
 *     type inet:ip-version;
 *   }
 *   leaf subnet-address {
 *     type inet:ip-prefix;
 *   }
 *   leaf gateway-address {
 *     type inet:ip-address;
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
 *     }
 *     leaf count {
 *       type uint8;
 *     }
 *     leaf start-address {
 *       type inet:ip-address;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/ip-profile-update-schema</i>
 *
 */
public interface IpProfileUpdateSchema
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profile-update-schema");

    @Override
    Class<? extends IpProfileUpdateSchema> implementedInterface();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpVersion</code> <code>ipVersion</code>, or <code>null</code> if not present
     */
    @Nullable IpVersion getIpVersion();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix</code> <code>subnetAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpPrefix getSubnetAddress();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>gatewayAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getGatewayAddress();
    
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ip.profile.update.schema.DhcpParams</code> <code>dhcpParams</code>, or <code>null</code> if not present
     */
    @Nullable DhcpParams getDhcpParams();

}

