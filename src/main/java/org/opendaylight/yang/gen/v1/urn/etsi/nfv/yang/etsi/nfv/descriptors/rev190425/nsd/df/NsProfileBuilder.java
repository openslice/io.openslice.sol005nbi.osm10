package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.profile.AffinityOrAntiAffinityGroupId;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.profile.AffinityOrAntiAffinityGroupIdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.profile.VirtualLinkConnectivity;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.profile.VirtualLinkConnectivityKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint16;

/**
 * Class that builds {@link NsProfileBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NsProfileBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NsProfileBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NsProfileBuilder, as instances can be freely passed around without
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
 * @see NsProfileBuilder
 * @see Builder
 *
 */
public class NsProfileBuilder implements Builder<NsProfile> {

    private Map<AffinityOrAntiAffinityGroupIdKey, AffinityOrAntiAffinityGroupId> _affinityOrAntiAffinityGroupId;
    private String _id;
    private String _instantiationLevelId;
    private Uint16 _maxNumberOfInstances;
    private Uint16 _minNumberOfInstances;
    private String _nsDfId;
    private String _nsdId;
    private Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> _virtualLinkConnectivity;
    private NsProfileKey key;


    Map<Class<? extends Augmentation<NsProfile>>, Augmentation<NsProfile>> augmentation = Collections.emptyMap();

    public NsProfileBuilder() {
    }

