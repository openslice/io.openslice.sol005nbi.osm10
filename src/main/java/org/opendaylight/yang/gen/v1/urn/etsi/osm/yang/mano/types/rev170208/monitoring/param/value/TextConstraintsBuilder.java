package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.monitoring.param.value;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.Short;
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
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * Class that builds {@link TextConstraintsBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     TextConstraintsBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new TextConstraintsBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of TextConstraintsBuilder, as instances can be freely passed around without
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
 * @see TextConstraintsBuilder
 * @see Builder
 *
 */
public class TextConstraintsBuilder implements Builder<TextConstraints> {

    private Uint8 _maxLength;
    private Uint8 _minLength;


    Map<Class<? extends Augmentation<TextConstraints>>, Augmentation<TextConstraints>> augmentation = Collections.emptyMap();

    public TextConstraintsBuilder() {
    }

    public TextConstraintsBuilder(TextConstraints base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<TextConstraints>>, Augmentation<TextConstraints>> aug =((AugmentationHolder<TextConstraints>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._maxLength = base.getMaxLength();
        this._minLength = base.getMinLength();
    }


    public Uint8 getMaxLength() {
        return _maxLength;
    }
    
    public Uint8 getMinLength() {
        return _minLength;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<TextConstraints>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public TextConstraintsBuilder setMaxLength(final Uint8 value) {
        this._maxLength = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setMaxLength(Uint8)} instead.
     */
    @Deprecated(forRemoval = true)
    public TextConstraintsBuilder setMaxLength(final Short value) {
        return setMaxLength(CodeHelpers.compatUint(value));
    }
    
    public TextConstraintsBuilder setMinLength(final Uint8 value) {
        this._minLength = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setMinLength(Uint8)} instead.
     */
    @Deprecated(forRemoval = true)
    public TextConstraintsBuilder setMinLength(final Short value) {
        return setMinLength(CodeHelpers.compatUint(value));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public TextConstraintsBuilder addAugmentation(Augmentation<TextConstraints> augmentation) {
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
    public TextConstraintsBuilder addAugmentation(Class<? extends Augmentation<TextConstraints>> augmentationType, Augmentation<TextConstraints> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public TextConstraintsBuilder removeAugmentation(Class<? extends Augmentation<TextConstraints>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private TextConstraintsBuilder doAddAugmentation(Class<? extends Augmentation<TextConstraints>> augmentationType, Augmentation<TextConstraints> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public TextConstraints build() {
        return new TextConstraintsImpl(this);
    }

    private static final class TextConstraintsImpl
        extends AbstractAugmentable<TextConstraints>
        implements TextConstraints {
    
        private final Uint8 _maxLength;
        private final Uint8 _minLength;
    
        TextConstraintsImpl(TextConstraintsBuilder base) {
            super(base.augmentation);
            this._maxLength = base.getMaxLength();
            this._minLength = base.getMinLength();
        }
    
        @Override
        public Uint8 getMaxLength() {
            return _maxLength;
        }
        
        @Override
        public Uint8 getMinLength() {
            return _minLength;
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
            result = prime * result + Objects.hashCode(_maxLength);
            result = prime * result + Objects.hashCode(_minLength);
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
            if (!TextConstraints.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            TextConstraints other = (TextConstraints)obj;
            if (!Objects.equals(_maxLength, other.getMaxLength())) {
                return false;
            }
            if (!Objects.equals(_minLength, other.getMinLength())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TextConstraintsImpl otherImpl = (TextConstraintsImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<TextConstraints>>, Augmentation<TextConstraints>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("TextConstraints");
            CodeHelpers.appendValue(helper, "_maxLength", _maxLength);
            CodeHelpers.appendValue(helper, "_minLength", _minLength);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
