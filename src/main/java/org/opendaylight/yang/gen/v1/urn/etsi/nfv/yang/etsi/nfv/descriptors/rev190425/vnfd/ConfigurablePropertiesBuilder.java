package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.configurable.properties.AdditionalConfigurableProperty;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.configurable.properties.AdditionalConfigurablePropertyKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ConfigurablePropertiesBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ConfigurablePropertiesBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ConfigurablePropertiesBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ConfigurablePropertiesBuilder, as instances can be freely passed around without
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
 * @see ConfigurablePropertiesBuilder
 * @see Builder
 *
 */
public class ConfigurablePropertiesBuilder implements Builder<ConfigurableProperties> {

    private Map<AdditionalConfigurablePropertyKey, AdditionalConfigurableProperty> _additionalConfigurableProperty;
    private Boolean _isAutoHealEnabled;
    private Boolean _isAutoScalableEnabled;


    Map<Class<? extends Augmentation<ConfigurableProperties>>, Augmentation<ConfigurableProperties>> augmentation = Collections.emptyMap();

    public ConfigurablePropertiesBuilder() {
    }

    public ConfigurablePropertiesBuilder(ConfigurableProperties base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ConfigurableProperties>>, Augmentation<ConfigurableProperties>> aug =((AugmentationHolder<ConfigurableProperties>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._additionalConfigurableProperty = base.getAdditionalConfigurableProperty();
        this._isAutoHealEnabled = base.isIsAutoHealEnabled();
        this._isAutoScalableEnabled = base.isIsAutoScalableEnabled();
    }


    public Map<AdditionalConfigurablePropertyKey, AdditionalConfigurableProperty> getAdditionalConfigurableProperty() {
        return _additionalConfigurableProperty;
    }
    
    public Boolean isIsAutoHealEnabled() {
        return _isAutoHealEnabled;
    }
    
    public Boolean isIsAutoScalableEnabled() {
        return _isAutoScalableEnabled;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ConfigurableProperties>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ConfigurablePropertiesBuilder setAdditionalConfigurableProperty(final Map<AdditionalConfigurablePropertyKey, AdditionalConfigurableProperty> values) {
        this._additionalConfigurableProperty = values;
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
      * @deprecated Use {#link #setAdditionalConfigurableProperty(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ConfigurablePropertiesBuilder setAdditionalConfigurableProperty(final List<AdditionalConfigurableProperty> values) {
        return setAdditionalConfigurableProperty(CodeHelpers.compatMap(values));
    }
    
    public ConfigurablePropertiesBuilder setIsAutoHealEnabled(final Boolean value) {
        this._isAutoHealEnabled = value;
        return this;
    }
    
    public ConfigurablePropertiesBuilder setIsAutoScalableEnabled(final Boolean value) {
        this._isAutoScalableEnabled = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ConfigurablePropertiesBuilder addAugmentation(Augmentation<ConfigurableProperties> augmentation) {
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
    public ConfigurablePropertiesBuilder addAugmentation(Class<? extends Augmentation<ConfigurableProperties>> augmentationType, Augmentation<ConfigurableProperties> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ConfigurablePropertiesBuilder removeAugmentation(Class<? extends Augmentation<ConfigurableProperties>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ConfigurablePropertiesBuilder doAddAugmentation(Class<? extends Augmentation<ConfigurableProperties>> augmentationType, Augmentation<ConfigurableProperties> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ConfigurableProperties build() {
        return new ConfigurablePropertiesImpl(this);
    }

    private static final class ConfigurablePropertiesImpl
        extends AbstractAugmentable<ConfigurableProperties>
        implements ConfigurableProperties {
    
        private final Map<AdditionalConfigurablePropertyKey, AdditionalConfigurableProperty> _additionalConfigurableProperty;
        private final Boolean _isAutoHealEnabled;
        private final Boolean _isAutoScalableEnabled;
    
        ConfigurablePropertiesImpl(ConfigurablePropertiesBuilder base) {
            super(base.augmentation);
            this._additionalConfigurableProperty = CodeHelpers.emptyToNull(base.getAdditionalConfigurableProperty());
            this._isAutoHealEnabled = base.isIsAutoHealEnabled();
            this._isAutoScalableEnabled = base.isIsAutoScalableEnabled();
        }
    
        @Override
        public Map<AdditionalConfigurablePropertyKey, AdditionalConfigurableProperty> getAdditionalConfigurableProperty() {
            return _additionalConfigurableProperty;
        }
        
        @Override
        public Boolean isIsAutoHealEnabled() {
            return _isAutoHealEnabled;
        }
        
        @Override
        public Boolean isIsAutoScalableEnabled() {
            return _isAutoScalableEnabled;
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
            result = prime * result + Objects.hashCode(_additionalConfigurableProperty);
            result = prime * result + Objects.hashCode(_isAutoHealEnabled);
            result = prime * result + Objects.hashCode(_isAutoScalableEnabled);
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
            if (!ConfigurableProperties.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ConfigurableProperties other = (ConfigurableProperties)obj;
            if (!Objects.equals(_additionalConfigurableProperty, other.getAdditionalConfigurableProperty())) {
                return false;
            }
            if (!Objects.equals(_isAutoHealEnabled, other.isIsAutoHealEnabled())) {
                return false;
            }
            if (!Objects.equals(_isAutoScalableEnabled, other.isIsAutoScalableEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConfigurablePropertiesImpl otherImpl = (ConfigurablePropertiesImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConfigurableProperties>>, Augmentation<ConfigurableProperties>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConfigurableProperties");
            CodeHelpers.appendValue(helper, "_additionalConfigurableProperty", _additionalConfigurableProperty);
            CodeHelpers.appendValue(helper, "_isAutoHealEnabled", _isAutoHealEnabled);
            CodeHelpers.appendValue(helper, "_isAutoScalableEnabled", _isAutoScalableEnabled);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
