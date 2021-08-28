package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list.execution.environment.list.ExecutionEnvironmentModel;
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

    private String _connectionPointRef;
    private ExecutionEnvironmentModel _executionEnvironmentModel;
    private String _id;
    private String _metricService;
    private ExecutionEnvironmentListKey key;


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
        this.key = base.key();
        this._id = base.getId();
        this._connectionPointRef = base.getConnectionPointRef();
        this._executionEnvironmentModel = base.getExecutionEnvironmentModel();
        this._metricService = base.getMetricService();
    }


    public ExecutionEnvironmentListKey key() {
        return key;
    }
    
    public String getConnectionPointRef() {
        return _connectionPointRef;
    }
    
    public ExecutionEnvironmentModel getExecutionEnvironmentModel() {
        return _executionEnvironmentModel;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getMetricService() {
        return _metricService;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ExecutionEnvironmentList>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ExecutionEnvironmentListBuilder withKey(final ExecutionEnvironmentListKey key) {
        this.key = key;
        return this;
    }
    
    public ExecutionEnvironmentListBuilder setConnectionPointRef(final String value) {
        this._connectionPointRef = value;
        return this;
    }
    
    public ExecutionEnvironmentListBuilder setExecutionEnvironmentModel(final ExecutionEnvironmentModel value) {
        this._executionEnvironmentModel = value;
        return this;
    }
    
    public ExecutionEnvironmentListBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public ExecutionEnvironmentListBuilder setMetricService(final String value) {
        this._metricService = value;
        return this;
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
    
        private final String _connectionPointRef;
        private final ExecutionEnvironmentModel _executionEnvironmentModel;
        private final String _id;
        private final String _metricService;
        private final ExecutionEnvironmentListKey key;
    
        ExecutionEnvironmentListImpl(ExecutionEnvironmentListBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ExecutionEnvironmentListKey(base.getId());
            }
            this._id = key.getId();
            this._connectionPointRef = base.getConnectionPointRef();
            this._executionEnvironmentModel = base.getExecutionEnvironmentModel();
            this._metricService = base.getMetricService();
        }
    
        @Override
        public ExecutionEnvironmentListKey key() {
            return key;
        }
        
        @Override
        public String getConnectionPointRef() {
            return _connectionPointRef;
        }
        
        @Override
        public ExecutionEnvironmentModel getExecutionEnvironmentModel() {
            return _executionEnvironmentModel;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getMetricService() {
            return _metricService;
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
            result = prime * result + Objects.hashCode(_connectionPointRef);
            result = prime * result + Objects.hashCode(_executionEnvironmentModel);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_metricService);
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
            if (!Objects.equals(_connectionPointRef, other.getConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_executionEnvironmentModel, other.getExecutionEnvironmentModel())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_metricService, other.getMetricService())) {
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
            CodeHelpers.appendValue(helper, "_connectionPointRef", _connectionPointRef);
            CodeHelpers.appendValue(helper, "_executionEnvironmentModel", _executionEnvironmentModel);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_metricService", _metricService);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
