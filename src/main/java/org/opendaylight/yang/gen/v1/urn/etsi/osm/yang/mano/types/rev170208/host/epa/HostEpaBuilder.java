package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa;
import com.google.common.base.MoreObjects;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa.host.epa.CpuFeature;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa.host.epa.CpuFeatureKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa.host.epa.OmCpuFeature;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa.host.epa.OmCpuFeatureKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link HostEpaBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     HostEpaBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new HostEpaBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of HostEpaBuilder, as instances can be freely passed around without
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
 * @see HostEpaBuilder
 * @see Builder
 *
 */
public class HostEpaBuilder implements Builder<HostEpa> {

    private HostEpa.CpuArch _cpuArch;
    private Uint64 _cpuCoreCount;
    private Uint64 _cpuCoreThreadCount;
    private Map<CpuFeatureKey, CpuFeature> _cpuFeature;
    private HostEpa.CpuModel _cpuModel;
    private Uint64 _cpuSocketCount;
    private HostEpa.CpuVendor _cpuVendor;
    private Map<OmCpuFeatureKey, OmCpuFeature> _omCpuFeature;
    private String _omCpuModelString;


    Map<Class<? extends Augmentation<HostEpa>>, Augmentation<HostEpa>> augmentation = Collections.emptyMap();

    public HostEpaBuilder() {
    }

