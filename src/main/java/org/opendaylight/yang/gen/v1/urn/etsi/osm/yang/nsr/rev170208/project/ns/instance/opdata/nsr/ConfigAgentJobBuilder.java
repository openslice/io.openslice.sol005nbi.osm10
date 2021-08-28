package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.TriggerType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.ParameterGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.ParameterGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.Vnfr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.VnfrKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link ConfigAgentJobBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ConfigAgentJobBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ConfigAgentJobBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ConfigAgentJobBuilder, as instances can be freely passed around without
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
 * @see ConfigAgentJobBuilder
 * @see Builder
 *
 */
public class ConfigAgentJobBuilder implements Builder<ConfigAgentJob> {

    private Uint32 _createTime;
    private Uint64 _jobId;
    private String _jobName;
    private ConfigAgentJob.JobStatus _jobStatus;
    private String _jobStatusDetails;
    private Map<ParameterKey, Parameter> _parameter;
    private Map<ParameterGroupKey, ParameterGroup> _parameterGroup;
    private TriggerType _triggeredBy;
    private Map<VnfrKey, Vnfr> _vnfr;
    private ConfigAgentJobKey key;


    Map<Class<? extends Augmentation<ConfigAgentJob>>, Augmentation<ConfigAgentJob>> augmentation = Collections.emptyMap();

