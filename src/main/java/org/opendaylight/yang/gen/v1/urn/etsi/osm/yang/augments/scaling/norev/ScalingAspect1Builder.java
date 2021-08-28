package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev;
import com.google.common.base.MoreObjects;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.ScalingConfigAction;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.ScalingConfigActionKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.ScalingPolicy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.ScalingPolicyKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ScalingAspect1Builder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ScalingAspect1Builder createTarget(int fooXyzzy, int barBaz) {
 *         return new ScalingAspect1BuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ScalingAspect1Builder, as instances can be freely passed around without
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
 * @see ScalingAspect1Builder
 * @see Builder
 *
 */
public class ScalingAspect1Builder implements Builder<ScalingAspect1> {

    private Map<ScalingConfigActionKey, ScalingConfigAction> _scalingConfigAction;
    private Map<ScalingPolicyKey, ScalingPolicy> _scalingPolicy;



    public ScalingAspect1Builder() {
    }
    public ScalingAspect1Builder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.ExtendedScaling arg) {
        this._scalingPolicy = arg.getScalingPolicy();
        this._scalingConfigAction = arg.getScalingConfigAction();
    }

    public ScalingAspect1Builder(ScalingAspect1 base) {
        this._scalingConfigAction = base.getScalingConfigAction();
        this._scalingPolicy = base.getScalingPolicy();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.ExtendedScaling</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.ExtendedScaling) {
            this._scalingPolicy = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.ExtendedScaling)arg).getScalingPolicy();
            this._scalingConfigAction = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.ExtendedScaling)arg).getScalingConfigAction();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.ExtendedScaling]");
    }

    public Map<ScalingConfigActionKey, ScalingConfigAction> getScalingConfigAction() {
        return _scalingConfigAction;
    }
    
    public Map<ScalingPolicyKey, ScalingPolicy> getScalingPolicy() {
        return _scalingPolicy;
    }

    public ScalingAspect1Builder setScalingConfigAction(final Map<ScalingConfigActionKey, ScalingConfigAction> values) {
        this._scalingConfigAction = values;
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
      * @deprecated Use {#link #setScalingConfigAction(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ScalingAspect1Builder setScalingConfigAction(final List<ScalingConfigAction> values) {
        return setScalingConfigAction(CodeHelpers.compatMap(values));
    }
    public ScalingAspect1Builder setScalingPolicy(final Map<ScalingPolicyKey, ScalingPolicy> values) {
        this._scalingPolicy = values;
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
      * @deprecated Use {#link #setScalingPolicy(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ScalingAspect1Builder setScalingPolicy(final List<ScalingPolicy> values) {
        return setScalingPolicy(CodeHelpers.compatMap(values));
    }
    

    @Override
    public ScalingAspect1 build() {
        return new ScalingAspect1Impl(this);
    }

    private static final class ScalingAspect1Impl
        implements ScalingAspect1 {
    
        private final Map<ScalingConfigActionKey, ScalingConfigAction> _scalingConfigAction;
        private final Map<ScalingPolicyKey, ScalingPolicy> _scalingPolicy;
    
        ScalingAspect1Impl(ScalingAspect1Builder base) {
            this._scalingConfigAction = CodeHelpers.emptyToNull(base.getScalingConfigAction());
            this._scalingPolicy = CodeHelpers.emptyToNull(base.getScalingPolicy());
        }
    
        @Override
        public Map<ScalingConfigActionKey, ScalingConfigAction> getScalingConfigAction() {
            return _scalingConfigAction;
        }
        
        @Override
        public Map<ScalingPolicyKey, ScalingPolicy> getScalingPolicy() {
            return _scalingPolicy;
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
            result = prime * result + Objects.hashCode(_scalingConfigAction);
            result = prime * result + Objects.hashCode(_scalingPolicy);
        
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
            if (!ScalingAspect1.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ScalingAspect1 other = (ScalingAspect1)obj;
            if (!Objects.equals(_scalingConfigAction, other.getScalingConfigAction())) {
                return false;
            }
            if (!Objects.equals(_scalingPolicy, other.getScalingPolicy())) {
                return false;
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingAspect1");
            CodeHelpers.appendValue(helper, "_scalingConfigAction", _scalingConfigAction);
            CodeHelpers.appendValue(helper, "_scalingPolicy", _scalingPolicy);
            return helper.toString();
        }
    }
}
