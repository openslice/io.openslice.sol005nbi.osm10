package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.NsToLevelMapping;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.NsToLevelMappingKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.VirtualLinkToLevelMapping;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.VirtualLinkToLevelMappingKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.VnfToLevelMapping;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.VnfToLevelMappingKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NsInstantiationLevelBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NsInstantiationLevelBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NsInstantiationLevelBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NsInstantiationLevelBuilder, as instances can be freely passed around without
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
 * @see NsInstantiationLevelBuilder
 * @see Builder
 *
 */
public class NsInstantiationLevelBuilder implements Builder<NsInstantiationLevel> {

    private String _description;
    private String _id;
    private Map<NsToLevelMappingKey, NsToLevelMapping> _nsToLevelMapping;
    private Map<VirtualLinkToLevelMappingKey, VirtualLinkToLevelMapping> _virtualLinkToLevelMapping;
    private Map<VnfToLevelMappingKey, VnfToLevelMapping> _vnfToLevelMapping;
    private NsInstantiationLevelKey key;


    Map<Class<? extends Augmentation<NsInstantiationLevel>>, Augmentation<NsInstantiationLevel>> augmentation = Collections.emptyMap();

    public NsInstantiationLevelBuilder() {
    }

    public NsInstantiationLevelBuilder(NsInstantiationLevel base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NsInstantiationLevel>>, Augmentation<NsInstantiationLevel>> aug =((AugmentationHolder<NsInstantiationLevel>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._description = base.getDescription();
        this._nsToLevelMapping = base.getNsToLevelMapping();
        this._virtualLinkToLevelMapping = base.getVirtualLinkToLevelMapping();
        this._vnfToLevelMapping = base.getVnfToLevelMapping();
    }


    public NsInstantiationLevelKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public Map<NsToLevelMappingKey, NsToLevelMapping> getNsToLevelMapping() {
        return _nsToLevelMapping;
    }
    
    public Map<VirtualLinkToLevelMappingKey, VirtualLinkToLevelMapping> getVirtualLinkToLevelMapping() {
        return _virtualLinkToLevelMapping;
    }
    
    public Map<VnfToLevelMappingKey, VnfToLevelMapping> getVnfToLevelMapping() {
        return _vnfToLevelMapping;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<NsInstantiationLevel>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NsInstantiationLevelBuilder withKey(final NsInstantiationLevelKey key) {
        this.key = key;
        return this;
    }
    
    public NsInstantiationLevelBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public NsInstantiationLevelBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public NsInstantiationLevelBuilder setNsToLevelMapping(final Map<NsToLevelMappingKey, NsToLevelMapping> values) {
        this._nsToLevelMapping = values;
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
      * @deprecated Use {#link #setNsToLevelMapping(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsInstantiationLevelBuilder setNsToLevelMapping(final List<NsToLevelMapping> values) {
        return setNsToLevelMapping(CodeHelpers.compatMap(values));
    }
    public NsInstantiationLevelBuilder setVirtualLinkToLevelMapping(final Map<VirtualLinkToLevelMappingKey, VirtualLinkToLevelMapping> values) {
        this._virtualLinkToLevelMapping = values;
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
      * @deprecated Use {#link #setVirtualLinkToLevelMapping(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsInstantiationLevelBuilder setVirtualLinkToLevelMapping(final List<VirtualLinkToLevelMapping> values) {
        return setVirtualLinkToLevelMapping(CodeHelpers.compatMap(values));
    }
    public NsInstantiationLevelBuilder setVnfToLevelMapping(final Map<VnfToLevelMappingKey, VnfToLevelMapping> values) {
        this._vnfToLevelMapping = values;
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
      * @deprecated Use {#link #setVnfToLevelMapping(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsInstantiationLevelBuilder setVnfToLevelMapping(final List<VnfToLevelMapping> values) {
        return setVnfToLevelMapping(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NsInstantiationLevelBuilder addAugmentation(Augmentation<NsInstantiationLevel> augmentation) {
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
    public NsInstantiationLevelBuilder addAugmentation(Class<? extends Augmentation<NsInstantiationLevel>> augmentationType, Augmentation<NsInstantiationLevel> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NsInstantiationLevelBuilder removeAugmentation(Class<? extends Augmentation<NsInstantiationLevel>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NsInstantiationLevelBuilder doAddAugmentation(Class<? extends Augmentation<NsInstantiationLevel>> augmentationType, Augmentation<NsInstantiationLevel> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public NsInstantiationLevel build() {
        return new NsInstantiationLevelImpl(this);
    }

    private static final class NsInstantiationLevelImpl
        extends AbstractAugmentable<NsInstantiationLevel>
        implements NsInstantiationLevel {
    
        private final String _description;
        private final String _id;
        private final Map<NsToLevelMappingKey, NsToLevelMapping> _nsToLevelMapping;
        private final Map<VirtualLinkToLevelMappingKey, VirtualLinkToLevelMapping> _virtualLinkToLevelMapping;
        private final Map<VnfToLevelMappingKey, VnfToLevelMapping> _vnfToLevelMapping;
        private final NsInstantiationLevelKey key;
    
        NsInstantiationLevelImpl(NsInstantiationLevelBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NsInstantiationLevelKey(base.getId());
            }
            this._id = key.getId();
            this._description = base.getDescription();
            this._nsToLevelMapping = CodeHelpers.emptyToNull(base.getNsToLevelMapping());
            this._virtualLinkToLevelMapping = CodeHelpers.emptyToNull(base.getVirtualLinkToLevelMapping());
            this._vnfToLevelMapping = CodeHelpers.emptyToNull(base.getVnfToLevelMapping());
        }
    
        @Override
        public NsInstantiationLevelKey key() {
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
        public Map<NsToLevelMappingKey, NsToLevelMapping> getNsToLevelMapping() {
            return _nsToLevelMapping;
        }
        
        @Override
        public Map<VirtualLinkToLevelMappingKey, VirtualLinkToLevelMapping> getVirtualLinkToLevelMapping() {
            return _virtualLinkToLevelMapping;
        }
        
        @Override
        public Map<VnfToLevelMappingKey, VnfToLevelMapping> getVnfToLevelMapping() {
            return _vnfToLevelMapping;
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
            result = prime * result + Objects.hashCode(_nsToLevelMapping);
            result = prime * result + Objects.hashCode(_virtualLinkToLevelMapping);
            result = prime * result + Objects.hashCode(_vnfToLevelMapping);
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
            if (!NsInstantiationLevel.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            NsInstantiationLevel other = (NsInstantiationLevel)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_nsToLevelMapping, other.getNsToLevelMapping())) {
                return false;
            }
            if (!Objects.equals(_virtualLinkToLevelMapping, other.getVirtualLinkToLevelMapping())) {
                return false;
            }
            if (!Objects.equals(_vnfToLevelMapping, other.getVnfToLevelMapping())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsInstantiationLevelImpl otherImpl = (NsInstantiationLevelImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NsInstantiationLevel>>, Augmentation<NsInstantiationLevel>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NsInstantiationLevel");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_nsToLevelMapping", _nsToLevelMapping);
            CodeHelpers.appendValue(helper, "_virtualLinkToLevelMapping", _virtualLinkToLevelMapping);
            CodeHelpers.appendValue(helper, "_vnfToLevelMapping", _vnfToLevelMapping);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
