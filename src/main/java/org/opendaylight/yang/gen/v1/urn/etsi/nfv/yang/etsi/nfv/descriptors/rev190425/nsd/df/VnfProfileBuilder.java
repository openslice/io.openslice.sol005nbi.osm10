package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.local.affinity.or.anti.affinity.rule.LocalAffinityOrAntiAffinityRule;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.local.affinity.or.anti.affinity.rule.LocalAffinityOrAntiAffinityRuleKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.NsdBuilder;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.AffinityOrAntiAffinityGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.AffinityOrAntiAffinityGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.VirtualLinkConnectivity;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.VirtualLinkConnectivityKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint16;

/**
 * Class that builds {@link VnfProfileBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VnfProfileBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VnfProfileBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VnfProfileBuilder, as instances can be freely passed around without
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
 * @see VnfProfileBuilder
 * @see Builder
 *
 */
public class VnfProfileBuilder implements Builder<VnfProfile> {

    private Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> _affinityOrAntiAffinityGroup;
    private String _flavourId;
    private String _id;
    private String _instantiationLevel;
    private Map<LocalAffinityOrAntiAffinityRuleKey, LocalAffinityOrAntiAffinityRule> _localAffinityOrAntiAffinityRule;
    private Uint16 _maxNumberOfInstances;
    private Uint16 _minNumberOfInstances;
    private Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> _virtualLinkConnectivity;
    private String _vnfdId;
    private VnfProfileKey key;


    Map<Class<? extends Augmentation<VnfProfile>>, Augmentation<VnfProfile>> augmentation = Collections.emptyMap();

