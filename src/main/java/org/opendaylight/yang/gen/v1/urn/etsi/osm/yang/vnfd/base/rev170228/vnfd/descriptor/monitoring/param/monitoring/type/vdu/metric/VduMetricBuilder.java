package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.metric;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
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

/**
 * Class that builds {@link VduMetricBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VduMetricBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VduMetricBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VduMetricBuilder, as instances can be freely passed around without
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
 * @see VduMetricBuilder
 * @see Builder
 *
 */
public class VduMetricBuilder implements Builder<VduMetric> {

    private Object _vduMetricNameRef;
    private String _vduRef;


    Map<Class<? extends Augmentation<VduMetric>>, Augmentation<VduMetric>> augmentation = Collections.emptyMap();

    public VduMetricBuilder() {
    }

    public VduMetricBuilder(VduMetric base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VduMetric>>, Augmentation<VduMetric>> aug =((AugmentationHolder<VduMetric>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._vduMetricNameRef = base.getVduMetricNameRef();
        this._vduRef = base.getVduRef();
    }


    public Object getVduMetricNameRef() {
        return _vduMetricNameRef;
    }
    
    public String getVduRef() {
        return _vduRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VduMetric>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public VduMetricBuilder setVduMetricNameRef(final Object value) {
        this._vduMetricNameRef = value;
        return this;
    }
    
    public VduMetricBuilder setVduRef(final String value) {
        this._vduRef = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VduMetricBuilder addAugmentation(Augmentation<VduMetric> augmentation) {
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
    public VduMetricBuilder addAugmentation(Class<? extends Augmentation<VduMetric>> augmentationType, Augmentation<VduMetric> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VduMetricBuilder removeAugmentation(Class<? extends Augmentation<VduMetric>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VduMetricBuilder doAddAugmentation(Class<? extends Augmentation<VduMetric>> augmentationType, Augmentation<VduMetric> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VduMetric build() {
        return new VduMetricImpl(this);
    }

    private static final class VduMetricImpl
        extends AbstractAugmentable<VduMetric>
        implements VduMetric {
    
        private final Object _vduMetricNameRef;
        private final String _vduRef;
    
        VduMetricImpl(VduMetricBuilder base) {
            super(base.augmentation);
            this._vduMetricNameRef = base.getVduMetricNameRef();
            this._vduRef = base.getVduRef();
        }
    
        @Override
        public Object getVduMetricNameRef() {
            return _vduMetricNameRef;
        }
        
        @Override
        public String getVduRef() {
            return _vduRef;
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
            result = prime * result + Objects.hashCode(_vduMetricNameRef);
            result = prime * result + Objects.hashCode(_vduRef);
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
            if (!VduMetric.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VduMetric other = (VduMetric)obj;
            if (!Objects.equals(_vduMetricNameRef, other.getVduMetricNameRef())) {
                return false;
            }
            if (!Objects.equals(_vduRef, other.getVduRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduMetricImpl otherImpl = (VduMetricImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VduMetric>>, Augmentation<VduMetric>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VduMetric");
            CodeHelpers.appendValue(helper, "_vduMetricNameRef", _vduMetricNameRef);
            CodeHelpers.appendValue(helper, "_vduRef", _vduRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
