package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Long;
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
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link NsToLevelMappingBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NsToLevelMappingBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NsToLevelMappingBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NsToLevelMappingBuilder, as instances can be freely passed around without
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
 * @see NsToLevelMappingBuilder
 * @see Builder
 *
 */
public class NsToLevelMappingBuilder implements Builder<NsToLevelMapping> {

    private String _nsProfileId;
    private Uint32 _numberOfInstances;
    private NsToLevelMappingKey key;


    Map<Class<? extends Augmentation<NsToLevelMapping>>, Augmentation<NsToLevelMapping>> augmentation = Collections.emptyMap();

    public NsToLevelMappingBuilder() {
    }

    public NsToLevelMappingBuilder(NsToLevelMapping base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NsToLevelMapping>>, Augmentation<NsToLevelMapping>> aug =((AugmentationHolder<NsToLevelMapping>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._nsProfileId = base.getNsProfileId();
        this._numberOfInstances = base.getNumberOfInstances();
    }


    public NsToLevelMappingKey key() {
        return key;
    }
    
    public String getNsProfileId() {
        return _nsProfileId;
    }
    
    public Uint32 getNumberOfInstances() {
        return _numberOfInstances;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<NsToLevelMapping>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NsToLevelMappingBuilder withKey(final NsToLevelMappingKey key) {
        this.key = key;
        return this;
    }
    
    public NsToLevelMappingBuilder setNsProfileId(final String value) {
        this._nsProfileId = value;
        return this;
    }
    
    public NsToLevelMappingBuilder setNumberOfInstances(final Uint32 value) {
        this._numberOfInstances = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setNumberOfInstances(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public NsToLevelMappingBuilder setNumberOfInstances(final Long value) {
        return setNumberOfInstances(CodeHelpers.compatUint(value));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NsToLevelMappingBuilder addAugmentation(Augmentation<NsToLevelMapping> augmentation) {
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
    public NsToLevelMappingBuilder addAugmentation(Class<? extends Augmentation<NsToLevelMapping>> augmentationType, Augmentation<NsToLevelMapping> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NsToLevelMappingBuilder removeAugmentation(Class<? extends Augmentation<NsToLevelMapping>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NsToLevelMappingBuilder doAddAugmentation(Class<? extends Augmentation<NsToLevelMapping>> augmentationType, Augmentation<NsToLevelMapping> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public NsToLevelMapping build() {
        return new NsToLevelMappingImpl(this);
    }

    private static final class NsToLevelMappingImpl
        extends AbstractAugmentable<NsToLevelMapping>
        implements NsToLevelMapping {
    
        private final String _nsProfileId;
        private final Uint32 _numberOfInstances;
        private final NsToLevelMappingKey key;
    
        NsToLevelMappingImpl(NsToLevelMappingBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NsToLevelMappingKey(base.getNsProfileId());
            }
            this._nsProfileId = key.getNsProfileId();
            this._numberOfInstances = base.getNumberOfInstances();
        }
    
        @Override
        public NsToLevelMappingKey key() {
            return key;
        }
        
        @Override
        public String getNsProfileId() {
            return _nsProfileId;
        }
        
        @Override
        public Uint32 getNumberOfInstances() {
            return _numberOfInstances;
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
            result = prime * result + Objects.hashCode(_nsProfileId);
            result = prime * result + Objects.hashCode(_numberOfInstances);
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
            if (!NsToLevelMapping.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            NsToLevelMapping other = (NsToLevelMapping)obj;
            if (!Objects.equals(_nsProfileId, other.getNsProfileId())) {
                return false;
            }
            if (!Objects.equals(_numberOfInstances, other.getNumberOfInstances())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsToLevelMappingImpl otherImpl = (NsToLevelMappingImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NsToLevelMapping>>, Augmentation<NsToLevelMapping>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NsToLevelMapping");
            CodeHelpers.appendValue(helper, "_nsProfileId", _nsProfileId);
            CodeHelpers.appendValue(helper, "_numberOfInstances", _numberOfInstances);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
