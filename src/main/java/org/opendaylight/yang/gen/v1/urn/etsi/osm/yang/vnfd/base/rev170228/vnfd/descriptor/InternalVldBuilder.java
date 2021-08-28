package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
import com.google.common.base.MoreObjects;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InitParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPointKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link InternalVldBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     InternalVldBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new InternalVldBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of InternalVldBuilder, as instances can be freely passed around without
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
 * @see InternalVldBuilder
 * @see Builder
 *
 */
public class InternalVldBuilder implements Builder<InternalVld> {

    private String _description;
    private String _id;
    private InitParams _initParams;
    private Map<InternalConnectionPointKey, InternalConnectionPoint> _internalConnectionPoint;
    private Uint64 _leafBandwidth;
    private String _name;
    private ProviderNetwork _providerNetwork;
    private Uint64 _rootBandwidth;
    private String _shortName;
    private VirtualLinkType _type;
    private InternalVldKey key;


    Map<Class<? extends Augmentation<InternalVld>>, Augmentation<InternalVld>> augmentation = Collections.emptyMap();

    public InternalVldBuilder() {
    }
    public InternalVldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork arg) {
        this._providerNetwork = arg.getProviderNetwork();
    }

    public InternalVldBuilder(InternalVld base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<InternalVld>>, Augmentation<InternalVld>> aug =((AugmentationHolder<InternalVld>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._description = base.getDescription();
        this._initParams = base.getInitParams();
        this._internalConnectionPoint = base.getInternalConnectionPoint();
        this._leafBandwidth = base.getLeafBandwidth();
        this._name = base.getName();
        this._providerNetwork = base.getProviderNetwork();
        this._rootBandwidth = base.getRootBandwidth();
        this._shortName = base.getShortName();
        this._type = base.getType();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork</li>
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
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork]");
    }

    public InternalVldKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public InitParams getInitParams() {
        return _initParams;
    }
    
    public Map<InternalConnectionPointKey, InternalConnectionPoint> getInternalConnectionPoint() {
        return _internalConnectionPoint;
    }
    
    public Uint64 getLeafBandwidth() {
        return _leafBandwidth;
    }
    
    public String getName() {
        return _name;
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

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<InternalVld>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public InternalVldBuilder withKey(final InternalVldKey key) {
        this.key = key;
        return this;
    }
    
    public InternalVldBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public InternalVldBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public InternalVldBuilder setInitParams(final InitParams value) {
        this._initParams = value;
        return this;
    }
    public InternalVldBuilder setInternalConnectionPoint(final Map<InternalConnectionPointKey, InternalConnectionPoint> values) {
        this._internalConnectionPoint = values;
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
      * @deprecated Use {#link #setInternalConnectionPoint(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public InternalVldBuilder setInternalConnectionPoint(final List<InternalConnectionPoint> values) {
        return setInternalConnectionPoint(CodeHelpers.compatMap(values));
    }
    
    public InternalVldBuilder setLeafBandwidth(final Uint64 value) {
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
    public InternalVldBuilder setLeafBandwidth(final BigInteger value) {
        return setLeafBandwidth(CodeHelpers.compatUint(value));
    }
    
    public InternalVldBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public InternalVldBuilder setProviderNetwork(final ProviderNetwork value) {
        this._providerNetwork = value;
        return this;
    }
    
    public InternalVldBuilder setRootBandwidth(final Uint64 value) {
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
    public InternalVldBuilder setRootBandwidth(final BigInteger value) {
        return setRootBandwidth(CodeHelpers.compatUint(value));
    }
    
    public InternalVldBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public InternalVldBuilder setType(final VirtualLinkType value) {
        this._type = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public InternalVldBuilder addAugmentation(Augmentation<InternalVld> augmentation) {
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
    public InternalVldBuilder addAugmentation(Class<? extends Augmentation<InternalVld>> augmentationType, Augmentation<InternalVld> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public InternalVldBuilder removeAugmentation(Class<? extends Augmentation<InternalVld>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private InternalVldBuilder doAddAugmentation(Class<? extends Augmentation<InternalVld>> augmentationType, Augmentation<InternalVld> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public InternalVld build() {
        return new InternalVldImpl(this);
    }

    private static final class InternalVldImpl
        extends AbstractAugmentable<InternalVld>
        implements InternalVld {
    
        private final String _description;
        private final String _id;
        private final InitParams _initParams;
        private final Map<InternalConnectionPointKey, InternalConnectionPoint> _internalConnectionPoint;
        private final Uint64 _leafBandwidth;
        private final String _name;
        private final ProviderNetwork _providerNetwork;
        private final Uint64 _rootBandwidth;
        private final String _shortName;
        private final VirtualLinkType _type;
        private final InternalVldKey key;
    
        InternalVldImpl(InternalVldBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new InternalVldKey(base.getId());
            }
            this._id = key.getId();
            this._description = base.getDescription();
            this._initParams = base.getInitParams();
            this._internalConnectionPoint = CodeHelpers.emptyToNull(base.getInternalConnectionPoint());
            this._leafBandwidth = base.getLeafBandwidth();
            this._name = base.getName();
            this._providerNetwork = base.getProviderNetwork();
            this._rootBandwidth = base.getRootBandwidth();
            this._shortName = base.getShortName();
            this._type = base.getType();
        }
    
        @Override
        public InternalVldKey key() {
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
        public InitParams getInitParams() {
            return _initParams;
        }
        
        @Override
        public Map<InternalConnectionPointKey, InternalConnectionPoint> getInternalConnectionPoint() {
            return _internalConnectionPoint;
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
            result = prime * result + Objects.hashCode(_initParams);
            result = prime * result + Objects.hashCode(_internalConnectionPoint);
            result = prime * result + Objects.hashCode(_leafBandwidth);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_providerNetwork);
            result = prime * result + Objects.hashCode(_rootBandwidth);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_type);
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
            if (!InternalVld.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            InternalVld other = (InternalVld)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_initParams, other.getInitParams())) {
                return false;
            }
            if (!Objects.equals(_internalConnectionPoint, other.getInternalConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_leafBandwidth, other.getLeafBandwidth())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
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
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InternalVldImpl otherImpl = (InternalVldImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InternalVld>>, Augmentation<InternalVld>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InternalVld");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_initParams", _initParams);
            CodeHelpers.appendValue(helper, "_internalConnectionPoint", _internalConnectionPoint);
            CodeHelpers.appendValue(helper, "_leafBandwidth", _leafBandwidth);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_providerNetwork", _providerNetwork);
            CodeHelpers.appendValue(helper, "_rootBandwidth", _rootBandwidth);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
