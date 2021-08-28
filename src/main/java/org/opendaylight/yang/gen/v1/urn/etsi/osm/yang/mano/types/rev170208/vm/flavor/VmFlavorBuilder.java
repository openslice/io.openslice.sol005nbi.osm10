package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vm.flavor;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Integer;
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
import org.opendaylight.yangtools.yang.common.Uint16;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link VmFlavorBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VmFlavorBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VmFlavorBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VmFlavorBuilder, as instances can be freely passed around without
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
 * @see VmFlavorBuilder
 * @see Builder
 *
 */
public class VmFlavorBuilder implements Builder<VmFlavor> {

    private Uint64 _memoryMb;
    private Uint64 _storageGb;
    private Uint16 _vcpuCount;


    Map<Class<? extends Augmentation<VmFlavor>>, Augmentation<VmFlavor>> augmentation = Collections.emptyMap();

    public VmFlavorBuilder() {
    }

    public VmFlavorBuilder(VmFlavor base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VmFlavor>>, Augmentation<VmFlavor>> aug =((AugmentationHolder<VmFlavor>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._memoryMb = base.getMemoryMb();
        this._storageGb = base.getStorageGb();
        this._vcpuCount = base.getVcpuCount();
    }


    public Uint64 getMemoryMb() {
        return _memoryMb;
    }
    
    public Uint64 getStorageGb() {
        return _storageGb;
    }
    
    public Uint16 getVcpuCount() {
        return _vcpuCount;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VmFlavor>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public VmFlavorBuilder setMemoryMb(final Uint64 value) {
        this._memoryMb = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setMemoryMb(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public VmFlavorBuilder setMemoryMb(final BigInteger value) {
        return setMemoryMb(CodeHelpers.compatUint(value));
    }
    
    public VmFlavorBuilder setStorageGb(final Uint64 value) {
        this._storageGb = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setStorageGb(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public VmFlavorBuilder setStorageGb(final BigInteger value) {
        return setStorageGb(CodeHelpers.compatUint(value));
    }
    
    public VmFlavorBuilder setVcpuCount(final Uint16 value) {
        this._vcpuCount = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setVcpuCount(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public VmFlavorBuilder setVcpuCount(final Integer value) {
        return setVcpuCount(CodeHelpers.compatUint(value));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VmFlavorBuilder addAugmentation(Augmentation<VmFlavor> augmentation) {
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
    public VmFlavorBuilder addAugmentation(Class<? extends Augmentation<VmFlavor>> augmentationType, Augmentation<VmFlavor> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VmFlavorBuilder removeAugmentation(Class<? extends Augmentation<VmFlavor>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VmFlavorBuilder doAddAugmentation(Class<? extends Augmentation<VmFlavor>> augmentationType, Augmentation<VmFlavor> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VmFlavor build() {
        return new VmFlavorImpl(this);
    }

    private static final class VmFlavorImpl
        extends AbstractAugmentable<VmFlavor>
        implements VmFlavor {
    
        private final Uint64 _memoryMb;
        private final Uint64 _storageGb;
        private final Uint16 _vcpuCount;
    
        VmFlavorImpl(VmFlavorBuilder base) {
            super(base.augmentation);
            this._memoryMb = base.getMemoryMb();
            this._storageGb = base.getStorageGb();
            this._vcpuCount = base.getVcpuCount();
        }
    
        @Override
        public Uint64 getMemoryMb() {
            return _memoryMb;
        }
        
        @Override
        public Uint64 getStorageGb() {
            return _storageGb;
        }
        
        @Override
        public Uint16 getVcpuCount() {
            return _vcpuCount;
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
            result = prime * result + Objects.hashCode(_memoryMb);
            result = prime * result + Objects.hashCode(_storageGb);
            result = prime * result + Objects.hashCode(_vcpuCount);
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
            if (!VmFlavor.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VmFlavor other = (VmFlavor)obj;
            if (!Objects.equals(_memoryMb, other.getMemoryMb())) {
                return false;
            }
            if (!Objects.equals(_storageGb, other.getStorageGb())) {
                return false;
            }
            if (!Objects.equals(_vcpuCount, other.getVcpuCount())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VmFlavorImpl otherImpl = (VmFlavorImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VmFlavor>>, Augmentation<VmFlavor>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VmFlavor");
            CodeHelpers.appendValue(helper, "_memoryMb", _memoryMb);
            CodeHelpers.appendValue(helper, "_storageGb", _storageGb);
            CodeHelpers.appendValue(helper, "_vcpuCount", _vcpuCount);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
