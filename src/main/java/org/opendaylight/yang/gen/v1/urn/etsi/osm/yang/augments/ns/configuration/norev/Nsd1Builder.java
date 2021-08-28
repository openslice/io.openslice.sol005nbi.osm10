package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.extended.ns.configuration.NsConfiguration;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Nsd1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     Nsd1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new Nsd1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of Nsd1Builder, as instances can be freely passed around without
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
 * @see Nsd1Builder
 * @see Builder
 *
 */
public class Nsd1Builder implements Builder<Nsd1> {

    private NsConfiguration _nsConfiguration;



    public Nsd1Builder() {
    }
    public Nsd1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.ExtendedNsConfiguration arg) {
        this._nsConfiguration = arg.getNsConfiguration();
    }

    public Nsd1Builder(Nsd1 base) {
        this._nsConfiguration = base.getNsConfiguration();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.ExtendedNsConfiguration</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.ExtendedNsConfiguration) {
            this._nsConfiguration = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.ExtendedNsConfiguration)arg).getNsConfiguration();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.ExtendedNsConfiguration]");
    }

    public NsConfiguration getNsConfiguration() {
        return _nsConfiguration;
    }

    
    public Nsd1Builder setNsConfiguration(final NsConfiguration value) {
        this._nsConfiguration = value;
        return this;
    }
    

    @Override
    public Nsd1 build() {
        return new Nsd1Impl(this);
    }

    private static final class Nsd1Impl
        implements Nsd1 {
    
        private final NsConfiguration _nsConfiguration;
    
        Nsd1Impl(Nsd1Builder base) {
            this._nsConfiguration = base.getNsConfiguration();
        }
    
        @Override
        public NsConfiguration getNsConfiguration() {
            return _nsConfiguration;
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
            result = prime * result + Objects.hashCode(_nsConfiguration);
        
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
            if (!Nsd1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Nsd1 other = (Nsd1)obj;
            if (!Objects.equals(_nsConfiguration, other.getNsConfiguration())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nsd1");
            CodeHelpers.appendValue(helper, "_nsConfiguration", _nsConfiguration);
            return helper.toString();
        }
    }
}
