package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.extended.vld.ProviderNetwork;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VirtualLinkDesc1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualLinkDesc1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualLinkDesc1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualLinkDesc1Builder, as instances can be freely passed around without
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
 * @see VirtualLinkDesc1Builder
 * @see Builder
 *
 */
public class VirtualLinkDesc1Builder implements Builder<VirtualLinkDesc1> {

    private ProviderNetwork _providerNetwork;
    private String _vimNetworkName;
    private Boolean _mgmtNetwork;



    public VirtualLinkDesc1Builder() {
    }
    public VirtualLinkDesc1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.ExtendedVld arg) {
        this._providerNetwork = arg.getProviderNetwork();
        this._mgmtNetwork = arg.isMgmtNetwork();
        this._vimNetworkName = arg.getVimNetworkName();
    }

    public VirtualLinkDesc1Builder(VirtualLinkDesc1 base) {
        this._providerNetwork = base.getProviderNetwork();
        this._vimNetworkName = base.getVimNetworkName();
        this._mgmtNetwork = base.isMgmtNetwork();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.ExtendedVld</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.ExtendedVld) {
            this._providerNetwork = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.ExtendedVld)arg).getProviderNetwork();
            this._mgmtNetwork = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.ExtendedVld)arg).isMgmtNetwork();
            this._vimNetworkName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.ExtendedVld)arg).getVimNetworkName();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.ExtendedVld]");
    }

    public ProviderNetwork getProviderNetwork() {
        return _providerNetwork;
    }
    
    public String getVimNetworkName() {
        return _vimNetworkName;
    }
    
    public Boolean isMgmtNetwork() {
        return _mgmtNetwork;
    }

    
    public VirtualLinkDesc1Builder setProviderNetwork(final ProviderNetwork value) {
        this._providerNetwork = value;
        return this;
    }
    
    public VirtualLinkDesc1Builder setVimNetworkName(final String value) {
        this._vimNetworkName = value;
        return this;
    }
    
    public VirtualLinkDesc1Builder setMgmtNetwork(final Boolean value) {
        this._mgmtNetwork = value;
        return this;
    }
    

    @Override
    public VirtualLinkDesc1 build() {
        return new VirtualLinkDesc1Impl(this);
    }

    private static final class VirtualLinkDesc1Impl
        implements VirtualLinkDesc1 {
    
        private final ProviderNetwork _providerNetwork;
        private final String _vimNetworkName;
        private final Boolean _mgmtNetwork;
    
        VirtualLinkDesc1Impl(VirtualLinkDesc1Builder base) {
            this._providerNetwork = base.getProviderNetwork();
            this._vimNetworkName = base.getVimNetworkName();
            this._mgmtNetwork = base.isMgmtNetwork();
        }
    
        @Override
        public ProviderNetwork getProviderNetwork() {
            return _providerNetwork;
        }
        
        @Override
        public String getVimNetworkName() {
            return _vimNetworkName;
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
            result = prime * result + Objects.hashCode(_providerNetwork);
            result = prime * result + Objects.hashCode(_vimNetworkName);
            result = prime * result + Objects.hashCode(_mgmtNetwork);
        
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
            if (!VirtualLinkDesc1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualLinkDesc1 other = (VirtualLinkDesc1)obj;
            if (!Objects.equals(_providerNetwork, other.getProviderNetwork())) {
                return false;
            }
            if (!Objects.equals(_vimNetworkName, other.getVimNetworkName())) {
                return false;
            }
            if (!Objects.equals(_mgmtNetwork, other.isMgmtNetwork())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualLinkDesc1");
            CodeHelpers.appendValue(helper, "_providerNetwork", _providerNetwork);
            CodeHelpers.appendValue(helper, "_vimNetworkName", _vimNetworkName);
            CodeHelpers.appendValue(helper, "_mgmtNetwork", _mgmtNetwork);
            return helper.toString();
        }
    }
}
