package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ModifiableAttributesBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ModifiableAttributesBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ModifiableAttributesBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ModifiableAttributesBuilder, as instances can be freely passed around without
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
 * @see ModifiableAttributesBuilder
 * @see Builder
 *
 */
public class ModifiableAttributesBuilder implements Builder<ModifiableAttributes> {

    private List<String> _extension;
    private List<String> _metadata;


    Map<Class<? extends Augmentation<ModifiableAttributes>>, Augmentation<ModifiableAttributes>> augmentation = Collections.emptyMap();

    public ModifiableAttributesBuilder() {
    }

    public ModifiableAttributesBuilder(ModifiableAttributes base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ModifiableAttributes>>, Augmentation<ModifiableAttributes>> aug =((AugmentationHolder<ModifiableAttributes>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._extension = base.getExtension();
        this._metadata = base.getMetadata();
    }


    public List<String> getExtension() {
        return _extension;
    }
    
    public List<String> getMetadata() {
        return _metadata;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ModifiableAttributes>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ModifiableAttributesBuilder setExtension(final List<String> values) {
        this._extension = values;
        return this;
    }
    
    public ModifiableAttributesBuilder setMetadata(final List<String> values) {
        this._metadata = values;
        return this;
    }
    
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ModifiableAttributesBuilder addAugmentation(Augmentation<ModifiableAttributes> augmentation) {
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
    public ModifiableAttributesBuilder addAugmentation(Class<? extends Augmentation<ModifiableAttributes>> augmentationType, Augmentation<ModifiableAttributes> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ModifiableAttributesBuilder removeAugmentation(Class<? extends Augmentation<ModifiableAttributes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ModifiableAttributesBuilder doAddAugmentation(Class<? extends Augmentation<ModifiableAttributes>> augmentationType, Augmentation<ModifiableAttributes> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ModifiableAttributes build() {
        return new ModifiableAttributesImpl(this);
    }

    private static final class ModifiableAttributesImpl
        extends AbstractAugmentable<ModifiableAttributes>
        implements ModifiableAttributes {
    
        private final List<String> _extension;
        private final List<String> _metadata;
    
        ModifiableAttributesImpl(ModifiableAttributesBuilder base) {
            super(base.augmentation);
            this._extension = base.getExtension();
            this._metadata = base.getMetadata();
        }
    
        @Override
        public List<String> getExtension() {
            return _extension;
        }
        
        @Override
        public List<String> getMetadata() {
            return _metadata;
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
            result = prime * result + Objects.hashCode(_extension);
            result = prime * result + Objects.hashCode(_metadata);
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
            if (!ModifiableAttributes.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ModifiableAttributes other = (ModifiableAttributes)obj;
            if (!Objects.equals(_extension, other.getExtension())) {
                return false;
            }
            if (!Objects.equals(_metadata, other.getMetadata())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ModifiableAttributesImpl otherImpl = (ModifiableAttributesImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ModifiableAttributes>>, Augmentation<ModifiableAttributes>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ModifiableAttributes");
            CodeHelpers.appendValue(helper, "_extension", _extension);
            CodeHelpers.appendValue(helper, "_metadata", _metadata);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
