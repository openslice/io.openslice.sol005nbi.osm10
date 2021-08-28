package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.primitive.parameter.value.Parameter;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.primitive.parameter.value.ParameterKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link PrimitiveDefinitionBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     PrimitiveDefinitionBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new PrimitiveDefinitionBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of PrimitiveDefinitionBuilder, as instances can be freely passed around without
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
 * @see PrimitiveDefinitionBuilder
 * @see Builder
 *
 */
public class PrimitiveDefinitionBuilder implements Builder<PrimitiveDefinition> {

    private Object _executionEnvironmentRef;
    private String _name;
    private Map<ParameterKey, Parameter> _parameter;
    private String _userDefinedScript;


    Map<Class<? extends Augmentation<PrimitiveDefinition>>, Augmentation<PrimitiveDefinition>> augmentation = Collections.emptyMap();

    public PrimitiveDefinitionBuilder() {
    }
    public PrimitiveDefinitionBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public PrimitiveDefinitionBuilder(PrimitiveDefinition base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<PrimitiveDefinition>>, Augmentation<PrimitiveDefinition>> aug =((AugmentationHolder<PrimitiveDefinition>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._executionEnvironmentRef = base.getExecutionEnvironmentRef();
        this._name = base.getName();
        this._parameter = base.getParameter();
        this._userDefinedScript = base.getUserDefinedScript();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue) {
            this._parameter = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue)arg).getParameter();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue]");
    }

    public Object getExecutionEnvironmentRef() {
        return _executionEnvironmentRef;
    }
    
    public String getName() {
        return _name;
    }
    
    public Map<ParameterKey, Parameter> getParameter() {
        return _parameter;
    }
    
    public String getUserDefinedScript() {
        return _userDefinedScript;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<PrimitiveDefinition>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public PrimitiveDefinitionBuilder setExecutionEnvironmentRef(final Object value) {
        this._executionEnvironmentRef = value;
        return this;
    }
    
    public PrimitiveDefinitionBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public PrimitiveDefinitionBuilder setParameter(final Map<ParameterKey, Parameter> values) {
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
    public PrimitiveDefinitionBuilder setParameter(final List<Parameter> values) {
        return setParameter(CodeHelpers.compatMap(values));
    }
    
    public PrimitiveDefinitionBuilder setUserDefinedScript(final String value) {
        this._userDefinedScript = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public PrimitiveDefinitionBuilder addAugmentation(Augmentation<PrimitiveDefinition> augmentation) {
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
    public PrimitiveDefinitionBuilder addAugmentation(Class<? extends Augmentation<PrimitiveDefinition>> augmentationType, Augmentation<PrimitiveDefinition> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public PrimitiveDefinitionBuilder removeAugmentation(Class<? extends Augmentation<PrimitiveDefinition>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private PrimitiveDefinitionBuilder doAddAugmentation(Class<? extends Augmentation<PrimitiveDefinition>> augmentationType, Augmentation<PrimitiveDefinition> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public PrimitiveDefinition build() {
        return new PrimitiveDefinitionImpl(this);
    }

    private static final class PrimitiveDefinitionImpl
        extends AbstractAugmentable<PrimitiveDefinition>
        implements PrimitiveDefinition {
    
        private final Object _executionEnvironmentRef;
        private final String _name;
        private final Map<ParameterKey, Parameter> _parameter;
        private final String _userDefinedScript;
    
        PrimitiveDefinitionImpl(PrimitiveDefinitionBuilder base) {
            super(base.augmentation);
            this._executionEnvironmentRef = base.getExecutionEnvironmentRef();
            this._name = base.getName();
            this._parameter = CodeHelpers.emptyToNull(base.getParameter());
            this._userDefinedScript = base.getUserDefinedScript();
        }
    
        @Override
        public Object getExecutionEnvironmentRef() {
            return _executionEnvironmentRef;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Map<ParameterKey, Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public String getUserDefinedScript() {
            return _userDefinedScript;
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
            result = prime * result + Objects.hashCode(_executionEnvironmentRef);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_userDefinedScript);
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
            if (!PrimitiveDefinition.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            PrimitiveDefinition other = (PrimitiveDefinition)obj;
            if (!Objects.equals(_executionEnvironmentRef, other.getExecutionEnvironmentRef())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_userDefinedScript, other.getUserDefinedScript())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PrimitiveDefinitionImpl otherImpl = (PrimitiveDefinitionImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<PrimitiveDefinition>>, Augmentation<PrimitiveDefinition>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("PrimitiveDefinition");
            CodeHelpers.appendValue(helper, "_executionEnvironmentRef", _executionEnvironmentRef);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_userDefinedScript", _userDefinedScript);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
