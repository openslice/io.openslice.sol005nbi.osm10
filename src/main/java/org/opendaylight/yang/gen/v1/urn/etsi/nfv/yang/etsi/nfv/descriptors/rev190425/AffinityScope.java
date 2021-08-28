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

public enum AffinityScope implements Enumeration {
    NfviNode(0, "nfvi-node"),
    
    ZoneGroup(1, "zone-group"),
    
    Zone(2, "zone"),
    
    NfviPop(3, "nfvi-pop")
    ;

    private static final Map<String, AffinityScope> NAME_MAP;
    private static final Map<Integer, AffinityScope> VALUE_MAP;

    static {
        final Builder<String, AffinityScope> nb = ImmutableMap.builder();
        final Builder<Integer, AffinityScope> vb = ImmutableMap.builder();
        for (AffinityScope enumItem : AffinityScope.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private AffinityScope(int value, String name) {
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
     * @return corresponding AffinityScope item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<AffinityScope> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding AffinityScope item, or null if no such item exists
     */
    public static AffinityScope forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
