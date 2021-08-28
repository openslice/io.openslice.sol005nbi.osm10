package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.NodeKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint16;

/**
 * Class that builds {@link NumaNodePolicyBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NumaNodePolicyBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NumaNodePolicyBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NumaNodePolicyBuilder, as instances can be freely passed around without
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
 * @see NumaNodePolicyBuilder
 * @see Builder
 *
 */
public class NumaNodePolicyBuilder implements Builder<NumaNodePolicy> {

    private NumaNodePolicy.MemPolicy _memPolicy;
    private Map<NodeKey, Node> _node;
    private Uint16 _nodeCnt;


    Map<Class<? extends Augmentation<NumaNodePolicy>>, Augmentation<NumaNodePolicy>> augmentation = Collections.emptyMap();

    public NumaNodePolicyBuilder() {
    }

    public NumaNodePolicyBuilder(NumaNodePolicy base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NumaNodePolicy>>, Augmentation<NumaNodePolicy>> aug =((AugmentationHolder<NumaNodePolicy>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._memPolicy = base.getMemPolicy();
        this._node = base.getNode();
        this._nodeCnt = base.getNodeCnt();
    }


    public NumaNodePolicy.MemPolicy getMemPolicy() {
        return _memPolicy;
    }
    
    public Map<NodeKey, Node> getNode() {
        return _node;
    }
    
    public Uint16 getNodeCnt() {
        return _nodeCnt;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<NumaNodePolicy>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public NumaNodePolicyBuilder setMemPolicy(final NumaNodePolicy.MemPolicy value) {
        this._memPolicy = value;
        return this;
    }
    public NumaNodePolicyBuilder setNode(final Map<NodeKey, Node> values) {
        this._node = values;
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
      * @deprecated Use {#link #setNode(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NumaNodePolicyBuilder setNode(final List<Node> values) {
        return setNode(CodeHelpers.compatMap(values));
    }
    
    public NumaNodePolicyBuilder setNodeCnt(final Uint16 value) {
        this._nodeCnt = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setNodeCnt(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public NumaNodePolicyBuilder setNodeCnt(final Integer value) {
        return setNodeCnt(CodeHelpers.compatUint(value));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NumaNodePolicyBuilder addAugmentation(Augmentation<NumaNodePolicy> augmentation) {
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
    public NumaNodePolicyBuilder addAugmentation(Class<? extends Augmentation<NumaNodePolicy>> augmentationType, Augmentation<NumaNodePolicy> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NumaNodePolicyBuilder removeAugmentation(Class<? extends Augmentation<NumaNodePolicy>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NumaNodePolicyBuilder doAddAugmentation(Class<? extends Augmentation<NumaNodePolicy>> augmentationType, Augmentation<NumaNodePolicy> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public NumaNodePolicy build() {
        return new NumaNodePolicyImpl(this);
    }

    private static final class NumaNodePolicyImpl
        extends AbstractAugmentable<NumaNodePolicy>
        implements NumaNodePolicy {
    
        private final NumaNodePolicy.MemPolicy _memPolicy;
        private final Map<NodeKey, Node> _node;
        private final Uint16 _nodeCnt;
    
        NumaNodePolicyImpl(NumaNodePolicyBuilder base) {
            super(base.augmentation);
            this._memPolicy = base.getMemPolicy();
            this._node = CodeHelpers.emptyToNull(base.getNode());
            this._nodeCnt = base.getNodeCnt();
        }
    
        @Override
        public NumaNodePolicy.MemPolicy getMemPolicy() {
            return _memPolicy;
        }
        
        @Override
        public Map<NodeKey, Node> getNode() {
            return _node;
        }
        
        @Override
        public Uint16 getNodeCnt() {
            return _nodeCnt;
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
            result = prime * result + Objects.hashCode(_memPolicy);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_nodeCnt);
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
            if (!NumaNodePolicy.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            NumaNodePolicy other = (NumaNodePolicy)obj;
            if (!Objects.equals(_memPolicy, other.getMemPolicy())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_nodeCnt, other.getNodeCnt())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NumaNodePolicyImpl otherImpl = (NumaNodePolicyImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NumaNodePolicy>>, Augmentation<NumaNodePolicy>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NumaNodePolicy");
            CodeHelpers.appendValue(helper, "_memPolicy", _memPolicy);
            CodeHelpers.appendValue(helper, "_node", _node);
            CodeHelpers.appendValue(helper, "_nodeCnt", _nodeCnt);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
