package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConnectionPointType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint.PortSecurityDisableStrategy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.associated.virtual.cps.VirtualCps;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.associated.virtual.cps.VirtualCpsKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link InternalConnectionPointBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     InternalConnectionPointBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new InternalConnectionPointBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of InternalConnectionPointBuilder, as instances can be freely passed around without
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
 * @see InternalConnectionPointBuilder
 * @see Builder
 *
 */
public class InternalConnectionPointBuilder implements Builder<InternalConnectionPoint> {

    private String _connectionPointId;
    private String _id;
    private IpAddress _ipAddress;
    private String _macAddress;
    private String _name;
    private PortSecurityDisableStrategy _portSecurityDisableStrategy;
    private String _shortName;
    private ConnectionPointType _type;
    private Map<VirtualCpsKey, VirtualCps> _virtualCps;
    private Boolean _portSecurityEnabled;
    private InternalConnectionPointKey key;


    Map<Class<? extends Augmentation<InternalConnectionPoint>>, Augmentation<InternalConnectionPoint>> augmentation = Collections.emptyMap();

    public InternalConnectionPointBuilder() {
    }
    public InternalConnectionPointBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint arg) {
        this._name = arg.getName();
        this._id = arg.getId();
        this._shortName = arg.getShortName();
        this._type = arg.getType();
        this._portSecurityEnabled = arg.isPortSecurityEnabled();
        this._portSecurityDisableStrategy = arg.getPortSecurityDisableStrategy();
    }
    public InternalConnectionPointBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.AssociatedVirtualCps arg) {
        this._virtualCps = arg.getVirtualCps();
    }

    public InternalConnectionPointBuilder(InternalConnectionPoint base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<InternalConnectionPoint>>, Augmentation<InternalConnectionPoint>> aug =((AugmentationHolder<InternalConnectionPoint>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._connectionPointId = base.getConnectionPointId();
        this._ipAddress = base.getIpAddress();
        this._macAddress = base.getMacAddress();
        this._name = base.getName();
        this._portSecurityDisableStrategy = base.getPortSecurityDisableStrategy();
        this._shortName = base.getShortName();
        this._type = base.getType();
        this._virtualCps = base.getVirtualCps();
        this._portSecurityEnabled = base.isPortSecurityEnabled();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.AssociatedVirtualCps</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint)arg).getName();
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint)arg).getId();
            this._shortName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint)arg).getShortName();
            this._type = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint)arg).getType();
            this._portSecurityEnabled = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint)arg).isPortSecurityEnabled();
            this._portSecurityDisableStrategy = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint)arg).getPortSecurityDisableStrategy();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.AssociatedVirtualCps) {
            this._virtualCps = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.AssociatedVirtualCps)arg).getVirtualCps();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.AssociatedVirtualCps]");
    }

    public InternalConnectionPointKey key() {
        return key;
    }
    
    public String getConnectionPointId() {
        return _connectionPointId;
    }
    
    public String getId() {
        return _id;
    }
    
    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    public String getMacAddress() {
        return _macAddress;
    }
    
    public String getName() {
        return _name;
    }
    
    public PortSecurityDisableStrategy getPortSecurityDisableStrategy() {
        return _portSecurityDisableStrategy;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public ConnectionPointType getType() {
        return _type;
    }
    
    public Map<VirtualCpsKey, VirtualCps> getVirtualCps() {
        return _virtualCps;
    }
    
    public Boolean isPortSecurityEnabled() {
        return _portSecurityEnabled;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<InternalConnectionPoint>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public InternalConnectionPointBuilder withKey(final InternalConnectionPointKey key) {
        this.key = key;
        return this;
    }
    
    public InternalConnectionPointBuilder setConnectionPointId(final String value) {
        this._connectionPointId = value;
        return this;
    }
    
    public InternalConnectionPointBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public InternalConnectionPointBuilder setIpAddress(final IpAddress value) {
        this._ipAddress = value;
        return this;
    }
    
    public InternalConnectionPointBuilder setMacAddress(final String value) {
        this._macAddress = value;
        return this;
    }
    
    public InternalConnectionPointBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public InternalConnectionPointBuilder setPortSecurityDisableStrategy(final PortSecurityDisableStrategy value) {
        this._portSecurityDisableStrategy = value;
        return this;
    }
    
    public InternalConnectionPointBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public InternalConnectionPointBuilder setType(final ConnectionPointType value) {
        this._type = value;
        return this;
    }
    public InternalConnectionPointBuilder setVirtualCps(final Map<VirtualCpsKey, VirtualCps> values) {
        this._virtualCps = values;
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
      * @deprecated Use {#link #setVirtualCps(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public InternalConnectionPointBuilder setVirtualCps(final List<VirtualCps> values) {
        return setVirtualCps(CodeHelpers.compatMap(values));
    }
    
    public InternalConnectionPointBuilder setPortSecurityEnabled(final Boolean value) {
        this._portSecurityEnabled = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public InternalConnectionPointBuilder addAugmentation(Augmentation<InternalConnectionPoint> augmentation) {
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
    public InternalConnectionPointBuilder addAugmentation(Class<? extends Augmentation<InternalConnectionPoint>> augmentationType, Augmentation<InternalConnectionPoint> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public InternalConnectionPointBuilder removeAugmentation(Class<? extends Augmentation<InternalConnectionPoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private InternalConnectionPointBuilder doAddAugmentation(Class<? extends Augmentation<InternalConnectionPoint>> augmentationType, Augmentation<InternalConnectionPoint> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public InternalConnectionPoint build() {
        return new InternalConnectionPointImpl(this);
    }

    private static final class InternalConnectionPointImpl
        extends AbstractAugmentable<InternalConnectionPoint>
        implements InternalConnectionPoint {
    
        private final String _connectionPointId;
        private final String _id;
        private final IpAddress _ipAddress;
        private final String _macAddress;
        private final String _name;
        private final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint.PortSecurityDisableStrategy _portSecurityDisableStrategy;
        private final String _shortName;
        private final ConnectionPointType _type;
        private final Map<VirtualCpsKey, VirtualCps> _virtualCps;
        private final Boolean _portSecurityEnabled;
        private final InternalConnectionPointKey key;
    
        InternalConnectionPointImpl(InternalConnectionPointBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new InternalConnectionPointKey(base.getId());
            }
            this._id = key.getId();
            this._connectionPointId = base.getConnectionPointId();
            this._ipAddress = base.getIpAddress();
            this._macAddress = base.getMacAddress();
            this._name = base.getName();
            this._portSecurityDisableStrategy = base.getPortSecurityDisableStrategy();
            this._shortName = base.getShortName();
            this._type = base.getType();
            this._virtualCps = CodeHelpers.emptyToNull(base.getVirtualCps());
            this._portSecurityEnabled = base.isPortSecurityEnabled();
        }
    
        @Override
        public InternalConnectionPointKey key() {
            return key;
        }
        
        @Override
        public String getConnectionPointId() {
            return _connectionPointId;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public IpAddress getIpAddress() {
            return _ipAddress;
        }
        
        @Override
        public String getMacAddress() {
            return _macAddress;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint.PortSecurityDisableStrategy getPortSecurityDisableStrategy() {
            return _portSecurityDisableStrategy;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public ConnectionPointType getType() {
            return _type;
        }
        
        @Override
        public Map<VirtualCpsKey, VirtualCps> getVirtualCps() {
            return _virtualCps;
        }
        
        @Override
        public Boolean isPortSecurityEnabled() {
            return _portSecurityEnabled;
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
            result = prime * result + Objects.hashCode(_connectionPointId);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ipAddress);
            result = prime * result + Objects.hashCode(_macAddress);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_portSecurityDisableStrategy);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_virtualCps);
            result = prime * result + Objects.hashCode(_portSecurityEnabled);
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
            if (!InternalConnectionPoint.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            InternalConnectionPoint other = (InternalConnectionPoint)obj;
            if (!Objects.equals(_connectionPointId, other.getConnectionPointId())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (!Objects.equals(_macAddress, other.getMacAddress())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_portSecurityDisableStrategy, other.getPortSecurityDisableStrategy())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_virtualCps, other.getVirtualCps())) {
                return false;
            }
            if (!Objects.equals(_portSecurityEnabled, other.isPortSecurityEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InternalConnectionPointImpl otherImpl = (InternalConnectionPointImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InternalConnectionPoint>>, Augmentation<InternalConnectionPoint>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InternalConnectionPoint");
            CodeHelpers.appendValue(helper, "_connectionPointId", _connectionPointId);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
            CodeHelpers.appendValue(helper, "_macAddress", _macAddress);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_portSecurityDisableStrategy", _portSecurityDisableStrategy);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_virtualCps", _virtualCps);
            CodeHelpers.appendValue(helper, "_portSecurityEnabled", _portSecurityEnabled);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
