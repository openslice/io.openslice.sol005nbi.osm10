package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.placement.groups.placement.groups;
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
 * Class that builds {@link MemberVnfdBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     MemberVnfdBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new MemberVnfdBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of MemberVnfdBuilder, as instances can be freely passed around without
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
 * @see MemberVnfdBuilder
 * @see Builder
 *
 */
public class MemberVnfdBuilder implements Builder<MemberVnfd> {

    private Object _memberVnfIndexRef;
    private Object _vnfdIdRef;
    private MemberVnfdKey key;


    Map<Class<? extends Augmentation<MemberVnfd>>, Augmentation<MemberVnfd>> augmentation = Collections.emptyMap();

    public MemberVnfdBuilder() {
    }

    public MemberVnfdBuilder(MemberVnfd base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<MemberVnfd>>, Augmentation<MemberVnfd>> aug =((AugmentationHolder<MemberVnfd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._vnfdIdRef = base.getVnfdIdRef();
    }


    public MemberVnfdKey key() {
        return key;
    }
    
    public Object getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public Object getVnfdIdRef() {
        return _vnfdIdRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<MemberVnfd>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public MemberVnfdBuilder withKey(final MemberVnfdKey key) {
        this.key = key;
        return this;
    }
    
    public MemberVnfdBuilder setMemberVnfIndexRef(final Object value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
    public MemberVnfdBuilder setVnfdIdRef(final Object value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public MemberVnfdBuilder addAugmentation(Augmentation<MemberVnfd> augmentation) {
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
    public MemberVnfdBuilder addAugmentation(Class<? extends Augmentation<MemberVnfd>> augmentationType, Augmentation<MemberVnfd> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public MemberVnfdBuilder removeAugmentation(Class<? extends Augmentation<MemberVnfd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private MemberVnfdBuilder doAddAugmentation(Class<? extends Augmentation<MemberVnfd>> augmentationType, Augmentation<MemberVnfd> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public MemberVnfd build() {
        return new MemberVnfdImpl(this);
    }

    private static final class MemberVnfdImpl
        extends AbstractAugmentable<MemberVnfd>
        implements MemberVnfd {
    
        private final Object _memberVnfIndexRef;
        private final Object _vnfdIdRef;
        private final MemberVnfdKey key;
    
        MemberVnfdImpl(MemberVnfdBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new MemberVnfdKey(base.getMemberVnfIndexRef());
            }
            this._memberVnfIndexRef = key.getMemberVnfIndexRef();
            this._vnfdIdRef = base.getVnfdIdRef();
        }
    
        @Override
        public MemberVnfdKey key() {
            return key;
        }
        
        @Override
        public Object getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public Object getVnfdIdRef() {
            return _vnfdIdRef;
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
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
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
            if (!MemberVnfd.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            MemberVnfd other = (MemberVnfd)obj;
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MemberVnfdImpl otherImpl = (MemberVnfdImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MemberVnfd>>, Augmentation<MemberVnfd>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MemberVnfd");
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
