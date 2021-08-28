package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Pinning1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     Pinning1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new Pinning1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of Pinning1Builder, as instances can be freely passed around without
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
 * @see Pinning1Builder
 * @see Builder
 *
 */
public class Pinning1Builder implements Builder<Pinning1> {

    private ExtendedCpuPolicy.ThreadPolicy _threadPolicy;



    public Pinning1Builder() {
    }
    public Pinning1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedCpuPolicy arg) {
        this._threadPolicy = arg.getThreadPolicy();
    }

    public Pinning1Builder(Pinning1 base) {
        this._threadPolicy = base.getThreadPolicy();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedCpuPolicy</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedCpuPolicy) {
            this._threadPolicy = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedCpuPolicy)arg).getThreadPolicy();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedCpuPolicy]");
    }

    public ExtendedCpuPolicy.ThreadPolicy getThreadPolicy() {
        return _threadPolicy;
    }

    
    public Pinning1Builder setThreadPolicy(final ExtendedCpuPolicy.ThreadPolicy value) {
        this._threadPolicy = value;
        return this;
    }
    

    @Override
    public Pinning1 build() {
        return new Pinning1Impl(this);
    }

    private static final class Pinning1Impl
        implements Pinning1 {
    
        private final ExtendedCpuPolicy.ThreadPolicy _threadPolicy;
    
        Pinning1Impl(Pinning1Builder base) {
            this._threadPolicy = base.getThreadPolicy();
        }
    
        @Override
        public ExtendedCpuPolicy.ThreadPolicy getThreadPolicy() {
            return _threadPolicy;
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
            result = prime * result + Objects.hashCode(_threadPolicy);
        
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
            if (!Pinning1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Pinning1 other = (Pinning1)obj;
            if (!Objects.equals(_threadPolicy, other.getThreadPolicy())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Pinning1");
            CodeHelpers.appendValue(helper, "_threadPolicy", _threadPolicy);
            return helper.toString();
        }
    }
}
