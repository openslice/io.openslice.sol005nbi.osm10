package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualCpu;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.pinning.Rule;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.pinning.RuleKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The virtual CPU pinning configuration for the virtualised compute resource.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container pinning {
 *   presence "Set to specify CPU pinning.";
 *   leaf policy {
 *     default dynamic;
 *     type enumeration {
 *       enum static;
 *       enum dynamic;
 *     }
 *   }
 *   list rule {
 *     when "../policy = 'static'";
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
 * <i>etsi-nfv-descriptors/vnfd/virtual-compute-desc/virtual-cpu/pinning</i>
 * 
 * <p>To create instances of this class use {@link PinningBuilder}.
 * @see PinningBuilder
 *
 */
public interface Pinning
    extends
    ChildOf<VirtualCpu>,
    Augmentable<Pinning>
{


    public enum Policy implements Enumeration {
        Static(0, "static"),
        
        Dynamic(1, "dynamic")
        ;
    
        private static final Map<String, Policy> NAME_MAP;
        private static final Map<Integer, Policy> VALUE_MAP;
    
        static {
            final Builder<String, Policy> nb = ImmutableMap.builder();
            final Builder<Integer, Policy> vb = ImmutableMap.builder();
            for (Policy enumItem : Policy.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Policy(int value, String name) {
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
         * @return corresponding Policy item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Policy> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Policy item, or null if no such item exists
         */
        public static Policy forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("pinning");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.Pinning> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.Pinning.class;
    }
    
    /**
     * The policy can take values of 'static' or 'dynamic'. In case of 'static' the
     * virtual CPU cores are requested to be allocated to logical CPU cores according
     * to the rules defined in virtualCpuPinningRules. In case of 'dynamic' the
     * allocation of virtual CPU cores to logical CPU cores is decided by the VIM.
     * (e.g. SMT (Simultaneous MultiThreading) requirements).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.Pinning.Policy</code> <code>policy</code>, or <code>null</code> if not present
     */
    @Nullable Policy getPolicy();
    
    /**
     * A list of rules that should be considered during the allocation of the virtual
     * CPUs to logical CPUs in case of 'static' virtualCpuPinningPolicy.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>rule</code>, or <code>null</code> if not present
     */
    @Nullable Map<RuleKey, Rule> getRule();
    
    /**
     * @return <code>java.util.Map</code> <code>rule</code>, or an empty list if it is not present
     */
    default @NonNull Map<RuleKey, Rule> nonnullRule() {
        return CodeHelpers.nonnull(getRule());
    }

}

