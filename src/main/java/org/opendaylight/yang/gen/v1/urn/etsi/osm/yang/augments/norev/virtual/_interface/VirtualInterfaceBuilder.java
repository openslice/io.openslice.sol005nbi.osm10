package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.virtual._interface;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
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
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link VirtualInterfaceBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualInterfaceBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualInterfaceBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualInterfaceBuilder, as instances can be freely passed around without
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
 * @see VirtualInterfaceBuilder
 * @see Builder
 *
 */
public class VirtualInterfaceBuilder implements Builder<VirtualInterface> {

    private Uint64 _bandwidth;
    private VirtualInterface.Type _type;
    private String _vpci;


    Map<Class<? extends Augmentation<VirtualInterface>>, Augmentation<VirtualInterface>> augmentation = Collections.emptyMap();

    public VirtualInterfaceBuilder() {
    }

    public VirtualInterfaceBuilder(VirtualInterface base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VirtualInterface>>, Augmentation<VirtualInterface>> aug =((AugmentationHolder<VirtualInterface>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._bandwidth = base.getBandwidth();
        this._type = base.getType();
        this._vpci = base.getVpci();
    }


    public Uint64 getBandwidth() {
        return _bandwidth;
    }
    
    public VirtualInterface.Type getType() {
        return _type;
    }
    
    public String getVpci() {
        return _vpci;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VirtualInterface>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public VirtualInterfaceBuilder setBandwidth(final Uint64 value) {
        this._bandwidth = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setBandwidth(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public VirtualInterfaceBuilder setBandwidth(final BigInteger value) {
        return setBandwidth(CodeHelpers.compatUint(value));
    }
    
    public VirtualInterfaceBuilder setType(final VirtualInterface.Type value) {
        this._type = value;
        return this;
    }
    
    public VirtualInterfaceBuilder setVpci(final String value) {
        this._vpci = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VirtualInterfaceBuilder addAugmentation(Augmentation<VirtualInterface> augmentation) {
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
    public VirtualInterfaceBuilder addAugmentation(Class<? extends Augmentation<VirtualInterface>> augmentationType, Augmentation<VirtualInterface> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VirtualInterfaceBuilder removeAugmentation(Class<? extends Augmentation<VirtualInterface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VirtualInterfaceBuilder doAddAugmentation(Class<? extends Augmentation<VirtualInterface>> augmentationType, Augmentation<VirtualInterface> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VirtualInterface build() {
        return new VirtualInterfaceImpl(this);
    }

    private static final class VirtualInterfaceImpl
        extends AbstractAugmentable<VirtualInterface>
        implements VirtualInterface {
    
        private final Uint64 _bandwidth;
        private final VirtualInterface.Type _type;
        private final String _vpci;
    
        VirtualInterfaceImpl(VirtualInterfaceBuilder base) {
            super(base.augmentation);
            this._bandwidth = base.getBandwidth();
            this._type = base.getType();
            this._vpci = base.getVpci();
        }
    
        @Override
        public Uint64 getBandwidth() {
            return _bandwidth;
        }
        
        @Override
        public VirtualInterface.Type getType() {
            return _type;
        }
        
        @Override
        public String getVpci() {
            return _vpci;
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
            result = prime * result + Objects.hashCode(_bandwidth);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_vpci);
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
            if (!VirtualInterface.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualInterface other = (VirtualInterface)obj;
            if (!Objects.equals(_bandwidth, other.getBandwidth())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_vpci, other.getVpci())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualInterfaceImpl otherImpl = (VirtualInterfaceImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VirtualInterface>>, Augmentation<VirtualInterface>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualInterface");
            CodeHelpers.appendValue(helper, "_bandwidth", _bandwidth);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_vpci", _vpci);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
