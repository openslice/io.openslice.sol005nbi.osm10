package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.monitoring.param;
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
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VduMonitoringParamBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VduMonitoringParamBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VduMonitoringParamBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VduMonitoringParamBuilder, as instances can be freely passed around without
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
 * @see VduMonitoringParamBuilder
 * @see Builder
 *
 */
public class VduMonitoringParamBuilder implements Builder<VduMonitoringParam> {

    private Object _vduMonitoringParamRef;
    private Uuid _vduRef;


    Map<Class<? extends Augmentation<VduMonitoringParam>>, Augmentation<VduMonitoringParam>> augmentation = Collections.emptyMap();

    public VduMonitoringParamBuilder() {
    }

    public VduMonitoringParamBuilder(VduMonitoringParam base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VduMonitoringParam>>, Augmentation<VduMonitoringParam>> aug =((AugmentationHolder<VduMonitoringParam>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._vduMonitoringParamRef = base.getVduMonitoringParamRef();
        this._vduRef = base.getVduRef();
    }


    public Object getVduMonitoringParamRef() {
        return _vduMonitoringParamRef;
    }
    
    public Uuid getVduRef() {
        return _vduRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VduMonitoringParam>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public VduMonitoringParamBuilder setVduMonitoringParamRef(final Object value) {
        this._vduMonitoringParamRef = value;
        return this;
    }
    
    public VduMonitoringParamBuilder setVduRef(final Uuid value) {
        this._vduRef = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VduMonitoringParamBuilder addAugmentation(Augmentation<VduMonitoringParam> augmentation) {
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
    public VduMonitoringParamBuilder addAugmentation(Class<? extends Augmentation<VduMonitoringParam>> augmentationType, Augmentation<VduMonitoringParam> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VduMonitoringParamBuilder removeAugmentation(Class<? extends Augmentation<VduMonitoringParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VduMonitoringParamBuilder doAddAugmentation(Class<? extends Augmentation<VduMonitoringParam>> augmentationType, Augmentation<VduMonitoringParam> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VduMonitoringParam build() {
        return new VduMonitoringParamImpl(this);
    }

    private static final class VduMonitoringParamImpl
        extends AbstractAugmentable<VduMonitoringParam>
        implements VduMonitoringParam {
    
        private final Object _vduMonitoringParamRef;
        private final Uuid _vduRef;
    
        VduMonitoringParamImpl(VduMonitoringParamBuilder base) {
            super(base.augmentation);
            this._vduMonitoringParamRef = base.getVduMonitoringParamRef();
            this._vduRef = base.getVduRef();
        }
    
        @Override
        public Object getVduMonitoringParamRef() {
            return _vduMonitoringParamRef;
        }
        
        @Override
        public Uuid getVduRef() {
            return _vduRef;
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
            result = prime * result + Objects.hashCode(_vduMonitoringParamRef);
            result = prime * result + Objects.hashCode(_vduRef);
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
            if (!VduMonitoringParam.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VduMonitoringParam other = (VduMonitoringParam)obj;
            if (!Objects.equals(_vduMonitoringParamRef, other.getVduMonitoringParamRef())) {
                return false;
            }
            if (!Objects.equals(_vduRef, other.getVduRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduMonitoringParamImpl otherImpl = (VduMonitoringParamImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VduMonitoringParam>>, Augmentation<VduMonitoringParam>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VduMonitoringParam");
            CodeHelpers.appendValue(helper, "_vduMonitoringParamRef", _vduMonitoringParamRef);
            CodeHelpers.appendValue(helper, "_vduRef", _vduRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