    public NsProfileBuilder(NsProfile base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NsProfile>>, Augmentation<NsProfile>> aug =((AugmentationHolder<NsProfile>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._affinityOrAntiAffinityGroupId = base.getAffinityOrAntiAffinityGroupId();
        this._instantiationLevelId = base.getInstantiationLevelId();
        this._maxNumberOfInstances = base.getMaxNumberOfInstances();
        this._minNumberOfInstances = base.getMinNumberOfInstances();
        this._nsDfId = base.getNsDfId();
        this._nsdId = base.getNsdId();
        this._virtualLinkConnectivity = base.getVirtualLinkConnectivity();
    }


    public NsProfileKey key() {
        return key;
    }
    
    public Map<AffinityOrAntiAffinityGroupIdKey, AffinityOrAntiAffinityGroupId> getAffinityOrAntiAffinityGroupId() {
        return _affinityOrAntiAffinityGroupId;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getInstantiationLevelId() {
        return _instantiationLevelId;
    }
    
    public Uint16 getMaxNumberOfInstances() {
        return _maxNumberOfInstances;
    }
    
    public Uint16 getMinNumberOfInstances() {
        return _minNumberOfInstances;
    }
    
    public String getNsDfId() {
        return _nsDfId;
    }
    
    public String getNsdId() {
        return _nsdId;
    }
    
    public Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> getVirtualLinkConnectivity() {
        return _virtualLinkConnectivity;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<NsProfile>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NsProfileBuilder withKey(final NsProfileKey key) {
        this.key = key;
        return this;
    }
    public NsProfileBuilder setAffinityOrAntiAffinityGroupId(final Map<AffinityOrAntiAffinityGroupIdKey, AffinityOrAntiAffinityGroupId> values) {
        this._affinityOrAntiAffinityGroupId = values;
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
      * @deprecated Use {#link #setAffinityOrAntiAffinityGroupId(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsProfileBuilder setAffinityOrAntiAffinityGroupId(final List<AffinityOrAntiAffinityGroupId> values) {
        return setAffinityOrAntiAffinityGroupId(CodeHelpers.compatMap(values));
    }
    
    public NsProfileBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public NsProfileBuilder setInstantiationLevelId(final String value) {
        this._instantiationLevelId = value;
        return this;
    }
    
    public NsProfileBuilder setMaxNumberOfInstances(final Uint16 value) {
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
    public NsProfileBuilder setMaxNumberOfInstances(final Integer value) {
        return setMaxNumberOfInstances(CodeHelpers.compatUint(value));
    }
    
    public NsProfileBuilder setMinNumberOfInstances(final Uint16 value) {
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
    public NsProfileBuilder setMinNumberOfInstances(final Integer value) {
        return setMinNumberOfInstances(CodeHelpers.compatUint(value));
    }
    
    public NsProfileBuilder setNsDfId(final String value) {
        this._nsDfId = value;
        return this;
    }
    
    public NsProfileBuilder setNsdId(final String value) {
        this._nsdId = value;
        return this;
    }
    public NsProfileBuilder setVirtualLinkConnectivity(final Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> values) {
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
    public NsProfileBuilder setVirtualLinkConnectivity(final List<VirtualLinkConnectivity> values) {
        return setVirtualLinkConnectivity(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NsProfileBuilder addAugmentation(Augmentation<NsProfile> augmentation) {
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
    public NsProfileBuilder addAugmentation(Class<? extends Augmentation<NsProfile>> augmentationType, Augmentation<NsProfile> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NsProfileBuilder removeAugmentation(Class<? extends Augmentation<NsProfile>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NsProfileBuilder doAddAugmentation(Class<? extends Augmentation<NsProfile>> augmentationType, Augmentation<NsProfile> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public NsProfile build() {
        return new NsProfileImpl(this);
    }

    private static final class NsProfileImpl
        extends AbstractAugmentable<NsProfile>
        implements NsProfile {
    
        private final Map<AffinityOrAntiAffinityGroupIdKey, AffinityOrAntiAffinityGroupId> _affinityOrAntiAffinityGroupId;
        private final String _id;
        private final String _instantiationLevelId;
        private final Uint16 _maxNumberOfInstances;
        private final Uint16 _minNumberOfInstances;
        private final String _nsDfId;
        private final String _nsdId;
        private final Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> _virtualLinkConnectivity;
        private final NsProfileKey key;
    
        NsProfileImpl(NsProfileBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NsProfileKey(base.getId());
            }
            this._id = key.getId();
            this._affinityOrAntiAffinityGroupId = CodeHelpers.emptyToNull(base.getAffinityOrAntiAffinityGroupId());
            this._instantiationLevelId = base.getInstantiationLevelId();
            this._maxNumberOfInstances = base.getMaxNumberOfInstances();
            this._minNumberOfInstances = base.getMinNumberOfInstances();
            this._nsDfId = base.getNsDfId();
            this._nsdId = base.getNsdId();
            this._virtualLinkConnectivity = CodeHelpers.emptyToNull(base.getVirtualLinkConnectivity());
        }
    
        @Override
        public NsProfileKey key() {
            return key;
        }
        
        @Override
        public Map<AffinityOrAntiAffinityGroupIdKey, AffinityOrAntiAffinityGroupId> getAffinityOrAntiAffinityGroupId() {
            return _affinityOrAntiAffinityGroupId;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getInstantiationLevelId() {
            return _instantiationLevelId;
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
        public String getNsDfId() {
            return _nsDfId;
        }
        
        @Override
        public String getNsdId() {
            return _nsdId;
        }
        
        @Override
        public Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> getVirtualLinkConnectivity() {
            return _virtualLinkConnectivity;
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
            result = prime * result + Objects.hashCode(_affinityOrAntiAffinityGroupId);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_instantiationLevelId);
            result = prime * result + Objects.hashCode(_maxNumberOfInstances);
            result = prime * result + Objects.hashCode(_minNumberOfInstances);
            result = prime * result + Objects.hashCode(_nsDfId);
            result = prime * result + Objects.hashCode(_nsdId);
            result = prime * result + Objects.hashCode(_virtualLinkConnectivity);
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
            if (!NsProfile.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            NsProfile other = (NsProfile)obj;
            if (!Objects.equals(_affinityOrAntiAffinityGroupId, other.getAffinityOrAntiAffinityGroupId())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_instantiationLevelId, other.getInstantiationLevelId())) {
                return false;
            }
            if (!Objects.equals(_maxNumberOfInstances, other.getMaxNumberOfInstances())) {
                return false;
            }
            if (!Objects.equals(_minNumberOfInstances, other.getMinNumberOfInstances())) {
                return false;
            }
            if (!Objects.equals(_nsDfId, other.getNsDfId())) {
                return false;
            }
            if (!Objects.equals(_nsdId, other.getNsdId())) {
                return false;
            }
            if (!Objects.equals(_virtualLinkConnectivity, other.getVirtualLinkConnectivity())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsProfileImpl otherImpl = (NsProfileImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NsProfile>>, Augmentation<NsProfile>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NsProfile");
            CodeHelpers.appendValue(helper, "_affinityOrAntiAffinityGroupId", _affinityOrAntiAffinityGroupId);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_instantiationLevelId", _instantiationLevelId);
            CodeHelpers.appendValue(helper, "_maxNumberOfInstances", _maxNumberOfInstances);
            CodeHelpers.appendValue(helper, "_minNumberOfInstances", _minNumberOfInstances);
            CodeHelpers.appendValue(helper, "_nsDfId", _nsDfId);
            CodeHelpers.appendValue(helper, "_nsdId", _nsdId);
            CodeHelpers.appendValue(helper, "_virtualLinkConnectivity", _virtualLinkConnectivity);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
