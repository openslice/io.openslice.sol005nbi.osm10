package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
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
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo.DeviceBus;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo.DeviceType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.volume.info.VolumeSource;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link VolumesBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VolumesBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VolumesBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VolumesBuilder, as instances can be freely passed around without
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
 * @see VolumesBuilder
 * @see Builder
 *
 */
public class VolumesBuilder implements Builder<Volumes> {

    private String _description;
    private DeviceBus _deviceBus;
    private DeviceType _deviceType;
    private String _name;
    private Uint64 _size;
    private String _volumeId;
    private VolumeSource _volumeSource;
    private VolumesKey key;


    Map<Class<? extends Augmentation<Volumes>>, Augmentation<Volumes>> augmentation = Collections.emptyMap();

    public VolumesBuilder() {
    }
    public VolumesBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo arg) {
        this._description = arg.getDescription();
        this._size = arg.getSize();
        this._volumeSource = arg.getVolumeSource();
        this._deviceBus = arg.getDeviceBus();
        this._deviceType = arg.getDeviceType();
    }

    public VolumesBuilder(Volumes base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Volumes>>, Augmentation<Volumes>> aug =((AugmentationHolder<Volumes>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._description = base.getDescription();
        this._deviceBus = base.getDeviceBus();
        this._deviceType = base.getDeviceType();
        this._size = base.getSize();
        this._volumeId = base.getVolumeId();
        this._volumeSource = base.getVolumeSource();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo) {
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo)arg).getDescription();
            this._size = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo)arg).getSize();
            this._volumeSource = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo)arg).getVolumeSource();
            this._deviceBus = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo)arg).getDeviceBus();
            this._deviceType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo)arg).getDeviceType();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo]");
    }

    public VolumesKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public DeviceBus getDeviceBus() {
        return _deviceBus;
    }
    
    public DeviceType getDeviceType() {
        return _deviceType;
    }
    
    public String getName() {
        return _name;
    }
    
    public Uint64 getSize() {
        return _size;
    }
    
    public String getVolumeId() {
        return _volumeId;
    }
    
    public VolumeSource getVolumeSource() {
        return _volumeSource;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Volumes>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VolumesBuilder withKey(final VolumesKey key) {
        this.key = key;
        return this;
    }
    
    public VolumesBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public VolumesBuilder setDeviceBus(final DeviceBus value) {
        this._deviceBus = value;
        return this;
    }
    
    public VolumesBuilder setDeviceType(final DeviceType value) {
        this._deviceType = value;
        return this;
    }
    
    public VolumesBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VolumesBuilder setSize(final Uint64 value) {
        this._size = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setSize(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public VolumesBuilder setSize(final BigInteger value) {
        return setSize(CodeHelpers.compatUint(value));
    }
    
    public VolumesBuilder setVolumeId(final String value) {
        this._volumeId = value;
        return this;
    }
    
    public VolumesBuilder setVolumeSource(final VolumeSource value) {
        this._volumeSource = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VolumesBuilder addAugmentation(Augmentation<Volumes> augmentation) {
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
    public VolumesBuilder addAugmentation(Class<? extends Augmentation<Volumes>> augmentationType, Augmentation<Volumes> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VolumesBuilder removeAugmentation(Class<? extends Augmentation<Volumes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VolumesBuilder doAddAugmentation(Class<? extends Augmentation<Volumes>> augmentationType, Augmentation<Volumes> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Volumes build() {
        return new VolumesImpl(this);
    }

    private static final class VolumesImpl
        extends AbstractAugmentable<Volumes>
        implements Volumes {
    
        private final String _description;
        private final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo.DeviceBus _deviceBus;
        private final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo.DeviceType _deviceType;
        private final String _name;
        private final Uint64 _size;
        private final String _volumeId;
        private final VolumeSource _volumeSource;
        private final VolumesKey key;
    
        VolumesImpl(VolumesBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VolumesKey(base.getName());
            }
            this._name = key.getName();
            this._description = base.getDescription();
            this._deviceBus = base.getDeviceBus();
            this._deviceType = base.getDeviceType();
            this._size = base.getSize();
            this._volumeId = base.getVolumeId();
            this._volumeSource = base.getVolumeSource();
        }
    
        @Override
        public VolumesKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo.DeviceBus getDeviceBus() {
            return _deviceBus;
        }
        
        @Override
        public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo.DeviceType getDeviceType() {
            return _deviceType;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Uint64 getSize() {
            return _size;
        }
        
        @Override
        public String getVolumeId() {
            return _volumeId;
        }
        
        @Override
        public VolumeSource getVolumeSource() {
            return _volumeSource;
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
            result = prime * result + Objects.hashCode(_deviceBus);
            result = prime * result + Objects.hashCode(_deviceType);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_size);
            result = prime * result + Objects.hashCode(_volumeId);
            result = prime * result + Objects.hashCode(_volumeSource);
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
            if (!Volumes.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Volumes other = (Volumes)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_deviceBus, other.getDeviceBus())) {
                return false;
            }
            if (!Objects.equals(_deviceType, other.getDeviceType())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_size, other.getSize())) {
                return false;
            }
            if (!Objects.equals(_volumeId, other.getVolumeId())) {
                return false;
            }
            if (!Objects.equals(_volumeSource, other.getVolumeSource())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VolumesImpl otherImpl = (VolumesImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Volumes>>, Augmentation<Volumes>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Volumes");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_deviceBus", _deviceBus);
            CodeHelpers.appendValue(helper, "_deviceType", _deviceType);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_size", _size);
            CodeHelpers.appendValue(helper, "_volumeId", _volumeId);
            CodeHelpers.appendValue(helper, "_volumeSource", _volumeSource);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
