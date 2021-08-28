package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.scaling.group.InstanceKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ScalingGroupBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ScalingGroupBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ScalingGroupBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ScalingGroupBuilder, as instances can be freely passed around without
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
 * @see ScalingGroupBuilder
 * @see Builder
 *
 */
public class ScalingGroupBuilder implements Builder<ScalingGroup> {

    private Map<InstanceKey, Instance> _instance;
    private String _scalingGroupNameRef;
    private ScalingGroupKey key;


    Map<Class<? extends Augmentation<ScalingGroup>>, Augmentation<ScalingGroup>> augmentation = Collections.emptyMap();

    public ScalingGroupBuilder() {
    }

    public ScalingGroupBuilder(ScalingGroup base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ScalingGroup>>, Augmentation<ScalingGroup>> aug =((AugmentationHolder<ScalingGroup>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._scalingGroupNameRef = base.getScalingGroupNameRef();
        this._instance = base.getInstance();
    }


    public ScalingGroupKey key() {
        return key;
    }
    
    public Map<InstanceKey, Instance> getInstance() {
        return _instance;
    }
    
    public String getScalingGroupNameRef() {
        return _scalingGroupNameRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ScalingGroup>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ScalingGroupBuilder withKey(final ScalingGroupKey key) {
        this.key = key;
        return this;
    }
    public ScalingGroupBuilder setInstance(final Map<InstanceKey, Instance> values) {
        this._instance = values;
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
      * @deprecated Use {#link #setInstance(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ScalingGroupBuilder setInstance(final List<Instance> values) {
        return setInstance(CodeHelpers.compatMap(values));
    }
    
    public ScalingGroupBuilder setScalingGroupNameRef(final String value) {
        this._scalingGroupNameRef = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ScalingGroupBuilder addAugmentation(Augmentation<ScalingGroup> augmentation) {
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
    public ScalingGroupBuilder addAugmentation(Class<? extends Augmentation<ScalingGroup>> augmentationType, Augmentation<ScalingGroup> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ScalingGroupBuilder removeAugmentation(Class<? extends Augmentation<ScalingGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ScalingGroupBuilder doAddAugmentation(Class<? extends Augmentation<ScalingGroup>> augmentationType, Augmentation<ScalingGroup> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ScalingGroup build() {
        return new ScalingGroupImpl(this);
    }

    private static final class ScalingGroupImpl
        extends AbstractAugmentable<ScalingGroup>
        implements ScalingGroup {
    
        private final Map<InstanceKey, Instance> _instance;
        private final String _scalingGroupNameRef;
        private final ScalingGroupKey key;
    
        ScalingGroupImpl(ScalingGroupBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ScalingGroupKey(base.getScalingGroupNameRef());
            }
            this._scalingGroupNameRef = key.getScalingGroupNameRef();
            this._instance = CodeHelpers.emptyToNull(base.getInstance());
        }
    
        @Override
        public ScalingGroupKey key() {
            return key;
        }
        
        @Override
        public Map<InstanceKey, Instance> getInstance() {
            return _instance;
        }
        
        @Override
        public String getScalingGroupNameRef() {
            return _scalingGroupNameRef;
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
            result = prime * result + Objects.hashCode(_instance);
            result = prime * result + Objects.hashCode(_scalingGroupNameRef);
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
            if (!ScalingGroup.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ScalingGroup other = (ScalingGroup)obj;
            if (!Objects.equals(_instance, other.getInstance())) {
                return false;
            }
            if (!Objects.equals(_scalingGroupNameRef, other.getScalingGroupNameRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingGroupImpl otherImpl = (ScalingGroupImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingGroup>>, Augmentation<ScalingGroup>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingGroup");
            CodeHelpers.appendValue(helper, "_instance", _instance);
            CodeHelpers.appendValue(helper, "_scalingGroupNameRef", _scalingGroupNameRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
