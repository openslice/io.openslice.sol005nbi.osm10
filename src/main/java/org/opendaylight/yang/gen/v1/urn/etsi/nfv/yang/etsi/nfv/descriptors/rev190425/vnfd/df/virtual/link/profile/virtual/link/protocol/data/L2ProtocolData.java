package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.virtual.link.protocol.data;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.VirtualLinkProtocolData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint16;

/**
 * Specifies the L2 protocol data for this virtual link. Shall be present when the 
 * associatedLayerProtocol attribute indicates a L2 protocol and shall be absent 
 * otherwise.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container l2-protocol-data {
 *   when "(../associated-layer-protocol = 'Ethernet') or (../associated-layer-protocol = 'MPLS') or (../associated-layer-protocol = 'ODU2') or (../associated-layer-protocol = 'Pseudo-Wire')";
 *   leaf name {
 *     type string;
 *   }
 *   leaf network-type {
 *     type enumeration {
 *       enum flat;
 *       enum vlan;
 *       enum vxlan;
 *       enum gre;
 *     }
 *   }
 *   leaf vlan-transparent {
 *     type boolean;
 *   }
 *   leaf mtu {
 *     type uint16;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/virtual-link-profile/virtual-link-protocol-data/l2-protocol-data</i>
 * 
 * <p>To create instances of this class use {@link L2ProtocolDataBuilder}.
 * @see L2ProtocolDataBuilder
 *
 */
public interface L2ProtocolData
    extends
    ChildOf<VirtualLinkProtocolData>,
    Augmentable<L2ProtocolData>
{


    public enum NetworkType implements Enumeration {
        Flat(0, "flat"),
        
        Vlan(1, "vlan"),
        
        Vxlan(2, "vxlan"),
        
        Gre(3, "gre")
        ;
    
        private static final Map<String, NetworkType> NAME_MAP;
        private static final Map<Integer, NetworkType> VALUE_MAP;
    
        static {
            final Builder<String, NetworkType> nb = ImmutableMap.builder();
            final Builder<Integer, NetworkType> vb = ImmutableMap.builder();
            for (NetworkType enumItem : NetworkType.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private NetworkType(int value, String name) {
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
         * @return corresponding NetworkType item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<NetworkType> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding NetworkType item, or null if no such item exists
         */
        public static NetworkType forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("l2-protocol-data");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.virtual.link.protocol.data.L2ProtocolData> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.virtual.link.protocol.data.L2ProtocolData.class;
    }
    
    /**
     * Network name associated with this L2 protocol.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Specifies the network type for this L2 protocol. Possible values: FLAT, VLAN,
     * VXLAN, GRE.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.virtual.link.protocol.data.L2ProtocolData.NetworkType</code> <code>networkType</code>, or <code>null</code> if not present
     */
    @Nullable NetworkType getNetworkType();
    
    /**
     * Specifies whether to support VLAN transparency for this L2 protocol or not.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>vlanTransparent</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isVlanTransparent();
    
    /**
     * Specifies the maximum transmission unit (MTU) value for this L2 protocol.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>mtu</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getMtu();

}

