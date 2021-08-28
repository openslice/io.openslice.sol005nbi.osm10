package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link IntCpd1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     IntCpd1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new IntCpd1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of IntCpd1Builder, as instances can be freely passed around without
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
 * @see IntCpd1Builder
 * @see Builder
 *
 */
public class IntCpd1Builder implements Builder<IntCpd1> {

    private ExtendedCpd.PortSecurityDisableStrategy _portSecurityDisableStrategy;
    private Boolean _portSecurityEnabled;



    public IntCpd1Builder() {
    }
    public IntCpd1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.ExtendedCpd arg) {
        this._portSecurityEnabled = arg.isPortSecurityEnabled();
        this._portSecurityDisableStrategy = arg.getPortSecurityDisableStrategy();
    }

    public IntCpd1Builder(IntCpd1 base) {
        this._portSecurityDisableStrategy = base.getPortSecurityDisableStrategy();
        this._portSecurityEnabled = base.isPortSecurityEnabled();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.ExtendedCpd</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.ExtendedCpd) {
            this._portSecurityEnabled = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.ExtendedCpd)arg).isPortSecurityEnabled();
            this._portSecurityDisableStrategy = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.ExtendedCpd)arg).getPortSecurityDisableStrategy();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.ExtendedCpd]");
    }

    public ExtendedCpd.PortSecurityDisableStrategy getPortSecurityDisableStrategy() {
        return _portSecurityDisableStrategy;
    }
    
    public Boolean isPortSecurityEnabled() {
        return _portSecurityEnabled;
    }

    
    public IntCpd1Builder setPortSecurityDisableStrategy(final ExtendedCpd.PortSecurityDisableStrategy value) {
        this._portSecurityDisableStrategy = value;
        return this;
    }
    
    public IntCpd1Builder setPortSecurityEnabled(final Boolean value) {
        this._portSecurityEnabled = value;
        return this;
    }
    

    @Override
    public IntCpd1 build() {
        return new IntCpd1Impl(this);
    }

    private static final class IntCpd1Impl
        implements IntCpd1 {
    
        private final ExtendedCpd.PortSecurityDisableStrategy _portSecurityDisableStrategy;
        private final Boolean _portSecurityEnabled;
    
        IntCpd1Impl(IntCpd1Builder base) {
            this._portSecurityDisableStrategy = base.getPortSecurityDisableStrategy();
            this._portSecurityEnabled = base.isPortSecurityEnabled();
        }
    
        @Override
        public ExtendedCpd.PortSecurityDisableStrategy getPortSecurityDisableStrategy() {
            return _portSecurityDisableStrategy;
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
            result = prime * result + Objects.hashCode(_portSecurityDisableStrategy);
            result = prime * result + Objects.hashCode(_portSecurityEnabled);
        
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
            if (!IntCpd1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            IntCpd1 other = (IntCpd1)obj;
            if (!Objects.equals(_portSecurityDisableStrategy, other.getPortSecurityDisableStrategy())) {
                return false;
            }
            if (!Objects.equals(_portSecurityEnabled, other.isPortSecurityEnabled())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("IntCpd1");
            CodeHelpers.appendValue(helper, "_portSecurityDisableStrategy", _portSecurityDisableStrategy);
            CodeHelpers.appendValue(helper, "_portSecurityEnabled", _portSecurityEnabled);
            return helper.toString();
        }
    }
}
