package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.pnfd.rev190425;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd.ExtCpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd.ExtCpdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd.Security;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd.SecurityKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule.SecurityGroupRule;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.security.group.rule.SecurityGroupRuleKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link PnfdBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     PnfdBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new PnfdBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of PnfdBuilder, as instances can be freely passed around without
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
 * @see PnfdBuilder
 * @see Builder
 *
 */
public class PnfdBuilder implements Builder<Pnfd> {

    private Map<ExtCpdKey, ExtCpd> _extCpd;
    private String _functionDescription;
    private String _geographicalLocationInfo;
    private String _id;
    private String _invariantId;
    private String _name;
    private String _provider;
    private Map<SecurityKey, Security> _security;
    private Map<SecurityGroupRuleKey, SecurityGroupRule> _securityGroupRule;
    private String _version;


    Map<Class<? extends Augmentation<Pnfd>>, Augmentation<Pnfd>> augmentation = Collections.emptyMap();

    public PnfdBuilder() {
    }
    public PnfdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd arg) {
        this._id = arg.getId();
        this._functionDescription = arg.getFunctionDescription();
        this._provider = arg.getProvider();
        this._version = arg.getVersion();
        this._invariantId = arg.getInvariantId();
        this._name = arg.getName();
        this._extCpd = arg.getExtCpd();
        this._security = arg.getSecurity();
        this._geographicalLocationInfo = arg.getGeographicalLocationInfo();
        this._securityGroupRule = arg.getSecurityGroupRule();
    }
    public PnfdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityGroupRule arg) {
        this._securityGroupRule = arg.getSecurityGroupRule();
    }

    public PnfdBuilder(Pnfd base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Pnfd>>, Augmentation<Pnfd>> aug =((AugmentationHolder<Pnfd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._extCpd = base.getExtCpd();
        this._functionDescription = base.getFunctionDescription();
        this._geographicalLocationInfo = base.getGeographicalLocationInfo();
        this._id = base.getId();
        this._invariantId = base.getInvariantId();
        this._name = base.getName();
        this._provider = base.getProvider();
        this._security = base.getSecurity();
        this._securityGroupRule = base.getSecurityGroupRule();
        this._version = base.getVersion();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityGroupRule</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd)arg).getId();
            this._functionDescription = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd)arg).getFunctionDescription();
            this._provider = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd)arg).getProvider();
            this._version = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd)arg).getVersion();
            this._invariantId = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd)arg).getInvariantId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd)arg).getName();
            this._extCpd = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd)arg).getExtCpd();
            this._security = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd)arg).getSecurity();
            this._geographicalLocationInfo = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd)arg).getGeographicalLocationInfo();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityGroupRule, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd]");
    }

    public Map<ExtCpdKey, ExtCpd> getExtCpd() {
        return _extCpd;
    }
    
    public String getFunctionDescription() {
        return _functionDescription;
    }
    
    public String getGeographicalLocationInfo() {
        return _geographicalLocationInfo;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getInvariantId() {
        return _invariantId;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getProvider() {
        return _provider;
    }
    
    public Map<SecurityKey, Security> getSecurity() {
        return _security;
    }
    
    public Map<SecurityGroupRuleKey, SecurityGroupRule> getSecurityGroupRule() {
        return _securityGroupRule;
    }
    
    public String getVersion() {
        return _version;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Pnfd>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public PnfdBuilder setExtCpd(final Map<ExtCpdKey, ExtCpd> values) {
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
    public PnfdBuilder setExtCpd(final List<ExtCpd> values) {
        return setExtCpd(CodeHelpers.compatMap(values));
    }
    
    public PnfdBuilder setFunctionDescription(final String value) {
        this._functionDescription = value;
        return this;
    }
    
    public PnfdBuilder setGeographicalLocationInfo(final String value) {
        this._geographicalLocationInfo = value;
        return this;
    }
    
    public PnfdBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public PnfdBuilder setInvariantId(final String value) {
        this._invariantId = value;
        return this;
    }
    
    public PnfdBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public PnfdBuilder setProvider(final String value) {
        this._provider = value;
        return this;
    }
    public PnfdBuilder setSecurity(final Map<SecurityKey, Security> values) {
        this._security = values;
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
      * @deprecated Use {#link #setSecurity(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public PnfdBuilder setSecurity(final List<Security> values) {
        return setSecurity(CodeHelpers.compatMap(values));
    }
    public PnfdBuilder setSecurityGroupRule(final Map<SecurityGroupRuleKey, SecurityGroupRule> values) {
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
    public PnfdBuilder setSecurityGroupRule(final List<SecurityGroupRule> values) {
        return setSecurityGroupRule(CodeHelpers.compatMap(values));
    }
    
    public PnfdBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public PnfdBuilder addAugmentation(Augmentation<Pnfd> augmentation) {
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
    public PnfdBuilder addAugmentation(Class<? extends Augmentation<Pnfd>> augmentationType, Augmentation<Pnfd> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public PnfdBuilder removeAugmentation(Class<? extends Augmentation<Pnfd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private PnfdBuilder doAddAugmentation(Class<? extends Augmentation<Pnfd>> augmentationType, Augmentation<Pnfd> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Pnfd build() {
        return new PnfdImpl(this);
    }

    private static final class PnfdImpl
        extends AbstractAugmentable<Pnfd>
        implements Pnfd {
    
        private final Map<ExtCpdKey, ExtCpd> _extCpd;
        private final String _functionDescription;
        private final String _geographicalLocationInfo;
        private final String _id;
        private final String _invariantId;
        private final String _name;
        private final String _provider;
        private final Map<SecurityKey, Security> _security;
        private final Map<SecurityGroupRuleKey, SecurityGroupRule> _securityGroupRule;
        private final String _version;
    
        PnfdImpl(PnfdBuilder base) {
            super(base.augmentation);
            this._extCpd = CodeHelpers.emptyToNull(base.getExtCpd());
            this._functionDescription = base.getFunctionDescription();
            this._geographicalLocationInfo = base.getGeographicalLocationInfo();
            this._id = base.getId();
            this._invariantId = base.getInvariantId();
            this._name = base.getName();
            this._provider = base.getProvider();
            this._security = CodeHelpers.emptyToNull(base.getSecurity());
            this._securityGroupRule = CodeHelpers.emptyToNull(base.getSecurityGroupRule());
            this._version = base.getVersion();
        }
    
        @Override
        public Map<ExtCpdKey, ExtCpd> getExtCpd() {
            return _extCpd;
        }
        
        @Override
        public String getFunctionDescription() {
            return _functionDescription;
        }
        
        @Override
        public String getGeographicalLocationInfo() {
            return _geographicalLocationInfo;
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
        public String getName() {
            return _name;
        }
        
        @Override
        public String getProvider() {
            return _provider;
        }
        
        @Override
        public Map<SecurityKey, Security> getSecurity() {
            return _security;
        }
        
        @Override
        public Map<SecurityGroupRuleKey, SecurityGroupRule> getSecurityGroupRule() {
            return _securityGroupRule;
        }
        
        @Override
        public String getVersion() {
            return _version;
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
            result = prime * result + Objects.hashCode(_extCpd);
            result = prime * result + Objects.hashCode(_functionDescription);
            result = prime * result + Objects.hashCode(_geographicalLocationInfo);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_invariantId);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_provider);
            result = prime * result + Objects.hashCode(_security);
            result = prime * result + Objects.hashCode(_securityGroupRule);
            result = prime * result + Objects.hashCode(_version);
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
            if (!Pnfd.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Pnfd other = (Pnfd)obj;
            if (!Objects.equals(_extCpd, other.getExtCpd())) {
                return false;
            }
            if (!Objects.equals(_functionDescription, other.getFunctionDescription())) {
                return false;
            }
            if (!Objects.equals(_geographicalLocationInfo, other.getGeographicalLocationInfo())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_invariantId, other.getInvariantId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_provider, other.getProvider())) {
                return false;
            }
            if (!Objects.equals(_security, other.getSecurity())) {
                return false;
            }
            if (!Objects.equals(_securityGroupRule, other.getSecurityGroupRule())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PnfdImpl otherImpl = (PnfdImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Pnfd>>, Augmentation<Pnfd>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Pnfd");
            CodeHelpers.appendValue(helper, "_extCpd", _extCpd);
            CodeHelpers.appendValue(helper, "_functionDescription", _functionDescription);
            CodeHelpers.appendValue(helper, "_geographicalLocationInfo", _geographicalLocationInfo);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_invariantId", _invariantId);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_provider", _provider);
            CodeHelpers.appendValue(helper, "_security", _security);
            CodeHelpers.appendValue(helper, "_securityGroupRule", _securityGroupRule);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
