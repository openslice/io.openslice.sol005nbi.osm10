package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.vnfr;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.primitive.parameter.value.Parameter;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.primitive.parameter.value.ParameterKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link PrimitiveBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     PrimitiveBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new PrimitiveBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of PrimitiveBuilder, as instances can be freely passed around without
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
 * @see PrimitiveBuilder
 * @see Builder
 *
 */
public class PrimitiveBuilder implements Builder<Primitive> {

    private String _executionErrorDetails;
    private String _executionId;
    private Primitive.ExecutionStatus _executionStatus;
    private String _name;
    private Map<ParameterKey, Parameter> _parameter;
    private PrimitiveKey key;


    Map<Class<? extends Augmentation<Primitive>>, Augmentation<Primitive>> augmentation = Collections.emptyMap();

    public PrimitiveBuilder() {
    }
    public PrimitiveBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public PrimitiveBuilder(Primitive base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Primitive>>, Augmentation<Primitive>> aug =((AugmentationHolder<Primitive>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._executionErrorDetails = base.getExecutionErrorDetails();
        this._executionId = base.getExecutionId();
        this._executionStatus = base.getExecutionStatus();
        this._parameter = base.getParameter();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue) {
            this._parameter = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue)arg).getParameter();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue]");
    }

    public PrimitiveKey key() {
        return key;
    }
    
    public String getExecutionErrorDetails() {
        return _executionErrorDetails;
    }
    
    public String getExecutionId() {
        return _executionId;
    }
    
    public Primitive.ExecutionStatus getExecutionStatus() {
        return _executionStatus;
    }
    
    public String getName() {
        return _name;
    }
    
    public Map<ParameterKey, Parameter> getParameter() {
        return _parameter;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Primitive>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public PrimitiveBuilder withKey(final PrimitiveKey key) {
        this.key = key;
        return this;
    }
    
    public PrimitiveBuilder setExecutionErrorDetails(final String value) {
        this._executionErrorDetails = value;
        return this;
    }
    
    public PrimitiveBuilder setExecutionId(final String value) {
        this._executionId = value;
        return this;
    }
    
    public PrimitiveBuilder setExecutionStatus(final Primitive.ExecutionStatus value) {
        this._executionStatus = value;
        return this;
    }
    
    public PrimitiveBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public PrimitiveBuilder setParameter(final Map<ParameterKey, Parameter> values) {
        this._parameter = values;
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
      * @deprecated Use {#link #setParameter(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public PrimitiveBuilder setParameter(final List<Parameter> values) {
        return setParameter(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public PrimitiveBuilder addAugmentation(Augmentation<Primitive> augmentation) {
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
    public PrimitiveBuilder addAugmentation(Class<? extends Augmentation<Primitive>> augmentationType, Augmentation<Primitive> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public PrimitiveBuilder removeAugmentation(Class<? extends Augmentation<Primitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private PrimitiveBuilder doAddAugmentation(Class<? extends Augmentation<Primitive>> augmentationType, Augmentation<Primitive> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Primitive build() {
        return new PrimitiveImpl(this);
    }

    private static final class PrimitiveImpl
        extends AbstractAugmentable<Primitive>
        implements Primitive {
    
        private final String _executionErrorDetails;
        private final String _executionId;
        private final Primitive.ExecutionStatus _executionStatus;
        private final String _name;
        private final Map<ParameterKey, Parameter> _parameter;
        private final PrimitiveKey key;
    
        PrimitiveImpl(PrimitiveBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new PrimitiveKey(base.getName());
            }
            this._name = key.getName();
            this._executionErrorDetails = base.getExecutionErrorDetails();
            this._executionId = base.getExecutionId();
            this._executionStatus = base.getExecutionStatus();
            this._parameter = CodeHelpers.emptyToNull(base.getParameter());
        }
    
        @Override
        public PrimitiveKey key() {
            return key;
        }
        
        @Override
        public String getExecutionErrorDetails() {
            return _executionErrorDetails;
        }
        
        @Override
        public String getExecutionId() {
            return _executionId;
        }
        
        @Override
        public Primitive.ExecutionStatus getExecutionStatus() {
            return _executionStatus;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Map<ParameterKey, Parameter> getParameter() {
            return _parameter;
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
            result = prime * result + Objects.hashCode(_executionErrorDetails);
            result = prime * result + Objects.hashCode(_executionId);
            result = prime * result + Objects.hashCode(_executionStatus);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameter);
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
            if (!Primitive.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Primitive other = (Primitive)obj;
            if (!Objects.equals(_executionErrorDetails, other.getExecutionErrorDetails())) {
                return false;
            }
            if (!Objects.equals(_executionId, other.getExecutionId())) {
                return false;
            }
            if (!Objects.equals(_executionStatus, other.getExecutionStatus())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PrimitiveImpl otherImpl = (PrimitiveImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Primitive>>, Augmentation<Primitive>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Primitive");
            CodeHelpers.appendValue(helper, "_executionErrorDetails", _executionErrorDetails);
            CodeHelpers.appendValue(helper, "_executionId", _executionId);
            CodeHelpers.appendValue(helper, "_executionStatus", _executionStatus);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