    public VnfProfileBuilder() {
    }
    public VnfProfileBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LocalAffinityOrAntiAffinityRule arg) {
        this._localAffinityOrAntiAffinityRule = arg.getLocalAffinityOrAntiAffinityRule();
    }

    public VnfProfileBuilder(VnfProfile base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfProfile>>, Augmentation<VnfProfile>> aug =((AugmentationHolder<VnfProfile>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._affinityOrAntiAffinityGroup = base.getAffinityOrAntiAffinityGroup();
        this._flavourId = base.getFlavourId();
        this._instantiationLevel = base.getInstantiationLevel();
        this._localAffinityOrAntiAffinityRule = base.getLocalAffinityOrAntiAffinityRule();
        this._maxNumberOfInstances = base.getMaxNumberOfInstances();
        this._minNumberOfInstances = base.getMinNumberOfInstances();
        this._virtualLinkConnectivity = base.getVirtualLinkConnectivity();
        this._vnfdId = base.getVnfdId();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LocalAffinityOrAntiAffinityRule</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LocalAffinityOrAntiAffinityRule) {
            this._localAffinityOrAntiAffinityRule = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LocalAffinityOrAntiAffinityRule)arg).getLocalAffinityOrAntiAffinityRule();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LocalAffinityOrAntiAffinityRule]");
    }

    public VnfProfileKey key() {
        return key;
    }
    
    public Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> getAffinityOrAntiAffinityGroup() {
        return _affinityOrAntiAffinityGroup;
    }
    
    public String getFlavourId() {
        return _flavourId;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getInstantiationLevel() {
        return _instantiationLevel;
    }
    
    public Map<LocalAffinityOrAntiAffinityRuleKey, LocalAffinityOrAntiAffinityRule> getLocalAffinityOrAntiAffinityRule() {
        return _localAffinityOrAntiAffinityRule;
    }
    
    public Uint16 getMaxNumberOfInstances() {
        return _maxNumberOfInstances;
    }
    
    public Uint16 getMinNumberOfInstances() {
        return _minNumberOfInstances;
    }
    
    public Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> getVirtualLinkConnectivity() {
        return _virtualLinkConnectivity;
    }
    
    public String getVnfdId() {
        return _vnfdId;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VnfProfile>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VnfProfileBuilder withKey(final VnfProfileKey key) {
        this.key = key;
        return this;
    }
    public VnfProfileBuilder setAffinityOrAntiAffinityGroup(final Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> values) {
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
    public VnfProfileBuilder setAffinityOrAntiAffinityGroup(final List<AffinityOrAntiAffinityGroup> values) {
        return setAffinityOrAntiAffinityGroup(CodeHelpers.compatMap(values));
    }
    
    public VnfProfileBuilder setFlavourId(final String value) {
        this._flavourId = value;
        return this;
    }
    
    public VnfProfileBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public VnfProfileBuilder setInstantiationLevel(final String value) {
        this._instantiationLevel = value;
        return this;
    }
    public VnfProfileBuilder setLocalAffinityOrAntiAffinityRule(final Map<LocalAffinityOrAntiAffinityRuleKey, LocalAffinityOrAntiAffinityRule> values) {
        this._localAffinityOrAntiAffinityRule = values;
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
      * @deprecated Use {#link #setLocalAffinityOrAntiAffinityRule(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfProfileBuilder setLocalAffinityOrAntiAffinityRule(final List<LocalAffinityOrAntiAffinityRule> values) {
        return setLocalAffinityOrAntiAffinityRule(CodeHelpers.compatMap(values));
    }
    
    public VnfProfileBuilder setMaxNumberOfInstances(final Uint16 value) {
        this._maxNumberOfInstances = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setMaxNumberOfInstances(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public VnfProfileBuilder setMaxNumberOfInstances(final Integer value) {
        return setMaxNumberOfInstances(CodeHelpers.compatUint(value));
    }
    
    public VnfProfileBuilder setMinNumberOfInstances(final Uint16 value) {
        this._minNumberOfInstances = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setMinNumberOfInstances(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public VnfProfileBuilder setMinNumberOfInstances(final Integer value) {
        return setMinNumberOfInstances(CodeHelpers.compatUint(value));
    }
    public VnfProfileBuilder setVirtualLinkConnectivity(final Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> values) {
        this._virtualLinkConnectivity = values;
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
      * @deprecated Use {#link #setVirtualLinkConnectivity(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfProfileBuilder setVirtualLinkConnectivity(final List<VirtualLinkConnectivity> values) {
        return setVirtualLinkConnectivity(CodeHelpers.compatMap(values));
    }
    
    public VnfProfileBuilder setVnfdId(final String value) {
        this._vnfdId = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VnfProfileBuilder addAugmentation(Augmentation<VnfProfile> augmentation) {
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
    public VnfProfileBuilder addAugmentation(Class<? extends Augmentation<VnfProfile>> augmentationType, Augmentation<VnfProfile> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VnfProfileBuilder removeAugmentation(Class<? extends Augmentation<VnfProfile>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VnfProfileBuilder doAddAugmentation(Class<? extends Augmentation<VnfProfile>> augmentationType, Augmentation<VnfProfile> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VnfProfile build() {
        return new VnfProfileImpl(this);
    }

    public static final class VnfProfileImpl
        extends AbstractAugmentable<VnfProfile>
        implements VnfProfile {
    
        private final Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> _affinityOrAntiAffinityGroup;
        private final String _flavourId;
        @JsonProperty("id")
        private final String _id;
        private final String _instantiationLevel;
        private final Map<LocalAffinityOrAntiAffinityRuleKey, LocalAffinityOrAntiAffinityRule> _localAffinityOrAntiAffinityRule;
        private final Uint16 _maxNumberOfInstances;
        private final Uint16 _minNumberOfInstances;
        private final Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> _virtualLinkConnectivity;
        @JsonProperty("vnfd-id")
        private final String _vnfdId;
        private VnfProfileKey key;
    
        VnfProfileImpl(VnfProfileBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfProfileKey(base.getId());
            }
            this._id = key.getId();
            this._affinityOrAntiAffinityGroup = CodeHelpers.emptyToNull(base.getAffinityOrAntiAffinityGroup());
            this._flavourId = base.getFlavourId();
            this._instantiationLevel = base.getInstantiationLevel();
            this._localAffinityOrAntiAffinityRule = CodeHelpers.emptyToNull(base.getLocalAffinityOrAntiAffinityRule());
            this._maxNumberOfInstances = base.getMaxNumberOfInstances();
            this._minNumberOfInstances = base.getMinNumberOfInstances();
            this._virtualLinkConnectivity = CodeHelpers.emptyToNull(base.getVirtualLinkConnectivity());
            this._vnfdId = base.getVnfdId();
        }
    
        public VnfProfileImpl(){
        	this( new VnfProfileBuilder() );
        }           
        
        @Override
        public VnfProfileKey key() {
            return key;
        }
        
        @Override
        public Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> getAffinityOrAntiAffinityGroup() {
            return _affinityOrAntiAffinityGroup;
        }
        
        @Override
        public String getFlavourId() {
            return _flavourId;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getInstantiationLevel() {
            return _instantiationLevel;
        }
        
        @Override
        public Map<LocalAffinityOrAntiAffinityRuleKey, LocalAffinityOrAntiAffinityRule> getLocalAffinityOrAntiAffinityRule() {
            return _localAffinityOrAntiAffinityRule;
        }
        
        @Override
        public Uint16 getMaxNumberOfInstances() {
            return _maxNumberOfInstances;
        }
        
        @Override
        public Uint16 getMinNumberOfInstances() {
            return _minNumberOfInstances;
        }
        
        @Override
        public Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> getVirtualLinkConnectivity() {
            return _virtualLinkConnectivity;
        }
        
        @Override
        public String getVnfdId() {
            return _vnfdId;
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
            result = prime * result + Objects.hashCode(_flavourId);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_instantiationLevel);
            result = prime * result + Objects.hashCode(_localAffinityOrAntiAffinityRule);
            result = prime * result + Objects.hashCode(_maxNumberOfInstances);
            result = prime * result + Objects.hashCode(_minNumberOfInstances);
            result = prime * result + Objects.hashCode(_virtualLinkConnectivity);
            result = prime * result + Objects.hashCode(_vnfdId);
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
            if (!VnfProfile.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VnfProfile other = (VnfProfile)obj;
            if (!Objects.equals(_affinityOrAntiAffinityGroup, other.getAffinityOrAntiAffinityGroup())) {
                return false;
            }
            if (!Objects.equals(_flavourId, other.getFlavourId())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_instantiationLevel, other.getInstantiationLevel())) {
                return false;
            }
            if (!Objects.equals(_localAffinityOrAntiAffinityRule, other.getLocalAffinityOrAntiAffinityRule())) {
                return false;
            }
            if (!Objects.equals(_maxNumberOfInstances, other.getMaxNumberOfInstances())) {
                return false;
            }
            if (!Objects.equals(_minNumberOfInstances, other.getMinNumberOfInstances())) {
                return false;
            }
            if (!Objects.equals(_virtualLinkConnectivity, other.getVirtualLinkConnectivity())) {
                return false;
            }
            if (!Objects.equals(_vnfdId, other.getVnfdId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfProfileImpl otherImpl = (VnfProfileImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfProfile>>, Augmentation<VnfProfile>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfProfile");
            CodeHelpers.appendValue(helper, "_affinityOrAntiAffinityGroup", _affinityOrAntiAffinityGroup);
            CodeHelpers.appendValue(helper, "_flavourId", _flavourId);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_instantiationLevel", _instantiationLevel);
            CodeHelpers.appendValue(helper, "_localAffinityOrAntiAffinityRule", _localAffinityOrAntiAffinityRule);
            CodeHelpers.appendValue(helper, "_maxNumberOfInstances", _maxNumberOfInstances);
            CodeHelpers.appendValue(helper, "_minNumberOfInstances", _minNumberOfInstances);
            CodeHelpers.appendValue(helper, "_virtualLinkConnectivity", _virtualLinkConnectivity);
            CodeHelpers.appendValue(helper, "_vnfdId", _vnfdId);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
