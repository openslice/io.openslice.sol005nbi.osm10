package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudAccountType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.CloudProvider;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfdPlacementGroupMapsBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VnfdPlacementGroupMapsBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VnfdPlacementGroupMapsBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VnfdPlacementGroupMapsBuilder, as instances can be freely passed around without
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
 * @see VnfdPlacementGroupMapsBuilder
 * @see Builder
 *
 */
public class VnfdPlacementGroupMapsBuilder implements Builder<VnfdPlacementGroupMaps> {

    private CloudProvider _cloudProvider;
    private CloudAccountType _cloudType;
    private Object _placementGroupRef;
    private Uuid _vnfdIdRef;
    private VnfdPlacementGroupMapsKey key;


    Map<Class<? extends Augmentation<VnfdPlacementGroupMaps>>, Augmentation<VnfdPlacementGroupMaps>> augmentation = Collections.emptyMap();

    public VnfdPlacementGroupMapsBuilder() {
    }
    public VnfdPlacementGroupMapsBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput arg) {
        this._cloudType = arg.getCloudType();
        this._cloudProvider = arg.getCloudProvider();
    }

    public VnfdPlacementGroupMapsBuilder(VnfdPlacementGroupMaps base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfdPlacementGroupMaps>>, Augmentation<VnfdPlacementGroupMaps>> aug =((AugmentationHolder<VnfdPlacementGroupMaps>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._placementGroupRef = base.getPlacementGroupRef();
        this._vnfdIdRef = base.getVnfdIdRef();
        this._cloudProvider = base.getCloudProvider();
        this._cloudType = base.getCloudType();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput) {
            this._cloudType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput)arg).getCloudType();
            this._cloudProvider = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput)arg).getCloudProvider();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput]");
    }

    public VnfdPlacementGroupMapsKey key() {
        return key;
    }
    
    public CloudProvider getCloudProvider() {
        return _cloudProvider;
    }
    
    public CloudAccountType getCloudType() {
        return _cloudType;
    }
    
    public Object getPlacementGroupRef() {
        return _placementGroupRef;
    }
    
    public Uuid getVnfdIdRef() {
        return _vnfdIdRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VnfdPlacementGroupMaps>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VnfdPlacementGroupMapsBuilder withKey(final VnfdPlacementGroupMapsKey key) {
        this.key = key;
        return this;
    }
    
    public VnfdPlacementGroupMapsBuilder setCloudProvider(final CloudProvider value) {
        this._cloudProvider = value;
        return this;
    }
    
    public VnfdPlacementGroupMapsBuilder setCloudType(final CloudAccountType value) {
        this._cloudType = value;
        return this;
    }
    
    public VnfdPlacementGroupMapsBuilder setPlacementGroupRef(final Object value) {
        this._placementGroupRef = value;
        return this;
    }
    
    public VnfdPlacementGroupMapsBuilder setVnfdIdRef(final Uuid value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VnfdPlacementGroupMapsBuilder addAugmentation(Augmentation<VnfdPlacementGroupMaps> augmentation) {
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
    public VnfdPlacementGroupMapsBuilder addAugmentation(Class<? extends Augmentation<VnfdPlacementGroupMaps>> augmentationType, Augmentation<VnfdPlacementGroupMaps> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VnfdPlacementGroupMapsBuilder removeAugmentation(Class<? extends Augmentation<VnfdPlacementGroupMaps>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VnfdPlacementGroupMapsBuilder doAddAugmentation(Class<? extends Augmentation<VnfdPlacementGroupMaps>> augmentationType, Augmentation<VnfdPlacementGroupMaps> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VnfdPlacementGroupMaps build() {
        return new VnfdPlacementGroupMapsImpl(this);
    }

    private static final class VnfdPlacementGroupMapsImpl
        extends AbstractAugmentable<VnfdPlacementGroupMaps>
        implements VnfdPlacementGroupMaps {
    
        private final CloudProvider _cloudProvider;
        private final CloudAccountType _cloudType;
        private final Object _placementGroupRef;
        private final Uuid _vnfdIdRef;
        private final VnfdPlacementGroupMapsKey key;
    
        VnfdPlacementGroupMapsImpl(VnfdPlacementGroupMapsBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfdPlacementGroupMapsKey(base.getPlacementGroupRef(), base.getVnfdIdRef());
            }
            this._placementGroupRef = key.getPlacementGroupRef();
            this._vnfdIdRef = key.getVnfdIdRef();
            this._cloudProvider = base.getCloudProvider();
            this._cloudType = base.getCloudType();
        }
    
        @Override
        public VnfdPlacementGroupMapsKey key() {
            return key;
        }
        
        @Override
        public CloudProvider getCloudProvider() {
            return _cloudProvider;
        }
        
        @Override
        public CloudAccountType getCloudType() {
            return _cloudType;
        }
        
        @Override
        public Object getPlacementGroupRef() {
            return _placementGroupRef;
        }
        
        @Override
        public Uuid getVnfdIdRef() {
            return _vnfdIdRef;
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
            result = prime * result + Objects.hashCode(_cloudProvider);
            result = prime * result + Objects.hashCode(_cloudType);
            result = prime * result + Objects.hashCode(_placementGroupRef);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
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
            if (!VnfdPlacementGroupMaps.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VnfdPlacementGroupMaps other = (VnfdPlacementGroupMaps)obj;
            if (!Objects.equals(_cloudProvider, other.getCloudProvider())) {
                return false;
            }
            if (!Objects.equals(_cloudType, other.getCloudType())) {
                return false;
            }
            if (!Objects.equals(_placementGroupRef, other.getPlacementGroupRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdPlacementGroupMapsImpl otherImpl = (VnfdPlacementGroupMapsImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfdPlacementGroupMaps>>, Augmentation<VnfdPlacementGroupMaps>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfdPlacementGroupMaps");
            CodeHelpers.appendValue(helper, "_cloudProvider", _cloudProvider);
            CodeHelpers.appendValue(helper, "_cloudType", _cloudType);
            CodeHelpers.appendValue(helper, "_placementGroupRef", _placementGroupRef);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
