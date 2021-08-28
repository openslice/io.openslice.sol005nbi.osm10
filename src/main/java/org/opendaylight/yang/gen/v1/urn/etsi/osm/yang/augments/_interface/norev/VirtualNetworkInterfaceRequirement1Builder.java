package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments._interface.norev;
import com.google.common.base.MoreObjects;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.virtual._interface.VirtualInterface;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link VirtualNetworkInterfaceRequirement1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualNetworkInterfaceRequirement1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualNetworkInterfaceRequirement1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualNetworkInterfaceRequirement1Builder, as instances can be freely passed around without
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
 * @see VirtualNetworkInterfaceRequirement1Builder
 * @see Builder
 *
 */
public class VirtualNetworkInterfaceRequirement1Builder implements Builder<VirtualNetworkInterfaceRequirement1> {

    private IpAddress _ipAddress;
    private String _macAddress;
    private Uint32 _position;
    private VirtualInterface _virtualInterface;



    public VirtualNetworkInterfaceRequirement1Builder() {
    }
    public VirtualNetworkInterfaceRequirement1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments._interface.norev.ExtendedInterface arg) {
        this._position = arg.getPosition();
        this._ipAddress = arg.getIpAddress();
        this._macAddress = arg.getMacAddress();
        this._virtualInterface = arg.getVirtualInterface();
    }
    public VirtualNetworkInterfaceRequirement1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VirtualInterface arg) {
        this._virtualInterface = arg.getVirtualInterface();
    }

    public VirtualNetworkInterfaceRequirement1Builder(VirtualNetworkInterfaceRequirement1 base) {
        this._ipAddress = base.getIpAddress();
        this._macAddress = base.getMacAddress();
        this._position = base.getPosition();
        this._virtualInterface = base.getVirtualInterface();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VirtualInterface</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments._interface.norev.ExtendedInterface</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VirtualInterface) {
            this._virtualInterface = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VirtualInterface)arg).getVirtualInterface();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments._interface.norev.ExtendedInterface) {
            this._position = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments._interface.norev.ExtendedInterface)arg).getPosition();
            this._ipAddress = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments._interface.norev.ExtendedInterface)arg).getIpAddress();
            this._macAddress = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments._interface.norev.ExtendedInterface)arg).getMacAddress();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VirtualInterface, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments._interface.norev.ExtendedInterface]");
    }

    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    public String getMacAddress() {
        return _macAddress;
    }
    
    public Uint32 getPosition() {
        return _position;
    }
    
    public VirtualInterface getVirtualInterface() {
        return _virtualInterface;
    }

    
    public VirtualNetworkInterfaceRequirement1Builder setIpAddress(final IpAddress value) {
        this._ipAddress = value;
        return this;
    }
    
    public VirtualNetworkInterfaceRequirement1Builder setMacAddress(final String value) {
        this._macAddress = value;
        return this;
    }
    
    public VirtualNetworkInterfaceRequirement1Builder setPosition(final Uint32 value) {
        this._position = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setPosition(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public VirtualNetworkInterfaceRequirement1Builder setPosition(final Long value) {
        return setPosition(CodeHelpers.compatUint(value));
    }
    
    public VirtualNetworkInterfaceRequirement1Builder setVirtualInterface(final VirtualInterface value) {
        this._virtualInterface = value;
        return this;
    }
    

    @Override
    public VirtualNetworkInterfaceRequirement1 build() {
        return new VirtualNetworkInterfaceRequirement1Impl(this);
    }

    private static final class VirtualNetworkInterfaceRequirement1Impl
        implements VirtualNetworkInterfaceRequirement1 {
    
        private final IpAddress _ipAddress;
        private final String _macAddress;
        private final Uint32 _position;
        private final VirtualInterface _virtualInterface;
    
        VirtualNetworkInterfaceRequirement1Impl(VirtualNetworkInterfaceRequirement1Builder base) {
            this._ipAddress = base.getIpAddress();
            this._macAddress = base.getMacAddress();
            this._position = base.getPosition();
            this._virtualInterface = base.getVirtualInterface();
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
        public Uint32 getPosition() {
            return _position;
        }
        
        @Override
        public VirtualInterface getVirtualInterface() {
            return _virtualInterface;
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
            result = prime * result + Objects.hashCode(_ipAddress);
            result = prime * result + Objects.hashCode(_macAddress);
            result = prime * result + Objects.hashCode(_position);
            result = prime * result + Objects.hashCode(_virtualInterface);
        
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
            if (!VirtualNetworkInterfaceRequirement1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualNetworkInterfaceRequirement1 other = (VirtualNetworkInterfaceRequirement1)obj;
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (!Objects.equals(_macAddress, other.getMacAddress())) {
                return false;
            }
            if (!Objects.equals(_position, other.getPosition())) {
                return false;
            }
            if (!Objects.equals(_virtualInterface, other.getVirtualInterface())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualNetworkInterfaceRequirement1");
            CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
            CodeHelpers.appendValue(helper, "_macAddress", _macAddress);
            CodeHelpers.appendValue(helper, "_position", _position);
            CodeHelpers.appendValue(helper, "_virtualInterface", _virtualInterface);
            return helper.toString();
        }
    }
}
