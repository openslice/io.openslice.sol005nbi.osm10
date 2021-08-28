package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.extended.vnf.configuration;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.ConfigMethod;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vdu.config.access.ConfigAccess;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.ConfigPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.ConfigPrimitiveKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.InitialConfigPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.InitialConfigPrimitiveKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.TerminateConfigPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.TerminateConfigPrimitiveKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.metrics.Metrics;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.metrics.MetricsKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.relations.Relation;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.relations.RelationKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Day12Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     Day12Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new Day12BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of Day12Builder, as instances can be freely passed around without
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
 * @see Day12Builder
 * @see Builder
 *
 */
public class Day12Builder implements Builder<Day12> {

    private List<Day12.BlacklistConfigPrimitive> _blacklistConfigPrimitive;
    private ConfigAccess _configAccess;
    private ConfigMethod _configMethod;
    private Map<ConfigPrimitiveKey, ConfigPrimitive> _configPrimitive;
    private String _id;
    private Map<InitialConfigPrimitiveKey, InitialConfigPrimitive> _initialConfigPrimitive;
    private Map<MetricsKey, Metrics> _metrics;
    private Map<RelationKey, Relation> _relation;
    private Map<TerminateConfigPrimitiveKey, TerminateConfigPrimitive> _terminateConfigPrimitive;
    private Day12Key key;


    Map<Class<? extends Augmentation<Day12>>, Augmentation<Day12>> augmentation = Collections.emptyMap();