    public ConfigAgentJobBuilder() {
    }
    public ConfigAgentJobBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public ConfigAgentJobBuilder(ConfigAgentJob base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ConfigAgentJob>>, Augmentation<ConfigAgentJob>> aug =((AugmentationHolder<ConfigAgentJob>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._jobId = base.getJobId();
        this._createTime = base.getCreateTime();
        this._jobName = base.getJobName();
        this._jobStatus = base.getJobStatus();
        this._jobStatusDetails = base.getJobStatusDetails();
        this._parameter = base.getParameter();
        this._parameterGroup = base.getParameterGroup();
        this._triggeredBy = base.getTriggeredBy();
        this._vnfr = base.getVnfr();
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

    public ConfigAgentJobKey key() {
        return key;
    }
    
    public Uint32 getCreateTime() {
        return _createTime;
    }
    
    public Uint64 getJobId() {
        return _jobId;
    }
    
    public String getJobName() {
        return _jobName;
    }
    
    public ConfigAgentJob.JobStatus getJobStatus() {
        return _jobStatus;
    }
    
    public String getJobStatusDetails() {
        return _jobStatusDetails;
    }
    
    public Map<ParameterKey, Parameter> getParameter() {
        return _parameter;
    }
    
    public Map<ParameterGroupKey, ParameterGroup> getParameterGroup() {
        return _parameterGroup;
    }
    
    public TriggerType getTriggeredBy() {
        return _triggeredBy;
    }
    
    public Map<VnfrKey, Vnfr> getVnfr() {
        return _vnfr;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ConfigAgentJob>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ConfigAgentJobBuilder withKey(final ConfigAgentJobKey key) {
        this.key = key;
        return this;
    }
    
    public ConfigAgentJobBuilder setCreateTime(final Uint32 value) {
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
    public ConfigAgentJobBuilder setCreateTime(final Long value) {
        return setCreateTime(CodeHelpers.compatUint(value));
    }
    
    public ConfigAgentJobBuilder setJobId(final Uint64 value) {
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
    public ConfigAgentJobBuilder setJobId(final BigInteger value) {
        return setJobId(CodeHelpers.compatUint(value));
    }
    
    public ConfigAgentJobBuilder setJobName(final String value) {
        this._jobName = value;
        return this;
    }
    
    public ConfigAgentJobBuilder setJobStatus(final ConfigAgentJob.JobStatus value) {
        this._jobStatus = value;
        return this;
    }
    
    public ConfigAgentJobBuilder setJobStatusDetails(final String value) {
        this._jobStatusDetails = value;
        return this;
    }
    public ConfigAgentJobBuilder setParameter(final Map<ParameterKey, Parameter> values) {
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
    public ConfigAgentJobBuilder setParameter(final List<Parameter> values) {
        return setParameter(CodeHelpers.compatMap(values));
    }
    public ConfigAgentJobBuilder setParameterGroup(final Map<ParameterGroupKey, ParameterGroup> values) {
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
    public ConfigAgentJobBuilder setParameterGroup(final List<ParameterGroup> values) {
        return setParameterGroup(CodeHelpers.compatMap(values));
    }
    
    public ConfigAgentJobBuilder setTriggeredBy(final TriggerType value) {
        this._triggeredBy = value;
        return this;
    }
    public ConfigAgentJobBuilder setVnfr(final Map<VnfrKey, Vnfr> values) {
        this._vnfr = values;
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
      * @deprecated Use {#link #setVnfr(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ConfigAgentJobBuilder setVnfr(final List<Vnfr> values) {
        return setVnfr(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ConfigAgentJobBuilder addAugmentation(Augmentation<ConfigAgentJob> augmentation) {
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
    public ConfigAgentJobBuilder addAugmentation(Class<? extends Augmentation<ConfigAgentJob>> augmentationType, Augmentation<ConfigAgentJob> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ConfigAgentJobBuilder removeAugmentation(Class<? extends Augmentation<ConfigAgentJob>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ConfigAgentJobBuilder doAddAugmentation(Class<? extends Augmentation<ConfigAgentJob>> augmentationType, Augmentation<ConfigAgentJob> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ConfigAgentJob build() {
        return new ConfigAgentJobImpl(this);
    }

    private static final class ConfigAgentJobImpl
        extends AbstractAugmentable<ConfigAgentJob>
        implements ConfigAgentJob {
    
        private final Uint32 _createTime;
        private final Uint64 _jobId;
        private final String _jobName;
        private final ConfigAgentJob.JobStatus _jobStatus;
        private final String _jobStatusDetails;
        private final Map<ParameterKey, Parameter> _parameter;
        private final Map<ParameterGroupKey, ParameterGroup> _parameterGroup;
        private final TriggerType _triggeredBy;
        private final Map<VnfrKey, Vnfr> _vnfr;
        private final ConfigAgentJobKey key;
    
        ConfigAgentJobImpl(ConfigAgentJobBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ConfigAgentJobKey(base.getJobId());
            }
            this._jobId = key.getJobId();
            this._createTime = base.getCreateTime();
            this._jobName = base.getJobName();
            this._jobStatus = base.getJobStatus();
            this._jobStatusDetails = base.getJobStatusDetails();
            this._parameter = CodeHelpers.emptyToNull(base.getParameter());
            this._parameterGroup = CodeHelpers.emptyToNull(base.getParameterGroup());
            this._triggeredBy = base.getTriggeredBy();
            this._vnfr = CodeHelpers.emptyToNull(base.getVnfr());
        }
    
        @Override
        public ConfigAgentJobKey key() {
            return key;
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
        public String getJobName() {
            return _jobName;
        }
        
        @Override
        public ConfigAgentJob.JobStatus getJobStatus() {
            return _jobStatus;
        }
        
        @Override
        public String getJobStatusDetails() {
            return _jobStatusDetails;
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
        public TriggerType getTriggeredBy() {
            return _triggeredBy;
        }
        
        @Override
        public Map<VnfrKey, Vnfr> getVnfr() {
            return _vnfr;
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
            result = prime * result + Objects.hashCode(_jobName);
            result = prime * result + Objects.hashCode(_jobStatus);
            result = prime * result + Objects.hashCode(_jobStatusDetails);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_parameterGroup);
            result = prime * result + Objects.hashCode(_triggeredBy);
            result = prime * result + Objects.hashCode(_vnfr);
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
            if (!ConfigAgentJob.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ConfigAgentJob other = (ConfigAgentJob)obj;
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_jobId, other.getJobId())) {
                return false;
            }
            if (!Objects.equals(_jobName, other.getJobName())) {
                return false;
            }
            if (!Objects.equals(_jobStatus, other.getJobStatus())) {
                return false;
            }
            if (!Objects.equals(_jobStatusDetails, other.getJobStatusDetails())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_parameterGroup, other.getParameterGroup())) {
                return false;
            }
            if (!Objects.equals(_triggeredBy, other.getTriggeredBy())) {
                return false;
            }
            if (!Objects.equals(_vnfr, other.getVnfr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConfigAgentJobImpl otherImpl = (ConfigAgentJobImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConfigAgentJob>>, Augmentation<ConfigAgentJob>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConfigAgentJob");
            CodeHelpers.appendValue(helper, "_createTime", _createTime);
            CodeHelpers.appendValue(helper, "_jobId", _jobId);
            CodeHelpers.appendValue(helper, "_jobName", _jobName);
            CodeHelpers.appendValue(helper, "_jobStatus", _jobStatus);
            CodeHelpers.appendValue(helper, "_jobStatusDetails", _jobStatusDetails);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_parameterGroup", _parameterGroup);
            CodeHelpers.appendValue(helper, "_triggeredBy", _triggeredBy);
            CodeHelpers.appendValue(helper, "_vnfr", _vnfr);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
