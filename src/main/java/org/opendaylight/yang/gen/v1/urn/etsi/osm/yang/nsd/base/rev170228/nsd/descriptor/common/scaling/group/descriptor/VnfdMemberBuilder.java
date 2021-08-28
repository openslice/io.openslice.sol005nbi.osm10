package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Long;
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
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link VnfdMemberBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VnfdMemberBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VnfdMemberBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VnfdMemberBuilder, as instances can be freely passed around without
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
 * @see VnfdMemberBuilder
 * @see Builder
 *
 */
public class VnfdMemberBuilder implements Builder<VnfdMember> {

    private Uint32 _count;
    private Object _memberVnfIndexRef;
    private VnfdMemberKey key;


    Map<Class<? extends Augmentation<VnfdMember>>, Augmentation<VnfdMember>> augmentation = Collections.emptyMap();

    public VnfdMemberBuilder() {
    }

    public VnfdMemberBuilder(VnfdMember base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfdMember>>, Augmentation<VnfdMember>> aug =((AugmentationHolder<VnfdMember>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._count = base.getCount();
    }


    public VnfdMemberKey key() {
        return key;
    }
    
    public Uint32 getCount() {
        return _count;
    }
    
    public Object getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VnfdMember>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VnfdMemberBuilder withKey(final VnfdMemberKey key) {
        this.key = key;
        return this;
    }
    
    public VnfdMemberBuilder setCount(final Uint32 value) {
        this._count = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCount(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public VnfdMemberBuilder setCount(final Long value) {
        return setCount(CodeHelpers.compatUint(value));
    }
    
    public VnfdMemberBuilder setMemberVnfIndexRef(final Object value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VnfdMemberBuilder addAugmentation(Augmentation<VnfdMember> augmentation) {
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
    public VnfdMemberBuilder addAugmentation(Class<? extends Augmentation<VnfdMember>> augmentationType, Augmentation<VnfdMember> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VnfdMemberBuilder removeAugmentation(Class<? extends Augmentation<VnfdMember>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VnfdMemberBuilder doAddAugmentation(Class<? extends Augmentation<VnfdMember>> augmentationType, Augmentation<VnfdMember> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VnfdMember build() {
        return new VnfdMemberImpl(this);
    }

    private static final class VnfdMemberImpl
        extends AbstractAugmentable<VnfdMember>
        implements VnfdMember {
    
        private final Uint32 _count;
        private final Object _memberVnfIndexRef;
        private final VnfdMemberKey key;
    
        VnfdMemberImpl(VnfdMemberBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfdMemberKey(base.getMemberVnfIndexRef());
            }
            this._memberVnfIndexRef = key.getMemberVnfIndexRef();
            this._count = base.getCount();
        }
    
        @Override
        public VnfdMemberKey key() {
            return key;
        }
        
        @Override
        public Uint32 getCount() {
            return _count;
        }
        
        @Override
        public Object getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
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
            result = prime * result + Objects.hashCode(_count);
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
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
            if (!VnfdMember.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VnfdMember other = (VnfdMember)obj;
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdMemberImpl otherImpl = (VnfdMemberImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfdMember>>, Augmentation<VnfdMember>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfdMember");
            CodeHelpers.appendValue(helper, "_count", _count);
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
