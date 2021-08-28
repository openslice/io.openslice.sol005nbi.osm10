package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Declares the VNF indicators that are supported by this VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list indicator {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf-list indicator-value {
 *     type string;
 *   }
 *   leaf source {
 *     type enumeration {
 *       enum vnf;
 *       enum em;
 *       enum both;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/indicator</i>
 * 
 * <p>To create instances of this class use {@link IndicatorBuilder}.
 * @see IndicatorBuilder
 * @see IndicatorKey
 *
 */
public interface Indicator
    extends
    ChildOf<Vnfd>,
    Augmentable<Indicator>,
    Identifiable<IndicatorKey>
{


    public enum Source implements Enumeration {
        Vnf(0, "vnf"),
        
        Em(1, "em"),
        
        Both(2, "both")
        ;
    
        private static final Map<String, Source> NAME_MAP;
        private static final Map<Integer, Source> VALUE_MAP;
    
        static {
            final Builder<String, Source> nb = ImmutableMap.builder();
            final Builder<Integer, Source> vb = ImmutableMap.builder();
            for (Source enumItem : Source.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Source(int value, String name) {
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
         * @return corresponding Source item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Source> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Source item, or null if no such item exists
         */
        public static Source forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("indicator");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Indicator> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Indicator.class;
    }
    
    /**
     * Unique identifier
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * The human readable name of the VnfIndicator.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Defines the allowed values or value ranges of this indicator.
     *
     *
     *
     * @return <code>java.util.List</code> <code>indicatorValue</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getIndicatorValue();
    
    /**
     * Describe the source of the indicator. The possible values are: • VNF. • EM. •
     * Both. This tells the consumer where to send the subscription request.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Indicator.Source</code> <code>source</code>, or <code>null</code> if not present
     */
    @Nullable Source getSource();
    
    @Override
    IndicatorKey key();

}

