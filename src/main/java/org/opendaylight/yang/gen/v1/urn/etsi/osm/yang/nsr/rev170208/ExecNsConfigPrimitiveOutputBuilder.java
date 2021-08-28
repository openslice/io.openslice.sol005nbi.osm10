package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Long;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.ParameterGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.ParameterGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.VnfOutList;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.VnfOutListKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link ExecNsConfigPrimitiveOutputBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ExecNsConfigPrimitiveOutputBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ExecNsConfigPrimitiveOutputBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ExecNsConfigPrimitiveOutputBuilder, as instances can be freely passed around without
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
 * @see ExecNsConfigPrimitiveOutputBuilder
 * @see Builder
 *
 */
public class ExecNsConfigPrimitiveOutputBuilder implements Builder<ExecNsConfigPrimitiveOutput> {

    private Uint32 _createTime;
    private Uint64 _jobId;
    private String _jobStatusDetails;
    private String _name;
    private Object _nsrIdRef;
    private Map<ParameterKey, Parameter> _parameter;
    private Map<ParameterGroupKey, ParameterGroup> _parameterGroup;
    private String _projectName;
    private TriggerType _triggeredBy;
    private Map<VnfOutListKey, VnfOutList> _vnfOutList;


    Map<Class<? extends Augmentation<ExecNsConfigPrimitiveOutput>>, Augmentation<ExecNsConfigPrimitiveOutput>> augmentation = Collections.emptyMap();

