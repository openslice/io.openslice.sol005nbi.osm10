package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.virtual.network._interface.requirement.NetworkInterfaceRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.virtual.network._interface.requirement.NetworkInterfaceRequirementsKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VirtualNetworkInterfaceRequirementBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualNetworkInterfaceRequirementBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualNetworkInterfaceRequirementBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualNetworkInterfaceRequirementBuilder, as instances can be freely passed around without
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
 * @see VirtualNetworkInterfaceRequirementBuilder
 * @see Builder
 *
 */
public class VirtualNetworkInterfaceRequirementBuilder implements Builder<VirtualNetworkInterfaceRequirement> {

    private String _description;
    private String _name;
    private Map<NetworkInterfaceRequirementsKey, NetworkInterfaceRequirements> _networkInterfaceRequirements;
    private Boolean _supportMandatory;
    private VirtualNetworkInterfaceRequirementKey key;


    Map<Class<? extends Augmentation<VirtualNetworkInterfaceRequirement>>, Augmentation<VirtualNetworkInterfaceRequirement>> augmentation = Collections.emptyMap();

    public VirtualNetworkInterfaceRequirementBuilder() {
    }

    public VirtualNetworkInterfaceRequirementBuilder(VirtualNetworkInterfaceRequirement base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VirtualNetworkInterfaceRequirement>>, Augmentation<VirtualNetworkInterfaceRequirement>> aug =((AugmentationHolder<VirtualNetworkInterfaceRequirement>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._description = base.getDescription();
        this._networkInterfaceRequirements = base.getNetworkInterfaceRequirements();
        this._supportMandatory = base.isSupportMandatory();
    }


    public VirtualNetworkInterfaceRequirementKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getName() {
        return _name;
    }
    
    public Map<NetworkInterfaceRequirementsKey, NetworkInterfaceRequirements> getNetworkInterfaceRequirements() {
        return _networkInterfaceRequirements;
    }
    
    public Boolean isSupportMandatory() {
        return _supportMandatory;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VirtualNetworkInterfaceRequirement>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VirtualNetworkInterfaceRequirementBuilder withKey(final VirtualNetworkInterfaceRequirementKey key) {
        this.key = key;
        return this;
    }
    
    public VirtualNetworkInterfaceRequirementBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public VirtualNetworkInterfaceRequirementBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public VirtualNetworkInterfaceRequirementBuilder setNetworkInterfaceRequirements(final Map<NetworkInterfaceRequirementsKey, NetworkInterfaceRequirements> values) {
        this._networkInterfaceRequirements = values;
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
      * @deprecated Use {#link #setNetworkInterfaceRequirements(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VirtualNetworkInterfaceRequirementBuilder setNetworkInterfaceRequirements(final List<NetworkInterfaceRequirements> values) {
        return setNetworkInterfaceRequirements(CodeHelpers.compatMap(values));
    }
    
    public VirtualNetworkInterfaceRequirementBuilder setSupportMandatory(final Boolean value) {
        this._supportMandatory = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VirtualNetworkInterfaceRequirementBuilder addAugmentation(Augmentation<VirtualNetworkInterfaceRequirement> augmentation) {
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
    public VirtualNetworkInterfaceRequirementBuilder addAugmentation(Class<? extends Augmentation<VirtualNetworkInterfaceRequirement>> augmentationType, Augmentation<VirtualNetworkInterfaceRequirement> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VirtualNetworkInterfaceRequirementBuilder removeAugmentation(Class<? extends Augmentation<VirtualNetworkInterfaceRequirement>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VirtualNetworkInterfaceRequirementBuilder doAddAugmentation(Class<? extends Augmentation<VirtualNetworkInterfaceRequirement>> augmentationType, Augmentation<VirtualNetworkInterfaceRequirement> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VirtualNetworkInterfaceRequirement build() {
        return new VirtualNetworkInterfaceRequirementImpl(this);
    }

    private static final class VirtualNetworkInterfaceRequirementImpl
        extends AbstractAugmentable<VirtualNetworkInterfaceRequirement>
        implements VirtualNetworkInterfaceRequirement {
    
        private final String _description;
        private final String _name;
        private final Map<NetworkInterfaceRequirementsKey, NetworkInterfaceRequirements> _networkInterfaceRequirements;
        private final Boolean _supportMandatory;
        private final VirtualNetworkInterfaceRequirementKey key;
    
        VirtualNetworkInterfaceRequirementImpl(VirtualNetworkInterfaceRequirementBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VirtualNetworkInterfaceRequirementKey(base.getName());
            }
            this._name = key.getName();
            this._description = base.getDescription();
            this._networkInterfaceRequirements = CodeHelpers.emptyToNull(base.getNetworkInterfaceRequirements());
            this._supportMandatory = base.isSupportMandatory();
        }
    
        @Override
        public VirtualNetworkInterfaceRequirementKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Map<NetworkInterfaceRequirementsKey, NetworkInterfaceRequirements> getNetworkInterfaceRequirements() {
            return _networkInterfaceRequirements;
        }
        
        @Override
        public Boolean isSupportMandatory() {
            return _supportMandatory;
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_networkInterfaceRequirements);
            result = prime * result + Objects.hashCode(_supportMandatory);
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
            if (!VirtualNetworkInterfaceRequirement.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualNetworkInterfaceRequirement other = (VirtualNetworkInterfaceRequirement)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_networkInterfaceRequirements, other.getNetworkInterfaceRequirements())) {
                return false;
            }
            if (!Objects.equals(_supportMandatory, other.isSupportMandatory())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualNetworkInterfaceRequirementImpl otherImpl = (VirtualNetworkInterfaceRequirementImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VirtualNetworkInterfaceRequirement>>, Augmentation<VirtualNetworkInterfaceRequirement>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualNetworkInterfaceRequirement");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_networkInterfaceRequirements", _networkInterfaceRequirements);
            CodeHelpers.appendValue(helper, "_supportMandatory", _supportMandatory);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
