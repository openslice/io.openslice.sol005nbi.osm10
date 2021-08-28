package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.InterfaceType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.ConnectionPointType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.virtual._interface.VirtualInterface;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;

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

    private ConnectionPointType _connectionPointType;
    private String _name;
    private Uint32 _position;
    private InterfaceType _type;
    private VirtualInterface _virtualInterface;
    private InterfaceKey key;


    Map<Class<? extends Augmentation<Interface>>, Augmentation<Interface>> augmentation = Collections.emptyMap();

    public InterfaceBuilder() {
    }
    public InterfaceBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VirtualInterface arg) {
        this._virtualInterface = arg.getVirtualInterface();
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
        this._connectionPointType = base.getConnectionPointType();
        this._position = base.getPosition();
        this._type = base.getType();
        this._virtualInterface = base.getVirtualInterface();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VirtualInterface</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VirtualInterface) {
            this._virtualInterface = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VirtualInterface)arg).getVirtualInterface();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VirtualInterface]");
    }

    public InterfaceKey key() {
        return key;
    }
    
    public ConnectionPointType getConnectionPointType() {
        return _connectionPointType;
    }
    
    public String getName() {
        return _name;
    }
    
    public Uint32 getPosition() {
        return _position;
    }
    
    public InterfaceType getType() {
        return _type;
    }
    
    public VirtualInterface getVirtualInterface() {
        return _virtualInterface;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Interface>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public InterfaceBuilder withKey(final InterfaceKey key) {
        this.key = key;
        return this;
    }
    
    public InterfaceBuilder setConnectionPointType(final ConnectionPointType value) {
        this._connectionPointType = value;
        return this;
    }
    
    public InterfaceBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public InterfaceBuilder setPosition(final Uint32 value) {
        this._position = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setPosition(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public InterfaceBuilder setPosition(final Long value) {
        return setPosition(CodeHelpers.compatUint(value));
    }
    
    public InterfaceBuilder setType(final InterfaceType value) {
        this._type = value;
        return this;
    }
    
    public InterfaceBuilder setVirtualInterface(final VirtualInterface value) {
        this._virtualInterface = value;
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
    
        private final ConnectionPointType _connectionPointType;
        private final String _name;
        private final Uint32 _position;
        private final InterfaceType _type;
        private final VirtualInterface _virtualInterface;
        private final InterfaceKey key;
    
        InterfaceImpl(InterfaceBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new InterfaceKey(base.getName());
            }
            this._name = key.getName();
            this._connectionPointType = base.getConnectionPointType();
            this._position = base.getPosition();
            this._type = base.getType();
            this._virtualInterface = base.getVirtualInterface();
        }
    
        @Override
        public InterfaceKey key() {
            return key;
        }
        
        @Override
        public ConnectionPointType getConnectionPointType() {
            return _connectionPointType;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Uint32 getPosition() {
            return _position;
        }
        
        @Override
        public InterfaceType getType() {
            return _type;
        }
        
        @Override
        public VirtualInterface getVirtualInterface() {
            return _virtualInterface;
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
            result = prime * result + Objects.hashCode(_connectionPointType);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_position);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_virtualInterface);
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
            if (!Objects.equals(_connectionPointType, other.getConnectionPointType())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_position, other.getPosition())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_virtualInterface, other.getVirtualInterface())) {
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
            CodeHelpers.appendValue(helper, "_connectionPointType", _connectionPointType);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_position", _position);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_virtualInterface", _virtualInterface);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
