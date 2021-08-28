package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.position.desc.id.cp.profile.id;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ConstituentProfileElementsBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ConstituentProfileElementsBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ConstituentProfileElementsBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ConstituentProfileElementsBuilder, as instances can be freely passed around without
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
 * @see ConstituentProfileElementsBuilder
 * @see Builder
 *
 */
public class ConstituentProfileElementsBuilder implements Builder<ConstituentProfileElements> {

    private String _cpdId;
    private String _id;
    private ConstituentProfileElementsKey key;


    Map<Class<? extends Augmentation<ConstituentProfileElements>>, Augmentation<ConstituentProfileElements>> augmentation = Collections.emptyMap();

    public ConstituentProfileElementsBuilder() {
    }

    public ConstituentProfileElementsBuilder(ConstituentProfileElements base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ConstituentProfileElements>>, Augmentation<ConstituentProfileElements>> aug =((AugmentationHolder<ConstituentProfileElements>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._cpdId = base.getCpdId();
    }


    public ConstituentProfileElementsKey key() {
        return key;
    }
    
    public String getCpdId() {
        return _cpdId;
    }
    
    public String getId() {
        return _id;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ConstituentProfileElements>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ConstituentProfileElementsBuilder withKey(final ConstituentProfileElementsKey key) {
        this.key = key;
        return this;
    }
    
    public ConstituentProfileElementsBuilder setCpdId(final String value) {
        this._cpdId = value;
        return this;
    }
    
    public ConstituentProfileElementsBuilder setId(final String value) {
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
    public ConstituentProfileElementsBuilder addAugmentation(Augmentation<ConstituentProfileElements> augmentation) {
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
    public ConstituentProfileElementsBuilder addAugmentation(Class<? extends Augmentation<ConstituentProfileElements>> augmentationType, Augmentation<ConstituentProfileElements> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ConstituentProfileElementsBuilder removeAugmentation(Class<? extends Augmentation<ConstituentProfileElements>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ConstituentProfileElementsBuilder doAddAugmentation(Class<? extends Augmentation<ConstituentProfileElements>> augmentationType, Augmentation<ConstituentProfileElements> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ConstituentProfileElements build() {
        return new ConstituentProfileElementsImpl(this);
    }

    private static final class ConstituentProfileElementsImpl
        extends AbstractAugmentable<ConstituentProfileElements>
        implements ConstituentProfileElements {
    
        private final String _cpdId;
        private final String _id;
        private final ConstituentProfileElementsKey key;
    
        ConstituentProfileElementsImpl(ConstituentProfileElementsBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ConstituentProfileElementsKey(base.getId());
            }
            this._id = key.getId();
            this._cpdId = base.getCpdId();
        }
    
        @Override
        public ConstituentProfileElementsKey key() {
            return key;
        }
        
        @Override
        public String getCpdId() {
            return _cpdId;
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
            result = prime * result + Objects.hashCode(_cpdId);
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
            if (!ConstituentProfileElements.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ConstituentProfileElements other = (ConstituentProfileElements)obj;
            if (!Objects.equals(_cpdId, other.getCpdId())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConstituentProfileElementsImpl otherImpl = (ConstituentProfileElementsImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConstituentProfileElements>>, Augmentation<ConstituentProfileElements>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConstituentProfileElements");
            CodeHelpers.appendValue(helper, "_cpdId", _cpdId);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
