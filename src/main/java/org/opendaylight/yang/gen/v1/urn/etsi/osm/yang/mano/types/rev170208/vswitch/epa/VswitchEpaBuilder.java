package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vswitch.epa;
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
 * Class that builds {@link VswitchEpaBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VswitchEpaBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VswitchEpaBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VswitchEpaBuilder, as instances can be freely passed around without
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
 * @see VswitchEpaBuilder
 * @see Builder
 *
 */
public class VswitchEpaBuilder implements Builder<VswitchEpa> {

    private VswitchEpa.OvsAcceleration _ovsAcceleration;
    private VswitchEpa.OvsOffload _ovsOffload;


    Map<Class<? extends Augmentation<VswitchEpa>>, Augmentation<VswitchEpa>> augmentation = Collections.emptyMap();

    public VswitchEpaBuilder() {
    }

    public VswitchEpaBuilder(VswitchEpa base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VswitchEpa>>, Augmentation<VswitchEpa>> aug =((AugmentationHolder<VswitchEpa>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._ovsAcceleration = base.getOvsAcceleration();
        this._ovsOffload = base.getOvsOffload();
    }


    public VswitchEpa.OvsAcceleration getOvsAcceleration() {
        return _ovsAcceleration;
    }
    
    public VswitchEpa.OvsOffload getOvsOffload() {
        return _ovsOffload;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VswitchEpa>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public VswitchEpaBuilder setOvsAcceleration(final VswitchEpa.OvsAcceleration value) {
        this._ovsAcceleration = value;
        return this;
    }
    
    public VswitchEpaBuilder setOvsOffload(final VswitchEpa.OvsOffload value) {
        this._ovsOffload = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VswitchEpaBuilder addAugmentation(Augmentation<VswitchEpa> augmentation) {
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
    public VswitchEpaBuilder addAugmentation(Class<? extends Augmentation<VswitchEpa>> augmentationType, Augmentation<VswitchEpa> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VswitchEpaBuilder removeAugmentation(Class<? extends Augmentation<VswitchEpa>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VswitchEpaBuilder doAddAugmentation(Class<? extends Augmentation<VswitchEpa>> augmentationType, Augmentation<VswitchEpa> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VswitchEpa build() {
        return new VswitchEpaImpl(this);
    }

    private static final class VswitchEpaImpl
        extends AbstractAugmentable<VswitchEpa>
        implements VswitchEpa {
    
        private final VswitchEpa.OvsAcceleration _ovsAcceleration;
        private final VswitchEpa.OvsOffload _ovsOffload;
    
        VswitchEpaImpl(VswitchEpaBuilder base) {
            super(base.augmentation);
            this._ovsAcceleration = base.getOvsAcceleration();
            this._ovsOffload = base.getOvsOffload();
        }
    
        @Override
        public VswitchEpa.OvsAcceleration getOvsAcceleration() {
            return _ovsAcceleration;
        }
        
        @Override
        public VswitchEpa.OvsOffload getOvsOffload() {
            return _ovsOffload;
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
            result = prime * result + Objects.hashCode(_ovsAcceleration);
            result = prime * result + Objects.hashCode(_ovsOffload);
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
            if (!VswitchEpa.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VswitchEpa other = (VswitchEpa)obj;
            if (!Objects.equals(_ovsAcceleration, other.getOvsAcceleration())) {
                return false;
            }
            if (!Objects.equals(_ovsOffload, other.getOvsOffload())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VswitchEpaImpl otherImpl = (VswitchEpaImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VswitchEpa>>, Augmentation<VswitchEpa>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VswitchEpa");
            CodeHelpers.appendValue(helper, "_ovsAcceleration", _ovsAcceleration);
            CodeHelpers.appendValue(helper, "_ovsOffload", _ovsOffload);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
