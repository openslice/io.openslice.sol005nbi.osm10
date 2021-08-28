package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.vnfr.Primitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.vnfr.PrimitiveKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfrBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VnfrBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VnfrBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VnfrBuilder, as instances can be freely passed around without
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
 * @see VnfrBuilder
 * @see Builder
 *
 */
public class VnfrBuilder implements Builder<Vnfr> {

    private Uuid _id;
    private Map<PrimitiveKey, Primitive> _primitive;
    private Vnfr.VnfJobStatus _vnfJobStatus;
    private VnfrKey key;


    Map<Class<? extends Augmentation<Vnfr>>, Augmentation<Vnfr>> augmentation = Collections.emptyMap();

    public VnfrBuilder() {
    }

    public VnfrBuilder(Vnfr base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vnfr>>, Augmentation<Vnfr>> aug =((AugmentationHolder<Vnfr>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._primitive = base.getPrimitive();
        this._vnfJobStatus = base.getVnfJobStatus();
    }


    public VnfrKey key() {
        return key;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public Map<PrimitiveKey, Primitive> getPrimitive() {
        return _primitive;
    }
    
    public Vnfr.VnfJobStatus getVnfJobStatus() {
        return _vnfJobStatus;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Vnfr>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VnfrBuilder withKey(final VnfrKey key) {
        this.key = key;
        return this;
    }
    
    public VnfrBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    public VnfrBuilder setPrimitive(final Map<PrimitiveKey, Primitive> values) {
        this._primitive = values;
        return this;
    }
    
    /**
      * Utility migration setter.
      *
      * <b>IMPORTANT NOTE</b>: This method does not completely match previous mechanics, as the list is processed as
      *                        during this method's execution. Any future modifications of the list are <b>NOT</b>
      *                        reflected in this builder nor its products.
      *
      * @param values Legacy List of values
      * @return this builder
      * @throws IllegalArgumentException if the list contains entries with the same key
      * @throws NullPointerException if the list contains a null entry
      * @deprecated Use {#link #setPrimitive(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfrBuilder setPrimitive(final List<Primitive> values) {
        return setPrimitive(CodeHelpers.compatMap(values));
    }
    
    public VnfrBuilder setVnfJobStatus(final Vnfr.VnfJobStatus value) {
        this._vnfJobStatus = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VnfrBuilder addAugmentation(Augmentation<Vnfr> augmentation) {
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
    public VnfrBuilder addAugmentation(Class<? extends Augmentation<Vnfr>> augmentationType, Augmentation<Vnfr> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VnfrBuilder removeAugmentation(Class<? extends Augmentation<Vnfr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VnfrBuilder doAddAugmentation(Class<? extends Augmentation<Vnfr>> augmentationType, Augmentation<Vnfr> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Vnfr build() {
        return new VnfrImpl(this);
    }

    private static final class VnfrImpl
        extends AbstractAugmentable<Vnfr>
        implements Vnfr {
    
        private final Uuid _id;
        private final Map<PrimitiveKey, Primitive> _primitive;
        private final Vnfr.VnfJobStatus _vnfJobStatus;
        private final VnfrKey key;
    
        VnfrImpl(VnfrBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfrKey(base.getId());
            }
            this._id = key.getId();
            this._primitive = CodeHelpers.emptyToNull(base.getPrimitive());
            this._vnfJobStatus = base.getVnfJobStatus();
        }
    
        @Override
        public VnfrKey key() {
            return key;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public Map<PrimitiveKey, Primitive> getPrimitive() {
            return _primitive;
        }
        
        @Override
        public Vnfr.VnfJobStatus getVnfJobStatus() {
            return _vnfJobStatus;
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_primitive);
            result = prime * result + Objects.hashCode(_vnfJobStatus);
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
            if (!Vnfr.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Vnfr other = (Vnfr)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_primitive, other.getPrimitive())) {
                return false;
            }
            if (!Objects.equals(_vnfJobStatus, other.getVnfJobStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrImpl otherImpl = (VnfrImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vnfr>>, Augmentation<Vnfr>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vnfr");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_primitive", _primitive);
            CodeHelpers.appendValue(helper, "_vnfJobStatus", _vnfJobStatus);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
