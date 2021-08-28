package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ScalingTrigger;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ScalingConfigActionBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ScalingConfigActionBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ScalingConfigActionBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ScalingConfigActionBuilder, as instances can be freely passed around without
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
 * @see ScalingConfigActionBuilder
 * @see Builder
 *
 */
public class ScalingConfigActionBuilder implements Builder<ScalingConfigAction> {

    private String _nsConfigPrimitiveNameRef;
    private ScalingTrigger _trigger;
    private ScalingConfigActionKey key;


    Map<Class<? extends Augmentation<ScalingConfigAction>>, Augmentation<ScalingConfigAction>> augmentation = Collections.emptyMap();

    public ScalingConfigActionBuilder() {
    }

    public ScalingConfigActionBuilder(ScalingConfigAction base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ScalingConfigAction>>, Augmentation<ScalingConfigAction>> aug =((AugmentationHolder<ScalingConfigAction>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._trigger = base.getTrigger();
        this._nsConfigPrimitiveNameRef = base.getNsConfigPrimitiveNameRef();
    }


    public ScalingConfigActionKey key() {
        return key;
    }
    
    public String getNsConfigPrimitiveNameRef() {
        return _nsConfigPrimitiveNameRef;
    }
    
    public ScalingTrigger getTrigger() {
        return _trigger;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ScalingConfigAction>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ScalingConfigActionBuilder withKey(final ScalingConfigActionKey key) {
        this.key = key;
        return this;
    }
    
    public ScalingConfigActionBuilder setNsConfigPrimitiveNameRef(final String value) {
        this._nsConfigPrimitiveNameRef = value;
        return this;
    }
    
    public ScalingConfigActionBuilder setTrigger(final ScalingTrigger value) {
        this._trigger = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ScalingConfigActionBuilder addAugmentation(Augmentation<ScalingConfigAction> augmentation) {
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
    public ScalingConfigActionBuilder addAugmentation(Class<? extends Augmentation<ScalingConfigAction>> augmentationType, Augmentation<ScalingConfigAction> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ScalingConfigActionBuilder removeAugmentation(Class<? extends Augmentation<ScalingConfigAction>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ScalingConfigActionBuilder doAddAugmentation(Class<? extends Augmentation<ScalingConfigAction>> augmentationType, Augmentation<ScalingConfigAction> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ScalingConfigAction build() {
        return new ScalingConfigActionImpl(this);
    }

    private static final class ScalingConfigActionImpl
        extends AbstractAugmentable<ScalingConfigAction>
        implements ScalingConfigAction {
    
        private final String _nsConfigPrimitiveNameRef;
        private final ScalingTrigger _trigger;
        private final ScalingConfigActionKey key;
    
        ScalingConfigActionImpl(ScalingConfigActionBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ScalingConfigActionKey(base.getTrigger());
            }
            this._trigger = key.getTrigger();
            this._nsConfigPrimitiveNameRef = base.getNsConfigPrimitiveNameRef();
        }
    
        @Override
        public ScalingConfigActionKey key() {
            return key;
        }
        
        @Override
        public String getNsConfigPrimitiveNameRef() {
            return _nsConfigPrimitiveNameRef;
        }
        
        @Override
        public ScalingTrigger getTrigger() {
            return _trigger;
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
            result = prime * result + Objects.hashCode(_nsConfigPrimitiveNameRef);
            result = prime * result + Objects.hashCode(_trigger);
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
            if (!ScalingConfigAction.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ScalingConfigAction other = (ScalingConfigAction)obj;
            if (!Objects.equals(_nsConfigPrimitiveNameRef, other.getNsConfigPrimitiveNameRef())) {
                return false;
            }
            if (!Objects.equals(_trigger, other.getTrigger())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingConfigActionImpl otherImpl = (ScalingConfigActionImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingConfigAction>>, Augmentation<ScalingConfigAction>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingConfigAction");
            CodeHelpers.appendValue(helper, "_nsConfigPrimitiveNameRef", _nsConfigPrimitiveNameRef);
            CodeHelpers.appendValue(helper, "_trigger", _trigger);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
