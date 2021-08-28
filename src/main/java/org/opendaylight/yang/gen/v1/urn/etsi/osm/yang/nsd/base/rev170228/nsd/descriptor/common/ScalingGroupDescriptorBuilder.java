package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common;
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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigActionKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicyKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMemberKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link ScalingGroupDescriptorBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ScalingGroupDescriptorBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ScalingGroupDescriptorBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ScalingGroupDescriptorBuilder, as instances can be freely passed around without
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
 * @see ScalingGroupDescriptorBuilder
 * @see Builder
 *
 */
public class ScalingGroupDescriptorBuilder implements Builder<ScalingGroupDescriptor> {

    private Uint32 _maxInstanceCount;
    private Uint32 _minInstanceCount;
    private String _name;
    private Map<ScalingConfigActionKey, ScalingConfigAction> _scalingConfigAction;
    private Map<ScalingPolicyKey, ScalingPolicy> _scalingPolicy;
    private Map<VnfdMemberKey, VnfdMember> _vnfdMember;
    private ScalingGroupDescriptorKey key;


    Map<Class<? extends Augmentation<ScalingGroupDescriptor>>, Augmentation<ScalingGroupDescriptor>> augmentation = Collections.emptyMap();

    public ScalingGroupDescriptorBuilder() {
    }

