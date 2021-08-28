package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data.VirtualLinkProtocolData;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VirtualLinkProfile1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualLinkProfile1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualLinkProfile1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualLinkProfile1Builder, as instances can be freely passed around without
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
 * @see VirtualLinkProfile1Builder
 * @see Builder
 *
 */
public class VirtualLinkProfile1Builder implements Builder<VirtualLinkProfile1> {

    private VirtualLinkProtocolData _virtualLinkProtocolData;



    public VirtualLinkProfile1Builder() {
    }
    public VirtualLinkProfile1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.ExtendedVldProtocolData arg) {
        this._virtualLinkProtocolData = arg.getVirtualLinkProtocolData();
    }

    public VirtualLinkProfile1Builder(VirtualLinkProfile1 base) {
        this._virtualLinkProtocolData = base.getVirtualLinkProtocolData();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.ExtendedVldProtocolData</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.ExtendedVldProtocolData) {
            this._virtualLinkProtocolData = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.ExtendedVldProtocolData)arg).getVirtualLinkProtocolData();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.ExtendedVldProtocolData]");
    }

    public VirtualLinkProtocolData getVirtualLinkProtocolData() {
        return _virtualLinkProtocolData;
    }

    
    public VirtualLinkProfile1Builder setVirtualLinkProtocolData(final VirtualLinkProtocolData value) {
        this._virtualLinkProtocolData = value;
        return this;
    }
    

    @Override
    public VirtualLinkProfile1 build() {
        return new VirtualLinkProfile1Impl(this);
    }

    private static final class VirtualLinkProfile1Impl
        implements VirtualLinkProfile1 {
    
        private final VirtualLinkProtocolData _virtualLinkProtocolData;
    
        VirtualLinkProfile1Impl(VirtualLinkProfile1Builder base) {
            this._virtualLinkProtocolData = base.getVirtualLinkProtocolData();
        }
    
        @Override
        public VirtualLinkProtocolData getVirtualLinkProtocolData() {
            return _virtualLinkProtocolData;
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
            result = prime * result + Objects.hashCode(_virtualLinkProtocolData);
        
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
            if (!VirtualLinkProfile1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualLinkProfile1 other = (VirtualLinkProfile1)obj;
            if (!Objects.equals(_virtualLinkProtocolData, other.getVirtualLinkProtocolData())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualLinkProfile1");
            CodeHelpers.appendValue(helper, "_virtualLinkProtocolData", _virtualLinkProtocolData);
            return helper.toString();
        }
    }
}
