package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.mem.quota.MemQuota;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.NumaNodePolicy;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VirtualMemory1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualMemory1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualMemory1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualMemory1Builder, as instances can be freely passed around without
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
 * @see VirtualMemory1Builder
 * @see Builder
 *
 */
public class VirtualMemory1Builder implements Builder<VirtualMemory1> {

    private MemQuota _memQuota;
    private ExtendedMempageSize.MempageSize _mempageSize;
    private NumaNodePolicy _numaNodePolicy;



    public VirtualMemory1Builder() {
    }
    public VirtualMemory1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedNuma arg) {
        this._numaNodePolicy = arg.getNumaNodePolicy();
    }
    public VirtualMemory1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedMempageSize arg) {
        this._mempageSize = arg.getMempageSize();
    }
    public VirtualMemory1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedMemQuota arg) {
        this._memQuota = arg.getMemQuota();
    }

    public VirtualMemory1Builder(VirtualMemory1 base) {
        this._memQuota = base.getMemQuota();
        this._mempageSize = base.getMempageSize();
        this._numaNodePolicy = base.getNumaNodePolicy();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedNuma</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedMempageSize</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedMemQuota</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedNuma) {
            this._numaNodePolicy = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedNuma)arg).getNumaNodePolicy();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedMempageSize) {
            this._mempageSize = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedMempageSize)arg).getMempageSize();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedMemQuota) {
            this._memQuota = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedMemQuota)arg).getMemQuota();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedNuma, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedMempageSize, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedMemQuota]");
    }

    public MemQuota getMemQuota() {
        return _memQuota;
    }
    
    public ExtendedMempageSize.MempageSize getMempageSize() {
        return _mempageSize;
    }
    
    public NumaNodePolicy getNumaNodePolicy() {
        return _numaNodePolicy;
    }

    
    public VirtualMemory1Builder setMemQuota(final MemQuota value) {
        this._memQuota = value;
        return this;
    }
    
    public VirtualMemory1Builder setMempageSize(final ExtendedMempageSize.MempageSize value) {
        this._mempageSize = value;
        return this;
    }
    
    public VirtualMemory1Builder setNumaNodePolicy(final NumaNodePolicy value) {
        this._numaNodePolicy = value;
        return this;
    }
    

    @Override
    public VirtualMemory1 build() {
        return new VirtualMemory1Impl(this);
    }

    private static final class VirtualMemory1Impl
        implements VirtualMemory1 {
    
        private final MemQuota _memQuota;
        private final ExtendedMempageSize.MempageSize _mempageSize;
        private final NumaNodePolicy _numaNodePolicy;
    
        VirtualMemory1Impl(VirtualMemory1Builder base) {
            this._memQuota = base.getMemQuota();
            this._mempageSize = base.getMempageSize();
            this._numaNodePolicy = base.getNumaNodePolicy();
        }
    
        @Override
        public MemQuota getMemQuota() {
            return _memQuota;
        }
        
        @Override
        public ExtendedMempageSize.MempageSize getMempageSize() {
            return _mempageSize;
        }
        
        @Override
        public NumaNodePolicy getNumaNodePolicy() {
            return _numaNodePolicy;
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
            result = prime * result + Objects.hashCode(_memQuota);
            result = prime * result + Objects.hashCode(_mempageSize);
            result = prime * result + Objects.hashCode(_numaNodePolicy);
        
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
            if (!VirtualMemory1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualMemory1 other = (VirtualMemory1)obj;
            if (!Objects.equals(_memQuota, other.getMemQuota())) {
                return false;
            }
            if (!Objects.equals(_mempageSize, other.getMempageSize())) {
                return false;
            }
            if (!Objects.equals(_numaNodePolicy, other.getNumaNodePolicy())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualMemory1");
            CodeHelpers.appendValue(helper, "_memQuota", _memQuota);
            CodeHelpers.appendValue(helper, "_mempageSize", _mempageSize);
            CodeHelpers.appendValue(helper, "_numaNodePolicy", _numaNodePolicy);
            return helper.toString();
        }
    }
}
