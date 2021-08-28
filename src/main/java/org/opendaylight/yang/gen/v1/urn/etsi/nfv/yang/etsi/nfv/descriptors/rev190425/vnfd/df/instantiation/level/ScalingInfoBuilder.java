package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Long;
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
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link ScalingInfoBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ScalingInfoBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ScalingInfoBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ScalingInfoBuilder, as instances can be freely passed around without
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
 * @see ScalingInfoBuilder
 * @see Builder
 *
 */
public class ScalingInfoBuilder implements Builder<ScalingInfo> {

    private Uint32 _scaleLevel;
    private String _scalingAspectId;
    private ScalingInfoKey key;


    Map<Class<? extends Augmentation<ScalingInfo>>, Augmentation<ScalingInfo>> augmentation = Collections.emptyMap();

    public ScalingInfoBuilder() {
    }

    public ScalingInfoBuilder(ScalingInfo base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ScalingInfo>>, Augmentation<ScalingInfo>> aug =((AugmentationHolder<ScalingInfo>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._scalingAspectId = base.getScalingAspectId();
        this._scaleLevel = base.getScaleLevel();
    }


    public ScalingInfoKey key() {
        return key;
    }
    
    public Uint32 getScaleLevel() {
        return _scaleLevel;
    }
    
    public String getScalingAspectId() {
        return _scalingAspectId;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ScalingInfo>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ScalingInfoBuilder withKey(final ScalingInfoKey key) {
        this.key = key;
        return this;
    }
    
    public ScalingInfoBuilder setScaleLevel(final Uint32 value) {
        this._scaleLevel = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setScaleLevel(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public ScalingInfoBuilder setScaleLevel(final Long value) {
        return setScaleLevel(CodeHelpers.compatUint(value));
    }
    
    public ScalingInfoBuilder setScalingAspectId(final String value) {
        this._scalingAspectId = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ScalingInfoBuilder addAugmentation(Augmentation<ScalingInfo> augmentation) {
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
    public ScalingInfoBuilder addAugmentation(Class<? extends Augmentation<ScalingInfo>> augmentationType, Augmentation<ScalingInfo> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ScalingInfoBuilder removeAugmentation(Class<? extends Augmentation<ScalingInfo>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ScalingInfoBuilder doAddAugmentation(Class<? extends Augmentation<ScalingInfo>> augmentationType, Augmentation<ScalingInfo> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ScalingInfo build() {
        return new ScalingInfoImpl(this);
    }

    private static final class ScalingInfoImpl
        extends AbstractAugmentable<ScalingInfo>
        implements ScalingInfo {
    
        private final Uint32 _scaleLevel;
        private final String _scalingAspectId;
        private final ScalingInfoKey key;
    
        ScalingInfoImpl(ScalingInfoBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ScalingInfoKey(base.getScalingAspectId());
            }
            this._scalingAspectId = key.getScalingAspectId();
            this._scaleLevel = base.getScaleLevel();
        }
    
        @Override
        public ScalingInfoKey key() {
            return key;
        }
        
        @Override
        public Uint32 getScaleLevel() {
            return _scaleLevel;
        }
        
        @Override
        public String getScalingAspectId() {
            return _scalingAspectId;
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
            result = prime * result + Objects.hashCode(_scaleLevel);
            result = prime * result + Objects.hashCode(_scalingAspectId);
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
            if (!ScalingInfo.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ScalingInfo other = (ScalingInfo)obj;
            if (!Objects.equals(_scaleLevel, other.getScaleLevel())) {
                return false;
            }
            if (!Objects.equals(_scalingAspectId, other.getScalingAspectId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingInfoImpl otherImpl = (ScalingInfoImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingInfo>>, Augmentation<ScalingInfo>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingInfo");
            CodeHelpers.appendValue(helper, "_scaleLevel", _scaleLevel);
            CodeHelpers.appendValue(helper, "_scalingAspectId", _scalingAspectId);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
