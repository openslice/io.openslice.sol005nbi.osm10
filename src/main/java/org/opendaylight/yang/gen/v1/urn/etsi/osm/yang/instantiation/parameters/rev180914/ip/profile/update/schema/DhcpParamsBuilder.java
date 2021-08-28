package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ip.profile.update.schema;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * Class that builds {@link DhcpParamsBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     DhcpParamsBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new DhcpParamsBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of DhcpParamsBuilder, as instances can be freely passed around without
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
 * @see DhcpParamsBuilder
 * @see Builder
 *
 */
public class DhcpParamsBuilder implements Builder<DhcpParams> {

    private Uint8 _count;
    private IpAddress _startAddress;
    private Boolean _enabled;


    Map<Class<? extends Augmentation<DhcpParams>>, Augmentation<DhcpParams>> augmentation = Collections.emptyMap();

    public DhcpParamsBuilder() {
    }

    public DhcpParamsBuilder(DhcpParams base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<DhcpParams>>, Augmentation<DhcpParams>> aug =((AugmentationHolder<DhcpParams>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._count = base.getCount();
        this._startAddress = base.getStartAddress();
        this._enabled = base.isEnabled();
    }


    public Uint8 getCount() {
        return _count;
    }
    
    public IpAddress getStartAddress() {
        return _startAddress;
    }
    
    public Boolean isEnabled() {
        return _enabled;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<DhcpParams>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public DhcpParamsBuilder setCount(final Uint8 value) {
        this._count = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCount(Uint8)} instead.
     */
    @Deprecated(forRemoval = true)
    public DhcpParamsBuilder setCount(final Short value) {
        return setCount(CodeHelpers.compatUint(value));
    }
    
    public DhcpParamsBuilder setStartAddress(final IpAddress value) {
        this._startAddress = value;
        return this;
    }
    
    public DhcpParamsBuilder setEnabled(final Boolean value) {
        this._enabled = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public DhcpParamsBuilder addAugmentation(Augmentation<DhcpParams> augmentation) {
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
    public DhcpParamsBuilder addAugmentation(Class<? extends Augmentation<DhcpParams>> augmentationType, Augmentation<DhcpParams> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public DhcpParamsBuilder removeAugmentation(Class<? extends Augmentation<DhcpParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private DhcpParamsBuilder doAddAugmentation(Class<? extends Augmentation<DhcpParams>> augmentationType, Augmentation<DhcpParams> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public DhcpParams build() {
        return new DhcpParamsImpl(this);
    }

    private static final class DhcpParamsImpl
        extends AbstractAugmentable<DhcpParams>
        implements DhcpParams {
    
        private final Uint8 _count;
        private final IpAddress _startAddress;
        private final Boolean _enabled;
    
        DhcpParamsImpl(DhcpParamsBuilder base) {
            super(base.augmentation);
            this._count = base.getCount();
            this._startAddress = base.getStartAddress();
            this._enabled = base.isEnabled();
        }
    
        @Override
        public Uint8 getCount() {
            return _count;
        }
        
        @Override
        public IpAddress getStartAddress() {
            return _startAddress;
        }
        
        @Override
        public Boolean isEnabled() {
            return _enabled;
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
            result = prime * result + Objects.hashCode(_startAddress);
            result = prime * result + Objects.hashCode(_enabled);
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
            if (!DhcpParams.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            DhcpParams other = (DhcpParams)obj;
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_startAddress, other.getStartAddress())) {
                return false;
            }
            if (!Objects.equals(_enabled, other.isEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DhcpParamsImpl otherImpl = (DhcpParamsImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<DhcpParams>>, Augmentation<DhcpParams>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("DhcpParams");
            CodeHelpers.appendValue(helper, "_count", _count);
            CodeHelpers.appendValue(helper, "_startAddress", _startAddress);
            CodeHelpers.appendValue(helper, "_enabled", _enabled);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
