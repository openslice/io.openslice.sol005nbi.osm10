package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.vlr;
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
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfrConnectionPointRefBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VnfrConnectionPointRefBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VnfrConnectionPointRefBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VnfrConnectionPointRefBuilder, as instances can be freely passed around without
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
 * @see VnfrConnectionPointRefBuilder
 * @see Builder
 *
 */
public class VnfrConnectionPointRefBuilder implements Builder<VnfrConnectionPointRef> {

    private Object _connectionPoint;
    private Uuid _vnfrId;
    private VnfrConnectionPointRefKey key;


    Map<Class<? extends Augmentation<VnfrConnectionPointRef>>, Augmentation<VnfrConnectionPointRef>> augmentation = Collections.emptyMap();

    public VnfrConnectionPointRefBuilder() {
    }

    public VnfrConnectionPointRefBuilder(VnfrConnectionPointRef base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfrConnectionPointRef>>, Augmentation<VnfrConnectionPointRef>> aug =((AugmentationHolder<VnfrConnectionPointRef>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._vnfrId = base.getVnfrId();
        this._connectionPoint = base.getConnectionPoint();
    }


    public VnfrConnectionPointRefKey key() {
        return key;
    }
    
    public Object getConnectionPoint() {
        return _connectionPoint;
    }
    
    public Uuid getVnfrId() {
        return _vnfrId;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VnfrConnectionPointRef>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VnfrConnectionPointRefBuilder withKey(final VnfrConnectionPointRefKey key) {
        this.key = key;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder setConnectionPoint(final Object value) {
        this._connectionPoint = value;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder setVnfrId(final Uuid value) {
        this._vnfrId = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VnfrConnectionPointRefBuilder addAugmentation(Augmentation<VnfrConnectionPointRef> augmentation) {
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
    public VnfrConnectionPointRefBuilder addAugmentation(Class<? extends Augmentation<VnfrConnectionPointRef>> augmentationType, Augmentation<VnfrConnectionPointRef> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VnfrConnectionPointRefBuilder removeAugmentation(Class<? extends Augmentation<VnfrConnectionPointRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VnfrConnectionPointRefBuilder doAddAugmentation(Class<? extends Augmentation<VnfrConnectionPointRef>> augmentationType, Augmentation<VnfrConnectionPointRef> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VnfrConnectionPointRef build() {
        return new VnfrConnectionPointRefImpl(this);
    }

    private static final class VnfrConnectionPointRefImpl
        extends AbstractAugmentable<VnfrConnectionPointRef>
        implements VnfrConnectionPointRef {
    
        private final Object _connectionPoint;
        private final Uuid _vnfrId;
        private final VnfrConnectionPointRefKey key;
    
        VnfrConnectionPointRefImpl(VnfrConnectionPointRefBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfrConnectionPointRefKey(base.getVnfrId());
            }
            this._vnfrId = key.getVnfrId();
            this._connectionPoint = base.getConnectionPoint();
        }
    
        @Override
        public VnfrConnectionPointRefKey key() {
            return key;
        }
        
        @Override
        public Object getConnectionPoint() {
            return _connectionPoint;
        }
        
        @Override
        public Uuid getVnfrId() {
            return _vnfrId;
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
            result = prime * result + Objects.hashCode(_connectionPoint);
            result = prime * result + Objects.hashCode(_vnfrId);
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
            if (!VnfrConnectionPointRef.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VnfrConnectionPointRef other = (VnfrConnectionPointRef)obj;
            if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_vnfrId, other.getVnfrId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrConnectionPointRefImpl otherImpl = (VnfrConnectionPointRefImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfrConnectionPointRef>>, Augmentation<VnfrConnectionPointRef>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfrConnectionPointRef");
            CodeHelpers.appendValue(helper, "_connectionPoint", _connectionPoint);
            CodeHelpers.appendValue(helper, "_vnfrId", _vnfrId);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
