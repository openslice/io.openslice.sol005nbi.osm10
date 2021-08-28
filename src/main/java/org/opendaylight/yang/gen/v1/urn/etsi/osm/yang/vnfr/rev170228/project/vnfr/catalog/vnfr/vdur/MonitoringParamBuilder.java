package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.NfviMetricType;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link MonitoringParamBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     MonitoringParamBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new MonitoringParamBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of MonitoringParamBuilder, as instances can be freely passed around without
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
 * @see MonitoringParamBuilder
 * @see Builder
 *
 */
public class MonitoringParamBuilder implements Builder<MonitoringParam> {

    private String _id;
    private String _interfaceNameRef;
    private NfviMetricType _nfviMetric;
    private MonitoringParamKey key;


    Map<Class<? extends Augmentation<MonitoringParam>>, Augmentation<MonitoringParam>> augmentation = Collections.emptyMap();

    public MonitoringParamBuilder() {
    }

    public MonitoringParamBuilder(MonitoringParam base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<MonitoringParam>>, Augmentation<MonitoringParam>> aug =((AugmentationHolder<MonitoringParam>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._interfaceNameRef = base.getInterfaceNameRef();
        this._nfviMetric = base.getNfviMetric();
    }


    public MonitoringParamKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getInterfaceNameRef() {
        return _interfaceNameRef;
    }
    
    public NfviMetricType getNfviMetric() {
        return _nfviMetric;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<MonitoringParam>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public MonitoringParamBuilder withKey(final MonitoringParamKey key) {
        this.key = key;
        return this;
    }
    
    public MonitoringParamBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public MonitoringParamBuilder setInterfaceNameRef(final String value) {
        this._interfaceNameRef = value;
        return this;
    }
    
    public MonitoringParamBuilder setNfviMetric(final NfviMetricType value) {
        this._nfviMetric = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public MonitoringParamBuilder addAugmentation(Augmentation<MonitoringParam> augmentation) {
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
    public MonitoringParamBuilder addAugmentation(Class<? extends Augmentation<MonitoringParam>> augmentationType, Augmentation<MonitoringParam> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public MonitoringParamBuilder removeAugmentation(Class<? extends Augmentation<MonitoringParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private MonitoringParamBuilder doAddAugmentation(Class<? extends Augmentation<MonitoringParam>> augmentationType, Augmentation<MonitoringParam> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public MonitoringParam build() {
        return new MonitoringParamImpl(this);
    }

    private static final class MonitoringParamImpl
        extends AbstractAugmentable<MonitoringParam>
        implements MonitoringParam {
    
        private final String _id;
        private final String _interfaceNameRef;
        private final NfviMetricType _nfviMetric;
        private final MonitoringParamKey key;
    
        MonitoringParamImpl(MonitoringParamBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new MonitoringParamKey(base.getId());
            }
            this._id = key.getId();
            this._interfaceNameRef = base.getInterfaceNameRef();
            this._nfviMetric = base.getNfviMetric();
        }
    
        @Override
        public MonitoringParamKey key() {
            return key;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getInterfaceNameRef() {
            return _interfaceNameRef;
        }
        
        @Override
        public NfviMetricType getNfviMetric() {
            return _nfviMetric;
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_interfaceNameRef);
            result = prime * result + Objects.hashCode(_nfviMetric);
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
            if (!MonitoringParam.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            MonitoringParam other = (MonitoringParam)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_interfaceNameRef, other.getInterfaceNameRef())) {
                return false;
            }
            if (!Objects.equals(_nfviMetric, other.getNfviMetric())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MonitoringParamImpl otherImpl = (MonitoringParamImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MonitoringParam>>, Augmentation<MonitoringParam>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MonitoringParam");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_interfaceNameRef", _interfaceNameRef);
            CodeHelpers.appendValue(helper, "_nfviMetric", _nfviMetric);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
