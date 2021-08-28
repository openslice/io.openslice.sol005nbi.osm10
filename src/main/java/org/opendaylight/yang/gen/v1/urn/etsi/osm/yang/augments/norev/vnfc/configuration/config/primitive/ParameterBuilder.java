package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.config.primitive;
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
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.ParameterDataType;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ParameterBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ParameterBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ParameterBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ParameterBuilder, as instances can be freely passed around without
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
 * @see ParameterBuilder
 * @see Builder
 *
 */
public class ParameterBuilder implements Builder<Parameter> {

    private ParameterDataType _dataType;
    private String _defaultValue;
    private String _name;
    private String _parameterPool;
    private Boolean _hidden;
    private Boolean _mandatory;
    private Boolean _readOnly;
    private ParameterKey key;


    Map<Class<? extends Augmentation<Parameter>>, Augmentation<Parameter>> augmentation = Collections.emptyMap();

    public ParameterBuilder() {
    }
    public ParameterBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameter arg) {
        this._name = arg.getName();
        this._dataType = arg.getDataType();
        this._mandatory = arg.isMandatory();
        this._defaultValue = arg.getDefaultValue();
        this._parameterPool = arg.getParameterPool();
        this._readOnly = arg.isReadOnly();
        this._hidden = arg.isHidden();
    }

    public ParameterBuilder(Parameter base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Parameter>>, Augmentation<Parameter>> aug =((AugmentationHolder<Parameter>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._dataType = base.getDataType();
        this._defaultValue = base.getDefaultValue();
        this._parameterPool = base.getParameterPool();
        this._hidden = base.isHidden();
        this._mandatory = base.isMandatory();
        this._readOnly = base.isReadOnly();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameter</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameter) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameter)arg).getName();
            this._dataType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameter)arg).getDataType();
            this._mandatory = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameter)arg).isMandatory();
            this._defaultValue = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameter)arg).getDefaultValue();
            this._parameterPool = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameter)arg).getParameterPool();
            this._readOnly = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameter)arg).isReadOnly();
            this._hidden = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameter)arg).isHidden();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.PrimitiveParameter]");
    }

    public ParameterKey key() {
        return key;
    }
    
    public ParameterDataType getDataType() {
        return _dataType;
    }
    
    public String getDefaultValue() {
        return _defaultValue;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getParameterPool() {
        return _parameterPool;
    }
    
    public Boolean isHidden() {
        return _hidden;
    }
    
    public Boolean isMandatory() {
        return _mandatory;
    }
    
    public Boolean isReadOnly() {
        return _readOnly;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Parameter>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ParameterBuilder withKey(final ParameterKey key) {
        this.key = key;
        return this;
    }
    
    public ParameterBuilder setDataType(final ParameterDataType value) {
        this._dataType = value;
        return this;
    }
    
    public ParameterBuilder setDefaultValue(final String value) {
        this._defaultValue = value;
        return this;
    }
    
    public ParameterBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ParameterBuilder setParameterPool(final String value) {
        this._parameterPool = value;
        return this;
    }
    
    public ParameterBuilder setHidden(final Boolean value) {
        this._hidden = value;
        return this;
    }
    
    public ParameterBuilder setMandatory(final Boolean value) {
        this._mandatory = value;
        return this;
    }
    
    public ParameterBuilder setReadOnly(final Boolean value) {
        this._readOnly = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ParameterBuilder addAugmentation(Augmentation<Parameter> augmentation) {
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
    public ParameterBuilder addAugmentation(Class<? extends Augmentation<Parameter>> augmentationType, Augmentation<Parameter> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ParameterBuilder removeAugmentation(Class<? extends Augmentation<Parameter>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ParameterBuilder doAddAugmentation(Class<? extends Augmentation<Parameter>> augmentationType, Augmentation<Parameter> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Parameter build() {
        return new ParameterImpl(this);
    }

    private static final class ParameterImpl
        extends AbstractAugmentable<Parameter>
        implements Parameter {
    
        private final ParameterDataType _dataType;
        private final String _defaultValue;
        private final String _name;
        private final String _parameterPool;
        private final Boolean _hidden;
        private final Boolean _mandatory;
        private final Boolean _readOnly;
        private final ParameterKey key;
    
        ParameterImpl(ParameterBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ParameterKey(base.getName());
            }
            this._name = key.getName();
            this._dataType = base.getDataType();
            this._defaultValue = base.getDefaultValue();
            this._parameterPool = base.getParameterPool();
            this._hidden = base.isHidden();
            this._mandatory = base.isMandatory();
            this._readOnly = base.isReadOnly();
        }
    
        @Override
        public ParameterKey key() {
            return key;
        }
        
        @Override
        public ParameterDataType getDataType() {
            return _dataType;
        }
        
        @Override
        public String getDefaultValue() {
            return _defaultValue;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getParameterPool() {
            return _parameterPool;
        }
        
        @Override
        public Boolean isHidden() {
            return _hidden;
        }
        
        @Override
        public Boolean isMandatory() {
            return _mandatory;
        }
        
        @Override
        public Boolean isReadOnly() {
            return _readOnly;
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
            result = prime * result + Objects.hashCode(_dataType);
            result = prime * result + Objects.hashCode(_defaultValue);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameterPool);
            result = prime * result + Objects.hashCode(_hidden);
            result = prime * result + Objects.hashCode(_mandatory);
            result = prime * result + Objects.hashCode(_readOnly);
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
            if (!Parameter.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Parameter other = (Parameter)obj;
            if (!Objects.equals(_dataType, other.getDataType())) {
                return false;
            }
            if (!Objects.equals(_defaultValue, other.getDefaultValue())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameterPool, other.getParameterPool())) {
                return false;
            }
            if (!Objects.equals(_hidden, other.isHidden())) {
                return false;
            }
            if (!Objects.equals(_mandatory, other.isMandatory())) {
                return false;
            }
            if (!Objects.equals(_readOnly, other.isReadOnly())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ParameterImpl otherImpl = (ParameterImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Parameter>>, Augmentation<Parameter>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Parameter");
            CodeHelpers.appendValue(helper, "_dataType", _dataType);
            CodeHelpers.appendValue(helper, "_defaultValue", _defaultValue);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameterPool", _parameterPool);
            CodeHelpers.appendValue(helper, "_hidden", _hidden);
            CodeHelpers.appendValue(helper, "_mandatory", _mandatory);
            CodeHelpers.appendValue(helper, "_readOnly", _readOnly);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
