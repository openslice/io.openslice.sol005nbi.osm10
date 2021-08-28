package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa;
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
 * Class that builds {@link DiskIoQuotaBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     DiskIoQuotaBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new DiskIoQuotaBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of DiskIoQuotaBuilder, as instances can be freely passed around without
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
 * @see DiskIoQuotaBuilder
 * @see Builder
 *
 */
public class DiskIoQuotaBuilder implements Builder<DiskIoQuota> {

    private Uint64 _limit;
    private Uint64 _reserve;
    private Uint64 _shares;


    Map<Class<? extends Augmentation<DiskIoQuota>>, Augmentation<DiskIoQuota>> augmentation = Collections.emptyMap();

    public DiskIoQuotaBuilder() {
    }
    public DiskIoQuotaBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties arg) {
        this._limit = arg.getLimit();
        this._reserve = arg.getReserve();
        this._shares = arg.getShares();
    }

    public DiskIoQuotaBuilder(DiskIoQuota base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<DiskIoQuota>>, Augmentation<DiskIoQuota>> aug =((AugmentationHolder<DiskIoQuota>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._limit = base.getLimit();
        this._reserve = base.getReserve();
        this._shares = base.getShares();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties) {
            this._limit = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties)arg).getLimit();
            this._reserve = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties)arg).getReserve();
            this._shares = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties)arg).getShares();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties]");
    }

    public Uint64 getLimit() {
        return _limit;
    }
    
    public Uint64 getReserve() {
        return _reserve;
    }
    
    public Uint64 getShares() {
        return _shares;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<DiskIoQuota>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public DiskIoQuotaBuilder setLimit(final Uint64 value) {
        this._limit = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setLimit(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public DiskIoQuotaBuilder setLimit(final BigInteger value) {
        return setLimit(CodeHelpers.compatUint(value));
    }
    
    public DiskIoQuotaBuilder setReserve(final Uint64 value) {
        this._reserve = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setReserve(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public DiskIoQuotaBuilder setReserve(final BigInteger value) {
        return setReserve(CodeHelpers.compatUint(value));
    }
    
    public DiskIoQuotaBuilder setShares(final Uint64 value) {
        this._shares = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setShares(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public DiskIoQuotaBuilder setShares(final BigInteger value) {
        return setShares(CodeHelpers.compatUint(value));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public DiskIoQuotaBuilder addAugmentation(Augmentation<DiskIoQuota> augmentation) {
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
    public DiskIoQuotaBuilder addAugmentation(Class<? extends Augmentation<DiskIoQuota>> augmentationType, Augmentation<DiskIoQuota> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public DiskIoQuotaBuilder removeAugmentation(Class<? extends Augmentation<DiskIoQuota>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private DiskIoQuotaBuilder doAddAugmentation(Class<? extends Augmentation<DiskIoQuota>> augmentationType, Augmentation<DiskIoQuota> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public DiskIoQuota build() {
        return new DiskIoQuotaImpl(this);
    }

    private static final class DiskIoQuotaImpl
        extends AbstractAugmentable<DiskIoQuota>
        implements DiskIoQuota {
    
        private final Uint64 _limit;
        private final Uint64 _reserve;
        private final Uint64 _shares;
    
        DiskIoQuotaImpl(DiskIoQuotaBuilder base) {
            super(base.augmentation);
            this._limit = base.getLimit();
            this._reserve = base.getReserve();
            this._shares = base.getShares();
        }
    
        @Override
        public Uint64 getLimit() {
            return _limit;
        }
        
        @Override
        public Uint64 getReserve() {
            return _reserve;
        }
        
        @Override
        public Uint64 getShares() {
            return _shares;
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
            result = prime * result + Objects.hashCode(_limit);
            result = prime * result + Objects.hashCode(_reserve);
            result = prime * result + Objects.hashCode(_shares);
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
            if (!DiskIoQuota.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            DiskIoQuota other = (DiskIoQuota)obj;
            if (!Objects.equals(_limit, other.getLimit())) {
                return false;
            }
            if (!Objects.equals(_reserve, other.getReserve())) {
                return false;
            }
            if (!Objects.equals(_shares, other.getShares())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DiskIoQuotaImpl otherImpl = (DiskIoQuotaImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<DiskIoQuota>>, Augmentation<DiskIoQuota>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("DiskIoQuota");
            CodeHelpers.appendValue(helper, "_limit", _limit);
            CodeHelpers.appendValue(helper, "_reserve", _reserve);
            CodeHelpers.appendValue(helper, "_shares", _shares);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
