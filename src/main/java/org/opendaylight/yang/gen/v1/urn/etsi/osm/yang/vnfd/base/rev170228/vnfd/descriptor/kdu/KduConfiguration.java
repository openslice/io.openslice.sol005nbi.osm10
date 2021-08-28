package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfigAccess;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Kdu;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container kdu-configuration {
 *   uses manotypes:vca-configuration;
 *   uses manotypes:vca-config-access;
 *   leaf-list blacklist-config-primitive {
 *     type enumeration {
 *       enum upgrade;
 *       enum rollback;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/kdu/kdu-configuration</i>
 * 
 * <p>To create instances of this class use {@link KduConfigurationBuilder}.
 * @see KduConfigurationBuilder
 *
 */
public interface KduConfiguration
    extends
    ChildOf<Kdu>,
    Augmentable<KduConfiguration>,
    VcaConfiguration,
    VcaConfigAccess
{


    public enum BlacklistConfigPrimitive implements Enumeration {
        Upgrade(0, "upgrade"),
        
        Rollback(1, "rollback")
        ;
    
        private static final Map<String, BlacklistConfigPrimitive> NAME_MAP;
        private static final Map<Integer, BlacklistConfigPrimitive> VALUE_MAP;
    
        static {
            final Builder<String, BlacklistConfigPrimitive> nb = ImmutableMap.builder();
            final Builder<Integer, BlacklistConfigPrimitive> vb = ImmutableMap.builder();
            for (BlacklistConfigPrimitive enumItem : BlacklistConfigPrimitive.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private BlacklistConfigPrimitive(int value, String name) {
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
         * @return corresponding BlacklistConfigPrimitive item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<BlacklistConfigPrimitive> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding BlacklistConfigPrimitive item, or null if no such item exists
         */
        public static BlacklistConfigPrimitive forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("kdu-configuration");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.KduConfiguration> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.KduConfiguration.class;
    }
    
    /**
     * List of blacklisted config primitives from the list of default kdu config
     * primitives
     *
     *
     *
     * @return <code>java.util.List</code> <code>blacklistConfigPrimitive</code>, or <code>null</code> if not present
     */
    @Nullable List<BlacklistConfigPrimitive> getBlacklistConfigPrimitive();

}

