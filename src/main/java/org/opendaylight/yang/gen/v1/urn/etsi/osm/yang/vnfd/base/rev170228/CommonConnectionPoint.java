package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConnectionPointType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * grouping common-connection-point {
 *   leaf name {
 *     type string;
 *   }
 *   leaf id {
 *     type string;
 *   }
 *   leaf short-name {
 *     type string;
 *   }
 *   leaf type {
 *     type manotypes:connection-point-type;
 *   }
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
 * <i>vnfd-base/common-connection-point</i>
 *
 */
public interface CommonConnectionPoint
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

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("common-connection-point");

    @Override
    Class<? extends CommonConnectionPoint> implementedInterface();
    
    /**
     * Name of the connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Identifier for the internal connection points
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Short name to appear as label in the UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    @Nullable String getShortName();
    
    /**
     * Type of the connection point.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConnectionPointType</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable ConnectionPointType getType();
    
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint.PortSecurityDisableStrategy</code> <code>portSecurityDisableStrategy</code>, or <code>null</code> if not present
     */
    @Nullable PortSecurityDisableStrategy getPortSecurityDisableStrategy();

}

