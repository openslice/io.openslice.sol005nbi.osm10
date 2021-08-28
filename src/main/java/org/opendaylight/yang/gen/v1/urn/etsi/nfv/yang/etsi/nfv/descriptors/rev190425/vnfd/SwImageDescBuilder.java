package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Range;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.sw.image.desc.Checksum;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link SwImageDescBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     SwImageDescBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new SwImageDescBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of SwImageDescBuilder, as instances can be freely passed around without
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
 * @see SwImageDescBuilder
 * @see Builder
 *
 */
public class SwImageDescBuilder implements Builder<SwImageDesc> {

    private Checksum _checksum;
    private SwImageDesc.ContainerFormat _containerFormat;
    private SwImageDesc.DiskFormat _diskFormat;
    private String _id;
    private Uri _image;
    private Uint64 _minDisk;
    private BigDecimal _minRam;
    private String _name;
    private String _operatingSystem;
    private Uint64 _size;
    private List<String> _supportedVirtualizationEnvironment;
    private String _version;
    private SwImageDescKey key;


    Map<Class<? extends Augmentation<SwImageDesc>>, Augmentation<SwImageDesc>> augmentation = Collections.emptyMap();

    public SwImageDescBuilder() {
    }

    public SwImageDescBuilder(SwImageDesc base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<SwImageDesc>>, Augmentation<SwImageDesc>> aug =((AugmentationHolder<SwImageDesc>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._checksum = base.getChecksum();
        this._containerFormat = base.getContainerFormat();
        this._diskFormat = base.getDiskFormat();
        this._image = base.getImage();
        this._minDisk = base.getMinDisk();
        this._minRam = base.getMinRam();
        this._name = base.getName();
        this._operatingSystem = base.getOperatingSystem();
        this._size = base.getSize();
        this._supportedVirtualizationEnvironment = base.getSupportedVirtualizationEnvironment();
        this._version = base.getVersion();
    }


    public SwImageDescKey key() {
        return key;
    }
    
    public Checksum getChecksum() {
        return _checksum;
    }
    
    public SwImageDesc.ContainerFormat getContainerFormat() {
        return _containerFormat;
    }
    
    public SwImageDesc.DiskFormat getDiskFormat() {
        return _diskFormat;
    }
    
    public String getId() {
        return _id;
    }
    
    public Uri getImage() {
        return _image;
    }
    
    public Uint64 getMinDisk() {
        return _minDisk;
    }
    
    public BigDecimal getMinRam() {
        return _minRam;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getOperatingSystem() {
        return _operatingSystem;
    }
    
    public Uint64 getSize() {
        return _size;
    }
    
    public List<String> getSupportedVirtualizationEnvironment() {
        return _supportedVirtualizationEnvironment;
    }
    
    public String getVersion() {
        return _version;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<SwImageDesc>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public SwImageDescBuilder withKey(final SwImageDescKey key) {
        this.key = key;
        return this;
    }
    
    public SwImageDescBuilder setChecksum(final Checksum value) {
        this._checksum = value;
        return this;
    }
    
    public SwImageDescBuilder setContainerFormat(final SwImageDesc.ContainerFormat value) {
        this._containerFormat = value;
        return this;
    }
    
    public SwImageDescBuilder setDiskFormat(final SwImageDesc.DiskFormat value) {
        this._diskFormat = value;
        return this;
    }
    
    public SwImageDescBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public SwImageDescBuilder setImage(final Uri value) {
        this._image = value;
        return this;
    }
    
    public SwImageDescBuilder setMinDisk(final Uint64 value) {
        this._minDisk = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setMinDisk(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public SwImageDescBuilder setMinDisk(final BigInteger value) {
        return setMinDisk(CodeHelpers.compatUint(value));
    }
    
    private static final Range<java.math.BigDecimal>[] CHECKMINRAMRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigDecimal>[] a = (Range<java.math.BigDecimal>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigDecimal.ZERO, new java.math.BigDecimal("922337203685477580.7"));
        CHECKMINRAMRANGE_RANGES = a;
    }
    private static void checkMinRamRange(final java.math.BigDecimal value) {
        for (Range<java.math.BigDecimal> r : CHECKMINRAMRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKMINRAMRANGE_RANGES, value);
    }
    
    public SwImageDescBuilder setMinRam(final BigDecimal value) {
        if (value != null) {
            checkMinRamRange(value);
            
        }
        this._minRam = value;
        return this;
    }
    
    public SwImageDescBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public SwImageDescBuilder setOperatingSystem(final String value) {
        this._operatingSystem = value;
        return this;
    }
    
    public SwImageDescBuilder setSize(final Uint64 value) {
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
    public SwImageDescBuilder setSize(final BigInteger value) {
        return setSize(CodeHelpers.compatUint(value));
    }
    public SwImageDescBuilder setSupportedVirtualizationEnvironment(final List<String> values) {
        this._supportedVirtualizationEnvironment = values;
        return this;
    }
    
    
    public SwImageDescBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public SwImageDescBuilder addAugmentation(Augmentation<SwImageDesc> augmentation) {
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
    public SwImageDescBuilder addAugmentation(Class<? extends Augmentation<SwImageDesc>> augmentationType, Augmentation<SwImageDesc> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public SwImageDescBuilder removeAugmentation(Class<? extends Augmentation<SwImageDesc>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private SwImageDescBuilder doAddAugmentation(Class<? extends Augmentation<SwImageDesc>> augmentationType, Augmentation<SwImageDesc> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public SwImageDesc build() {
        return new SwImageDescImpl(this);
    }

    private static final class SwImageDescImpl
        extends AbstractAugmentable<SwImageDesc>
        implements SwImageDesc {
    
        private final Checksum _checksum;
        private final SwImageDesc.ContainerFormat _containerFormat;
        private final SwImageDesc.DiskFormat _diskFormat;
        private final String _id;
        private final Uri _image;
        private final Uint64 _minDisk;
        private final BigDecimal _minRam;
        private final String _name;
        private final String _operatingSystem;
        private final Uint64 _size;
        private final List<String> _supportedVirtualizationEnvironment;
        private final String _version;
        private final SwImageDescKey key;
    
        SwImageDescImpl(SwImageDescBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new SwImageDescKey(base.getId());
            }
            this._id = key.getId();
            this._checksum = base.getChecksum();
            this._containerFormat = base.getContainerFormat();
            this._diskFormat = base.getDiskFormat();
            this._image = base.getImage();
            this._minDisk = base.getMinDisk();
            this._minRam = base.getMinRam();
            this._name = base.getName();
            this._operatingSystem = base.getOperatingSystem();
            this._size = base.getSize();
            this._supportedVirtualizationEnvironment = base.getSupportedVirtualizationEnvironment();
            this._version = base.getVersion();
        }
    
        @Override
        public SwImageDescKey key() {
            return key;
        }
        
        @Override
        public Checksum getChecksum() {
            return _checksum;
        }
        
        @Override
        public SwImageDesc.ContainerFormat getContainerFormat() {
            return _containerFormat;
        }
        
        @Override
        public SwImageDesc.DiskFormat getDiskFormat() {
            return _diskFormat;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Uri getImage() {
            return _image;
        }
        
        @Override
        public Uint64 getMinDisk() {
            return _minDisk;
        }
        
        @Override
        public BigDecimal getMinRam() {
            return _minRam;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getOperatingSystem() {
            return _operatingSystem;
        }
        
        @Override
        public Uint64 getSize() {
            return _size;
        }
        
        @Override
        public List<String> getSupportedVirtualizationEnvironment() {
            return _supportedVirtualizationEnvironment;
        }
        
        @Override
        public String getVersion() {
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
            result = prime * result + Objects.hashCode(_checksum);
            result = prime * result + Objects.hashCode(_containerFormat);
            result = prime * result + Objects.hashCode(_diskFormat);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_image);
            result = prime * result + Objects.hashCode(_minDisk);
            result = prime * result + Objects.hashCode(_minRam);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operatingSystem);
            result = prime * result + Objects.hashCode(_size);
            result = prime * result + Objects.hashCode(_supportedVirtualizationEnvironment);
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
            if (!SwImageDesc.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            SwImageDesc other = (SwImageDesc)obj;
            if (!Objects.equals(_checksum, other.getChecksum())) {
                return false;
            }
            if (!Objects.equals(_containerFormat, other.getContainerFormat())) {
                return false;
            }
            if (!Objects.equals(_diskFormat, other.getDiskFormat())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_image, other.getImage())) {
                return false;
            }
            if (!Objects.equals(_minDisk, other.getMinDisk())) {
                return false;
            }
            if (!Objects.equals(_minRam, other.getMinRam())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operatingSystem, other.getOperatingSystem())) {
                return false;
            }
            if (!Objects.equals(_size, other.getSize())) {
                return false;
            }
            if (!Objects.equals(_supportedVirtualizationEnvironment, other.getSupportedVirtualizationEnvironment())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SwImageDescImpl otherImpl = (SwImageDescImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SwImageDesc>>, Augmentation<SwImageDesc>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SwImageDesc");
            CodeHelpers.appendValue(helper, "_checksum", _checksum);
            CodeHelpers.appendValue(helper, "_containerFormat", _containerFormat);
            CodeHelpers.appendValue(helper, "_diskFormat", _diskFormat);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_image", _image);
            CodeHelpers.appendValue(helper, "_minDisk", _minDisk);
            CodeHelpers.appendValue(helper, "_minRam", _minRam);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_operatingSystem", _operatingSystem);
            CodeHelpers.appendValue(helper, "_size", _size);
            CodeHelpers.appendValue(helper, "_supportedVirtualizationEnvironment", _supportedVirtualizationEnvironment);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
