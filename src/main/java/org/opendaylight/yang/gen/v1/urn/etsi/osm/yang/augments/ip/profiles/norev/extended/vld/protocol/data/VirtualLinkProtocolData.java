package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LayerProtocol;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.ExtendedVldProtocolData;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data.virtual.link.protocol.data.L2ProtocolData;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data.virtual.link.protocol.data.L3ProtocolData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Specifies the protocol data for a VL instantiated according to this profile. 
 * Cardinality 0 is used when no protocol data needs to be specified.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ip-profiles</b>
 * <pre>
 * container virtual-link-protocol-data {
 *   leaf associated-layer-protocol {
 *     type identityref {
 *       base layer-protocol;
 *     }
 *   }
 *   container l2-protocol-data {
 *     when "(../associated-layer-protocol = 'Ethernet') or (../associated-layer-protocol = 'MPLS') or (../associated-layer-protocol = 'ODU2') or (../associated-layer-protocol = 'Pseudo-Wire')";
 *     leaf name {
 *       type string;
 *     }
 *     leaf network-type {
 *       type enumeration {
 *         enum flat;
 *         enum vlan;
 *         enum vxlan;
 *         enum gre;
 *       }
 *     }
 *     leaf vlan-transparent {
 *       type boolean;
 *     }
 *     leaf mtu {
 *       type uint16;
 *     }
 *   }
 *   container l3-protocol-data {
 *     when "(../associated-layer-protocol = 'IPv4') or (../associated-layer-protocol = 'IPv6')";
 *     leaf name {
 *       type string;
 *     }
 *     leaf ip-version {
 *       type enumeration {
 *         enum ipv4;
 *         enum ipv6;
 *       }
 *       default ipv4;
 *     }
 *     leaf cidr {
 *       type string;
 *     }
 *     leaf-list ip-allocation-pools {
 *       type string;
 *     }
 *     leaf gateway-ip {
 *       type inet:ip-address;
 *     }
 *     leaf dhcp-enabled {
 *       type boolean;
 *       default true;
 *     }
 *     leaf ipv6-address-mode {
 *       when "../ip-version = 'ipv6'";
 *       type enumeration {
 *         enum slaac;
 *         enum dhcpv6-stateful;
 *         enum dhcpv6-stateless;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ip-profiles/extended-vld-protocol-data/virtual-link-protocol-data</i>
 * 
 * <p>To create instances of this class use {@link VirtualLinkProtocolDataBuilder}.
 * @see VirtualLinkProtocolDataBuilder
 *
 */
public interface VirtualLinkProtocolData
    extends
    ChildOf<ExtendedVldProtocolData>,
    Augmentable<VirtualLinkProtocolData>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-link-protocol-data");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data.VirtualLinkProtocolData> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data.VirtualLinkProtocolData.class;
    }
    
    /**
     * One of the values of the attribute layerProtocol of the ConnectivityType IE.
     *
     *
     *
     * @return <code>java.lang.Class</code> <code>associatedLayerProtocol</code>, or <code>null</code> if not present
     */
    @Nullable Class<? extends LayerProtocol> getAssociatedLayerProtocol();
    
    /**
     * Specifies the L2 protocol data for this virtual link. Shall be present when the
     * associatedLayerProtocol attribute indicates a L2 protocol and shall be absent
     * otherwise.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data.virtual.link.protocol.data.L2ProtocolData</code> <code>l2ProtocolData</code>, or <code>null</code> if not present
     */
    @Nullable L2ProtocolData getL2ProtocolData();
    
    /**
     * Specifies the L3 protocol data for this virtual link. Shall be present when the
     * associatedLayerProtocol attribute indicates a L3 protocol and shall be absent
     * otherwise.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data.virtual.link.protocol.data.L3ProtocolData</code> <code>l3ProtocolData</code>, or <code>null</code> if not present
     */
    @Nullable L3ProtocolData getL3ProtocolData();

}

