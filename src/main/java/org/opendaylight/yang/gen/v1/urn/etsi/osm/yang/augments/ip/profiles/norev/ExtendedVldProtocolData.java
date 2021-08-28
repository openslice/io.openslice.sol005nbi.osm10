package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data.VirtualLinkProtocolData;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ip-profiles</b>
 * <pre>
 * grouping extended-vld-protocol-data {
 *   container virtual-link-protocol-data {
 *     leaf associated-layer-protocol {
 *       type identityref {
 *         base layer-protocol;
 *       }
 *     }
 *     container l2-protocol-data {
 *       when "(../associated-layer-protocol = 'Ethernet') or (../associated-layer-protocol = 'MPLS') or (../associated-layer-protocol = 'ODU2') or (../associated-layer-protocol = 'Pseudo-Wire')";
 *       leaf name {
 *         type string;
 *       }
 *       leaf network-type {
 *         type enumeration {
 *           enum flat;
 *           enum vlan;
 *           enum vxlan;
 *           enum gre;
 *         }
 *       }
 *       leaf vlan-transparent {
 *         type boolean;
 *       }
 *       leaf mtu {
 *         type uint16;
 *       }
 *     }
 *     container l3-protocol-data {
 *       when "(../associated-layer-protocol = 'IPv4') or (../associated-layer-protocol = 'IPv6')";
 *       leaf name {
 *         type string;
 *       }
 *       leaf ip-version {
 *         type enumeration {
 *           enum ipv4;
 *           enum ipv6;
 *         }
 *         default ipv4;
 *       }
 *       leaf cidr {
 *         type string;
 *       }
 *       leaf-list ip-allocation-pools {
 *         type string;
 *       }
 *       leaf gateway-ip {
 *         type inet:ip-address;
 *       }
 *       leaf dhcp-enabled {
 *         type boolean;
 *         default true;
 *       }
 *       leaf ipv6-address-mode {
 *         when "../ip-version = 'ipv6'";
 *         type enumeration {
 *           enum slaac;
 *           enum dhcpv6-stateful;
 *           enum dhcpv6-stateless;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ip-profiles/extended-vld-protocol-data</i>
 *
 */
public interface ExtendedVldProtocolData
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-vld-protocol-data");

    @Override
    Class<? extends ExtendedVldProtocolData> implementedInterface();
    
    /**
     * Specifies the protocol data for a VL instantiated according to this profile.
     * Cardinality 0 is used when no protocol data needs to be specified.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data.VirtualLinkProtocolData</code> <code>virtualLinkProtocolData</code>, or <code>null</code> if not present
     */
    @Nullable VirtualLinkProtocolData getVirtualLinkProtocolData();

}

