package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.StorageType;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.storage.desc.VduStorageRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.storage.desc.VduStorageRequirementsKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link VirtualStorageDescBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualStorageDescBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualStorageDescBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualStorageDescBuilder, as instances can be freely passed around without
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
 * @see VirtualStorageDescBuilder
 * @see Builder
 *
 */
public class VirtualStorageDescBuilder implements Builder<VirtualStorageDesc> {

    private String _id;
    private Uint64 _sizeOfStorage;
    private String _swImageDesc;
    private Class<? extends StorageType> _typeOfStorage;
    private Map<VduStorageRequirementsKey, VduStorageRequirements> _vduStorageRequirements;
    private Boolean _rdmaEnabled;
    private VirtualStorageDescKey key;


    Map<Class<? extends Augmentation<VirtualStorageDesc>>, Augmentation<VirtualStorageDesc>> augmentation = Collections.emptyMap();

    public VirtualStorageDescBuilder() {
    }

    public VirtualStorageDescBuilder(VirtualStorageDesc base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VirtualStorageDesc>>, Augmentation<VirtualStorageDesc>> aug =((AugmentationHolder<VirtualStorageDesc>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._sizeOfStorage = base.getSizeOfStorage();
        this._swImageDesc = base.getSwImageDesc();
        this._typeOfStorage = base.getTypeOfStorage();
        this._vduStorageRequirements = base.getVduStorageRequirements();
        this._rdmaEnabled = base.isRdmaEnabled();
    }


    public VirtualStorageDescKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public Uint64 getSizeOfStorage() {
        return _sizeOfStorage;
    }
    
    public String getSwImageDesc() {
        return _swImageDesc;
    }
    
    public Class<? extends StorageType> getTypeOfStorage() {
        return _typeOfStorage;
    }
    
    public Map<VduStorageRequirementsKey, VduStorageRequirements> getVduStorageRequirements() {
        return _vduStorageRequirements;
    }
    
    public Boolean isRdmaEnabled() {
        return _rdmaEnabled;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VirtualStorageDesc>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VirtualStorageDescBuilder withKey(final VirtualStorageDescKey key) {
        this.key = key;
        return this;
    }
    
    public VirtualStorageDescBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public VirtualStorageDescBuilder setSizeOfStorage(final Uint64 value) {
        this._sizeOfStorage = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setSizeOfStorage(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public VirtualStorageDescBuilder setSizeOfStorage(final BigInteger value) {
        return setSizeOfStorage(CodeHelpers.compatUint(value));
    }
    
    public VirtualStorageDescBuilder setSwImageDesc(final String value) {
        this._swImageDesc = value;
        return this;
    }
    
    public VirtualStorageDescBuilder setTypeOfStorage(final Class<? extends StorageType> value) {
        this._typeOfStorage = value;
        return this;
    }
    public VirtualStorageDescBuilder setVduStorageRequirements(final Map<VduStorageRequirementsKey, VduStorageRequirements> values) {
        this._vduStorageRequirements = values;
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
      * @deprecated Use {#link #setVduStorageRequirements(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VirtualStorageDescBuilder setVduStorageRequirements(final List<VduStorageRequirements> values) {
        return setVduStorageRequirements(CodeHelpers.compatMap(values));
    }
    
    public VirtualStorageDescBuilder setRdmaEnabled(final Boolean value) {
        this._rdmaEnabled = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VirtualStorageDescBuilder addAugmentation(Augmentation<VirtualStorageDesc> augmentation) {
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
    public VirtualStorageDescBuilder addAugmentation(Class<? extends Augmentation<VirtualStorageDesc>> augmentationType, Augmentation<VirtualStorageDesc> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VirtualStorageDescBuilder removeAugmentation(Class<? extends Augmentation<VirtualStorageDesc>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VirtualStorageDescBuilder doAddAugmentation(Class<? extends Augmentation<VirtualStorageDesc>> augmentationType, Augmentation<VirtualStorageDesc> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VirtualStorageDesc build() {
        return new VirtualStorageDescImpl(this);
    }

    public static final class VirtualStorageDescImpl
        extends AbstractAugmentable<VirtualStorageDesc>
        implements VirtualStorageDesc {
    
    	@JsonProperty("id")
        private final String _id;
    	@JsonProperty("size-of-storage")
        private final Uint64 _sizeOfStorage;
        private final String _swImageDesc;
        private final Class<? extends StorageType> _typeOfStorage;
        private final Map<VduStorageRequirementsKey, VduStorageRequirements> _vduStorageRequirements;
        private final Boolean _rdmaEnabled;
        private VirtualStorageDescKey key;
    
        VirtualStorageDescImpl(VirtualStorageDescBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VirtualStorageDescKey(base.getId());
            }
            this._id = key.getId();
            this._sizeOfStorage = base.getSizeOfStorage();
            this._swImageDesc = base.getSwImageDesc();
            this._typeOfStorage = base.getTypeOfStorage();
            this._vduStorageRequirements = CodeHelpers.emptyToNull(base.getVduStorageRequirements());
            this._rdmaEnabled = base.isRdmaEnabled();
        }
    
        public VirtualStorageDescImpl() {
        	this( new VirtualStorageDescBuilder());
        }
        
        @Override
        public VirtualStorageDescKey key() {
        	if ( ( key != null) && ( key.getId() == null) && ( _id != null) ) {
        		key = new VirtualStorageDescKey(_id);        		
        	}
            return key;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Uint64 getSizeOfStorage() {
            return _sizeOfStorage;
        }
        
        @Override
        public String getSwImageDesc() {
            return _swImageDesc;
        }
        
        @Override
        public Class<? extends StorageType> getTypeOfStorage() {
            return _typeOfStorage;
        }
        
        @Override
        public Map<VduStorageRequirementsKey, VduStorageRequirements> getVduStorageRequirements() {
            return _vduStorageRequirements;
        }
        
        @Override
        public Boolean isRdmaEnabled() {
            return _rdmaEnabled;
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_sizeOfStorage);
            result = prime * result + Objects.hashCode(_swImageDesc);
            result = prime * result + Objects.hashCode(_typeOfStorage);
            result = prime * result + Objects.hashCode(_vduStorageRequirements);
            result = prime * result + Objects.hashCode(_rdmaEnabled);
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
            if (!VirtualStorageDesc.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualStorageDesc other = (VirtualStorageDesc)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_sizeOfStorage, other.getSizeOfStorage())) {
                return false;
            }
            if (!Objects.equals(_swImageDesc, other.getSwImageDesc())) {
                return false;
            }
            if (!Objects.equals(_typeOfStorage, other.getTypeOfStorage())) {
                return false;
            }
            if (!Objects.equals(_vduStorageRequirements, other.getVduStorageRequirements())) {
                return false;
            }
            if (!Objects.equals(_rdmaEnabled, other.isRdmaEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualStorageDescImpl otherImpl = (VirtualStorageDescImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VirtualStorageDesc>>, Augmentation<VirtualStorageDesc>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualStorageDesc");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_sizeOfStorage", _sizeOfStorage);
            CodeHelpers.appendValue(helper, "_swImageDesc", _swImageDesc);
            CodeHelpers.appendValue(helper, "_typeOfStorage", _typeOfStorage);
            CodeHelpers.appendValue(helper, "_vduStorageRequirements", _vduStorageRequirements);
            CodeHelpers.appendValue(helper, "_rdmaEnabled", _rdmaEnabled);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
