package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
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
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link VirtualLinkToLevelMappingBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualLinkToLevelMappingBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualLinkToLevelMappingBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualLinkToLevelMappingBuilder, as instances can be freely passed around without
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
 * @see VirtualLinkToLevelMappingBuilder
 * @see Builder
 *
 */
public class VirtualLinkToLevelMappingBuilder implements Builder<VirtualLinkToLevelMapping> {

    private Uint64 _leaf;
    private Uint64 _root;
    private String _virtualLinkProfileId;
    private VirtualLinkToLevelMappingKey key;


    Map<Class<? extends Augmentation<VirtualLinkToLevelMapping>>, Augmentation<VirtualLinkToLevelMapping>> augmentation = Collections.emptyMap();

    public VirtualLinkToLevelMappingBuilder() {
    }
    public VirtualLinkToLevelMappingBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LinkBitrateRequirements arg) {
        this._root = arg.getRoot();
        this._leaf = arg.getLeaf();
    }

    public VirtualLinkToLevelMappingBuilder(VirtualLinkToLevelMapping base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VirtualLinkToLevelMapping>>, Augmentation<VirtualLinkToLevelMapping>> aug =((AugmentationHolder<VirtualLinkToLevelMapping>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._virtualLinkProfileId = base.getVirtualLinkProfileId();
        this._leaf = base.getLeaf();
        this._root = base.getRoot();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LinkBitrateRequirements</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LinkBitrateRequirements) {
            this._root = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LinkBitrateRequirements)arg).getRoot();
            this._leaf = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LinkBitrateRequirements)arg).getLeaf();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LinkBitrateRequirements]");
    }

    public VirtualLinkToLevelMappingKey key() {
        return key;
    }
    
    public Uint64 getLeaf() {
        return _leaf;
    }
    
    public Uint64 getRoot() {
        return _root;
    }
    
    public String getVirtualLinkProfileId() {
        return _virtualLinkProfileId;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VirtualLinkToLevelMapping>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VirtualLinkToLevelMappingBuilder withKey(final VirtualLinkToLevelMappingKey key) {
        this.key = key;
        return this;
    }
    
    public VirtualLinkToLevelMappingBuilder setLeaf(final Uint64 value) {
        this._leaf = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setLeaf(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public VirtualLinkToLevelMappingBuilder setLeaf(final BigInteger value) {
        return setLeaf(CodeHelpers.compatUint(value));
    }
    
    public VirtualLinkToLevelMappingBuilder setRoot(final Uint64 value) {
        this._root = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setRoot(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public VirtualLinkToLevelMappingBuilder setRoot(final BigInteger value) {
        return setRoot(CodeHelpers.compatUint(value));
    }
    
    public VirtualLinkToLevelMappingBuilder setVirtualLinkProfileId(final String value) {
        this._virtualLinkProfileId = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VirtualLinkToLevelMappingBuilder addAugmentation(Augmentation<VirtualLinkToLevelMapping> augmentation) {
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
    public VirtualLinkToLevelMappingBuilder addAugmentation(Class<? extends Augmentation<VirtualLinkToLevelMapping>> augmentationType, Augmentation<VirtualLinkToLevelMapping> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VirtualLinkToLevelMappingBuilder removeAugmentation(Class<? extends Augmentation<VirtualLinkToLevelMapping>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VirtualLinkToLevelMappingBuilder doAddAugmentation(Class<? extends Augmentation<VirtualLinkToLevelMapping>> augmentationType, Augmentation<VirtualLinkToLevelMapping> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VirtualLinkToLevelMapping build() {
        return new VirtualLinkToLevelMappingImpl(this);
    }

    private static final class VirtualLinkToLevelMappingImpl
        extends AbstractAugmentable<VirtualLinkToLevelMapping>
        implements VirtualLinkToLevelMapping {
    
        private final Uint64 _leaf;
        private final Uint64 _root;
        private final String _virtualLinkProfileId;
        private final VirtualLinkToLevelMappingKey key;
    
        VirtualLinkToLevelMappingImpl(VirtualLinkToLevelMappingBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VirtualLinkToLevelMappingKey(base.getVirtualLinkProfileId());
            }
            this._virtualLinkProfileId = key.getVirtualLinkProfileId();
            this._leaf = base.getLeaf();
            this._root = base.getRoot();
        }
    
        @Override
        public VirtualLinkToLevelMappingKey key() {
            return key;
        }
        
        @Override
        public Uint64 getLeaf() {
            return _leaf;
        }
        
        @Override
        public Uint64 getRoot() {
            return _root;
        }
        
        @Override
        public String getVirtualLinkProfileId() {
            return _virtualLinkProfileId;
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
            result = prime * result + Objects.hashCode(_leaf);
            result = prime * result + Objects.hashCode(_root);
            result = prime * result + Objects.hashCode(_virtualLinkProfileId);
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
            if (!VirtualLinkToLevelMapping.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualLinkToLevelMapping other = (VirtualLinkToLevelMapping)obj;
            if (!Objects.equals(_leaf, other.getLeaf())) {
                return false;
            }
            if (!Objects.equals(_root, other.getRoot())) {
                return false;
            }
            if (!Objects.equals(_virtualLinkProfileId, other.getVirtualLinkProfileId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualLinkToLevelMappingImpl otherImpl = (VirtualLinkToLevelMappingImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VirtualLinkToLevelMapping>>, Augmentation<VirtualLinkToLevelMapping>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualLinkToLevelMapping");
            CodeHelpers.appendValue(helper, "_leaf", _leaf);
            CodeHelpers.appendValue(helper, "_root", _root);
            CodeHelpers.appendValue(helper, "_virtualLinkProfileId", _virtualLinkProfileId);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
