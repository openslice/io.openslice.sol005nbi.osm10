package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AddressType;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data.L2AddressData;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data.L3AddressData;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link AddressDataBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     AddressDataBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new AddressDataBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of AddressDataBuilder, as instances can be freely passed around without
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
 * @see AddressDataBuilder
 * @see Builder
 *
 */
public class AddressDataBuilder implements Builder<AddressData> {

    private L2AddressData _l2AddressData;
    private L3AddressData _l3AddressData;
    private Class<? extends AddressType> _type;
    private AddressDataKey key;


    Map<Class<? extends Augmentation<AddressData>>, Augmentation<AddressData>> augmentation = Collections.emptyMap();

    public AddressDataBuilder() {
    }

    public AddressDataBuilder(AddressData base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<AddressData>>, Augmentation<AddressData>> aug =((AugmentationHolder<AddressData>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._type = base.getType();
        this._l2AddressData = base.getL2AddressData();
        this._l3AddressData = base.getL3AddressData();
    }


    public AddressDataKey key() {
        return key;
    }
    
    public L2AddressData getL2AddressData() {
        return _l2AddressData;
    }
    
    public L3AddressData getL3AddressData() {
        return _l3AddressData;
    }
    
    public Class<? extends AddressType> getType() {
        return _type;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<AddressData>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public AddressDataBuilder withKey(final AddressDataKey key) {
        this.key = key;
        return this;
    }
    
    public AddressDataBuilder setL2AddressData(final L2AddressData value) {
        this._l2AddressData = value;
        return this;
    }
    
    public AddressDataBuilder setL3AddressData(final L3AddressData value) {
        this._l3AddressData = value;
        return this;
    }
    
    public AddressDataBuilder setType(final Class<? extends AddressType> value) {
        this._type = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public AddressDataBuilder addAugmentation(Augmentation<AddressData> augmentation) {
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
    public AddressDataBuilder addAugmentation(Class<? extends Augmentation<AddressData>> augmentationType, Augmentation<AddressData> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public AddressDataBuilder removeAugmentation(Class<? extends Augmentation<AddressData>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private AddressDataBuilder doAddAugmentation(Class<? extends Augmentation<AddressData>> augmentationType, Augmentation<AddressData> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public AddressData build() {
        return new AddressDataImpl(this);
    }

    private static final class AddressDataImpl
        extends AbstractAugmentable<AddressData>
        implements AddressData {
    
        private final L2AddressData _l2AddressData;
        private final L3AddressData _l3AddressData;
        private final Class<? extends AddressType> _type;
        private final AddressDataKey key;
    
        AddressDataImpl(AddressDataBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new AddressDataKey(base.getType());
            }
            this._type = key.getType();
            this._l2AddressData = base.getL2AddressData();
            this._l3AddressData = base.getL3AddressData();
        }
    
        @Override
        public AddressDataKey key() {
            return key;
        }
        
        @Override
        public L2AddressData getL2AddressData() {
            return _l2AddressData;
        }
        
        @Override
        public L3AddressData getL3AddressData() {
            return _l3AddressData;
        }
        
        @Override
        public Class<? extends AddressType> getType() {
            return _type;
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
            result = prime * result + Objects.hashCode(_l2AddressData);
            result = prime * result + Objects.hashCode(_l3AddressData);
            result = prime * result + Objects.hashCode(_type);
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
            if (!AddressData.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            AddressData other = (AddressData)obj;
            if (!Objects.equals(_l2AddressData, other.getL2AddressData())) {
                return false;
            }
            if (!Objects.equals(_l3AddressData, other.getL3AddressData())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AddressDataImpl otherImpl = (AddressDataImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<AddressData>>, Augmentation<AddressData>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("AddressData");
            CodeHelpers.appendValue(helper, "_l2AddressData", _l2AddressData);
            CodeHelpers.appendValue(helper, "_l3AddressData", _l3AddressData);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