    public Day12Builder() {
    }
    public Day12Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcConfiguration arg) {
        this._configPrimitive = arg.getConfigPrimitive();
        this._initialConfigPrimitive = arg.getInitialConfigPrimitive();
        this._terminateConfigPrimitive = arg.getTerminateConfigPrimitive();
        this._configMethod = arg.getConfigMethod();
        this._metrics = arg.getMetrics();
    }
    public Day12Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.ConfigurationMethod arg) {
        this._configMethod = arg.getConfigMethod();
    }
    public Day12Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcMetrics arg) {
        this._metrics = arg.getMetrics();
    }
    public Day12Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcRelations arg) {
        this._relation = arg.getRelation();
    }
    public Day12Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VduConfigAccess arg) {
        this._configAccess = arg.getConfigAccess();
    }

    public Day12Builder(Day12 base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Day12>>, Augmentation<Day12>> aug =((AugmentationHolder<Day12>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._blacklistConfigPrimitive = base.getBlacklistConfigPrimitive();
        this._configAccess = base.getConfigAccess();
        this._configMethod = base.getConfigMethod();
        this._configPrimitive = base.getConfigPrimitive();
        this._initialConfigPrimitive = base.getInitialConfigPrimitive();
        this._metrics = base.getMetrics();
        this._relation = base.getRelation();
        this._terminateConfigPrimitive = base.getTerminateConfigPrimitive();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcMetrics</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.ConfigurationMethod</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcRelations</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcConfiguration</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VduConfigAccess</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcMetrics) {
            this._metrics = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcMetrics)arg).getMetrics();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.ConfigurationMethod) {
            this._configMethod = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.ConfigurationMethod)arg).getConfigMethod();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcRelations) {
            this._relation = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcRelations)arg).getRelation();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcConfiguration) {
            this._configPrimitive = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcConfiguration)arg).getConfigPrimitive();
            this._initialConfigPrimitive = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcConfiguration)arg).getInitialConfigPrimitive();
            this._terminateConfigPrimitive = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcConfiguration)arg).getTerminateConfigPrimitive();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VduConfigAccess) {
            this._configAccess = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VduConfigAccess)arg).getConfigAccess();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcMetrics, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.ConfigurationMethod, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcRelations, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcConfiguration, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VduConfigAccess]");
    }

    public Day12Key key() {
        return key;
    }
    
    public List<Day12.BlacklistConfigPrimitive> getBlacklistConfigPrimitive() {
        return _blacklistConfigPrimitive;
    }
    
    public ConfigAccess getConfigAccess() {
        return _configAccess;
    }
    
    public ConfigMethod getConfigMethod() {
        return _configMethod;
    }
    
    public Map<ConfigPrimitiveKey, ConfigPrimitive> getConfigPrimitive() {
        return _configPrimitive;
    }
    
    public String getId() {
        return _id;
    }
    
    public Map<InitialConfigPrimitiveKey, InitialConfigPrimitive> getInitialConfigPrimitive() {
        return _initialConfigPrimitive;
    }
    
    public Map<MetricsKey, Metrics> getMetrics() {
        return _metrics;
    }
    
    public Map<RelationKey, Relation> getRelation() {
        return _relation;
    }
    
    public Map<TerminateConfigPrimitiveKey, TerminateConfigPrimitive> getTerminateConfigPrimitive() {
        return _terminateConfigPrimitive;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Day12>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public Day12Builder withKey(final Day12Key key) {
        this.key = key;
        return this;
    }
    public Day12Builder setBlacklistConfigPrimitive(final List<Day12.BlacklistConfigPrimitive> values) {
        this._blacklistConfigPrimitive = values;
        return this;
    }
    
    
    public Day12Builder setConfigAccess(final ConfigAccess value) {
        this._configAccess = value;
        return this;
    }
    
    public Day12Builder setConfigMethod(final ConfigMethod value) {
        this._configMethod = value;
        return this;
    }
    public Day12Builder setConfigPrimitive(final Map<ConfigPrimitiveKey, ConfigPrimitive> values) {
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
    public Day12Builder setConfigPrimitive(final List<ConfigPrimitive> values) {
        return setConfigPrimitive(CodeHelpers.compatMap(values));
    }
    
    public Day12Builder setId(final String value) {
        this._id = value;
        return this;
    }
    public Day12Builder setInitialConfigPrimitive(final Map<InitialConfigPrimitiveKey, InitialConfigPrimitive> values) {
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
    public Day12Builder setInitialConfigPrimitive(final List<InitialConfigPrimitive> values) {
        return setInitialConfigPrimitive(CodeHelpers.compatMap(values));
    }
    public Day12Builder setMetrics(final Map<MetricsKey, Metrics> values) {
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
    public Day12Builder setMetrics(final List<Metrics> values) {
        return setMetrics(CodeHelpers.compatMap(values));
    }
    public Day12Builder setRelation(final Map<RelationKey, Relation> values) {
        this._relation = values;
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
      * @deprecated Use {#link #setRelation(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public Day12Builder setRelation(final List<Relation> values) {
        return setRelation(CodeHelpers.compatMap(values));
    }
    public Day12Builder setTerminateConfigPrimitive(final Map<TerminateConfigPrimitiveKey, TerminateConfigPrimitive> values) {
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
    public Day12Builder setTerminateConfigPrimitive(final List<TerminateConfigPrimitive> values) {
        return setTerminateConfigPrimitive(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public Day12Builder addAugmentation(Augmentation<Day12> augmentation) {
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
    public Day12Builder addAugmentation(Class<? extends Augmentation<Day12>> augmentationType, Augmentation<Day12> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public Day12Builder removeAugmentation(Class<? extends Augmentation<Day12>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private Day12Builder doAddAugmentation(Class<? extends Augmentation<Day12>> augmentationType, Augmentation<Day12> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Day12 build() {
        return new Day12Impl(this);
    }

    private static final class Day12Impl
        extends AbstractAugmentable<Day12>
        implements Day12 {
    
        private final List<Day12.BlacklistConfigPrimitive> _blacklistConfigPrimitive;
        private final ConfigAccess _configAccess;
        private final ConfigMethod _configMethod;
        private final Map<ConfigPrimitiveKey, ConfigPrimitive> _configPrimitive;
        private final String _id;
        private final Map<InitialConfigPrimitiveKey, InitialConfigPrimitive> _initialConfigPrimitive;
        private final Map<MetricsKey, Metrics> _metrics;
        private final Map<RelationKey, Relation> _relation;
        private final Map<TerminateConfigPrimitiveKey, TerminateConfigPrimitive> _terminateConfigPrimitive;
        private final Day12Key key;
    
        Day12Impl(Day12Builder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new Day12Key(base.getId());
            }
            this._id = key.getId();
            this._blacklistConfigPrimitive = base.getBlacklistConfigPrimitive();
            this._configAccess = base.getConfigAccess();
            this._configMethod = base.getConfigMethod();
            this._configPrimitive = CodeHelpers.emptyToNull(base.getConfigPrimitive());
            this._initialConfigPrimitive = CodeHelpers.emptyToNull(base.getInitialConfigPrimitive());
            this._metrics = CodeHelpers.emptyToNull(base.getMetrics());
            this._relation = CodeHelpers.emptyToNull(base.getRelation());
            this._terminateConfigPrimitive = CodeHelpers.emptyToNull(base.getTerminateConfigPrimitive());
        }
    
        @Override
        public Day12Key key() {
            return key;
        }
        
        @Override
        public List<Day12.BlacklistConfigPrimitive> getBlacklistConfigPrimitive() {
            return _blacklistConfigPrimitive;
        }
        
        @Override
        public ConfigAccess getConfigAccess() {
            return _configAccess;
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
        public String getId() {
            return _id;
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
        public Map<RelationKey, Relation> getRelation() {
            return _relation;
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
            result = prime * result + Objects.hashCode(_blacklistConfigPrimitive);
            result = prime * result + Objects.hashCode(_configAccess);
            result = prime * result + Objects.hashCode(_configMethod);
            result = prime * result + Objects.hashCode(_configPrimitive);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_initialConfigPrimitive);
            result = prime * result + Objects.hashCode(_metrics);
            result = prime * result + Objects.hashCode(_relation);
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
            if (!Day12.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Day12 other = (Day12)obj;
            if (!Objects.equals(_blacklistConfigPrimitive, other.getBlacklistConfigPrimitive())) {
                return false;
            }
            if (!Objects.equals(_configAccess, other.getConfigAccess())) {
                return false;
            }
            if (!Objects.equals(_configMethod, other.getConfigMethod())) {
                return false;
            }
            if (!Objects.equals(_configPrimitive, other.getConfigPrimitive())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_initialConfigPrimitive, other.getInitialConfigPrimitive())) {
                return false;
            }
            if (!Objects.equals(_metrics, other.getMetrics())) {
                return false;
            }
            if (!Objects.equals(_relation, other.getRelation())) {
                return false;
            }
            if (!Objects.equals(_terminateConfigPrimitive, other.getTerminateConfigPrimitive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                Day12Impl otherImpl = (Day12Impl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Day12>>, Augmentation<Day12>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Day12");
            CodeHelpers.appendValue(helper, "_blacklistConfigPrimitive", _blacklistConfigPrimitive);
            CodeHelpers.appendValue(helper, "_configAccess", _configAccess);
            CodeHelpers.appendValue(helper, "_configMethod", _configMethod);
            CodeHelpers.appendValue(helper, "_configPrimitive", _configPrimitive);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_initialConfigPrimitive", _initialConfigPrimitive);
            CodeHelpers.appendValue(helper, "_metrics", _metrics);
            CodeHelpers.appendValue(helper, "_relation", _relation);
            CodeHelpers.appendValue(helper, "_terminateConfigPrimitive", _terminateConfigPrimitive);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
