package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev;
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
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * grouping extended-cpu-policy {
 *   leaf thread-policy {
 *     type enumeration {
 *       enum AVOID;
 *       enum SEPARATE;
 *       enum ISOLATE;
 *       enum PREFER;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-cpu-policy</i>
 *
 */
public interface ExtendedCpuPolicy
    extends
    DataObject
{


    public enum ThreadPolicy implements Enumeration {
        AVOID(0, "AVOID"),
        
        SEPARATE(1, "SEPARATE"),
        
        ISOLATE(2, "ISOLATE"),
        
        PREFER(3, "PREFER")
        ;
    
        private static final Map<String, ThreadPolicy> NAME_MAP;
        private static final Map<Integer, ThreadPolicy> VALUE_MAP;
    
        static {
            final Builder<String, ThreadPolicy> nb = ImmutableMap.builder();
            final Builder<Integer, ThreadPolicy> vb = ImmutableMap.builder();
            for (ThreadPolicy enumItem : ThreadPolicy.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private ThreadPolicy(int value, String name) {
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
         * @return corresponding ThreadPolicy item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<ThreadPolicy> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding ThreadPolicy item, or null if no such item exists
         */
        public static ThreadPolicy forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-cpu-policy");

    @Override
    Class<? extends ExtendedCpuPolicy> implementedInterface();
    
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedCpuPolicy.ThreadPolicy</code> <code>threadPolicy</code>, or <code>null</code> if not present
     */
    @Nullable ThreadPolicy getThreadPolicy();

}

