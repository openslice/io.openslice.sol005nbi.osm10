package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.configurable.properties;
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
 * Class that builds {@link AdditionalConfigurablePropertyBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     AdditionalConfigurablePropertyBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new AdditionalConfigurablePropertyBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of AdditionalConfigurablePropertyBuilder, as instances can be freely passed around without
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
 * @see AdditionalConfigurablePropertyBuilder
 * @see Builder
 *
 */
public class AdditionalConfigurablePropertyBuilder implements Builder<AdditionalConfigurableProperty> {

    private String _key;
    private String _value;
    private AdditionalConfigurablePropertyKey key;


    Map<Class<? extends Augmentation<AdditionalConfigurableProperty>>, Augmentation<AdditionalConfigurableProperty>> augmentation = Collections.emptyMap();

    public AdditionalConfigurablePropertyBuilder() {
    }

    public AdditionalConfigurablePropertyBuilder(AdditionalConfigurableProperty base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<AdditionalConfigurableProperty>>, Augmentation<AdditionalConfigurableProperty>> aug =((AugmentationHolder<AdditionalConfigurableProperty>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._key = base.getKey();
        this._value = base.getValue();
    }


    public AdditionalConfigurablePropertyKey key() {
        return key;
    }
    
    public String getKey() {
        return _key;
    }
    
    public String getValue() {
        return _value;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<AdditionalConfigurableProperty>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public AdditionalConfigurablePropertyBuilder withKey(final AdditionalConfigurablePropertyKey key) {
        this.key = key;
        return this;
    }
    
    public AdditionalConfigurablePropertyBuilder setKey(final String value) {
        this._key = value;
        return this;
    }
    
    public AdditionalConfigurablePropertyBuilder setValue(final String value) {
        this._value = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public AdditionalConfigurablePropertyBuilder addAugmentation(Augmentation<AdditionalConfigurableProperty> augmentation) {
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
    public AdditionalConfigurablePropertyBuilder addAugmentation(Class<? extends Augmentation<AdditionalConfigurableProperty>> augmentationType, Augmentation<AdditionalConfigurableProperty> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public AdditionalConfigurablePropertyBuilder removeAugmentation(Class<? extends Augmentation<AdditionalConfigurableProperty>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private AdditionalConfigurablePropertyBuilder doAddAugmentation(Class<? extends Augmentation<AdditionalConfigurableProperty>> augmentationType, Augmentation<AdditionalConfigurableProperty> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public AdditionalConfigurableProperty build() {
        return new AdditionalConfigurablePropertyImpl(this);
    }

    private static final class AdditionalConfigurablePropertyImpl
        extends AbstractAugmentable<AdditionalConfigurableProperty>
        implements AdditionalConfigurableProperty {
    
        private final String _key;
        private final String _value;
        private final AdditionalConfigurablePropertyKey key;
    
        AdditionalConfigurablePropertyImpl(AdditionalConfigurablePropertyBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new AdditionalConfigurablePropertyKey(base.getKey());
            }
            this._key = key.getKey();
            this._value = base.getValue();
        }
    
        @Override
        public AdditionalConfigurablePropertyKey key() {
            return key;
        }
        
        @Override
        public String getKey() {
            return _key;
        }
        
        @Override
        public String getValue() {
            return _value;
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_value);
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
            if (!AdditionalConfigurableProperty.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            AdditionalConfigurableProperty other = (AdditionalConfigurableProperty)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AdditionalConfigurablePropertyImpl otherImpl = (AdditionalConfigurablePropertyImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<AdditionalConfigurableProperty>>, Augmentation<AdditionalConfigurableProperty>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("AdditionalConfigurableProperty");
            CodeHelpers.appendValue(helper, "_key", _key);
            CodeHelpers.appendValue(helper, "_value", _value);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
