package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SupportedOperation;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.AffinityOrAntiAffinityGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.AffinityOrAntiAffinityGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.Indicator;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.IndicatorKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.InstantiationLevel;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.InstantiationLevelKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.LcmOperationsConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.MonitoringParameter;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.MonitoringParameterKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.ScalingAspect;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.ScalingAspectKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.SupportedVnfInterfaces;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.SupportedVnfInterfacesKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VduProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VduProfileKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VirtualLinkProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VirtualLinkProfileKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link DfBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     DfBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new DfBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of DfBuilder, as instances can be freely passed around without
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
 * @see DfBuilder
 * @see Builder
 *
 */
public class DfBuilder implements Builder<Df> {

    private Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> _affinityOrAntiAffinityGroup;
    private String _defaultInstantiationLevel;
    private String _description;
    private String _id;
    private Map<IndicatorKey, Indicator> _indicator;
    private Map<InstantiationLevelKey, InstantiationLevel> _instantiationLevel;
    private LcmOperationsConfiguration _lcmOperationsConfiguration;
    private Map<MonitoringParameterKey, MonitoringParameter> _monitoringParameter;
    private Map<ScalingAspectKey, ScalingAspect> _scalingAspect;
    private List<Class<? extends SupportedOperation>> _supportedOperation;
    private Map<SupportedVnfInterfacesKey, SupportedVnfInterfaces> _supportedVnfInterfaces;
    private Map<VduProfileKey, VduProfile> _vduProfile;
    private Map<VirtualLinkProfileKey, VirtualLinkProfile> _virtualLinkProfile;
    private DfKey key;


    Map<Class<? extends Augmentation<Df>>, Augmentation<Df>> augmentation = Collections.emptyMap();

    public DfBuilder() {
    }

