package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule.SecurityGroupRule;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule.SecurityGroupRuleKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ConfigurableProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.DfKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ElementGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ElementGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ExtCpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ExtCpdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Indicator;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.IndicatorKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.IntVirtualLinkDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.IntVirtualLinkDescKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.LifecycleManagementScript;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.LifecycleManagementScriptKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ModifiableAttributes;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.SwImageDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.SwImageDescKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Vdu;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VduKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDescKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualStorageDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualStorageDescKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfdBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VnfdBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VnfdBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VnfdBuilder, as instances can be freely passed around without
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
 * @see VnfdBuilder
 * @see Builder
 *
 */
public class VnfdBuilder implements Builder<Vnfd> {

    private List<String> _autoScale;
    private ConfigurableProperties _configurableProperties;
    private String _defaultLocalizationLanguage;
    private Map<DfKey, Df> _df;
    private Map<ElementGroupKey, ElementGroup> _elementGroup;
    private Map<ExtCpdKey, ExtCpd> _extCpd;
    private String _id;
    private Map<IndicatorKey, Indicator> _indicator;
    private Map<IntVirtualLinkDescKey, IntVirtualLinkDesc> _intVirtualLinkDesc;
    private Map<LifecycleManagementScriptKey, LifecycleManagementScript> _lifecycleManagementScript;
    private String _localizationLanguage;
    private ModifiableAttributes _modifiableAttributes;
    private String _productInfoDescription;
    private String _productInfoName;
    private String _productName;
    private String _provider;
    private Map<SecurityGroupRuleKey, SecurityGroupRule> _securityGroupRule;
    private String _softwareVersion;
    private Map<SwImageDescKey, SwImageDesc> _swImageDesc;
    private Map<VduKey, Vdu> _vdu;
    private String _version;
    private Map<VirtualComputeDescKey, VirtualComputeDesc> _virtualComputeDesc;
    private Map<VirtualStorageDescKey, VirtualStorageDesc> _virtualStorageDesc;
    private List<String> _vnfmInfo;
    private VnfdKey key;


    Map<Class<? extends Augmentation<Vnfd>>, Augmentation<Vnfd>> augmentation = Collections.emptyMap();