    public HostEpaBuilder(HostEpa base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<HostEpa>>, Augmentation<HostEpa>> aug =((AugmentationHolder<HostEpa>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._cpuArch = base.getCpuArch();
        this._cpuCoreCount = base.getCpuCoreCount();
        this._cpuCoreThreadCount = base.getCpuCoreThreadCount();
        this._cpuFeature = base.getCpuFeature();
        this._cpuModel = base.getCpuModel();
        this._cpuSocketCount = base.getCpuSocketCount();
        this._cpuVendor = base.getCpuVendor();
        this._omCpuFeature = base.getOmCpuFeature();
        this._omCpuModelString = base.getOmCpuModelString();
    }


    public HostEpa.CpuArch getCpuArch() {
        return _cpuArch;
    }
    
    public Uint64 getCpuCoreCount() {
        return _cpuCoreCount;
    }
    
    public Uint64 getCpuCoreThreadCount() {
        return _cpuCoreThreadCount;
    }
    
    public Map<CpuFeatureKey, CpuFeature> getCpuFeature() {
        return _cpuFeature;
    }
    
    public HostEpa.CpuModel getCpuModel() {
        return _cpuModel;
    }
    
    public Uint64 getCpuSocketCount() {
        return _cpuSocketCount;
    }
    
    public HostEpa.CpuVendor getCpuVendor() {
        return _cpuVendor;
    }
    
    public Map<OmCpuFeatureKey, OmCpuFeature> getOmCpuFeature() {
        return _omCpuFeature;
    }
    
    public String getOmCpuModelString() {
        return _omCpuModelString;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<HostEpa>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public HostEpaBuilder setCpuArch(final HostEpa.CpuArch value) {
        this._cpuArch = value;
        return this;
    }
    
    public HostEpaBuilder setCpuCoreCount(final Uint64 value) {
        this._cpuCoreCount = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCpuCoreCount(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public HostEpaBuilder setCpuCoreCount(final BigInteger value) {
        return setCpuCoreCount(CodeHelpers.compatUint(value));
    }
    
    public HostEpaBuilder setCpuCoreThreadCount(final Uint64 value) {
        this._cpuCoreThreadCount = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCpuCoreThreadCount(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public HostEpaBuilder setCpuCoreThreadCount(final BigInteger value) {
        return setCpuCoreThreadCount(CodeHelpers.compatUint(value));
    }
    public HostEpaBuilder setCpuFeature(final Map<CpuFeatureKey, CpuFeature> values) {
        this._cpuFeature = values;
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
      * @deprecated Use {#link #setCpuFeature(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public HostEpaBuilder setCpuFeature(final List<CpuFeature> values) {
        return setCpuFeature(CodeHelpers.compatMap(values));
    }
    
    public HostEpaBuilder setCpuModel(final HostEpa.CpuModel value) {
        this._cpuModel = value;
        return this;
    }
    
    public HostEpaBuilder setCpuSocketCount(final Uint64 value) {
        this._cpuSocketCount = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCpuSocketCount(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public HostEpaBuilder setCpuSocketCount(final BigInteger value) {
        return setCpuSocketCount(CodeHelpers.compatUint(value));
    }
    
    public HostEpaBuilder setCpuVendor(final HostEpa.CpuVendor value) {
        this._cpuVendor = value;
        return this;
    }
    public HostEpaBuilder setOmCpuFeature(final Map<OmCpuFeatureKey, OmCpuFeature> values) {
        this._omCpuFeature = values;
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
      * @deprecated Use {#link #setOmCpuFeature(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public HostEpaBuilder setOmCpuFeature(final List<OmCpuFeature> values) {
        return setOmCpuFeature(CodeHelpers.compatMap(values));
    }
    
    public HostEpaBuilder setOmCpuModelString(final String value) {
        this._omCpuModelString = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public HostEpaBuilder addAugmentation(Augmentation<HostEpa> augmentation) {
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
    public HostEpaBuilder addAugmentation(Class<? extends Augmentation<HostEpa>> augmentationType, Augmentation<HostEpa> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public HostEpaBuilder removeAugmentation(Class<? extends Augmentation<HostEpa>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private HostEpaBuilder doAddAugmentation(Class<? extends Augmentation<HostEpa>> augmentationType, Augmentation<HostEpa> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public HostEpa build() {
        return new HostEpaImpl(this);
    }

    private static final class HostEpaImpl
        extends AbstractAugmentable<HostEpa>
        implements HostEpa {
    
        private final HostEpa.CpuArch _cpuArch;
        private final Uint64 _cpuCoreCount;
        private final Uint64 _cpuCoreThreadCount;
        private final Map<CpuFeatureKey, CpuFeature> _cpuFeature;
        private final HostEpa.CpuModel _cpuModel;
        private final Uint64 _cpuSocketCount;
        private final HostEpa.CpuVendor _cpuVendor;
        private final Map<OmCpuFeatureKey, OmCpuFeature> _omCpuFeature;
        private final String _omCpuModelString;
    
        HostEpaImpl(HostEpaBuilder base) {
            super(base.augmentation);
            this._cpuArch = base.getCpuArch();
            this._cpuCoreCount = base.getCpuCoreCount();
            this._cpuCoreThreadCount = base.getCpuCoreThreadCount();
            this._cpuFeature = CodeHelpers.emptyToNull(base.getCpuFeature());
            this._cpuModel = base.getCpuModel();
            this._cpuSocketCount = base.getCpuSocketCount();
            this._cpuVendor = base.getCpuVendor();
            this._omCpuFeature = CodeHelpers.emptyToNull(base.getOmCpuFeature());
            this._omCpuModelString = base.getOmCpuModelString();
        }
    
        @Override
        public HostEpa.CpuArch getCpuArch() {
            return _cpuArch;
        }
        
        @Override
        public Uint64 getCpuCoreCount() {
            return _cpuCoreCount;
        }
        
        @Override
        public Uint64 getCpuCoreThreadCount() {
            return _cpuCoreThreadCount;
        }
        
        @Override
        public Map<CpuFeatureKey, CpuFeature> getCpuFeature() {
            return _cpuFeature;
        }
        
        @Override
        public HostEpa.CpuModel getCpuModel() {
            return _cpuModel;
        }
        
        @Override
        public Uint64 getCpuSocketCount() {
            return _cpuSocketCount;
        }
        
        @Override
        public HostEpa.CpuVendor getCpuVendor() {
            return _cpuVendor;
        }
        
        @Override
        public Map<OmCpuFeatureKey, OmCpuFeature> getOmCpuFeature() {
            return _omCpuFeature;
        }
        
        @Override
        public String getOmCpuModelString() {
            return _omCpuModelString;
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
            result = prime * result + Objects.hashCode(_cpuArch);
            result = prime * result + Objects.hashCode(_cpuCoreCount);
            result = prime * result + Objects.hashCode(_cpuCoreThreadCount);
            result = prime * result + Objects.hashCode(_cpuFeature);
            result = prime * result + Objects.hashCode(_cpuModel);
            result = prime * result + Objects.hashCode(_cpuSocketCount);
            result = prime * result + Objects.hashCode(_cpuVendor);
            result = prime * result + Objects.hashCode(_omCpuFeature);
            result = prime * result + Objects.hashCode(_omCpuModelString);
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
            if (!HostEpa.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            HostEpa other = (HostEpa)obj;
            if (!Objects.equals(_cpuArch, other.getCpuArch())) {
                return false;
            }
            if (!Objects.equals(_cpuCoreCount, other.getCpuCoreCount())) {
                return false;
            }
            if (!Objects.equals(_cpuCoreThreadCount, other.getCpuCoreThreadCount())) {
                return false;
            }
            if (!Objects.equals(_cpuFeature, other.getCpuFeature())) {
                return false;
            }
            if (!Objects.equals(_cpuModel, other.getCpuModel())) {
                return false;
            }
            if (!Objects.equals(_cpuSocketCount, other.getCpuSocketCount())) {
                return false;
            }
            if (!Objects.equals(_cpuVendor, other.getCpuVendor())) {
                return false;
            }
            if (!Objects.equals(_omCpuFeature, other.getOmCpuFeature())) {
                return false;
            }
            if (!Objects.equals(_omCpuModelString, other.getOmCpuModelString())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HostEpaImpl otherImpl = (HostEpaImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<HostEpa>>, Augmentation<HostEpa>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("HostEpa");
            CodeHelpers.appendValue(helper, "_cpuArch", _cpuArch);
            CodeHelpers.appendValue(helper, "_cpuCoreCount", _cpuCoreCount);
            CodeHelpers.appendValue(helper, "_cpuCoreThreadCount", _cpuCoreThreadCount);
            CodeHelpers.appendValue(helper, "_cpuFeature", _cpuFeature);
            CodeHelpers.appendValue(helper, "_cpuModel", _cpuModel);
            CodeHelpers.appendValue(helper, "_cpuSocketCount", _cpuSocketCount);
            CodeHelpers.appendValue(helper, "_cpuVendor", _cpuVendor);
            CodeHelpers.appendValue(helper, "_omCpuFeature", _omCpuFeature);
            CodeHelpers.appendValue(helper, "_omCpuModelString", _omCpuModelString);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
