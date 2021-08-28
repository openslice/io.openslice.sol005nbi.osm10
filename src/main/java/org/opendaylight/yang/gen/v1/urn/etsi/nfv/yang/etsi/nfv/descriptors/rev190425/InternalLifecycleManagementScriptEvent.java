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

public enum InternalLifecycleManagementScriptEvent implements Enumeration {
    StartInstantiation(0, "start-instantiation"),
    
    EndInstantiation(1, "end-instantiation"),
    
    StartScaling(2, "start-scaling"),
    
    EndScaling(3, "end-scaling"),
    
    StartHealing(4, "start-healing"),
    
    EndHealing(5, "end-healing"),
    
    StartTermination(6, "start-termination"),
    
    EndTermination(7, "end-termination"),
    
    StartVnfFlavourChange(8, "start-vnf-flavour-change"),
    
    EndVnfFlavourChange(9, "end-vnf-flavour-change"),
    
    StartVnfOperationChange(10, "start-vnf-operation-change"),
    
    EndVnfOperationChange(11, "end-vnf-operation-change"),
    
    StartVnfExtConnChange(12, "start-vnf-ext-conn-change"),
    
    EndVnfExtConnChange(13, "end-vnf-ext-conn-change"),
    
    StartVnfinfoModification(14, "start-vnfinfo-modification"),
    
    EndVnfinfoModification(15, "end-vnfinfo-modification")
    ;

    private static final Map<String, InternalLifecycleManagementScriptEvent> NAME_MAP;
    private static final Map<Integer, InternalLifecycleManagementScriptEvent> VALUE_MAP;

    static {
        final Builder<String, InternalLifecycleManagementScriptEvent> nb = ImmutableMap.builder();
        final Builder<Integer, InternalLifecycleManagementScriptEvent> vb = ImmutableMap.builder();
        for (InternalLifecycleManagementScriptEvent enumItem : InternalLifecycleManagementScriptEvent.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private InternalLifecycleManagementScriptEvent(int value, String name) {
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
     * @return corresponding InternalLifecycleManagementScriptEvent item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<InternalLifecycleManagementScriptEvent> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding InternalLifecycleManagementScriptEvent item, or null if no such item exists
     */
    public static InternalLifecycleManagementScriptEvent forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