    public ExecNsConfigPrimitiveOutputBuilder() {
    }
    public ExecNsConfigPrimitiveOutputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon arg) {
        this._nsrIdRef = arg.getNsrIdRef();
        this._projectName = arg.getProjectName();
    }
    public ExecNsConfigPrimitiveOutputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }
    public ExecNsConfigPrimitiveOutputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public ExecNsConfigPrimitiveOutputBuilder(ExecNsConfigPrimitiveOutput base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ExecNsConfigPrimitiveOutput>>, Augmentation<ExecNsConfigPrimitiveOutput>> aug =((AugmentationHolder<ExecNsConfigPrimitiveOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._createTime = base.getCreateTime();
        this._jobId = base.getJobId();
        this._jobStatusDetails = base.getJobStatusDetails();
        this._name = base.getName();
        this._nsrIdRef = base.getNsrIdRef();
        this._parameter = base.getParameter();
        this._parameterGroup = base.getParameterGroup();
        this._projectName = base.getProjectName();
        this._triggeredBy = base.getTriggeredBy();
        this._vnfOutList = base.getVnfOutList();
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

    public Uint32 getCreateTime() {
        return _createTime;
    }
    
    public Uint64 getJobId() {
        return _jobId;
    }
    
    public String getJobStatusDetails() {
        return _jobStatusDetails;
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
    
    public Map<VnfOutListKey, VnfOutList> getVnfOutList() {
        return _vnfOutList;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ExecNsConfigPrimitiveOutput>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public ExecNsConfigPrimitiveOutputBuilder setCreateTime(final Uint32 value) {
        this._createTime = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCreateTime(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public ExecNsConfigPrimitiveOutputBuilder setCreateTime(final Long value) {
        return setCreateTime(CodeHelpers.compatUint(value));
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setJobId(final Uint64 value) {
        this._jobId = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setJobId(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public ExecNsConfigPrimitiveOutputBuilder setJobId(final BigInteger value) {
        return setJobId(CodeHelpers.compatUint(value));
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setJobStatusDetails(final String value) {
        this._jobStatusDetails = value;
        return this;
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setNsrIdRef(final Object value) {
        this._nsrIdRef = value;
        return this;
    }
    public ExecNsConfigPrimitiveOutputBuilder setParameter(final Map<ParameterKey, Parameter> values) {
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
    public ExecNsConfigPrimitiveOutputBuilder setParameter(final List<Parameter> values) {
        return setParameter(CodeHelpers.compatMap(values));
    }
    public ExecNsConfigPrimitiveOutputBuilder setParameterGroup(final Map<ParameterGroupKey, ParameterGroup> values) {
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
    public ExecNsConfigPrimitiveOutputBuilder setParameterGroup(final List<ParameterGroup> values) {
        return setParameterGroup(CodeHelpers.compatMap(values));
    }
    
    private static void check_projectNameLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 255) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..255]]", value);
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setProjectName(final String value) {
        if (value != null) {
            check_projectNameLength(value);
            
        }
        this._projectName = value;
        return this;
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setTriggeredBy(final TriggerType value) {
        this._triggeredBy = value;
        return this;
    }
    public ExecNsConfigPrimitiveOutputBuilder setVnfOutList(final Map<VnfOutListKey, VnfOutList> values) {
        this._vnfOutList = values;
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
      * @deprecated Use {#link #setVnfOutList(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ExecNsConfigPrimitiveOutputBuilder setVnfOutList(final List<VnfOutList> values) {
        return setVnfOutList(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ExecNsConfigPrimitiveOutputBuilder addAugmentation(Augmentation<ExecNsConfigPrimitiveOutput> augmentation) {
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
    public ExecNsConfigPrimitiveOutputBuilder addAugmentation(Class<? extends Augmentation<ExecNsConfigPrimitiveOutput>> augmentationType, Augmentation<ExecNsConfigPrimitiveOutput> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ExecNsConfigPrimitiveOutputBuilder removeAugmentation(Class<? extends Augmentation<ExecNsConfigPrimitiveOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ExecNsConfigPrimitiveOutputBuilder doAddAugmentation(Class<? extends Augmentation<ExecNsConfigPrimitiveOutput>> augmentationType, Augmentation<ExecNsConfigPrimitiveOutput> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ExecNsConfigPrimitiveOutput build() {
        return new ExecNsConfigPrimitiveOutputImpl(this);
    }

    private static final class ExecNsConfigPrimitiveOutputImpl
        extends AbstractAugmentable<ExecNsConfigPrimitiveOutput>
        implements ExecNsConfigPrimitiveOutput {
    
        private final Uint32 _createTime;
        private final Uint64 _jobId;
        private final String _jobStatusDetails;
        private final String _name;
        private final Object _nsrIdRef;
        private final Map<ParameterKey, Parameter> _parameter;
        private final Map<ParameterGroupKey, ParameterGroup> _parameterGroup;
        private final String _projectName;
        private final TriggerType _triggeredBy;
        private final Map<VnfOutListKey, VnfOutList> _vnfOutList;
    
        ExecNsConfigPrimitiveOutputImpl(ExecNsConfigPrimitiveOutputBuilder base) {
            super(base.augmentation);
            this._createTime = base.getCreateTime();
            this._jobId = base.getJobId();
            this._jobStatusDetails = base.getJobStatusDetails();
            this._name = base.getName();
            this._nsrIdRef = base.getNsrIdRef();
            this._parameter = CodeHelpers.emptyToNull(base.getParameter());
            this._parameterGroup = CodeHelpers.emptyToNull(base.getParameterGroup());
            this._projectName = base.getProjectName();
            this._triggeredBy = base.getTriggeredBy();
            this._vnfOutList = CodeHelpers.emptyToNull(base.getVnfOutList());
        }
    
        @Override
        public Uint32 getCreateTime() {
            return _createTime;
        }
        
        @Override
        public Uint64 getJobId() {
            return _jobId;
        }
        
        @Override
        public String getJobStatusDetails() {
            return _jobStatusDetails;
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
        public Map<VnfOutListKey, VnfOutList> getVnfOutList() {
            return _vnfOutList;
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
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_jobId);
            result = prime * result + Objects.hashCode(_jobStatusDetails);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_parameterGroup);
            result = prime * result + Objects.hashCode(_projectName);
            result = prime * result + Objects.hashCode(_triggeredBy);
            result = prime * result + Objects.hashCode(_vnfOutList);
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
            if (!ExecNsConfigPrimitiveOutput.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ExecNsConfigPrimitiveOutput other = (ExecNsConfigPrimitiveOutput)obj;
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_jobId, other.getJobId())) {
                return false;
            }
            if (!Objects.equals(_jobStatusDetails, other.getJobStatusDetails())) {
                return false;
            }
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
            if (!Objects.equals(_vnfOutList, other.getVnfOutList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExecNsConfigPrimitiveOutputImpl otherImpl = (ExecNsConfigPrimitiveOutputImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ExecNsConfigPrimitiveOutput>>, Augmentation<ExecNsConfigPrimitiveOutput>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ExecNsConfigPrimitiveOutput");
            CodeHelpers.appendValue(helper, "_createTime", _createTime);
            CodeHelpers.appendValue(helper, "_jobId", _jobId);
            CodeHelpers.appendValue(helper, "_jobStatusDetails", _jobStatusDetails);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsrIdRef", _nsrIdRef);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_parameterGroup", _parameterGroup);
            CodeHelpers.appendValue(helper, "_projectName", _projectName);
            CodeHelpers.appendValue(helper, "_triggeredBy", _triggeredBy);
            CodeHelpers.appendValue(helper, "_vnfOutList", _vnfOutList);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
