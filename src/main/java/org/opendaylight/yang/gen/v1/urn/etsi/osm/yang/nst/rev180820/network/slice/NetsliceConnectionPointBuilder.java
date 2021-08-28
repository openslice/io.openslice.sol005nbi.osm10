package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.slice.connection.points.Connection;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetsliceConnectionPointBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NetsliceConnectionPointBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NetsliceConnectionPointBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NetsliceConnectionPointBuilder, as instances can be freely passed around without
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
 * @see NetsliceConnectionPointBuilder
 * @see Builder
 *
 */
public class NetsliceConnectionPointBuilder implements Builder<NetsliceConnectionPoint> {

    private Connection _connection;
    private String _name;
    private Boolean _floatingIpRequired;
    private NetsliceConnectionPointKey key;


    Map<Class<? extends Augmentation<NetsliceConnectionPoint>>, Augmentation<NetsliceConnectionPoint>> augmentation = Collections.emptyMap();

    public NetsliceConnectionPointBuilder() {
    }
    public NetsliceConnectionPointBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.SliceConnectionPoints arg) {
        this._connection = arg.getConnection();
        this._name = arg.getName();
        this._floatingIpRequired = arg.isFloatingIpRequired();
    }
    public NetsliceConnectionPointBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon arg) {
        this._name = arg.getName();
        this._floatingIpRequired = arg.isFloatingIpRequired();
    }

    public NetsliceConnectionPointBuilder(NetsliceConnectionPoint base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NetsliceConnectionPoint>>, Augmentation<NetsliceConnectionPoint>> aug =((AugmentationHolder<NetsliceConnectionPoint>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._connection = base.getConnection();
        this._floatingIpRequired = base.isFloatingIpRequired();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.SliceConnectionPoints</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.SliceConnectionPoints) {
            this._connection = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.SliceConnectionPoints)arg).getConnection();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon)arg).getName();
            this._floatingIpRequired = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon)arg).isFloatingIpRequired();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.SliceConnectionPoints, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon]");
    }

    public NetsliceConnectionPointKey key() {
        return key;
    }
    
    public Connection getConnection() {
        return _connection;
    }
    
    public String getName() {
        return _name;
    }
    
    public Boolean isFloatingIpRequired() {
        return _floatingIpRequired;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<NetsliceConnectionPoint>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NetsliceConnectionPointBuilder withKey(final NetsliceConnectionPointKey key) {
        this.key = key;
        return this;
    }
    
    public NetsliceConnectionPointBuilder setConnection(final Connection value) {
        this._connection = value;
        return this;
    }
    
    public NetsliceConnectionPointBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public NetsliceConnectionPointBuilder setFloatingIpRequired(final Boolean value) {
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
    public NetsliceConnectionPointBuilder addAugmentation(Augmentation<NetsliceConnectionPoint> augmentation) {
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
    public NetsliceConnectionPointBuilder addAugmentation(Class<? extends Augmentation<NetsliceConnectionPoint>> augmentationType, Augmentation<NetsliceConnectionPoint> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NetsliceConnectionPointBuilder removeAugmentation(Class<? extends Augmentation<NetsliceConnectionPoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NetsliceConnectionPointBuilder doAddAugmentation(Class<? extends Augmentation<NetsliceConnectionPoint>> augmentationType, Augmentation<NetsliceConnectionPoint> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public NetsliceConnectionPoint build() {
        return new NetsliceConnectionPointImpl(this);
    }

    private static final class NetsliceConnectionPointImpl
        extends AbstractAugmentable<NetsliceConnectionPoint>
        implements NetsliceConnectionPoint {
    
        private final Connection _connection;
        private final String _name;
        private final Boolean _floatingIpRequired;
        private final NetsliceConnectionPointKey key;
    
        NetsliceConnectionPointImpl(NetsliceConnectionPointBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetsliceConnectionPointKey(base.getName());
            }
            this._name = key.getName();
            this._connection = base.getConnection();
            this._floatingIpRequired = base.isFloatingIpRequired();
        }
    
        @Override
        public NetsliceConnectionPointKey key() {
            return key;
        }
        
        @Override
        public Connection getConnection() {
            return _connection;
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
            result = prime * result + Objects.hashCode(_connection);
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
            if (!NetsliceConnectionPoint.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            NetsliceConnectionPoint other = (NetsliceConnectionPoint)obj;
            if (!Objects.equals(_connection, other.getConnection())) {
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
                NetsliceConnectionPointImpl otherImpl = (NetsliceConnectionPointImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NetsliceConnectionPoint>>, Augmentation<NetsliceConnectionPoint>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetsliceConnectionPoint");
            CodeHelpers.appendValue(helper, "_connection", _connection);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_floatingIpRequired", _floatingIpRequired);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
