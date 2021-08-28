package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Range;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link VcpuBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VcpuBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VcpuBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VcpuBuilder, as instances can be freely passed around without
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
 * @see VcpuBuilder
 * @see Builder
 *
 */
public class VcpuBuilder implements Builder<Vcpu> {

    private String _label;
    private Uint64 _total;
    private BigDecimal _utilization;


    Map<Class<? extends Augmentation<Vcpu>>, Augmentation<Vcpu>> augmentation = Collections.emptyMap();

    public VcpuBuilder() {
    }

    public VcpuBuilder(Vcpu base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vcpu>>, Augmentation<Vcpu>> aug =((AugmentationHolder<Vcpu>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._label = base.getLabel();
        this._total = base.getTotal();
        this._utilization = base.getUtilization();
    }


    public String getLabel() {
        return _label;
    }
    
    public Uint64 getTotal() {
        return _total;
    }
    
    public BigDecimal getUtilization() {
        return _utilization;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Vcpu>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public VcpuBuilder setLabel(final String value) {
        this._label = value;
        return this;
    }
    
    public VcpuBuilder setTotal(final Uint64 value) {
        this._total = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setTotal(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public VcpuBuilder setTotal(final BigInteger value) {
        return setTotal(CodeHelpers.compatUint(value));
    }
    
    private static final Range<java.math.BigDecimal>[] CHECKUTILIZATIONRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigDecimal>[] a = (Range<java.math.BigDecimal>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigDecimal.ZERO, new java.math.BigDecimal("100"));
        CHECKUTILIZATIONRANGE_RANGES = a;
    }
    private static void checkUtilizationRange(final java.math.BigDecimal value) {
        for (Range<java.math.BigDecimal> r : CHECKUTILIZATIONRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKUTILIZATIONRANGE_RANGES, value);
    }
    
    public VcpuBuilder setUtilization(final BigDecimal value) {
        if (value != null) {
            checkUtilizationRange(value);
            
        }
        this._utilization = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VcpuBuilder addAugmentation(Augmentation<Vcpu> augmentation) {
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
    public VcpuBuilder addAugmentation(Class<? extends Augmentation<Vcpu>> augmentationType, Augmentation<Vcpu> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VcpuBuilder removeAugmentation(Class<? extends Augmentation<Vcpu>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VcpuBuilder doAddAugmentation(Class<? extends Augmentation<Vcpu>> augmentationType, Augmentation<Vcpu> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Vcpu build() {
        return new VcpuImpl(this);
    }

    private static final class VcpuImpl
        extends AbstractAugmentable<Vcpu>
        implements Vcpu {
    
        private final String _label;
        private final Uint64 _total;
        private final BigDecimal _utilization;
    
        VcpuImpl(VcpuBuilder base) {
            super(base.augmentation);
            this._label = base.getLabel();
            this._total = base.getTotal();
            this._utilization = base.getUtilization();
        }
    
        @Override
        public String getLabel() {
            return _label;
        }
        
        @Override
        public Uint64 getTotal() {
            return _total;
        }
        
        @Override
        public BigDecimal getUtilization() {
            return _utilization;
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
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_total);
            result = prime * result + Objects.hashCode(_utilization);
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
            if (!Vcpu.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Vcpu other = (Vcpu)obj;
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_total, other.getTotal())) {
                return false;
            }
            if (!Objects.equals(_utilization, other.getUtilization())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VcpuImpl otherImpl = (VcpuImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vcpu>>, Augmentation<Vcpu>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vcpu");
            CodeHelpers.appendValue(helper, "_label", _label);
            CodeHelpers.appendValue(helper, "_total", _total);
            CodeHelpers.appendValue(helper, "_utilization", _utilization);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
