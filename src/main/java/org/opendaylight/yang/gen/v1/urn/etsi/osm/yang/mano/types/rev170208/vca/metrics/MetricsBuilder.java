package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.metrics;
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
 * Class that builds {@link MetricsBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     MetricsBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new MetricsBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of MetricsBuilder, as instances can be freely passed around without
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
 * @see MetricsBuilder
 * @see Builder
 *
 */
public class MetricsBuilder implements Builder<Metrics> {

    private String _executionEnvironmentMetric;
    private Object _executionEnvironmentRef;
    private String _name;
    private MetricsKey key;


    Map<Class<? extends Augmentation<Metrics>>, Augmentation<Metrics>> augmentation = Collections.emptyMap();

    public MetricsBuilder() {
    }

    public MetricsBuilder(Metrics base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Metrics>>, Augmentation<Metrics>> aug =((AugmentationHolder<Metrics>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._executionEnvironmentMetric = base.getExecutionEnvironmentMetric();
        this._executionEnvironmentRef = base.getExecutionEnvironmentRef();
    }


    public MetricsKey key() {
        return key;
    }
    
    public String getExecutionEnvironmentMetric() {
        return _executionEnvironmentMetric;
    }
    
    public Object getExecutionEnvironmentRef() {
        return _executionEnvironmentRef;
    }
    
    public String getName() {
        return _name;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Metrics>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public MetricsBuilder withKey(final MetricsKey key) {
        this.key = key;
        return this;
    }
    
    public MetricsBuilder setExecutionEnvironmentMetric(final String value) {
        this._executionEnvironmentMetric = value;
        return this;
    }
    
    public MetricsBuilder setExecutionEnvironmentRef(final Object value) {
        this._executionEnvironmentRef = value;
        return this;
    }
    
    public MetricsBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public MetricsBuilder addAugmentation(Augmentation<Metrics> augmentation) {
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
    public MetricsBuilder addAugmentation(Class<? extends Augmentation<Metrics>> augmentationType, Augmentation<Metrics> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public MetricsBuilder removeAugmentation(Class<? extends Augmentation<Metrics>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private MetricsBuilder doAddAugmentation(Class<? extends Augmentation<Metrics>> augmentationType, Augmentation<Metrics> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Metrics build() {
        return new MetricsImpl(this);
    }

    private static final class MetricsImpl
        extends AbstractAugmentable<Metrics>
        implements Metrics {
    
        private final String _executionEnvironmentMetric;
        private final Object _executionEnvironmentRef;
        private final String _name;
        private final MetricsKey key;
    
        MetricsImpl(MetricsBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new MetricsKey(base.getName());
            }
            this._name = key.getName();
            this._executionEnvironmentMetric = base.getExecutionEnvironmentMetric();
            this._executionEnvironmentRef = base.getExecutionEnvironmentRef();
        }
    
        @Override
        public MetricsKey key() {
            return key;
        }
        
        @Override
        public String getExecutionEnvironmentMetric() {
            return _executionEnvironmentMetric;
        }
        
        @Override
        public Object getExecutionEnvironmentRef() {
            return _executionEnvironmentRef;
        }
        
        @Override
        public String getName() {
            return _name;
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
            result = prime * result + Objects.hashCode(_executionEnvironmentMetric);
            result = prime * result + Objects.hashCode(_executionEnvironmentRef);
            result = prime * result + Objects.hashCode(_name);
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
            if (!Metrics.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Metrics other = (Metrics)obj;
            if (!Objects.equals(_executionEnvironmentMetric, other.getExecutionEnvironmentMetric())) {
                return false;
            }
            if (!Objects.equals(_executionEnvironmentRef, other.getExecutionEnvironmentRef())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MetricsImpl otherImpl = (MetricsImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Metrics>>, Augmentation<Metrics>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Metrics");
            CodeHelpers.appendValue(helper, "_executionEnvironmentMetric", _executionEnvironmentMetric);
            CodeHelpers.appendValue(helper, "_executionEnvironmentRef", _executionEnvironmentRef);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
