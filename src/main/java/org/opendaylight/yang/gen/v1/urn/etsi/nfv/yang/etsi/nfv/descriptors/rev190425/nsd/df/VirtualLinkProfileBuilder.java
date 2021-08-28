package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.local.affinity.or.anti.affinity.rule.LocalAffinityOrAntiAffinityRule;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.local.affinity.or.anti.affinity.rule.LocalAffinityOrAntiAffinityRuleKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.AffinityOrAntiAffinityGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.AffinityOrAntiAffinityGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.MaxBitrateRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.MinBitrateRequirements;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VirtualLinkProfileBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualLinkProfileBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualLinkProfileBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualLinkProfileBuilder, as instances can be freely passed around without
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
 * @see VirtualLinkProfileBuilder
 * @see Builder
 *
 */
public class VirtualLinkProfileBuilder implements Builder<VirtualLinkProfile> {

    private Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> _affinityOrAntiAffinityGroup;
    private String _flavourId;
    private String _id;
    private Map<LocalAffinityOrAntiAffinityRuleKey, LocalAffinityOrAntiAffinityRule> _localAffinityOrAntiAffinityRule;
    private MaxBitrateRequirements _maxBitrateRequirements;
    private MinBitrateRequirements _minBitrateRequirements;
    private String _virtualLinkDescId;
    private VirtualLinkProfileKey key;


    Map<Class<? extends Augmentation<VirtualLinkProfile>>, Augmentation<VirtualLinkProfile>> augmentation = Collections.emptyMap();

