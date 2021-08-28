package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data.virtual.link.protocol.data;
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
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link L3ProtocolDataBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     L3ProtocolDataBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new L3ProtocolDataBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of L3ProtocolDataBuilder, as instances can be freely passed around without
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
 * @see L3ProtocolDataBuilder
 * @see Builder
 *
 */
public class L3ProtocolDataBuilder implements Builder<L3ProtocolData> {

    private String _cidr;
    private IpAddress _gatewayIp;
    private List<String> _ipAllocationPools;
    private L3ProtocolData.IpVersion _ipVersion;
    private L3ProtocolData.Ipv6AddressMode _ipv6AddressMode;
    private String _name;
    private Boolean _dhcpEnabled;


    Map<Class<? extends Augmentation<L3ProtocolData>>, Augmentation<L3ProtocolData>> augmentation = Collections.emptyMap();

    public L3ProtocolDataBuilder() {
    }

    public L3ProtocolDataBuilder(L3ProtocolData base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<L3ProtocolData>>, Augmentation<L3ProtocolData>> aug =((AugmentationHolder<L3ProtocolData>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._cidr = base.getCidr();
        this._gatewayIp = base.getGatewayIp();
        this._ipAllocationPools = base.getIpAllocationPools();
        this._ipVersion = base.getIpVersion();
        this._ipv6AddressMode = base.getIpv6AddressMode();
        this._name = base.getName();
        this._dhcpEnabled = base.isDhcpEnabled();
    }


    public String getCidr() {
        return _cidr;
    }
    
    public IpAddress getGatewayIp() {
        return _gatewayIp;
    }
    
    public List<String> getIpAllocationPools() {
        return _ipAllocationPools;
    }
    
    public L3ProtocolData.IpVersion getIpVersion() {
        return _ipVersion;
    }
    
    public L3ProtocolData.Ipv6AddressMode getIpv6AddressMode() {
        return _ipv6AddressMode;
    }
    
    public String getName() {
        return _name;
    }
    
    public Boolean isDhcpEnabled() {
        return _dhcpEnabled;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<L3ProtocolData>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public L3ProtocolDataBuilder setCidr(final String value) {
        this._cidr = value;
        return this;
    }
    
    public L3ProtocolDataBuilder setGatewayIp(final IpAddress value) {
        this._gatewayIp = value;
        return this;
    }
    public L3ProtocolDataBuilder setIpAllocationPools(final List<String> values) {
        this._ipAllocationPools = values;
        return this;
    }
    
    
    public L3ProtocolDataBuilder setIpVersion(final L3ProtocolData.IpVersion value) {
        this._ipVersion = value;
        return this;
    }
    
    public L3ProtocolDataBuilder setIpv6AddressMode(final L3ProtocolData.Ipv6AddressMode value) {
        this._ipv6AddressMode = value;
        return this;
    }
    
    public L3ProtocolDataBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public L3ProtocolDataBuilder setDhcpEnabled(final Boolean value) {
        this._dhcpEnabled = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public L3ProtocolDataBuilder addAugmentation(Augmentation<L3ProtocolData> augmentation) {
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
    public L3ProtocolDataBuilder addAugmentation(Class<? extends Augmentation<L3ProtocolData>> augmentationType, Augmentation<L3ProtocolData> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public L3ProtocolDataBuilder removeAugmentation(Class<? extends Augmentation<L3ProtocolData>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private L3ProtocolDataBuilder doAddAugmentation(Class<? extends Augmentation<L3ProtocolData>> augmentationType, Augmentation<L3ProtocolData> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public L3ProtocolData build() {
        return new L3ProtocolDataImpl(this);
    }

    private static final class L3ProtocolDataImpl
        extends AbstractAugmentable<L3ProtocolData>
        implements L3ProtocolData {
    
        private final String _cidr;
        private final IpAddress _gatewayIp;
        private final List<String> _ipAllocationPools;
        private final L3ProtocolData.IpVersion _ipVersion;
        private final L3ProtocolData.Ipv6AddressMode _ipv6AddressMode;
        private final String _name;
        private final Boolean _dhcpEnabled;
    
        L3ProtocolDataImpl(L3ProtocolDataBuilder base) {
            super(base.augmentation);
            this._cidr = base.getCidr();
            this._gatewayIp = base.getGatewayIp();
            this._ipAllocationPools = base.getIpAllocationPools();
            this._ipVersion = base.getIpVersion();
            this._ipv6AddressMode = base.getIpv6AddressMode();
            this._name = base.getName();
            this._dhcpEnabled = base.isDhcpEnabled();
        }
    
        @Override
        public String getCidr() {
            return _cidr;
        }
        
        @Override
        public IpAddress getGatewayIp() {
            return _gatewayIp;
        }
        
        @Override
        public List<String> getIpAllocationPools() {
            return _ipAllocationPools;
        }
        
        @Override
        public L3ProtocolData.IpVersion getIpVersion() {
            return _ipVersion;
        }
        
        @Override
        public L3ProtocolData.Ipv6AddressMode getIpv6AddressMode() {
            return _ipv6AddressMode;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Boolean isDhcpEnabled() {
            return _dhcpEnabled;
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
            result = prime * result + Objects.hashCode(_cidr);
            result = prime * result + Objects.hashCode(_gatewayIp);
            result = prime * result + Objects.hashCode(_ipAllocationPools);
            result = prime * result + Objects.hashCode(_ipVersion);
            result = prime * result + Objects.hashCode(_ipv6AddressMode);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_dhcpEnabled);
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
            if (!L3ProtocolData.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            L3ProtocolData other = (L3ProtocolData)obj;
            if (!Objects.equals(_cidr, other.getCidr())) {
                return false;
            }
            if (!Objects.equals(_gatewayIp, other.getGatewayIp())) {
                return false;
            }
            if (!Objects.equals(_ipAllocationPools, other.getIpAllocationPools())) {
                return false;
            }
            if (!Objects.equals(_ipVersion, other.getIpVersion())) {
                return false;
            }
            if (!Objects.equals(_ipv6AddressMode, other.getIpv6AddressMode())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_dhcpEnabled, other.isDhcpEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L3ProtocolDataImpl otherImpl = (L3ProtocolDataImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<L3ProtocolData>>, Augmentation<L3ProtocolData>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("L3ProtocolData");
            CodeHelpers.appendValue(helper, "_cidr", _cidr);
            CodeHelpers.appendValue(helper, "_gatewayIp", _gatewayIp);
            CodeHelpers.appendValue(helper, "_ipAllocationPools", _ipAllocationPools);
            CodeHelpers.appendValue(helper, "_ipVersion", _ipVersion);
            CodeHelpers.appendValue(helper, "_ipv6AddressMode", _ipv6AddressMode);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_dhcpEnabled", _dhcpEnabled);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
