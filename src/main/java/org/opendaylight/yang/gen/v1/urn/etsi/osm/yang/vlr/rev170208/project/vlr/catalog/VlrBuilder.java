package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.project.vlr.catalog;
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
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VirtualLinkType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.IpProfileParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.provider.network.ProviderNetwork;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link VlrBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VlrBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VlrBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VlrBuilder, as instances can be freely passed around without
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
 * @see VlrBuilder
 * @see Builder
 *
 */
public class VlrBuilder implements Builder<Vlr> {

    private Uint32 _createTime;
    private String _description;
    private Uuid _id;
    private IpProfileParams _ipProfileParams;
    private Uint64 _leafBandwidth;
    private String _name;
    private String _networkId;
    private Uuid _nsrIdRef;
    private Vlr.OperationalStatus _operationalStatus;
    private ProviderNetwork _providerNetwork;
    private Uuid _resId;
    private Uint64 _rootBandwidth;
    private String _shortName;
    private Vlr.Status _status;
    private VirtualLinkType _type;
    private Uint32 _uptime;
    private String _vendor;
    private String _version;
    private String _vimNetworkName;
    private String _vldRef;
    private VlrKey key;


    Map<Class<? extends Augmentation<Vlr>>, Augmentation<Vlr>> augmentation = Collections.emptyMap();

