package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LayerProtocol;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.AddressData;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.AddressDataKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ProtocolBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ProtocolBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ProtocolBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ProtocolBuilder, as instances can be freely passed around without
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
 * @see ProtocolBuilder
 * @see Builder
 *
 */
public class ProtocolBuilder implements Builder<Protocol> {

    private Map<AddressDataKey, AddressData> _addressData;
    private Class<? extends LayerProtocol> _associatedLayerProtocol;
    private ProtocolKey key;


    Map<Class<? extends Augmentation<Protocol>>, Augmentation<Protocol>> augmentation = Collections.emptyMap();

    public ProtocolBuilder() {
    }

    public ProtocolBuilder(Protocol base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Protocol>>, Augmentation<Protocol>> aug =((AugmentationHolder<Protocol>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._associatedLayerProtocol = base.getAssociatedLayerProtocol();
        this._addressData = base.getAddressData();
    }


    public ProtocolKey key() {
        return key;
    }
    
    public Map<AddressDataKey, AddressData> getAddressData() {
        return _addressData;
    }
    
    public Class<? extends LayerProtocol> getAssociatedLayerProtocol() {
        return _associatedLayerProtocol;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Protocol>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ProtocolBuilder withKey(final ProtocolKey key) {
        this.key = key;
        return this;
    }
    public ProtocolBuilder setAddressData(final Map<AddressDataKey, AddressData> values) {
        this._addressData = values;
        return this;
    }
    
    /**
      * Utility migration setter.
      *
      * <b>IMPORTANT NOTE</b>: This method does not completely match previous mechanics, as the list is processed as
      *                        during this method's execution. Any future modifications of the list are <b>NOT</b>
      *                        reflected in this builder nor its products.
      *
      * @param values Legacy List of values
      * @return this builder
      * @throws IllegalArgumentException if the list contains entries with the same key
      * @throws NullPointerException if the list contains a null entry
      * @deprecated Use {#link #setAddressData(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public ProtocolBuilder setAddressData(final List<AddressData> values) {
        return setAddressData(CodeHelpers.compatMap(values));
    }
    
    public ProtocolBuilder setAssociatedLayerProtocol(final Class<? extends LayerProtocol> value) {
        this._associatedLayerProtocol = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ProtocolBuilder addAugmentation(Augmentation<Protocol> augmentation) {
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
    public ProtocolBuilder addAugmentation(Class<? extends Augmentation<Protocol>> augmentationType, Augmentation<Protocol> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ProtocolBuilder removeAugmentation(Class<? extends Augmentation<Protocol>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ProtocolBuilder doAddAugmentation(Class<? extends Augmentation<Protocol>> augmentationType, Augmentation<Protocol> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Protocol build() {
        return new ProtocolImpl(this);
    }

    private static final class ProtocolImpl
        extends AbstractAugmentable<Protocol>
        implements Protocol {
    
        private final Map<AddressDataKey, AddressData> _addressData;
        private final Class<? extends LayerProtocol> _associatedLayerProtocol;
        private final ProtocolKey key;
    
        ProtocolImpl(ProtocolBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ProtocolKey(base.getAssociatedLayerProtocol());
            }
            this._associatedLayerProtocol = key.getAssociatedLayerProtocol();
            this._addressData = CodeHelpers.emptyToNull(base.getAddressData());
        }
    
        @Override
        public ProtocolKey key() {
            return key;
        }
        
        @Override
        public Map<AddressDataKey, AddressData> getAddressData() {
            return _addressData;
        }
        
        @Override
        public Class<? extends LayerProtocol> getAssociatedLayerProtocol() {
            return _associatedLayerProtocol;
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
            result = prime * result + Objects.hashCode(_addressData);
            result = prime * result + Objects.hashCode(_associatedLayerProtocol);
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
            if (!Protocol.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Protocol other = (Protocol)obj;
            if (!Objects.equals(_addressData, other.getAddressData())) {
                return false;
            }
            if (!Objects.equals(_associatedLayerProtocol, other.getAssociatedLayerProtocol())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ProtocolImpl otherImpl = (ProtocolImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Protocol>>, Augmentation<Protocol>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Protocol");
            CodeHelpers.appendValue(helper, "_addressData", _addressData);
            CodeHelpers.appendValue(helper, "_associatedLayerProtocol", _associatedLayerProtocol);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
