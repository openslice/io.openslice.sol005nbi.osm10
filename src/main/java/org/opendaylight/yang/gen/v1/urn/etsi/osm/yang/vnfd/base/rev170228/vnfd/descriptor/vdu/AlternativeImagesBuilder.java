package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu;
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
 * Class that builds {@link AlternativeImagesBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     AlternativeImagesBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new AlternativeImagesBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of AlternativeImagesBuilder, as instances can be freely passed around without
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
 * @see AlternativeImagesBuilder
 * @see Builder
 *
 */
public class AlternativeImagesBuilder implements Builder<AlternativeImages> {

    private String _image;
    private String _imageChecksum;
    private String _vimType;
    private AlternativeImagesKey key;


    Map<Class<? extends Augmentation<AlternativeImages>>, Augmentation<AlternativeImages>> augmentation = Collections.emptyMap();

    public AlternativeImagesBuilder() {
    }
    public AlternativeImagesBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties arg) {
        this._image = arg.getImage();
        this._imageChecksum = arg.getImageChecksum();
    }

    public AlternativeImagesBuilder(AlternativeImages base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<AlternativeImages>>, Augmentation<AlternativeImages>> aug =((AugmentationHolder<AlternativeImages>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._vimType = base.getVimType();
        this._image = base.getImage();
        this._imageChecksum = base.getImageChecksum();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties) {
            this._image = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties)arg).getImage();
            this._imageChecksum = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties)arg).getImageChecksum();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties]");
    }

    public AlternativeImagesKey key() {
        return key;
    }
    
    public String getImage() {
        return _image;
    }
    
    public String getImageChecksum() {
        return _imageChecksum;
    }
    
    public String getVimType() {
        return _vimType;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<AlternativeImages>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public AlternativeImagesBuilder withKey(final AlternativeImagesKey key) {
        this.key = key;
        return this;
    }
    
    public AlternativeImagesBuilder setImage(final String value) {
        this._image = value;
        return this;
    }
    
    public AlternativeImagesBuilder setImageChecksum(final String value) {
        this._imageChecksum = value;
        return this;
    }
    
    public AlternativeImagesBuilder setVimType(final String value) {
        this._vimType = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public AlternativeImagesBuilder addAugmentation(Augmentation<AlternativeImages> augmentation) {
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
    public AlternativeImagesBuilder addAugmentation(Class<? extends Augmentation<AlternativeImages>> augmentationType, Augmentation<AlternativeImages> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public AlternativeImagesBuilder removeAugmentation(Class<? extends Augmentation<AlternativeImages>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private AlternativeImagesBuilder doAddAugmentation(Class<? extends Augmentation<AlternativeImages>> augmentationType, Augmentation<AlternativeImages> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public AlternativeImages build() {
        return new AlternativeImagesImpl(this);
    }

    private static final class AlternativeImagesImpl
        extends AbstractAugmentable<AlternativeImages>
        implements AlternativeImages {
    
        private final String _image;
        private final String _imageChecksum;
        private final String _vimType;
        private final AlternativeImagesKey key;
    
        AlternativeImagesImpl(AlternativeImagesBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new AlternativeImagesKey(base.getVimType());
            }
            this._vimType = key.getVimType();
            this._image = base.getImage();
            this._imageChecksum = base.getImageChecksum();
        }
    
        @Override
        public AlternativeImagesKey key() {
            return key;
        }
        
        @Override
        public String getImage() {
            return _image;
        }
        
        @Override
        public String getImageChecksum() {
            return _imageChecksum;
        }
        
        @Override
        public String getVimType() {
            return _vimType;
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
            result = prime * result + Objects.hashCode(_image);
            result = prime * result + Objects.hashCode(_imageChecksum);
            result = prime * result + Objects.hashCode(_vimType);
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
            if (!AlternativeImages.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            AlternativeImages other = (AlternativeImages)obj;
            if (!Objects.equals(_image, other.getImage())) {
                return false;
            }
            if (!Objects.equals(_imageChecksum, other.getImageChecksum())) {
                return false;
            }
            if (!Objects.equals(_vimType, other.getVimType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AlternativeImagesImpl otherImpl = (AlternativeImagesImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<AlternativeImages>>, Augmentation<AlternativeImages>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("AlternativeImages");
            CodeHelpers.appendValue(helper, "_image", _image);
            CodeHelpers.appendValue(helper, "_imageChecksum", _imageChecksum);
            CodeHelpers.appendValue(helper, "_vimType", _vimType);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
