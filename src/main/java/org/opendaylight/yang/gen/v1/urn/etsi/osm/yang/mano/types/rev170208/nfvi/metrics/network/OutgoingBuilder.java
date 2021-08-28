package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.network;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigDecimal;
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
 * Class that builds {@link OutgoingBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     OutgoingBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new OutgoingBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of OutgoingBuilder, as instances can be freely passed around without
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
 * @see OutgoingBuilder
 * @see Builder
 *
 */
public class OutgoingBuilder implements Builder<Outgoing> {

    private BigDecimal _byteRate;
    private Uint64 _bytes;
    private String _label;
    private BigDecimal _packetRate;
    private Uint64 _packets;


    Map<Class<? extends Augmentation<Outgoing>>, Augmentation<Outgoing>> augmentation = Collections.emptyMap();

    public OutgoingBuilder() {
    }

    public OutgoingBuilder(Outgoing base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Outgoing>>, Augmentation<Outgoing>> aug =((AugmentationHolder<Outgoing>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._byteRate = base.getByteRate();
        this._bytes = base.getBytes();
        this._label = base.getLabel();
        this._packetRate = base.getPacketRate();
        this._packets = base.getPackets();
    }


    public BigDecimal getByteRate() {
        return _byteRate;
    }
    
    public Uint64 getBytes() {
        return _bytes;
    }
    
    public String getLabel() {
        return _label;
    }
    
    public BigDecimal getPacketRate() {
        return _packetRate;
    }
    
    public Uint64 getPackets() {
        return _packets;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Outgoing>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    
    public OutgoingBuilder setByteRate(final BigDecimal value) {
        if (value != null) {
            
        }
        this._byteRate = value;
        return this;
    }
    
    public OutgoingBuilder setBytes(final Uint64 value) {
        this._bytes = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setBytes(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public OutgoingBuilder setBytes(final BigInteger value) {
        return setBytes(CodeHelpers.compatUint(value));
    }
    
    public OutgoingBuilder setLabel(final String value) {
        this._label = value;
        return this;
    }
    
    
    public OutgoingBuilder setPacketRate(final BigDecimal value) {
        if (value != null) {
            
        }
        this._packetRate = value;
        return this;
    }
    
    public OutgoingBuilder setPackets(final Uint64 value) {
        this._packets = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setPackets(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public OutgoingBuilder setPackets(final BigInteger value) {
        return setPackets(CodeHelpers.compatUint(value));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public OutgoingBuilder addAugmentation(Augmentation<Outgoing> augmentation) {
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
    public OutgoingBuilder addAugmentation(Class<? extends Augmentation<Outgoing>> augmentationType, Augmentation<Outgoing> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public OutgoingBuilder removeAugmentation(Class<? extends Augmentation<Outgoing>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private OutgoingBuilder doAddAugmentation(Class<? extends Augmentation<Outgoing>> augmentationType, Augmentation<Outgoing> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Outgoing build() {
        return new OutgoingImpl(this);
    }

    private static final class OutgoingImpl
        extends AbstractAugmentable<Outgoing>
        implements Outgoing {
    
        private final BigDecimal _byteRate;
        private final Uint64 _bytes;
        private final String _label;
        private final BigDecimal _packetRate;
        private final Uint64 _packets;
    
        OutgoingImpl(OutgoingBuilder base) {
            super(base.augmentation);
            this._byteRate = base.getByteRate();
            this._bytes = base.getBytes();
            this._label = base.getLabel();
            this._packetRate = base.getPacketRate();
            this._packets = base.getPackets();
        }
    
        @Override
        public BigDecimal getByteRate() {
            return _byteRate;
        }
        
        @Override
        public Uint64 getBytes() {
            return _bytes;
        }
        
        @Override
        public String getLabel() {
            return _label;
        }
        
        @Override
        public BigDecimal getPacketRate() {
            return _packetRate;
        }
        
        @Override
        public Uint64 getPackets() {
            return _packets;
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
            result = prime * result + Objects.hashCode(_byteRate);
            result = prime * result + Objects.hashCode(_bytes);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_packetRate);
            result = prime * result + Objects.hashCode(_packets);
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
            if (!Outgoing.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Outgoing other = (Outgoing)obj;
            if (!Objects.equals(_byteRate, other.getByteRate())) {
                return false;
            }
            if (!Objects.equals(_bytes, other.getBytes())) {
                return false;
            }
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_packetRate, other.getPacketRate())) {
                return false;
            }
            if (!Objects.equals(_packets, other.getPackets())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OutgoingImpl otherImpl = (OutgoingImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Outgoing>>, Augmentation<Outgoing>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Outgoing");
            CodeHelpers.appendValue(helper, "_byteRate", _byteRate);
            CodeHelpers.appendValue(helper, "_bytes", _bytes);
            CodeHelpers.appendValue(helper, "_label", _label);
            CodeHelpers.appendValue(helper, "_packetRate", _packetRate);
            CodeHelpers.appendValue(helper, "_packets", _packets);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
