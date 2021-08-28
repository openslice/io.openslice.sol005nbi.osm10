package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.ScalingCriteriaOperation;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.ScalingPolicyType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.scaling.policy.ScalingCriteria;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.scaling.policy.ScalingCriteriaKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link ScalingPolicyBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ScalingPolicyBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ScalingPolicyBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ScalingPolicyBuilder, as instances can be freely passed around without
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
 * @see ScalingPolicyBuilder
 * @see Builder
 *
 */
public class ScalingPolicyBuilder implements Builder<ScalingPolicy> {

    private Uint32 _cooldownTime;
    private String _name;
    private ScalingCriteriaOperation _scaleInOperationType;
    private ScalingCriteriaOperation _scaleOutOperationType;
    private Map<ScalingCriteriaKey, ScalingCriteria> _scalingCriteria;
    private ScalingPolicyType _scalingType;
    private Uint32 _thresholdTime;
    private Boolean _enabled;
    private ScalingPolicyKey key;


    Map<Class<? extends Augmentation<ScalingPolicy>>, Augmentation<ScalingPolicy>> augmentation = Collections.emptyMap();

    public ScalingPolicyBuilder() {
    }

    public ScalingPolicyBuilder(ScalingPolicy base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ScalingPolicy>>, Augmentation<ScalingPolicy>> aug =((AugmentationHolder<ScalingPolicy>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._cooldownTime = base.getCooldownTime();
        this._scaleInOperationType = base.getScaleInOperationType();
        this._scaleOutOperationType = base.getScaleOutOperationType();
        this._scalingCriteria = base.getScalingCriteria();
        this._scalingType = base.getScalingType();
        this._thresholdTime = base.getThresholdTime();
        this._enabled = base.isEnabled();
    }


    public ScalingPolicyKey key() {
        return key;
    }
    
    public Uint32 getCooldownTime() {
        return _cooldownTime;
    }
    
    public String getName() {
        return _name;
    }
    
    public ScalingCriteriaOperation getScaleInOperationType() {
        return _scaleInOperationType;
    }
    
    public ScalingCriteriaOperation getScaleOutOperationType() {
        return _scaleOutOperationType;
    }
    
    public Map<ScalingCriteriaKey, ScalingCriteria> getScalingCriteria() {
        return _scalingCriteria;
    }
    
    public ScalingPolicyType getScalingType() {
        return _scalingType;
    }
    
    public Uint32 getThresholdTime() {
        return _thresholdTime;
    }
    
    public Boolean isEnabled() {
        return _enabled;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ScalingPolicy>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ScalingPolicyBuilder withKey(final ScalingPolicyKey key) {
        this.key = key;
        return this;
    }
    
    public ScalingPolicyBuilder setCooldownTime(final Uint32 value) {
        this._cooldownTime = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCooldownTime(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public ScalingPolicyBuilder setCooldownTime(final Long value) {
        return setCooldownTime(CodeHelpers.compatUint(value));
    }
    
    public ScalingPolicyBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ScalingPolicyBuilder setScaleInOperationType(final ScalingCriteriaOperation value) {
        this._scaleInOperationType = value;
        return this;
    }
    
    public ScalingPolicyBuilder setScaleOutOperationType(final ScalingCriteriaOperation value) {
        this._scaleOutOperationType = value;
        return this;
    }
    public ScalingPolicyBuilder setScalingCriteria(final Map<ScalingCriteriaKey, ScalingCriteria> values) {
        this._scalingCriteria = values;
        return this;
    }
    
    /**
      * Utility migration setter.
      *
      * <b>IMPORTANT NOTE</b>: This method does not completely match previous mechanics, as the list is processed as
      *                        during this method's execution. Any future modifications of the list are <b>NOT</b>
      *                        reflected in this builder nor its products.
      *
      * @param values Legacy List of values
      * @return this builder
      * @throws IllegalArgumentException if the list contains entries with the same key
      * @throws NullPointerException if the list contains a null entry
      * @deprecated Use {#link #setScalingCriteria(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ScalingPolicyBuilder setScalingCriteria(final List<ScalingCriteria> values) {
        return setScalingCriteria(CodeHelpers.compatMap(values));
    }
    
    public ScalingPolicyBuilder setScalingType(final ScalingPolicyType value) {
        this._scalingType = value;
        return this;
    }
    
    public ScalingPolicyBuilder setThresholdTime(final Uint32 value) {
        this._thresholdTime = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setThresholdTime(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public ScalingPolicyBuilder setThresholdTime(final Long value) {
        return setThresholdTime(CodeHelpers.compatUint(value));
    }
    
    public ScalingPolicyBuilder setEnabled(final Boolean value) {
        this._enabled = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ScalingPolicyBuilder addAugmentation(Augmentation<ScalingPolicy> augmentation) {
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
    public ScalingPolicyBuilder addAugmentation(Class<? extends Augmentation<ScalingPolicy>> augmentationType, Augmentation<ScalingPolicy> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ScalingPolicyBuilder removeAugmentation(Class<? extends Augmentation<ScalingPolicy>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ScalingPolicyBuilder doAddAugmentation(Class<? extends Augmentation<ScalingPolicy>> augmentationType, Augmentation<ScalingPolicy> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ScalingPolicy build() {
        return new ScalingPolicyImpl(this);
    }

    private static final class ScalingPolicyImpl
        extends AbstractAugmentable<ScalingPolicy>
        implements ScalingPolicy {
    
        private final Uint32 _cooldownTime;
        private final String _name;
        private final ScalingCriteriaOperation _scaleInOperationType;
        private final ScalingCriteriaOperation _scaleOutOperationType;
        private final Map<ScalingCriteriaKey, ScalingCriteria> _scalingCriteria;
        private final ScalingPolicyType _scalingType;
        private final Uint32 _thresholdTime;
        private final Boolean _enabled;
        private final ScalingPolicyKey key;
    
        ScalingPolicyImpl(ScalingPolicyBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ScalingPolicyKey(base.getName());
            }
            this._name = key.getName();
            this._cooldownTime = base.getCooldownTime();
            this._scaleInOperationType = base.getScaleInOperationType();
            this._scaleOutOperationType = base.getScaleOutOperationType();
            this._scalingCriteria = CodeHelpers.emptyToNull(base.getScalingCriteria());
            this._scalingType = base.getScalingType();
            this._thresholdTime = base.getThresholdTime();
            this._enabled = base.isEnabled();
        }
    
        @Override
        public ScalingPolicyKey key() {
            return key;
        }
        
        @Override
        public Uint32 getCooldownTime() {
            return _cooldownTime;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public ScalingCriteriaOperation getScaleInOperationType() {
            return _scaleInOperationType;
        }
        
        @Override
        public ScalingCriteriaOperation getScaleOutOperationType() {
            return _scaleOutOperationType;
        }
        
        @Override
        public Map<ScalingCriteriaKey, ScalingCriteria> getScalingCriteria() {
            return _scalingCriteria;
        }
        
        @Override
        public ScalingPolicyType getScalingType() {
            return _scalingType;
        }
        
        @Override
        public Uint32 getThresholdTime() {
            return _thresholdTime;
        }
        
        @Override
        public Boolean isEnabled() {
            return _enabled;
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
            result = prime * result + Objects.hashCode(_cooldownTime);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_scaleInOperationType);
            result = prime * result + Objects.hashCode(_scaleOutOperationType);
            result = prime * result + Objects.hashCode(_scalingCriteria);
            result = prime * result + Objects.hashCode(_scalingType);
            result = prime * result + Objects.hashCode(_thresholdTime);
            result = prime * result + Objects.hashCode(_enabled);
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
            if (!ScalingPolicy.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ScalingPolicy other = (ScalingPolicy)obj;
            if (!Objects.equals(_cooldownTime, other.getCooldownTime())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_scaleInOperationType, other.getScaleInOperationType())) {
                return false;
            }
            if (!Objects.equals(_scaleOutOperationType, other.getScaleOutOperationType())) {
                return false;
            }
            if (!Objects.equals(_scalingCriteria, other.getScalingCriteria())) {
                return false;
            }
            if (!Objects.equals(_scalingType, other.getScalingType())) {
                return false;
            }
            if (!Objects.equals(_thresholdTime, other.getThresholdTime())) {
                return false;
            }
            if (!Objects.equals(_enabled, other.isEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingPolicyImpl otherImpl = (ScalingPolicyImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingPolicy>>, Augmentation<ScalingPolicy>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingPolicy");
            CodeHelpers.appendValue(helper, "_cooldownTime", _cooldownTime);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_scaleInOperationType", _scaleInOperationType);
            CodeHelpers.appendValue(helper, "_scaleOutOperationType", _scaleOutOperationType);
            CodeHelpers.appendValue(helper, "_scalingCriteria", _scalingCriteria);
            CodeHelpers.appendValue(helper, "_scalingType", _scalingType);
            CodeHelpers.appendValue(helper, "_thresholdTime", _thresholdTime);
            CodeHelpers.appendValue(helper, "_enabled", _enabled);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