    public ScalingGroupDescriptorBuilder(ScalingGroupDescriptor base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ScalingGroupDescriptor>>, Augmentation<ScalingGroupDescriptor>> aug =((AugmentationHolder<ScalingGroupDescriptor>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._maxInstanceCount = base.getMaxInstanceCount();
        this._minInstanceCount = base.getMinInstanceCount();
        this._scalingConfigAction = base.getScalingConfigAction();
        this._scalingPolicy = base.getScalingPolicy();
        this._vnfdMember = base.getVnfdMember();
    }


    public ScalingGroupDescriptorKey key() {
        return key;
    }
    
    public Uint32 getMaxInstanceCount() {
        return _maxInstanceCount;
    }
    
    public Uint32 getMinInstanceCount() {
        return _minInstanceCount;
    }
    
    public String getName() {
        return _name;
    }
    
    public Map<ScalingConfigActionKey, ScalingConfigAction> getScalingConfigAction() {
        return _scalingConfigAction;
    }
    
    public Map<ScalingPolicyKey, ScalingPolicy> getScalingPolicy() {
        return _scalingPolicy;
    }
    
    public Map<VnfdMemberKey, VnfdMember> getVnfdMember() {
        return _vnfdMember;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ScalingGroupDescriptor>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ScalingGroupDescriptorBuilder withKey(final ScalingGroupDescriptorKey key) {
        this.key = key;
        return this;
    }
    
    public ScalingGroupDescriptorBuilder setMaxInstanceCount(final Uint32 value) {
        this._maxInstanceCount = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setMaxInstanceCount(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public ScalingGroupDescriptorBuilder setMaxInstanceCount(final Long value) {
        return setMaxInstanceCount(CodeHelpers.compatUint(value));
    }
    
    public ScalingGroupDescriptorBuilder setMinInstanceCount(final Uint32 value) {
        this._minInstanceCount = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setMinInstanceCount(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public ScalingGroupDescriptorBuilder setMinInstanceCount(final Long value) {
        return setMinInstanceCount(CodeHelpers.compatUint(value));
    }
    
    public ScalingGroupDescriptorBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public ScalingGroupDescriptorBuilder setScalingConfigAction(final Map<ScalingConfigActionKey, ScalingConfigAction> values) {
        this._scalingConfigAction = values;
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
      * @deprecated Use {#link #setScalingConfigAction(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ScalingGroupDescriptorBuilder setScalingConfigAction(final List<ScalingConfigAction> values) {
        return setScalingConfigAction(CodeHelpers.compatMap(values));
    }
    public ScalingGroupDescriptorBuilder setScalingPolicy(final Map<ScalingPolicyKey, ScalingPolicy> values) {
        this._scalingPolicy = values;
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
      * @deprecated Use {#link #setScalingPolicy(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ScalingGroupDescriptorBuilder setScalingPolicy(final List<ScalingPolicy> values) {
        return setScalingPolicy(CodeHelpers.compatMap(values));
    }
    public ScalingGroupDescriptorBuilder setVnfdMember(final Map<VnfdMemberKey, VnfdMember> values) {
        this._vnfdMember = values;
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
      * @deprecated Use {#link #setVnfdMember(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ScalingGroupDescriptorBuilder setVnfdMember(final List<VnfdMember> values) {
        return setVnfdMember(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ScalingGroupDescriptorBuilder addAugmentation(Augmentation<ScalingGroupDescriptor> augmentation) {
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
    public ScalingGroupDescriptorBuilder addAugmentation(Class<? extends Augmentation<ScalingGroupDescriptor>> augmentationType, Augmentation<ScalingGroupDescriptor> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ScalingGroupDescriptorBuilder removeAugmentation(Class<? extends Augmentation<ScalingGroupDescriptor>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ScalingGroupDescriptorBuilder doAddAugmentation(Class<? extends Augmentation<ScalingGroupDescriptor>> augmentationType, Augmentation<ScalingGroupDescriptor> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ScalingGroupDescriptor build() {
        return new ScalingGroupDescriptorImpl(this);
    }

    private static final class ScalingGroupDescriptorImpl
        extends AbstractAugmentable<ScalingGroupDescriptor>
        implements ScalingGroupDescriptor {
    
        private final Uint32 _maxInstanceCount;
        private final Uint32 _minInstanceCount;
        private final String _name;
        private final Map<ScalingConfigActionKey, ScalingConfigAction> _scalingConfigAction;
        private final Map<ScalingPolicyKey, ScalingPolicy> _scalingPolicy;
        private final Map<VnfdMemberKey, VnfdMember> _vnfdMember;
        private final ScalingGroupDescriptorKey key;
    
        ScalingGroupDescriptorImpl(ScalingGroupDescriptorBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ScalingGroupDescriptorKey(base.getName());
            }
            this._name = key.getName();
            this._maxInstanceCount = base.getMaxInstanceCount();
            this._minInstanceCount = base.getMinInstanceCount();
            this._scalingConfigAction = CodeHelpers.emptyToNull(base.getScalingConfigAction());
            this._scalingPolicy = CodeHelpers.emptyToNull(base.getScalingPolicy());
            this._vnfdMember = CodeHelpers.emptyToNull(base.getVnfdMember());
        }
    
        @Override
        public ScalingGroupDescriptorKey key() {
            return key;
        }
        
        @Override
        public Uint32 getMaxInstanceCount() {
            return _maxInstanceCount;
        }
        
        @Override
        public Uint32 getMinInstanceCount() {
            return _minInstanceCount;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Map<ScalingConfigActionKey, ScalingConfigAction> getScalingConfigAction() {
            return _scalingConfigAction;
        }
        
        @Override
        public Map<ScalingPolicyKey, ScalingPolicy> getScalingPolicy() {
            return _scalingPolicy;
        }
        
        @Override
        public Map<VnfdMemberKey, VnfdMember> getVnfdMember() {
            return _vnfdMember;
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
            result = prime * result + Objects.hashCode(_maxInstanceCount);
            result = prime * result + Objects.hashCode(_minInstanceCount);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_scalingConfigAction);
            result = prime * result + Objects.hashCode(_scalingPolicy);
            result = prime * result + Objects.hashCode(_vnfdMember);
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
            if (!ScalingGroupDescriptor.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ScalingGroupDescriptor other = (ScalingGroupDescriptor)obj;
            if (!Objects.equals(_maxInstanceCount, other.getMaxInstanceCount())) {
                return false;
            }
            if (!Objects.equals(_minInstanceCount, other.getMinInstanceCount())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_scalingConfigAction, other.getScalingConfigAction())) {
                return false;
            }
            if (!Objects.equals(_scalingPolicy, other.getScalingPolicy())) {
                return false;
            }
            if (!Objects.equals(_vnfdMember, other.getVnfdMember())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingGroupDescriptorImpl otherImpl = (ScalingGroupDescriptorImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingGroupDescriptor>>, Augmentation<ScalingGroupDescriptor>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingGroupDescriptor");
            CodeHelpers.appendValue(helper, "_maxInstanceCount", _maxInstanceCount);
            CodeHelpers.appendValue(helper, "_minInstanceCount", _minInstanceCount);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_scalingConfigAction", _scalingConfigAction);
            CodeHelpers.appendValue(helper, "_scalingPolicy", _scalingPolicy);
            CodeHelpers.appendValue(helper, "_vnfdMember", _vnfdMember);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
