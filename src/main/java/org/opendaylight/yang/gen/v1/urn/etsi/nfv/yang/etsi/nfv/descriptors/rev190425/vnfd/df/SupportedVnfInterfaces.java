package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.supported.vnf.interfaces.InterfaceDetails;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.supported.vnf.interfaces.InterfaceDetailsKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates which interfaces the VNF produces and provides additional details on 
 * how to access the interface endpoints.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list supported-vnf-interfaces {
 *   key name;
 *   leaf name {
 *     type enumeration {
 *       enum vnf-configuration;
 *       enum vnf-indicator;
 *     }
 *   }
 *   leaf-list cpd-id {
 *     type leafref {
 *       path ../../../ext-cpd/id;
 *     }
 *   }
 *   list interface-details {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/supported-vnf-interfaces</i>
 * 
 * <p>To create instances of this class use {@link SupportedVnfInterfacesBuilder}.
 * @see SupportedVnfInterfacesBuilder
 * @see SupportedVnfInterfacesKey
 *
 */
public interface SupportedVnfInterfaces
    extends
    ChildOf<Df>,
    Augmentable<SupportedVnfInterfaces>,
    Identifiable<SupportedVnfInterfacesKey>
{


    public enum Name implements Enumeration {
        VnfConfiguration(0, "vnf-configuration"),
        
        VnfIndicator(1, "vnf-indicator")
        ;
    
        private static final Map<String, Name> NAME_MAP;
        private static final Map<Integer, Name> VALUE_MAP;
    
        static {
            final Builder<String, Name> nb = ImmutableMap.builder();
            final Builder<Integer, Name> vb = ImmutableMap.builder();
            for (Name enumItem : Name.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Name(int value, String name) {
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
         * @return corresponding Name item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Name> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Name item, or null if no such item exists
         */
        public static Name forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("supported-vnf-interfaces");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.SupportedVnfInterfaces> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.SupportedVnfInterfaces.class;
    }
    
    /**
     * Identifies an interface produced by the VNF. Valid values: - VNF_CONFIGURATION -
     * VNF_INDICATOR
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.SupportedVnfInterfaces.Name</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable Name getName();
    
    /**
     * References one or more CPDs from which to instantiate external CPs through which
     * interface endpoints on the VNF side can be reached by the VNFM.
     *
     *
     *
     * @return <code>java.util.List</code> <code>cpdId</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getCpdId();
    
    /**
     * @return <code>java.util.Map</code> <code>interfaceDetails</code>, or <code>null</code> if not present
     */
    @Nullable Map<InterfaceDetailsKey, InterfaceDetails> getInterfaceDetails();
    
    /**
     * @return <code>java.util.Map</code> <code>interfaceDetails</code>, or an empty list if it is not present
     */
    default @NonNull Map<InterfaceDetailsKey, InterfaceDetails> nonnullInterfaceDetails() {
        return CodeHelpers.nonnull(getInterfaceDetails());
    }
    
    @Override
    SupportedVnfInterfacesKey key();

}

