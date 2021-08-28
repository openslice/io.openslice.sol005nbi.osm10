package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.CpdPool;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.CpdPoolKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.Nfpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.NfpdKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnffgdBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VnffgdBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VnffgdBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VnffgdBuilder, as instances can be freely passed around without
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
 * @see VnffgdBuilder
 * @see Builder
 *
 */
public class VnffgdBuilder implements Builder<Vnffgd> {

    private Map<CpdPoolKey, CpdPool> _cpdPool;
    private String _id;
    private List<String> _nestedNsProfileId;
    private Map<NfpdKey, Nfpd> _nfpd;
    private List<String> _pnfProfileId;
    private String _virtualLinkProfileId;
    private List<String> _vnfProfileId;
    private VnffgdKey key;


    Map<Class<? extends Augmentation<Vnffgd>>, Augmentation<Vnffgd>> augmentation = Collections.emptyMap();

    public VnffgdBuilder() {
    }

    public VnffgdBuilder(Vnffgd base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vnffgd>>, Augmentation<Vnffgd>> aug =((AugmentationHolder<Vnffgd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._cpdPool = base.getCpdPool();
        this._nestedNsProfileId = base.getNestedNsProfileId();
        this._nfpd = base.getNfpd();
        this._pnfProfileId = base.getPnfProfileId();
        this._virtualLinkProfileId = base.getVirtualLinkProfileId();
        this._vnfProfileId = base.getVnfProfileId();
    }


    public VnffgdKey key() {
        return key;
    }
    
    public Map<CpdPoolKey, CpdPool> getCpdPool() {
        return _cpdPool;
    }
    
    public String getId() {
        return _id;
    }
    
    public List<String> getNestedNsProfileId() {
        return _nestedNsProfileId;
    }
    
    public Map<NfpdKey, Nfpd> getNfpd() {
        return _nfpd;
    }
    
    public List<String> getPnfProfileId() {
        return _pnfProfileId;
    }
    
    public String getVirtualLinkProfileId() {
        return _virtualLinkProfileId;
    }
    
    public List<String> getVnfProfileId() {
        return _vnfProfileId;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Vnffgd>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VnffgdBuilder withKey(final VnffgdKey key) {
        this.key = key;
        return this;
    }
    public VnffgdBuilder setCpdPool(final Map<CpdPoolKey, CpdPool> values) {
        this._cpdPool = values;
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
      * @deprecated Use {#link #setCpdPool(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnffgdBuilder setCpdPool(final List<CpdPool> values) {
        return setCpdPool(CodeHelpers.compatMap(values));
    }
    
    public VnffgdBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public VnffgdBuilder setNestedNsProfileId(final List<String> values) {
        this._nestedNsProfileId = values;
        return this;
    }
    
    public VnffgdBuilder setNfpd(final Map<NfpdKey, Nfpd> values) {
        this._nfpd = values;
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
      * @deprecated Use {#link #setNfpd(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnffgdBuilder setNfpd(final List<Nfpd> values) {
        return setNfpd(CodeHelpers.compatMap(values));
    }
    public VnffgdBuilder setPnfProfileId(final List<String> values) {
        this._pnfProfileId = values;
        return this;
    }
    
    
    public VnffgdBuilder setVirtualLinkProfileId(final String value) {
        this._virtualLinkProfileId = value;
        return this;
    }
    public VnffgdBuilder setVnfProfileId(final List<String> values) {
        this._vnfProfileId = values;
        return this;
    }
    
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VnffgdBuilder addAugmentation(Augmentation<Vnffgd> augmentation) {
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
    public VnffgdBuilder addAugmentation(Class<? extends Augmentation<Vnffgd>> augmentationType, Augmentation<Vnffgd> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VnffgdBuilder removeAugmentation(Class<? extends Augmentation<Vnffgd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VnffgdBuilder doAddAugmentation(Class<? extends Augmentation<Vnffgd>> augmentationType, Augmentation<Vnffgd> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Vnffgd build() {
        return new VnffgdImpl(this);
    }

    private static final class VnffgdImpl
        extends AbstractAugmentable<Vnffgd>
        implements Vnffgd {
    
        private final Map<CpdPoolKey, CpdPool> _cpdPool;
        private final String _id;
        private final List<String> _nestedNsProfileId;
        private final Map<NfpdKey, Nfpd> _nfpd;
        private final List<String> _pnfProfileId;
        private final String _virtualLinkProfileId;
        private final List<String> _vnfProfileId;
        private final VnffgdKey key;
    
        VnffgdImpl(VnffgdBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnffgdKey(base.getId());
            }
            this._id = key.getId();
            this._cpdPool = CodeHelpers.emptyToNull(base.getCpdPool());
            this._nestedNsProfileId = base.getNestedNsProfileId();
            this._nfpd = CodeHelpers.emptyToNull(base.getNfpd());
            this._pnfProfileId = base.getPnfProfileId();
            this._virtualLinkProfileId = base.getVirtualLinkProfileId();
            this._vnfProfileId = base.getVnfProfileId();
        }
    
        @Override
        public VnffgdKey key() {
            return key;
        }
        
        @Override
        public Map<CpdPoolKey, CpdPool> getCpdPool() {
            return _cpdPool;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public List<String> getNestedNsProfileId() {
            return _nestedNsProfileId;
        }
        
        @Override
        public Map<NfpdKey, Nfpd> getNfpd() {
            return _nfpd;
        }
        
        @Override
        public List<String> getPnfProfileId() {
            return _pnfProfileId;
        }
        
        @Override
        public String getVirtualLinkProfileId() {
            return _virtualLinkProfileId;
        }
        
        @Override
        public List<String> getVnfProfileId() {
            return _vnfProfileId;
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
            result = prime * result + Objects.hashCode(_cpdPool);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_nestedNsProfileId);
            result = prime * result + Objects.hashCode(_nfpd);
            result = prime * result + Objects.hashCode(_pnfProfileId);
            result = prime * result + Objects.hashCode(_virtualLinkProfileId);
            result = prime * result + Objects.hashCode(_vnfProfileId);
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
            if (!Vnffgd.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Vnffgd other = (Vnffgd)obj;
            if (!Objects.equals(_cpdPool, other.getCpdPool())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_nestedNsProfileId, other.getNestedNsProfileId())) {
                return false;
            }
            if (!Objects.equals(_nfpd, other.getNfpd())) {
                return false;
            }
            if (!Objects.equals(_pnfProfileId, other.getPnfProfileId())) {
                return false;
            }
            if (!Objects.equals(_virtualLinkProfileId, other.getVirtualLinkProfileId())) {
                return false;
            }
            if (!Objects.equals(_vnfProfileId, other.getVnfProfileId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnffgdImpl otherImpl = (VnffgdImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vnffgd>>, Augmentation<Vnffgd>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vnffgd");
            CodeHelpers.appendValue(helper, "_cpdPool", _cpdPool);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_nestedNsProfileId", _nestedNsProfileId);
            CodeHelpers.appendValue(helper, "_nfpd", _nfpd);
            CodeHelpers.appendValue(helper, "_pnfProfileId", _pnfProfileId);
            CodeHelpers.appendValue(helper, "_virtualLinkProfileId", _virtualLinkProfileId);
            CodeHelpers.appendValue(helper, "_vnfProfileId", _vnfProfileId);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
