package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.LogicalNode;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.LogicalNodeKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.RequestAdditionalCapability;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.RequestAdditionalCapabilityKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualCpu;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualMemory;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VirtualComputeDescBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualComputeDescBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualComputeDescBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualComputeDescBuilder, as instances can be freely passed around without
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
 * @see VirtualComputeDescBuilder
 * @see Builder
 *
 */
public class VirtualComputeDescBuilder implements Builder<VirtualComputeDesc> {

    private String _computeRequirements;
    private String _id;
    private Map<LogicalNodeKey, LogicalNode> _logicalNode;
    private Map<RequestAdditionalCapabilityKey, RequestAdditionalCapability> _requestAdditionalCapability;
    private VirtualCpu _virtualCpu;
    private VirtualMemory _virtualMemory;
    private VirtualComputeDescKey key;


    Map<Class<? extends Augmentation<VirtualComputeDesc>>, Augmentation<VirtualComputeDesc>> augmentation = Collections.emptyMap();

    public VirtualComputeDescBuilder() {
    }

    public VirtualComputeDescBuilder(VirtualComputeDesc base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VirtualComputeDesc>>, Augmentation<VirtualComputeDesc>> aug =((AugmentationHolder<VirtualComputeDesc>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._computeRequirements = base.getComputeRequirements();
        this._logicalNode = base.getLogicalNode();
        this._requestAdditionalCapability = base.getRequestAdditionalCapability();
        this._virtualCpu = base.getVirtualCpu();
        this._virtualMemory = base.getVirtualMemory();
    }


    public VirtualComputeDescKey key() {
        return key;
    }
    
    public String getComputeRequirements() {
        return _computeRequirements;
    }
    
    public String getId() {
        return _id;
    }
    
    public Map<LogicalNodeKey, LogicalNode> getLogicalNode() {
        return _logicalNode;
    }
    
    public Map<RequestAdditionalCapabilityKey, RequestAdditionalCapability> getRequestAdditionalCapability() {
        return _requestAdditionalCapability;
    }
    
    public VirtualCpu getVirtualCpu() {
        return _virtualCpu;
    }
    
    public VirtualMemory getVirtualMemory() {
        return _virtualMemory;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VirtualComputeDesc>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VirtualComputeDescBuilder withKey(final VirtualComputeDescKey key) {
        this.key = key;
        return this;
    }
    
    public VirtualComputeDescBuilder setComputeRequirements(final String value) {
        this._computeRequirements = value;
        return this;
    }
    
    public VirtualComputeDescBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public VirtualComputeDescBuilder setLogicalNode(final Map<LogicalNodeKey, LogicalNode> values) {
        this._logicalNode = values;
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
      * @deprecated Use {#link #setLogicalNode(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VirtualComputeDescBuilder setLogicalNode(final List<LogicalNode> values) {
        return setLogicalNode(CodeHelpers.compatMap(values));
    }
    public VirtualComputeDescBuilder setRequestAdditionalCapability(final Map<RequestAdditionalCapabilityKey, RequestAdditionalCapability> values) {
        this._requestAdditionalCapability = values;
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
      * @deprecated Use {#link #setRequestAdditionalCapability(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VirtualComputeDescBuilder setRequestAdditionalCapability(final List<RequestAdditionalCapability> values) {
        return setRequestAdditionalCapability(CodeHelpers.compatMap(values));
    }
    
    public VirtualComputeDescBuilder setVirtualCpu(final VirtualCpu value) {
        this._virtualCpu = value;
        return this;
    }
    
    public VirtualComputeDescBuilder setVirtualMemory(final VirtualMemory value) {
        this._virtualMemory = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VirtualComputeDescBuilder addAugmentation(Augmentation<VirtualComputeDesc> augmentation) {
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
    public VirtualComputeDescBuilder addAugmentation(Class<? extends Augmentation<VirtualComputeDesc>> augmentationType, Augmentation<VirtualComputeDesc> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VirtualComputeDescBuilder removeAugmentation(Class<? extends Augmentation<VirtualComputeDesc>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VirtualComputeDescBuilder doAddAugmentation(Class<? extends Augmentation<VirtualComputeDesc>> augmentationType, Augmentation<VirtualComputeDesc> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VirtualComputeDesc build() {
        return new VirtualComputeDescImpl(this);
    }

    public static final class VirtualComputeDescImpl
        extends AbstractAugmentable<VirtualComputeDesc>
        implements VirtualComputeDesc {
    
        private final String _computeRequirements;
        @JsonProperty("id")
        private final String _id;
        private final Map<LogicalNodeKey, LogicalNode> _logicalNode;
        private final Map<RequestAdditionalCapabilityKey, RequestAdditionalCapability> _requestAdditionalCapability;
        @JsonProperty("virtual-cpu")
        private final VirtualCpu _virtualCpu;
        @JsonProperty("virtual-memory")
        private final VirtualMemory _virtualMemory;
        private VirtualComputeDescKey key;
    
        VirtualComputeDescImpl(VirtualComputeDescBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VirtualComputeDescKey(base.getId());
            }
            this._id = key.getId();
            this._computeRequirements = base.getComputeRequirements();
            this._logicalNode = CodeHelpers.emptyToNull(base.getLogicalNode());
            this._requestAdditionalCapability = CodeHelpers.emptyToNull(base.getRequestAdditionalCapability());
            this._virtualCpu = base.getVirtualCpu();
            this._virtualMemory = base.getVirtualMemory();
        }
    
        
        public VirtualComputeDescImpl() {
        	this( new VirtualComputeDescBuilder());
        }
                
        @Override
        public VirtualComputeDescKey key() {        	
        	if ( ( key != null) && ( key.getId() == null) && ( _id != null) ) {
        		key = new VirtualComputeDescKey(_id);        		
        	}        	
            return key;
        }
        
        @Override
        public String getComputeRequirements() {
            return _computeRequirements;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Map<LogicalNodeKey, LogicalNode> getLogicalNode() {
            return _logicalNode;
        }
        
        @Override
        public Map<RequestAdditionalCapabilityKey, RequestAdditionalCapability> getRequestAdditionalCapability() {
            return _requestAdditionalCapability;
        }
        
        @Override
        public VirtualCpu getVirtualCpu() {
            return _virtualCpu;
        }
        
        @Override
        public VirtualMemory getVirtualMemory() {
            return _virtualMemory;
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
            result = prime * result + Objects.hashCode(_computeRequirements);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_logicalNode);
            result = prime * result + Objects.hashCode(_requestAdditionalCapability);
            result = prime * result + Objects.hashCode(_virtualCpu);
            result = prime * result + Objects.hashCode(_virtualMemory);
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
            if (!VirtualComputeDesc.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualComputeDesc other = (VirtualComputeDesc)obj;
            if (!Objects.equals(_computeRequirements, other.getComputeRequirements())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_logicalNode, other.getLogicalNode())) {
                return false;
            }
            if (!Objects.equals(_requestAdditionalCapability, other.getRequestAdditionalCapability())) {
                return false;
            }
            if (!Objects.equals(_virtualCpu, other.getVirtualCpu())) {
                return false;
            }
            if (!Objects.equals(_virtualMemory, other.getVirtualMemory())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualComputeDescImpl otherImpl = (VirtualComputeDescImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VirtualComputeDesc>>, Augmentation<VirtualComputeDesc>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualComputeDesc");
            CodeHelpers.appendValue(helper, "_computeRequirements", _computeRequirements);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_logicalNode", _logicalNode);
            CodeHelpers.appendValue(helper, "_requestAdditionalCapability", _requestAdditionalCapability);
            CodeHelpers.appendValue(helper, "_virtualCpu", _virtualCpu);
            CodeHelpers.appendValue(helper, "_virtualMemory", _virtualMemory);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
