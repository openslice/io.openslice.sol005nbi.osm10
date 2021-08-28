package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.ConstituentBaseElementId;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.ConstituentCpdId;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link CpdPoolBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     CpdPoolBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new CpdPoolBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of CpdPoolBuilder, as instances can be freely passed around without
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
 * @see CpdPoolBuilder
 * @see Builder
 *
 */
public class CpdPoolBuilder implements Builder<CpdPool> {

    private ConstituentBaseElementId _constituentBaseElementId;
    private ConstituentCpdId _constituentCpdId;
    private String _id;
    private CpdPoolKey key;


    Map<Class<? extends Augmentation<CpdPool>>, Augmentation<CpdPool>> augmentation = Collections.emptyMap();

    public CpdPoolBuilder() {
    }

    public CpdPoolBuilder(CpdPool base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CpdPool>>, Augmentation<CpdPool>> aug =((AugmentationHolder<CpdPool>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._constituentBaseElementId = base.getConstituentBaseElementId();
        this._constituentCpdId = base.getConstituentCpdId();
    }


    public CpdPoolKey key() {
        return key;
    }
    
    public ConstituentBaseElementId getConstituentBaseElementId() {
        return _constituentBaseElementId;
    }
    
    public ConstituentCpdId getConstituentCpdId() {
        return _constituentCpdId;
    }
    
    public String getId() {
        return _id;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<CpdPool>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public CpdPoolBuilder withKey(final CpdPoolKey key) {
        this.key = key;
        return this;
    }
    
    public CpdPoolBuilder setConstituentBaseElementId(final ConstituentBaseElementId value) {
        this._constituentBaseElementId = value;
        return this;
    }
    
    public CpdPoolBuilder setConstituentCpdId(final ConstituentCpdId value) {
        this._constituentCpdId = value;
        return this;
    }
    
    public CpdPoolBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public CpdPoolBuilder addAugmentation(Augmentation<CpdPool> augmentation) {
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
    public CpdPoolBuilder addAugmentation(Class<? extends Augmentation<CpdPool>> augmentationType, Augmentation<CpdPool> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public CpdPoolBuilder removeAugmentation(Class<? extends Augmentation<CpdPool>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private CpdPoolBuilder doAddAugmentation(Class<? extends Augmentation<CpdPool>> augmentationType, Augmentation<CpdPool> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public CpdPool build() {
        return new CpdPoolImpl(this);
    }

    private static final class CpdPoolImpl
        extends AbstractAugmentable<CpdPool>
        implements CpdPool {
    
        private final ConstituentBaseElementId _constituentBaseElementId;
        private final ConstituentCpdId _constituentCpdId;
        private final String _id;
        private final CpdPoolKey key;
    
        CpdPoolImpl(CpdPoolBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new CpdPoolKey(base.getId());
            }
            this._id = key.getId();
            this._constituentBaseElementId = base.getConstituentBaseElementId();
            this._constituentCpdId = base.getConstituentCpdId();
        }
    
        @Override
        public CpdPoolKey key() {
            return key;
        }
        
        @Override
        public ConstituentBaseElementId getConstituentBaseElementId() {
            return _constituentBaseElementId;
        }
        
        @Override
        public ConstituentCpdId getConstituentCpdId() {
            return _constituentCpdId;
        }
        
        @Override
        public String getId() {
            return _id;
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
            result = prime * result + Objects.hashCode(_constituentBaseElementId);
            result = prime * result + Objects.hashCode(_constituentCpdId);
            result = prime * result + Objects.hashCode(_id);
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
            if (!CpdPool.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            CpdPool other = (CpdPool)obj;
            if (!Objects.equals(_constituentBaseElementId, other.getConstituentBaseElementId())) {
                return false;
            }
            if (!Objects.equals(_constituentCpdId, other.getConstituentCpdId())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CpdPoolImpl otherImpl = (CpdPoolImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CpdPool>>, Augmentation<CpdPool>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CpdPool");
            CodeHelpers.appendValue(helper, "_constituentBaseElementId", _constituentBaseElementId);
            CodeHelpers.appendValue(helper, "_constituentCpdId", _constituentCpdId);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
