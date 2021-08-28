package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.sapd.CpdOrVirtualLink;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link SapdBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     SapdBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new SapdBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of SapdBuilder, as instances can be freely passed around without
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
 * @see SapdBuilder
 * @see Builder
 *
 */
public class SapdBuilder implements Builder<Sapd> {

    private CpdOrVirtualLink _cpdOrVirtualLink;
    private String _id;
    private Boolean _addressAssignment;
    private SapdKey key;


    Map<Class<? extends Augmentation<Sapd>>, Augmentation<Sapd>> augmentation = Collections.emptyMap();

    public SapdBuilder() {
    }

    public SapdBuilder(Sapd base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Sapd>>, Augmentation<Sapd>> aug =((AugmentationHolder<Sapd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._cpdOrVirtualLink = base.getCpdOrVirtualLink();
        this._addressAssignment = base.isAddressAssignment();
    }


    public SapdKey key() {
        return key;
    }
    
    public CpdOrVirtualLink getCpdOrVirtualLink() {
        return _cpdOrVirtualLink;
    }
    
    public String getId() {
        return _id;
    }
    
    public Boolean isAddressAssignment() {
        return _addressAssignment;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Sapd>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public SapdBuilder withKey(final SapdKey key) {
        this.key = key;
        return this;
    }
    
    public SapdBuilder setCpdOrVirtualLink(final CpdOrVirtualLink value) {
        this._cpdOrVirtualLink = value;
        return this;
    }
    
    public SapdBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public SapdBuilder setAddressAssignment(final Boolean value) {
        this._addressAssignment = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public SapdBuilder addAugmentation(Augmentation<Sapd> augmentation) {
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
    public SapdBuilder addAugmentation(Class<? extends Augmentation<Sapd>> augmentationType, Augmentation<Sapd> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public SapdBuilder removeAugmentation(Class<? extends Augmentation<Sapd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private SapdBuilder doAddAugmentation(Class<? extends Augmentation<Sapd>> augmentationType, Augmentation<Sapd> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Sapd build() {
        return new SapdImpl(this);
    }

    private static final class SapdImpl
        extends AbstractAugmentable<Sapd>
        implements Sapd {
    
        private final CpdOrVirtualLink _cpdOrVirtualLink;
        private final String _id;
        private final Boolean _addressAssignment;
        private final SapdKey key;
    
        SapdImpl(SapdBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new SapdKey(base.getId());
            }
            this._id = key.getId();
            this._cpdOrVirtualLink = base.getCpdOrVirtualLink();
            this._addressAssignment = base.isAddressAssignment();
        }
    
        @Override
        public SapdKey key() {
            return key;
        }
        
        @Override
        public CpdOrVirtualLink getCpdOrVirtualLink() {
            return _cpdOrVirtualLink;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Boolean isAddressAssignment() {
            return _addressAssignment;
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
            result = prime * result + Objects.hashCode(_cpdOrVirtualLink);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_addressAssignment);
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
            if (!Sapd.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Sapd other = (Sapd)obj;
            if (!Objects.equals(_cpdOrVirtualLink, other.getCpdOrVirtualLink())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_addressAssignment, other.isAddressAssignment())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SapdImpl otherImpl = (SapdImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Sapd>>, Augmentation<Sapd>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Sapd");
            CodeHelpers.appendValue(helper, "_cpdOrVirtualLink", _cpdOrVirtualLink);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_addressAssignment", _addressAssignment);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
