package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ChangeExtVnfConnectivityOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ChangeVnfFlavourOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.HealVnfOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.InstantiateVnfOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.OperateVnfOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ScaleVnfOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.ScaleVnfToLevelOpConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.TerminateVnfOpConfig;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link LcmOperationsConfigurationBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     LcmOperationsConfigurationBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new LcmOperationsConfigurationBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of LcmOperationsConfigurationBuilder, as instances can be freely passed around without
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
 * @see LcmOperationsConfigurationBuilder
 * @see Builder
 *
 */
public class LcmOperationsConfigurationBuilder implements Builder<LcmOperationsConfiguration> {

    private ChangeExtVnfConnectivityOpConfig _changeExtVnfConnectivityOpConfig;
    private ChangeVnfFlavourOpConfig _changeVnfFlavourOpConfig;
    private HealVnfOpConfig _healVnfOpConfig;
    private InstantiateVnfOpConfig _instantiateVnfOpConfig;
    private OperateVnfOpConfig _operateVnfOpConfig;
    private ScaleVnfOpConfig _scaleVnfOpConfig;
    private ScaleVnfToLevelOpConfig _scaleVnfToLevelOpConfig;
    private TerminateVnfOpConfig _terminateVnfOpConfig;


    Map<Class<? extends Augmentation<LcmOperationsConfiguration>>, Augmentation<LcmOperationsConfiguration>> augmentation = Collections.emptyMap();

    public LcmOperationsConfigurationBuilder() {
    }

