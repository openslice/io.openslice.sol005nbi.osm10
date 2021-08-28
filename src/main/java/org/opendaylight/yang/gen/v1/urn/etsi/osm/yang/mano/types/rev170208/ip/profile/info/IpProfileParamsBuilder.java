package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServerKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpVersion;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link IpProfileParamsBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     IpProfileParamsBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new IpProfileParamsBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of IpProfileParamsBuilder, as instances can be freely passed around without
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
 * @see IpProfileParamsBuilder
 * @see Builder
 *
 */
public class IpProfileParamsBuilder implements Builder<IpProfileParams> {

    private DhcpParams _dhcpParams;
    private Map<DnsServerKey, DnsServer> _dnsServer;
    private IpAddress _gatewayAddress;
    private IpVersion _ipVersion;
    private String _securityGroup;
    private IpPrefix _subnetAddress;
    private String _subnetPrefixPool;


    Map<Class<? extends Augmentation<IpProfileParams>>, Augmentation<IpProfileParams>> augmentation = Collections.emptyMap();

    public IpProfileParamsBuilder() {
    }

    public IpProfileParamsBuilder(IpProfileParams base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<IpProfileParams>>, Augmentation<IpProfileParams>> aug =((AugmentationHolder<IpProfileParams>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._dhcpParams = base.getDhcpParams();
        this._dnsServer = base.getDnsServer();
        this._gatewayAddress = base.getGatewayAddress();
        this._ipVersion = base.getIpVersion();
        this._securityGroup = base.getSecurityGroup();
        this._subnetAddress = base.getSubnetAddress();
        this._subnetPrefixPool = base.getSubnetPrefixPool();
    }


    public DhcpParams getDhcpParams() {
        return _dhcpParams;
    }
    
    public Map<DnsServerKey, DnsServer> getDnsServer() {
        return _dnsServer;
    }
    
    public IpAddress getGatewayAddress() {
        return _gatewayAddress;
    }
    
    public IpVersion getIpVersion() {
        return _ipVersion;
    }
    
    public String getSecurityGroup() {
        return _securityGroup;
    }
    
    public IpPrefix getSubnetAddress() {
        return _subnetAddress;
    }
    
    public String getSubnetPrefixPool() {
        return _subnetPrefixPool;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<IpProfileParams>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public IpProfileParamsBuilder setDhcpParams(final DhcpParams value) {
        this._dhcpParams = value;
        return this;
    }
    public IpProfileParamsBuilder setDnsServer(final Map<DnsServerKey, DnsServer> values) {
        this._dnsServer = values;
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
      * @deprecated Use {#link #setDnsServer(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public IpProfileParamsBuilder setDnsServer(final List<DnsServer> values) {
        return setDnsServer(CodeHelpers.compatMap(values));
    }
    
    public IpProfileParamsBuilder setGatewayAddress(final IpAddress value) {
        this._gatewayAddress = value;
        return this;
    }
    
    public IpProfileParamsBuilder setIpVersion(final IpVersion value) {
        this._ipVersion = value;
        return this;
    }
    
    public IpProfileParamsBuilder setSecurityGroup(final String value) {
        this._securityGroup = value;
        return this;
    }
    
    public IpProfileParamsBuilder setSubnetAddress(final IpPrefix value) {
        this._subnetAddress = value;
        return this;
    }
    
    public IpProfileParamsBuilder setSubnetPrefixPool(final String value) {
        this._subnetPrefixPool = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public IpProfileParamsBuilder addAugmentation(Augmentation<IpProfileParams> augmentation) {
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
    public IpProfileParamsBuilder addAugmentation(Class<? extends Augmentation<IpProfileParams>> augmentationType, Augmentation<IpProfileParams> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public IpProfileParamsBuilder removeAugmentation(Class<? extends Augmentation<IpProfileParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private IpProfileParamsBuilder doAddAugmentation(Class<? extends Augmentation<IpProfileParams>> augmentationType, Augmentation<IpProfileParams> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public IpProfileParams build() {
        return new IpProfileParamsImpl(this);
    }

    private static final class IpProfileParamsImpl
        extends AbstractAugmentable<IpProfileParams>
        implements IpProfileParams {
    
        private final DhcpParams _dhcpParams;
        private final Map<DnsServerKey, DnsServer> _dnsServer;
        private final IpAddress _gatewayAddress;
        private final IpVersion _ipVersion;
        private final String _securityGroup;
        private final IpPrefix _subnetAddress;
        private final String _subnetPrefixPool;
    
        IpProfileParamsImpl(IpProfileParamsBuilder base) {
            super(base.augmentation);
            this._dhcpParams = base.getDhcpParams();
            this._dnsServer = CodeHelpers.emptyToNull(base.getDnsServer());
            this._gatewayAddress = base.getGatewayAddress();
            this._ipVersion = base.getIpVersion();
            this._securityGroup = base.getSecurityGroup();
            this._subnetAddress = base.getSubnetAddress();
            this._subnetPrefixPool = base.getSubnetPrefixPool();
        }
    
        @Override
        public DhcpParams getDhcpParams() {
            return _dhcpParams;
        }
        
        @Override
        public Map<DnsServerKey, DnsServer> getDnsServer() {
            return _dnsServer;
        }
        
        @Override
        public IpAddress getGatewayAddress() {
            return _gatewayAddress;
        }
        
        @Override
        public IpVersion getIpVersion() {
            return _ipVersion;
        }
        
        @Override
        public String getSecurityGroup() {
            return _securityGroup;
        }
        
        @Override
        public IpPrefix getSubnetAddress() {
            return _subnetAddress;
        }
        
        @Override
        public String getSubnetPrefixPool() {
            return _subnetPrefixPool;
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
            result = prime * result + Objects.hashCode(_dhcpParams);
            result = prime * result + Objects.hashCode(_dnsServer);
            result = prime * result + Objects.hashCode(_gatewayAddress);
            result = prime * result + Objects.hashCode(_ipVersion);
            result = prime * result + Objects.hashCode(_securityGroup);
            result = prime * result + Objects.hashCode(_subnetAddress);
            result = prime * result + Objects.hashCode(_subnetPrefixPool);
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
            if (!IpProfileParams.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            IpProfileParams other = (IpProfileParams)obj;
            if (!Objects.equals(_dhcpParams, other.getDhcpParams())) {
                return false;
            }
            if (!Objects.equals(_dnsServer, other.getDnsServer())) {
                return false;
            }
            if (!Objects.equals(_gatewayAddress, other.getGatewayAddress())) {
                return false;
            }
            if (!Objects.equals(_ipVersion, other.getIpVersion())) {
                return false;
            }
            if (!Objects.equals(_securityGroup, other.getSecurityGroup())) {
                return false;
            }
            if (!Objects.equals(_subnetAddress, other.getSubnetAddress())) {
                return false;
            }
            if (!Objects.equals(_subnetPrefixPool, other.getSubnetPrefixPool())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IpProfileParamsImpl otherImpl = (IpProfileParamsImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<IpProfileParams>>, Augmentation<IpProfileParams>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("IpProfileParams");
            CodeHelpers.appendValue(helper, "_dhcpParams", _dhcpParams);
            CodeHelpers.appendValue(helper, "_dnsServer", _dnsServer);
            CodeHelpers.appendValue(helper, "_gatewayAddress", _gatewayAddress);
            CodeHelpers.appendValue(helper, "_ipVersion", _ipVersion);
            CodeHelpers.appendValue(helper, "_securityGroup", _securityGroup);
            CodeHelpers.appendValue(helper, "_subnetAddress", _subnetAddress);
            CodeHelpers.appendValue(helper, "_subnetPrefixPool", _subnetPrefixPool);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
