package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.CpRole;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LayerProtocol;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.Protocol;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.ProtocolKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.VirtualNetworkInterfaceRequirement;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.VirtualNetworkInterfaceRequirementKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link IntCpdBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     IntCpdBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new IntCpdBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of IntCpdBuilder, as instances can be freely passed around without
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
 * @see IntCpdBuilder
 * @see Builder
 *
 */
public class IntCpdBuilder implements Builder<IntCpd> {

    private Uint64 _bitrateRequirement;
    private String _description;
    private String _id;
    private String _intVirtualLinkDesc;
    private List<Class<? extends LayerProtocol>> _layerProtocol;
    private String _nicioRequirements;
    private List<Uint32> _order;
    private Map<ProtocolKey, Protocol> _protocol;
    private Class<? extends CpRole> _role;
    private String _securityGroupRuleId;
    private Map<VirtualNetworkInterfaceRequirementKey, VirtualNetworkInterfaceRequirement> _virtualNetworkInterfaceRequirement;
    private Boolean _trunkMode;
    private IntCpdKey key;


    Map<Class<? extends Augmentation<IntCpd>>, Augmentation<IntCpd>> augmentation = Collections.emptyMap();

    public IntCpdBuilder() {
    }
    public IntCpdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.VirtualNetworkInterfaceRequirements arg) {
        this._virtualNetworkInterfaceRequirement = arg.getVirtualNetworkInterfaceRequirement();
    }
    public IntCpdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd arg) {
        this._id = arg.getId();
        this._layerProtocol = arg.getLayerProtocol();
        this._role = arg.getRole();
        this._description = arg.getDescription();
        this._protocol = arg.getProtocol();
        this._trunkMode = arg.isTrunkMode();
    }

    public IntCpdBuilder(IntCpd base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<IntCpd>>, Augmentation<IntCpd>> aug =((AugmentationHolder<IntCpd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._bitrateRequirement = base.getBitrateRequirement();
        this._description = base.getDescription();
        this._intVirtualLinkDesc = base.getIntVirtualLinkDesc();
        this._layerProtocol = base.getLayerProtocol();
        this._nicioRequirements = base.getNicioRequirements();
        this._order = base.getOrder();
        this._protocol = base.getProtocol();
        this._role = base.getRole();
        this._securityGroupRuleId = base.getSecurityGroupRuleId();
        this._virtualNetworkInterfaceRequirement = base.getVirtualNetworkInterfaceRequirement();
        this._trunkMode = base.isTrunkMode();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.VirtualNetworkInterfaceRequirements</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.VirtualNetworkInterfaceRequirements) {
            this._virtualNetworkInterfaceRequirement = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.VirtualNetworkInterfaceRequirements)arg).getVirtualNetworkInterfaceRequirement();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd)arg).getId();
            this._layerProtocol = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd)arg).getLayerProtocol();
            this._role = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd)arg).getRole();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd)arg).getDescription();
            this._protocol = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd)arg).getProtocol();
            this._trunkMode = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd)arg).isTrunkMode();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.VirtualNetworkInterfaceRequirements, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd]");
    }

    public IntCpdKey key() {
        return key;
    }
    
    public Uint64 getBitrateRequirement() {
        return _bitrateRequirement;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getIntVirtualLinkDesc() {
        return _intVirtualLinkDesc;
    }
    
    public List<Class<? extends LayerProtocol>> getLayerProtocol() {
        return _layerProtocol;
    }
    
    public String getNicioRequirements() {
        return _nicioRequirements;
    }
    
    public List<Uint32> getOrder() {
        return _order;
    }
    
    public Map<ProtocolKey, Protocol> getProtocol() {
        return _protocol;
    }
    
    public Class<? extends CpRole> getRole() {
        return _role;
    }
    
    public String getSecurityGroupRuleId() {
        return _securityGroupRuleId;
    }
    
    public Map<VirtualNetworkInterfaceRequirementKey, VirtualNetworkInterfaceRequirement> getVirtualNetworkInterfaceRequirement() {
        return _virtualNetworkInterfaceRequirement;
    }
    
    public Boolean isTrunkMode() {
        return _trunkMode;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<IntCpd>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public IntCpdBuilder withKey(final IntCpdKey key) {
        this.key = key;
        return this;
    }
    
    public IntCpdBuilder setBitrateRequirement(final Uint64 value) {
        this._bitrateRequirement = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setBitrateRequirement(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public IntCpdBuilder setBitrateRequirement(final BigInteger value) {
        return setBitrateRequirement(CodeHelpers.compatUint(value));
    }
    
    public IntCpdBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public IntCpdBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public IntCpdBuilder setIntVirtualLinkDesc(final String value) {
        this._intVirtualLinkDesc = value;
        return this;
    }
    public IntCpdBuilder setLayerProtocol(final List<Class<? extends LayerProtocol>> values) {
        this._layerProtocol = values;
        return this;
    }
    
    
    public IntCpdBuilder setNicioRequirements(final String value) {
        this._nicioRequirements = value;
        return this;
    }
    public IntCpdBuilder setOrder(final List<Uint32> values) {
        this._order = values;
        return this;
    }
    
    public IntCpdBuilder setProtocol(final Map<ProtocolKey, Protocol> values) {
        this._protocol = values;
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
      * @deprecated Use {#link #setProtocol(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public IntCpdBuilder setProtocol(final List<Protocol> values) {
        return setProtocol(CodeHelpers.compatMap(values));
    }
    
    public IntCpdBuilder setRole(final Class<? extends CpRole> value) {
        this._role = value;
        return this;
    }
    
    public IntCpdBuilder setSecurityGroupRuleId(final String value) {
        this._securityGroupRuleId = value;
        return this;
    }
    public IntCpdBuilder setVirtualNetworkInterfaceRequirement(final Map<VirtualNetworkInterfaceRequirementKey, VirtualNetworkInterfaceRequirement> values) {
        this._virtualNetworkInterfaceRequirement = values;
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
      * @deprecated Use {#link #setVirtualNetworkInterfaceRequirement(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public IntCpdBuilder setVirtualNetworkInterfaceRequirement(final List<VirtualNetworkInterfaceRequirement> values) {
        return setVirtualNetworkInterfaceRequirement(CodeHelpers.compatMap(values));
    }
    
    public IntCpdBuilder setTrunkMode(final Boolean value) {
        this._trunkMode = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public IntCpdBuilder addAugmentation(Augmentation<IntCpd> augmentation) {
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
    public IntCpdBuilder addAugmentation(Class<? extends Augmentation<IntCpd>> augmentationType, Augmentation<IntCpd> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public IntCpdBuilder removeAugmentation(Class<? extends Augmentation<IntCpd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private IntCpdBuilder doAddAugmentation(Class<? extends Augmentation<IntCpd>> augmentationType, Augmentation<IntCpd> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public IntCpd build() {
        return new IntCpdImpl(this);
    }

    private static final class IntCpdImpl
        extends AbstractAugmentable<IntCpd>
        implements IntCpd {
    
        private final Uint64 _bitrateRequirement;
        private final String _description;
        private final String _id;
        private final String _intVirtualLinkDesc;
        private final List<Class<? extends LayerProtocol>> _layerProtocol;
        private final String _nicioRequirements;
        private final List<Uint32> _order;
        private final Map<ProtocolKey, Protocol> _protocol;
        private final Class<? extends CpRole> _role;
        private final String _securityGroupRuleId;
        private final Map<VirtualNetworkInterfaceRequirementKey, VirtualNetworkInterfaceRequirement> _virtualNetworkInterfaceRequirement;
        private final Boolean _trunkMode;
        private final IntCpdKey key;
    
        IntCpdImpl(IntCpdBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new IntCpdKey(base.getId());
            }
            this._id = key.getId();
            this._bitrateRequirement = base.getBitrateRequirement();
            this._description = base.getDescription();
            this._intVirtualLinkDesc = base.getIntVirtualLinkDesc();
            this._layerProtocol = base.getLayerProtocol();
            this._nicioRequirements = base.getNicioRequirements();
            this._order = base.getOrder();
            this._protocol = CodeHelpers.emptyToNull(base.getProtocol());
            this._role = base.getRole();
            this._securityGroupRuleId = base.getSecurityGroupRuleId();
            this._virtualNetworkInterfaceRequirement = CodeHelpers.emptyToNull(base.getVirtualNetworkInterfaceRequirement());
            this._trunkMode = base.isTrunkMode();
        }
    
        @Override
        public IntCpdKey key() {
            return key;
        }
        
        @Override
        public Uint64 getBitrateRequirement() {
            return _bitrateRequirement;
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
        public String getIntVirtualLinkDesc() {
            return _intVirtualLinkDesc;
        }
        
        @Override
        public List<Class<? extends LayerProtocol>> getLayerProtocol() {
            return _layerProtocol;
        }
        
        @Override
        public String getNicioRequirements() {
            return _nicioRequirements;
        }
        
        @Override
        public List<Uint32> getOrder() {
            return _order;
        }
        
        @Override
        public Map<ProtocolKey, Protocol> getProtocol() {
            return _protocol;
        }
        
        @Override
        public Class<? extends CpRole> getRole() {
            return _role;
        }
        
        @Override
        public String getSecurityGroupRuleId() {
            return _securityGroupRuleId;
        }
        
        @Override
        public Map<VirtualNetworkInterfaceRequirementKey, VirtualNetworkInterfaceRequirement> getVirtualNetworkInterfaceRequirement() {
            return _virtualNetworkInterfaceRequirement;
        }
        
        @Override
        public Boolean isTrunkMode() {
            return _trunkMode;
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
            result = prime * result + Objects.hashCode(_bitrateRequirement);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_intVirtualLinkDesc);
            result = prime * result + Objects.hashCode(_layerProtocol);
            result = prime * result + Objects.hashCode(_nicioRequirements);
            result = prime * result + Objects.hashCode(_order);
            result = prime * result + Objects.hashCode(_protocol);
            result = prime * result + Objects.hashCode(_role);
            result = prime * result + Objects.hashCode(_securityGroupRuleId);
            result = prime * result + Objects.hashCode(_virtualNetworkInterfaceRequirement);
            result = prime * result + Objects.hashCode(_trunkMode);
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
            if (!IntCpd.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            IntCpd other = (IntCpd)obj;
            if (!Objects.equals(_bitrateRequirement, other.getBitrateRequirement())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_intVirtualLinkDesc, other.getIntVirtualLinkDesc())) {
                return false;
            }
            if (!Objects.equals(_layerProtocol, other.getLayerProtocol())) {
                return false;
            }
            if (!Objects.equals(_nicioRequirements, other.getNicioRequirements())) {
                return false;
            }
            if (!Objects.equals(_order, other.getOrder())) {
                return false;
            }
            if (!Objects.equals(_protocol, other.getProtocol())) {
                return false;
            }
            if (!Objects.equals(_role, other.getRole())) {
                return false;
            }
            if (!Objects.equals(_securityGroupRuleId, other.getSecurityGroupRuleId())) {
                return false;
            }
            if (!Objects.equals(_virtualNetworkInterfaceRequirement, other.getVirtualNetworkInterfaceRequirement())) {
                return false;
            }
            if (!Objects.equals(_trunkMode, other.isTrunkMode())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IntCpdImpl otherImpl = (IntCpdImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<IntCpd>>, Augmentation<IntCpd>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("IntCpd");
            CodeHelpers.appendValue(helper, "_bitrateRequirement", _bitrateRequirement);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_intVirtualLinkDesc", _intVirtualLinkDesc);
            CodeHelpers.appendValue(helper, "_layerProtocol", _layerProtocol);
            CodeHelpers.appendValue(helper, "_nicioRequirements", _nicioRequirements);
            CodeHelpers.appendValue(helper, "_order", _order);
            CodeHelpers.appendValue(helper, "_protocol", _protocol);
            CodeHelpers.appendValue(helper, "_role", _role);
            CodeHelpers.appendValue(helper, "_securityGroupRuleId", _securityGroupRuleId);
            CodeHelpers.appendValue(helper, "_virtualNetworkInterfaceRequirement", _virtualNetworkInterfaceRequirement);
            CodeHelpers.appendValue(helper, "_trunkMode", _trunkMode);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
