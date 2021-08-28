package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.CpuPolicy;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case cpu-pinning {
 *   leaf cpu-pinning-policy {
 *     type enumeration {
 *       enum DEDICATED;
 *       enum SHARED;
 *       enum ANY;
 *     }
 *     default ANY;
 *   }
 *   leaf cpu-thread-pinning-policy {
 *     type enumeration {
 *       enum AVOID;
 *       enum SEPARATE;
 *       enum ISOLATE;
 *       enum PREFER;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/cpu-policy/cpu-pinning</i>
 *
 */
public interface CpuPinning
    extends
    DataObject,
    Augmentable<CpuPinning>,
    CpuPolicy
{


    public enum CpuPinningPolicy implements Enumeration {
        DEDICATED(0, "DEDICATED"),
        
        SHARED(1, "SHARED"),
        
        ANY(2, "ANY")
        ;
    
        private static final Map<String, CpuPinningPolicy> NAME_MAP;
        private static final Map<Integer, CpuPinningPolicy> VALUE_MAP;
    
        static {
            final Builder<String, CpuPinningPolicy> nb = ImmutableMap.builder();
            final Builder<Integer, CpuPinningPolicy> vb = ImmutableMap.builder();
            for (CpuPinningPolicy enumItem : CpuPinningPolicy.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private CpuPinningPolicy(int value, String name) {
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
         * @return corresponding CpuPinningPolicy item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<CpuPinningPolicy> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding CpuPinningPolicy item, or null if no such item exists
         */
        public static CpuPinningPolicy forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }
    
    public enum CpuThreadPinningPolicy implements Enumeration {
        AVOID(0, "AVOID"),
        
        SEPARATE(1, "SEPARATE"),
        
        ISOLATE(2, "ISOLATE"),
        
        PREFER(3, "PREFER")
        ;
    
        private static final Map<String, CpuThreadPinningPolicy> NAME_MAP;
        private static final Map<Integer, CpuThreadPinningPolicy> VALUE_MAP;
    
        static {
            final Builder<String, CpuThreadPinningPolicy> nb = ImmutableMap.builder();
            final Builder<Integer, CpuThreadPinningPolicy> vb = ImmutableMap.builder();
            for (CpuThreadPinningPolicy enumItem : CpuThreadPinningPolicy.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private CpuThreadPinningPolicy(int value, String name) {
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
         * @return corresponding CpuThreadPinningPolicy item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<CpuThreadPinningPolicy> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding CpuThreadPinningPolicy item, or null if no such item exists
         */
        public static CpuThreadPinningPolicy forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cpu-pinning");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.CpuPinning> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.CpuPinning.class;
    }
    
    /**
     * CPU pinning policy describes association between virtual CPUs in guest and the
     * physical CPUs in the host. DEDICATED : Virtual CPUs are pinned to physical CPUs
     * SHARED : Multiple VMs may share the same physical CPUs. ANY : Any policy is
     * acceptable for the VM
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.CpuPinning.CpuPinningPolicy</code> <code>cpuPinningPolicy</code>, or <code>null</code> if not present
     */
    @Nullable CpuPinningPolicy getCpuPinningPolicy();
    
    /**
     * CPU thread pinning policy describes how to place the guest CPUs when the host
     * supports hyper threads: AVOID : Avoids placing a guest on a host with threads.
     * SEPARATE: Places vCPUs on separate cores, and avoids placing two vCPUs on two
     * threads of same core. ISOLATE : Places each vCPU on a different core, and places
     * no vCPUs from a different guest on the same core. PREFER : Attempts to place
     * vCPUs on threads of the same core.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.CpuPinning.CpuThreadPinningPolicy</code> <code>cpuThreadPinningPolicy</code>, or <code>null</code> if not present
     */
    @Nullable CpuThreadPinningPolicy getCpuThreadPinningPolicy();

}

