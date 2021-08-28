package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.input.ParameterGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.input.ParameterGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.input.VnfList;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.input.VnfListKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ExecNsConfigPrimitiveInputBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ExecNsConfigPrimitiveInputBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ExecNsConfigPrimitiveInputBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ExecNsConfigPrimitiveInputBuilder, as instances can be freely passed around without
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
 * @see ExecNsConfigPrimitiveInputBuilder
 * @see Builder
 *
 */
public class ExecNsConfigPrimitiveInputBuilder implements Builder<ExecNsConfigPrimitiveInput> {

    private String _name;
    private Object _nsrIdRef;
    private Map<ParameterKey, Parameter> _parameter;
    private Map<ParameterGroupKey, ParameterGroup> _parameterGroup;
    private String _projectName;
    private TriggerType _triggeredBy;
    private String _userDefinedScript;
    private Map<VnfListKey, VnfList> _vnfList;


    Map<Class<? extends Augmentation<ExecNsConfigPrimitiveInput>>, Augmentation<ExecNsConfigPrimitiveInput>> augmentation = Collections.emptyMap();

    public ExecNsConfigPrimitiveInputBuilder() {
    }
    public ExecNsConfigPrimitiveInputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon arg) {
        this._nsrIdRef = arg.getNsrIdRef();
        this._projectName = arg.getProjectName();
    }
    public ExecNsConfigPrimitiveInputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }
    public ExecNsConfigPrimitiveInputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public ExecNsConfigPrimitiveInputBuilder(ExecNsConfigPrimitiveInput base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ExecNsConfigPrimitiveInput>>, Augmentation<ExecNsConfigPrimitiveInput>> aug =((AugmentationHolder<ExecNsConfigPrimitiveInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._name = base.getName();
        this._nsrIdRef = base.getNsrIdRef();
        this._parameter = base.getParameter();
        this._parameterGroup = base.getParameterGroup();
        this._projectName = base.getProjectName();
        this._triggeredBy = base.getTriggeredBy();
        this._userDefinedScript = base.getUserDefinedScript();
        this._vnfList = base.getVnfList();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName) {
            this._projectName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName)arg).getProjectName();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon) {
            this._nsrIdRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon)arg).getNsrIdRef();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon]");
    }

    public String getName() {
        return _name;
    }
    
    public Object getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public Map<ParameterKey, Parameter> getParameter() {
        return _parameter;
    }
    
    public Map<ParameterGroupKey, ParameterGroup> getParameterGroup() {
        return _parameterGroup;
    }
    
    public String getProjectName() {
        return _projectName;
    }
    
    public TriggerType getTriggeredBy() {
        return _triggeredBy;
    }
    
    public String getUserDefinedScript() {
        return _userDefinedScript;
    }
    
    public Map<VnfListKey, VnfList> getVnfList() {
        return _vnfList;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ExecNsConfigPrimitiveInput>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public ExecNsConfigPrimitiveInputBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ExecNsConfigPrimitiveInputBuilder setNsrIdRef(final Object value) {
        this._nsrIdRef = value;
        return this;
    }
    public ExecNsConfigPrimitiveInputBuilder setParameter(final Map<ParameterKey, Parameter> values) {
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
    public ExecNsConfigPrimitiveInputBuilder setParameter(final List<Parameter> values) {
        return setParameter(CodeHelpers.compatMap(values));
    }
    public ExecNsConfigPrimitiveInputBuilder setParameterGroup(final Map<ParameterGroupKey, ParameterGroup> values) {
        this._parameterGroup = values;
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
      * @deprecated Use {#link #setParameterGroup(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ExecNsConfigPrimitiveInputBuilder setParameterGroup(final List<ParameterGroup> values) {
        return setParameterGroup(CodeHelpers.compatMap(values));
    }
    
    private static void check_projectNameLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 255) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..255]]", value);
    }
    
    public ExecNsConfigPrimitiveInputBuilder setProjectName(final String value) {
        if (value != null) {
            check_projectNameLength(value);
            
        }
        this._projectName = value;
        return this;
    }
    
    public ExecNsConfigPrimitiveInputBuilder setTriggeredBy(final TriggerType value) {
        this._triggeredBy = value;
        return this;
    }
    
    public ExecNsConfigPrimitiveInputBuilder setUserDefinedScript(final String value) {
        this._userDefinedScript = value;
        return this;
    }
    public ExecNsConfigPrimitiveInputBuilder setVnfList(final Map<VnfListKey, VnfList> values) {
        this._vnfList = values;
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
      * @deprecated Use {#link #setVnfList(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ExecNsConfigPrimitiveInputBuilder setVnfList(final List<VnfList> values) {
        return setVnfList(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ExecNsConfigPrimitiveInputBuilder addAugmentation(Augmentation<ExecNsConfigPrimitiveInput> augmentation) {
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
    public ExecNsConfigPrimitiveInputBuilder addAugmentation(Class<? extends Augmentation<ExecNsConfigPrimitiveInput>> augmentationType, Augmentation<ExecNsConfigPrimitiveInput> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ExecNsConfigPrimitiveInputBuilder removeAugmentation(Class<? extends Augmentation<ExecNsConfigPrimitiveInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ExecNsConfigPrimitiveInputBuilder doAddAugmentation(Class<? extends Augmentation<ExecNsConfigPrimitiveInput>> augmentationType, Augmentation<ExecNsConfigPrimitiveInput> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ExecNsConfigPrimitiveInput build() {
        return new ExecNsConfigPrimitiveInputImpl(this);
    }

    private static final class ExecNsConfigPrimitiveInputImpl
        extends AbstractAugmentable<ExecNsConfigPrimitiveInput>
        implements ExecNsConfigPrimitiveInput {
    
        private final String _name;
        private final Object _nsrIdRef;
        private final Map<ParameterKey, Parameter> _parameter;
        private final Map<ParameterGroupKey, ParameterGroup> _parameterGroup;
        private final String _projectName;
        private final TriggerType _triggeredBy;
        private final String _userDefinedScript;
        private final Map<VnfListKey, VnfList> _vnfList;
    
        ExecNsConfigPrimitiveInputImpl(ExecNsConfigPrimitiveInputBuilder base) {
            super(base.augmentation);
            this._name = base.getName();
            this._nsrIdRef = base.getNsrIdRef();
            this._parameter = CodeHelpers.emptyToNull(base.getParameter());
            this._parameterGroup = CodeHelpers.emptyToNull(base.getParameterGroup());
            this._projectName = base.getProjectName();
            this._triggeredBy = base.getTriggeredBy();
            this._userDefinedScript = base.getUserDefinedScript();
            this._vnfList = CodeHelpers.emptyToNull(base.getVnfList());
        }
    
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Object getNsrIdRef() {
            return _nsrIdRef;
        }
        
        @Override
        public Map<ParameterKey, Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public Map<ParameterGroupKey, ParameterGroup> getParameterGroup() {
            return _parameterGroup;
        }
        
        @Override
        public String getProjectName() {
            return _projectName;
        }
        
        @Override
        public TriggerType getTriggeredBy() {
            return _triggeredBy;
        }
        
        @Override
        public String getUserDefinedScript() {
            return _userDefinedScript;
        }
        
        @Override
        public Map<VnfListKey, VnfList> getVnfList() {
            return _vnfList;
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
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_parameterGroup);
            result = prime * result + Objects.hashCode(_projectName);
            result = prime * result + Objects.hashCode(_triggeredBy);
            result = prime * result + Objects.hashCode(_userDefinedScript);
            result = prime * result + Objects.hashCode(_vnfList);
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
            if (!ExecNsConfigPrimitiveInput.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ExecNsConfigPrimitiveInput other = (ExecNsConfigPrimitiveInput)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_parameterGroup, other.getParameterGroup())) {
                return false;
            }
            if (!Objects.equals(_projectName, other.getProjectName())) {
                return false;
            }
            if (!Objects.equals(_triggeredBy, other.getTriggeredBy())) {
                return false;
            }
            if (!Objects.equals(_userDefinedScript, other.getUserDefinedScript())) {
                return false;
            }
            if (!Objects.equals(_vnfList, other.getVnfList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExecNsConfigPrimitiveInputImpl otherImpl = (ExecNsConfigPrimitiveInputImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ExecNsConfigPrimitiveInput>>, Augmentation<ExecNsConfigPrimitiveInput>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ExecNsConfigPrimitiveInput");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsrIdRef", _nsrIdRef);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_parameterGroup", _parameterGroup);
            CodeHelpers.appendValue(helper, "_projectName", _projectName);
            CodeHelpers.appendValue(helper, "_triggeredBy", _triggeredBy);
            CodeHelpers.appendValue(helper, "_userDefinedScript", _userDefinedScript);
            CodeHelpers.appendValue(helper, "_vnfList", _vnfList);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