    public VlrBuilder() {
    }
    public VlrBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork arg) {
        this._providerNetwork = arg.getProviderNetwork();
    }
    public VlrBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileInfo arg) {
        this._ipProfileParams = arg.getIpProfileParams();
    }

    public VlrBuilder(Vlr base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vlr>>, Augmentation<Vlr>> aug =((AugmentationHolder<Vlr>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._createTime = base.getCreateTime();
        this._description = base.getDescription();
        this._ipProfileParams = base.getIpProfileParams();
        this._leafBandwidth = base.getLeafBandwidth();
        this._name = base.getName();
        this._networkId = base.getNetworkId();
        this._nsrIdRef = base.getNsrIdRef();
        this._operationalStatus = base.getOperationalStatus();
        this._providerNetwork = base.getProviderNetwork();
        this._resId = base.getResId();
        this._rootBandwidth = base.getRootBandwidth();
        this._shortName = base.getShortName();
        this._status = base.getStatus();
        this._type = base.getType();
        this._uptime = base.getUptime();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vimNetworkName = base.getVimNetworkName();
        this._vldRef = base.getVldRef();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileInfo</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileInfo) {
            this._ipProfileParams = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileInfo)arg).getIpProfileParams();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork) {
            this._providerNetwork = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork)arg).getProviderNetwork();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileInfo, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork]");
    }

    public VlrKey key() {
        return key;
    }
    
    public Uint32 getCreateTime() {
        return _createTime;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public IpProfileParams getIpProfileParams() {
        return _ipProfileParams;
    }
    
    public Uint64 getLeafBandwidth() {
        return _leafBandwidth;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getNetworkId() {
        return _networkId;
    }
    
    public Uuid getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public Vlr.OperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public ProviderNetwork getProviderNetwork() {
        return _providerNetwork;
    }
    
    public Uuid getResId() {
        return _resId;
    }
    
    public Uint64 getRootBandwidth() {
        return _rootBandwidth;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public Vlr.Status getStatus() {
        return _status;
    }
    
    public VirtualLinkType getType() {
        return _type;
    }
    
    public Uint32 getUptime() {
        return _uptime;
    }
    
    public String getVendor() {
        return _vendor;
    }
    
    public String getVersion() {
        return _version;
    }
    
    public String getVimNetworkName() {
        return _vimNetworkName;
    }
    
    public String getVldRef() {
        return _vldRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Vlr>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VlrBuilder withKey(final VlrKey key) {
        this.key = key;
        return this;
    }
    
    public VlrBuilder setCreateTime(final Uint32 value) {
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
    public VlrBuilder setCreateTime(final Long value) {
        return setCreateTime(CodeHelpers.compatUint(value));
    }
    
    public VlrBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public VlrBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
    public VlrBuilder setIpProfileParams(final IpProfileParams value) {
        this._ipProfileParams = value;
        return this;
    }
    
    public VlrBuilder setLeafBandwidth(final Uint64 value) {
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
    public VlrBuilder setLeafBandwidth(final BigInteger value) {
        return setLeafBandwidth(CodeHelpers.compatUint(value));
    }
    
    public VlrBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VlrBuilder setNetworkId(final String value) {
        this._networkId = value;
        return this;
    }
    
    public VlrBuilder setNsrIdRef(final Uuid value) {
        this._nsrIdRef = value;
        return this;
    }
    
    public VlrBuilder setOperationalStatus(final Vlr.OperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    
    public VlrBuilder setProviderNetwork(final ProviderNetwork value) {
        this._providerNetwork = value;
        return this;
    }
    
    public VlrBuilder setResId(final Uuid value) {
        this._resId = value;
        return this;
    }
    
    public VlrBuilder setRootBandwidth(final Uint64 value) {
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
    public VlrBuilder setRootBandwidth(final BigInteger value) {
        return setRootBandwidth(CodeHelpers.compatUint(value));
    }
    
    public VlrBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public VlrBuilder setStatus(final Vlr.Status value) {
        this._status = value;
        return this;
    }
    
    public VlrBuilder setType(final VirtualLinkType value) {
        this._type = value;
        return this;
    }
    
    public VlrBuilder setUptime(final Uint32 value) {
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
    public VlrBuilder setUptime(final Long value) {
        return setUptime(CodeHelpers.compatUint(value));
    }
    
    public VlrBuilder setVendor(final String value) {
        this._vendor = value;
        return this;
    }
    
    public VlrBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    public VlrBuilder setVimNetworkName(final String value) {
        this._vimNetworkName = value;
        return this;
    }
    
    public VlrBuilder setVldRef(final String value) {
        this._vldRef = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VlrBuilder addAugmentation(Augmentation<Vlr> augmentation) {
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
    public VlrBuilder addAugmentation(Class<? extends Augmentation<Vlr>> augmentationType, Augmentation<Vlr> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VlrBuilder removeAugmentation(Class<? extends Augmentation<Vlr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VlrBuilder doAddAugmentation(Class<? extends Augmentation<Vlr>> augmentationType, Augmentation<Vlr> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Vlr build() {
        return new VlrImpl(this);
    }

    private static final class VlrImpl
        extends AbstractAugmentable<Vlr>
        implements Vlr {
    
        private final Uint32 _createTime;
        private final String _description;
        private final Uuid _id;
        private final IpProfileParams _ipProfileParams;
        private final Uint64 _leafBandwidth;
        private final String _name;
        private final String _networkId;
        private final Uuid _nsrIdRef;
        private final Vlr.OperationalStatus _operationalStatus;
        private final ProviderNetwork _providerNetwork;
        private final Uuid _resId;
        private final Uint64 _rootBandwidth;
        private final String _shortName;
        private final Vlr.Status _status;
        private final VirtualLinkType _type;
        private final Uint32 _uptime;
        private final String _vendor;
        private final String _version;
        private final String _vimNetworkName;
        private final String _vldRef;
        private final VlrKey key;
    
        VlrImpl(VlrBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VlrKey(base.getId());
            }
            this._id = key.getId();
            this._createTime = base.getCreateTime();
            this._description = base.getDescription();
            this._ipProfileParams = base.getIpProfileParams();
            this._leafBandwidth = base.getLeafBandwidth();
            this._name = base.getName();
            this._networkId = base.getNetworkId();
            this._nsrIdRef = base.getNsrIdRef();
            this._operationalStatus = base.getOperationalStatus();
            this._providerNetwork = base.getProviderNetwork();
            this._resId = base.getResId();
            this._rootBandwidth = base.getRootBandwidth();
            this._shortName = base.getShortName();
            this._status = base.getStatus();
            this._type = base.getType();
            this._uptime = base.getUptime();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vimNetworkName = base.getVimNetworkName();
            this._vldRef = base.getVldRef();
        }
    
        @Override
        public VlrKey key() {
            return key;
        }
        
        @Override
        public Uint32 getCreateTime() {
            return _createTime;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public IpProfileParams getIpProfileParams() {
            return _ipProfileParams;
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
        public String getNetworkId() {
            return _networkId;
        }
        
        @Override
        public Uuid getNsrIdRef() {
            return _nsrIdRef;
        }
        
        @Override
        public Vlr.OperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public ProviderNetwork getProviderNetwork() {
            return _providerNetwork;
        }
        
        @Override
        public Uuid getResId() {
            return _resId;
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
        public Vlr.Status getStatus() {
            return _status;
        }
        
        @Override
        public VirtualLinkType getType() {
            return _type;
        }
        
        @Override
        public Uint32 getUptime() {
            return _uptime;
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
        public String getVimNetworkName() {
            return _vimNetworkName;
        }
        
        @Override
        public String getVldRef() {
            return _vldRef;
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ipProfileParams);
            result = prime * result + Objects.hashCode(_leafBandwidth);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_networkId);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_providerNetwork);
            result = prime * result + Objects.hashCode(_resId);
            result = prime * result + Objects.hashCode(_rootBandwidth);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_status);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_uptime);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vimNetworkName);
            result = prime * result + Objects.hashCode(_vldRef);
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
            if (!Vlr.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Vlr other = (Vlr)obj;
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ipProfileParams, other.getIpProfileParams())) {
                return false;
            }
            if (!Objects.equals(_leafBandwidth, other.getLeafBandwidth())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_networkId, other.getNetworkId())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_providerNetwork, other.getProviderNetwork())) {
                return false;
            }
            if (!Objects.equals(_resId, other.getResId())) {
                return false;
            }
            if (!Objects.equals(_rootBandwidth, other.getRootBandwidth())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_status, other.getStatus())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_uptime, other.getUptime())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vimNetworkName, other.getVimNetworkName())) {
                return false;
            }
            if (!Objects.equals(_vldRef, other.getVldRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VlrImpl otherImpl = (VlrImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vlr>>, Augmentation<Vlr>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vlr");
            CodeHelpers.appendValue(helper, "_createTime", _createTime);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_ipProfileParams", _ipProfileParams);
            CodeHelpers.appendValue(helper, "_leafBandwidth", _leafBandwidth);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_networkId", _networkId);
            CodeHelpers.appendValue(helper, "_nsrIdRef", _nsrIdRef);
            CodeHelpers.appendValue(helper, "_operationalStatus", _operationalStatus);
            CodeHelpers.appendValue(helper, "_providerNetwork", _providerNetwork);
            CodeHelpers.appendValue(helper, "_resId", _resId);
            CodeHelpers.appendValue(helper, "_rootBandwidth", _rootBandwidth);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_status", _status);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_uptime", _uptime);
            CodeHelpers.appendValue(helper, "_vendor", _vendor);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "_vimNetworkName", _vimNetworkName);
            CodeHelpers.appendValue(helper, "_vldRef", _vldRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
