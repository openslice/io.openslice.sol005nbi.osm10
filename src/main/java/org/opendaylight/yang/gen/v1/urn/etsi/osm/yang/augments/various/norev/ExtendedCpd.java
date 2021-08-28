package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev;
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
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>various</b>
 * <pre>
 * grouping extended-cpd {
 *   leaf port-security-enabled {
 *     type boolean;
 *     default true;
 *   }
 *   leaf port-security-disable-strategy {
 *     type enumeration {
 *       enum full;
 *       enum allow-address-pairs;
 *     }
 *     default full;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>various/extended-cpd</i>
 *
 */
public interface ExtendedCpd
    extends
    DataObject
{


    public enum PortSecurityDisableStrategy implements Enumeration {
        Full(0, "full"),
        
        AllowAddressPairs(1, "allow-address-pairs")
        ;
    
        private static final Map<String, PortSecurityDisableStrategy> NAME_MAP;
        private static final Map<Integer, PortSecurityDisableStrategy> VALUE_MAP;
    
        static {
            final Builder<String, PortSecurityDisableStrategy> nb = ImmutableMap.builder();
            final Builder<Integer, PortSecurityDisableStrategy> vb = ImmutableMap.builder();
            for (PortSecurityDisableStrategy enumItem : PortSecurityDisableStrategy.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private PortSecurityDisableStrategy(int value, String name) {
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
         * @return corresponding PortSecurityDisableStrategy item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<PortSecurityDisableStrategy> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding PortSecurityDisableStrategy item, or null if no such item exists
         */
        public static PortSecurityDisableStrategy forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-cpd");

    @Override
    Class<? extends ExtendedCpd> implementedInterface();
    
    /**
     * Enables the port security for the port.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>portSecurityEnabled</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isPortSecurityEnabled();
    
    /**
     * Strategy to disable port security, either Enables the port security for the
     * port. full : disable port security in the whole port allow-address-pairs : allow
     * address pairs for virtual IP (any virtual IP can be configured)
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.ExtendedCpd.PortSecurityDisableStrategy</code> <code>portSecurityDisableStrategy</code>, or <code>null</code> if not present
     */
    @Nullable PortSecurityDisableStrategy getPortSecurityDisableStrategy();

}

