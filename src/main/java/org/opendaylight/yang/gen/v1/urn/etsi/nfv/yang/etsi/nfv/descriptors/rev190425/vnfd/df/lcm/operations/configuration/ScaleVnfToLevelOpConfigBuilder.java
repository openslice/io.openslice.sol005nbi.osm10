package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.scale.vnf.to.level.op.config.Parameter;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.scale.vnf.to.level.op.config.ParameterKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ScaleVnfToLevelOpConfigBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ScaleVnfToLevelOpConfigBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ScaleVnfToLevelOpConfigBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ScaleVnfToLevelOpConfigBuilder, as instances can be freely passed around without
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
 * @see ScaleVnfToLevelOpConfigBuilder
 * @see Builder
 *
 */
public class ScaleVnfToLevelOpConfigBuilder implements Builder<ScaleVnfToLevelOpConfig> {

    private Map<ParameterKey, Parameter> _parameter;
    private Boolean _arbitraryTargetLevelsSupported;


    Map<Class<? extends Augmentation<ScaleVnfToLevelOpConfig>>, Augmentation<ScaleVnfToLevelOpConfig>> augmentation = Collections.emptyMap();

    public ScaleVnfToLevelOpConfigBuilder() {
    }

    public ScaleVnfToLevelOpConfigBuilder(ScaleVnfToLevelOpConfig base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ScaleVnfToLevelOpConfig>>, Augmentation<ScaleVnfToLevelOpConfig>> aug =((AugmentationHolder<ScaleVnfToLevelOpConfig>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._parameter = base.getParameter();
        this._arbitraryTargetLevelsSupported = base.isArbitraryTargetLevelsSupported();
    }


    public Map<ParameterKey, Parameter> getParameter() {
        return _parameter;
    }
    
    public Boolean isArbitraryTargetLevelsSupported() {
        return _arbitraryTargetLevelsSupported;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ScaleVnfToLevelOpConfig>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ScaleVnfToLevelOpConfigBuilder setParameter(final Map<ParameterKey, Parameter> values) {
        this._parameter = values;
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
      * @deprecated Use {#link #setParameter(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ScaleVnfToLevelOpConfigBuilder setParameter(final List<Parameter> values) {
        return setParameter(CodeHelpers.compatMap(values));
    }
    
    public ScaleVnfToLevelOpConfigBuilder setArbitraryTargetLevelsSupported(final Boolean value) {
        this._arbitraryTargetLevelsSupported = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ScaleVnfToLevelOpConfigBuilder addAugmentation(Augmentation<ScaleVnfToLevelOpConfig> augmentation) {
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
    public ScaleVnfToLevelOpConfigBuilder addAugmentation(Class<? extends Augmentation<ScaleVnfToLevelOpConfig>> augmentationType, Augmentation<ScaleVnfToLevelOpConfig> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ScaleVnfToLevelOpConfigBuilder removeAugmentation(Class<? extends Augmentation<ScaleVnfToLevelOpConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ScaleVnfToLevelOpConfigBuilder doAddAugmentation(Class<? extends Augmentation<ScaleVnfToLevelOpConfig>> augmentationType, Augmentation<ScaleVnfToLevelOpConfig> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ScaleVnfToLevelOpConfig build() {
        return new ScaleVnfToLevelOpConfigImpl(this);
    }

    private static final class ScaleVnfToLevelOpConfigImpl
        extends AbstractAugmentable<ScaleVnfToLevelOpConfig>
        implements ScaleVnfToLevelOpConfig {
    
        private final Map<ParameterKey, Parameter> _parameter;
        private final Boolean _arbitraryTargetLevelsSupported;
    
        ScaleVnfToLevelOpConfigImpl(ScaleVnfToLevelOpConfigBuilder base) {
            super(base.augmentation);
            this._parameter = CodeHelpers.emptyToNull(base.getParameter());
            this._arbitraryTargetLevelsSupported = base.isArbitraryTargetLevelsSupported();
        }
    
        @Override
        public Map<ParameterKey, Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public Boolean isArbitraryTargetLevelsSupported() {
            return _arbitraryTargetLevelsSupported;
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
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_arbitraryTargetLevelsSupported);
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
            if (!ScaleVnfToLevelOpConfig.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ScaleVnfToLevelOpConfig other = (ScaleVnfToLevelOpConfig)obj;
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_arbitraryTargetLevelsSupported, other.isArbitraryTargetLevelsSupported())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScaleVnfToLevelOpConfigImpl otherImpl = (ScaleVnfToLevelOpConfigImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScaleVnfToLevelOpConfig>>, Augmentation<ScaleVnfToLevelOpConfig>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScaleVnfToLevelOpConfig");
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_arbitraryTargetLevelsSupported", _arbitraryTargetLevelsSupported);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
