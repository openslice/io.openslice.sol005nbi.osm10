package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Range;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.memory.VduMemRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.memory.VduMemRequirementsKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VirtualMemoryBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualMemoryBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualMemoryBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualMemoryBuilder, as instances can be freely passed around without
 * worrying about synchronization issues.
 * 
 * <p>
 * As a side note: method chaining results in:
 * <ul>
 *   <li>very efficient Java bytecode, as the method invocation result, in this case the Builder reference, is
 *       on the stack, so further method invocations just need to fill method arguments for the next method
 *       invocation, which is terminated by {@link #build()}, which is then returned from the method</li>
 *   <li>better understanding by humans, as the scope of mutable state (the builder) is kept to a minimum and is
 *       very localized</li>
 *   <li>better optimization oportunities, as the object scope is minimized in terms of invocation (rather than
 *       method) stack, making <a href="https://en.wikipedia.org/wiki/Escape_analysis">escape analysis</a> a lot
 *       easier. Given enough compiler (JIT/AOT) prowess, the cost of th builder object can be completely
 *       eliminated</li>
 * </ul>
 * 
 * @see VirtualMemoryBuilder
 * @see Builder
 *
 */
public class VirtualMemoryBuilder implements Builder<VirtualMemory> {

    private String _overSubscriptionPolicy;
    private BigDecimal _size;
    private Map<VduMemRequirementsKey, VduMemRequirements> _vduMemRequirements;
    private Boolean _numaEnabled;


    Map<Class<? extends Augmentation<VirtualMemory>>, Augmentation<VirtualMemory>> augmentation = Collections.emptyMap();

    public VirtualMemoryBuilder() {
    }

    public VirtualMemoryBuilder(VirtualMemory base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VirtualMemory>>, Augmentation<VirtualMemory>> aug =((AugmentationHolder<VirtualMemory>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._overSubscriptionPolicy = base.getOverSubscriptionPolicy();
        this._size = base.getSize();
        this._vduMemRequirements = base.getVduMemRequirements();
        this._numaEnabled = base.isNumaEnabled();
    }


    public String getOverSubscriptionPolicy() {
        return _overSubscriptionPolicy;
    }
    
    public BigDecimal getSize() {
        return _size;
    }
    
    public Map<VduMemRequirementsKey, VduMemRequirements> getVduMemRequirements() {
        return _vduMemRequirements;
    }
    
    public Boolean isNumaEnabled() {
        return _numaEnabled;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VirtualMemory>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public VirtualMemoryBuilder setOverSubscriptionPolicy(final String value) {
        this._overSubscriptionPolicy = value;
        return this;
    }
    
    private static final Range<java.math.BigDecimal>[] CHECKSIZERANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigDecimal>[] a = (Range<java.math.BigDecimal>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigDecimal.ZERO, new java.math.BigDecimal("922337203685477580.7"));
        CHECKSIZERANGE_RANGES = a;
    }
    private static void checkSizeRange(final java.math.BigDecimal value) {
        for (Range<java.math.BigDecimal> r : CHECKSIZERANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKSIZERANGE_RANGES, value);
    }
    
    public VirtualMemoryBuilder setSize(final BigDecimal value) {
        if (value != null) {
            checkSizeRange(value);
            
        }
        this._size = value;
        return this;
    }
    public VirtualMemoryBuilder setVduMemRequirements(final Map<VduMemRequirementsKey, VduMemRequirements> values) {
        this._vduMemRequirements = values;
        return this;
    }
    
    /**
      * Utility migration setter.
      *
      * <b>IMPORTANT NOTE</b>: This method does not completely match previous mechanics, as the list is processed as
      *                        during this method's execution. Any future modifications of the list are <b>NOT</b>
      *                        reflected in this builder nor its products.
      *
      * @param values Legacy List of values
      * @return this builder
      * @throws IllegalArgumentException if the list contains entries with the same key
      * @throws NullPointerException if the list contains a null entry
      * @deprecated Use {#link #setVduMemRequirements(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VirtualMemoryBuilder setVduMemRequirements(final List<VduMemRequirements> values) {
        return setVduMemRequirements(CodeHelpers.compatMap(values));
    }
    
    public VirtualMemoryBuilder setNumaEnabled(final Boolean value) {
        this._numaEnabled = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VirtualMemoryBuilder addAugmentation(Augmentation<VirtualMemory> augmentation) {
        return doAddAugmentation(augmentation.implementedInterface(), augmentation);
    }
    
    /**
      * Add or remove an augmentation to this builder's product.
      *
      * @param augmentationType augmentation type to be added or removed
      * @param augmentationValue augmentation value, null if the augmentation type should be removed
      * @return this builder
      * @deprecated Use either {@link #addAugmentation(Augmentation)} or {@link #removeAugmentation(Class)} instead.
      */
    @Deprecated(forRemoval = true)
    public VirtualMemoryBuilder addAugmentation(Class<? extends Augmentation<VirtualMemory>> augmentationType, Augmentation<VirtualMemory> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VirtualMemoryBuilder removeAugmentation(Class<? extends Augmentation<VirtualMemory>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VirtualMemoryBuilder doAddAugmentation(Class<? extends Augmentation<VirtualMemory>> augmentationType, Augmentation<VirtualMemory> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VirtualMemory build() {
        return new VirtualMemoryImpl(this);
    }

    public static final class VirtualMemoryImpl
        extends AbstractAugmentable<VirtualMemory>
        implements VirtualMemory {
    
    	@JsonProperty("over-subscription-policy")
        private final String _overSubscriptionPolicy;
        @JsonProperty("size")
        private final BigDecimal _size;
        private final Map<VduMemRequirementsKey, VduMemRequirements> _vduMemRequirements;
        @JsonProperty("numa-enabled")
        private final Boolean _numaEnabled;
    
        VirtualMemoryImpl(VirtualMemoryBuilder base) {
            super(base.augmentation);
            this._overSubscriptionPolicy = base.getOverSubscriptionPolicy();
            this._size = base.getSize();
            this._vduMemRequirements = CodeHelpers.emptyToNull(base.getVduMemRequirements());
            this._numaEnabled = base.isNumaEnabled();
        }
    
        public VirtualMemoryImpl() {
        	this( new VirtualMemoryBuilder());
        }                        
        
        @Override
        public String getOverSubscriptionPolicy() {
            return _overSubscriptionPolicy;
        }
        
        @Override
        public BigDecimal getSize() {
            return _size;
        }
        
        @Override
        public Map<VduMemRequirementsKey, VduMemRequirements> getVduMemRequirements() {
            return _vduMemRequirements;
        }
        
        @Override
        public Boolean isNumaEnabled() {
            return _numaEnabled;
        }
    
        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_overSubscriptionPolicy);
            result = prime * result + Objects.hashCode(_size);
            result = prime * result + Objects.hashCode(_vduMemRequirements);
            result = prime * result + Objects.hashCode(_numaEnabled);
            result = prime * result + Objects.hashCode(augmentations());
        
            hash = result;
            hashValid = true;
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!VirtualMemory.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualMemory other = (VirtualMemory)obj;
            if (!Objects.equals(_overSubscriptionPolicy, other.getOverSubscriptionPolicy())) {
                return false;
            }
            if (!Objects.equals(_size, other.getSize())) {
                return false;
            }
            if (!Objects.equals(_vduMemRequirements, other.getVduMemRequirements())) {
                return false;
            }
            if (!Objects.equals(_numaEnabled, other.isNumaEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualMemoryImpl otherImpl = (VirtualMemoryImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VirtualMemory>>, Augmentation<VirtualMemory>> e : augmentations().entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualMemory");
            CodeHelpers.appendValue(helper, "_overSubscriptionPolicy", _overSubscriptionPolicy);
            CodeHelpers.appendValue(helper, "_size", _size);
            CodeHelpers.appendValue(helper, "_vduMemRequirements", _vduMemRequirements);
            CodeHelpers.appendValue(helper, "_numaEnabled", _numaEnabled);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
