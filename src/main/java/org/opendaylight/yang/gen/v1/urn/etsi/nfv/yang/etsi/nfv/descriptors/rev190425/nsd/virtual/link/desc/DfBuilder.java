package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc.df.Qos;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link DfBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     DfBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new DfBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of DfBuilder, as instances can be freely passed around without
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
 * @see DfBuilder
 * @see Builder
 *
 */
public class DfBuilder implements Builder<Df> {

    private String _id;
    private Qos _qos;
    private Df.ServiceAvailabilityLevel _serviceAvailabilityLevel;
    private DfKey key;


    Map<Class<? extends Augmentation<Df>>, Augmentation<Df>> augmentation = Collections.emptyMap();

    public DfBuilder() {
    }

    public DfBuilder(Df base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Df>>, Augmentation<Df>> aug =((AugmentationHolder<Df>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._qos = base.getQos();
        this._serviceAvailabilityLevel = base.getServiceAvailabilityLevel();
    }


    public DfKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public Qos getQos() {
        return _qos;
    }
    
    public Df.ServiceAvailabilityLevel getServiceAvailabilityLevel() {
        return _serviceAvailabilityLevel;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Df>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public DfBuilder withKey(final DfKey key) {
        this.key = key;
        return this;
    }
    
    public DfBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public DfBuilder setQos(final Qos value) {
        this._qos = value;
        return this;
    }
    
    public DfBuilder setServiceAvailabilityLevel(final Df.ServiceAvailabilityLevel value) {
        this._serviceAvailabilityLevel = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public DfBuilder addAugmentation(Augmentation<Df> augmentation) {
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
    public DfBuilder addAugmentation(Class<? extends Augmentation<Df>> augmentationType, Augmentation<Df> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public DfBuilder removeAugmentation(Class<? extends Augmentation<Df>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private DfBuilder doAddAugmentation(Class<? extends Augmentation<Df>> augmentationType, Augmentation<Df> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Df build() {
        return new DfImpl(this);
    }

    private static final class DfImpl
        extends AbstractAugmentable<Df>
        implements Df {
    
        private final String _id;
        private final Qos _qos;
        private final Df.ServiceAvailabilityLevel _serviceAvailabilityLevel;
        private final DfKey key;
    
        DfImpl(DfBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new DfKey(base.getId());
            }
            this._id = key.getId();
            this._qos = base.getQos();
            this._serviceAvailabilityLevel = base.getServiceAvailabilityLevel();
        }
    
        @Override
        public DfKey key() {
            return key;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Qos getQos() {
            return _qos;
        }
        
        @Override
        public Df.ServiceAvailabilityLevel getServiceAvailabilityLevel() {
            return _serviceAvailabilityLevel;
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
            result = prime * result + Objects.hashCode(_qos);
            result = prime * result + Objects.hashCode(_serviceAvailabilityLevel);
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
            if (!Df.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Df other = (Df)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_qos, other.getQos())) {
                return false;
            }
            if (!Objects.equals(_serviceAvailabilityLevel, other.getServiceAvailabilityLevel())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DfImpl otherImpl = (DfImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Df>>, Augmentation<Df>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Df");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_qos", _qos);
            CodeHelpers.appendValue(helper, "_serviceAvailabilityLevel", _serviceAvailabilityLevel);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
