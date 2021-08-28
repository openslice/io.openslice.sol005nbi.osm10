package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vnf_params.InternalVld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vnf_params.InternalVldKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vnf_params.Vdu;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vnf_params.VduKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VnfBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VnfBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VnfBuilder, as instances can be freely passed around without
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
 * @see VnfBuilder
 * @see Builder
 *
 */
public class VnfBuilder implements Builder<Vnf> {

    private Map<InternalVldKey, InternalVld> _internalVld;
    private String _memberVnfIndex;
    private Map<VduKey, Vdu> _vdu;
    private String _vimAccountId;
    private VnfKey key;


    Map<Class<? extends Augmentation<Vnf>>, Augmentation<Vnf>> augmentation = Collections.emptyMap();

    public VnfBuilder() {
    }
    public VnfBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams arg) {
        this._memberVnfIndex = arg.getMemberVnfIndex();
        this._vimAccountId = arg.getVimAccountId();
        this._vdu = arg.getVdu();
        this._internalVld = arg.getInternalVld();
    }

    public VnfBuilder(Vnf base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vnf>>, Augmentation<Vnf>> aug =((AugmentationHolder<Vnf>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._memberVnfIndex = base.getMemberVnfIndex();
        this._internalVld = base.getInternalVld();
        this._vdu = base.getVdu();
        this._vimAccountId = base.getVimAccountId();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams) {
            this._memberVnfIndex = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams)arg).getMemberVnfIndex();
            this._vimAccountId = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams)arg).getVimAccountId();
            this._vdu = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams)arg).getVdu();
            this._internalVld = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams)arg).getInternalVld();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams]");
    }

    public VnfKey key() {
        return key;
    }
    
    public Map<InternalVldKey, InternalVld> getInternalVld() {
        return _internalVld;
    }
    
    public String getMemberVnfIndex() {
        return _memberVnfIndex;
    }
    
    public Map<VduKey, Vdu> getVdu() {
        return _vdu;
    }
    
    public String getVimAccountId() {
        return _vimAccountId;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Vnf>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VnfBuilder withKey(final VnfKey key) {
        this.key = key;
        return this;
    }
    public VnfBuilder setInternalVld(final Map<InternalVldKey, InternalVld> values) {
        this._internalVld = values;
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
      * @deprecated Use {#link #setInternalVld(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfBuilder setInternalVld(final List<InternalVld> values) {
        return setInternalVld(CodeHelpers.compatMap(values));
    }
    
    public VnfBuilder setMemberVnfIndex(final String value) {
        this._memberVnfIndex = value;
        return this;
    }
    public VnfBuilder setVdu(final Map<VduKey, Vdu> values) {
        this._vdu = values;
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
      * @deprecated Use {#link #setVdu(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfBuilder setVdu(final List<Vdu> values) {
        return setVdu(CodeHelpers.compatMap(values));
    }
    
    public VnfBuilder setVimAccountId(final String value) {
        this._vimAccountId = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VnfBuilder addAugmentation(Augmentation<Vnf> augmentation) {
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
    public VnfBuilder addAugmentation(Class<? extends Augmentation<Vnf>> augmentationType, Augmentation<Vnf> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VnfBuilder removeAugmentation(Class<? extends Augmentation<Vnf>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VnfBuilder doAddAugmentation(Class<? extends Augmentation<Vnf>> augmentationType, Augmentation<Vnf> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Vnf build() {
        return new VnfImpl(this);
    }

    private static final class VnfImpl
        extends AbstractAugmentable<Vnf>
        implements Vnf {
    
        private final Map<InternalVldKey, InternalVld> _internalVld;
        private final String _memberVnfIndex;
        private final Map<VduKey, Vdu> _vdu;
        private final String _vimAccountId;
        private final VnfKey key;
    
        VnfImpl(VnfBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfKey(base.getMemberVnfIndex());
            }
            this._memberVnfIndex = key.getMemberVnfIndex();
            this._internalVld = CodeHelpers.emptyToNull(base.getInternalVld());
            this._vdu = CodeHelpers.emptyToNull(base.getVdu());
            this._vimAccountId = base.getVimAccountId();
        }
    
        @Override
        public VnfKey key() {
            return key;
        }
        
        @Override
        public Map<InternalVldKey, InternalVld> getInternalVld() {
            return _internalVld;
        }
        
        @Override
        public String getMemberVnfIndex() {
            return _memberVnfIndex;
        }
        
        @Override
        public Map<VduKey, Vdu> getVdu() {
            return _vdu;
        }
        
        @Override
        public String getVimAccountId() {
            return _vimAccountId;
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
            result = prime * result + Objects.hashCode(_internalVld);
            result = prime * result + Objects.hashCode(_memberVnfIndex);
            result = prime * result + Objects.hashCode(_vdu);
            result = prime * result + Objects.hashCode(_vimAccountId);
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
            if (!Vnf.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Vnf other = (Vnf)obj;
            if (!Objects.equals(_internalVld, other.getInternalVld())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndex, other.getMemberVnfIndex())) {
                return false;
            }
            if (!Objects.equals(_vdu, other.getVdu())) {
                return false;
            }
            if (!Objects.equals(_vimAccountId, other.getVimAccountId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfImpl otherImpl = (VnfImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vnf>>, Augmentation<Vnf>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vnf");
            CodeHelpers.appendValue(helper, "_internalVld", _internalVld);
            CodeHelpers.appendValue(helper, "_memberVnfIndex", _memberVnfIndex);
            CodeHelpers.appendValue(helper, "_vdu", _vdu);
            CodeHelpers.appendValue(helper, "_vimAccountId", _vimAccountId);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