    public LcmOperationsConfigurationBuilder(LcmOperationsConfiguration base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<LcmOperationsConfiguration>>, Augmentation<LcmOperationsConfiguration>> aug =((AugmentationHolder<LcmOperationsConfiguration>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._changeExtVnfConnectivityOpConfig = base.getChangeExtVnfConnectivityOpConfig();
        this._changeVnfFlavourOpConfig = base.getChangeVnfFlavourOpConfig();
        this._healVnfOpConfig = base.getHealVnfOpConfig();
        this._instantiateVnfOpConfig = base.getInstantiateVnfOpConfig();
        this._operateVnfOpConfig = base.getOperateVnfOpConfig();
        this._scaleVnfOpConfig = base.getScaleVnfOpConfig();
        this._scaleVnfToLevelOpConfig = base.getScaleVnfToLevelOpConfig();
        this._terminateVnfOpConfig = base.getTerminateVnfOpConfig();
    }


    public ChangeExtVnfConnectivityOpConfig getChangeExtVnfConnectivityOpConfig() {
        return _changeExtVnfConnectivityOpConfig;
    }
    
    public ChangeVnfFlavourOpConfig getChangeVnfFlavourOpConfig() {
        return _changeVnfFlavourOpConfig;
    }
    
    public HealVnfOpConfig getHealVnfOpConfig() {
        return _healVnfOpConfig;
    }
    
    public InstantiateVnfOpConfig getInstantiateVnfOpConfig() {
        return _instantiateVnfOpConfig;
    }
    
    public OperateVnfOpConfig getOperateVnfOpConfig() {
        return _operateVnfOpConfig;
    }
    
    public ScaleVnfOpConfig getScaleVnfOpConfig() {
        return _scaleVnfOpConfig;
    }
    
    public ScaleVnfToLevelOpConfig getScaleVnfToLevelOpConfig() {
        return _scaleVnfToLevelOpConfig;
    }
    
    public TerminateVnfOpConfig getTerminateVnfOpConfig() {
        return _terminateVnfOpConfig;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<LcmOperationsConfiguration>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public LcmOperationsConfigurationBuilder setChangeExtVnfConnectivityOpConfig(final ChangeExtVnfConnectivityOpConfig value) {
        this._changeExtVnfConnectivityOpConfig = value;
        return this;
    }
    
    public LcmOperationsConfigurationBuilder setChangeVnfFlavourOpConfig(final ChangeVnfFlavourOpConfig value) {
        this._changeVnfFlavourOpConfig = value;
        return this;
    }
    
    public LcmOperationsConfigurationBuilder setHealVnfOpConfig(final HealVnfOpConfig value) {
        this._healVnfOpConfig = value;
        return this;
    }
    
    public LcmOperationsConfigurationBuilder setInstantiateVnfOpConfig(final InstantiateVnfOpConfig value) {
        this._instantiateVnfOpConfig = value;
        return this;
    }
    
    public LcmOperationsConfigurationBuilder setOperateVnfOpConfig(final OperateVnfOpConfig value) {
        this._operateVnfOpConfig = value;
        return this;
    }
    
    public LcmOperationsConfigurationBuilder setScaleVnfOpConfig(final ScaleVnfOpConfig value) {
        this._scaleVnfOpConfig = value;
        return this;
    }
    
    public LcmOperationsConfigurationBuilder setScaleVnfToLevelOpConfig(final ScaleVnfToLevelOpConfig value) {
        this._scaleVnfToLevelOpConfig = value;
        return this;
    }
    
    public LcmOperationsConfigurationBuilder setTerminateVnfOpConfig(final TerminateVnfOpConfig value) {
        this._terminateVnfOpConfig = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public LcmOperationsConfigurationBuilder addAugmentation(Augmentation<LcmOperationsConfiguration> augmentation) {
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
    public LcmOperationsConfigurationBuilder addAugmentation(Class<? extends Augmentation<LcmOperationsConfiguration>> augmentationType, Augmentation<LcmOperationsConfiguration> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public LcmOperationsConfigurationBuilder removeAugmentation(Class<? extends Augmentation<LcmOperationsConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private LcmOperationsConfigurationBuilder doAddAugmentation(Class<? extends Augmentation<LcmOperationsConfiguration>> augmentationType, Augmentation<LcmOperationsConfiguration> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public LcmOperationsConfiguration build() {
        return new LcmOperationsConfigurationImpl(this);
    }

    private static final class LcmOperationsConfigurationImpl
        extends AbstractAugmentable<LcmOperationsConfiguration>
        implements LcmOperationsConfiguration {
    
        private final ChangeExtVnfConnectivityOpConfig _changeExtVnfConnectivityOpConfig;
        private final ChangeVnfFlavourOpConfig _changeVnfFlavourOpConfig;
        private final HealVnfOpConfig _healVnfOpConfig;
        private final InstantiateVnfOpConfig _instantiateVnfOpConfig;
        private final OperateVnfOpConfig _operateVnfOpConfig;
        private final ScaleVnfOpConfig _scaleVnfOpConfig;
        private final ScaleVnfToLevelOpConfig _scaleVnfToLevelOpConfig;
        private final TerminateVnfOpConfig _terminateVnfOpConfig;
    
        LcmOperationsConfigurationImpl(LcmOperationsConfigurationBuilder base) {
            super(base.augmentation);
            this._changeExtVnfConnectivityOpConfig = base.getChangeExtVnfConnectivityOpConfig();
            this._changeVnfFlavourOpConfig = base.getChangeVnfFlavourOpConfig();
            this._healVnfOpConfig = base.getHealVnfOpConfig();
            this._instantiateVnfOpConfig = base.getInstantiateVnfOpConfig();
            this._operateVnfOpConfig = base.getOperateVnfOpConfig();
            this._scaleVnfOpConfig = base.getScaleVnfOpConfig();
            this._scaleVnfToLevelOpConfig = base.getScaleVnfToLevelOpConfig();
            this._terminateVnfOpConfig = base.getTerminateVnfOpConfig();
        }
    
        @Override
        public ChangeExtVnfConnectivityOpConfig getChangeExtVnfConnectivityOpConfig() {
            return _changeExtVnfConnectivityOpConfig;
        }
        
        @Override
        public ChangeVnfFlavourOpConfig getChangeVnfFlavourOpConfig() {
            return _changeVnfFlavourOpConfig;
        }
        
        @Override
        public HealVnfOpConfig getHealVnfOpConfig() {
            return _healVnfOpConfig;
        }
        
        @Override
        public InstantiateVnfOpConfig getInstantiateVnfOpConfig() {
            return _instantiateVnfOpConfig;
        }
        
        @Override
        public OperateVnfOpConfig getOperateVnfOpConfig() {
            return _operateVnfOpConfig;
        }
        
        @Override
        public ScaleVnfOpConfig getScaleVnfOpConfig() {
            return _scaleVnfOpConfig;
        }
        
        @Override
        public ScaleVnfToLevelOpConfig getScaleVnfToLevelOpConfig() {
            return _scaleVnfToLevelOpConfig;
        }
        
        @Override
        public TerminateVnfOpConfig getTerminateVnfOpConfig() {
            return _terminateVnfOpConfig;
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
            result = prime * result + Objects.hashCode(_changeExtVnfConnectivityOpConfig);
            result = prime * result + Objects.hashCode(_changeVnfFlavourOpConfig);
            result = prime * result + Objects.hashCode(_healVnfOpConfig);
            result = prime * result + Objects.hashCode(_instantiateVnfOpConfig);
            result = prime * result + Objects.hashCode(_operateVnfOpConfig);
            result = prime * result + Objects.hashCode(_scaleVnfOpConfig);
            result = prime * result + Objects.hashCode(_scaleVnfToLevelOpConfig);
            result = prime * result + Objects.hashCode(_terminateVnfOpConfig);
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
            if (!LcmOperationsConfiguration.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            LcmOperationsConfiguration other = (LcmOperationsConfiguration)obj;
            if (!Objects.equals(_changeExtVnfConnectivityOpConfig, other.getChangeExtVnfConnectivityOpConfig())) {
                return false;
            }
            if (!Objects.equals(_changeVnfFlavourOpConfig, other.getChangeVnfFlavourOpConfig())) {
                return false;
            }
            if (!Objects.equals(_healVnfOpConfig, other.getHealVnfOpConfig())) {
                return false;
            }
            if (!Objects.equals(_instantiateVnfOpConfig, other.getInstantiateVnfOpConfig())) {
                return false;
            }
            if (!Objects.equals(_operateVnfOpConfig, other.getOperateVnfOpConfig())) {
                return false;
            }
            if (!Objects.equals(_scaleVnfOpConfig, other.getScaleVnfOpConfig())) {
                return false;
            }
            if (!Objects.equals(_scaleVnfToLevelOpConfig, other.getScaleVnfToLevelOpConfig())) {
                return false;
            }
            if (!Objects.equals(_terminateVnfOpConfig, other.getTerminateVnfOpConfig())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LcmOperationsConfigurationImpl otherImpl = (LcmOperationsConfigurationImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<LcmOperationsConfiguration>>, Augmentation<LcmOperationsConfiguration>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("LcmOperationsConfiguration");
            CodeHelpers.appendValue(helper, "_changeExtVnfConnectivityOpConfig", _changeExtVnfConnectivityOpConfig);
            CodeHelpers.appendValue(helper, "_changeVnfFlavourOpConfig", _changeVnfFlavourOpConfig);
            CodeHelpers.appendValue(helper, "_healVnfOpConfig", _healVnfOpConfig);
            CodeHelpers.appendValue(helper, "_instantiateVnfOpConfig", _instantiateVnfOpConfig);
            CodeHelpers.appendValue(helper, "_operateVnfOpConfig", _operateVnfOpConfig);
            CodeHelpers.appendValue(helper, "_scaleVnfOpConfig", _scaleVnfOpConfig);
            CodeHelpers.appendValue(helper, "_scaleVnfToLevelOpConfig", _scaleVnfToLevelOpConfig);
            CodeHelpers.appendValue(helper, "_terminateVnfOpConfig", _terminateVnfOpConfig);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
