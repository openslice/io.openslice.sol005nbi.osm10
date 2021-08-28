package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.PrimaryId;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.SecondaryId;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link DependenciesBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     DependenciesBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new DependenciesBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of DependenciesBuilder, as instances can be freely passed around without
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
 * @see DependenciesBuilder
 * @see Builder
 *
 */
public class DependenciesBuilder implements Builder<Dependencies> {

    private String _id;
    private PrimaryId _primaryId;
    private SecondaryId _secondaryId;
    private DependenciesKey key;


    Map<Class<? extends Augmentation<Dependencies>>, Augmentation<Dependencies>> augmentation = Collections.emptyMap();

    public DependenciesBuilder() {
    }

    public DependenciesBuilder(Dependencies base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Dependencies>>, Augmentation<Dependencies>> aug =((AugmentationHolder<Dependencies>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._primaryId = base.getPrimaryId();
        this._secondaryId = base.getSecondaryId();
    }


    public DependenciesKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public PrimaryId getPrimaryId() {
        return _primaryId;
    }
    
    public SecondaryId getSecondaryId() {
        return _secondaryId;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Dependencies>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public DependenciesBuilder withKey(final DependenciesKey key) {
        this.key = key;
        return this;
    }
    
    public DependenciesBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public DependenciesBuilder setPrimaryId(final PrimaryId value) {
        this._primaryId = value;
        return this;
    }
    
    public DependenciesBuilder setSecondaryId(final SecondaryId value) {
        this._secondaryId = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public DependenciesBuilder addAugmentation(Augmentation<Dependencies> augmentation) {
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
    public DependenciesBuilder addAugmentation(Class<? extends Augmentation<Dependencies>> augmentationType, Augmentation<Dependencies> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public DependenciesBuilder removeAugmentation(Class<? extends Augmentation<Dependencies>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private DependenciesBuilder doAddAugmentation(Class<? extends Augmentation<Dependencies>> augmentationType, Augmentation<Dependencies> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Dependencies build() {
        return new DependenciesImpl(this);
    }

    private static final class DependenciesImpl
        extends AbstractAugmentable<Dependencies>
        implements Dependencies {
    
        private final String _id;
        private final PrimaryId _primaryId;
        private final SecondaryId _secondaryId;
        private final DependenciesKey key;
    
        DependenciesImpl(DependenciesBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new DependenciesKey(base.getId());
            }
            this._id = key.getId();
            this._primaryId = base.getPrimaryId();
            this._secondaryId = base.getSecondaryId();
        }
    
        @Override
        public DependenciesKey key() {
            return key;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public PrimaryId getPrimaryId() {
            return _primaryId;
        }
        
        @Override
        public SecondaryId getSecondaryId() {
            return _secondaryId;
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
            result = prime * result + Objects.hashCode(_primaryId);
            result = prime * result + Objects.hashCode(_secondaryId);
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
            if (!Dependencies.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Dependencies other = (Dependencies)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_primaryId, other.getPrimaryId())) {
                return false;
            }
            if (!Objects.equals(_secondaryId, other.getSecondaryId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DependenciesImpl otherImpl = (DependenciesImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Dependencies>>, Augmentation<Dependencies>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Dependencies");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_primaryId", _primaryId);
            CodeHelpers.appendValue(helper, "_secondaryId", _secondaryId);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
