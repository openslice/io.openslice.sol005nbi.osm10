package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter;
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
 * Class that builds {@link InputParameterBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     InputParameterBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new InputParameterBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of InputParameterBuilder, as instances can be freely passed around without
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
 * @see InputParameterBuilder
 * @see Builder
 *
 */
public class InputParameterBuilder implements Builder<InputParameter> {

    private String _value;
    private String _xpath;
    private InputParameterKey key;


    Map<Class<? extends Augmentation<InputParameter>>, Augmentation<InputParameter>> augmentation = Collections.emptyMap();

    public InputParameterBuilder() {
    }

    public InputParameterBuilder(InputParameter base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<InputParameter>>, Augmentation<InputParameter>> aug =((AugmentationHolder<InputParameter>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._xpath = base.getXpath();
        this._value = base.getValue();
    }


    public InputParameterKey key() {
        return key;
    }
    
    public String getValue() {
        return _value;
    }
    
    public String getXpath() {
        return _xpath;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<InputParameter>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public InputParameterBuilder withKey(final InputParameterKey key) {
        this.key = key;
        return this;
    }
    
    public InputParameterBuilder setValue(final String value) {
        this._value = value;
        return this;
    }
    
    public InputParameterBuilder setXpath(final String value) {
        this._xpath = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public InputParameterBuilder addAugmentation(Augmentation<InputParameter> augmentation) {
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
    public InputParameterBuilder addAugmentation(Class<? extends Augmentation<InputParameter>> augmentationType, Augmentation<InputParameter> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public InputParameterBuilder removeAugmentation(Class<? extends Augmentation<InputParameter>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private InputParameterBuilder doAddAugmentation(Class<? extends Augmentation<InputParameter>> augmentationType, Augmentation<InputParameter> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public InputParameter build() {
        return new InputParameterImpl(this);
    }

    private static final class InputParameterImpl
        extends AbstractAugmentable<InputParameter>
        implements InputParameter {
    
        private final String _value;
        private final String _xpath;
        private final InputParameterKey key;
    
        InputParameterImpl(InputParameterBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new InputParameterKey(base.getXpath());
            }
            this._xpath = key.getXpath();
            this._value = base.getValue();
        }
    
        @Override
        public InputParameterKey key() {
            return key;
        }
        
        @Override
        public String getValue() {
            return _value;
        }
        
        @Override
        public String getXpath() {
            return _xpath;
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
            result = prime * result + Objects.hashCode(_value);
            result = prime * result + Objects.hashCode(_xpath);
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
            if (!InputParameter.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            InputParameter other = (InputParameter)obj;
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (!Objects.equals(_xpath, other.getXpath())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InputParameterImpl otherImpl = (InputParameterImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InputParameter>>, Augmentation<InputParameter>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InputParameter");
            CodeHelpers.appendValue(helper, "_value", _value);
            CodeHelpers.appendValue(helper, "_xpath", _xpath);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
