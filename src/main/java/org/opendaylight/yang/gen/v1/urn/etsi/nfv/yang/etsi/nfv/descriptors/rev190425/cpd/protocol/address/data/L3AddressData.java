package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.AddressData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container l3-address-data {
 *   when "../type='ip-address'";
 *   leaf ip-address-assignment {
 *     type boolean;
 *   }
 *   leaf floating-ip-activated {
 *     type boolean;
 *   }
 *   leaf ip-address-type {
 *     type enumeration {
 *       enum ipv4;
 *       enum ipv6;
 *     }
 *   }
 *   leaf number-of-ip-addresses {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/cpd/protocol/address-data/l3-address-data</i>
 * 
 * <p>To create instances of this class use {@link L3AddressDataBuilder}.
 * @see L3AddressDataBuilder
 *
 */
public interface L3AddressData
    extends
    ChildOf<AddressData>,
    Augmentable<L3AddressData>
{


    public enum IpAddressType implements Enumeration {
        Ipv4(0, "ipv4"),
        
        Ipv6(1, "ipv6")
        ;
    
        private static final Map<String, IpAddressType> NAME_MAP;
        private static final Map<Integer, IpAddressType> VALUE_MAP;
    
        static {
            final Builder<String, IpAddressType> nb = ImmutableMap.builder();
            final Builder<Integer, IpAddressType> vb = ImmutableMap.builder();
            for (IpAddressType enumItem : IpAddressType.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private IpAddressType(int value, String name) {
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
         * @return corresponding IpAddressType item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<IpAddressType> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding IpAddressType item, or null if no such item exists
         */
        public static IpAddressType forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("l3-address-data");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data.L3AddressData> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data.L3AddressData.class;
    }
    
    /**
     * Specify if the address assignment is the responsibility of management and
     * orchestration function or not. If it is set to True, it is the management and
     * orchestration function responsibility. 
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>ipAddressAssignment</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isIpAddressAssignment();
    
    /**
     * Specify if the floating IP scheme is activated on the CP or not.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>floatingIpActivated</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isFloatingIpActivated();
    
    /**
     * Define address type. The address type should be aligned with the address type
     * supported by the layerProtocol attribute of the parent VnfExtCpd.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data.L3AddressData.IpAddressType</code> <code>ipAddressType</code>, or <code>null</code> if not present
     */
    @Nullable IpAddressType getIpAddressType();
    
    /**
     * Minimum number of IP addresses to be assigned based on this L3AddressData
     * information element.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>numberOfIpAddresses</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getNumberOfIpAddresses();

}

