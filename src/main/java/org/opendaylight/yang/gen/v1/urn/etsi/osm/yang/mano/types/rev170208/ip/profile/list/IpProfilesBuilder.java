package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.list;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.IpProfileParams;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link IpProfilesBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     IpProfilesBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new IpProfilesBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of IpProfilesBuilder, as instances can be freely passed around without
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
 * @see IpProfilesBuilder
 * @see Builder
 *
 */
public class IpProfilesBuilder implements Builder<IpProfiles> {

    private String _description;
    private IpProfileParams _ipProfileParams;
    private String _name;
    private IpProfilesKey key;


    Map<Class<? extends Augmentation<IpProfiles>>, Augmentation<IpProfiles>> augmentation = Collections.emptyMap();

    public IpProfilesBuilder() {
    }
    public IpProfilesBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileInfo arg) {
        this._ipProfileParams = arg.getIpProfileParams();
    }

    public IpProfilesBuilder(IpProfiles base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<IpProfiles>>, Augmentation<IpProfiles>> aug =((AugmentationHolder<IpProfiles>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._description = base.getDescription();
        this._ipProfileParams = base.getIpProfileParams();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileInfo) {
            this._ipProfileParams = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileInfo)arg).getIpProfileParams();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileInfo]");
    }

    public IpProfilesKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public IpProfileParams getIpProfileParams() {
        return _ipProfileParams;
    }
    
    public String getName() {
        return _name;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<IpProfiles>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public IpProfilesBuilder withKey(final IpProfilesKey key) {
        this.key = key;
        return this;
    }
    
    public IpProfilesBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public IpProfilesBuilder setIpProfileParams(final IpProfileParams value) {
        this._ipProfileParams = value;
        return this;
    }
    
    public IpProfilesBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public IpProfilesBuilder addAugmentation(Augmentation<IpProfiles> augmentation) {
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
    public IpProfilesBuilder addAugmentation(Class<? extends Augmentation<IpProfiles>> augmentationType, Augmentation<IpProfiles> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public IpProfilesBuilder removeAugmentation(Class<? extends Augmentation<IpProfiles>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private IpProfilesBuilder doAddAugmentation(Class<? extends Augmentation<IpProfiles>> augmentationType, Augmentation<IpProfiles> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public IpProfiles build() {
        return new IpProfilesImpl(this);
    }

    private static final class IpProfilesImpl
        extends AbstractAugmentable<IpProfiles>
        implements IpProfiles {
    
        private final String _description;
        private final IpProfileParams _ipProfileParams;
        private final String _name;
        private final IpProfilesKey key;
    
        IpProfilesImpl(IpProfilesBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new IpProfilesKey(base.getName());
            }
            this._name = key.getName();
            this._description = base.getDescription();
            this._ipProfileParams = base.getIpProfileParams();
        }
    
        @Override
        public IpProfilesKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public IpProfileParams getIpProfileParams() {
            return _ipProfileParams;
        }
        
        @Override
        public String getName() {
            return _name;
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
            result = prime * result + Objects.hashCode(_ipProfileParams);
            result = prime * result + Objects.hashCode(_name);
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
            if (!IpProfiles.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            IpProfiles other = (IpProfiles)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_ipProfileParams, other.getIpProfileParams())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IpProfilesImpl otherImpl = (IpProfilesImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<IpProfiles>>, Augmentation<IpProfiles>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("IpProfiles");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_ipProfileParams", _ipProfileParams);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
