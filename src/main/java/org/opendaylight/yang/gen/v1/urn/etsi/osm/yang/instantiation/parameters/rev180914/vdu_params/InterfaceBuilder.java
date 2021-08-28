package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vdu_params;
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
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link InterfaceBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     InterfaceBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new InterfaceBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of InterfaceBuilder, as instances can be freely passed around without
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
 * @see InterfaceBuilder
 * @see Builder
 *
 */
public class InterfaceBuilder implements Builder<Interface> {

    private IpAddress _ipAddress;
    private MacAddress _macAddress;
    private String _name;
    private Boolean _floatingIpRequired;
    private InterfaceKey key;


    Map<Class<? extends Augmentation<Interface>>, Augmentation<Interface>> augmentation = Collections.emptyMap();

    public InterfaceBuilder() {
    }

    public InterfaceBuilder(Interface base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Interface>>, Augmentation<Interface>> aug =((AugmentationHolder<Interface>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._ipAddress = base.getIpAddress();
        this._macAddress = base.getMacAddress();
        this._floatingIpRequired = base.isFloatingIpRequired();
    }


    public InterfaceKey key() {
        return key;
    }
    
    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    public MacAddress getMacAddress() {
        return _macAddress;
    }
    
    public String getName() {
        return _name;
    }
    
    public Boolean isFloatingIpRequired() {
        return _floatingIpRequired;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Interface>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public InterfaceBuilder withKey(final InterfaceKey key) {
        this.key = key;
        return this;
    }
    
    public InterfaceBuilder setIpAddress(final IpAddress value) {
        this._ipAddress = value;
        return this;
    }
    
    public InterfaceBuilder setMacAddress(final MacAddress value) {
        this._macAddress = value;
        return this;
    }
    
    public InterfaceBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public InterfaceBuilder setFloatingIpRequired(final Boolean value) {
        this._floatingIpRequired = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public InterfaceBuilder addAugmentation(Augmentation<Interface> augmentation) {
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
    public InterfaceBuilder addAugmentation(Class<? extends Augmentation<Interface>> augmentationType, Augmentation<Interface> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public InterfaceBuilder removeAugmentation(Class<? extends Augmentation<Interface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private InterfaceBuilder doAddAugmentation(Class<? extends Augmentation<Interface>> augmentationType, Augmentation<Interface> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Interface build() {
        return new InterfaceImpl(this);
    }

    private static final class InterfaceImpl
        extends AbstractAugmentable<Interface>
        implements Interface {
    
        private final IpAddress _ipAddress;
        private final MacAddress _macAddress;
        private final String _name;
        private final Boolean _floatingIpRequired;
        private final InterfaceKey key;
    
        InterfaceImpl(InterfaceBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new InterfaceKey(base.getName());
            }
            this._name = key.getName();
            this._ipAddress = base.getIpAddress();
            this._macAddress = base.getMacAddress();
            this._floatingIpRequired = base.isFloatingIpRequired();
        }
    
        @Override
        public InterfaceKey key() {
            return key;
        }
        
        @Override
        public IpAddress getIpAddress() {
            return _ipAddress;
        }
        
        @Override
        public MacAddress getMacAddress() {
            return _macAddress;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Boolean isFloatingIpRequired() {
            return _floatingIpRequired;
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
            result = prime * result + Objects.hashCode(_ipAddress);
            result = prime * result + Objects.hashCode(_macAddress);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_floatingIpRequired);
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
            if (!Interface.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Interface other = (Interface)obj;
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (!Objects.equals(_macAddress, other.getMacAddress())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_floatingIpRequired, other.isFloatingIpRequired())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InterfaceImpl otherImpl = (InterfaceImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Interface>>, Augmentation<Interface>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Interface");
            CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
            CodeHelpers.appendValue(helper, "_macAddress", _macAddress);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_floatingIpRequired", _floatingIpRequired);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
