package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.Vnfr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.VnfrKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfrCatalogBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VnfrCatalogBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VnfrCatalogBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VnfrCatalogBuilder, as instances can be freely passed around without
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
 * @see VnfrCatalogBuilder
 * @see Builder
 *
 */
public class VnfrCatalogBuilder implements Builder<VnfrCatalog> {

    private String _schemaVersion;
    private Map<VnfrKey, Vnfr> _vnfr;


    Map<Class<? extends Augmentation<VnfrCatalog>>, Augmentation<VnfrCatalog>> augmentation = Collections.emptyMap();

    public VnfrCatalogBuilder() {
    }

    public VnfrCatalogBuilder(VnfrCatalog base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfrCatalog>>, Augmentation<VnfrCatalog>> aug =((AugmentationHolder<VnfrCatalog>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._schemaVersion = base.getSchemaVersion();
        this._vnfr = base.getVnfr();
    }


    public String getSchemaVersion() {
        return _schemaVersion;
    }
    
    public Map<VnfrKey, Vnfr> getVnfr() {
        return _vnfr;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VnfrCatalog>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public VnfrCatalogBuilder setSchemaVersion(final String value) {
        this._schemaVersion = value;
        return this;
    }
    public VnfrCatalogBuilder setVnfr(final Map<VnfrKey, Vnfr> values) {
        this._vnfr = values;
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
      * @deprecated Use {#link #setVnfr(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfrCatalogBuilder setVnfr(final List<Vnfr> values) {
        return setVnfr(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VnfrCatalogBuilder addAugmentation(Augmentation<VnfrCatalog> augmentation) {
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
    public VnfrCatalogBuilder addAugmentation(Class<? extends Augmentation<VnfrCatalog>> augmentationType, Augmentation<VnfrCatalog> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VnfrCatalogBuilder removeAugmentation(Class<? extends Augmentation<VnfrCatalog>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VnfrCatalogBuilder doAddAugmentation(Class<? extends Augmentation<VnfrCatalog>> augmentationType, Augmentation<VnfrCatalog> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VnfrCatalog build() {
        return new VnfrCatalogImpl(this);
    }

    private static final class VnfrCatalogImpl
        extends AbstractAugmentable<VnfrCatalog>
        implements VnfrCatalog {
    
        private final String _schemaVersion;
        private final Map<VnfrKey, Vnfr> _vnfr;
    
        VnfrCatalogImpl(VnfrCatalogBuilder base) {
            super(base.augmentation);
            this._schemaVersion = base.getSchemaVersion();
            this._vnfr = CodeHelpers.emptyToNull(base.getVnfr());
        }
    
        @Override
        public String getSchemaVersion() {
            return _schemaVersion;
        }
        
        @Override
        public Map<VnfrKey, Vnfr> getVnfr() {
            return _vnfr;
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
            result = prime * result + Objects.hashCode(_schemaVersion);
            result = prime * result + Objects.hashCode(_vnfr);
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
            if (!VnfrCatalog.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VnfrCatalog other = (VnfrCatalog)obj;
            if (!Objects.equals(_schemaVersion, other.getSchemaVersion())) {
                return false;
            }
            if (!Objects.equals(_vnfr, other.getVnfr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrCatalogImpl otherImpl = (VnfrCatalogImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfrCatalog>>, Augmentation<VnfrCatalog>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfrCatalog");
            CodeHelpers.appendValue(helper, "_schemaVersion", _schemaVersion);
            CodeHelpers.appendValue(helper, "_vnfr", _vnfr);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
