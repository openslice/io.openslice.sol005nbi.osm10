package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param;
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
 * Class that builds {@link JsonQueryParamsBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     JsonQueryParamsBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new JsonQueryParamsBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of JsonQueryParamsBuilder, as instances can be freely passed around without
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
 * @see JsonQueryParamsBuilder
 * @see Builder
 *
 */
public class JsonQueryParamsBuilder implements Builder<JsonQueryParams> {

    private String _jsonPath;
    private String _objectPath;


    Map<Class<? extends Augmentation<JsonQueryParams>>, Augmentation<JsonQueryParams>> augmentation = Collections.emptyMap();

    public JsonQueryParamsBuilder() {
    }

    public JsonQueryParamsBuilder(JsonQueryParams base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<JsonQueryParams>>, Augmentation<JsonQueryParams>> aug =((AugmentationHolder<JsonQueryParams>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._jsonPath = base.getJsonPath();
        this._objectPath = base.getObjectPath();
    }


    public String getJsonPath() {
        return _jsonPath;
    }
    
    public String getObjectPath() {
        return _objectPath;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<JsonQueryParams>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public JsonQueryParamsBuilder setJsonPath(final String value) {
        this._jsonPath = value;
        return this;
    }
    
    public JsonQueryParamsBuilder setObjectPath(final String value) {
        this._objectPath = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public JsonQueryParamsBuilder addAugmentation(Augmentation<JsonQueryParams> augmentation) {
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
    public JsonQueryParamsBuilder addAugmentation(Class<? extends Augmentation<JsonQueryParams>> augmentationType, Augmentation<JsonQueryParams> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public JsonQueryParamsBuilder removeAugmentation(Class<? extends Augmentation<JsonQueryParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private JsonQueryParamsBuilder doAddAugmentation(Class<? extends Augmentation<JsonQueryParams>> augmentationType, Augmentation<JsonQueryParams> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public JsonQueryParams build() {
        return new JsonQueryParamsImpl(this);
    }

    private static final class JsonQueryParamsImpl
        extends AbstractAugmentable<JsonQueryParams>
        implements JsonQueryParams {
    
        private final String _jsonPath;
        private final String _objectPath;
    
        JsonQueryParamsImpl(JsonQueryParamsBuilder base) {
            super(base.augmentation);
            this._jsonPath = base.getJsonPath();
            this._objectPath = base.getObjectPath();
        }
    
        @Override
        public String getJsonPath() {
            return _jsonPath;
        }
        
        @Override
        public String getObjectPath() {
            return _objectPath;
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
            result = prime * result + Objects.hashCode(_jsonPath);
            result = prime * result + Objects.hashCode(_objectPath);
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
            if (!JsonQueryParams.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            JsonQueryParams other = (JsonQueryParams)obj;
            if (!Objects.equals(_jsonPath, other.getJsonPath())) {
                return false;
            }
            if (!Objects.equals(_objectPath, other.getObjectPath())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                JsonQueryParamsImpl otherImpl = (JsonQueryParamsImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<JsonQueryParams>>, Augmentation<JsonQueryParams>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("JsonQueryParams");
            CodeHelpers.appendValue(helper, "_jsonPath", _jsonPath);
            CodeHelpers.appendValue(helper, "_objectPath", _objectPath);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
