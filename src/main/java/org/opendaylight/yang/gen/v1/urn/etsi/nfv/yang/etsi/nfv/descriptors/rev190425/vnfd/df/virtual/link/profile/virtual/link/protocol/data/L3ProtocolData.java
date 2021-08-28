package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.virtual.link.protocol.data;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.VirtualLinkProtocolData;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Specifies the L3 protocol data for this virtual link. Shall be present when the 
 * associatedLayerProtocol attribute indicates a L3 protocol and shall be absent 
 * otherwise.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container l3-protocol-data {
 *   when "(../associated-layer-protocol = 'IPv4') or (../associated-layer-protocol = 'IPv6')";
 *   leaf name {
 *     type string;
 *   }
 *   leaf ip-version {
 *     type enumeration {
 *       enum ipv4;
 *       enum ipv6;
 *     }
 *     default ipv4;
 *   }
 *   leaf cidr {
 *     type string;
 *   }
 *   leaf-list ip-allocation-pools {
 *     type string;
 *   }
 *   leaf gateway-ip {
 *     type inet:ip-address;
 *   }
 *   leaf dhcp-enabled {
 *     type boolean;
 *     default true;
 *   }
 *   leaf ipv6-address-mode {
 *     when "../ip-version = 'ipv6'";
 *     type enumeration {
 *       enum slaac;
 *       enum dhcpv6-stateful;
 *       enum dhcpv6-stateless;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/virtual-link-profile/virtual-link-protocol-data/l3-protocol-data</i>
 * 
 * <p>To create instances of this class use {@link L3ProtocolDataBuilder}.
 * @see L3ProtocolDataBuilder
 *
 */
public interface L3ProtocolData
    extends
    ChildOf<VirtualLinkProtocolData>,
    Augmentable<L3ProtocolData>
{


    public enum IpVersion implements Enumeration {
        Ipv4(0, "ipv4"),
        
        Ipv6(1, "ipv6")
        ;
    
        private static final Map<String, IpVersion> NAME_MAP;
        private static final Map<Integer, IpVersion> VALUE_MAP;
    
        static {
            final Builder<String, IpVersion> nb = ImmutableMap.builder();
            final Builder<Integer, IpVersion> vb = ImmutableMap.builder();
            for (IpVersion enumItem : IpVersion.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private IpVersion(int value, String name) {
            this.value = value;
            this.name = name;
        }
    
        @Override
        public String getName() {
            return name;
        }
    
        @Override
        public int getIntValue() {
            return value;
        }
    
        /**
         * Return the enumeration member whose {@link #getName()} matches specified value.
         *
         * @param name YANG assigned name
         * @return corresponding IpVersion item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<IpVersion> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding IpVersion item, or null if no such item exists
         */
        public static IpVersion forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }
    
    public enum Ipv6AddressMode implements Enumeration {
        Slaac(0, "slaac"),
        
        Dhcpv6Stateful(1, "dhcpv6-stateful"),
        
        Dhcpv6Stateless(2, "dhcpv6-stateless")
        ;
    
        private static final Map<String, Ipv6AddressMode> NAME_MAP;
        private static final Map<Integer, Ipv6AddressMode> VALUE_MAP;
    
        static {
            final Builder<String, Ipv6AddressMode> nb = ImmutableMap.builder();
            final Builder<Integer, Ipv6AddressMode> vb = ImmutableMap.builder();
            for (Ipv6AddressMode enumItem : Ipv6AddressMode.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Ipv6AddressMode(int value, String name) {
            this.value = value;
            this.name = name;
        }
    
        @Override
        public String getName() {
            return name;
        }
    
        @Override
        public int getIntValue() {
            return value;
        }
    
        /**
         * Return the enumeration member whose {@link #getName()} matches specified value.
         *
         * @param name YANG assigned name
         * @return corresponding Ipv6AddressMode item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Ipv6AddressMode> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Ipv6AddressMode item, or null if no such item exists
         */
        public static Ipv6AddressMode forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("l3-protocol-data");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.virtual.link.protocol.data.L3ProtocolData> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.virtual.link.protocol.data.L3ProtocolData.class;
    }
    
    /**
     * Network name associated with this L3 protocol.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Specifies IP version of this L3 protocol. Value: • IPV4. • IPV6.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.virtual.link.protocol.data.L3ProtocolData.IpVersion</code> <code>ipVersion</code>, or <code>null</code> if not present
     */
    @Nullable IpVersion getIpVersion();
    
    /**
     * Specifies the CIDR (Classless InterDomain Routing) of this L3 protocol.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cidr</code>, or <code>null</code> if not present
     */
    @Nullable String getCidr();
    
    /**
     * Specifies the allocation pools with start and end IP addresses for this L3
     * protocol.
     *
     *
     *
     * @return <code>java.util.List</code> <code>ipAllocationPools</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getIpAllocationPools();
    
    /**
     * Specifies the gateway IP address for this L3 protocol.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>gatewayIp</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getGatewayIp();
    
    /**
     * Indicates whether DHCP (Dynamic Host Configuration Protocol) is enabled or
     * disabled for this L3 protocol.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>dhcpEnabled</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isDhcpEnabled();
    
    /**
     * Specifies IPv6 address mode. Possible values: • SLAAC. • DHCPV6-STATEFUL. •
     * DHCPV6-STATELESS. May be present when the value of the ipVersion attribute is
     * 'IPV6' and shall be absent otherwise.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.virtual.link.protocol.data.L3ProtocolData.Ipv6AddressMode</code> <code>ipv6AddressMode</code>, or <code>null</code> if not present
     */
    @Nullable Ipv6AddressMode getIpv6AddressMode();

}

