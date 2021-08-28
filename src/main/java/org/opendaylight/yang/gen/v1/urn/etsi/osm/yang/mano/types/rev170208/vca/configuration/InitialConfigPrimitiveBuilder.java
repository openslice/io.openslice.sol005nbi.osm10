package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.initial.config.primitive.PrimitiveType;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link InitialConfigPrimitiveBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     InitialConfigPrimitiveBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new InitialConfigPrimitiveBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of InitialConfigPrimitiveBuilder, as instances can be freely passed around without
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
 * @see InitialConfigPrimitiveBuilder
 * @see Builder
 *
 */
public class InitialConfigPrimitiveBuilder implements Builder<InitialConfigPrimitive> {

    private PrimitiveType _primitiveType;
    private Uint64 _seq;
    private InitialConfigPrimitiveKey key;


    Map<Class<? extends Augmentation<InitialConfigPrimitive>>, Augmentation<InitialConfigPrimitive>> augmentation = Collections.emptyMap();

    public InitialConfigPrimitiveBuilder() {
    }

    public InitialConfigPrimitiveBuilder(InitialConfigPrimitive base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<InitialConfigPrimitive>>, Augmentation<InitialConfigPrimitive>> aug =((AugmentationHolder<InitialConfigPrimitive>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._seq = base.getSeq();
        this._primitiveType = base.getPrimitiveType();
    }


    public InitialConfigPrimitiveKey key() {
        return key;
    }
    
    public PrimitiveType getPrimitiveType() {
        return _primitiveType;
    }
    
    public Uint64 getSeq() {
        return _seq;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<InitialConfigPrimitive>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public InitialConfigPrimitiveBuilder withKey(final InitialConfigPrimitiveKey key) {
        this.key = key;
        return this;
    }
    
    public InitialConfigPrimitiveBuilder setPrimitiveType(final PrimitiveType value) {
        this._primitiveType = value;
        return this;
    }
    
    public InitialConfigPrimitiveBuilder setSeq(final Uint64 value) {
        this._seq = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setSeq(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public InitialConfigPrimitiveBuilder setSeq(final BigInteger value) {
        return setSeq(CodeHelpers.compatUint(value));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public InitialConfigPrimitiveBuilder addAugmentation(Augmentation<InitialConfigPrimitive> augmentation) {
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
    public InitialConfigPrimitiveBuilder addAugmentation(Class<? extends Augmentation<InitialConfigPrimitive>> augmentationType, Augmentation<InitialConfigPrimitive> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public InitialConfigPrimitiveBuilder removeAugmentation(Class<? extends Augmentation<InitialConfigPrimitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private InitialConfigPrimitiveBuilder doAddAugmentation(Class<? extends Augmentation<InitialConfigPrimitive>> augmentationType, Augmentation<InitialConfigPrimitive> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public InitialConfigPrimitive build() {
        return new InitialConfigPrimitiveImpl(this);
    }

    private static final class InitialConfigPrimitiveImpl
        extends AbstractAugmentable<InitialConfigPrimitive>
        implements InitialConfigPrimitive {
    
        private final PrimitiveType _primitiveType;
        private final Uint64 _seq;
        private final InitialConfigPrimitiveKey key;
    
        InitialConfigPrimitiveImpl(InitialConfigPrimitiveBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new InitialConfigPrimitiveKey(base.getSeq());
            }
            this._seq = key.getSeq();
            this._primitiveType = base.getPrimitiveType();
        }
    
        @Override
        public InitialConfigPrimitiveKey key() {
            return key;
        }
        
        @Override
        public PrimitiveType getPrimitiveType() {
            return _primitiveType;
        }
        
        @Override
        public Uint64 getSeq() {
            return _seq;
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
            result = prime * result + Objects.hashCode(_primitiveType);
            result = prime * result + Objects.hashCode(_seq);
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
            if (!InitialConfigPrimitive.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            InitialConfigPrimitive other = (InitialConfigPrimitive)obj;
            if (!Objects.equals(_primitiveType, other.getPrimitiveType())) {
                return false;
            }
            if (!Objects.equals(_seq, other.getSeq())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InitialConfigPrimitiveImpl otherImpl = (InitialConfigPrimitiveImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InitialConfigPrimitive>>, Augmentation<InitialConfigPrimitive>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InitialConfigPrimitive");
            CodeHelpers.appendValue(helper, "_primitiveType", _primitiveType);
            CodeHelpers.appendValue(helper, "_seq", _seq);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
