package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.connectivity.type.ConnectivityType;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.virtual.link.desc.DfKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VirtualLinkDescBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualLinkDescBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualLinkDescBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualLinkDescBuilder, as instances can be freely passed around without
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
 * @see VirtualLinkDescBuilder
 * @see Builder
 *
 */
public class VirtualLinkDescBuilder implements Builder<VirtualLinkDesc> {

    private String _algorithm;
    private String _certificate;
    private ConnectivityType _connectivityType;
    private String _description;
    private Map<DfKey, Df> _df;
    private String _id;
    private String _signature;
    private VirtualLinkDesc.TestAccess _testAccess;
    private VirtualLinkDescKey key;


    Map<Class<? extends Augmentation<VirtualLinkDesc>>, Augmentation<VirtualLinkDesc>> augmentation = Collections.emptyMap();

    public VirtualLinkDescBuilder() {
    }
    public VirtualLinkDescBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.ConnectivityType arg) {
        this._connectivityType = arg.getConnectivityType();
    }
    public VirtualLinkDescBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters arg) {
        this._signature = arg.getSignature();
        this._algorithm = arg.getAlgorithm();
        this._certificate = arg.getCertificate();
    }

    public VirtualLinkDescBuilder(VirtualLinkDesc base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VirtualLinkDesc>>, Augmentation<VirtualLinkDesc>> aug =((AugmentationHolder<VirtualLinkDesc>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._algorithm = base.getAlgorithm();
        this._certificate = base.getCertificate();
        this._connectivityType = base.getConnectivityType();
        this._description = base.getDescription();
        this._df = base.getDf();
        this._signature = base.getSignature();
        this._testAccess = base.getTestAccess();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.ConnectivityType</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.ConnectivityType) {
            this._connectivityType = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.ConnectivityType)arg).getConnectivityType();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters) {
            this._signature = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters)arg).getSignature();
            this._algorithm = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters)arg).getAlgorithm();
            this._certificate = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters)arg).getCertificate();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.ConnectivityType, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters]");
    }

    public VirtualLinkDescKey key() {
        return key;
    }
    
    public String getAlgorithm() {
        return _algorithm;
    }
    
    public String getCertificate() {
        return _certificate;
    }
    
    public ConnectivityType getConnectivityType() {
        return _connectivityType;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public Map<DfKey, Df> getDf() {
        return _df;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getSignature() {
        return _signature;
    }
    
    public VirtualLinkDesc.TestAccess getTestAccess() {
        return _testAccess;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VirtualLinkDesc>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VirtualLinkDescBuilder withKey(final VirtualLinkDescKey key) {
        this.key = key;
        return this;
    }
    
    public VirtualLinkDescBuilder setAlgorithm(final String value) {
        this._algorithm = value;
        return this;
    }
    
    public VirtualLinkDescBuilder setCertificate(final String value) {
        this._certificate = value;
        return this;
    }
    
    public VirtualLinkDescBuilder setConnectivityType(final ConnectivityType value) {
        this._connectivityType = value;
        return this;
    }
    
    public VirtualLinkDescBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    public VirtualLinkDescBuilder setDf(final Map<DfKey, Df> values) {
        this._df = values;
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
      * @deprecated Use {#link #setDf(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    @JsonIgnore
    public VirtualLinkDescBuilder setDf(final List<Df> values) {
        return setDf(CodeHelpers.compatMap(values));
    }
    
    public VirtualLinkDescBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public VirtualLinkDescBuilder setSignature(final String value) {
        this._signature = value;
        return this;
    }
    
    public VirtualLinkDescBuilder setTestAccess(final VirtualLinkDesc.TestAccess value) {
        this._testAccess = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VirtualLinkDescBuilder addAugmentation(Augmentation<VirtualLinkDesc> augmentation) {
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
    public VirtualLinkDescBuilder addAugmentation(Class<? extends Augmentation<VirtualLinkDesc>> augmentationType, Augmentation<VirtualLinkDesc> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VirtualLinkDescBuilder removeAugmentation(Class<? extends Augmentation<VirtualLinkDesc>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VirtualLinkDescBuilder doAddAugmentation(Class<? extends Augmentation<VirtualLinkDesc>> augmentationType, Augmentation<VirtualLinkDesc> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VirtualLinkDesc build() {
        return new VirtualLinkDescImpl(this);
    }

    private static final class VirtualLinkDescImpl
        extends AbstractAugmentable<VirtualLinkDesc>
        implements VirtualLinkDesc {
    
        private final String _algorithm;
        private final String _certificate;
        private final ConnectivityType _connectivityType;
        private final String _description;
        private final Map<DfKey, Df> _df;
        private final String _id;
        private final String _signature;
        private final VirtualLinkDesc.TestAccess _testAccess;
        private final VirtualLinkDescKey key;
    
        VirtualLinkDescImpl(VirtualLinkDescBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VirtualLinkDescKey(base.getId());
            }
            this._id = key.getId();
            this._algorithm = base.getAlgorithm();
            this._certificate = base.getCertificate();
            this._connectivityType = base.getConnectivityType();
            this._description = base.getDescription();
            this._df = CodeHelpers.emptyToNull(base.getDf());
            this._signature = base.getSignature();
            this._testAccess = base.getTestAccess();
        }
    
        @Override
        public VirtualLinkDescKey key() {
            return key;
        }
        
        @Override
        public String getAlgorithm() {
            return _algorithm;
        }
        
        @Override
        public String getCertificate() {
            return _certificate;
        }
        
        @Override
        public ConnectivityType getConnectivityType() {
            return _connectivityType;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public Map<DfKey, Df> getDf() {
            return _df;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getSignature() {
            return _signature;
        }
        
        @Override
        public VirtualLinkDesc.TestAccess getTestAccess() {
            return _testAccess;
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
            result = prime * result + Objects.hashCode(_algorithm);
            result = prime * result + Objects.hashCode(_certificate);
            result = prime * result + Objects.hashCode(_connectivityType);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_df);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_signature);
            result = prime * result + Objects.hashCode(_testAccess);
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
            if (!VirtualLinkDesc.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualLinkDesc other = (VirtualLinkDesc)obj;
            if (!Objects.equals(_algorithm, other.getAlgorithm())) {
                return false;
            }
            if (!Objects.equals(_certificate, other.getCertificate())) {
                return false;
            }
            if (!Objects.equals(_connectivityType, other.getConnectivityType())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_df, other.getDf())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_signature, other.getSignature())) {
                return false;
            }
            if (!Objects.equals(_testAccess, other.getTestAccess())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualLinkDescImpl otherImpl = (VirtualLinkDescImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VirtualLinkDesc>>, Augmentation<VirtualLinkDesc>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualLinkDesc");
            CodeHelpers.appendValue(helper, "_algorithm", _algorithm);
            CodeHelpers.appendValue(helper, "_certificate", _certificate);
            CodeHelpers.appendValue(helper, "_connectivityType", _connectivityType);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_df", _df);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_signature", _signature);
            CodeHelpers.appendValue(helper, "_testAccess", _testAccess);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
