package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc.df;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Range;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.reflect.Array;
import java.math.BigDecimal;
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
 * Class that builds {@link QosBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     QosBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new QosBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of QosBuilder, as instances can be freely passed around without
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
 * @see QosBuilder
 * @see Builder
 *
 */
public class QosBuilder implements Builder<Qos> {

    private Uint32 _latency;
    private Uint32 _packetDelayVariation;
    private BigDecimal _packetLossRatio;
    private Uint32 _priority;


    Map<Class<? extends Augmentation<Qos>>, Augmentation<Qos>> augmentation = Collections.emptyMap();

    public QosBuilder() {
    }

    public QosBuilder(Qos base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Qos>>, Augmentation<Qos>> aug =((AugmentationHolder<Qos>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._latency = base.getLatency();
        this._packetDelayVariation = base.getPacketDelayVariation();
        this._packetLossRatio = base.getPacketLossRatio();
        this._priority = base.getPriority();
    }


    public Uint32 getLatency() {
        return _latency;
    }
    
    public Uint32 getPacketDelayVariation() {
        return _packetDelayVariation;
    }
    
    public BigDecimal getPacketLossRatio() {
        return _packetLossRatio;
    }
    
    public Uint32 getPriority() {
        return _priority;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Qos>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public QosBuilder setLatency(final Uint32 value) {
        this._latency = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setLatency(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public QosBuilder setLatency(final Long value) {
        return setLatency(CodeHelpers.compatUint(value));
    }
    
    public QosBuilder setPacketDelayVariation(final Uint32 value) {
        this._packetDelayVariation = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setPacketDelayVariation(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public QosBuilder setPacketDelayVariation(final Long value) {
        return setPacketDelayVariation(CodeHelpers.compatUint(value));
    }
    
    private static final Range<java.math.BigDecimal>[] CHECKPACKETLOSSRATIORANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigDecimal>[] a = (Range<java.math.BigDecimal>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigDecimal.ZERO, new java.math.BigDecimal("1.00"));
        CHECKPACKETLOSSRATIORANGE_RANGES = a;
    }
    private static void checkPacketLossRatioRange(final java.math.BigDecimal value) {
        for (Range<java.math.BigDecimal> r : CHECKPACKETLOSSRATIORANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKPACKETLOSSRATIORANGE_RANGES, value);
    }
    
    public QosBuilder setPacketLossRatio(final BigDecimal value) {
        if (value != null) {
            checkPacketLossRatioRange(value);
            
        }
        this._packetLossRatio = value;
        return this;
    }
    
    public QosBuilder setPriority(final Uint32 value) {
        this._priority = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setPriority(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public QosBuilder setPriority(final Long value) {
        return setPriority(CodeHelpers.compatUint(value));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public QosBuilder addAugmentation(Augmentation<Qos> augmentation) {
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
    public QosBuilder addAugmentation(Class<? extends Augmentation<Qos>> augmentationType, Augmentation<Qos> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public QosBuilder removeAugmentation(Class<? extends Augmentation<Qos>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private QosBuilder doAddAugmentation(Class<? extends Augmentation<Qos>> augmentationType, Augmentation<Qos> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Qos build() {
        return new QosImpl(this);
    }

    private static final class QosImpl
        extends AbstractAugmentable<Qos>
        implements Qos {
    
        private final Uint32 _latency;
        private final Uint32 _packetDelayVariation;
        private final BigDecimal _packetLossRatio;
        private final Uint32 _priority;
    
        QosImpl(QosBuilder base) {
            super(base.augmentation);
            this._latency = base.getLatency();
            this._packetDelayVariation = base.getPacketDelayVariation();
            this._packetLossRatio = base.getPacketLossRatio();
            this._priority = base.getPriority();
        }
    
        @Override
        public Uint32 getLatency() {
            return _latency;
        }
        
        @Override
        public Uint32 getPacketDelayVariation() {
            return _packetDelayVariation;
        }
        
        @Override
        public BigDecimal getPacketLossRatio() {
            return _packetLossRatio;
        }
        
        @Override
        public Uint32 getPriority() {
            return _priority;
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
            result = prime * result + Objects.hashCode(_latency);
            result = prime * result + Objects.hashCode(_packetDelayVariation);
            result = prime * result + Objects.hashCode(_packetLossRatio);
            result = prime * result + Objects.hashCode(_priority);
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
            if (!Qos.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Qos other = (Qos)obj;
            if (!Objects.equals(_latency, other.getLatency())) {
                return false;
            }
            if (!Objects.equals(_packetDelayVariation, other.getPacketDelayVariation())) {
                return false;
            }
            if (!Objects.equals(_packetLossRatio, other.getPacketLossRatio())) {
                return false;
            }
            if (!Objects.equals(_priority, other.getPriority())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                QosImpl otherImpl = (QosImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Qos>>, Augmentation<Qos>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Qos");
            CodeHelpers.appendValue(helper, "_latency", _latency);
            CodeHelpers.appendValue(helper, "_packetDelayVariation", _packetDelayVariation);
            CodeHelpers.appendValue(helper, "_packetLossRatio", _packetLossRatio);
            CodeHelpers.appendValue(helper, "_priority", _priority);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
