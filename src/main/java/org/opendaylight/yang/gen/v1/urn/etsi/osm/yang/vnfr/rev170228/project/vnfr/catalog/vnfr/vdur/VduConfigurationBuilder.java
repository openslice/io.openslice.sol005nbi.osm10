package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.ConfigMethod;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.ConfigPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.ConfigPrimitiveKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.InitialConfigPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.InitialConfigPrimitiveKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.TerminateConfigPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.TerminateConfigPrimitiveKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.metrics.Metrics;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.metrics.MetricsKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VduConfigurationBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VduConfigurationBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VduConfigurationBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VduConfigurationBuilder, as instances can be freely passed around without
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
 * @see VduConfigurationBuilder
 * @see Builder
 *
 */
public class VduConfigurationBuilder implements Builder<VduConfiguration> {

    private ConfigMethod _configMethod;
    private Map<ConfigPrimitiveKey, ConfigPrimitive> _configPrimitive;
    private Map<InitialConfigPrimitiveKey, InitialConfigPrimitive> _initialConfigPrimitive;
    private Map<MetricsKey, Metrics> _metrics;
    private Map<TerminateConfigPrimitiveKey, TerminateConfigPrimitive> _terminateConfigPrimitive;


    Map<Class<? extends Augmentation<VduConfiguration>>, Augmentation<VduConfiguration>> augmentation = Collections.emptyMap();

