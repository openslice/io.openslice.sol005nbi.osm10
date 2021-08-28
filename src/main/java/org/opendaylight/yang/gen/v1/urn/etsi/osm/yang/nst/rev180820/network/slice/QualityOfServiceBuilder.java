package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.ResourceType;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint16;

/**
 * Class that builds {@link QualityOfServiceBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     QualityOfServiceBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new QualityOfServiceBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of QualityOfServiceBuilder, as instances can be freely passed around without
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
 * @see QualityOfServiceBuilder
 * @see Builder
 *
 */
public class QualityOfServiceBuilder implements Builder<QualityOfService> {

    private Uint16 _defaultMaxDataBurst;
    private Uint16 _id;
    private Uint16 _packetDelayBudget;
    private Uint16 _packetErrorRate;
    private Uint16 _priorityLevel;
    private ResourceType _resourceType;


    Map<Class<? extends Augmentation<QualityOfService>>, Augmentation<QualityOfService>> augmentation = Collections.emptyMap();

    public QualityOfServiceBuilder() {
    }
    public QualityOfServiceBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi arg) {
        this._id = arg.getId();
        this._resourceType = arg.getResourceType();
        this._priorityLevel = arg.getPriorityLevel();
        this._packetDelayBudget = arg.getPacketDelayBudget();
        this._packetErrorRate = arg.getPacketErrorRate();
        this._defaultMaxDataBurst = arg.getDefaultMaxDataBurst();
    }

    public QualityOfServiceBuilder(QualityOfService base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<QualityOfService>>, Augmentation<QualityOfService>> aug =((AugmentationHolder<QualityOfService>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._defaultMaxDataBurst = base.getDefaultMaxDataBurst();
        this._id = base.getId();
        this._packetDelayBudget = base.getPacketDelayBudget();
        this._packetErrorRate = base.getPacketErrorRate();
        this._priorityLevel = base.getPriorityLevel();
        this._resourceType = base.getResourceType();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi)arg).getId();
            this._resourceType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi)arg).getResourceType();
            this._priorityLevel = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi)arg).getPriorityLevel();
            this._packetDelayBudget = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi)arg).getPacketDelayBudget();
            this._packetErrorRate = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi)arg).getPacketErrorRate();
            this._defaultMaxDataBurst = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi)arg).getDefaultMaxDataBurst();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi]");
    }

    public Uint16 getDefaultMaxDataBurst() {
        return _defaultMaxDataBurst;
    }
    
    public Uint16 getId() {
        return _id;
    }
    
    public Uint16 getPacketDelayBudget() {
        return _packetDelayBudget;
    }
    
    public Uint16 getPacketErrorRate() {
        return _packetErrorRate;
    }
    
    public Uint16 getPriorityLevel() {
        return _priorityLevel;
    }
    
    public ResourceType getResourceType() {
        return _resourceType;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<QualityOfService>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public QualityOfServiceBuilder setDefaultMaxDataBurst(final Uint16 value) {
        this._defaultMaxDataBurst = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setDefaultMaxDataBurst(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public QualityOfServiceBuilder setDefaultMaxDataBurst(final Integer value) {
        return setDefaultMaxDataBurst(CodeHelpers.compatUint(value));
    }
    
    public QualityOfServiceBuilder setId(final Uint16 value) {
        this._id = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setId(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public QualityOfServiceBuilder setId(final Integer value) {
        return setId(CodeHelpers.compatUint(value));
    }
    
    public QualityOfServiceBuilder setPacketDelayBudget(final Uint16 value) {
        this._packetDelayBudget = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setPacketDelayBudget(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public QualityOfServiceBuilder setPacketDelayBudget(final Integer value) {
        return setPacketDelayBudget(CodeHelpers.compatUint(value));
    }
    
    public QualityOfServiceBuilder setPacketErrorRate(final Uint16 value) {
        this._packetErrorRate = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setPacketErrorRate(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public QualityOfServiceBuilder setPacketErrorRate(final Integer value) {
        return setPacketErrorRate(CodeHelpers.compatUint(value));
    }
    
    public QualityOfServiceBuilder setPriorityLevel(final Uint16 value) {
        this._priorityLevel = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setPriorityLevel(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public QualityOfServiceBuilder setPriorityLevel(final Integer value) {
        return setPriorityLevel(CodeHelpers.compatUint(value));
    }
    
    public QualityOfServiceBuilder setResourceType(final ResourceType value) {
        this._resourceType = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public QualityOfServiceBuilder addAugmentation(Augmentation<QualityOfService> augmentation) {
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
    public QualityOfServiceBuilder addAugmentation(Class<? extends Augmentation<QualityOfService>> augmentationType, Augmentation<QualityOfService> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public QualityOfServiceBuilder removeAugmentation(Class<? extends Augmentation<QualityOfService>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private QualityOfServiceBuilder doAddAugmentation(Class<? extends Augmentation<QualityOfService>> augmentationType, Augmentation<QualityOfService> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public QualityOfService build() {
        return new QualityOfServiceImpl(this);
    }

    private static final class QualityOfServiceImpl
        extends AbstractAugmentable<QualityOfService>
        implements QualityOfService {
    
        private final Uint16 _defaultMaxDataBurst;
        private final Uint16 _id;
        private final Uint16 _packetDelayBudget;
        private final Uint16 _packetErrorRate;
        private final Uint16 _priorityLevel;
        private final ResourceType _resourceType;
    
        QualityOfServiceImpl(QualityOfServiceBuilder base) {
            super(base.augmentation);
            this._defaultMaxDataBurst = base.getDefaultMaxDataBurst();
            this._id = base.getId();
            this._packetDelayBudget = base.getPacketDelayBudget();
            this._packetErrorRate = base.getPacketErrorRate();
            this._priorityLevel = base.getPriorityLevel();
            this._resourceType = base.getResourceType();
        }
    
        @Override
        public Uint16 getDefaultMaxDataBurst() {
            return _defaultMaxDataBurst;
        }
        
        @Override
        public Uint16 getId() {
            return _id;
        }
        
        @Override
        public Uint16 getPacketDelayBudget() {
            return _packetDelayBudget;
        }
        
        @Override
        public Uint16 getPacketErrorRate() {
            return _packetErrorRate;
        }
        
        @Override
        public Uint16 getPriorityLevel() {
            return _priorityLevel;
        }
        
        @Override
        public ResourceType getResourceType() {
            return _resourceType;
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
            result = prime * result + Objects.hashCode(_defaultMaxDataBurst);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_packetDelayBudget);
            result = prime * result + Objects.hashCode(_packetErrorRate);
            result = prime * result + Objects.hashCode(_priorityLevel);
            result = prime * result + Objects.hashCode(_resourceType);
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
            if (!QualityOfService.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            QualityOfService other = (QualityOfService)obj;
            if (!Objects.equals(_defaultMaxDataBurst, other.getDefaultMaxDataBurst())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_packetDelayBudget, other.getPacketDelayBudget())) {
                return false;
            }
            if (!Objects.equals(_packetErrorRate, other.getPacketErrorRate())) {
                return false;
            }
            if (!Objects.equals(_priorityLevel, other.getPriorityLevel())) {
                return false;
            }
            if (!Objects.equals(_resourceType, other.getResourceType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                QualityOfServiceImpl otherImpl = (QualityOfServiceImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<QualityOfService>>, Augmentation<QualityOfService>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("QualityOfService");
            CodeHelpers.appendValue(helper, "_defaultMaxDataBurst", _defaultMaxDataBurst);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_packetDelayBudget", _packetDelayBudget);
            CodeHelpers.appendValue(helper, "_packetErrorRate", _packetErrorRate);
            CodeHelpers.appendValue(helper, "_priorityLevel", _priorityLevel);
            CodeHelpers.appendValue(helper, "_resourceType", _resourceType);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
