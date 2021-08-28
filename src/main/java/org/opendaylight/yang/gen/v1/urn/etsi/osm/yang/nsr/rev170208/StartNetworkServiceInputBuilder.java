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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.InputParameter;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.InputParameterKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMapsKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.ScalingGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMapsKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link StartNetworkServiceInputBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     StartNetworkServiceInputBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new StartNetworkServiceInputBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of StartNetworkServiceInputBuilder, as instances can be freely passed around without
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
 * @see StartNetworkServiceInputBuilder
 * @see Builder
 *
 */
public class StartNetworkServiceInputBuilder implements Builder<StartNetworkServiceInput> {

    private Map<InputParameterKey, InputParameter> _inputParameter;
    private String _name;
    private Object _nsdIdRef;
    private Map<NsdPlacementGroupMapsKey, NsdPlacementGroupMaps> _nsdPlacementGroupMaps;
    private String _projectName;
    private Map<ScalingGroupKey, ScalingGroup> _scalingGroup;
    private Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> _vnfdPlacementGroupMaps;


    Map<Class<? extends Augmentation<StartNetworkServiceInput>>, Augmentation<StartNetworkServiceInput>> augmentation = Collections.emptyMap();

    public StartNetworkServiceInputBuilder() {
    }
    public StartNetworkServiceInputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }
    public StartNetworkServiceInputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon arg) {
        this._scalingGroup = arg.getScalingGroup();
        this._nsdPlacementGroupMaps = arg.getNsdPlacementGroupMaps();
        this._inputParameter = arg.getInputParameter();
    }
    public StartNetworkServiceInputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameter arg) {
        this._inputParameter = arg.getInputParameter();
    }

    public StartNetworkServiceInputBuilder(StartNetworkServiceInput base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<StartNetworkServiceInput>>, Augmentation<StartNetworkServiceInput>> aug =((AugmentationHolder<StartNetworkServiceInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._inputParameter = base.getInputParameter();
        this._name = base.getName();
        this._nsdIdRef = base.getNsdIdRef();
        this._nsdPlacementGroupMaps = base.getNsdPlacementGroupMaps();
        this._projectName = base.getProjectName();
        this._scalingGroup = base.getScalingGroup();
        this._vnfdPlacementGroupMaps = base.getVnfdPlacementGroupMaps();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameter</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName) {
            this._projectName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName)arg).getProjectName();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon) {
            this._scalingGroup = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon)arg).getScalingGroup();
            this._nsdPlacementGroupMaps = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon)arg).getNsdPlacementGroupMaps();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameter) {
            this._inputParameter = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameter)arg).getInputParameter();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameter]");
    }

    public Map<InputParameterKey, InputParameter> getInputParameter() {
        return _inputParameter;
    }
    
    public String getName() {
        return _name;
    }
    
    public Object getNsdIdRef() {
        return _nsdIdRef;
    }
    
    public Map<NsdPlacementGroupMapsKey, NsdPlacementGroupMaps> getNsdPlacementGroupMaps() {
        return _nsdPlacementGroupMaps;
    }
    
    public String getProjectName() {
        return _projectName;
    }
    
    public Map<ScalingGroupKey, ScalingGroup> getScalingGroup() {
        return _scalingGroup;
    }
    
    public Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps() {
        return _vnfdPlacementGroupMaps;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<StartNetworkServiceInput>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public StartNetworkServiceInputBuilder setInputParameter(final Map<InputParameterKey, InputParameter> values) {
        this._inputParameter = values;
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
      * @deprecated Use {#link #setInputParameter(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public StartNetworkServiceInputBuilder setInputParameter(final List<InputParameter> values) {
        return setInputParameter(CodeHelpers.compatMap(values));
    }
    
    public StartNetworkServiceInputBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public StartNetworkServiceInputBuilder setNsdIdRef(final Object value) {
        this._nsdIdRef = value;
        return this;
    }
    public StartNetworkServiceInputBuilder setNsdPlacementGroupMaps(final Map<NsdPlacementGroupMapsKey, NsdPlacementGroupMaps> values) {
        this._nsdPlacementGroupMaps = values;
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
      * @deprecated Use {#link #setNsdPlacementGroupMaps(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public StartNetworkServiceInputBuilder setNsdPlacementGroupMaps(final List<NsdPlacementGroupMaps> values) {
        return setNsdPlacementGroupMaps(CodeHelpers.compatMap(values));
    }
    
    private static void check_projectNameLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 255) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..255]]", value);
    }
    
    public StartNetworkServiceInputBuilder setProjectName(final String value) {
        if (value != null) {
            check_projectNameLength(value);
            
        }
        this._projectName = value;
        return this;
    }
    public StartNetworkServiceInputBuilder setScalingGroup(final Map<ScalingGroupKey, ScalingGroup> values) {
        this._scalingGroup = values;
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
      * @deprecated Use {#link #setScalingGroup(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public StartNetworkServiceInputBuilder setScalingGroup(final List<ScalingGroup> values) {
        return setScalingGroup(CodeHelpers.compatMap(values));
    }
    public StartNetworkServiceInputBuilder setVnfdPlacementGroupMaps(final Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> values) {
        this._vnfdPlacementGroupMaps = values;
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
      * @deprecated Use {#link #setVnfdPlacementGroupMaps(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public StartNetworkServiceInputBuilder setVnfdPlacementGroupMaps(final List<VnfdPlacementGroupMaps> values) {
        return setVnfdPlacementGroupMaps(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public StartNetworkServiceInputBuilder addAugmentation(Augmentation<StartNetworkServiceInput> augmentation) {
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
    public StartNetworkServiceInputBuilder addAugmentation(Class<? extends Augmentation<StartNetworkServiceInput>> augmentationType, Augmentation<StartNetworkServiceInput> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public StartNetworkServiceInputBuilder removeAugmentation(Class<? extends Augmentation<StartNetworkServiceInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private StartNetworkServiceInputBuilder doAddAugmentation(Class<? extends Augmentation<StartNetworkServiceInput>> augmentationType, Augmentation<StartNetworkServiceInput> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public StartNetworkServiceInput build() {
        return new StartNetworkServiceInputImpl(this);
    }

    private static final class StartNetworkServiceInputImpl
        extends AbstractAugmentable<StartNetworkServiceInput>
        implements StartNetworkServiceInput {
    
        private final Map<InputParameterKey, InputParameter> _inputParameter;
        private final String _name;
        private final Object _nsdIdRef;
        private final Map<NsdPlacementGroupMapsKey, NsdPlacementGroupMaps> _nsdPlacementGroupMaps;
        private final String _projectName;
        private final Map<ScalingGroupKey, ScalingGroup> _scalingGroup;
        private final Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> _vnfdPlacementGroupMaps;
    
        StartNetworkServiceInputImpl(StartNetworkServiceInputBuilder base) {
            super(base.augmentation);
            this._inputParameter = CodeHelpers.emptyToNull(base.getInputParameter());
            this._name = base.getName();
            this._nsdIdRef = base.getNsdIdRef();
            this._nsdPlacementGroupMaps = CodeHelpers.emptyToNull(base.getNsdPlacementGroupMaps());
            this._projectName = base.getProjectName();
            this._scalingGroup = CodeHelpers.emptyToNull(base.getScalingGroup());
            this._vnfdPlacementGroupMaps = CodeHelpers.emptyToNull(base.getVnfdPlacementGroupMaps());
        }
    
        @Override
        public Map<InputParameterKey, InputParameter> getInputParameter() {
            return _inputParameter;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Object getNsdIdRef() {
            return _nsdIdRef;
        }
        
        @Override
        public Map<NsdPlacementGroupMapsKey, NsdPlacementGroupMaps> getNsdPlacementGroupMaps() {
            return _nsdPlacementGroupMaps;
        }
        
        @Override
        public String getProjectName() {
            return _projectName;
        }
        
        @Override
        public Map<ScalingGroupKey, ScalingGroup> getScalingGroup() {
            return _scalingGroup;
        }
        
        @Override
        public Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps() {
            return _vnfdPlacementGroupMaps;
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
            result = prime * result + Objects.hashCode(_inputParameter);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsdIdRef);
            result = prime * result + Objects.hashCode(_nsdPlacementGroupMaps);
            result = prime * result + Objects.hashCode(_projectName);
            result = prime * result + Objects.hashCode(_scalingGroup);
            result = prime * result + Objects.hashCode(_vnfdPlacementGroupMaps);
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
            if (!StartNetworkServiceInput.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            StartNetworkServiceInput other = (StartNetworkServiceInput)obj;
            if (!Objects.equals(_inputParameter, other.getInputParameter())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsdIdRef, other.getNsdIdRef())) {
                return false;
            }
            if (!Objects.equals(_nsdPlacementGroupMaps, other.getNsdPlacementGroupMaps())) {
                return false;
            }
            if (!Objects.equals(_projectName, other.getProjectName())) {
                return false;
            }
            if (!Objects.equals(_scalingGroup, other.getScalingGroup())) {
                return false;
            }
            if (!Objects.equals(_vnfdPlacementGroupMaps, other.getVnfdPlacementGroupMaps())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StartNetworkServiceInputImpl otherImpl = (StartNetworkServiceInputImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<StartNetworkServiceInput>>, Augmentation<StartNetworkServiceInput>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("StartNetworkServiceInput");
            CodeHelpers.appendValue(helper, "_inputParameter", _inputParameter);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsdIdRef", _nsdIdRef);
            CodeHelpers.appendValue(helper, "_nsdPlacementGroupMaps", _nsdPlacementGroupMaps);
            CodeHelpers.appendValue(helper, "_projectName", _projectName);
            CodeHelpers.appendValue(helper, "_scalingGroup", _scalingGroup);
            CodeHelpers.appendValue(helper, "_vnfdPlacementGroupMaps", _vnfdPlacementGroupMaps);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
