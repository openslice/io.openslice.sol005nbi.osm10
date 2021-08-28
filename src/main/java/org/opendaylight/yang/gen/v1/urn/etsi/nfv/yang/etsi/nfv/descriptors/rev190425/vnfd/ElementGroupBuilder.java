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
 * Class that builds {@link ElementGroupBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ElementGroupBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ElementGroupBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ElementGroupBuilder, as instances can be freely passed around without
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
 * @see ElementGroupBuilder
 * @see Builder
 *
 */
public class ElementGroupBuilder implements Builder<ElementGroup> {

    private String _description;
    private String _id;
    private List<String> _vdu;
    private List<String> _virtualLinkDesc;
    private ElementGroupKey key;


    Map<Class<? extends Augmentation<ElementGroup>>, Augmentation<ElementGroup>> augmentation = Collections.emptyMap();

    public ElementGroupBuilder() {
    }

    public ElementGroupBuilder(ElementGroup base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ElementGroup>>, Augmentation<ElementGroup>> aug =((AugmentationHolder<ElementGroup>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._description = base.getDescription();
        this._vdu = base.getVdu();
        this._virtualLinkDesc = base.getVirtualLinkDesc();
    }


    public ElementGroupKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public List<String> getVdu() {
        return _vdu;
    }
    
    public List<String> getVirtualLinkDesc() {
        return _virtualLinkDesc;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ElementGroup>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ElementGroupBuilder withKey(final ElementGroupKey key) {
        this.key = key;
        return this;
    }
    
    public ElementGroupBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public ElementGroupBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public ElementGroupBuilder setVdu(final List<String> values) {
        this._vdu = values;
        return this;
    }
    
    public ElementGroupBuilder setVirtualLinkDesc(final List<String> values) {
        this._virtualLinkDesc = values;
        return this;
    }
    
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ElementGroupBuilder addAugmentation(Augmentation<ElementGroup> augmentation) {
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
    public ElementGroupBuilder addAugmentation(Class<? extends Augmentation<ElementGroup>> augmentationType, Augmentation<ElementGroup> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ElementGroupBuilder removeAugmentation(Class<? extends Augmentation<ElementGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ElementGroupBuilder doAddAugmentation(Class<? extends Augmentation<ElementGroup>> augmentationType, Augmentation<ElementGroup> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ElementGroup build() {
        return new ElementGroupImpl(this);
    }

    private static final class ElementGroupImpl
        extends AbstractAugmentable<ElementGroup>
        implements ElementGroup {
    
        private final String _description;
        private final String _id;
        private final List<String> _vdu;
        private final List<String> _virtualLinkDesc;
        private final ElementGroupKey key;
    
        ElementGroupImpl(ElementGroupBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ElementGroupKey(base.getId());
            }
            this._id = key.getId();
            this._description = base.getDescription();
            this._vdu = base.getVdu();
            this._virtualLinkDesc = base.getVirtualLinkDesc();
        }
    
        @Override
        public ElementGroupKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public List<String> getVdu() {
            return _vdu;
        }
        
        @Override
        public List<String> getVirtualLinkDesc() {
            return _virtualLinkDesc;
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_vdu);
            result = prime * result + Objects.hashCode(_virtualLinkDesc);
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
            if (!ElementGroup.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ElementGroup other = (ElementGroup)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_vdu, other.getVdu())) {
                return false;
            }
            if (!Objects.equals(_virtualLinkDesc, other.getVirtualLinkDesc())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ElementGroupImpl otherImpl = (ElementGroupImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ElementGroup>>, Augmentation<ElementGroup>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ElementGroup");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_vdu", _vdu);
            CodeHelpers.appendValue(helper, "_virtualLinkDesc", _virtualLinkDesc);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