    public VduConfigurationBuilder() {
    }
    public VduConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration arg) {
        this._configPrimitive = arg.getConfigPrimitive();
        this._initialConfigPrimitive = arg.getInitialConfigPrimitive();
        this._terminateConfigPrimitive = arg.getTerminateConfigPrimitive();
        this._configMethod = arg.getConfigMethod();
        this._metrics = arg.getMetrics();
    }
    public VduConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod arg) {
        this._configMethod = arg.getConfigMethod();
    }
    public VduConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics arg) {
        this._metrics = arg.getMetrics();
    }

    public VduConfigurationBuilder(VduConfiguration base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VduConfiguration>>, Augmentation<VduConfiguration>> aug =((AugmentationHolder<VduConfiguration>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._configMethod = base.getConfigMethod();
        this._configPrimitive = base.getConfigPrimitive();
        this._initialConfigPrimitive = base.getInitialConfigPrimitive();
        this._metrics = base.getMetrics();
        this._terminateConfigPrimitive = base.getTerminateConfigPrimitive();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration) {
            this._configPrimitive = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration)arg).getConfigPrimitive();
            this._initialConfigPrimitive = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration)arg).getInitialConfigPrimitive();
            this._terminateConfigPrimitive = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration)arg).getTerminateConfigPrimitive();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod) {
            this._configMethod = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod)arg).getConfigMethod();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics) {
            this._metrics = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics)arg).getMetrics();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics]");
    }

    public ConfigMethod getConfigMethod() {
        return _configMethod;
    }
    
    public Map<ConfigPrimitiveKey, ConfigPrimitive> getConfigPrimitive() {
        return _configPrimitive;
    }
    
    public Map<InitialConfigPrimitiveKey, InitialConfigPrimitive> getInitialConfigPrimitive() {
        return _initialConfigPrimitive;
    }
    
    public Map<MetricsKey, Metrics> getMetrics() {
        return _metrics;
    }
    
    public Map<TerminateConfigPrimitiveKey, TerminateConfigPrimitive> getTerminateConfigPrimitive() {
        return _terminateConfigPrimitive;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VduConfiguration>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public VduConfigurationBuilder setConfigMethod(final ConfigMethod value) {
        this._configMethod = value;
        return this;
    }
    public VduConfigurationBuilder setConfigPrimitive(final Map<ConfigPrimitiveKey, ConfigPrimitive> values) {
        this._configPrimitive = values;
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
      * @deprecated Use {#link #setConfigPrimitive(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VduConfigurationBuilder setConfigPrimitive(final List<ConfigPrimitive> values) {
        return setConfigPrimitive(CodeHelpers.compatMap(values));
    }
    public VduConfigurationBuilder setInitialConfigPrimitive(final Map<InitialConfigPrimitiveKey, InitialConfigPrimitive> values) {
        this._initialConfigPrimitive = values;
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
      * @deprecated Use {#link #setInitialConfigPrimitive(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VduConfigurationBuilder setInitialConfigPrimitive(final List<InitialConfigPrimitive> values) {
        return setInitialConfigPrimitive(CodeHelpers.compatMap(values));
    }
    public VduConfigurationBuilder setMetrics(final Map<MetricsKey, Metrics> values) {
        this._metrics = values;
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
      * @deprecated Use {#link #setMetrics(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VduConfigurationBuilder setMetrics(final List<Metrics> values) {
        return setMetrics(CodeHelpers.compatMap(values));
    }
    public VduConfigurationBuilder setTerminateConfigPrimitive(final Map<TerminateConfigPrimitiveKey, TerminateConfigPrimitive> values) {
        this._terminateConfigPrimitive = values;
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
      * @deprecated Use {#link #setTerminateConfigPrimitive(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VduConfigurationBuilder setTerminateConfigPrimitive(final List<TerminateConfigPrimitive> values) {
        return setTerminateConfigPrimitive(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VduConfigurationBuilder addAugmentation(Augmentation<VduConfiguration> augmentation) {
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
    public VduConfigurationBuilder addAugmentation(Class<? extends Augmentation<VduConfiguration>> augmentationType, Augmentation<VduConfiguration> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VduConfigurationBuilder removeAugmentation(Class<? extends Augmentation<VduConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VduConfigurationBuilder doAddAugmentation(Class<? extends Augmentation<VduConfiguration>> augmentationType, Augmentation<VduConfiguration> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VduConfiguration build() {
        return new VduConfigurationImpl(this);
    }

    private static final class VduConfigurationImpl
        extends AbstractAugmentable<VduConfiguration>
        implements VduConfiguration {
    
        private final ConfigMethod _configMethod;
        private final Map<ConfigPrimitiveKey, ConfigPrimitive> _configPrimitive;
        private final Map<InitialConfigPrimitiveKey, InitialConfigPrimitive> _initialConfigPrimitive;
        private final Map<MetricsKey, Metrics> _metrics;
        private final Map<TerminateConfigPrimitiveKey, TerminateConfigPrimitive> _terminateConfigPrimitive;
    
        VduConfigurationImpl(VduConfigurationBuilder base) {
            super(base.augmentation);
            this._configMethod = base.getConfigMethod();
            this._configPrimitive = CodeHelpers.emptyToNull(base.getConfigPrimitive());
            this._initialConfigPrimitive = CodeHelpers.emptyToNull(base.getInitialConfigPrimitive());
            this._metrics = CodeHelpers.emptyToNull(base.getMetrics());
            this._terminateConfigPrimitive = CodeHelpers.emptyToNull(base.getTerminateConfigPrimitive());
        }
    
        @Override
        public ConfigMethod getConfigMethod() {
            return _configMethod;
        }
        
        @Override
        public Map<ConfigPrimitiveKey, ConfigPrimitive> getConfigPrimitive() {
            return _configPrimitive;
        }
        
        @Override
        public Map<InitialConfigPrimitiveKey, InitialConfigPrimitive> getInitialConfigPrimitive() {
            return _initialConfigPrimitive;
        }
        
        @Override
        public Map<MetricsKey, Metrics> getMetrics() {
            return _metrics;
        }
        
        @Override
        public Map<TerminateConfigPrimitiveKey, TerminateConfigPrimitive> getTerminateConfigPrimitive() {
            return _terminateConfigPrimitive;
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
            result = prime * result + Objects.hashCode(_configMethod);
            result = prime * result + Objects.hashCode(_configPrimitive);
            result = prime * result + Objects.hashCode(_initialConfigPrimitive);
            result = prime * result + Objects.hashCode(_metrics);
            result = prime * result + Objects.hashCode(_terminateConfigPrimitive);
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
            if (!VduConfiguration.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VduConfiguration other = (VduConfiguration)obj;
            if (!Objects.equals(_configMethod, other.getConfigMethod())) {
                return false;
            }
            if (!Objects.equals(_configPrimitive, other.getConfigPrimitive())) {
                return false;
            }
            if (!Objects.equals(_initialConfigPrimitive, other.getInitialConfigPrimitive())) {
                return false;
            }
            if (!Objects.equals(_metrics, other.getMetrics())) {
                return false;
            }
            if (!Objects.equals(_terminateConfigPrimitive, other.getTerminateConfigPrimitive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduConfigurationImpl otherImpl = (VduConfigurationImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VduConfiguration>>, Augmentation<VduConfiguration>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VduConfiguration");
            CodeHelpers.appendValue(helper, "_configMethod", _configMethod);
            CodeHelpers.appendValue(helper, "_configPrimitive", _configPrimitive);
            CodeHelpers.appendValue(helper, "_initialConfigPrimitive", _initialConfigPrimitive);
            CodeHelpers.appendValue(helper, "_metrics", _metrics);
            CodeHelpers.appendValue(helper, "_terminateConfigPrimitive", _terminateConfigPrimitive);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
