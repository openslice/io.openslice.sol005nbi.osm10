package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
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
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link TerminateConfigPrimitiveBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     TerminateConfigPrimitiveBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new TerminateConfigPrimitiveBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of TerminateConfigPrimitiveBuilder, as instances can be freely passed around without
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
 * @see TerminateConfigPrimitiveBuilder
 * @see Builder
 *
 */
public class TerminateConfigPrimitiveBuilder implements Builder<TerminateConfigPrimitive> {

    private Object _executionEnvironmentRef;
    private String _name;
    private Map<ParameterKey, Parameter> _parameter;
    private Uint64 _seq;
    private String _userDefinedScript;
    private TerminateConfigPrimitiveKey key;


    Map<Class<? extends Augmentation<TerminateConfigPrimitive>>, Augmentation<TerminateConfigPrimitive>> augmentation = Collections.emptyMap();

    public TerminateConfigPrimitiveBuilder() {
    }
    public TerminateConfigPrimitiveBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public TerminateConfigPrimitiveBuilder(TerminateConfigPrimitive base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<TerminateConfigPrimitive>>, Augmentation<TerminateConfigPrimitive>> aug =((AugmentationHolder<TerminateConfigPrimitive>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._seq = base.getSeq();
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

    public TerminateConfigPrimitiveKey key() {
        return key;
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
    
    public Uint64 getSeq() {
        return _seq;
    }
    
    public String getUserDefinedScript() {
        return _userDefinedScript;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<TerminateConfigPrimitive>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public TerminateConfigPrimitiveBuilder withKey(final TerminateConfigPrimitiveKey key) {
        this.key = key;
        return this;
    }
    
    public TerminateConfigPrimitiveBuilder setExecutionEnvironmentRef(final Object value) {
        this._executionEnvironmentRef = value;
        return this;
    }
    
    public TerminateConfigPrimitiveBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public TerminateConfigPrimitiveBuilder setParameter(final Map<ParameterKey, Parameter> values) {
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
    public TerminateConfigPrimitiveBuilder setParameter(final List<Parameter> values) {
        return setParameter(CodeHelpers.compatMap(values));
    }
    
    public TerminateConfigPrimitiveBuilder setSeq(final Uint64 value) {
        this._seq = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setSeq(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public TerminateConfigPrimitiveBuilder setSeq(final BigInteger value) {
        return setSeq(CodeHelpers.compatUint(value));
    }
    
    public TerminateConfigPrimitiveBuilder setUserDefinedScript(final String value) {
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
    public TerminateConfigPrimitiveBuilder addAugmentation(Augmentation<TerminateConfigPrimitive> augmentation) {
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
    public TerminateConfigPrimitiveBuilder addAugmentation(Class<? extends Augmentation<TerminateConfigPrimitive>> augmentationType, Augmentation<TerminateConfigPrimitive> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public TerminateConfigPrimitiveBuilder removeAugmentation(Class<? extends Augmentation<TerminateConfigPrimitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private TerminateConfigPrimitiveBuilder doAddAugmentation(Class<? extends Augmentation<TerminateConfigPrimitive>> augmentationType, Augmentation<TerminateConfigPrimitive> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public TerminateConfigPrimitive build() {
        return new TerminateConfigPrimitiveImpl(this);
    }

    private static final class TerminateConfigPrimitiveImpl
        extends AbstractAugmentable<TerminateConfigPrimitive>
        implements TerminateConfigPrimitive {
    
        private final Object _executionEnvironmentRef;
        private final String _name;
        private final Map<ParameterKey, Parameter> _parameter;
        private final Uint64 _seq;
        private final String _userDefinedScript;
        private final TerminateConfigPrimitiveKey key;
    
        TerminateConfigPrimitiveImpl(TerminateConfigPrimitiveBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new TerminateConfigPrimitiveKey(base.getSeq());
            }
            this._seq = key.getSeq();
            this._executionEnvironmentRef = base.getExecutionEnvironmentRef();
            this._name = base.getName();
            this._parameter = CodeHelpers.emptyToNull(base.getParameter());
            this._userDefinedScript = base.getUserDefinedScript();
        }
    
        @Override
        public TerminateConfigPrimitiveKey key() {
            return key;
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
        public Uint64 getSeq() {
            return _seq;
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
            result = prime * result + Objects.hashCode(_seq);
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
            if (!TerminateConfigPrimitive.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            TerminateConfigPrimitive other = (TerminateConfigPrimitive)obj;
            if (!Objects.equals(_executionEnvironmentRef, other.getExecutionEnvironmentRef())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_seq, other.getSeq())) {
                return false;
            }
            if (!Objects.equals(_userDefinedScript, other.getUserDefinedScript())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TerminateConfigPrimitiveImpl otherImpl = (TerminateConfigPrimitiveImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<TerminateConfigPrimitive>>, Augmentation<TerminateConfigPrimitive>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("TerminateConfigPrimitive");
            CodeHelpers.appendValue(helper, "_executionEnvironmentRef", _executionEnvironmentRef);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_seq", _seq);
            CodeHelpers.appendValue(helper, "_userDefinedScript", _userDefinedScript);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
