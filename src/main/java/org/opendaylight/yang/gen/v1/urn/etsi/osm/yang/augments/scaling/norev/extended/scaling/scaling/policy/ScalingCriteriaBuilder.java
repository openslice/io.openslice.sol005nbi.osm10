package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.scaling.policy;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.RelationalOperationType;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ScalingCriteriaBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ScalingCriteriaBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ScalingCriteriaBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ScalingCriteriaBuilder, as instances can be freely passed around without
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
 * @see ScalingCriteriaBuilder
 * @see Builder
 *
 */
public class ScalingCriteriaBuilder implements Builder<ScalingCriteria> {

    private String _name;
    private RelationalOperationType _scaleInRelationalOperation;
    private BigDecimal _scaleInThreshold;
    private RelationalOperationType _scaleOutRelationalOperation;
    private BigDecimal _scaleOutThreshold;
    private String _vnfMonitoringParamRef;
    private ScalingCriteriaKey key;


    Map<Class<? extends Augmentation<ScalingCriteria>>, Augmentation<ScalingCriteria>> augmentation = Collections.emptyMap();

    public ScalingCriteriaBuilder() {
    }

    public ScalingCriteriaBuilder(ScalingCriteria base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ScalingCriteria>>, Augmentation<ScalingCriteria>> aug =((AugmentationHolder<ScalingCriteria>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._scaleInRelationalOperation = base.getScaleInRelationalOperation();
        this._scaleInThreshold = base.getScaleInThreshold();
        this._scaleOutRelationalOperation = base.getScaleOutRelationalOperation();
        this._scaleOutThreshold = base.getScaleOutThreshold();
        this._vnfMonitoringParamRef = base.getVnfMonitoringParamRef();
    }


    public ScalingCriteriaKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    public RelationalOperationType getScaleInRelationalOperation() {
        return _scaleInRelationalOperation;
    }
    
    public BigDecimal getScaleInThreshold() {
        return _scaleInThreshold;
    }
    
    public RelationalOperationType getScaleOutRelationalOperation() {
        return _scaleOutRelationalOperation;
    }
    
    public BigDecimal getScaleOutThreshold() {
        return _scaleOutThreshold;
    }
    
    public String getVnfMonitoringParamRef() {
        return _vnfMonitoringParamRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ScalingCriteria>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ScalingCriteriaBuilder withKey(final ScalingCriteriaKey key) {
        this.key = key;
        return this;
    }
    
    public ScalingCriteriaBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ScalingCriteriaBuilder setScaleInRelationalOperation(final RelationalOperationType value) {
        this._scaleInRelationalOperation = value;
        return this;
    }
    
    
    public ScalingCriteriaBuilder setScaleInThreshold(final BigDecimal value) {
        if (value != null) {
            
        }
        this._scaleInThreshold = value;
        return this;
    }
    
    public ScalingCriteriaBuilder setScaleOutRelationalOperation(final RelationalOperationType value) {
        this._scaleOutRelationalOperation = value;
        return this;
    }
    
    
    public ScalingCriteriaBuilder setScaleOutThreshold(final BigDecimal value) {
        if (value != null) {
            
        }
        this._scaleOutThreshold = value;
        return this;
    }
    
    public ScalingCriteriaBuilder setVnfMonitoringParamRef(final String value) {
        this._vnfMonitoringParamRef = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ScalingCriteriaBuilder addAugmentation(Augmentation<ScalingCriteria> augmentation) {
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
    public ScalingCriteriaBuilder addAugmentation(Class<? extends Augmentation<ScalingCriteria>> augmentationType, Augmentation<ScalingCriteria> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ScalingCriteriaBuilder removeAugmentation(Class<? extends Augmentation<ScalingCriteria>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ScalingCriteriaBuilder doAddAugmentation(Class<? extends Augmentation<ScalingCriteria>> augmentationType, Augmentation<ScalingCriteria> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ScalingCriteria build() {
        return new ScalingCriteriaImpl(this);
    }

    private static final class ScalingCriteriaImpl
        extends AbstractAugmentable<ScalingCriteria>
        implements ScalingCriteria {
    
        private final String _name;
        private final RelationalOperationType _scaleInRelationalOperation;
        private final BigDecimal _scaleInThreshold;
        private final RelationalOperationType _scaleOutRelationalOperation;
        private final BigDecimal _scaleOutThreshold;
        private final String _vnfMonitoringParamRef;
        private final ScalingCriteriaKey key;
    
        ScalingCriteriaImpl(ScalingCriteriaBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ScalingCriteriaKey(base.getName());
            }
            this._name = key.getName();
            this._scaleInRelationalOperation = base.getScaleInRelationalOperation();
            this._scaleInThreshold = base.getScaleInThreshold();
            this._scaleOutRelationalOperation = base.getScaleOutRelationalOperation();
            this._scaleOutThreshold = base.getScaleOutThreshold();
            this._vnfMonitoringParamRef = base.getVnfMonitoringParamRef();
        }
    
        @Override
        public ScalingCriteriaKey key() {
            return key;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public RelationalOperationType getScaleInRelationalOperation() {
            return _scaleInRelationalOperation;
        }
        
        @Override
        public BigDecimal getScaleInThreshold() {
            return _scaleInThreshold;
        }
        
        @Override
        public RelationalOperationType getScaleOutRelationalOperation() {
            return _scaleOutRelationalOperation;
        }
        
        @Override
        public BigDecimal getScaleOutThreshold() {
            return _scaleOutThreshold;
        }
        
        @Override
        public String getVnfMonitoringParamRef() {
            return _vnfMonitoringParamRef;
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_scaleInRelationalOperation);
            result = prime * result + Objects.hashCode(_scaleInThreshold);
            result = prime * result + Objects.hashCode(_scaleOutRelationalOperation);
            result = prime * result + Objects.hashCode(_scaleOutThreshold);
            result = prime * result + Objects.hashCode(_vnfMonitoringParamRef);
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
            if (!ScalingCriteria.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ScalingCriteria other = (ScalingCriteria)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_scaleInRelationalOperation, other.getScaleInRelationalOperation())) {
                return false;
            }
            if (!Objects.equals(_scaleInThreshold, other.getScaleInThreshold())) {
                return false;
            }
            if (!Objects.equals(_scaleOutRelationalOperation, other.getScaleOutRelationalOperation())) {
                return false;
            }
            if (!Objects.equals(_scaleOutThreshold, other.getScaleOutThreshold())) {
                return false;
            }
            if (!Objects.equals(_vnfMonitoringParamRef, other.getVnfMonitoringParamRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingCriteriaImpl otherImpl = (ScalingCriteriaImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingCriteria>>, Augmentation<ScalingCriteria>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingCriteria");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_scaleInRelationalOperation", _scaleInRelationalOperation);
            CodeHelpers.appendValue(helper, "_scaleInThreshold", _scaleInThreshold);
            CodeHelpers.appendValue(helper, "_scaleOutRelationalOperation", _scaleOutRelationalOperation);
            CodeHelpers.appendValue(helper, "_scaleOutThreshold", _scaleOutThreshold);
            CodeHelpers.appendValue(helper, "_vnfMonitoringParamRef", _vnfMonitoringParamRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
