package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.AffinityOrAntiAffinityGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.AffinityOrAntiAffinityGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.Dependencies;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.DependenciesKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.MonitoredInfo;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.MonitoredInfoKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsInstantiationLevel;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsInstantiationLevelKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsProfileKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.PnfProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.PnfProfileKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ScalingAspect;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ScalingAspectKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VirtualLinkProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VirtualLinkProfileKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VnfProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VnfProfileBuilder.VnfProfileImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VnfProfileKey;
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
    private Map<DependenciesKey, Dependencies> _dependencies;
    private String _flavourKey;
    private String _id;
    private Map<MonitoredInfoKey, MonitoredInfo> _monitoredInfo;
    private Map<NsInstantiationLevelKey, NsInstantiationLevel> _nsInstantiationLevel;
    private Map<NsProfileKey, NsProfile> _nsProfile;
    private Map<PnfProfileKey, PnfProfile> _pnfProfile;
    private Map<ScalingAspectKey, ScalingAspect> _scalingAspect;
    private Map<VirtualLinkProfileKey, VirtualLinkProfile> _virtualLinkProfile;
    private Map<VnfProfileKey, VnfProfile> _vnfProfile;
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
        this._dependencies = base.getDependencies();
        this._flavourKey = base.getFlavourKey();
        this._monitoredInfo = base.getMonitoredInfo();
        this._nsInstantiationLevel = base.getNsInstantiationLevel();
        this._nsProfile = base.getNsProfile();
        this._pnfProfile = base.getPnfProfile();
        this._scalingAspect = base.getScalingAspect();
        this._virtualLinkProfile = base.getVirtualLinkProfile();
        this._vnfProfile = base.getVnfProfile();
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
    
    public Map<DependenciesKey, Dependencies> getDependencies() {
        return _dependencies;
    }
    
    public String getFlavourKey() {
        return _flavourKey;
    }
    
    public String getId() {
        return _id;
    }
    
    public Map<MonitoredInfoKey, MonitoredInfo> getMonitoredInfo() {
        return _monitoredInfo;
    }
    
    public Map<NsInstantiationLevelKey, NsInstantiationLevel> getNsInstantiationLevel() {
        return _nsInstantiationLevel;
    }
    
    public Map<NsProfileKey, NsProfile> getNsProfile() {
        return _nsProfile;
    }
    
    public Map<PnfProfileKey, PnfProfile> getPnfProfile() {
        return _pnfProfile;
    }
    
    public Map<ScalingAspectKey, ScalingAspect> getScalingAspect() {
        return _scalingAspect;
    }
    
    public Map<VirtualLinkProfileKey, VirtualLinkProfile> getVirtualLinkProfile() {
        return _virtualLinkProfile;
    }
    
    public Map<VnfProfileKey, VnfProfile> getVnfProfile() {
        return _vnfProfile;
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
    public DfBuilder setDependencies(final Map<DependenciesKey, Dependencies> values) {
        this._dependencies = values;
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
      * @deprecated Use {#link #setDependencies(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public DfBuilder setDependencies(final List<Dependencies> values) {
        return setDependencies(CodeHelpers.compatMap(values));
    }
    
    public DfBuilder setFlavourKey(final String value) {
        this._flavourKey = value;
        return this;
    }
    
    public DfBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public DfBuilder setMonitoredInfo(final Map<MonitoredInfoKey, MonitoredInfo> values) {
        this._monitoredInfo = values;
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
      * @deprecated Use {#link #setMonitoredInfo(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public DfBuilder setMonitoredInfo(final List<MonitoredInfo> values) {
        return setMonitoredInfo(CodeHelpers.compatMap(values));
    }
    public DfBuilder setNsInstantiationLevel(final Map<NsInstantiationLevelKey, NsInstantiationLevel> values) {
        this._nsInstantiationLevel = values;
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
      * @deprecated Use {#link #setNsInstantiationLevel(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public DfBuilder setNsInstantiationLevel(final List<NsInstantiationLevel> values) {
        return setNsInstantiationLevel(CodeHelpers.compatMap(values));
    }
    public DfBuilder setNsProfile(final Map<NsProfileKey, NsProfile> values) {
        this._nsProfile = values;
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
      * @deprecated Use {#link #setNsProfile(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public DfBuilder setNsProfile(final List<NsProfile> values) {
        return setNsProfile(CodeHelpers.compatMap(values));
    }
    public DfBuilder setPnfProfile(final Map<PnfProfileKey, PnfProfile> values) {
        this._pnfProfile = values;
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
      * @deprecated Use {#link #setPnfProfile(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public DfBuilder setPnfProfile(final List<PnfProfile> values) {
        return setPnfProfile(CodeHelpers.compatMap(values));
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
    public DfBuilder setVnfProfile(final Map<VnfProfileKey, VnfProfile> values) {
        this._vnfProfile = values;
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
      * @deprecated Use {#link #setVnfProfile(Map)} instead.
      */

    @Deprecated(forRemoval = true)
    public DfBuilder setVnfProfile(final List<VnfProfile> values) {
        return setVnfProfile(CodeHelpers.compatMap(values));
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
        private final Map<DependenciesKey, Dependencies> _dependencies;
        private final String _flavourKey;
        @JsonProperty("id")
        private final String _id;
        private final Map<MonitoredInfoKey, MonitoredInfo> _monitoredInfo;
        private final Map<NsInstantiationLevelKey, NsInstantiationLevel> _nsInstantiationLevel;
        private final Map<NsProfileKey, NsProfile> _nsProfile;
        private final Map<PnfProfileKey, PnfProfile> _pnfProfile;
        private final Map<ScalingAspectKey, ScalingAspect> _scalingAspect;
        private final Map<VirtualLinkProfileKey, VirtualLinkProfile> _virtualLinkProfile;
        private Map<VnfProfileKey, VnfProfile> _vnfProfile;
        private final DfKey key;
    
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
            this._dependencies = CodeHelpers.emptyToNull(base.getDependencies());
            this._flavourKey = base.getFlavourKey();
            this._monitoredInfo = CodeHelpers.emptyToNull(base.getMonitoredInfo());
            this._nsInstantiationLevel = CodeHelpers.emptyToNull(base.getNsInstantiationLevel());
            this._nsProfile = CodeHelpers.emptyToNull(base.getNsProfile());
            this._pnfProfile = CodeHelpers.emptyToNull(base.getPnfProfile());
            this._scalingAspect = CodeHelpers.emptyToNull(base.getScalingAspect());
            this._virtualLinkProfile = CodeHelpers.emptyToNull(base.getVirtualLinkProfile());
            this._vnfProfile = CodeHelpers.emptyToNull(base.getVnfProfile());
        }

        public DfImpl() {
        	this( new DfBuilder());
        }

//        public Map<VnfProfileKey, VnfProfile> setVnfProfile(final List<VnfProfile> values) {
//            return _vnfProfile = CodeHelpers.compatMap(values) ;
//        }
        
        @JsonSetter("vnf-profile")        
        public Map<VnfProfileKey, VnfProfile> setVnfProfile(final List<VnfProfile> values) {
        	if(values==null)
        		return null;
        	if(values.isEmpty())
        		return null;
        	else
        	{
                Map<VnfProfileKey,VnfProfile> result = new HashMap<>();
	            for(VnfProfile value:values) {
	                result.put(new VnfProfileKey(value.getId()),value);
	            }
	            this._vnfProfile=result;
	            return result;
        	}
        }

        @Override
        public DfKey key() {
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
        public Map<DependenciesKey, Dependencies> getDependencies() {
            return _dependencies;
        }
        
        @Override
        public String getFlavourKey() {
            return _flavourKey;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Map<MonitoredInfoKey, MonitoredInfo> getMonitoredInfo() {
            return _monitoredInfo;
        }
        
        @Override
        public Map<NsInstantiationLevelKey, NsInstantiationLevel> getNsInstantiationLevel() {
            return _nsInstantiationLevel;
        }
        
        @Override
        public Map<NsProfileKey, NsProfile> getNsProfile() {
            return _nsProfile;
        }
        
        @Override
        public Map<PnfProfileKey, PnfProfile> getPnfProfile() {
            return _pnfProfile;
        }
        
        @Override
        public Map<ScalingAspectKey, ScalingAspect> getScalingAspect() {
            return _scalingAspect;
        }
        
        @Override
        public Map<VirtualLinkProfileKey, VirtualLinkProfile> getVirtualLinkProfile() {
            return _virtualLinkProfile;
        }
        
        @Override
        public Map<VnfProfileKey, VnfProfile> getVnfProfile() {
            return _vnfProfile;
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
            result = prime * result + Objects.hashCode(_dependencies);
            result = prime * result + Objects.hashCode(_flavourKey);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_monitoredInfo);
            result = prime * result + Objects.hashCode(_nsInstantiationLevel);
            result = prime * result + Objects.hashCode(_nsProfile);
            result = prime * result + Objects.hashCode(_pnfProfile);
            result = prime * result + Objects.hashCode(_scalingAspect);
            result = prime * result + Objects.hashCode(_virtualLinkProfile);
            result = prime * result + Objects.hashCode(_vnfProfile);
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
            if (!Objects.equals(_dependencies, other.getDependencies())) {
                return false;
            }
            if (!Objects.equals(_flavourKey, other.getFlavourKey())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_monitoredInfo, other.getMonitoredInfo())) {
                return false;
            }
            if (!Objects.equals(_nsInstantiationLevel, other.getNsInstantiationLevel())) {
                return false;
            }
            if (!Objects.equals(_nsProfile, other.getNsProfile())) {
                return false;
            }
            if (!Objects.equals(_pnfProfile, other.getPnfProfile())) {
                return false;
            }
            if (!Objects.equals(_scalingAspect, other.getScalingAspect())) {
                return false;
            }
            if (!Objects.equals(_virtualLinkProfile, other.getVirtualLinkProfile())) {
                return false;
            }
            if (!Objects.equals(_vnfProfile, other.getVnfProfile())) {
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
            CodeHelpers.appendValue(helper, "_dependencies", _dependencies);
            CodeHelpers.appendValue(helper, "_flavourKey", _flavourKey);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_monitoredInfo", _monitoredInfo);
            CodeHelpers.appendValue(helper, "_nsInstantiationLevel", _nsInstantiationLevel);
            CodeHelpers.appendValue(helper, "_nsProfile", _nsProfile);
            CodeHelpers.appendValue(helper, "_pnfProfile", _pnfProfile);
            CodeHelpers.appendValue(helper, "_scalingAspect", _scalingAspect);
            CodeHelpers.appendValue(helper, "_virtualLinkProfile", _virtualLinkProfile);
            CodeHelpers.appendValue(helper, "_vnfProfile", _vnfProfile);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
