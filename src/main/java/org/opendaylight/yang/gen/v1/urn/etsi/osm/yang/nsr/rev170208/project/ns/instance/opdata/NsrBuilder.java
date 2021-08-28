package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ConfigStates;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsOperationalStatus;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJobKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConnectionPointKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRefKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParamKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.NsConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecord;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecordKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.Vlr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.VlrKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.Vnffgr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.VnffgrKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link NsrBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NsrBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NsrBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NsrBuilder, as instances can be freely passed around without
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
 * @see NsrBuilder
 * @see Builder
 *
 */
public class NsrBuilder implements Builder<Nsr> {

    private Map<ConfigAgentJobKey, ConfigAgentJob> _configAgentJob;
    private ConfigStates _configStatus;
    private Map<ConnectionPointKey, ConnectionPoint> _connectionPoint;
    private Map<ConstituentVnfrRefKey, ConstituentVnfrRef> _constituentVnfrRef;
    private Uint32 _createTime;
    private Map<MonitoringParamKey, MonitoringParam> _monitoringParam;
    private Object _nameRef;
    private NsConfiguration _nsConfiguration;
    private Uuid _nsInstanceConfigRef;
    private Object _nsdNameRef;
    private Object _nsdRef;
    private NsOperationalStatus _operationalStatus;
    private Map<ScalingGroupRecordKey, ScalingGroupRecord> _scalingGroupRecord;
    private Uint32 _uptime;
    private Map<VlrKey, Vlr> _vlr;
    private Map<VnffgrKey, Vnffgr> _vnffgr;
    private NsrKey key;


    Map<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> augmentation = Collections.emptyMap();