    public VirtualLinkProfileBuilder() {
    }
    public VirtualLinkProfileBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LocalAffinityOrAntiAffinityRule arg) {
        this._localAffinityOrAntiAffinityRule = arg.getLocalAffinityOrAntiAffinityRule();
    }

    public VirtualLinkProfileBuilder(VirtualLinkProfile base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VirtualLinkProfile>>, Augmentation<VirtualLinkProfile>> aug =((AugmentationHolder<VirtualLinkProfile>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._affinityOrAntiAffinityGroup = base.getAffinityOrAntiAffinityGroup();
        this._flavourId = base.getFlavourId();
        this._localAffinityOrAntiAffinityRule = base.getLocalAffinityOrAntiAffinityRule();
        this._maxBitrateRequirements = base.getMaxBitrateRequirements();
        this._minBitrateRequirements = base.getMinBitrateRequirements();
        this._virtualLinkDescId = base.getVirtualLinkDescId();
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

    public VirtualLinkProfileKey key() {
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
    
    public Map<LocalAffinityOrAntiAffinityRuleKey, LocalAffinityOrAntiAffinityRule> getLocalAffinityOrAntiAffinityRule() {
        return _localAffinityOrAntiAffinityRule;
    }
    
    public MaxBitrateRequirements getMaxBitrateRequirements() {
        return _maxBitrateRequirements;
    }
    
    public MinBitrateRequirements getMinBitrateRequirements() {
        return _minBitrateRequirements;
    }
    
    public String getVirtualLinkDescId() {
        return _virtualLinkDescId;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VirtualLinkProfile>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VirtualLinkProfileBuilder withKey(final VirtualLinkProfileKey key) {
        this.key = key;
        return this;
    }
    public VirtualLinkProfileBuilder setAffinityOrAntiAffinityGroup(final Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> values) {
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
    public VirtualLinkProfileBuilder setAffinityOrAntiAffinityGroup(final List<AffinityOrAntiAffinityGroup> values) {
        return setAffinityOrAntiAffinityGroup(CodeHelpers.compatMap(values));
    }
    
    public VirtualLinkProfileBuilder setFlavourId(final String value) {
        this._flavourId = value;
        return this;
    }
    
    public VirtualLinkProfileBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public VirtualLinkProfileBuilder setLocalAffinityOrAntiAffinityRule(final Map<LocalAffinityOrAntiAffinityRuleKey, LocalAffinityOrAntiAffinityRule> values) {
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
    public VirtualLinkProfileBuilder setLocalAffinityOrAntiAffinityRule(final List<LocalAffinityOrAntiAffinityRule> values) {
        return setLocalAffinityOrAntiAffinityRule(CodeHelpers.compatMap(values));
    }
    
    public VirtualLinkProfileBuilder setMaxBitrateRequirements(final MaxBitrateRequirements value) {
        this._maxBitrateRequirements = value;
        return this;
    }
    
    public VirtualLinkProfileBuilder setMinBitrateRequirements(final MinBitrateRequirements value) {
        this._minBitrateRequirements = value;
        return this;
    }
    
    public VirtualLinkProfileBuilder setVirtualLinkDescId(final String value) {
        this._virtualLinkDescId = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VirtualLinkProfileBuilder addAugmentation(Augmentation<VirtualLinkProfile> augmentation) {
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
    public VirtualLinkProfileBuilder addAugmentation(Class<? extends Augmentation<VirtualLinkProfile>> augmentationType, Augmentation<VirtualLinkProfile> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VirtualLinkProfileBuilder removeAugmentation(Class<? extends Augmentation<VirtualLinkProfile>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VirtualLinkProfileBuilder doAddAugmentation(Class<? extends Augmentation<VirtualLinkProfile>> augmentationType, Augmentation<VirtualLinkProfile> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VirtualLinkProfile build() {
        return new VirtualLinkProfileImpl(this);
    }

    private static final class VirtualLinkProfileImpl
        extends AbstractAugmentable<VirtualLinkProfile>
        implements VirtualLinkProfile {
    
        private final Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> _affinityOrAntiAffinityGroup;
        private final String _flavourId;
        private final String _id;
        private final Map<LocalAffinityOrAntiAffinityRuleKey, LocalAffinityOrAntiAffinityRule> _localAffinityOrAntiAffinityRule;
        private final MaxBitrateRequirements _maxBitrateRequirements;
        private final MinBitrateRequirements _minBitrateRequirements;
        private final String _virtualLinkDescId;
        private final VirtualLinkProfileKey key;
    
        VirtualLinkProfileImpl(VirtualLinkProfileBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VirtualLinkProfileKey(base.getId());
            }
            this._id = key.getId();
            this._affinityOrAntiAffinityGroup = CodeHelpers.emptyToNull(base.getAffinityOrAntiAffinityGroup());
            this._flavourId = base.getFlavourId();
            this._localAffinityOrAntiAffinityRule = CodeHelpers.emptyToNull(base.getLocalAffinityOrAntiAffinityRule());
            this._maxBitrateRequirements = base.getMaxBitrateRequirements();
            this._minBitrateRequirements = base.getMinBitrateRequirements();
            this._virtualLinkDescId = base.getVirtualLinkDescId();
        }
    
        @Override
        public VirtualLinkProfileKey key() {
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
        public Map<LocalAffinityOrAntiAffinityRuleKey, LocalAffinityOrAntiAffinityRule> getLocalAffinityOrAntiAffinityRule() {
            return _localAffinityOrAntiAffinityRule;
        }
        
        @Override
        public MaxBitrateRequirements getMaxBitrateRequirements() {
            return _maxBitrateRequirements;
        }
        
        @Override
        public MinBitrateRequirements getMinBitrateRequirements() {
            return _minBitrateRequirements;
        }
        
        @Override
        public String getVirtualLinkDescId() {
            return _virtualLinkDescId;
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
            result = prime * result + Objects.hashCode(_localAffinityOrAntiAffinityRule);
            result = prime * result + Objects.hashCode(_maxBitrateRequirements);
            result = prime * result + Objects.hashCode(_minBitrateRequirements);
            result = prime * result + Objects.hashCode(_virtualLinkDescId);
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
            if (!VirtualLinkProfile.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualLinkProfile other = (VirtualLinkProfile)obj;
            if (!Objects.equals(_affinityOrAntiAffinityGroup, other.getAffinityOrAntiAffinityGroup())) {
                return false;
            }
            if (!Objects.equals(_flavourId, other.getFlavourId())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_localAffinityOrAntiAffinityRule, other.getLocalAffinityOrAntiAffinityRule())) {
                return false;
            }
            if (!Objects.equals(_maxBitrateRequirements, other.getMaxBitrateRequirements())) {
                return false;
            }
            if (!Objects.equals(_minBitrateRequirements, other.getMinBitrateRequirements())) {
                return false;
            }
            if (!Objects.equals(_virtualLinkDescId, other.getVirtualLinkDescId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualLinkProfileImpl otherImpl = (VirtualLinkProfileImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VirtualLinkProfile>>, Augmentation<VirtualLinkProfile>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualLinkProfile");
            CodeHelpers.appendValue(helper, "_affinityOrAntiAffinityGroup", _affinityOrAntiAffinityGroup);
            CodeHelpers.appendValue(helper, "_flavourId", _flavourId);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_localAffinityOrAntiAffinityRule", _localAffinityOrAntiAffinityRule);
            CodeHelpers.appendValue(helper, "_maxBitrateRequirements", _maxBitrateRequirements);
            CodeHelpers.appendValue(helper, "_minBitrateRequirements", _minBitrateRequirements);
            CodeHelpers.appendValue(helper, "_virtualLinkDescId", _virtualLinkDescId);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
