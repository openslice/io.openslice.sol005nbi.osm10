package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.network.Incoming;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.network.Outgoing;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetworkBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NetworkBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NetworkBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NetworkBuilder, as instances can be freely passed around without
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
 * @see NetworkBuilder
 * @see Builder
 *
 */
public class NetworkBuilder implements Builder<Network> {

    private Incoming _incoming;
    private String _label;
    private Outgoing _outgoing;


    Map<Class<? extends Augmentation<Network>>, Augmentation<Network>> augmentation = Collections.emptyMap();

    public NetworkBuilder() {
    }

    public NetworkBuilder(Network base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Network>>, Augmentation<Network>> aug =((AugmentationHolder<Network>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._incoming = base.getIncoming();
        this._label = base.getLabel();
        this._outgoing = base.getOutgoing();
    }


    public Incoming getIncoming() {
        return _incoming;
    }
    
    public String getLabel() {
        return _label;
    }
    
    public Outgoing getOutgoing() {
        return _outgoing;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Network>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public NetworkBuilder setIncoming(final Incoming value) {
        this._incoming = value;
        return this;
    }
    
    public NetworkBuilder setLabel(final String value) {
        this._label = value;
        return this;
    }
    
    public NetworkBuilder setOutgoing(final Outgoing value) {
        this._outgoing = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NetworkBuilder addAugmentation(Augmentation<Network> augmentation) {
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
    public NetworkBuilder addAugmentation(Class<? extends Augmentation<Network>> augmentationType, Augmentation<Network> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NetworkBuilder removeAugmentation(Class<? extends Augmentation<Network>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NetworkBuilder doAddAugmentation(Class<? extends Augmentation<Network>> augmentationType, Augmentation<Network> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Network build() {
        return new NetworkImpl(this);
    }

    private static final class NetworkImpl
        extends AbstractAugmentable<Network>
        implements Network {
    
        private final Incoming _incoming;
        private final String _label;
        private final Outgoing _outgoing;
    
        NetworkImpl(NetworkBuilder base) {
            super(base.augmentation);
            this._incoming = base.getIncoming();
            this._label = base.getLabel();
            this._outgoing = base.getOutgoing();
        }
    
        @Override
        public Incoming getIncoming() {
            return _incoming;
        }
        
        @Override
        public String getLabel() {
            return _label;
        }
        
        @Override
        public Outgoing getOutgoing() {
            return _outgoing;
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
            result = prime * result + Objects.hashCode(_incoming);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_outgoing);
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
            if (!Network.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Network other = (Network)obj;
            if (!Objects.equals(_incoming, other.getIncoming())) {
                return false;
            }
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_outgoing, other.getOutgoing())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkImpl otherImpl = (NetworkImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Network>>, Augmentation<Network>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Network");
            CodeHelpers.appendValue(helper, "_incoming", _incoming);
            CodeHelpers.appendValue(helper, "_label", _label);
            CodeHelpers.appendValue(helper, "_outgoing", _outgoing);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
