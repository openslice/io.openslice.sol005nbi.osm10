package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_vld_params.NssConnectionPointRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_vld_params.NssConnectionPointRefKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetsliceVldBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NetsliceVldBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NetsliceVldBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NetsliceVldBuilder, as instances can be freely passed around without
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
 * @see NetsliceVldBuilder
 * @see Builder
 *
 */
public class NetsliceVldBuilder implements Builder<NetsliceVld> {

    private IpProfile _ipProfile;
    private String _name;
    private Map<NssConnectionPointRefKey, NssConnectionPointRef> _nssConnectionPointRef;
    private String _vimNetworkName;
    private NetsliceVldKey key;


    Map<Class<? extends Augmentation<NetsliceVld>>, Augmentation<NetsliceVld>> augmentation = Collections.emptyMap();

    public NetsliceVldBuilder() {
    }
    public NetsliceVldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceVldParams arg) {
        this._nssConnectionPointRef = arg.getNssConnectionPointRef();
        this._name = arg.getName();
        this._vimNetworkName = arg.getVimNetworkName();
        this._ipProfile = arg.getIpProfile();
    }
    public NetsliceVldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams arg) {
        this._name = arg.getName();
        this._vimNetworkName = arg.getVimNetworkName();
        this._ipProfile = arg.getIpProfile();
    }

    public NetsliceVldBuilder(NetsliceVld base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NetsliceVld>>, Augmentation<NetsliceVld>> aug =((AugmentationHolder<NetsliceVld>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._ipProfile = base.getIpProfile();
        this._nssConnectionPointRef = base.getNssConnectionPointRef();
        this._vimNetworkName = base.getVimNetworkName();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceVldParams</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceVldParams) {
            this._nssConnectionPointRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceVldParams)arg).getNssConnectionPointRef();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams)arg).getName();
            this._vimNetworkName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams)arg).getVimNetworkName();
            this._ipProfile = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams)arg).getIpProfile();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceVldParams, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams]");
    }

    public NetsliceVldKey key() {
        return key;
    }
    
    public IpProfile getIpProfile() {
        return _ipProfile;
    }
    
    public String getName() {
        return _name;
    }
    
    public Map<NssConnectionPointRefKey, NssConnectionPointRef> getNssConnectionPointRef() {
        return _nssConnectionPointRef;
    }
    
    public String getVimNetworkName() {
        return _vimNetworkName;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<NetsliceVld>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NetsliceVldBuilder withKey(final NetsliceVldKey key) {
        this.key = key;
        return this;
    }
    
    public NetsliceVldBuilder setIpProfile(final IpProfile value) {
        this._ipProfile = value;
        return this;
    }
    
    public NetsliceVldBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public NetsliceVldBuilder setNssConnectionPointRef(final Map<NssConnectionPointRefKey, NssConnectionPointRef> values) {
        this._nssConnectionPointRef = values;
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
      * @deprecated Use {#link #setNssConnectionPointRef(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NetsliceVldBuilder setNssConnectionPointRef(final List<NssConnectionPointRef> values) {
        return setNssConnectionPointRef(CodeHelpers.compatMap(values));
    }
    
    public NetsliceVldBuilder setVimNetworkName(final String value) {
        this._vimNetworkName = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NetsliceVldBuilder addAugmentation(Augmentation<NetsliceVld> augmentation) {
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
    public NetsliceVldBuilder addAugmentation(Class<? extends Augmentation<NetsliceVld>> augmentationType, Augmentation<NetsliceVld> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NetsliceVldBuilder removeAugmentation(Class<? extends Augmentation<NetsliceVld>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NetsliceVldBuilder doAddAugmentation(Class<? extends Augmentation<NetsliceVld>> augmentationType, Augmentation<NetsliceVld> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public NetsliceVld build() {
        return new NetsliceVldImpl(this);
    }

    private static final class NetsliceVldImpl
        extends AbstractAugmentable<NetsliceVld>
        implements NetsliceVld {
    
        private final IpProfile _ipProfile;
        private final String _name;
        private final Map<NssConnectionPointRefKey, NssConnectionPointRef> _nssConnectionPointRef;
        private final String _vimNetworkName;
        private final NetsliceVldKey key;
    
        NetsliceVldImpl(NetsliceVldBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetsliceVldKey(base.getName());
            }
            this._name = key.getName();
            this._ipProfile = base.getIpProfile();
            this._nssConnectionPointRef = CodeHelpers.emptyToNull(base.getNssConnectionPointRef());
            this._vimNetworkName = base.getVimNetworkName();
        }
    
        @Override
        public NetsliceVldKey key() {
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
        public Map<NssConnectionPointRefKey, NssConnectionPointRef> getNssConnectionPointRef() {
            return _nssConnectionPointRef;
        }
        
        @Override
        public String getVimNetworkName() {
            return _vimNetworkName;
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
            result = prime * result + Objects.hashCode(_nssConnectionPointRef);
            result = prime * result + Objects.hashCode(_vimNetworkName);
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
            if (!NetsliceVld.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            NetsliceVld other = (NetsliceVld)obj;
            if (!Objects.equals(_ipProfile, other.getIpProfile())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nssConnectionPointRef, other.getNssConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vimNetworkName, other.getVimNetworkName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetsliceVldImpl otherImpl = (NetsliceVldImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NetsliceVld>>, Augmentation<NetsliceVld>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetsliceVld");
            CodeHelpers.appendValue(helper, "_ipProfile", _ipProfile);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nssConnectionPointRef", _nssConnectionPointRef);
            CodeHelpers.appendValue(helper, "_vimNetworkName", _vimNetworkName);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
