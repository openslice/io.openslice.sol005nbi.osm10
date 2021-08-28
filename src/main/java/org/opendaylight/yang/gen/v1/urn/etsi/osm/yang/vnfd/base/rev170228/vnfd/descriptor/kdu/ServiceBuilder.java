package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ServiceBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ServiceBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ServiceBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ServiceBuilder, as instances can be freely passed around without
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
 * @see ServiceBuilder
 * @see Builder
 *
 */
public class ServiceBuilder implements Builder<Service> {

    private String _externalConnectionPointRef;
    private String _name;
    private Boolean _mgmtService;
    private ServiceKey key;


    Map<Class<? extends Augmentation<Service>>, Augmentation<Service>> augmentation = Collections.emptyMap();

    public ServiceBuilder() {
    }

    public ServiceBuilder(Service base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Service>>, Augmentation<Service>> aug =((AugmentationHolder<Service>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._externalConnectionPointRef = base.getExternalConnectionPointRef();
        this._mgmtService = base.isMgmtService();
    }


    public ServiceKey key() {
        return key;
    }
    
    public String getExternalConnectionPointRef() {
        return _externalConnectionPointRef;
    }
    
    public String getName() {
        return _name;
    }
    
    public Boolean isMgmtService() {
        return _mgmtService;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Service>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ServiceBuilder withKey(final ServiceKey key) {
        this.key = key;
        return this;
    }
    
    public ServiceBuilder setExternalConnectionPointRef(final String value) {
        this._externalConnectionPointRef = value;
        return this;
    }
    
    public ServiceBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ServiceBuilder setMgmtService(final Boolean value) {
        this._mgmtService = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ServiceBuilder addAugmentation(Augmentation<Service> augmentation) {
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
    public ServiceBuilder addAugmentation(Class<? extends Augmentation<Service>> augmentationType, Augmentation<Service> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ServiceBuilder removeAugmentation(Class<? extends Augmentation<Service>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ServiceBuilder doAddAugmentation(Class<? extends Augmentation<Service>> augmentationType, Augmentation<Service> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Service build() {
        return new ServiceImpl(this);
    }

    private static final class ServiceImpl
        extends AbstractAugmentable<Service>
        implements Service {
    
        private final String _externalConnectionPointRef;
        private final String _name;
        private final Boolean _mgmtService;
        private final ServiceKey key;
    
        ServiceImpl(ServiceBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ServiceKey(base.getName());
            }
            this._name = key.getName();
            this._externalConnectionPointRef = base.getExternalConnectionPointRef();
            this._mgmtService = base.isMgmtService();
        }
    
        @Override
        public ServiceKey key() {
            return key;
        }
        
        @Override
        public String getExternalConnectionPointRef() {
            return _externalConnectionPointRef;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Boolean isMgmtService() {
            return _mgmtService;
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
            result = prime * result + Objects.hashCode(_externalConnectionPointRef);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_mgmtService);
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
            if (!Service.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Service other = (Service)obj;
            if (!Objects.equals(_externalConnectionPointRef, other.getExternalConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_mgmtService, other.isMgmtService())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ServiceImpl otherImpl = (ServiceImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Service>>, Augmentation<Service>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Service");
            CodeHelpers.appendValue(helper, "_externalConnectionPointRef", _externalConnectionPointRef);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_mgmtService", _mgmtService);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
