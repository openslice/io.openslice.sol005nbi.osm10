package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.EndpointType;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link MgmtInterfaceBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     MgmtInterfaceBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new MgmtInterfaceBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of MgmtInterfaceBuilder, as instances can be freely passed around without
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
 * @see MgmtInterfaceBuilder
 * @see Builder
 *
 */
public class MgmtInterfaceBuilder implements Builder<MgmtInterface> {

    private DashboardParams _dashboardParams;
    private EndpointType _endpointType;
    private PortNumber _port;


    Map<Class<? extends Augmentation<MgmtInterface>>, Augmentation<MgmtInterface>> augmentation = Collections.emptyMap();

    public MgmtInterfaceBuilder() {
    }

    public MgmtInterfaceBuilder(MgmtInterface base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<MgmtInterface>>, Augmentation<MgmtInterface>> aug =((AugmentationHolder<MgmtInterface>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._dashboardParams = base.getDashboardParams();
        this._endpointType = base.getEndpointType();
        this._port = base.getPort();
    }


    public DashboardParams getDashboardParams() {
        return _dashboardParams;
    }
    
    public EndpointType getEndpointType() {
        return _endpointType;
    }
    
    public PortNumber getPort() {
        return _port;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<MgmtInterface>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public MgmtInterfaceBuilder setDashboardParams(final DashboardParams value) {
        this._dashboardParams = value;
        return this;
    }
    
    public MgmtInterfaceBuilder setEndpointType(final EndpointType value) {
        this._endpointType = value;
        return this;
    }
    
    public MgmtInterfaceBuilder setPort(final PortNumber value) {
        this._port = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public MgmtInterfaceBuilder addAugmentation(Augmentation<MgmtInterface> augmentation) {
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
    public MgmtInterfaceBuilder addAugmentation(Class<? extends Augmentation<MgmtInterface>> augmentationType, Augmentation<MgmtInterface> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public MgmtInterfaceBuilder removeAugmentation(Class<? extends Augmentation<MgmtInterface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private MgmtInterfaceBuilder doAddAugmentation(Class<? extends Augmentation<MgmtInterface>> augmentationType, Augmentation<MgmtInterface> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public MgmtInterface build() {
        return new MgmtInterfaceImpl(this);
    }

    private static final class MgmtInterfaceImpl
        extends AbstractAugmentable<MgmtInterface>
        implements MgmtInterface {
    
        private final DashboardParams _dashboardParams;
        private final EndpointType _endpointType;
        private final PortNumber _port;
    
        MgmtInterfaceImpl(MgmtInterfaceBuilder base) {
            super(base.augmentation);
            this._dashboardParams = base.getDashboardParams();
            this._endpointType = base.getEndpointType();
            this._port = base.getPort();
        }
    
        @Override
        public DashboardParams getDashboardParams() {
            return _dashboardParams;
        }
        
        @Override
        public EndpointType getEndpointType() {
            return _endpointType;
        }
        
        @Override
        public PortNumber getPort() {
            return _port;
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
            result = prime * result + Objects.hashCode(_dashboardParams);
            result = prime * result + Objects.hashCode(_endpointType);
            result = prime * result + Objects.hashCode(_port);
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
            if (!MgmtInterface.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            MgmtInterface other = (MgmtInterface)obj;
            if (!Objects.equals(_dashboardParams, other.getDashboardParams())) {
                return false;
            }
            if (!Objects.equals(_endpointType, other.getEndpointType())) {
                return false;
            }
            if (!Objects.equals(_port, other.getPort())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MgmtInterfaceImpl otherImpl = (MgmtInterfaceImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MgmtInterface>>, Augmentation<MgmtInterface>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MgmtInterface");
            CodeHelpers.appendValue(helper, "_dashboardParams", _dashboardParams);
            CodeHelpers.appendValue(helper, "_endpointType", _endpointType);
            CodeHelpers.appendValue(helper, "_port", _port);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