    public NsrBuilder() {
    }
    public NsrBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Vnffgr arg) {
        this._vnffgr = arg.getVnffgr();
    }

    public NsrBuilder(Nsr base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> aug =((AugmentationHolder<Nsr>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._nsInstanceConfigRef = base.getNsInstanceConfigRef();
        this._configAgentJob = base.getConfigAgentJob();
        this._configStatus = base.getConfigStatus();
        this._connectionPoint = base.getConnectionPoint();
        this._constituentVnfrRef = base.getConstituentVnfrRef();
        this._createTime = base.getCreateTime();
        this._monitoringParam = base.getMonitoringParam();
        this._nameRef = base.getNameRef();
        this._nsConfiguration = base.getNsConfiguration();
        this._nsdNameRef = base.getNsdNameRef();
        this._nsdRef = base.getNsdRef();
        this._operationalStatus = base.getOperationalStatus();
        this._scalingGroupRecord = base.getScalingGroupRecord();
        this._uptime = base.getUptime();
        this._vlr = base.getVlr();
        this._vnffgr = base.getVnffgr();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Vnffgr</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Vnffgr) {
            this._vnffgr = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Vnffgr)arg).getVnffgr();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Vnffgr]");
    }

    public NsrKey key() {
        return key;
    }
    
    public Map<ConfigAgentJobKey, ConfigAgentJob> getConfigAgentJob() {
        return _configAgentJob;
    }
    
    public ConfigStates getConfigStatus() {
        return _configStatus;
    }
    
    public Map<ConnectionPointKey, ConnectionPoint> getConnectionPoint() {
        return _connectionPoint;
    }
    
    public Map<ConstituentVnfrRefKey, ConstituentVnfrRef> getConstituentVnfrRef() {
        return _constituentVnfrRef;
    }
    
    public Uint32 getCreateTime() {
        return _createTime;
    }
    
    public Map<MonitoringParamKey, MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public Object getNameRef() {
        return _nameRef;
    }
    
    public NsConfiguration getNsConfiguration() {
        return _nsConfiguration;
    }
    
    public Uuid getNsInstanceConfigRef() {
        return _nsInstanceConfigRef;
    }
    
    public Object getNsdNameRef() {
        return _nsdNameRef;
    }
    
    public Object getNsdRef() {
        return _nsdRef;
    }
    
    public NsOperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public Map<ScalingGroupRecordKey, ScalingGroupRecord> getScalingGroupRecord() {
        return _scalingGroupRecord;
    }
    
    public Uint32 getUptime() {
        return _uptime;
    }
    
    public Map<VlrKey, Vlr> getVlr() {
        return _vlr;
    }
    
    public Map<VnffgrKey, Vnffgr> getVnffgr() {
        return _vnffgr;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Nsr>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NsrBuilder withKey(final NsrKey key) {
        this.key = key;
        return this;
    }
    public NsrBuilder setConfigAgentJob(final Map<ConfigAgentJobKey, ConfigAgentJob> values) {
        this._configAgentJob = values;
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
      * @deprecated Use {#link #setConfigAgentJob(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsrBuilder setConfigAgentJob(final List<ConfigAgentJob> values) {
        return setConfigAgentJob(CodeHelpers.compatMap(values));
    }
    
    public NsrBuilder setConfigStatus(final ConfigStates value) {
        this._configStatus = value;
        return this;
    }
    public NsrBuilder setConnectionPoint(final Map<ConnectionPointKey, ConnectionPoint> values) {
        this._connectionPoint = values;
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
      * @deprecated Use {#link #setConnectionPoint(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsrBuilder setConnectionPoint(final List<ConnectionPoint> values) {
        return setConnectionPoint(CodeHelpers.compatMap(values));
    }
    public NsrBuilder setConstituentVnfrRef(final Map<ConstituentVnfrRefKey, ConstituentVnfrRef> values) {
        this._constituentVnfrRef = values;
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
      * @deprecated Use {#link #setConstituentVnfrRef(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsrBuilder setConstituentVnfrRef(final List<ConstituentVnfrRef> values) {
        return setConstituentVnfrRef(CodeHelpers.compatMap(values));
    }
    
    public NsrBuilder setCreateTime(final Uint32 value) {
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
    public NsrBuilder setCreateTime(final Long value) {
        return setCreateTime(CodeHelpers.compatUint(value));
    }
    public NsrBuilder setMonitoringParam(final Map<MonitoringParamKey, MonitoringParam> values) {
        this._monitoringParam = values;
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
      * @deprecated Use {#link #setMonitoringParam(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsrBuilder setMonitoringParam(final List<MonitoringParam> values) {
        return setMonitoringParam(CodeHelpers.compatMap(values));
    }
    
    public NsrBuilder setNameRef(final Object value) {
        this._nameRef = value;
        return this;
    }
    
    public NsrBuilder setNsConfiguration(final NsConfiguration value) {
        this._nsConfiguration = value;
        return this;
    }
    
    public NsrBuilder setNsInstanceConfigRef(final Uuid value) {
        this._nsInstanceConfigRef = value;
        return this;
    }
    
    public NsrBuilder setNsdNameRef(final Object value) {
        this._nsdNameRef = value;
        return this;
    }
    
    public NsrBuilder setNsdRef(final Object value) {
        this._nsdRef = value;
        return this;
    }
    
    public NsrBuilder setOperationalStatus(final NsOperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    public NsrBuilder setScalingGroupRecord(final Map<ScalingGroupRecordKey, ScalingGroupRecord> values) {
        this._scalingGroupRecord = values;
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
      * @deprecated Use {#link #setScalingGroupRecord(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsrBuilder setScalingGroupRecord(final List<ScalingGroupRecord> values) {
        return setScalingGroupRecord(CodeHelpers.compatMap(values));
    }
    
    public NsrBuilder setUptime(final Uint32 value) {
        this._uptime = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setUptime(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public NsrBuilder setUptime(final Long value) {
        return setUptime(CodeHelpers.compatUint(value));
    }
    public NsrBuilder setVlr(final Map<VlrKey, Vlr> values) {
        this._vlr = values;
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
      * @deprecated Use {#link #setVlr(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsrBuilder setVlr(final List<Vlr> values) {
        return setVlr(CodeHelpers.compatMap(values));
    }
    public NsrBuilder setVnffgr(final Map<VnffgrKey, Vnffgr> values) {
        this._vnffgr = values;
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
      * @deprecated Use {#link #setVnffgr(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsrBuilder setVnffgr(final List<Vnffgr> values) {
        return setVnffgr(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NsrBuilder addAugmentation(Augmentation<Nsr> augmentation) {
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
    public NsrBuilder addAugmentation(Class<? extends Augmentation<Nsr>> augmentationType, Augmentation<Nsr> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NsrBuilder removeAugmentation(Class<? extends Augmentation<Nsr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NsrBuilder doAddAugmentation(Class<? extends Augmentation<Nsr>> augmentationType, Augmentation<Nsr> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Nsr build() {
        return new NsrImpl(this);
    }

    private static final class NsrImpl
        extends AbstractAugmentable<Nsr>
        implements Nsr {
    
        private final Map<ConfigAgentJobKey, ConfigAgentJob> _configAgentJob;
        private final ConfigStates _configStatus;
        private final Map<ConnectionPointKey, ConnectionPoint> _connectionPoint;
        private final Map<ConstituentVnfrRefKey, ConstituentVnfrRef> _constituentVnfrRef;
        private final Uint32 _createTime;
        private final Map<MonitoringParamKey, MonitoringParam> _monitoringParam;
        private final Object _nameRef;
        private final NsConfiguration _nsConfiguration;
        private final Uuid _nsInstanceConfigRef;
        private final Object _nsdNameRef;
        private final Object _nsdRef;
        private final NsOperationalStatus _operationalStatus;
        private final Map<ScalingGroupRecordKey, ScalingGroupRecord> _scalingGroupRecord;
        private final Uint32 _uptime;
        private final Map<VlrKey, Vlr> _vlr;
        private final Map<VnffgrKey, Vnffgr> _vnffgr;
        private final NsrKey key;
    
        NsrImpl(NsrBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NsrKey(base.getNsInstanceConfigRef());
            }
            this._nsInstanceConfigRef = key.getNsInstanceConfigRef();
            this._configAgentJob = CodeHelpers.emptyToNull(base.getConfigAgentJob());
            this._configStatus = base.getConfigStatus();
            this._connectionPoint = CodeHelpers.emptyToNull(base.getConnectionPoint());
            this._constituentVnfrRef = CodeHelpers.emptyToNull(base.getConstituentVnfrRef());
            this._createTime = base.getCreateTime();
            this._monitoringParam = CodeHelpers.emptyToNull(base.getMonitoringParam());
            this._nameRef = base.getNameRef();
            this._nsConfiguration = base.getNsConfiguration();
            this._nsdNameRef = base.getNsdNameRef();
            this._nsdRef = base.getNsdRef();
            this._operationalStatus = base.getOperationalStatus();
            this._scalingGroupRecord = CodeHelpers.emptyToNull(base.getScalingGroupRecord());
            this._uptime = base.getUptime();
            this._vlr = CodeHelpers.emptyToNull(base.getVlr());
            this._vnffgr = CodeHelpers.emptyToNull(base.getVnffgr());
        }
    
        @Override
        public NsrKey key() {
            return key;
        }
        
        @Override
        public Map<ConfigAgentJobKey, ConfigAgentJob> getConfigAgentJob() {
            return _configAgentJob;
        }
        
        @Override
        public ConfigStates getConfigStatus() {
            return _configStatus;
        }
        
        @Override
        public Map<ConnectionPointKey, ConnectionPoint> getConnectionPoint() {
            return _connectionPoint;
        }
        
        @Override
        public Map<ConstituentVnfrRefKey, ConstituentVnfrRef> getConstituentVnfrRef() {
            return _constituentVnfrRef;
        }
        
        @Override
        public Uint32 getCreateTime() {
            return _createTime;
        }
        
        @Override
        public Map<MonitoringParamKey, MonitoringParam> getMonitoringParam() {
            return _monitoringParam;
        }
        
        @Override
        public Object getNameRef() {
            return _nameRef;
        }
        
        @Override
        public NsConfiguration getNsConfiguration() {
            return _nsConfiguration;
        }
        
        @Override
        public Uuid getNsInstanceConfigRef() {
            return _nsInstanceConfigRef;
        }
        
        @Override
        public Object getNsdNameRef() {
            return _nsdNameRef;
        }
        
        @Override
        public Object getNsdRef() {
            return _nsdRef;
        }
        
        @Override
        public NsOperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public Map<ScalingGroupRecordKey, ScalingGroupRecord> getScalingGroupRecord() {
            return _scalingGroupRecord;
        }
        
        @Override
        public Uint32 getUptime() {
            return _uptime;
        }
        
        @Override
        public Map<VlrKey, Vlr> getVlr() {
            return _vlr;
        }
        
        @Override
        public Map<VnffgrKey, Vnffgr> getVnffgr() {
            return _vnffgr;
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
            result = prime * result + Objects.hashCode(_configAgentJob);
            result = prime * result + Objects.hashCode(_configStatus);
            result = prime * result + Objects.hashCode(_connectionPoint);
            result = prime * result + Objects.hashCode(_constituentVnfrRef);
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_nameRef);
            result = prime * result + Objects.hashCode(_nsConfiguration);
            result = prime * result + Objects.hashCode(_nsInstanceConfigRef);
            result = prime * result + Objects.hashCode(_nsdNameRef);
            result = prime * result + Objects.hashCode(_nsdRef);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_scalingGroupRecord);
            result = prime * result + Objects.hashCode(_uptime);
            result = prime * result + Objects.hashCode(_vlr);
            result = prime * result + Objects.hashCode(_vnffgr);
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
            if (!Nsr.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Nsr other = (Nsr)obj;
            if (!Objects.equals(_configAgentJob, other.getConfigAgentJob())) {
                return false;
            }
            if (!Objects.equals(_configStatus, other.getConfigStatus())) {
                return false;
            }
            if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_constituentVnfrRef, other.getConstituentVnfrRef())) {
                return false;
            }
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_nameRef, other.getNameRef())) {
                return false;
            }
            if (!Objects.equals(_nsConfiguration, other.getNsConfiguration())) {
                return false;
            }
            if (!Objects.equals(_nsInstanceConfigRef, other.getNsInstanceConfigRef())) {
                return false;
            }
            if (!Objects.equals(_nsdNameRef, other.getNsdNameRef())) {
                return false;
            }
            if (!Objects.equals(_nsdRef, other.getNsdRef())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_scalingGroupRecord, other.getScalingGroupRecord())) {
                return false;
            }
            if (!Objects.equals(_uptime, other.getUptime())) {
                return false;
            }
            if (!Objects.equals(_vlr, other.getVlr())) {
                return false;
            }
            if (!Objects.equals(_vnffgr, other.getVnffgr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsrImpl otherImpl = (NsrImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nsr");
            CodeHelpers.appendValue(helper, "_configAgentJob", _configAgentJob);
            CodeHelpers.appendValue(helper, "_configStatus", _configStatus);
            CodeHelpers.appendValue(helper, "_connectionPoint", _connectionPoint);
            CodeHelpers.appendValue(helper, "_constituentVnfrRef", _constituentVnfrRef);
            CodeHelpers.appendValue(helper, "_createTime", _createTime);
            CodeHelpers.appendValue(helper, "_monitoringParam", _monitoringParam);
            CodeHelpers.appendValue(helper, "_nameRef", _nameRef);
            CodeHelpers.appendValue(helper, "_nsConfiguration", _nsConfiguration);
            CodeHelpers.appendValue(helper, "_nsInstanceConfigRef", _nsInstanceConfigRef);
            CodeHelpers.appendValue(helper, "_nsdNameRef", _nsdNameRef);
            CodeHelpers.appendValue(helper, "_nsdRef", _nsdRef);
            CodeHelpers.appendValue(helper, "_operationalStatus", _operationalStatus);
            CodeHelpers.appendValue(helper, "_scalingGroupRecord", _scalingGroupRecord);
            CodeHelpers.appendValue(helper, "_uptime", _uptime);
            CodeHelpers.appendValue(helper, "_vlr", _vlr);
            CodeHelpers.appendValue(helper, "_vnffgr", _vnffgr);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
