package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev;
import com.google.common.base.MoreObjects;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.extended.vnf.configuration.Day12;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.extended.vnf.configuration.Day12Key;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link OperateVnfOpConfig1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     OperateVnfOpConfig1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new OperateVnfOpConfig1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of OperateVnfOpConfig1Builder, as instances can be freely passed around without
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
 * @see OperateVnfOpConfig1Builder
 * @see Builder
 *
 */
public class OperateVnfOpConfig1Builder implements Builder<OperateVnfOpConfig1> {

    private Map<Day12Key, Day12> _day12;



    public OperateVnfOpConfig1Builder() {
    }
    public OperateVnfOpConfig1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.ExtendedVnfConfiguration arg) {
        this._day12 = arg.getDay12();
    }

    public OperateVnfOpConfig1Builder(OperateVnfOpConfig1 base) {
        this._day12 = base.getDay12();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.ExtendedVnfConfiguration</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.ExtendedVnfConfiguration) {
            this._day12 = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.ExtendedVnfConfiguration)arg).getDay12();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.ExtendedVnfConfiguration]");
    }

    public Map<Day12Key, Day12> getDay12() {
        return _day12;
    }

    public OperateVnfOpConfig1Builder setDay12(final Map<Day12Key, Day12> values) {
        this._day12 = values;
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
      * @deprecated Use {#link #setDay12(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public OperateVnfOpConfig1Builder setDay12(final List<Day12> values) {
        return setDay12(CodeHelpers.compatMap(values));
    }
    

    @Override
    public OperateVnfOpConfig1 build() {
        return new OperateVnfOpConfig1Impl(this);
    }

    private static final class OperateVnfOpConfig1Impl
        implements OperateVnfOpConfig1 {
    
        private final Map<Day12Key, Day12> _day12;
    
        OperateVnfOpConfig1Impl(OperateVnfOpConfig1Builder base) {
            this._day12 = CodeHelpers.emptyToNull(base.getDay12());
        }
    
        @Override
        public Map<Day12Key, Day12> getDay12() {
            return _day12;
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
            result = prime * result + Objects.hashCode(_day12);
        
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
            if (!OperateVnfOpConfig1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            OperateVnfOpConfig1 other = (OperateVnfOpConfig1)obj;
            if (!Objects.equals(_day12, other.getDay12())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("OperateVnfOpConfig1");
            CodeHelpers.appendValue(helper, "_day12", _day12);
            return helper.toString();
        }
    }
}
