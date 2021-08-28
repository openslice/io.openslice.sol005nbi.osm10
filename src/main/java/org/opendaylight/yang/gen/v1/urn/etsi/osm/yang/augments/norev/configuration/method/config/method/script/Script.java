package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.script;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.ConfigurationMethod;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * container script {
 *   leaf script-type {
 *     type enumeration {
 *       enum rift;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/configuration-method/config-method/script/script</i>
 * 
 * <p>To create instances of this class use {@link ScriptBuilder}.
 * @see ScriptBuilder
 *
 */
public interface Script
    extends
    ChildOf<ConfigurationMethod>,
    Augmentable<Script>
{


    public enum ScriptType implements Enumeration {
        Rift(0, "rift")
        ;
    
        private static final Map<String, ScriptType> NAME_MAP;
        private static final Map<Integer, ScriptType> VALUE_MAP;
    
        static {
            final Builder<String, ScriptType> nb = ImmutableMap.builder();
            final Builder<Integer, ScriptType> vb = ImmutableMap.builder();
            for (ScriptType enumItem : ScriptType.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private ScriptType(int value, String name) {
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
         * @return corresponding ScriptType item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<ScriptType> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding ScriptType item, or null if no such item exists
         */
        public static ScriptType forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("script");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.script.Script> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.script.Script.class;
    }
    
    /**
     * Script type - currently supported - Scripts confirming to Rift CA plugin
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.script.Script.ScriptType</code> <code>scriptType</code>, or <code>null</code> if not present
     */
    @Nullable ScriptType getScriptType();

}

