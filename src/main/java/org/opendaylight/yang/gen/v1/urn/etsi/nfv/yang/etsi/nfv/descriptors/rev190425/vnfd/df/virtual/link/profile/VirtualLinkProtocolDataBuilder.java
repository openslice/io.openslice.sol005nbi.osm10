package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LayerProtocol;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.virtual.link.protocol.data.L2ProtocolData;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.virtual.link.protocol.data.L3ProtocolData;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VirtualLinkProtocolDataBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualLinkProtocolDataBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualLinkProtocolDataBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualLinkProtocolDataBuilder, as instances can be freely passed around without
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
 * @see VirtualLinkProtocolDataBuilder
 * @see Builder
 *
 */
public class VirtualLinkProtocolDataBuilder implements Builder<VirtualLinkProtocolData> {

    private Class<? extends LayerProtocol> _associatedLayerProtocol;
    private L2ProtocolData _l2ProtocolData;
    private L3ProtocolData _l3ProtocolData;


    Map<Class<? extends Augmentation<VirtualLinkProtocolData>>, Augmentation<VirtualLinkProtocolData>> augmentation = Collections.emptyMap();

    public VirtualLinkProtocolDataBuilder() {
    }

    public VirtualLinkProtocolDataBuilder(VirtualLinkProtocolData base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VirtualLinkProtocolData>>, Augmentation<VirtualLinkProtocolData>> aug =((AugmentationHolder<VirtualLinkProtocolData>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._associatedLayerProtocol = base.getAssociatedLayerProtocol();
        this._l2ProtocolData = base.getL2ProtocolData();
        this._l3ProtocolData = base.getL3ProtocolData();
    }


    public Class<? extends LayerProtocol> getAssociatedLayerProtocol() {
        return _associatedLayerProtocol;
    }
    
    public L2ProtocolData getL2ProtocolData() {
        return _l2ProtocolData;
    }
    
    public L3ProtocolData getL3ProtocolData() {
        return _l3ProtocolData;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VirtualLinkProtocolData>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public VirtualLinkProtocolDataBuilder setAssociatedLayerProtocol(final Class<? extends LayerProtocol> value) {
        this._associatedLayerProtocol = value;
        return this;
    }
    
    public VirtualLinkProtocolDataBuilder setL2ProtocolData(final L2ProtocolData value) {
        this._l2ProtocolData = value;
        return this;
    }
    
    public VirtualLinkProtocolDataBuilder setL3ProtocolData(final L3ProtocolData value) {
        this._l3ProtocolData = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VirtualLinkProtocolDataBuilder addAugmentation(Augmentation<VirtualLinkProtocolData> augmentation) {
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
    public VirtualLinkProtocolDataBuilder addAugmentation(Class<? extends Augmentation<VirtualLinkProtocolData>> augmentationType, Augmentation<VirtualLinkProtocolData> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VirtualLinkProtocolDataBuilder removeAugmentation(Class<? extends Augmentation<VirtualLinkProtocolData>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VirtualLinkProtocolDataBuilder doAddAugmentation(Class<? extends Augmentation<VirtualLinkProtocolData>> augmentationType, Augmentation<VirtualLinkProtocolData> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VirtualLinkProtocolData build() {
        return new VirtualLinkProtocolDataImpl(this);
    }

    private static final class VirtualLinkProtocolDataImpl
        extends AbstractAugmentable<VirtualLinkProtocolData>
        implements VirtualLinkProtocolData {
    
        private final Class<? extends LayerProtocol> _associatedLayerProtocol;
        private final L2ProtocolData _l2ProtocolData;
        private final L3ProtocolData _l3ProtocolData;
    
        VirtualLinkProtocolDataImpl(VirtualLinkProtocolDataBuilder base) {
            super(base.augmentation);
            this._associatedLayerProtocol = base.getAssociatedLayerProtocol();
            this._l2ProtocolData = base.getL2ProtocolData();
            this._l3ProtocolData = base.getL3ProtocolData();
        }
    
        @Override
        public Class<? extends LayerProtocol> getAssociatedLayerProtocol() {
            return _associatedLayerProtocol;
        }
        
        @Override
        public L2ProtocolData getL2ProtocolData() {
            return _l2ProtocolData;
        }
        
        @Override
        public L3ProtocolData getL3ProtocolData() {
            return _l3ProtocolData;
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
            result = prime * result + Objects.hashCode(_associatedLayerProtocol);
            result = prime * result + Objects.hashCode(_l2ProtocolData);
            result = prime * result + Objects.hashCode(_l3ProtocolData);
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
            if (!VirtualLinkProtocolData.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualLinkProtocolData other = (VirtualLinkProtocolData)obj;
            if (!Objects.equals(_associatedLayerProtocol, other.getAssociatedLayerProtocol())) {
                return false;
            }
            if (!Objects.equals(_l2ProtocolData, other.getL2ProtocolData())) {
                return false;
            }
            if (!Objects.equals(_l3ProtocolData, other.getL3ProtocolData())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualLinkProtocolDataImpl otherImpl = (VirtualLinkProtocolDataImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VirtualLinkProtocolData>>, Augmentation<VirtualLinkProtocolData>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualLinkProtocolData");
            CodeHelpers.appendValue(helper, "_associatedLayerProtocol", _associatedLayerProtocol);
            CodeHelpers.appendValue(helper, "_l2ProtocolData", _l2ProtocolData);
            CodeHelpers.appendValue(helper, "_l3ProtocolData", _l3ProtocolData);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
