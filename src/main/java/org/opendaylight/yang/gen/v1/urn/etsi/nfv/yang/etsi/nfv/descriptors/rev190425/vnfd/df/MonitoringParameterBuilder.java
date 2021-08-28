package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link MonitoringParameterBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     MonitoringParameterBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new MonitoringParameterBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of MonitoringParameterBuilder, as instances can be freely passed around without
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
 * @see MonitoringParameterBuilder
 * @see Builder
 *
 */
public class MonitoringParameterBuilder implements Builder<MonitoringParameter> {

    private Uint64 _collectionPeriod;
    private String _id;
    private String _name;
    private String _performanceMetric;
    private MonitoringParameterKey key;


    Map<Class<? extends Augmentation<MonitoringParameter>>, Augmentation<MonitoringParameter>> augmentation = Collections.emptyMap();

    public MonitoringParameterBuilder() {
    }
    public MonitoringParameterBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter arg) {
        this._name = arg.getName();
        this._performanceMetric = arg.getPerformanceMetric();
        this._collectionPeriod = arg.getCollectionPeriod();
    }

    public MonitoringParameterBuilder(MonitoringParameter base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<MonitoringParameter>>, Augmentation<MonitoringParameter>> aug =((AugmentationHolder<MonitoringParameter>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._collectionPeriod = base.getCollectionPeriod();
        this._name = base.getName();
        this._performanceMetric = base.getPerformanceMetric();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter)arg).getName();
            this._performanceMetric = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter)arg).getPerformanceMetric();
            this._collectionPeriod = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter)arg).getCollectionPeriod();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.MonitoringParameter]");
    }

    public MonitoringParameterKey key() {
        return key;
    }
    
    public Uint64 getCollectionPeriod() {
        return _collectionPeriod;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getPerformanceMetric() {
        return _performanceMetric;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<MonitoringParameter>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public MonitoringParameterBuilder withKey(final MonitoringParameterKey key) {
        this.key = key;
        return this;
    }
    
    public MonitoringParameterBuilder setCollectionPeriod(final Uint64 value) {
        this._collectionPeriod = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCollectionPeriod(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public MonitoringParameterBuilder setCollectionPeriod(final BigInteger value) {
        return setCollectionPeriod(CodeHelpers.compatUint(value));
    }
    
    public MonitoringParameterBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public MonitoringParameterBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public MonitoringParameterBuilder setPerformanceMetric(final String value) {
        this._performanceMetric = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public MonitoringParameterBuilder addAugmentation(Augmentation<MonitoringParameter> augmentation) {
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
    public MonitoringParameterBuilder addAugmentation(Class<? extends Augmentation<MonitoringParameter>> augmentationType, Augmentation<MonitoringParameter> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public MonitoringParameterBuilder removeAugmentation(Class<? extends Augmentation<MonitoringParameter>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private MonitoringParameterBuilder doAddAugmentation(Class<? extends Augmentation<MonitoringParameter>> augmentationType, Augmentation<MonitoringParameter> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public MonitoringParameter build() {
        return new MonitoringParameterImpl(this);
    }

    private static final class MonitoringParameterImpl
        extends AbstractAugmentable<MonitoringParameter>
        implements MonitoringParameter {
    
        private final Uint64 _collectionPeriod;
        private final String _id;
        private final String _name;
        private final String _performanceMetric;
        private final MonitoringParameterKey key;
    
        MonitoringParameterImpl(MonitoringParameterBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new MonitoringParameterKey(base.getId());
            }
            this._id = key.getId();
            this._collectionPeriod = base.getCollectionPeriod();
            this._name = base.getName();
            this._performanceMetric = base.getPerformanceMetric();
        }
    
        @Override
        public MonitoringParameterKey key() {
            return key;
        }
        
        @Override
        public Uint64 getCollectionPeriod() {
            return _collectionPeriod;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getPerformanceMetric() {
            return _performanceMetric;
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
            result = prime * result + Objects.hashCode(_collectionPeriod);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_performanceMetric);
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
            if (!MonitoringParameter.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            MonitoringParameter other = (MonitoringParameter)obj;
            if (!Objects.equals(_collectionPeriod, other.getCollectionPeriod())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_performanceMetric, other.getPerformanceMetric())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MonitoringParameterImpl otherImpl = (MonitoringParameterImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MonitoringParameter>>, Augmentation<MonitoringParameter>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MonitoringParameter");
            CodeHelpers.appendValue(helper, "_collectionPeriod", _collectionPeriod);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_performanceMetric", _performanceMetric);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
