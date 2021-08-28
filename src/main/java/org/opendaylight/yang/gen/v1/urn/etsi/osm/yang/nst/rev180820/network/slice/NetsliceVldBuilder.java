package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Deprecated;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VirtualLinkType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.provider.network.ProviderNetwork;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.nsvld.NssConnectionPointRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.nsvld.NssConnectionPointRefKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

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

    private String _description;
    private String _id;
    private Uint64 _leafBandwidth;
    private String _name;
    private Map<NssConnectionPointRefKey, NssConnectionPointRef> _nssConnectionPointRef;
    private ProviderNetwork _providerNetwork;
    private Uint64 _rootBandwidth;
    private String _shortName;
    private VirtualLinkType _type;
    private String _vendor;
    private String _version;
    private Boolean _mgmtNetwork;
    private NetsliceVldKey key;


    Map<Class<? extends Augmentation<NetsliceVld>>, Augmentation<NetsliceVld>> augmentation = Collections.emptyMap();

    public NetsliceVldBuilder() {
    }
    public NetsliceVldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Nsvld arg) {
        this._nssConnectionPointRef = arg.getNssConnectionPointRef();
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
        this._type = arg.getType();
        this._rootBandwidth = arg.getRootBandwidth();
        this._leafBandwidth = arg.getLeafBandwidth();
        this._mgmtNetwork = arg.isMgmtNetwork();
        this._providerNetwork = arg.getProviderNetwork();
    }
    public NetsliceVldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
        this._type = arg.getType();
        this._rootBandwidth = arg.getRootBandwidth();
        this._leafBandwidth = arg.getLeafBandwidth();
        this._mgmtNetwork = arg.isMgmtNetwork();
        this._providerNetwork = arg.getProviderNetwork();
    }
    public NetsliceVldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork arg) {
        this._providerNetwork = arg.getProviderNetwork();
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
        this._id = base.getId();
        this._description = base.getDescription();
        this._leafBandwidth = base.getLeafBandwidth();
        this._name = base.getName();
        this._nssConnectionPointRef = base.getNssConnectionPointRef();
        this._providerNetwork = base.getProviderNetwork();
        this._rootBandwidth = base.getRootBandwidth();
        this._shortName = base.getShortName();
        this._type = base.getType();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._mgmtNetwork = base.isMgmtNetwork();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Nsvld</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork) {
            this._providerNetwork = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork)arg).getProviderNetwork();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Nsvld) {
            this._nssConnectionPointRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Nsvld)arg).getNssConnectionPointRef();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getName();
            this._shortName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getShortName();
            this._vendor = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getVendor();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getDescription();
            this._version = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getVersion();
            this._type = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getType();
            this._rootBandwidth = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getRootBandwidth();
            this._leafBandwidth = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getLeafBandwidth();
            this._mgmtNetwork = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).isMgmtNetwork();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Nsvld, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon]");
    }

    public NetsliceVldKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public Uint64 getLeafBandwidth() {
        return _leafBandwidth;
    }
    
    public String getName() {
        return _name;
    }
    
    public Map<NssConnectionPointRefKey, NssConnectionPointRef> getNssConnectionPointRef() {
        return _nssConnectionPointRef;
    }
    
    public ProviderNetwork getProviderNetwork() {
        return _providerNetwork;
    }
    
    public Uint64 getRootBandwidth() {
        return _rootBandwidth;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public VirtualLinkType getType() {
        return _type;
    }
    
    public String getVendor() {
        return _vendor;
    }
    
    public String getVersion() {
        return _version;
    }
    
    public Boolean isMgmtNetwork() {
        return _mgmtNetwork;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<NetsliceVld>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NetsliceVldBuilder withKey(final NetsliceVldKey key) {
        this.key = key;
        return this;
    }
    
    public NetsliceVldBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public NetsliceVldBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public NetsliceVldBuilder setLeafBandwidth(final Uint64 value) {
        this._leafBandwidth = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setLeafBandwidth(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public NetsliceVldBuilder setLeafBandwidth(final BigInteger value) {
        return setLeafBandwidth(CodeHelpers.compatUint(value));
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
    
    public NetsliceVldBuilder setProviderNetwork(final ProviderNetwork value) {
        this._providerNetwork = value;
        return this;
    }
    
    public NetsliceVldBuilder setRootBandwidth(final Uint64 value) {
        this._rootBandwidth = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setRootBandwidth(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public NetsliceVldBuilder setRootBandwidth(final BigInteger value) {
        return setRootBandwidth(CodeHelpers.compatUint(value));
    }
    
    public NetsliceVldBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public NetsliceVldBuilder setType(final VirtualLinkType value) {
        this._type = value;
        return this;
    }
    
    public NetsliceVldBuilder setVendor(final String value) {
        this._vendor = value;
        return this;
    }
    
    public NetsliceVldBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    public NetsliceVldBuilder setMgmtNetwork(final Boolean value) {
        this._mgmtNetwork = value;
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
    
        private final String _description;
        private final String _id;
        private final Uint64 _leafBandwidth;
        private final String _name;
        private final Map<NssConnectionPointRefKey, NssConnectionPointRef> _nssConnectionPointRef;
        private final ProviderNetwork _providerNetwork;
        private final Uint64 _rootBandwidth;
        private final String _shortName;
        private final VirtualLinkType _type;
        private final String _vendor;
        private final String _version;
        private final Boolean _mgmtNetwork;
        private final NetsliceVldKey key;
    
        NetsliceVldImpl(NetsliceVldBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetsliceVldKey(base.getId());
            }
            this._id = key.getId();
            this._description = base.getDescription();
            this._leafBandwidth = base.getLeafBandwidth();
            this._name = base.getName();
            this._nssConnectionPointRef = CodeHelpers.emptyToNull(base.getNssConnectionPointRef());
            this._providerNetwork = base.getProviderNetwork();
            this._rootBandwidth = base.getRootBandwidth();
            this._shortName = base.getShortName();
            this._type = base.getType();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._mgmtNetwork = base.isMgmtNetwork();
        }
    
        @Override
        public NetsliceVldKey key() {
            return key;
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
        public Uint64 getLeafBandwidth() {
            return _leafBandwidth;
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
        public ProviderNetwork getProviderNetwork() {
            return _providerNetwork;
        }
        
        @Override
        public Uint64 getRootBandwidth() {
            return _rootBandwidth;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public VirtualLinkType getType() {
            return _type;
        }
        
        @Override
        public String getVendor() {
            return _vendor;
        }
        
        @Override
        public String getVersion() {
            return _version;
        }
        
        @Override
        public Boolean isMgmtNetwork() {
            return _mgmtNetwork;
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_leafBandwidth);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nssConnectionPointRef);
            result = prime * result + Objects.hashCode(_providerNetwork);
            result = prime * result + Objects.hashCode(_rootBandwidth);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_mgmtNetwork);
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
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_leafBandwidth, other.getLeafBandwidth())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nssConnectionPointRef, other.getNssConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_providerNetwork, other.getProviderNetwork())) {
                return false;
            }
            if (!Objects.equals(_rootBandwidth, other.getRootBandwidth())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_mgmtNetwork, other.isMgmtNetwork())) {
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
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_leafBandwidth", _leafBandwidth);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nssConnectionPointRef", _nssConnectionPointRef);
            CodeHelpers.appendValue(helper, "_providerNetwork", _providerNetwork);
            CodeHelpers.appendValue(helper, "_rootBandwidth", _rootBandwidth);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_vendor", _vendor);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "_mgmtNetwork", _mgmtNetwork);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