    public VnfdBuilder() {
    }
    public VnfdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd arg) {
        this._id = arg.getId();
        this._provider = arg.getProvider();
        this._productName = arg.getProductName();
        this._softwareVersion = arg.getSoftwareVersion();
        this._version = arg.getVersion();
        this._productInfoName = arg.getProductInfoName();
        this._productInfoDescription = arg.getProductInfoDescription();
        this._vnfmInfo = arg.getVnfmInfo();
        this._localizationLanguage = arg.getLocalizationLanguage();
        this._defaultLocalizationLanguage = arg.getDefaultLocalizationLanguage();
        this._vdu = arg.getVdu();
        this._virtualComputeDesc = arg.getVirtualComputeDesc();
        this._virtualStorageDesc = arg.getVirtualStorageDesc();
        this._swImageDesc = arg.getSwImageDesc();
        this._intVirtualLinkDesc = arg.getIntVirtualLinkDesc();
        this._extCpd = arg.getExtCpd();
        this._df = arg.getDf();
        this._configurableProperties = arg.getConfigurableProperties();
        this._modifiableAttributes = arg.getModifiableAttributes();
        this._lifecycleManagementScript = arg.getLifecycleManagementScript();
        this._elementGroup = arg.getElementGroup();
        this._indicator = arg.getIndicator();
        this._autoScale = arg.getAutoScale();
        this._securityGroupRule = arg.getSecurityGroupRule();
    }
    public VnfdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityGroupRule arg) {
        this._securityGroupRule = arg.getSecurityGroupRule();
    }

    public VnfdBuilder(Vnfd base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vnfd>>, Augmentation<Vnfd>> aug =((AugmentationHolder<Vnfd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._autoScale = base.getAutoScale();
        this._configurableProperties = base.getConfigurableProperties();
        this._defaultLocalizationLanguage = base.getDefaultLocalizationLanguage();
        this._df = base.getDf();
        this._elementGroup = base.getElementGroup();
        this._extCpd = base.getExtCpd();
        this._indicator = base.getIndicator();
        this._intVirtualLinkDesc = base.getIntVirtualLinkDesc();
        this._lifecycleManagementScript = base.getLifecycleManagementScript();
        this._localizationLanguage = base.getLocalizationLanguage();
        this._modifiableAttributes = base.getModifiableAttributes();
        this._productInfoDescription = base.getProductInfoDescription();
        this._productInfoName = base.getProductInfoName();
        this._productName = base.getProductName();
        this._provider = base.getProvider();
        this._securityGroupRule = base.getSecurityGroupRule();
        this._softwareVersion = base.getSoftwareVersion();
        this._swImageDesc = base.getSwImageDesc();
        this._vdu = base.getVdu();
        this._version = base.getVersion();
        this._virtualComputeDesc = base.getVirtualComputeDesc();
        this._virtualStorageDesc = base.getVirtualStorageDesc();
        this._vnfmInfo = base.getVnfmInfo();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityGroupRule</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityGroupRule) {
            this._securityGroupRule = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityGroupRule)arg).getSecurityGroupRule();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getId();
            this._provider = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getProvider();
            this._productName = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getProductName();
            this._softwareVersion = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getSoftwareVersion();
            this._version = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getVersion();
            this._productInfoName = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getProductInfoName();
            this._productInfoDescription = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getProductInfoDescription();
            this._vnfmInfo = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getVnfmInfo();
            this._localizationLanguage = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getLocalizationLanguage();
            this._defaultLocalizationLanguage = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getDefaultLocalizationLanguage();
            this._vdu = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getVdu();
            this._virtualComputeDesc = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getVirtualComputeDesc();
            this._virtualStorageDesc = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getVirtualStorageDesc();
            this._swImageDesc = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getSwImageDesc();
            this._intVirtualLinkDesc = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getIntVirtualLinkDesc();
            this._extCpd = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getExtCpd();
            this._df = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getDf();
            this._configurableProperties = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getConfigurableProperties();
            this._modifiableAttributes = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getModifiableAttributes();
            this._lifecycleManagementScript = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getLifecycleManagementScript();
            this._elementGroup = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getElementGroup();
            this._indicator = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getIndicator();
            this._autoScale = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd)arg).getAutoScale();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityGroupRule, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd]");
    }

    public VnfdKey key() {
        return key;
    }
    
    public List<String> getAutoScale() {
        return _autoScale;
    }
    
    public ConfigurableProperties getConfigurableProperties() {
        return _configurableProperties;
    }
    
    public String getDefaultLocalizationLanguage() {
        return _defaultLocalizationLanguage;
    }
    
    public Map<DfKey, Df> getDf() {
        return _df;
    }
    
    public Map<ElementGroupKey, ElementGroup> getElementGroup() {
        return _elementGroup;
    }
    
    public Map<ExtCpdKey, ExtCpd> getExtCpd() {
        return _extCpd;
    }
    
    public String getId() {
        return _id;
    }
    
    public Map<IndicatorKey, Indicator> getIndicator() {
        return _indicator;
    }
    
    public Map<IntVirtualLinkDescKey, IntVirtualLinkDesc> getIntVirtualLinkDesc() {
        return _intVirtualLinkDesc;
    }
    
    public Map<LifecycleManagementScriptKey, LifecycleManagementScript> getLifecycleManagementScript() {
        return _lifecycleManagementScript;
    }
    
    public String getLocalizationLanguage() {
        return _localizationLanguage;
    }
    
    public ModifiableAttributes getModifiableAttributes() {
        return _modifiableAttributes;
    }
    
    public String getProductInfoDescription() {
        return _productInfoDescription;
    }
    
    public String getProductInfoName() {
        return _productInfoName;
    }
    
    public String getProductName() {
        return _productName;
    }
    
    public String getProvider() {
        return _provider;
    }
    
    public Map<SecurityGroupRuleKey, SecurityGroupRule> getSecurityGroupRule() {
        return _securityGroupRule;
    }
    
    public String getSoftwareVersion() {
        return _softwareVersion;
    }
    
    public Map<SwImageDescKey, SwImageDesc> getSwImageDesc() {
        return _swImageDesc;
    }
    
    public Map<VduKey, Vdu> getVdu() {
        return _vdu;
    }
    
    public String getVersion() {
        return _version;
    }
    
    public Map<VirtualComputeDescKey, VirtualComputeDesc> getVirtualComputeDesc() {
        return _virtualComputeDesc;
    }
    
    public Map<VirtualStorageDescKey, VirtualStorageDesc> getVirtualStorageDesc() {
        return _virtualStorageDesc;
    }
    
    public List<String> getVnfmInfo() {
        return _vnfmInfo;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Vnfd>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VnfdBuilder withKey(final VnfdKey key) {
        this.key = key;
        return this;
    }
    public VnfdBuilder setAutoScale(final List<String> values) {
        this._autoScale = values;
        return this;
    }
    
    
    public VnfdBuilder setConfigurableProperties(final ConfigurableProperties value) {
        this._configurableProperties = value;
        return this;
    }
    
    public VnfdBuilder setDefaultLocalizationLanguage(final String value) {
        this._defaultLocalizationLanguage = value;
        return this;
    }
    public VnfdBuilder setDf(final Map<DfKey, Df> values) {
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
    public VnfdBuilder setDf(final List<Df> values) {
        return setDf(CodeHelpers.compatMap(values));
    }
    public VnfdBuilder setElementGroup(final Map<ElementGroupKey, ElementGroup> values) {
        this._elementGroup = values;
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
      * @deprecated Use {#link #setElementGroup(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfdBuilder setElementGroup(final List<ElementGroup> values) {
        return setElementGroup(CodeHelpers.compatMap(values));
    }
    public VnfdBuilder setExtCpd(final Map<ExtCpdKey, ExtCpd> values) {
        this._extCpd = values;
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
      * @deprecated Use {#link #setExtCpd(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfdBuilder setExtCpd(final List<ExtCpd> values) {
        return setExtCpd(CodeHelpers.compatMap(values));
    }
    
    public VnfdBuilder setIndicator(final Map<IndicatorKey, Indicator> values) {
        this._indicator = values;
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
      * @deprecated Use {#link #setIndicator(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfdBuilder setIndicator(final List<Indicator> values) {
        return setIndicator(CodeHelpers.compatMap(values));
    }
    public VnfdBuilder setIntVirtualLinkDesc(final Map<IntVirtualLinkDescKey, IntVirtualLinkDesc> values) {
        this._intVirtualLinkDesc = values;
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
      * @deprecated Use {#link #setIntVirtualLinkDesc(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfdBuilder setIntVirtualLinkDesc(final List<IntVirtualLinkDesc> values) {
        return setIntVirtualLinkDesc(CodeHelpers.compatMap(values));
    }
    public VnfdBuilder setLifecycleManagementScript(final Map<LifecycleManagementScriptKey, LifecycleManagementScript> values) {
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
    public VnfdBuilder setLifecycleManagementScript(final List<LifecycleManagementScript> values) {
        return setLifecycleManagementScript(CodeHelpers.compatMap(values));
    }
    
    public VnfdBuilder setLocalizationLanguage(final String value) {
        this._localizationLanguage = value;
        return this;
    }
    
    public VnfdBuilder setModifiableAttributes(final ModifiableAttributes value) {
        this._modifiableAttributes = value;
        return this;
    }
    
    public VnfdBuilder setProductInfoDescription(final String value) {
        this._productInfoDescription = value;
        return this;
    }
    
    public VnfdBuilder setProductInfoName(final String value) {
        this._productInfoName = value;
        return this;
    }
    
    public VnfdBuilder setProductName(final String value) {
        this._productName = value;
        return this;
    }
    
    public VnfdBuilder setProvider(final String value) {
        this._provider = value;
        return this;
    }
    public VnfdBuilder setSecurityGroupRule(final Map<SecurityGroupRuleKey, SecurityGroupRule> values) {
        this._securityGroupRule = values;
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
      * @deprecated Use {#link #setSecurityGroupRule(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfdBuilder setSecurityGroupRule(final List<SecurityGroupRule> values) {
        return setSecurityGroupRule(CodeHelpers.compatMap(values));
    }
    
    public VnfdBuilder setSoftwareVersion(final String value) {
        this._softwareVersion = value;
        return this;
    }
    public VnfdBuilder setSwImageDesc(final Map<SwImageDescKey, SwImageDesc> values) {
        this._swImageDesc = values;
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
      * @deprecated Use {#link #setSwImageDesc(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfdBuilder setSwImageDesc(final List<SwImageDesc> values) {
        return setSwImageDesc(CodeHelpers.compatMap(values));
    }
    @JsonSetter("vdu")    
    public VnfdBuilder setVdu(final Map<VduKey, Vdu> values) {
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
    public VnfdBuilder setVdu(final List<Vdu> values) {
        return setVdu(CodeHelpers.compatMap(values));
    }
    
    public VnfdBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    @JsonSetter("virtual-compute-desc")    
    public VnfdBuilder setVirtualComputeDesc(final Map<VirtualComputeDescKey, VirtualComputeDesc> values) {
        this._virtualComputeDesc = values;
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
      * @deprecated Use {#link #setVirtualComputeDesc(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfdBuilder setVirtualComputeDesc(final List<VirtualComputeDesc> values) {
        return setVirtualComputeDesc(CodeHelpers.compatMap(values));
    }

    public VnfdBuilder setVirtualStorageDesc(final Map<VirtualStorageDescKey, VirtualStorageDesc> values) {
        this._virtualStorageDesc = values;
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
      * @deprecated Use {#link #setVirtualStorageDesc(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfdBuilder setVirtualStorageDesc(final List<VirtualStorageDesc> values) {
        return setVirtualStorageDesc(CodeHelpers.compatMap(values));
    }
    public VnfdBuilder setVnfmInfo(final List<String> values) {
        this._vnfmInfo = values;
        return this;
    }
    
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VnfdBuilder addAugmentation(Augmentation<Vnfd> augmentation) {
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
    public VnfdBuilder addAugmentation(Class<? extends Augmentation<Vnfd>> augmentationType, Augmentation<Vnfd> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VnfdBuilder removeAugmentation(Class<? extends Augmentation<Vnfd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VnfdBuilder doAddAugmentation(Class<? extends Augmentation<Vnfd>> augmentationType, Augmentation<Vnfd> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Vnfd build() {
        return new VnfdImpl(this);
    }

    public static final class VnfdImpl
        extends AbstractAugmentable<Vnfd>
        implements Vnfd {
    
        private final List<String> _autoScale;
        private final ConfigurableProperties _configurableProperties;
        private final String _defaultLocalizationLanguage;
        private Map<DfKey, Df> _df;
        private final Map<ElementGroupKey, ElementGroup> _elementGroup;
        private final Map<ExtCpdKey, ExtCpd> _extCpd;
        @JsonProperty("_id")
        private final String _id;
        private final Map<IndicatorKey, Indicator> _indicator;
        private final Map<IntVirtualLinkDescKey, IntVirtualLinkDesc> _intVirtualLinkDesc;
        private final Map<LifecycleManagementScriptKey, LifecycleManagementScript> _lifecycleManagementScript;
        private final String _localizationLanguage;
        private final ModifiableAttributes _modifiableAttributes;
        @JsonProperty("product-info-description")
        private final String _productInfoDescription;
        private final String _productInfoName;
        @JsonProperty("product-name")
        private final String _productName;
        @JsonProperty("provider")
        private final String _provider;
        private final Map<SecurityGroupRuleKey, SecurityGroupRule> _securityGroupRule;
        private final String _softwareVersion;
        private final Map<SwImageDescKey, SwImageDesc> _swImageDesc;
        @JsonProperty("vdu")
        private Map<VduKey, Vdu> _vdu;
        @JsonProperty("version")
        private final String _version;
        @JsonProperty("virtual-compute-desc")
        private Map<VirtualComputeDescKey, VirtualComputeDesc> _virtualComputeDesc;
        @JsonProperty("virtual-storage-desc")
        private Map<VirtualStorageDescKey, VirtualStorageDesc> _virtualStorageDesc;
        private final List<String> _vnfmInfo;
        private final VnfdKey key;
    
        VnfdImpl(VnfdBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfdKey(base.getId());
            }
            this._id = key.getId();
            this._autoScale = base.getAutoScale();
            this._configurableProperties = base.getConfigurableProperties();
            this._defaultLocalizationLanguage = base.getDefaultLocalizationLanguage();
            this._df = CodeHelpers.emptyToNull(base.getDf());
            this._elementGroup = CodeHelpers.emptyToNull(base.getElementGroup());
            this._extCpd = CodeHelpers.emptyToNull(base.getExtCpd());
            this._indicator = CodeHelpers.emptyToNull(base.getIndicator());
            this._intVirtualLinkDesc = CodeHelpers.emptyToNull(base.getIntVirtualLinkDesc());
            this._lifecycleManagementScript = CodeHelpers.emptyToNull(base.getLifecycleManagementScript());
            this._localizationLanguage = base.getLocalizationLanguage();
            this._modifiableAttributes = base.getModifiableAttributes();
            this._productInfoDescription = base.getProductInfoDescription();
            this._productInfoName = base.getProductInfoName();
            this._productName = base.getProductName();
            this._provider = base.getProvider();
            this._securityGroupRule = CodeHelpers.emptyToNull(base.getSecurityGroupRule());
            this._softwareVersion = base.getSoftwareVersion();
            this._swImageDesc = CodeHelpers.emptyToNull(base.getSwImageDesc());
            this._vdu = CodeHelpers.emptyToNull(base.getVdu());
            this._version = base.getVersion();
            this._virtualComputeDesc = CodeHelpers.emptyToNull(base.getVirtualComputeDesc());
            this._virtualStorageDesc = CodeHelpers.emptyToNull(base.getVirtualStorageDesc());
            this._vnfmInfo = base.getVnfmInfo();
        }
    
        public VnfdImpl(){
        	this( new VnfdBuilder() );
        }   
        
        @Override
        public VnfdKey key() {
            return key;
        }
        
        @Override
        public List<String> getAutoScale() {
            return _autoScale;
        }
        
        @Override
        public ConfigurableProperties getConfigurableProperties() {
            return _configurableProperties;
        }
        
        @Override
        public String getDefaultLocalizationLanguage() {
            return _defaultLocalizationLanguage;
        }

        public Map<DfKey, Df> setDf(final List<Df> values) {
            return _df = CodeHelpers.compatMap(values) ;
        }
        
        @Override
        public Map<DfKey, Df> getDf() {
            return _df;
        }
        
        @Override
        public Map<ElementGroupKey, ElementGroup> getElementGroup() {
            return _elementGroup;
        }
        
        @Override
        public Map<ExtCpdKey, ExtCpd> getExtCpd() {
            return _extCpd;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Map<IndicatorKey, Indicator> getIndicator() {
            return _indicator;
        }
        
        @Override
        public Map<IntVirtualLinkDescKey, IntVirtualLinkDesc> getIntVirtualLinkDesc() {
            return _intVirtualLinkDesc;
        }
        
        @Override
        public Map<LifecycleManagementScriptKey, LifecycleManagementScript> getLifecycleManagementScript() {
            return _lifecycleManagementScript;
        }
        
        @Override
        public String getLocalizationLanguage() {
            return _localizationLanguage;
        }
        
        @Override
        public ModifiableAttributes getModifiableAttributes() {
            return _modifiableAttributes;
        }
        
        @Override
        public String getProductInfoDescription() {
            return _productInfoDescription;
        }
        
        @Override
        public String getProductInfoName() {
            return _productInfoName;
        }
        
        @Override
        public String getProductName() {
            return _productName;
        }
        
        @Override
        public String getProvider() {
            return _provider;
        }
        
        @Override
        public Map<SecurityGroupRuleKey, SecurityGroupRule> getSecurityGroupRule() {
            return _securityGroupRule;
        }
        
        @Override
        public String getSoftwareVersion() {
            return _softwareVersion;
        }
        
        @Override
        public Map<SwImageDescKey, SwImageDesc> getSwImageDesc() {
            return _swImageDesc;
        }
        
        public Map<VduKey, Vdu> setVdu(final List<Vdu> values) {
            return _vdu = CodeHelpers.compatMap(values) ;
        }
        
        @Override
        public Map<VduKey, Vdu> getVdu() {
            return _vdu;
        }
        
        @Override
        public String getVersion() {
            return _version;
        }
        
        @Override
        public Map<VirtualComputeDescKey, VirtualComputeDesc> getVirtualComputeDesc() {
            return _virtualComputeDesc;
        }

        @JsonSetter("virtual-compute-desc")
        public Map<VirtualComputeDescKey, VirtualComputeDesc> setVirtualComputeDesc(final List<VirtualComputeDesc> values) {
            return _virtualComputeDesc = CodeHelpers.compatMap(values) ;
        }        
        
        @Override
        public Map<VirtualStorageDescKey, VirtualStorageDesc> getVirtualStorageDesc() {
            return _virtualStorageDesc;
        }

        @JsonSetter("virtual-storage-desc")
        public Map<VirtualStorageDescKey, VirtualStorageDesc> setVirtualStorageDesc(final List<VirtualStorageDesc> values) {
            return _virtualStorageDesc = CodeHelpers.compatMap(values) ;
        }        
                
        @Override
        public List<String> getVnfmInfo() {
            return _vnfmInfo;
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
            result = prime * result + Objects.hashCode(_autoScale);
            result = prime * result + Objects.hashCode(_configurableProperties);
            result = prime * result + Objects.hashCode(_defaultLocalizationLanguage);
            result = prime * result + Objects.hashCode(_df);
            result = prime * result + Objects.hashCode(_elementGroup);
            result = prime * result + Objects.hashCode(_extCpd);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_indicator);
            result = prime * result + Objects.hashCode(_intVirtualLinkDesc);
            result = prime * result + Objects.hashCode(_lifecycleManagementScript);
            result = prime * result + Objects.hashCode(_localizationLanguage);
            result = prime * result + Objects.hashCode(_modifiableAttributes);
            result = prime * result + Objects.hashCode(_productInfoDescription);
            result = prime * result + Objects.hashCode(_productInfoName);
            result = prime * result + Objects.hashCode(_productName);
            result = prime * result + Objects.hashCode(_provider);
            result = prime * result + Objects.hashCode(_securityGroupRule);
            result = prime * result + Objects.hashCode(_softwareVersion);
            result = prime * result + Objects.hashCode(_swImageDesc);
            result = prime * result + Objects.hashCode(_vdu);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_virtualComputeDesc);
            result = prime * result + Objects.hashCode(_virtualStorageDesc);
            result = prime * result + Objects.hashCode(_vnfmInfo);
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
            if (!Vnfd.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Vnfd other = (Vnfd)obj;
            if (!Objects.equals(_autoScale, other.getAutoScale())) {
                return false;
            }
            if (!Objects.equals(_configurableProperties, other.getConfigurableProperties())) {
                return false;
            }
            if (!Objects.equals(_defaultLocalizationLanguage, other.getDefaultLocalizationLanguage())) {
                return false;
            }
            if (!Objects.equals(_df, other.getDf())) {
                return false;
            }
            if (!Objects.equals(_elementGroup, other.getElementGroup())) {
                return false;
            }
            if (!Objects.equals(_extCpd, other.getExtCpd())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_indicator, other.getIndicator())) {
                return false;
            }
            if (!Objects.equals(_intVirtualLinkDesc, other.getIntVirtualLinkDesc())) {
                return false;
            }
            if (!Objects.equals(_lifecycleManagementScript, other.getLifecycleManagementScript())) {
                return false;
            }
            if (!Objects.equals(_localizationLanguage, other.getLocalizationLanguage())) {
                return false;
            }
            if (!Objects.equals(_modifiableAttributes, other.getModifiableAttributes())) {
                return false;
            }
            if (!Objects.equals(_productInfoDescription, other.getProductInfoDescription())) {
                return false;
            }
            if (!Objects.equals(_productInfoName, other.getProductInfoName())) {
                return false;
            }
            if (!Objects.equals(_productName, other.getProductName())) {
                return false;
            }
            if (!Objects.equals(_provider, other.getProvider())) {
                return false;
            }
            if (!Objects.equals(_securityGroupRule, other.getSecurityGroupRule())) {
                return false;
            }
            if (!Objects.equals(_softwareVersion, other.getSoftwareVersion())) {
                return false;
            }
            if (!Objects.equals(_swImageDesc, other.getSwImageDesc())) {
                return false;
            }
            if (!Objects.equals(_vdu, other.getVdu())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_virtualComputeDesc, other.getVirtualComputeDesc())) {
                return false;
            }
            if (!Objects.equals(_virtualStorageDesc, other.getVirtualStorageDesc())) {
                return false;
            }
            if (!Objects.equals(_vnfmInfo, other.getVnfmInfo())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdImpl otherImpl = (VnfdImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vnfd>>, Augmentation<Vnfd>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vnfd");
            CodeHelpers.appendValue(helper, "_autoScale", _autoScale);
            CodeHelpers.appendValue(helper, "_configurableProperties", _configurableProperties);
            CodeHelpers.appendValue(helper, "_defaultLocalizationLanguage", _defaultLocalizationLanguage);
            CodeHelpers.appendValue(helper, "_df", _df);
            CodeHelpers.appendValue(helper, "_elementGroup", _elementGroup);
            CodeHelpers.appendValue(helper, "_extCpd", _extCpd);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_indicator", _indicator);
            CodeHelpers.appendValue(helper, "_intVirtualLinkDesc", _intVirtualLinkDesc);
            CodeHelpers.appendValue(helper, "_lifecycleManagementScript", _lifecycleManagementScript);
            CodeHelpers.appendValue(helper, "_localizationLanguage", _localizationLanguage);
            CodeHelpers.appendValue(helper, "_modifiableAttributes", _modifiableAttributes);
            CodeHelpers.appendValue(helper, "_productInfoDescription", _productInfoDescription);
            CodeHelpers.appendValue(helper, "_productInfoName", _productInfoName);
            CodeHelpers.appendValue(helper, "_productName", _productName);
            CodeHelpers.appendValue(helper, "_provider", _provider);
            CodeHelpers.appendValue(helper, "_securityGroupRule", _securityGroupRule);
            CodeHelpers.appendValue(helper, "_softwareVersion", _softwareVersion);
            CodeHelpers.appendValue(helper, "_swImageDesc", _swImageDesc);
            CodeHelpers.appendValue(helper, "_vdu", _vdu);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "_virtualComputeDesc", _virtualComputeDesc);
            CodeHelpers.appendValue(helper, "_virtualStorageDesc", _virtualStorageDesc);
            CodeHelpers.appendValue(helper, "_vnfmInfo", _vnfmInfo);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
