package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_common_params.IpProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_params.VnfdConnectionPointRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_params.VnfdConnectionPointRefKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VldBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VldBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VldBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VldBuilder, as instances can be freely passed around without
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
 * @see VldBuilder
 * @see Builder
 *
 */
public class VldBuilder implements Builder<Vld> {

    private IpProfile _ipProfile;
    private String _name;
    private String _vimNetworkName;
    private Map<VnfdConnectionPointRefKey, VnfdConnectionPointRef> _vnfdConnectionPointRef;
    private VldKey key;


    Map<Class<? extends Augmentation<Vld>>, Augmentation<Vld>> augmentation = Collections.emptyMap();

    public VldBuilder() {
    }
    public VldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldParams arg) {
        this._vnfdConnectionPointRef = arg.getVnfdConnectionPointRef();
        this._name = arg.getName();
        this._vimNetworkName = arg.getVimNetworkName();
        this._ipProfile = arg.getIpProfile();
    }
    public VldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams arg) {
        this._name = arg.getName();
        this._vimNetworkName = arg.getVimNetworkName();
        this._ipProfile = arg.getIpProfile();
    }

    public VldBuilder(Vld base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vld>>, Augmentation<Vld>> aug =((AugmentationHolder<Vld>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._ipProfile = base.getIpProfile();
        this._vimNetworkName = base.getVimNetworkName();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldParams</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldParams) {
            this._vnfdConnectionPointRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldParams)arg).getVnfdConnectionPointRef();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams)arg).getName();
            this._vimNetworkName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams)arg).getVimNetworkName();
            this._ipProfile = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams)arg).getIpProfile();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldParams, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams]");
    }

    public VldKey key() {
        return key;
    }
    
    public IpProfile getIpProfile() {
        return _ipProfile;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getVimNetworkName() {
        return _vimNetworkName;
    }
    
    public Map<VnfdConnectionPointRefKey, VnfdConnectionPointRef> getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Vld>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VldBuilder withKey(final VldKey key) {
        this.key = key;
        return this;
    }
    
    public VldBuilder setIpProfile(final IpProfile value) {
        this._ipProfile = value;
        return this;
    }
    
    public VldBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VldBuilder setVimNetworkName(final String value) {
        this._vimNetworkName = value;
        return this;
    }
    public VldBuilder setVnfdConnectionPointRef(final Map<VnfdConnectionPointRefKey, VnfdConnectionPointRef> values) {
        this._vnfdConnectionPointRef = values;
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
      * @deprecated Use {#link #setVnfdConnectionPointRef(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VldBuilder setVnfdConnectionPointRef(final List<VnfdConnectionPointRef> values) {
        return setVnfdConnectionPointRef(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VldBuilder addAugmentation(Augmentation<Vld> augmentation) {
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
    public VldBuilder addAugmentation(Class<? extends Augmentation<Vld>> augmentationType, Augmentation<Vld> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VldBuilder removeAugmentation(Class<? extends Augmentation<Vld>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VldBuilder doAddAugmentation(Class<? extends Augmentation<Vld>> augmentationType, Augmentation<Vld> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Vld build() {
        return new VldImpl(this);
    }

    private static final class VldImpl
        extends AbstractAugmentable<Vld>
        implements Vld {
    
        private final IpProfile _ipProfile;
        private final String _name;
        private final String _vimNetworkName;
        private final Map<VnfdConnectionPointRefKey, VnfdConnectionPointRef> _vnfdConnectionPointRef;
        private final VldKey key;
    
        VldImpl(VldBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VldKey(base.getName());
            }
            this._name = key.getName();
            this._ipProfile = base.getIpProfile();
            this._vimNetworkName = base.getVimNetworkName();
            this._vnfdConnectionPointRef = CodeHelpers.emptyToNull(base.getVnfdConnectionPointRef());
        }
    
        @Override
        public VldKey key() {
            return key;
        }
        
        @Override
        public IpProfile getIpProfile() {
            return _ipProfile;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getVimNetworkName() {
            return _vimNetworkName;
        }
        
        @Override
        public Map<VnfdConnectionPointRefKey, VnfdConnectionPointRef> getVnfdConnectionPointRef() {
            return _vnfdConnectionPointRef;
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
            result = prime * result + Objects.hashCode(_ipProfile);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_vimNetworkName);
            result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
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
            if (!Vld.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Vld other = (Vld)obj;
            if (!Objects.equals(_ipProfile, other.getIpProfile())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_vimNetworkName, other.getVimNetworkName())) {
                return false;
            }
            if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VldImpl otherImpl = (VldImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vld>>, Augmentation<Vld>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vld");
            CodeHelpers.appendValue(helper, "_ipProfile", _ipProfile);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_vimNetworkName", _vimNetworkName);
            CodeHelpers.appendValue(helper, "_vnfdConnectionPointRef", _vnfdConnectionPointRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
