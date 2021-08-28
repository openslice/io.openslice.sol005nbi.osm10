package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.kdu.KduModel;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link KduBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     KduBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new KduBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of KduBuilder, as instances can be freely passed around without
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
 * @see KduBuilder
 * @see Builder
 *
 */
public class KduBuilder implements Builder<Kdu> {

    private String _description;
    private KduModel _kduModel;
    private String _name;
    private KduKey key;


    Map<Class<? extends Augmentation<Kdu>>, Augmentation<Kdu>> augmentation = Collections.emptyMap();

    public KduBuilder() {
    }

    public KduBuilder(Kdu base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Kdu>>, Augmentation<Kdu>> aug =((AugmentationHolder<Kdu>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._description = base.getDescription();
        this._kduModel = base.getKduModel();
    }


    public KduKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public KduModel getKduModel() {
        return _kduModel;
    }
    
    public String getName() {
        return _name;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Kdu>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public KduBuilder withKey(final KduKey key) {
        this.key = key;
        return this;
    }
    
    public KduBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public KduBuilder setKduModel(final KduModel value) {
        this._kduModel = value;
        return this;
    }
    
    public KduBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public KduBuilder addAugmentation(Augmentation<Kdu> augmentation) {
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
    public KduBuilder addAugmentation(Class<? extends Augmentation<Kdu>> augmentationType, Augmentation<Kdu> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public KduBuilder removeAugmentation(Class<? extends Augmentation<Kdu>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private KduBuilder doAddAugmentation(Class<? extends Augmentation<Kdu>> augmentationType, Augmentation<Kdu> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Kdu build() {
        return new KduImpl(this);
    }

    private static final class KduImpl
        extends AbstractAugmentable<Kdu>
        implements Kdu {
    
        private final String _description;
        private final KduModel _kduModel;
        private final String _name;
        private final KduKey key;
    
        KduImpl(KduBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new KduKey(base.getName());
            }
            this._name = key.getName();
            this._description = base.getDescription();
            this._kduModel = base.getKduModel();
        }
    
        @Override
        public KduKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public KduModel getKduModel() {
            return _kduModel;
        }
        
        @Override
        public String getName() {
            return _name;
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_kduModel);
            result = prime * result + Objects.hashCode(_name);
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
            if (!Kdu.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Kdu other = (Kdu)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_kduModel, other.getKduModel())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                KduImpl otherImpl = (KduImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Kdu>>, Augmentation<Kdu>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Kdu");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_kduModel", _kduModel);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
