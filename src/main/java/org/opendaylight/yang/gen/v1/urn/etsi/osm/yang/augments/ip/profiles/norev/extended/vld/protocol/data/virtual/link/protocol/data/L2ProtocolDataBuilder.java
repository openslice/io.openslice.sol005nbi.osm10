package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data.virtual.link.protocol.data;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint16;

/**
 * Class that builds {@link L2ProtocolDataBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     L2ProtocolDataBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new L2ProtocolDataBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of L2ProtocolDataBuilder, as instances can be freely passed around without
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
 * @see L2ProtocolDataBuilder
 * @see Builder
 *
 */
public class L2ProtocolDataBuilder implements Builder<L2ProtocolData> {

    private Uint16 _mtu;
    private String _name;
    private L2ProtocolData.NetworkType _networkType;
    private Boolean _vlanTransparent;


    Map<Class<? extends Augmentation<L2ProtocolData>>, Augmentation<L2ProtocolData>> augmentation = Collections.emptyMap();

    public L2ProtocolDataBuilder() {
    }

    public L2ProtocolDataBuilder(L2ProtocolData base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<L2ProtocolData>>, Augmentation<L2ProtocolData>> aug =((AugmentationHolder<L2ProtocolData>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._mtu = base.getMtu();
        this._name = base.getName();
        this._networkType = base.getNetworkType();
        this._vlanTransparent = base.isVlanTransparent();
    }


    public Uint16 getMtu() {
        return _mtu;
    }
    
    public String getName() {
        return _name;
    }
    
    public L2ProtocolData.NetworkType getNetworkType() {
        return _networkType;
    }
    
    public Boolean isVlanTransparent() {
        return _vlanTransparent;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<L2ProtocolData>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public L2ProtocolDataBuilder setMtu(final Uint16 value) {
        this._mtu = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setMtu(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public L2ProtocolDataBuilder setMtu(final Integer value) {
        return setMtu(CodeHelpers.compatUint(value));
    }
    
    public L2ProtocolDataBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public L2ProtocolDataBuilder setNetworkType(final L2ProtocolData.NetworkType value) {
        this._networkType = value;
        return this;
    }
    
    public L2ProtocolDataBuilder setVlanTransparent(final Boolean value) {
        this._vlanTransparent = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public L2ProtocolDataBuilder addAugmentation(Augmentation<L2ProtocolData> augmentation) {
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
    public L2ProtocolDataBuilder addAugmentation(Class<? extends Augmentation<L2ProtocolData>> augmentationType, Augmentation<L2ProtocolData> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public L2ProtocolDataBuilder removeAugmentation(Class<? extends Augmentation<L2ProtocolData>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private L2ProtocolDataBuilder doAddAugmentation(Class<? extends Augmentation<L2ProtocolData>> augmentationType, Augmentation<L2ProtocolData> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public L2ProtocolData build() {
        return new L2ProtocolDataImpl(this);
    }

    private static final class L2ProtocolDataImpl
        extends AbstractAugmentable<L2ProtocolData>
        implements L2ProtocolData {
    
        private final Uint16 _mtu;
        private final String _name;
        private final L2ProtocolData.NetworkType _networkType;
        private final Boolean _vlanTransparent;
    
        L2ProtocolDataImpl(L2ProtocolDataBuilder base) {
            super(base.augmentation);
            this._mtu = base.getMtu();
            this._name = base.getName();
            this._networkType = base.getNetworkType();
            this._vlanTransparent = base.isVlanTransparent();
        }
    
        @Override
        public Uint16 getMtu() {
            return _mtu;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public L2ProtocolData.NetworkType getNetworkType() {
            return _networkType;
        }
        
        @Override
        public Boolean isVlanTransparent() {
            return _vlanTransparent;
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
            result = prime * result + Objects.hashCode(_mtu);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_networkType);
            result = prime * result + Objects.hashCode(_vlanTransparent);
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
            if (!L2ProtocolData.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            L2ProtocolData other = (L2ProtocolData)obj;
            if (!Objects.equals(_mtu, other.getMtu())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_networkType, other.getNetworkType())) {
                return false;
            }
            if (!Objects.equals(_vlanTransparent, other.isVlanTransparent())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2ProtocolDataImpl otherImpl = (L2ProtocolDataImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<L2ProtocolData>>, Augmentation<L2ProtocolData>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("L2ProtocolData");
            CodeHelpers.appendValue(helper, "_mtu", _mtu);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_networkType", _networkType);
            CodeHelpers.appendValue(helper, "_vlanTransparent", _vlanTransparent);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
