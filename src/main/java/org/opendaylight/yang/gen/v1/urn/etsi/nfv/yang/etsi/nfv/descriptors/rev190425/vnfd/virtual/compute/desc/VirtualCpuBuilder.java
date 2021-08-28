package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDescBuilder;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.Pinning;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.VduCpuRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.VduCpuRequirementsKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint16;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link VirtualCpuBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualCpuBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualCpuBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualCpuBuilder, as instances can be freely passed around without
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
 * @see VirtualCpuBuilder
 * @see Builder
 *
 */
public class VirtualCpuBuilder implements Builder<VirtualCpu> {

    private Uint32 _clock;
    private String _cpuArchitecture;
    private Uint16 _numVirtualCpu;
    private String _oversubscriptionPolicy;
    private Pinning _pinning;
    private Map<VduCpuRequirementsKey, VduCpuRequirements> _vduCpuRequirements;


    Map<Class<? extends Augmentation<VirtualCpu>>, Augmentation<VirtualCpu>> augmentation = Collections.emptyMap();

    public VirtualCpuBuilder() {
    }

    public VirtualCpuBuilder(VirtualCpu base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VirtualCpu>>, Augmentation<VirtualCpu>> aug =((AugmentationHolder<VirtualCpu>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._clock = base.getClock();
        this._cpuArchitecture = base.getCpuArchitecture();
        this._numVirtualCpu = base.getNumVirtualCpu();
        this._oversubscriptionPolicy = base.getOversubscriptionPolicy();
        this._pinning = base.getPinning();
        this._vduCpuRequirements = base.getVduCpuRequirements();
    }


    public Uint32 getClock() {
        return _clock;
    }
    
    public String getCpuArchitecture() {
        return _cpuArchitecture;
    }
    
    public Uint16 getNumVirtualCpu() {
        return _numVirtualCpu;
    }
    
    public String getOversubscriptionPolicy() {
        return _oversubscriptionPolicy;
    }
    
    public Pinning getPinning() {
        return _pinning;
    }
    
    public Map<VduCpuRequirementsKey, VduCpuRequirements> getVduCpuRequirements() {
        return _vduCpuRequirements;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VirtualCpu>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public VirtualCpuBuilder setClock(final Uint32 value) {
        this._clock = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setClock(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public VirtualCpuBuilder setClock(final Long value) {
        return setClock(CodeHelpers.compatUint(value));
    }
    
    public VirtualCpuBuilder setCpuArchitecture(final String value) {
        this._cpuArchitecture = value;
        return this;
    }
    
    private static void checkNumVirtualCpuRange(final int value) {
        if (value >= 1) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[1..65535]]", value);
    }
    
    public VirtualCpuBuilder setNumVirtualCpu(final Uint16 value) {
        if (value != null) {
            checkNumVirtualCpuRange(value.intValue());
            
        }
        this._numVirtualCpu = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setNumVirtualCpu(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public VirtualCpuBuilder setNumVirtualCpu(final Integer value) {
        return setNumVirtualCpu(CodeHelpers.compatUint(value));
    }
    
    public VirtualCpuBuilder setOversubscriptionPolicy(final String value) {
        this._oversubscriptionPolicy = value;
        return this;
    }
    
    public VirtualCpuBuilder setPinning(final Pinning value) {
        this._pinning = value;
        return this;
    }
    public VirtualCpuBuilder setVduCpuRequirements(final Map<VduCpuRequirementsKey, VduCpuRequirements> values) {
        this._vduCpuRequirements = values;
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
      * @deprecated Use {#link #setVduCpuRequirements(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VirtualCpuBuilder setVduCpuRequirements(final List<VduCpuRequirements> values) {
        return setVduCpuRequirements(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VirtualCpuBuilder addAugmentation(Augmentation<VirtualCpu> augmentation) {
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
    public VirtualCpuBuilder addAugmentation(Class<? extends Augmentation<VirtualCpu>> augmentationType, Augmentation<VirtualCpu> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VirtualCpuBuilder removeAugmentation(Class<? extends Augmentation<VirtualCpu>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VirtualCpuBuilder doAddAugmentation(Class<? extends Augmentation<VirtualCpu>> augmentationType, Augmentation<VirtualCpu> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VirtualCpu build() {
        return new VirtualCpuImpl(this);
    }

    public static final class VirtualCpuImpl
        extends AbstractAugmentable<VirtualCpu>
        implements VirtualCpu {
    
        private final Uint32 _clock;
        private final String _cpuArchitecture;
        @JsonProperty("num-virtual-cpu")
        private final Uint16 _numVirtualCpu;
        private final String _oversubscriptionPolicy;
        private final Pinning _pinning;
        private final Map<VduCpuRequirementsKey, VduCpuRequirements> _vduCpuRequirements;
    
        VirtualCpuImpl(VirtualCpuBuilder base) {
            super(base.augmentation);
            this._clock = base.getClock();
            this._cpuArchitecture = base.getCpuArchitecture();
            this._numVirtualCpu = base.getNumVirtualCpu();
            this._oversubscriptionPolicy = base.getOversubscriptionPolicy();
            this._pinning = base.getPinning();
            this._vduCpuRequirements = CodeHelpers.emptyToNull(base.getVduCpuRequirements());
        }
    
        public VirtualCpuImpl() {
        	this( new VirtualCpuBuilder());
        }                
        
        @Override
        public Uint32 getClock() {
            return _clock;
        }
        
        @Override
        public String getCpuArchitecture() {
            return _cpuArchitecture;
        }
        
        @Override
        public Uint16 getNumVirtualCpu() {
            return _numVirtualCpu;
        }
        
        @Override
        public String getOversubscriptionPolicy() {
            return _oversubscriptionPolicy;
        }
        
        @Override
        public Pinning getPinning() {
            return _pinning;
        }
        
        @Override
        public Map<VduCpuRequirementsKey, VduCpuRequirements> getVduCpuRequirements() {
            return _vduCpuRequirements;
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
            result = prime * result + Objects.hashCode(_clock);
            result = prime * result + Objects.hashCode(_cpuArchitecture);
            result = prime * result + Objects.hashCode(_numVirtualCpu);
            result = prime * result + Objects.hashCode(_oversubscriptionPolicy);
            result = prime * result + Objects.hashCode(_pinning);
            result = prime * result + Objects.hashCode(_vduCpuRequirements);
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
            if (!VirtualCpu.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualCpu other = (VirtualCpu)obj;
            if (!Objects.equals(_clock, other.getClock())) {
                return false;
            }
            if (!Objects.equals(_cpuArchitecture, other.getCpuArchitecture())) {
                return false;
            }
            if (!Objects.equals(_numVirtualCpu, other.getNumVirtualCpu())) {
                return false;
            }
            if (!Objects.equals(_oversubscriptionPolicy, other.getOversubscriptionPolicy())) {
                return false;
            }
            if (!Objects.equals(_pinning, other.getPinning())) {
                return false;
            }
            if (!Objects.equals(_vduCpuRequirements, other.getVduCpuRequirements())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualCpuImpl otherImpl = (VirtualCpuImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VirtualCpu>>, Augmentation<VirtualCpu>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualCpu");
            CodeHelpers.appendValue(helper, "_clock", _clock);
            CodeHelpers.appendValue(helper, "_cpuArchitecture", _cpuArchitecture);
            CodeHelpers.appendValue(helper, "_numVirtualCpu", _numVirtualCpu);
            CodeHelpers.appendValue(helper, "_oversubscriptionPolicy", _oversubscriptionPolicy);
            CodeHelpers.appendValue(helper, "_pinning", _pinning);
            CodeHelpers.appendValue(helper, "_vduCpuRequirements", _vduCpuRequirements);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
