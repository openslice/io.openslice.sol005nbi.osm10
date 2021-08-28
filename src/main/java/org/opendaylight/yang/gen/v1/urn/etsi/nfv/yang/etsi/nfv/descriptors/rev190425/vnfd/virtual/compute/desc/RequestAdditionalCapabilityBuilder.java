package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc;
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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.request.additional.capability.TargetPerformanceParameters;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.request.additional.capability.TargetPerformanceParametersKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link RequestAdditionalCapabilityBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     RequestAdditionalCapabilityBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new RequestAdditionalCapabilityBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of RequestAdditionalCapabilityBuilder, as instances can be freely passed around without
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
 * @see RequestAdditionalCapabilityBuilder
 * @see Builder
 *
 */
public class RequestAdditionalCapabilityBuilder implements Builder<RequestAdditionalCapability> {

    private String _minVersion;
    private String _name;
    private String _preferredVersion;
    private Map<TargetPerformanceParametersKey, TargetPerformanceParameters> _targetPerformanceParameters;
    private Boolean _supportMandatory;
    private RequestAdditionalCapabilityKey key;


    Map<Class<? extends Augmentation<RequestAdditionalCapability>>, Augmentation<RequestAdditionalCapability>> augmentation = Collections.emptyMap();

    public RequestAdditionalCapabilityBuilder() {
    }

    public RequestAdditionalCapabilityBuilder(RequestAdditionalCapability base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<RequestAdditionalCapability>>, Augmentation<RequestAdditionalCapability>> aug =((AugmentationHolder<RequestAdditionalCapability>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._minVersion = base.getMinVersion();
        this._preferredVersion = base.getPreferredVersion();
        this._targetPerformanceParameters = base.getTargetPerformanceParameters();
        this._supportMandatory = base.isSupportMandatory();
    }


    public RequestAdditionalCapabilityKey key() {
        return key;
    }
    
    public String getMinVersion() {
        return _minVersion;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getPreferredVersion() {
        return _preferredVersion;
    }
    
    public Map<TargetPerformanceParametersKey, TargetPerformanceParameters> getTargetPerformanceParameters() {
        return _targetPerformanceParameters;
    }
    
    public Boolean isSupportMandatory() {
        return _supportMandatory;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<RequestAdditionalCapability>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public RequestAdditionalCapabilityBuilder withKey(final RequestAdditionalCapabilityKey key) {
        this.key = key;
        return this;
    }
    
    public RequestAdditionalCapabilityBuilder setMinVersion(final String value) {
        this._minVersion = value;
        return this;
    }
    
    public RequestAdditionalCapabilityBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public RequestAdditionalCapabilityBuilder setPreferredVersion(final String value) {
        this._preferredVersion = value;
        return this;
    }
    public RequestAdditionalCapabilityBuilder setTargetPerformanceParameters(final Map<TargetPerformanceParametersKey, TargetPerformanceParameters> values) {
        this._targetPerformanceParameters = values;
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
      * @deprecated Use {#link #setTargetPerformanceParameters(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public RequestAdditionalCapabilityBuilder setTargetPerformanceParameters(final List<TargetPerformanceParameters> values) {
        return setTargetPerformanceParameters(CodeHelpers.compatMap(values));
    }
    
    public RequestAdditionalCapabilityBuilder setSupportMandatory(final Boolean value) {
        this._supportMandatory = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public RequestAdditionalCapabilityBuilder addAugmentation(Augmentation<RequestAdditionalCapability> augmentation) {
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
    public RequestAdditionalCapabilityBuilder addAugmentation(Class<? extends Augmentation<RequestAdditionalCapability>> augmentationType, Augmentation<RequestAdditionalCapability> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public RequestAdditionalCapabilityBuilder removeAugmentation(Class<? extends Augmentation<RequestAdditionalCapability>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private RequestAdditionalCapabilityBuilder doAddAugmentation(Class<? extends Augmentation<RequestAdditionalCapability>> augmentationType, Augmentation<RequestAdditionalCapability> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public RequestAdditionalCapability build() {
        return new RequestAdditionalCapabilityImpl(this);
    }

    private static final class RequestAdditionalCapabilityImpl
        extends AbstractAugmentable<RequestAdditionalCapability>
        implements RequestAdditionalCapability {
    
        private final String _minVersion;
        private final String _name;
        private final String _preferredVersion;
        private final Map<TargetPerformanceParametersKey, TargetPerformanceParameters> _targetPerformanceParameters;
        private final Boolean _supportMandatory;
        private final RequestAdditionalCapabilityKey key;
    
        RequestAdditionalCapabilityImpl(RequestAdditionalCapabilityBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new RequestAdditionalCapabilityKey(base.getName());
            }
            this._name = key.getName();
            this._minVersion = base.getMinVersion();
            this._preferredVersion = base.getPreferredVersion();
            this._targetPerformanceParameters = CodeHelpers.emptyToNull(base.getTargetPerformanceParameters());
            this._supportMandatory = base.isSupportMandatory();
        }
    
        @Override
        public RequestAdditionalCapabilityKey key() {
            return key;
        }
        
        @Override
        public String getMinVersion() {
            return _minVersion;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getPreferredVersion() {
            return _preferredVersion;
        }
        
        @Override
        public Map<TargetPerformanceParametersKey, TargetPerformanceParameters> getTargetPerformanceParameters() {
            return _targetPerformanceParameters;
        }
        
        @Override
        public Boolean isSupportMandatory() {
            return _supportMandatory;
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
            result = prime * result + Objects.hashCode(_minVersion);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_preferredVersion);
            result = prime * result + Objects.hashCode(_targetPerformanceParameters);
            result = prime * result + Objects.hashCode(_supportMandatory);
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
            if (!RequestAdditionalCapability.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            RequestAdditionalCapability other = (RequestAdditionalCapability)obj;
            if (!Objects.equals(_minVersion, other.getMinVersion())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_preferredVersion, other.getPreferredVersion())) {
                return false;
            }
            if (!Objects.equals(_targetPerformanceParameters, other.getTargetPerformanceParameters())) {
                return false;
            }
            if (!Objects.equals(_supportMandatory, other.isSupportMandatory())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RequestAdditionalCapabilityImpl otherImpl = (RequestAdditionalCapabilityImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<RequestAdditionalCapability>>, Augmentation<RequestAdditionalCapability>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("RequestAdditionalCapability");
            CodeHelpers.appendValue(helper, "_minVersion", _minVersion);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_preferredVersion", _preferredVersion);
            CodeHelpers.appendValue(helper, "_targetPerformanceParameters", _targetPerformanceParameters);
            CodeHelpers.appendValue(helper, "_supportMandatory", _supportMandatory);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
