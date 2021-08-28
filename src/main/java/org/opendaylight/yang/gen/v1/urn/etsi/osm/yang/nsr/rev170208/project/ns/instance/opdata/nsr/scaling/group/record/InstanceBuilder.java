package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Integer;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ConfigStates;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint16;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link InstanceBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     InstanceBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new InstanceBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of InstanceBuilder, as instances can be freely passed around without
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
 * @see InstanceBuilder
 * @see Builder
 *
 */
public class InstanceBuilder implements Builder<Instance> {

    private ConfigStates _configStatus;
    private Uint32 _createTime;
    private String _errorMsg;
    private Uint16 _instanceId;
    private Instance.OpStatus _opStatus;
    private List<String> _vnfrs;
    private Boolean _isDefault;
    private InstanceKey key;


    Map<Class<? extends Augmentation<Instance>>, Augmentation<Instance>> augmentation = Collections.emptyMap();

    public InstanceBuilder() {
    }

    public InstanceBuilder(Instance base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Instance>>, Augmentation<Instance>> aug =((AugmentationHolder<Instance>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._instanceId = base.getInstanceId();
        this._configStatus = base.getConfigStatus();
        this._createTime = base.getCreateTime();
        this._errorMsg = base.getErrorMsg();
        this._opStatus = base.getOpStatus();
        this._vnfrs = base.getVnfrs();
        this._isDefault = base.isIsDefault();
    }


    public InstanceKey key() {
        return key;
    }
    
    public ConfigStates getConfigStatus() {
        return _configStatus;
    }
    
    public Uint32 getCreateTime() {
        return _createTime;
    }
    
    public String getErrorMsg() {
        return _errorMsg;
    }
    
    public Uint16 getInstanceId() {
        return _instanceId;
    }
    
    public Instance.OpStatus getOpStatus() {
        return _opStatus;
    }
    
    public List<String> getVnfrs() {
        return _vnfrs;
    }
    
    public Boolean isIsDefault() {
        return _isDefault;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Instance>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public InstanceBuilder withKey(final InstanceKey key) {
        this.key = key;
        return this;
    }
    
    public InstanceBuilder setConfigStatus(final ConfigStates value) {
        this._configStatus = value;
        return this;
    }
    
    public InstanceBuilder setCreateTime(final Uint32 value) {
        this._createTime = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCreateTime(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public InstanceBuilder setCreateTime(final Long value) {
        return setCreateTime(CodeHelpers.compatUint(value));
    }
    
    public InstanceBuilder setErrorMsg(final String value) {
        this._errorMsg = value;
        return this;
    }
    
    public InstanceBuilder setInstanceId(final Uint16 value) {
        this._instanceId = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setInstanceId(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public InstanceBuilder setInstanceId(final Integer value) {
        return setInstanceId(CodeHelpers.compatUint(value));
    }
    
    public InstanceBuilder setOpStatus(final Instance.OpStatus value) {
        this._opStatus = value;
        return this;
    }
    public InstanceBuilder setVnfrs(final List<String> values) {
        this._vnfrs = values;
        return this;
    }
    
    
    public InstanceBuilder setIsDefault(final Boolean value) {
        this._isDefault = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public InstanceBuilder addAugmentation(Augmentation<Instance> augmentation) {
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
    public InstanceBuilder addAugmentation(Class<? extends Augmentation<Instance>> augmentationType, Augmentation<Instance> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public InstanceBuilder removeAugmentation(Class<? extends Augmentation<Instance>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private InstanceBuilder doAddAugmentation(Class<? extends Augmentation<Instance>> augmentationType, Augmentation<Instance> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Instance build() {
        return new InstanceImpl(this);
    }

    private static final class InstanceImpl
        extends AbstractAugmentable<Instance>
        implements Instance {
    
        private final ConfigStates _configStatus;
        private final Uint32 _createTime;
        private final String _errorMsg;
        private final Uint16 _instanceId;
        private final Instance.OpStatus _opStatus;
        private final List<String> _vnfrs;
        private final Boolean _isDefault;
        private final InstanceKey key;
    
        InstanceImpl(InstanceBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new InstanceKey(base.getInstanceId());
            }
            this._instanceId = key.getInstanceId();
            this._configStatus = base.getConfigStatus();
            this._createTime = base.getCreateTime();
            this._errorMsg = base.getErrorMsg();
            this._opStatus = base.getOpStatus();
            this._vnfrs = base.getVnfrs();
            this._isDefault = base.isIsDefault();
        }
    
        @Override
        public InstanceKey key() {
            return key;
        }
        
        @Override
        public ConfigStates getConfigStatus() {
            return _configStatus;
        }
        
        @Override
        public Uint32 getCreateTime() {
            return _createTime;
        }
        
        @Override
        public String getErrorMsg() {
            return _errorMsg;
        }
        
        @Override
        public Uint16 getInstanceId() {
            return _instanceId;
        }
        
        @Override
        public Instance.OpStatus getOpStatus() {
            return _opStatus;
        }
        
        @Override
        public List<String> getVnfrs() {
            return _vnfrs;
        }
        
        @Override
        public Boolean isIsDefault() {
            return _isDefault;
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
            result = prime * result + Objects.hashCode(_configStatus);
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_errorMsg);
            result = prime * result + Objects.hashCode(_instanceId);
            result = prime * result + Objects.hashCode(_opStatus);
            result = prime * result + Objects.hashCode(_vnfrs);
            result = prime * result + Objects.hashCode(_isDefault);
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
            if (!Instance.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Instance other = (Instance)obj;
            if (!Objects.equals(_configStatus, other.getConfigStatus())) {
                return false;
            }
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_errorMsg, other.getErrorMsg())) {
                return false;
            }
            if (!Objects.equals(_instanceId, other.getInstanceId())) {
                return false;
            }
            if (!Objects.equals(_opStatus, other.getOpStatus())) {
                return false;
            }
            if (!Objects.equals(_vnfrs, other.getVnfrs())) {
                return false;
            }
            if (!Objects.equals(_isDefault, other.isIsDefault())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InstanceImpl otherImpl = (InstanceImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Instance>>, Augmentation<Instance>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Instance");
            CodeHelpers.appendValue(helper, "_configStatus", _configStatus);
            CodeHelpers.appendValue(helper, "_createTime", _createTime);
            CodeHelpers.appendValue(helper, "_errorMsg", _errorMsg);
            CodeHelpers.appendValue(helper, "_instanceId", _instanceId);
            CodeHelpers.appendValue(helper, "_opStatus", _opStatus);
            CodeHelpers.appendValue(helper, "_vnfrs", _vnfrs);
            CodeHelpers.appendValue(helper, "_isDefault", _isDefault);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
