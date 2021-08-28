package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link SwImageDesc1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     SwImageDesc1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new SwImageDesc1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of SwImageDesc1Builder, as instances can be freely passed around without
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
 * @see SwImageDesc1Builder
 * @see Builder
 *
 */
public class SwImageDesc1Builder implements Builder<SwImageDesc1> {

    private String _vimType;



    public SwImageDesc1Builder() {
    }
    public SwImageDesc1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev.ExtendedVimType arg) {
        this._vimType = arg.getVimType();
    }

    public SwImageDesc1Builder(SwImageDesc1 base) {
        this._vimType = base.getVimType();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev.ExtendedVimType</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev.ExtendedVimType) {
            this._vimType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev.ExtendedVimType)arg).getVimType();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev.ExtendedVimType]");
    }

    public String getVimType() {
        return _vimType;
    }

    
    public SwImageDesc1Builder setVimType(final String value) {
        this._vimType = value;
        return this;
    }
    

    @Override
    public SwImageDesc1 build() {
        return new SwImageDesc1Impl(this);
    }

    private static final class SwImageDesc1Impl
        implements SwImageDesc1 {
    
        private final String _vimType;
    
        SwImageDesc1Impl(SwImageDesc1Builder base) {
            this._vimType = base.getVimType();
        }
    
        @Override
        public String getVimType() {
            return _vimType;
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
            result = prime * result + Objects.hashCode(_vimType);
        
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
            if (!SwImageDesc1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            SwImageDesc1 other = (SwImageDesc1)obj;
            if (!Objects.equals(_vimType, other.getVimType())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SwImageDesc1");
            CodeHelpers.appendValue(helper, "_vimType", _vimType);
            return helper.toString();
        }
    }
}
