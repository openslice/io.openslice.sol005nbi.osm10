package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model.juju;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentList;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container juju {
 *   leaf charm {
 *     type string;
 *   }
 *   leaf proxy {
 *     type boolean;
 *     default true;
 *   }
 *   leaf cloud {
 *     type enumeration {
 *       enum lxd;
 *       enum k8s;
 *     }
 *     default lxd;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/configuration-method/config-method/execution-environment-list/execution-environment-list/execution-environment-model/juju/juju</i>
 * 
 * <p>To create instances of this class use {@link JujuBuilder}.
 * @see JujuBuilder
 *
 */
public interface Juju
    extends
    ChildOf<ExecutionEnvironmentList>,
    Augmentable<Juju>
{


    public enum Cloud implements Enumeration {
        Lxd(0, "lxd"),
        
        K8s(1, "k8s")
        ;
    
        private static final Map<String, Cloud> NAME_MAP;
        private static final Map<Integer, Cloud> VALUE_MAP;
    
        static {
            final Builder<String, Cloud> nb = ImmutableMap.builder();
            final Builder<Integer, Cloud> vb = ImmutableMap.builder();
            for (Cloud enumItem : Cloud.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Cloud(int value, String name) {
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
         * @return corresponding Cloud item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Cloud> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Cloud item, or null if no such item exists
         */
        public static Cloud forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("juju");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model.juju.Juju> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model.juju.Juju.class;
    }
    
    /**
     * Juju charm to use with the VNF or VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>charm</code>, or <code>null</code> if not present
     */
    @Nullable String getCharm();
    
    /**
     * Is this a proxy charm?
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>proxy</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isProxy();
    
    /**
     * Type of cloud where the charm will be deployed. It only applies to proxy charms
     * (not native)
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model.juju.Juju.Cloud</code> <code>cloud</code>, or <code>null</code> if not present
     */
    @Nullable Cloud getCloud();

}

