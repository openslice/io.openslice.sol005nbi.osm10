package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level.ScalingInfo;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level.ScalingInfoKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level.VduLevel;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level.VduLevelKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link InstantiationLevelBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     InstantiationLevelBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new InstantiationLevelBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of InstantiationLevelBuilder, as instances can be freely passed around without
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
 * @see InstantiationLevelBuilder
 * @see Builder
 *
 */
public class InstantiationLevelBuilder implements Builder<InstantiationLevel> {

    private String _description;
    private String _id;
    private Map<ScalingInfoKey, ScalingInfo> _scalingInfo;
    private Map<VduLevelKey, VduLevel> _vduLevel;
    private InstantiationLevelKey key;


    Map<Class<? extends Augmentation<InstantiationLevel>>, Augmentation<InstantiationLevel>> augmentation = Collections.emptyMap();

    public InstantiationLevelBuilder() {
    }

    public InstantiationLevelBuilder(InstantiationLevel base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<InstantiationLevel>>, Augmentation<InstantiationLevel>> aug =((AugmentationHolder<InstantiationLevel>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._description = base.getDescription();
        this._scalingInfo = base.getScalingInfo();
        this._vduLevel = base.getVduLevel();
    }


    public InstantiationLevelKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public Map<ScalingInfoKey, ScalingInfo> getScalingInfo() {
        return _scalingInfo;
    }
    
    public Map<VduLevelKey, VduLevel> getVduLevel() {
        return _vduLevel;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<InstantiationLevel>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public InstantiationLevelBuilder withKey(final InstantiationLevelKey key) {
        this.key = key;
        return this;
    }
    
    public InstantiationLevelBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public InstantiationLevelBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public InstantiationLevelBuilder setScalingInfo(final Map<ScalingInfoKey, ScalingInfo> values) {
        this._scalingInfo = values;
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
      * @deprecated Use {#link #setScalingInfo(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public InstantiationLevelBuilder setScalingInfo(final List<ScalingInfo> values) {
        return setScalingInfo(CodeHelpers.compatMap(values));
    }
    public InstantiationLevelBuilder setVduLevel(final Map<VduLevelKey, VduLevel> values) {
        this._vduLevel = values;
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
      * @deprecated Use {#link #setVduLevel(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public InstantiationLevelBuilder setVduLevel(final List<VduLevel> values) {
        return setVduLevel(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public InstantiationLevelBuilder addAugmentation(Augmentation<InstantiationLevel> augmentation) {
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
    public InstantiationLevelBuilder addAugmentation(Class<? extends Augmentation<InstantiationLevel>> augmentationType, Augmentation<InstantiationLevel> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public InstantiationLevelBuilder removeAugmentation(Class<? extends Augmentation<InstantiationLevel>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private InstantiationLevelBuilder doAddAugmentation(Class<? extends Augmentation<InstantiationLevel>> augmentationType, Augmentation<InstantiationLevel> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public InstantiationLevel build() {
        return new InstantiationLevelImpl(this);
    }

    private static final class InstantiationLevelImpl
        extends AbstractAugmentable<InstantiationLevel>
        implements InstantiationLevel {
    
        private final String _description;
        private final String _id;
        private final Map<ScalingInfoKey, ScalingInfo> _scalingInfo;
        private final Map<VduLevelKey, VduLevel> _vduLevel;
        private final InstantiationLevelKey key;
    
        InstantiationLevelImpl(InstantiationLevelBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new InstantiationLevelKey(base.getId());
            }
            this._id = key.getId();
            this._description = base.getDescription();
            this._scalingInfo = CodeHelpers.emptyToNull(base.getScalingInfo());
            this._vduLevel = CodeHelpers.emptyToNull(base.getVduLevel());
        }
    
        @Override
        public InstantiationLevelKey key() {
            return key;
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
        public Map<ScalingInfoKey, ScalingInfo> getScalingInfo() {
            return _scalingInfo;
        }
        
        @Override
        public Map<VduLevelKey, VduLevel> getVduLevel() {
            return _vduLevel;
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_scalingInfo);
            result = prime * result + Objects.hashCode(_vduLevel);
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
            if (!InstantiationLevel.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            InstantiationLevel other = (InstantiationLevel)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_scalingInfo, other.getScalingInfo())) {
                return false;
            }
            if (!Objects.equals(_vduLevel, other.getVduLevel())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InstantiationLevelImpl otherImpl = (InstantiationLevelImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InstantiationLevel>>, Augmentation<InstantiationLevel>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InstantiationLevel");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_scalingInfo", _scalingInfo);
            CodeHelpers.appendValue(helper, "_vduLevel", _vduLevel);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