    public DfBuilder(Df base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Df>>, Augmentation<Df>> aug =((AugmentationHolder<Df>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._affinityOrAntiAffinityGroup = base.getAffinityOrAntiAffinityGroup();
        this._defaultInstantiationLevel = base.getDefaultInstantiationLevel();
        this._description = base.getDescription();
        this._indicator = base.getIndicator();
        this._instantiationLevel = base.getInstantiationLevel();
        this._lcmOperationsConfiguration = base.getLcmOperationsConfiguration();
        this._monitoringParameter = base.getMonitoringParameter();
        this._scalingAspect = base.getScalingAspect();
        this._supportedOperation = base.getSupportedOperation();
        this._supportedVnfInterfaces = base.getSupportedVnfInterfaces();
        this._vduProfile = base.getVduProfile();
        this._virtualLinkProfile = base.getVirtualLinkProfile();
    }


    public DfKey key() {
        return key;
    }
    
    public Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> getAffinityOrAntiAffinityGroup() {
        return _affinityOrAntiAffinityGroup;
    }
    
    public String getDefaultInstantiationLevel() {
        return _defaultInstantiationLevel;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public Map<IndicatorKey, Indicator> getIndicator() {
        return _indicator;
    }
    
    public Map<InstantiationLevelKey, InstantiationLevel> getInstantiationLevel() {
        return _instantiationLevel;
    }
    
    public LcmOperationsConfiguration getLcmOperationsConfiguration() {
        return _lcmOperationsConfiguration;
    }
    
    public Map<MonitoringParameterKey, MonitoringParameter> getMonitoringParameter() {
        return _monitoringParameter;
    }
    
    public Map<ScalingAspectKey, ScalingAspect> getScalingAspect() {
        return _scalingAspect;
    }
    
    public List<Class<? extends SupportedOperation>> getSupportedOperation() {
        return _supportedOperation;
    }
    
    public Map<SupportedVnfInterfacesKey, SupportedVnfInterfaces> getSupportedVnfInterfaces() {
        return _supportedVnfInterfaces;
    }
    
    public Map<VduProfileKey, VduProfile> getVduProfile() {
        return _vduProfile;
    }
    
    public Map<VirtualLinkProfileKey, VirtualLinkProfile> getVirtualLinkProfile() {
        return _virtualLinkProfile;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Df>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public DfBuilder withKey(final DfKey key) {
        this.key = key;
        return this;
    }
    public DfBuilder setAffinityOrAntiAffinityGroup(final Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> values) {
        this._affinityOrAntiAffinityGroup = values;
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
      * @deprecated Use {#link #setAffinityOrAntiAffinityGroup(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public DfBuilder setAffinityOrAntiAffinityGroup(final List<AffinityOrAntiAffinityGroup> values) {
        return setAffinityOrAntiAffinityGroup(CodeHelpers.compatMap(values));
    }
    
    public DfBuilder setDefaultInstantiationLevel(final String value) {
        this._defaultInstantiationLevel = value;
        return this;
    }
    
    public DfBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public DfBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public DfBuilder setIndicator(final Map<IndicatorKey, Indicator> values) {
        this._indicator = values;
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
      * @deprecated Use {#link #setIndicator(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    @JsonIgnore
    public DfBuilder setIndicator(final List<Indicator> values) {
        return setIndicator(CodeHelpers.compatMap(values));
    }
    public DfBuilder setInstantiationLevel(final Map<InstantiationLevelKey, InstantiationLevel> values) {
        this._instantiationLevel = values;
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
      * @deprecated Use {#link #setInstantiationLevel(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public DfBuilder setInstantiationLevel(final List<InstantiationLevel> values) {
        return setInstantiationLevel(CodeHelpers.compatMap(values));
    }
    
    public DfBuilder setLcmOperationsConfiguration(final LcmOperationsConfiguration value) {
        this._lcmOperationsConfiguration = value;
        return this;
    }
    public DfBuilder setMonitoringParameter(final Map<MonitoringParameterKey, MonitoringParameter> values) {
        this._monitoringParameter = values;
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
      * @deprecated Use {#link #setMonitoringParameter(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public DfBuilder setMonitoringParameter(final List<MonitoringParameter> values) {
        return setMonitoringParameter(CodeHelpers.compatMap(values));
    }
    public DfBuilder setScalingAspect(final Map<ScalingAspectKey, ScalingAspect> values) {
        this._scalingAspect = values;
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
      * @deprecated Use {#link #setScalingAspect(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public DfBuilder setScalingAspect(final List<ScalingAspect> values) {
        return setScalingAspect(CodeHelpers.compatMap(values));
    }
    public DfBuilder setSupportedOperation(final List<Class<? extends SupportedOperation>> values) {
        this._supportedOperation = values;
        return this;
    }
    
    public DfBuilder setSupportedVnfInterfaces(final Map<SupportedVnfInterfacesKey, SupportedVnfInterfaces> values) {
        this._supportedVnfInterfaces = values;
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
      * @deprecated Use {#link #setSupportedVnfInterfaces(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public DfBuilder setSupportedVnfInterfaces(final List<SupportedVnfInterfaces> values) {
        return setSupportedVnfInterfaces(CodeHelpers.compatMap(values));
    }
    public DfBuilder setVduProfile(final Map<VduProfileKey, VduProfile> values) {
        this._vduProfile = values;
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
      * @deprecated Use {#link #setVduProfile(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public DfBuilder setVduProfile(final List<VduProfile> values) {
        return setVduProfile(CodeHelpers.compatMap(values));
    }
    public DfBuilder setVirtualLinkProfile(final Map<VirtualLinkProfileKey, VirtualLinkProfile> values) {
        this._virtualLinkProfile = values;
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
      * @deprecated Use {#link #setVirtualLinkProfile(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public DfBuilder setVirtualLinkProfile(final List<VirtualLinkProfile> values) {
        return setVirtualLinkProfile(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public DfBuilder addAugmentation(Augmentation<Df> augmentation) {
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
    public DfBuilder addAugmentation(Class<? extends Augmentation<Df>> augmentationType, Augmentation<Df> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public DfBuilder removeAugmentation(Class<? extends Augmentation<Df>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private DfBuilder doAddAugmentation(Class<? extends Augmentation<Df>> augmentationType, Augmentation<Df> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Df build() {
        return new DfImpl(this);
    }

    public static final class DfImpl
        extends AbstractAugmentable<Df>
        implements Df {
        private final Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> _affinityOrAntiAffinityGroup;
        private final String _defaultInstantiationLevel;
        private final String _description;
        private final String _id;
        private final Map<IndicatorKey, Indicator> _indicator;
        private final Map<InstantiationLevelKey, InstantiationLevel> _instantiationLevel;
        private final LcmOperationsConfiguration _lcmOperationsConfiguration;
        private final Map<MonitoringParameterKey, MonitoringParameter> _monitoringParameter;
        private final Map<ScalingAspectKey, ScalingAspect> _scalingAspect;
        private final List<Class<? extends SupportedOperation>> _supportedOperation;
        @JsonDeserialize(keyUsing = SupportedVnfInterfacesKey.class)                        
        private final Map<SupportedVnfInterfacesKey, SupportedVnfInterfaces> _supportedVnfInterfaces;
        private final Map<VduProfileKey, VduProfile> _vduProfile;
        private final Map<VirtualLinkProfileKey, VirtualLinkProfile> _virtualLinkProfile;
        private DfKey key;
    
        DfImpl(DfBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new DfKey(base.getId());
            }
            this._id = key.getId();
            this._affinityOrAntiAffinityGroup = CodeHelpers.emptyToNull(base.getAffinityOrAntiAffinityGroup());
            this._defaultInstantiationLevel = base.getDefaultInstantiationLevel();
            this._description = base.getDescription();
            this._indicator = CodeHelpers.emptyToNull(base.getIndicator());
            this._instantiationLevel = CodeHelpers.emptyToNull(base.getInstantiationLevel());
            this._lcmOperationsConfiguration = base.getLcmOperationsConfiguration();
            this._monitoringParameter = CodeHelpers.emptyToNull(base.getMonitoringParameter());
            this._scalingAspect = CodeHelpers.emptyToNull(base.getScalingAspect());
            this._supportedOperation = base.getSupportedOperation();
            this._supportedVnfInterfaces = CodeHelpers.emptyToNull(base.getSupportedVnfInterfaces());
            this._vduProfile = CodeHelpers.emptyToNull(base.getVduProfile());
            this._virtualLinkProfile = CodeHelpers.emptyToNull(base.getVirtualLinkProfile());
        }

        public DfImpl() {
        	this( new DfBuilder());
        }
        
        
        @Override
        public DfKey key() {        	
        	if ( ( key != null) && ( key.getId() == null) && ( _id != null) ) {
        		key = new DfKey(_id);        		
        	}        	
            return key;
        }
                
        @Override
        public Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> getAffinityOrAntiAffinityGroup() {
            return _affinityOrAntiAffinityGroup;
        }
        
        @Override
        public String getDefaultInstantiationLevel() {
            return _defaultInstantiationLevel;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Map<IndicatorKey, Indicator> getIndicator() {
            return _indicator;
        }
        
        @Override
        public Map<InstantiationLevelKey, InstantiationLevel> getInstantiationLevel() {
            return _instantiationLevel;
        }
        
        @Override
        public LcmOperationsConfiguration getLcmOperationsConfiguration() {
            return _lcmOperationsConfiguration;
        }
        
        @Override
        public Map<MonitoringParameterKey, MonitoringParameter> getMonitoringParameter() {
            return _monitoringParameter;
        }
        
        @Override
        public Map<ScalingAspectKey, ScalingAspect> getScalingAspect() {
            return _scalingAspect;
        }
        
        @Override
        public List<Class<? extends SupportedOperation>> getSupportedOperation() {
            return _supportedOperation;
        }
        
        @Override
        public Map<SupportedVnfInterfacesKey, SupportedVnfInterfaces> getSupportedVnfInterfaces() {
            return _supportedVnfInterfaces;
        }
        
        @Override
        public Map<VduProfileKey, VduProfile> getVduProfile() {
            return _vduProfile;
        }
        
        @Override
        public Map<VirtualLinkProfileKey, VirtualLinkProfile> getVirtualLinkProfile() {
            return _virtualLinkProfile;
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
            result = prime * result + Objects.hashCode(_affinityOrAntiAffinityGroup);
            result = prime * result + Objects.hashCode(_defaultInstantiationLevel);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_indicator);
            result = prime * result + Objects.hashCode(_instantiationLevel);
            result = prime * result + Objects.hashCode(_lcmOperationsConfiguration);
            result = prime * result + Objects.hashCode(_monitoringParameter);
            result = prime * result + Objects.hashCode(_scalingAspect);
            result = prime * result + Objects.hashCode(_supportedOperation);
            result = prime * result + Objects.hashCode(_supportedVnfInterfaces);
            result = prime * result + Objects.hashCode(_vduProfile);
            result = prime * result + Objects.hashCode(_virtualLinkProfile);
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
            if (!Df.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Df other = (Df)obj;
            if (!Objects.equals(_affinityOrAntiAffinityGroup, other.getAffinityOrAntiAffinityGroup())) {
                return false;
            }
            if (!Objects.equals(_defaultInstantiationLevel, other.getDefaultInstantiationLevel())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_indicator, other.getIndicator())) {
                return false;
            }
            if (!Objects.equals(_instantiationLevel, other.getInstantiationLevel())) {
                return false;
            }
            if (!Objects.equals(_lcmOperationsConfiguration, other.getLcmOperationsConfiguration())) {
                return false;
            }
            if (!Objects.equals(_monitoringParameter, other.getMonitoringParameter())) {
                return false;
            }
            if (!Objects.equals(_scalingAspect, other.getScalingAspect())) {
                return false;
            }
            if (!Objects.equals(_supportedOperation, other.getSupportedOperation())) {
                return false;
            }
            if (!Objects.equals(_supportedVnfInterfaces, other.getSupportedVnfInterfaces())) {
                return false;
            }
            if (!Objects.equals(_vduProfile, other.getVduProfile())) {
                return false;
            }
            if (!Objects.equals(_virtualLinkProfile, other.getVirtualLinkProfile())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DfImpl otherImpl = (DfImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Df>>, Augmentation<Df>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Df");
            CodeHelpers.appendValue(helper, "_affinityOrAntiAffinityGroup", _affinityOrAntiAffinityGroup);
            CodeHelpers.appendValue(helper, "_defaultInstantiationLevel", _defaultInstantiationLevel);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_indicator", _indicator);
            CodeHelpers.appendValue(helper, "_instantiationLevel", _instantiationLevel);
            CodeHelpers.appendValue(helper, "_lcmOperationsConfiguration", _lcmOperationsConfiguration);
            CodeHelpers.appendValue(helper, "_monitoringParameter", _monitoringParameter);
            CodeHelpers.appendValue(helper, "_scalingAspect", _scalingAspect);
            CodeHelpers.appendValue(helper, "_supportedOperation", _supportedOperation);
            CodeHelpers.appendValue(helper, "_supportedVnfInterfaces", _supportedVnfInterfaces);
            CodeHelpers.appendValue(helper, "_vduProfile", _vduProfile);
            CodeHelpers.appendValue(helper, "_virtualLinkProfile", _virtualLinkProfile);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
