package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.DfKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.LifecycleManagementScript;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.LifecycleManagementScriptKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Sapd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.SapdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.VirtualLinkDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.VirtualLinkDescKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Vnffgd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.VnffgdKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NsdBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NsdBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NsdBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NsdBuilder, as instances can be freely passed around without
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
 * @see NsdBuilder
 * @see Builder
 *
 */
public class NsdBuilder implements Builder<Nsd> {

    private String _algorithm;
    private List<String> _autoscaleRule;
    private String _certificate;
    private String _designer;
    private Map<DfKey, Df> _df;
    private String _id;
    private String _invariantId;
    private Map<LifecycleManagementScriptKey, LifecycleManagementScript> _lifecycleManagementScript;
    private String _name;
    private List<String> _nestedNsdId;
    private List<String> _pnfdId;
    private Map<SapdKey, Sapd> _sapd;
    private String _signature;
    private String _version;
    private Map<VirtualLinkDescKey, VirtualLinkDesc> _virtualLinkDesc;
    private List<String> _vnfdId;
    private Map<VnffgdKey, Vnffgd> _vnffgd;
    private NsdKey key;


    Map<Class<? extends Augmentation<Nsd>>, Augmentation<Nsd>> augmentation = Collections.emptyMap();

    public NsdBuilder() {
    }
    public NsdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd arg) {
        this._id = arg.getId();
        this._designer = arg.getDesigner();
        this._version = arg.getVersion();
        this._name = arg.getName();
        this._invariantId = arg.getInvariantId();
        this._nestedNsdId = arg.getNestedNsdId();
        this._vnfdId = arg.getVnfdId();
        this._pnfdId = arg.getPnfdId();
        this._sapd = arg.getSapd();
        this._virtualLinkDesc = arg.getVirtualLinkDesc();
        this._vnffgd = arg.getVnffgd();
        this._autoscaleRule = arg.getAutoscaleRule();
        this._lifecycleManagementScript = arg.getLifecycleManagementScript();
        this._df = arg.getDf();
        this._signature = arg.getSignature();
        this._algorithm = arg.getAlgorithm();
        this._certificate = arg.getCertificate();
    }
    public NsdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters arg) {
        this._signature = arg.getSignature();
        this._algorithm = arg.getAlgorithm();
        this._certificate = arg.getCertificate();
    }

    public NsdBuilder(Nsd base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Nsd>>, Augmentation<Nsd>> aug =((AugmentationHolder<Nsd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._algorithm = base.getAlgorithm();
        this._autoscaleRule = base.getAutoscaleRule();
        this._certificate = base.getCertificate();
        this._designer = base.getDesigner();
        this._df = base.getDf();
        this._invariantId = base.getInvariantId();
        this._lifecycleManagementScript = base.getLifecycleManagementScript();
        this._name = base.getName();
        this._nestedNsdId = base.getNestedNsdId();
        this._pnfdId = base.getPnfdId();
        this._sapd = base.getSapd();
        this._signature = base.getSignature();
        this._version = base.getVersion();
        this._virtualLinkDesc = base.getVirtualLinkDesc();
        this._vnfdId = base.getVnfdId();
        this._vnffgd = base.getVnffgd();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getId();
            this._designer = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getDesigner();
            this._version = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getVersion();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getName();
            this._invariantId = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getInvariantId();
            this._nestedNsdId = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getNestedNsdId();
            this._vnfdId = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getVnfdId();
            this._pnfdId = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getPnfdId();
            this._sapd = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getSapd();
            this._virtualLinkDesc = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getVirtualLinkDesc();
            this._vnffgd = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getVnffgd();
            this._autoscaleRule = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getAutoscaleRule();
            this._lifecycleManagementScript = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getLifecycleManagementScript();
            this._df = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd)arg).getDf();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters) {
            this._signature = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters)arg).getSignature();
            this._algorithm = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters)arg).getAlgorithm();
            this._certificate = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters)arg).getCertificate();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters]");
    }

    public NsdKey key() {
        return key;
    }
    
    public String getAlgorithm() {
        return _algorithm;
    }
    
    public List<String> getAutoscaleRule() {
        return _autoscaleRule;
    }
    
    public String getCertificate() {
        return _certificate;
    }
    
    public String getDesigner() {
        return _designer;
    }
    
    public Map<DfKey, Df> getDf() {
        return _df;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getInvariantId() {
        return _invariantId;
    }
    
    public Map<LifecycleManagementScriptKey, LifecycleManagementScript> getLifecycleManagementScript() {
        return _lifecycleManagementScript;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<String> getNestedNsdId() {
        return _nestedNsdId;
    }
    
    public List<String> getPnfdId() {
        return _pnfdId;
    }
    
    public Map<SapdKey, Sapd> getSapd() {
        return _sapd;
    }
    
    public String getSignature() {
        return _signature;
    }
    
    public String getVersion() {
        return _version;
    }
    
    public Map<VirtualLinkDescKey, VirtualLinkDesc> getVirtualLinkDesc() {
        return _virtualLinkDesc;
    }
    
    public List<String> getVnfdId() {
        return _vnfdId;
    }
    
    public Map<VnffgdKey, Vnffgd> getVnffgd() {
        return _vnffgd;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Nsd>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NsdBuilder withKey(final NsdKey key) {
        this.key = key;
        return this;
    }
    
    public NsdBuilder setAlgorithm(final String value) {
        this._algorithm = value;
        return this;
    }
    public NsdBuilder setAutoscaleRule(final List<String> values) {
        this._autoscaleRule = values;
        return this;
    }
    
    
    public NsdBuilder setCertificate(final String value) {
        this._certificate = value;
        return this;
    }
    
    public NsdBuilder setDesigner(final String value) {
        this._designer = value;
        return this;
    }
    public NsdBuilder setDf(final Map<DfKey, Df> values) {
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
    public NsdBuilder setDf(final List<Df> values) {
        return setDf(CodeHelpers.compatMap(values));
    }
    
    public NsdBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public NsdBuilder setInvariantId(final String value) {
        this._invariantId = value;
        return this;
    }
    public NsdBuilder setLifecycleManagementScript(final Map<LifecycleManagementScriptKey, LifecycleManagementScript> values) {
        this._lifecycleManagementScript = values;
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
      * @deprecated Use {#link #setLifecycleManagementScript(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    @JsonIgnore
    public NsdBuilder setLifecycleManagementScript(final List<LifecycleManagementScript> values) {
        return setLifecycleManagementScript(CodeHelpers.compatMap(values));
    }
    
    public NsdBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public NsdBuilder setNestedNsdId(final List<String> values) {
        this._nestedNsdId = values;
        return this;
    }
    
    public NsdBuilder setPnfdId(final List<String> values) {
        this._pnfdId = values;
        return this;
    }
    
    public NsdBuilder setSapd(final Map<SapdKey, Sapd> values) {
        this._sapd = values;
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
      * @deprecated Use {#link #setSapd(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setSapd(final List<Sapd> values) {
        return setSapd(CodeHelpers.compatMap(values));
    }
    
    public NsdBuilder setSignature(final String value) {
        this._signature = value;
        return this;
    }
    
    public NsdBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    public NsdBuilder setVirtualLinkDesc(final Map<VirtualLinkDescKey, VirtualLinkDesc> values) {
        this._virtualLinkDesc = values;
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
      * @deprecated Use {#link #setVirtualLinkDesc(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setVirtualLinkDesc(final List<VirtualLinkDesc> values) {
        return setVirtualLinkDesc(CodeHelpers.compatMap(values));
    }
    public NsdBuilder setVnfdId(final List<String> values) {
        this._vnfdId = values;
        return this;
    }
    
    public NsdBuilder setVnffgd(final Map<VnffgdKey, Vnffgd> values) {
        this._vnffgd = values;
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
      * @deprecated Use {#link #setVnffgd(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setVnffgd(final List<Vnffgd> values) {
        return setVnffgd(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NsdBuilder addAugmentation(Augmentation<Nsd> augmentation) {
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
    public NsdBuilder addAugmentation(Class<? extends Augmentation<Nsd>> augmentationType, Augmentation<Nsd> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NsdBuilder removeAugmentation(Class<? extends Augmentation<Nsd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NsdBuilder doAddAugmentation(Class<? extends Augmentation<Nsd>> augmentationType, Augmentation<Nsd> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Nsd build() {
        return new NsdImpl(this);
    }

    public static final class NsdImpl
        extends AbstractAugmentable<Nsd>
        implements Nsd {
    
        private final String _algorithm;
        private final List<String> _autoscaleRule;
        private final String _certificate;
        private final String _designer;
        private Map<DfKey, Df> _df;
        @JsonProperty("id")
        private final String _id;
        @JsonProperty("_id")
        private final String _invariantId;
        private final Map<LifecycleManagementScriptKey, LifecycleManagementScript> _lifecycleManagementScript;
        @JsonProperty("name")
        private final String _name;
        private final List<String> _nestedNsdId;
        private final List<String> _pnfdId;
        private final Map<SapdKey, Sapd> _sapd;
        private final String _signature;
        @JsonProperty("version")
        private final String _version;
        private final Map<VirtualLinkDescKey, VirtualLinkDesc> _virtualLinkDesc;
        @JsonProperty("vnfd-id")
        private final List<String> _vnfdId;
        private final Map<VnffgdKey, Vnffgd> _vnffgd;
        private final NsdKey key;
    
        NsdImpl(NsdBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NsdKey(base.getId());
            }
            this._id = key.getId();
            this._algorithm = base.getAlgorithm();
            this._autoscaleRule = base.getAutoscaleRule();
            this._certificate = base.getCertificate();
            this._designer = base.getDesigner();
            this._df = CodeHelpers.emptyToNull(base.getDf());
            this._invariantId = base.getInvariantId();
            this._lifecycleManagementScript = CodeHelpers.emptyToNull(base.getLifecycleManagementScript());
            this._name = base.getName();
            this._nestedNsdId = base.getNestedNsdId();
            this._pnfdId = base.getPnfdId();
            this._sapd = CodeHelpers.emptyToNull(base.getSapd());
            this._signature = base.getSignature();
            this._version = base.getVersion();
            this._virtualLinkDesc = CodeHelpers.emptyToNull(base.getVirtualLinkDesc());
            this._vnfdId = base.getVnfdId();
            this._vnffgd = CodeHelpers.emptyToNull(base.getVnffgd());
        }

        public NsdImpl(){
        	this( new NsdBuilder() );
        }   
        
        @Override
        public NsdKey key() {
            return key;
        }
        
        @Override
        public String getAlgorithm() {
            return _algorithm;
        }
        
        @Override
        public List<String> getAutoscaleRule() {
            return _autoscaleRule;
        }
        
        @Override
        public String getCertificate() {
            return _certificate;
        }
        
        @Override
        public String getDesigner() {
            return _designer;
        }
        
        public Map<DfKey, Df> setDf(final List<Df> values) {
            return _df = CodeHelpers.compatMap(values) ;
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
        public String getInvariantId() {
            return _invariantId;
        }
        
        @Override
        public Map<LifecycleManagementScriptKey, LifecycleManagementScript> getLifecycleManagementScript() {
            return _lifecycleManagementScript;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public List<String> getNestedNsdId() {
            return _nestedNsdId;
        }
        
        @Override
        public List<String> getPnfdId() {
            return _pnfdId;
        }
        
        @Override
        public Map<SapdKey, Sapd> getSapd() {
            return _sapd;
        }
        
        @Override
        public String getSignature() {
            return _signature;
        }
        
        @Override
        public String getVersion() {
            return _version;
        }
        
        @Override
        public Map<VirtualLinkDescKey, VirtualLinkDesc> getVirtualLinkDesc() {
            return _virtualLinkDesc;
        }
        
        @Override
        public List<String> getVnfdId() {
            return _vnfdId;
        }
        
        @Override
        public Map<VnffgdKey, Vnffgd> getVnffgd() {
            return _vnffgd;
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
            result = prime * result + Objects.hashCode(_autoscaleRule);
            result = prime * result + Objects.hashCode(_certificate);
            result = prime * result + Objects.hashCode(_designer);
            result = prime * result + Objects.hashCode(_df);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_invariantId);
            result = prime * result + Objects.hashCode(_lifecycleManagementScript);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nestedNsdId);
            result = prime * result + Objects.hashCode(_pnfdId);
            result = prime * result + Objects.hashCode(_sapd);
            result = prime * result + Objects.hashCode(_signature);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_virtualLinkDesc);
            result = prime * result + Objects.hashCode(_vnfdId);
            result = prime * result + Objects.hashCode(_vnffgd);
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
            if (!Nsd.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Nsd other = (Nsd)obj;
            if (!Objects.equals(_algorithm, other.getAlgorithm())) {
                return false;
            }
            if (!Objects.equals(_autoscaleRule, other.getAutoscaleRule())) {
                return false;
            }
            if (!Objects.equals(_certificate, other.getCertificate())) {
                return false;
            }
            if (!Objects.equals(_designer, other.getDesigner())) {
                return false;
            }
            if (!Objects.equals(_df, other.getDf())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_invariantId, other.getInvariantId())) {
                return false;
            }
            if (!Objects.equals(_lifecycleManagementScript, other.getLifecycleManagementScript())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nestedNsdId, other.getNestedNsdId())) {
                return false;
            }
            if (!Objects.equals(_pnfdId, other.getPnfdId())) {
                return false;
            }
            if (!Objects.equals(_sapd, other.getSapd())) {
                return false;
            }
            if (!Objects.equals(_signature, other.getSignature())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_virtualLinkDesc, other.getVirtualLinkDesc())) {
                return false;
            }
            if (!Objects.equals(_vnfdId, other.getVnfdId())) {
                return false;
            }
            if (!Objects.equals(_vnffgd, other.getVnffgd())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsdImpl otherImpl = (NsdImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Nsd>>, Augmentation<Nsd>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nsd");
            CodeHelpers.appendValue(helper, "_algorithm", _algorithm);
            CodeHelpers.appendValue(helper, "_autoscaleRule", _autoscaleRule);
            CodeHelpers.appendValue(helper, "_certificate", _certificate);
            CodeHelpers.appendValue(helper, "_designer", _designer);
            CodeHelpers.appendValue(helper, "_df", _df);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_invariantId", _invariantId);
            CodeHelpers.appendValue(helper, "_lifecycleManagementScript", _lifecycleManagementScript);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nestedNsdId", _nestedNsdId);
            CodeHelpers.appendValue(helper, "_pnfdId", _pnfdId);
            CodeHelpers.appendValue(helper, "_sapd", _sapd);
            CodeHelpers.appendValue(helper, "_signature", _signature);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "_virtualLinkDesc", _virtualLinkDesc);
            CodeHelpers.appendValue(helper, "_vnfdId", _vnfdId);
            CodeHelpers.appendValue(helper, "_vnffgd", _vnffgd);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
