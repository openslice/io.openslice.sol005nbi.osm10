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

public enum FlowPattern implements Enumeration {
    Line(0, "line"),
    
    Tree(1, "tree"),
    
    Mesh(2, "mesh")
    ;

    private static final Map<String, FlowPattern> NAME_MAP;
    private static final Map<Integer, FlowPattern> VALUE_MAP;

    static {
        final Builder<String, FlowPattern> nb = ImmutableMap.builder();
        final Builder<Integer, FlowPattern> vb = ImmutableMap.builder();
        for (FlowPattern enumItem : FlowPattern.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private FlowPattern(int value, String name) {
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
     * @return corresponding FlowPattern item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<FlowPattern> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding FlowPattern item, or null if no such item exists
     */
    public static FlowPattern forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
