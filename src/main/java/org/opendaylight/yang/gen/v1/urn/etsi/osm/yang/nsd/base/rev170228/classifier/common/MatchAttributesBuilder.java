package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.classifier.common;
import com.google.common.base.MoreObjects;
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
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * Class that builds {@link MatchAttributesBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     MatchAttributesBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new MatchAttributesBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of MatchAttributesBuilder, as instances can be freely passed around without
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
 * @see MatchAttributesBuilder
 * @see Builder
 *
 */
public class MatchAttributesBuilder implements Builder<MatchAttributes> {

    private IpAddress _destinationIpAddress;
    private PortNumber _destinationPort;
    private String _id;
    private Uint8 _ipProto;
    private IpAddress _sourceIpAddress;
    private PortNumber _sourcePort;
    private MatchAttributesKey key;


    Map<Class<? extends Augmentation<MatchAttributes>>, Augmentation<MatchAttributes>> augmentation = Collections.emptyMap();

    public MatchAttributesBuilder() {
    }

    public MatchAttributesBuilder(MatchAttributes base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<MatchAttributes>>, Augmentation<MatchAttributes>> aug =((AugmentationHolder<MatchAttributes>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._destinationIpAddress = base.getDestinationIpAddress();
        this._destinationPort = base.getDestinationPort();
        this._ipProto = base.getIpProto();
        this._sourceIpAddress = base.getSourceIpAddress();
        this._sourcePort = base.getSourcePort();
    }


    public MatchAttributesKey key() {
        return key;
    }
    
    public IpAddress getDestinationIpAddress() {
        return _destinationIpAddress;
    }
    
    public PortNumber getDestinationPort() {
        return _destinationPort;
    }
    
    public String getId() {
        return _id;
    }
    
    public Uint8 getIpProto() {
        return _ipProto;
    }
    
    public IpAddress getSourceIpAddress() {
        return _sourceIpAddress;
    }
    
    public PortNumber getSourcePort() {
        return _sourcePort;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<MatchAttributes>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public MatchAttributesBuilder withKey(final MatchAttributesKey key) {
        this.key = key;
        return this;
    }
    
    public MatchAttributesBuilder setDestinationIpAddress(final IpAddress value) {
        this._destinationIpAddress = value;
        return this;
    }
    
    public MatchAttributesBuilder setDestinationPort(final PortNumber value) {
        this._destinationPort = value;
        return this;
    }
    
    public MatchAttributesBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public MatchAttributesBuilder setIpProto(final Uint8 value) {
        this._ipProto = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setIpProto(Uint8)} instead.
     */
    @Deprecated(forRemoval = true)
    public MatchAttributesBuilder setIpProto(final Short value) {
        return setIpProto(CodeHelpers.compatUint(value));
    }
    
    public MatchAttributesBuilder setSourceIpAddress(final IpAddress value) {
        this._sourceIpAddress = value;
        return this;
    }
    
    public MatchAttributesBuilder setSourcePort(final PortNumber value) {
        this._sourcePort = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public MatchAttributesBuilder addAugmentation(Augmentation<MatchAttributes> augmentation) {
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
    public MatchAttributesBuilder addAugmentation(Class<? extends Augmentation<MatchAttributes>> augmentationType, Augmentation<MatchAttributes> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public MatchAttributesBuilder removeAugmentation(Class<? extends Augmentation<MatchAttributes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private MatchAttributesBuilder doAddAugmentation(Class<? extends Augmentation<MatchAttributes>> augmentationType, Augmentation<MatchAttributes> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public MatchAttributes build() {
        return new MatchAttributesImpl(this);
    }

    private static final class MatchAttributesImpl
        extends AbstractAugmentable<MatchAttributes>
        implements MatchAttributes {
    
        private final IpAddress _destinationIpAddress;
        private final PortNumber _destinationPort;
        private final String _id;
        private final Uint8 _ipProto;
        private final IpAddress _sourceIpAddress;
        private final PortNumber _sourcePort;
        private final MatchAttributesKey key;
    
        MatchAttributesImpl(MatchAttributesBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new MatchAttributesKey(base.getId());
            }
            this._id = key.getId();
            this._destinationIpAddress = base.getDestinationIpAddress();
            this._destinationPort = base.getDestinationPort();
            this._ipProto = base.getIpProto();
            this._sourceIpAddress = base.getSourceIpAddress();
            this._sourcePort = base.getSourcePort();
        }
    
        @Override
        public MatchAttributesKey key() {
            return key;
        }
        
        @Override
        public IpAddress getDestinationIpAddress() {
            return _destinationIpAddress;
        }
        
        @Override
        public PortNumber getDestinationPort() {
            return _destinationPort;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Uint8 getIpProto() {
            return _ipProto;
        }
        
        @Override
        public IpAddress getSourceIpAddress() {
            return _sourceIpAddress;
        }
        
        @Override
        public PortNumber getSourcePort() {
            return _sourcePort;
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
            result = prime * result + Objects.hashCode(_destinationIpAddress);
            result = prime * result + Objects.hashCode(_destinationPort);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ipProto);
            result = prime * result + Objects.hashCode(_sourceIpAddress);
            result = prime * result + Objects.hashCode(_sourcePort);
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
            if (!MatchAttributes.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            MatchAttributes other = (MatchAttributes)obj;
            if (!Objects.equals(_destinationIpAddress, other.getDestinationIpAddress())) {
                return false;
            }
            if (!Objects.equals(_destinationPort, other.getDestinationPort())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ipProto, other.getIpProto())) {
                return false;
            }
            if (!Objects.equals(_sourceIpAddress, other.getSourceIpAddress())) {
                return false;
            }
            if (!Objects.equals(_sourcePort, other.getSourcePort())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MatchAttributesImpl otherImpl = (MatchAttributesImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MatchAttributes>>, Augmentation<MatchAttributes>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MatchAttributes");
            CodeHelpers.appendValue(helper, "_destinationIpAddress", _destinationIpAddress);
            CodeHelpers.appendValue(helper, "_destinationPort", _destinationPort);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_ipProto", _ipProto);
            CodeHelpers.appendValue(helper, "_sourceIpAddress", _sourceIpAddress);
            CodeHelpers.appendValue(helper, "_sourcePort", _sourcePort);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
