package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentListKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ExecutionEnvironmentListBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ExecutionEnvironmentListBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ExecutionEnvironmentListBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ExecutionEnvironmentListBuilder, as instances can be freely passed around without
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
 * @see ExecutionEnvironmentListBuilder
 * @see Builder
 *
 */
public class ExecutionEnvironmentListBuilder implements Builder<ExecutionEnvironmentList> {

    private Map<ExecutionEnvironmentListKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentList> _executionEnvironmentList;


    Map<Class<? extends Augmentation<ExecutionEnvironmentList>>, Augmentation<ExecutionEnvironmentList>> augmentation = Collections.emptyMap();

    public ExecutionEnvironmentListBuilder() {
    }

    public ExecutionEnvironmentListBuilder(ExecutionEnvironmentList base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ExecutionEnvironmentList>>, Augmentation<ExecutionEnvironmentList>> aug =((AugmentationHolder<ExecutionEnvironmentList>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._executionEnvironmentList = base.getExecutionEnvironmentList();
    }


    public Map<ExecutionEnvironmentListKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentList> getExecutionEnvironmentList() {
        return _executionEnvironmentList;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ExecutionEnvironmentList>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ExecutionEnvironmentListBuilder setExecutionEnvironmentList(final Map<ExecutionEnvironmentListKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentList> values) {
        this._executionEnvironmentList = values;
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
      * @deprecated Use {#link #setExecutionEnvironmentList(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ExecutionEnvironmentListBuilder setExecutionEnvironmentList(final List<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentList> values) {
        return setExecutionEnvironmentList(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ExecutionEnvironmentListBuilder addAugmentation(Augmentation<ExecutionEnvironmentList> augmentation) {
        return doAddAugmentation(augmentation.implementedInterface(), augmentation);
    }
    
    /**
      * Add or remove an augmentation to this builder's product.
      *
      * @param augmentationType augmentation type to be added or removed
      * @param augmentationValue augmentation value, null if the augmentation type should be removed
      * @return this builder
      * @deprecated Use either {@link #addAugmentation(Augmentation)} or {@link #removeAugmentation(Class)} instead.
      */
    @Deprecated(forRemoval = true)
    public ExecutionEnvironmentListBuilder addAugmentation(Class<? extends Augmentation<ExecutionEnvironmentList>> augmentationType, Augmentation<ExecutionEnvironmentList> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ExecutionEnvironmentListBuilder removeAugmentation(Class<? extends Augmentation<ExecutionEnvironmentList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ExecutionEnvironmentListBuilder doAddAugmentation(Class<? extends Augmentation<ExecutionEnvironmentList>> augmentationType, Augmentation<ExecutionEnvironmentList> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ExecutionEnvironmentList build() {
        return new ExecutionEnvironmentListImpl(this);
    }

    private static final class ExecutionEnvironmentListImpl
        extends AbstractAugmentable<ExecutionEnvironmentList>
        implements ExecutionEnvironmentList {
    
        private final Map<ExecutionEnvironmentListKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentList> _executionEnvironmentList;
    
        ExecutionEnvironmentListImpl(ExecutionEnvironmentListBuilder base) {
            super(base.augmentation);
            this._executionEnvironmentList = CodeHelpers.emptyToNull(base.getExecutionEnvironmentList());
        }
    
        @Override
        public Map<ExecutionEnvironmentListKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentList> getExecutionEnvironmentList() {
            return _executionEnvironmentList;
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
            result = prime * result + Objects.hashCode(_executionEnvironmentList);
            result = prime * result + Objects.hashCode(augmentations());
        
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
            if (!ExecutionEnvironmentList.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ExecutionEnvironmentList other = (ExecutionEnvironmentList)obj;
            if (!Objects.equals(_executionEnvironmentList, other.getExecutionEnvironmentList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExecutionEnvironmentListImpl otherImpl = (ExecutionEnvironmentListImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ExecutionEnvironmentList>>, Augmentation<ExecutionEnvironmentList>> e : augmentations().entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ExecutionEnvironmentList");
            CodeHelpers.appendValue(helper, "_executionEnvironmentList", _executionEnvironmentList);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
