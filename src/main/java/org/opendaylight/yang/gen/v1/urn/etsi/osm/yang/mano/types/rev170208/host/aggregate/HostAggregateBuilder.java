package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.aggregate;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link HostAggregateBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     HostAggregateBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new HostAggregateBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of HostAggregateBuilder, as instances can be freely passed around without
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
 * @see HostAggregateBuilder
 * @see Builder
 *
 */
public class HostAggregateBuilder implements Builder<HostAggregate> {

    private String _metadataKey;
    private String _metadataValue;
    private HostAggregateKey key;


    Map<Class<? extends Augmentation<HostAggregate>>, Augmentation<HostAggregate>> augmentation = Collections.emptyMap();

    public HostAggregateBuilder() {
    }

    public HostAggregateBuilder(HostAggregate base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<HostAggregate>>, Augmentation<HostAggregate>> aug =((AugmentationHolder<HostAggregate>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._metadataKey = base.getMetadataKey();
        this._metadataValue = base.getMetadataValue();
    }


    public HostAggregateKey key() {
        return key;
    }
    
    public String getMetadataKey() {
        return _metadataKey;
    }
    
    public String getMetadataValue() {
        return _metadataValue;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<HostAggregate>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public HostAggregateBuilder withKey(final HostAggregateKey key) {
        this.key = key;
        return this;
    }
    
    public HostAggregateBuilder setMetadataKey(final String value) {
        this._metadataKey = value;
        return this;
    }
    
    public HostAggregateBuilder setMetadataValue(final String value) {
        this._metadataValue = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public HostAggregateBuilder addAugmentation(Augmentation<HostAggregate> augmentation) {
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
    public HostAggregateBuilder addAugmentation(Class<? extends Augmentation<HostAggregate>> augmentationType, Augmentation<HostAggregate> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public HostAggregateBuilder removeAugmentation(Class<? extends Augmentation<HostAggregate>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private HostAggregateBuilder doAddAugmentation(Class<? extends Augmentation<HostAggregate>> augmentationType, Augmentation<HostAggregate> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public HostAggregate build() {
        return new HostAggregateImpl(this);
    }

    private static final class HostAggregateImpl
        extends AbstractAugmentable<HostAggregate>
        implements HostAggregate {
    
        private final String _metadataKey;
        private final String _metadataValue;
        private final HostAggregateKey key;
    
        HostAggregateImpl(HostAggregateBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new HostAggregateKey(base.getMetadataKey());
            }
            this._metadataKey = key.getMetadataKey();
            this._metadataValue = base.getMetadataValue();
        }
    
        @Override
        public HostAggregateKey key() {
            return key;
        }
        
        @Override
        public String getMetadataKey() {
            return _metadataKey;
        }
        
        @Override
        public String getMetadataValue() {
            return _metadataValue;
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
            result = prime * result + Objects.hashCode(_metadataKey);
            result = prime * result + Objects.hashCode(_metadataValue);
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
            if (!HostAggregate.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            HostAggregate other = (HostAggregate)obj;
            if (!Objects.equals(_metadataKey, other.getMetadataKey())) {
                return false;
            }
            if (!Objects.equals(_metadataValue, other.getMetadataValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HostAggregateImpl otherImpl = (HostAggregateImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<HostAggregate>>, Augmentation<HostAggregate>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("HostAggregate");
            CodeHelpers.appendValue(helper, "_metadataKey", _metadataKey);
            CodeHelpers.appendValue(helper, "_metadataValue", _metadataValue);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
