package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Integer;
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
import org.opendaylight.yangtools.yang.common.Uint16;

/**
 * Class that builds {@link VduLevelBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VduLevelBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VduLevelBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VduLevelBuilder, as instances can be freely passed around without
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
 * @see VduLevelBuilder
 * @see Builder
 *
 */
public class VduLevelBuilder implements Builder<VduLevel> {

    private Uint16 _numberOfInstances;
    private String _vduId;
    private VduLevelKey key;


    Map<Class<? extends Augmentation<VduLevel>>, Augmentation<VduLevel>> augmentation = Collections.emptyMap();

    public VduLevelBuilder() {
    }

    public VduLevelBuilder(VduLevel base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VduLevel>>, Augmentation<VduLevel>> aug =((AugmentationHolder<VduLevel>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._vduId = base.getVduId();
        this._numberOfInstances = base.getNumberOfInstances();
    }


    public VduLevelKey key() {
        return key;
    }
    
    public Uint16 getNumberOfInstances() {
        return _numberOfInstances;
    }
    
    public String getVduId() {
        return _vduId;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VduLevel>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VduLevelBuilder withKey(final VduLevelKey key) {
        this.key = key;
        return this;
    }
    
    public VduLevelBuilder setNumberOfInstances(final Uint16 value) {
        this._numberOfInstances = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setNumberOfInstances(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public VduLevelBuilder setNumberOfInstances(final Integer value) {
        return setNumberOfInstances(CodeHelpers.compatUint(value));
    }
    
    public VduLevelBuilder setVduId(final String value) {
        this._vduId = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VduLevelBuilder addAugmentation(Augmentation<VduLevel> augmentation) {
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
    public VduLevelBuilder addAugmentation(Class<? extends Augmentation<VduLevel>> augmentationType, Augmentation<VduLevel> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VduLevelBuilder removeAugmentation(Class<? extends Augmentation<VduLevel>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VduLevelBuilder doAddAugmentation(Class<? extends Augmentation<VduLevel>> augmentationType, Augmentation<VduLevel> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VduLevel build() {
        return new VduLevelImpl(this);
    }

    private static final class VduLevelImpl
        extends AbstractAugmentable<VduLevel>
        implements VduLevel {
    
        private final Uint16 _numberOfInstances;
        private final String _vduId;
        private final VduLevelKey key;
    
        VduLevelImpl(VduLevelBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VduLevelKey(base.getVduId());
            }
            this._vduId = key.getVduId();
            this._numberOfInstances = base.getNumberOfInstances();
        }
    
        @Override
        public VduLevelKey key() {
            return key;
        }
        
        @Override
        public Uint16 getNumberOfInstances() {
            return _numberOfInstances;
        }
        
        @Override
        public String getVduId() {
            return _vduId;
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
            result = prime * result + Objects.hashCode(_numberOfInstances);
            result = prime * result + Objects.hashCode(_vduId);
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
            if (!VduLevel.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VduLevel other = (VduLevel)obj;
            if (!Objects.equals(_numberOfInstances, other.getNumberOfInstances())) {
                return false;
            }
            if (!Objects.equals(_vduId, other.getVduId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduLevelImpl otherImpl = (VduLevelImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VduLevel>>, Augmentation<VduLevel>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VduLevel");
            CodeHelpers.appendValue(helper, "_numberOfInstances", _numberOfInstances);
            CodeHelpers.appendValue(helper, "_vduId", _vduId);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
