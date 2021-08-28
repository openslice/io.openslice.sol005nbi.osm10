package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
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
 * Class that builds {@link IndicatorBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     IndicatorBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new IndicatorBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of IndicatorBuilder, as instances can be freely passed around without
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
 * @see IndicatorBuilder
 * @see Builder
 *
 */
public class IndicatorBuilder implements Builder<Indicator> {

    private String _id;
    private String _indicatorValue;
    private String _name;
    private Indicator.Source _source;
    private IndicatorKey key;


    Map<Class<? extends Augmentation<Indicator>>, Augmentation<Indicator>> augmentation = Collections.emptyMap();

    public IndicatorBuilder() {
    }

    public IndicatorBuilder(Indicator base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Indicator>>, Augmentation<Indicator>> aug =((AugmentationHolder<Indicator>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._indicatorValue = base.getIndicatorValue();
        this._name = base.getName();
        this._source = base.getSource();
    }


    public IndicatorKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getIndicatorValue() {
        return _indicatorValue;
    }
    
    public String getName() {
        return _name;
    }
    
    public Indicator.Source getSource() {
        return _source;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Indicator>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public IndicatorBuilder withKey(final IndicatorKey key) {
        this.key = key;
        return this;
    }
    
    public IndicatorBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public IndicatorBuilder setIndicatorValue(final String value) {
        this._indicatorValue = value;
        return this;
    }
    
    public IndicatorBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public IndicatorBuilder setSource(final Indicator.Source value) {
        this._source = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public IndicatorBuilder addAugmentation(Augmentation<Indicator> augmentation) {
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
    public IndicatorBuilder addAugmentation(Class<? extends Augmentation<Indicator>> augmentationType, Augmentation<Indicator> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public IndicatorBuilder removeAugmentation(Class<? extends Augmentation<Indicator>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private IndicatorBuilder doAddAugmentation(Class<? extends Augmentation<Indicator>> augmentationType, Augmentation<Indicator> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Indicator build() {
        return new IndicatorImpl(this);
    }

    private static final class IndicatorImpl
        extends AbstractAugmentable<Indicator>
        implements Indicator {
    
        private final String _id;
        private final String _indicatorValue;
        private final String _name;
        private final Indicator.Source _source;
        private final IndicatorKey key;
    
        IndicatorImpl(IndicatorBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new IndicatorKey(base.getId());
            }
            this._id = key.getId();
            this._indicatorValue = base.getIndicatorValue();
            this._name = base.getName();
            this._source = base.getSource();
        }
    
        @Override
        public IndicatorKey key() {
            return key;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getIndicatorValue() {
            return _indicatorValue;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Indicator.Source getSource() {
            return _source;
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_indicatorValue);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_source);
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
            if (!Indicator.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Indicator other = (Indicator)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_indicatorValue, other.getIndicatorValue())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_source, other.getSource())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IndicatorImpl otherImpl = (IndicatorImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Indicator>>, Augmentation<Indicator>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Indicator");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_indicatorValue", _indicatorValue);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_source", _source);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
