package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.ConnectivityType;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc.DfKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Provides the constituent VLDs.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list virtual-link-desc {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   uses connectivity-type;
 *   list df {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     container qos {
 *       presence "VL QoS parameters";
 *       leaf latency {
 *         type uint32;
 *         units ms;
 *       }
 *       leaf packet-delay-variation {
 *         type uint32;
 *         units ms;
 *       }
 *       leaf packet-loss-ratio {
 *         type decimal64 {
 *           fraction-digits 2;
 *           range 0..1.00;
 *         }
 *       }
 *       leaf priority {
 *         type uint32;
 *       }
 *     }
 *     leaf service-availability-level {
 *       type enumeration {
 *         enum level-1;
 *         enum level-2;
 *         enum level-3;
 *       }
 *     }
 *   }
 *   leaf test-access {
 *     type enumeration {
 *       enum none;
 *       enum passive-monitoring;
 *       enum active;
 *     }
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   uses security-parameters;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/virtual-link-desc</i>
 * 
 * <p>To create instances of this class use {@link VirtualLinkDescBuilder}.
 * @see VirtualLinkDescBuilder
 * @see VirtualLinkDescKey
 *
 */
public interface VirtualLinkDesc
    extends
    ChildOf<Nsd>,
    Augmentable<VirtualLinkDesc>,
    ConnectivityType,
    SecurityParameters,
    Identifiable<VirtualLinkDescKey>
{


    public enum TestAccess implements Enumeration {
        None(0, "none"),
        
        PassiveMonitoring(1, "passive-monitoring"),
        
        Active(2, "active")
        ;
    
        private static final Map<String, TestAccess> NAME_MAP;
        private static final Map<Integer, TestAccess> VALUE_MAP;
    
        static {
            final Builder<String, TestAccess> nb = ImmutableMap.builder();
            final Builder<Integer, TestAccess> vb = ImmutableMap.builder();
            for (TestAccess enumItem : TestAccess.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private TestAccess(int value, String name) {
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
         * @return corresponding TestAccess item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<TestAccess> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding TestAccess item, or null if no such item exists
         */
        public static TestAccess forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-link-desc");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.VirtualLinkDesc> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.VirtualLinkDesc.class;
    }
    
    /**
     * Identifier of the NsVirtualLinkDesc information element. It uniquely identifies
     * a VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * The VirtualLinkDf information element specifies properties for instantiating a
     * VL according to a specific flavour.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>df</code>, or <code>null</code> if not present
     */
    @Nullable Map<DfKey, Df> getDf();
    
    /**
     * @return <code>java.util.Map</code> <code>df</code>, or an empty list if it is not present
     */
    default @NonNull Map<DfKey, Df> nonnullDf() {
        return CodeHelpers.nonnull(getDf());
    }
    
    /**
     * Specifies test access facilities expected on the VL.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.VirtualLinkDesc.TestAccess</code> <code>testAccess</code>, or <code>null</code> if not present
     */
    @Nullable TestAccess getTestAccess();
    
    /**
     * Provides human-readable information on the purpose of the virtual link (e.g. VL
     * for control plane traffic).
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    @Override
    VirtualLinkDescKey key();

}

