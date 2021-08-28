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
 * grouping extended-mempage-size {
 *   leaf mempage-size {
 *     type enumeration {
 *       enum LARGE;
 *       enum SMALL;
 *       enum SIZE_2MB;
 *       enum SIZE_1GB;
 *       enum PREFER_LARGE;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-mempage-size</i>
 *
 */
public interface ExtendedMempageSize
    extends
    DataObject
{


    public enum MempageSize implements Enumeration {
        LARGE(0, "LARGE"),
        
        SMALL(1, "SMALL"),
        
        SIZE2MB(2, "SIZE_2MB"),
        
        SIZE1GB(3, "SIZE_1GB"),
        
        PREFERLARGE(4, "PREFER_LARGE")
        ;
    
        private static final Map<String, MempageSize> NAME_MAP;
        private static final Map<Integer, MempageSize> VALUE_MAP;
    
        static {
            final Builder<String, MempageSize> nb = ImmutableMap.builder();
            final Builder<Integer, MempageSize> vb = ImmutableMap.builder();
            for (MempageSize enumItem : MempageSize.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private MempageSize(int value, String name) {
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
         * @return corresponding MempageSize item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<MempageSize> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding MempageSize item, or null if no such item exists
         */
        public static MempageSize forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-mempage-size");

    @Override
    Class<? extends ExtendedMempageSize> implementedInterface();
    
    /**
     * Memory page allocation size. If a VM requires hugepages, it should choose LARGE
     * or SIZE_2MB or SIZE_1GB. If the VM prefers hugepages it should choose
     * PREFER_LARGE. LARGE : Require hugepages (either 2MB or 1GB) SMALL : Doesn't
     * require hugepages SIZE_2MB : Requires 2MB hugepages SIZE_1GB : Requires 1GB
     * hugepages PREFER_LARGE : Application prefers hugepages
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedMempageSize.MempageSize</code> <code>mempageSize</code>, or <code>null</code> if not present
     */
    @Nullable MempageSize getMempageSize();

}

