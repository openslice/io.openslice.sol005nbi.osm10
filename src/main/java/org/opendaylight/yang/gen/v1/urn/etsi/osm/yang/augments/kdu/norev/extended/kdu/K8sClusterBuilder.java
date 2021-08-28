package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.k8s.cluster.Nets;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.k8s.cluster.NetsKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link K8sClusterBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     K8sClusterBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new K8sClusterBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of K8sClusterBuilder, as instances can be freely passed around without
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
 * @see K8sClusterBuilder
 * @see Builder
 *
 */
public class K8sClusterBuilder implements Builder<K8sCluster> {

    private List<K8sCluster.Cni> _cni;
    private Map<NetsKey, Nets> _nets;
    private List<String> _version;


    Map<Class<? extends Augmentation<K8sCluster>>, Augmentation<K8sCluster>> augmentation = Collections.emptyMap();

    public K8sClusterBuilder() {
    }

    public K8sClusterBuilder(K8sCluster base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<K8sCluster>>, Augmentation<K8sCluster>> aug =((AugmentationHolder<K8sCluster>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._cni = base.getCni();
        this._nets = base.getNets();
        this._version = base.getVersion();
    }


    public List<K8sCluster.Cni> getCni() {
        return _cni;
    }
    
    public Map<NetsKey, Nets> getNets() {
        return _nets;
    }
    
    public List<String> getVersion() {
        return _version;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<K8sCluster>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public K8sClusterBuilder setCni(final List<K8sCluster.Cni> values) {
        this._cni = values;
        return this;
    }
    
    public K8sClusterBuilder setNets(final Map<NetsKey, Nets> values) {
        this._nets = values;
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
      * @deprecated Use {#link #setNets(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public K8sClusterBuilder setNets(final List<Nets> values) {
        return setNets(CodeHelpers.compatMap(values));
    }
    public K8sClusterBuilder setVersion(final List<String> values) {
        this._version = values;
        return this;
    }
    
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public K8sClusterBuilder addAugmentation(Augmentation<K8sCluster> augmentation) {
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
    public K8sClusterBuilder addAugmentation(Class<? extends Augmentation<K8sCluster>> augmentationType, Augmentation<K8sCluster> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public K8sClusterBuilder removeAugmentation(Class<? extends Augmentation<K8sCluster>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private K8sClusterBuilder doAddAugmentation(Class<? extends Augmentation<K8sCluster>> augmentationType, Augmentation<K8sCluster> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public K8sCluster build() {
        return new K8sClusterImpl(this);
    }

    private static final class K8sClusterImpl
        extends AbstractAugmentable<K8sCluster>
        implements K8sCluster {
    
        private final List<K8sCluster.Cni> _cni;
        private final Map<NetsKey, Nets> _nets;
        private final List<String> _version;
    
        K8sClusterImpl(K8sClusterBuilder base) {
            super(base.augmentation);
            this._cni = base.getCni();
            this._nets = CodeHelpers.emptyToNull(base.getNets());
            this._version = base.getVersion();
        }
    
        @Override
        public List<K8sCluster.Cni> getCni() {
            return _cni;
        }
        
        @Override
        public Map<NetsKey, Nets> getNets() {
            return _nets;
        }
        
        @Override
        public List<String> getVersion() {
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
            result = prime * result + Objects.hashCode(_cni);
            result = prime * result + Objects.hashCode(_nets);
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
            if (!K8sCluster.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            K8sCluster other = (K8sCluster)obj;
            if (!Objects.equals(_cni, other.getCni())) {
                return false;
            }
            if (!Objects.equals(_nets, other.getNets())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                K8sClusterImpl otherImpl = (K8sClusterImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<K8sCluster>>, Augmentation<K8sCluster>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("K8sCluster");
            CodeHelpers.appendValue(helper, "_cni", _cni);
            CodeHelpers.appendValue(helper, "_nets", _nets);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
