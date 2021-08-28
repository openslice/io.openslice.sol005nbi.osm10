package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ConnectionPointParamsBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ConnectionPointParamsBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ConnectionPointParamsBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ConnectionPointParamsBuilder, as instances can be freely passed around without
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
 * @see ConnectionPointParamsBuilder
 * @see Builder
 *
 */
public class ConnectionPointParamsBuilder implements Builder<ConnectionPointParams> {

    private IpAddress _address;
    private IpAddress _mgmtAddress;
    private String _name;
    private PortNumber _port;
    private String _portId;
    private String _vmId;


    Map<Class<? extends Augmentation<ConnectionPointParams>>, Augmentation<ConnectionPointParams>> augmentation = Collections.emptyMap();

    public ConnectionPointParamsBuilder() {
    }

    public ConnectionPointParamsBuilder(ConnectionPointParams base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ConnectionPointParams>>, Augmentation<ConnectionPointParams>> aug =((AugmentationHolder<ConnectionPointParams>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._address = base.getAddress();
        this._mgmtAddress = base.getMgmtAddress();
        this._name = base.getName();
        this._port = base.getPort();
        this._portId = base.getPortId();
        this._vmId = base.getVmId();
    }


    public IpAddress getAddress() {
        return _address;
    }
    
    public IpAddress getMgmtAddress() {
        return _mgmtAddress;
    }
    
    public String getName() {
        return _name;
    }
    
    public PortNumber getPort() {
        return _port;
    }
    
    public String getPortId() {
        return _portId;
    }
    
    public String getVmId() {
        return _vmId;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ConnectionPointParams>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public ConnectionPointParamsBuilder setAddress(final IpAddress value) {
        this._address = value;
        return this;
    }
    
    public ConnectionPointParamsBuilder setMgmtAddress(final IpAddress value) {
        this._mgmtAddress = value;
        return this;
    }
    
    public ConnectionPointParamsBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ConnectionPointParamsBuilder setPort(final PortNumber value) {
        this._port = value;
        return this;
    }
    
    public ConnectionPointParamsBuilder setPortId(final String value) {
        this._portId = value;
        return this;
    }
    
    public ConnectionPointParamsBuilder setVmId(final String value) {
        this._vmId = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ConnectionPointParamsBuilder addAugmentation(Augmentation<ConnectionPointParams> augmentation) {
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
    public ConnectionPointParamsBuilder addAugmentation(Class<? extends Augmentation<ConnectionPointParams>> augmentationType, Augmentation<ConnectionPointParams> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ConnectionPointParamsBuilder removeAugmentation(Class<? extends Augmentation<ConnectionPointParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ConnectionPointParamsBuilder doAddAugmentation(Class<? extends Augmentation<ConnectionPointParams>> augmentationType, Augmentation<ConnectionPointParams> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ConnectionPointParams build() {
        return new ConnectionPointParamsImpl(this);
    }

    private static final class ConnectionPointParamsImpl
        extends AbstractAugmentable<ConnectionPointParams>
        implements ConnectionPointParams {
    
        private final IpAddress _address;
        private final IpAddress _mgmtAddress;
        private final String _name;
        private final PortNumber _port;
        private final String _portId;
        private final String _vmId;
    
        ConnectionPointParamsImpl(ConnectionPointParamsBuilder base) {
            super(base.augmentation);
            this._address = base.getAddress();
            this._mgmtAddress = base.getMgmtAddress();
            this._name = base.getName();
            this._port = base.getPort();
            this._portId = base.getPortId();
            this._vmId = base.getVmId();
        }
    
        @Override
        public IpAddress getAddress() {
            return _address;
        }
        
        @Override
        public IpAddress getMgmtAddress() {
            return _mgmtAddress;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public PortNumber getPort() {
            return _port;
        }
        
        @Override
        public String getPortId() {
            return _portId;
        }
        
        @Override
        public String getVmId() {
            return _vmId;
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
            result = prime * result + Objects.hashCode(_address);
            result = prime * result + Objects.hashCode(_mgmtAddress);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_port);
            result = prime * result + Objects.hashCode(_portId);
            result = prime * result + Objects.hashCode(_vmId);
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
            if (!ConnectionPointParams.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ConnectionPointParams other = (ConnectionPointParams)obj;
            if (!Objects.equals(_address, other.getAddress())) {
                return false;
            }
            if (!Objects.equals(_mgmtAddress, other.getMgmtAddress())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_port, other.getPort())) {
                return false;
            }
            if (!Objects.equals(_portId, other.getPortId())) {
                return false;
            }
            if (!Objects.equals(_vmId, other.getVmId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConnectionPointParamsImpl otherImpl = (ConnectionPointParamsImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConnectionPointParams>>, Augmentation<ConnectionPointParams>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConnectionPointParams");
            CodeHelpers.appendValue(helper, "_address", _address);
            CodeHelpers.appendValue(helper, "_mgmtAddress", _mgmtAddress);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_port", _port);
            CodeHelpers.appendValue(helper, "_portId", _portId);
            CodeHelpers.appendValue(helper, "_vmId", _vmId);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
