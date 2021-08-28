package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider;
import com.google.common.base.MoreObjects;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.aggregate.HostAggregate;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.aggregate.HostAggregateKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider.openstack.AvailabilityZone;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider.openstack.ServerGroup;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link OpenstackBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     OpenstackBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new OpenstackBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of OpenstackBuilder, as instances can be freely passed around without
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
 * @see OpenstackBuilder
 * @see Builder
 *
 */
public class OpenstackBuilder implements Builder<Openstack> {

    private AvailabilityZone _availabilityZone;
    private Map<HostAggregateKey, HostAggregate> _hostAggregate;
    private ServerGroup _serverGroup;


    Map<Class<? extends Augmentation<Openstack>>, Augmentation<Openstack>> augmentation = Collections.emptyMap();

    public OpenstackBuilder() {
    }
    public OpenstackBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostAggregate arg) {
        this._hostAggregate = arg.getHostAggregate();
    }

    public OpenstackBuilder(Openstack base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Openstack>>, Augmentation<Openstack>> aug =((AugmentationHolder<Openstack>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._availabilityZone = base.getAvailabilityZone();
        this._hostAggregate = base.getHostAggregate();
        this._serverGroup = base.getServerGroup();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostAggregate</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostAggregate) {
            this._hostAggregate = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostAggregate)arg).getHostAggregate();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostAggregate]");
    }

    public AvailabilityZone getAvailabilityZone() {
        return _availabilityZone;
    }
    
    public Map<HostAggregateKey, HostAggregate> getHostAggregate() {
        return _hostAggregate;
    }
    
    public ServerGroup getServerGroup() {
        return _serverGroup;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Openstack>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public OpenstackBuilder setAvailabilityZone(final AvailabilityZone value) {
        this._availabilityZone = value;
        return this;
    }
    public OpenstackBuilder setHostAggregate(final Map<HostAggregateKey, HostAggregate> values) {
        this._hostAggregate = values;
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
      * @deprecated Use {#link #setHostAggregate(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public OpenstackBuilder setHostAggregate(final List<HostAggregate> values) {
        return setHostAggregate(CodeHelpers.compatMap(values));
    }
    
    public OpenstackBuilder setServerGroup(final ServerGroup value) {
        this._serverGroup = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public OpenstackBuilder addAugmentation(Augmentation<Openstack> augmentation) {
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
    public OpenstackBuilder addAugmentation(Class<? extends Augmentation<Openstack>> augmentationType, Augmentation<Openstack> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public OpenstackBuilder removeAugmentation(Class<? extends Augmentation<Openstack>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private OpenstackBuilder doAddAugmentation(Class<? extends Augmentation<Openstack>> augmentationType, Augmentation<Openstack> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Openstack build() {
        return new OpenstackImpl(this);
    }

    private static final class OpenstackImpl
        extends AbstractAugmentable<Openstack>
        implements Openstack {
    
        private final AvailabilityZone _availabilityZone;
        private final Map<HostAggregateKey, HostAggregate> _hostAggregate;
        private final ServerGroup _serverGroup;
    
        OpenstackImpl(OpenstackBuilder base) {
            super(base.augmentation);
            this._availabilityZone = base.getAvailabilityZone();
            this._hostAggregate = CodeHelpers.emptyToNull(base.getHostAggregate());
            this._serverGroup = base.getServerGroup();
        }
    
        @Override
        public AvailabilityZone getAvailabilityZone() {
            return _availabilityZone;
        }
        
        @Override
        public Map<HostAggregateKey, HostAggregate> getHostAggregate() {
            return _hostAggregate;
        }
        
        @Override
        public ServerGroup getServerGroup() {
            return _serverGroup;
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
            result = prime * result + Objects.hashCode(_availabilityZone);
            result = prime * result + Objects.hashCode(_hostAggregate);
            result = prime * result + Objects.hashCode(_serverGroup);
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
            if (!Openstack.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Openstack other = (Openstack)obj;
            if (!Objects.equals(_availabilityZone, other.getAvailabilityZone())) {
                return false;
            }
            if (!Objects.equals(_hostAggregate, other.getHostAggregate())) {
                return false;
            }
            if (!Objects.equals(_serverGroup, other.getServerGroup())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OpenstackImpl otherImpl = (OpenstackImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Openstack>>, Augmentation<Openstack>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Openstack");
            CodeHelpers.appendValue(helper, "_availabilityZone", _availabilityZone);
            CodeHelpers.appendValue(helper, "_hostAggregate", _hostAggregate);
            CodeHelpers.appendValue(helper, "_serverGroup", _serverGroup);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
