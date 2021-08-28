package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.CpuPolicy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.DiskIoQuota;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.MemQuota;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.NumaPolicy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.PcieDevice;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.PcieDeviceKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.VifQuota;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link GuestEpaBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     GuestEpaBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new GuestEpaBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of GuestEpaBuilder, as instances can be freely passed around without
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
 * @see GuestEpaBuilder
 * @see Builder
 *
 */
public class GuestEpaBuilder implements Builder<GuestEpa> {

    private CpuPolicy _cpuPolicy;
    private DiskIoQuota _diskIoQuota;
    private MemQuota _memQuota;
    private GuestEpa.MempageSize _mempageSize;
    private NumaPolicy _numaPolicy;
    private Map<PcieDeviceKey, PcieDevice> _pcieDevice;
    private VifQuota _vifQuota;
    private Boolean _trustedExecution;


    Map<Class<? extends Augmentation<GuestEpa>>, Augmentation<GuestEpa>> augmentation = Collections.emptyMap();

    public GuestEpaBuilder() {
    }

    public GuestEpaBuilder(GuestEpa base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<GuestEpa>>, Augmentation<GuestEpa>> aug =((AugmentationHolder<GuestEpa>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._cpuPolicy = base.getCpuPolicy();
        this._diskIoQuota = base.getDiskIoQuota();
        this._memQuota = base.getMemQuota();
        this._mempageSize = base.getMempageSize();
        this._numaPolicy = base.getNumaPolicy();
        this._pcieDevice = base.getPcieDevice();
        this._vifQuota = base.getVifQuota();
        this._trustedExecution = base.isTrustedExecution();
    }


    public CpuPolicy getCpuPolicy() {
        return _cpuPolicy;
    }
    
    public DiskIoQuota getDiskIoQuota() {
        return _diskIoQuota;
    }
    
    public MemQuota getMemQuota() {
        return _memQuota;
    }
    
    public GuestEpa.MempageSize getMempageSize() {
        return _mempageSize;
    }
    
    public NumaPolicy getNumaPolicy() {
        return _numaPolicy;
    }
    
    public Map<PcieDeviceKey, PcieDevice> getPcieDevice() {
        return _pcieDevice;
    }
    
    public VifQuota getVifQuota() {
        return _vifQuota;
    }
    
    public Boolean isTrustedExecution() {
        return _trustedExecution;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<GuestEpa>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public GuestEpaBuilder setCpuPolicy(final CpuPolicy value) {
        this._cpuPolicy = value;
        return this;
    }
    
    public GuestEpaBuilder setDiskIoQuota(final DiskIoQuota value) {
        this._diskIoQuota = value;
        return this;
    }
    
    public GuestEpaBuilder setMemQuota(final MemQuota value) {
        this._memQuota = value;
        return this;
    }
    
    public GuestEpaBuilder setMempageSize(final GuestEpa.MempageSize value) {
        this._mempageSize = value;
        return this;
    }
    
    public GuestEpaBuilder setNumaPolicy(final NumaPolicy value) {
        this._numaPolicy = value;
        return this;
    }
    public GuestEpaBuilder setPcieDevice(final Map<PcieDeviceKey, PcieDevice> values) {
        this._pcieDevice = values;
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
      * @deprecated Use {#link #setPcieDevice(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public GuestEpaBuilder setPcieDevice(final List<PcieDevice> values) {
        return setPcieDevice(CodeHelpers.compatMap(values));
    }
    
    public GuestEpaBuilder setVifQuota(final VifQuota value) {
        this._vifQuota = value;
        return this;
    }
    
    public GuestEpaBuilder setTrustedExecution(final Boolean value) {
        this._trustedExecution = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public GuestEpaBuilder addAugmentation(Augmentation<GuestEpa> augmentation) {
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
    public GuestEpaBuilder addAugmentation(Class<? extends Augmentation<GuestEpa>> augmentationType, Augmentation<GuestEpa> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public GuestEpaBuilder removeAugmentation(Class<? extends Augmentation<GuestEpa>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private GuestEpaBuilder doAddAugmentation(Class<? extends Augmentation<GuestEpa>> augmentationType, Augmentation<GuestEpa> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public GuestEpa build() {
        return new GuestEpaImpl(this);
    }

    private static final class GuestEpaImpl
        extends AbstractAugmentable<GuestEpa>
        implements GuestEpa {
    
        private final CpuPolicy _cpuPolicy;
        private final DiskIoQuota _diskIoQuota;
        private final MemQuota _memQuota;
        private final GuestEpa.MempageSize _mempageSize;
        private final NumaPolicy _numaPolicy;
        private final Map<PcieDeviceKey, PcieDevice> _pcieDevice;
        private final VifQuota _vifQuota;
        private final Boolean _trustedExecution;
    
        GuestEpaImpl(GuestEpaBuilder base) {
            super(base.augmentation);
            this._cpuPolicy = base.getCpuPolicy();
            this._diskIoQuota = base.getDiskIoQuota();
            this._memQuota = base.getMemQuota();
            this._mempageSize = base.getMempageSize();
            this._numaPolicy = base.getNumaPolicy();
            this._pcieDevice = CodeHelpers.emptyToNull(base.getPcieDevice());
            this._vifQuota = base.getVifQuota();
            this._trustedExecution = base.isTrustedExecution();
        }
    
        @Override
        public CpuPolicy getCpuPolicy() {
            return _cpuPolicy;
        }
        
        @Override
        public DiskIoQuota getDiskIoQuota() {
            return _diskIoQuota;
        }
        
        @Override
        public MemQuota getMemQuota() {
            return _memQuota;
        }
        
        @Override
        public GuestEpa.MempageSize getMempageSize() {
            return _mempageSize;
        }
        
        @Override
        public NumaPolicy getNumaPolicy() {
            return _numaPolicy;
        }
        
        @Override
        public Map<PcieDeviceKey, PcieDevice> getPcieDevice() {
            return _pcieDevice;
        }
        
        @Override
        public VifQuota getVifQuota() {
            return _vifQuota;
        }
        
        @Override
        public Boolean isTrustedExecution() {
            return _trustedExecution;
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
            result = prime * result + Objects.hashCode(_cpuPolicy);
            result = prime * result + Objects.hashCode(_diskIoQuota);
            result = prime * result + Objects.hashCode(_memQuota);
            result = prime * result + Objects.hashCode(_mempageSize);
            result = prime * result + Objects.hashCode(_numaPolicy);
            result = prime * result + Objects.hashCode(_pcieDevice);
            result = prime * result + Objects.hashCode(_vifQuota);
            result = prime * result + Objects.hashCode(_trustedExecution);
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
            if (!GuestEpa.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            GuestEpa other = (GuestEpa)obj;
            if (!Objects.equals(_cpuPolicy, other.getCpuPolicy())) {
                return false;
            }
            if (!Objects.equals(_diskIoQuota, other.getDiskIoQuota())) {
                return false;
            }
            if (!Objects.equals(_memQuota, other.getMemQuota())) {
                return false;
            }
            if (!Objects.equals(_mempageSize, other.getMempageSize())) {
                return false;
            }
            if (!Objects.equals(_numaPolicy, other.getNumaPolicy())) {
                return false;
            }
            if (!Objects.equals(_pcieDevice, other.getPcieDevice())) {
                return false;
            }
            if (!Objects.equals(_vifQuota, other.getVifQuota())) {
                return false;
            }
            if (!Objects.equals(_trustedExecution, other.isTrustedExecution())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GuestEpaImpl otherImpl = (GuestEpaImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<GuestEpa>>, Augmentation<GuestEpa>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("GuestEpa");
            CodeHelpers.appendValue(helper, "_cpuPolicy", _cpuPolicy);
            CodeHelpers.appendValue(helper, "_diskIoQuota", _diskIoQuota);
            CodeHelpers.appendValue(helper, "_memQuota", _memQuota);
            CodeHelpers.appendValue(helper, "_mempageSize", _mempageSize);
            CodeHelpers.appendValue(helper, "_numaPolicy", _numaPolicy);
            CodeHelpers.appendValue(helper, "_pcieDevice", _pcieDevice);
            CodeHelpers.appendValue(helper, "_vifQuota", _vifQuota);
            CodeHelpers.appendValue(helper, "_trustedExecution", _trustedExecution);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
