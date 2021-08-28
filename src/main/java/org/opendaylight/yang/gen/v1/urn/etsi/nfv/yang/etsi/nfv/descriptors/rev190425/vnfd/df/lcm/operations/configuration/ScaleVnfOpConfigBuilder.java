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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.scale.vnf.op.config.Parameter;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.scale.vnf.op.config.ParameterKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ScaleVnfOpConfigBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ScaleVnfOpConfigBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ScaleVnfOpConfigBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ScaleVnfOpConfigBuilder, as instances can be freely passed around without
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
 * @see ScaleVnfOpConfigBuilder
 * @see Builder
 *
 */
public class ScaleVnfOpConfigBuilder implements Builder<ScaleVnfOpConfig> {

    private Map<ParameterKey, Parameter> _parameter;
    private Boolean _scalingByMoreThanOneStepSupported;


    Map<Class<? extends Augmentation<ScaleVnfOpConfig>>, Augmentation<ScaleVnfOpConfig>> augmentation = Collections.emptyMap();

    public ScaleVnfOpConfigBuilder() {
    }

    public ScaleVnfOpConfigBuilder(ScaleVnfOpConfig base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ScaleVnfOpConfig>>, Augmentation<ScaleVnfOpConfig>> aug =((AugmentationHolder<ScaleVnfOpConfig>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._parameter = base.getParameter();
        this._scalingByMoreThanOneStepSupported = base.isScalingByMoreThanOneStepSupported();
    }


    public Map<ParameterKey, Parameter> getParameter() {
        return _parameter;
    }
    
    public Boolean isScalingByMoreThanOneStepSupported() {
        return _scalingByMoreThanOneStepSupported;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ScaleVnfOpConfig>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ScaleVnfOpConfigBuilder setParameter(final Map<ParameterKey, Parameter> values) {
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
    public ScaleVnfOpConfigBuilder setParameter(final List<Parameter> values) {
        return setParameter(CodeHelpers.compatMap(values));
    }
    
    public ScaleVnfOpConfigBuilder setScalingByMoreThanOneStepSupported(final Boolean value) {
        this._scalingByMoreThanOneStepSupported = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ScaleVnfOpConfigBuilder addAugmentation(Augmentation<ScaleVnfOpConfig> augmentation) {
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
    public ScaleVnfOpConfigBuilder addAugmentation(Class<? extends Augmentation<ScaleVnfOpConfig>> augmentationType, Augmentation<ScaleVnfOpConfig> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ScaleVnfOpConfigBuilder removeAugmentation(Class<? extends Augmentation<ScaleVnfOpConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ScaleVnfOpConfigBuilder doAddAugmentation(Class<? extends Augmentation<ScaleVnfOpConfig>> augmentationType, Augmentation<ScaleVnfOpConfig> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ScaleVnfOpConfig build() {
        return new ScaleVnfOpConfigImpl(this);
    }

    private static final class ScaleVnfOpConfigImpl
        extends AbstractAugmentable<ScaleVnfOpConfig>
        implements ScaleVnfOpConfig {
    
        private final Map<ParameterKey, Parameter> _parameter;
        private final Boolean _scalingByMoreThanOneStepSupported;
    
        ScaleVnfOpConfigImpl(ScaleVnfOpConfigBuilder base) {
            super(base.augmentation);
            this._parameter = CodeHelpers.emptyToNull(base.getParameter());
            this._scalingByMoreThanOneStepSupported = base.isScalingByMoreThanOneStepSupported();
        }
    
        @Override
        public Map<ParameterKey, Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public Boolean isScalingByMoreThanOneStepSupported() {
            return _scalingByMoreThanOneStepSupported;
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
            result = prime * result + Objects.hashCode(_scalingByMoreThanOneStepSupported);
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
            if (!ScaleVnfOpConfig.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ScaleVnfOpConfig other = (ScaleVnfOpConfig)obj;
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_scalingByMoreThanOneStepSupported, other.isScalingByMoreThanOneStepSupported())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScaleVnfOpConfigImpl otherImpl = (ScaleVnfOpConfigImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScaleVnfOpConfig>>, Augmentation<ScaleVnfOpConfig>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScaleVnfOpConfig");
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_scalingByMoreThanOneStepSupported", _scalingByMoreThanOneStepSupported);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
