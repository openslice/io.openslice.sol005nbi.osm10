package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.opendaylight.yangtools.yang.binding.Enumeration;

public enum AffinityType implements Enumeration {
    Affinity(0, "affinity"),
    
    AntiAffinity(1, "anti-affinity")
    ;

    private static final Map<String, AffinityType> NAME_MAP;
    private static final Map<Integer, AffinityType> VALUE_MAP;

    static {
        final Builder<String, AffinityType> nb = ImmutableMap.builder();
        final Builder<Integer, AffinityType> vb = ImmutableMap.builder();
        for (AffinityType enumItem : AffinityType.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private AffinityType(int value, String name) {
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
     * @return corresponding AffinityType item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<AffinityType> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding AffinityType item, or null if no such item exists
     */
    public static AffinityType forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
