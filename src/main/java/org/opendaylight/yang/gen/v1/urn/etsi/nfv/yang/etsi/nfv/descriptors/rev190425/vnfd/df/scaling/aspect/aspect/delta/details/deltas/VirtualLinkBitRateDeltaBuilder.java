package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas.virtual.link.bit.rate.delta.BitRateRequirements;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VirtualLinkBitRateDeltaBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualLinkBitRateDeltaBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualLinkBitRateDeltaBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualLinkBitRateDeltaBuilder, as instances can be freely passed around without
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
 * @see VirtualLinkBitRateDeltaBuilder
 * @see Builder
 *
 */
public class VirtualLinkBitRateDeltaBuilder implements Builder<VirtualLinkBitRateDelta> {

    private BitRateRequirements _bitRateRequirements;
    private String _id;
    private VirtualLinkBitRateDeltaKey key;


    Map<Class<? extends Augmentation<VirtualLinkBitRateDelta>>, Augmentation<VirtualLinkBitRateDelta>> augmentation = Collections.emptyMap();

    public VirtualLinkBitRateDeltaBuilder() {
    }

    public VirtualLinkBitRateDeltaBuilder(VirtualLinkBitRateDelta base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VirtualLinkBitRateDelta>>, Augmentation<VirtualLinkBitRateDelta>> aug =((AugmentationHolder<VirtualLinkBitRateDelta>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._bitRateRequirements = base.getBitRateRequirements();
    }


    public VirtualLinkBitRateDeltaKey key() {
        return key;
    }
    
    public BitRateRequirements getBitRateRequirements() {
        return _bitRateRequirements;
    }
    
    public String getId() {
        return _id;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VirtualLinkBitRateDelta>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VirtualLinkBitRateDeltaBuilder withKey(final VirtualLinkBitRateDeltaKey key) {
        this.key = key;
        return this;
    }
    
    public VirtualLinkBitRateDeltaBuilder setBitRateRequirements(final BitRateRequirements value) {
        this._bitRateRequirements = value;
        return this;
    }
    
    public VirtualLinkBitRateDeltaBuilder setId(final String value) {
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
    public VirtualLinkBitRateDeltaBuilder addAugmentation(Augmentation<VirtualLinkBitRateDelta> augmentation) {
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
    public VirtualLinkBitRateDeltaBuilder addAugmentation(Class<? extends Augmentation<VirtualLinkBitRateDelta>> augmentationType, Augmentation<VirtualLinkBitRateDelta> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VirtualLinkBitRateDeltaBuilder removeAugmentation(Class<? extends Augmentation<VirtualLinkBitRateDelta>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VirtualLinkBitRateDeltaBuilder doAddAugmentation(Class<? extends Augmentation<VirtualLinkBitRateDelta>> augmentationType, Augmentation<VirtualLinkBitRateDelta> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VirtualLinkBitRateDelta build() {
        return new VirtualLinkBitRateDeltaImpl(this);
    }

    private static final class VirtualLinkBitRateDeltaImpl
        extends AbstractAugmentable<VirtualLinkBitRateDelta>
        implements VirtualLinkBitRateDelta {
    
        private final BitRateRequirements _bitRateRequirements;
        private final String _id;
        private final VirtualLinkBitRateDeltaKey key;
    
        VirtualLinkBitRateDeltaImpl(VirtualLinkBitRateDeltaBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VirtualLinkBitRateDeltaKey(base.getId());
            }
            this._id = key.getId();
            this._bitRateRequirements = base.getBitRateRequirements();
        }
    
        @Override
        public VirtualLinkBitRateDeltaKey key() {
            return key;
        }
        
        @Override
        public BitRateRequirements getBitRateRequirements() {
            return _bitRateRequirements;
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
            result = prime * result + Objects.hashCode(_bitRateRequirements);
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
            if (!VirtualLinkBitRateDelta.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualLinkBitRateDelta other = (VirtualLinkBitRateDelta)obj;
            if (!Objects.equals(_bitRateRequirements, other.getBitRateRequirements())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualLinkBitRateDeltaImpl otherImpl = (VirtualLinkBitRateDeltaImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VirtualLinkBitRateDelta>>, Augmentation<VirtualLinkBitRateDelta>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualLinkBitRateDelta");
            CodeHelpers.appendValue(helper, "_bitRateRequirements", _bitRateRequirements);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
