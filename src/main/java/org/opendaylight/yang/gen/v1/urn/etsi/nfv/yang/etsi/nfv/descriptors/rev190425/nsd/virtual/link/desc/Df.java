package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.VirtualLinkDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc.df.Qos;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The VirtualLinkDf information element specifies properties for instantiating a 
 * VL according to a specific flavour.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list df {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   container qos {
 *     presence "VL QoS parameters";
 *     leaf latency {
 *       type uint32;
 *       units ms;
 *     }
 *     leaf packet-delay-variation {
 *       type uint32;
 *       units ms;
 *     }
 *     leaf packet-loss-ratio {
 *       type decimal64 {
 *         fraction-digits 2;
 *         range 0..1.00;
 *       }
 *     }
 *     leaf priority {
 *       type uint32;
 *     }
 *   }
 *   leaf service-availability-level {
 *     type enumeration {
 *       enum level-1;
 *       enum level-2;
 *       enum level-3;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/virtual-link-desc/df</i>
 * 
 * <p>To create instances of this class use {@link DfBuilder}.
 * @see DfBuilder
 * @see DfKey
 *
 */
public interface Df
    extends
    ChildOf<VirtualLinkDesc>,
    Augmentable<Df>,
    Identifiable<DfKey>
{


    public enum ServiceAvailabilityLevel implements Enumeration {
        Level1(0, "level-1"),
        
        Level2(1, "level-2"),
        
        Level3(2, "level-3")
        ;
    
        private static final Map<String, ServiceAvailabilityLevel> NAME_MAP;
        private static final Map<Integer, ServiceAvailabilityLevel> VALUE_MAP;
    
        static {
            final Builder<String, ServiceAvailabilityLevel> nb = ImmutableMap.builder();
            final Builder<Integer, ServiceAvailabilityLevel> vb = ImmutableMap.builder();
            for (ServiceAvailabilityLevel enumItem : ServiceAvailabilityLevel.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private ServiceAvailabilityLevel(int value, String name) {
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
         * @return corresponding ServiceAvailabilityLevel item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<ServiceAvailabilityLevel> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding ServiceAvailabilityLevel item, or null if no such item exists
         */
        public static ServiceAvailabilityLevel forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("df");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc.Df> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc.Df.class;
    }
    
    /**
     * Identifies this VirtualLinkDf information element within a VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * The QoS information element specifies quality of service parameters applicable
     * to a VL.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc.df.Qos</code> <code>qos</code>, or <code>null</code> if not present
     */
    @Nullable Qos getQos();
    
    /**
     * Specifies one of the three levels defined in ETSI ETSI GS NFV-REL 001 [i.5] *
     * Level 1. * Level 2. * Level 3.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc.Df.ServiceAvailabilityLevel</code> <code>serviceAvailabilityLevel</code>, or <code>null</code> if not present
     */
    @Nullable ServiceAvailabilityLevel getServiceAvailabilityLevel();
    
    @Override
    DfKey key();

}

