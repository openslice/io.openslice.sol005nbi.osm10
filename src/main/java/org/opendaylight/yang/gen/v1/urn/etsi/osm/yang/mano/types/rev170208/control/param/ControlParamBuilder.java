package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.control.param;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HttpMethod;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.WidgetType;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link ControlParamBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ControlParamBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ControlParamBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ControlParamBuilder, as instances can be freely passed around without
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
 * @see ControlParamBuilder
 * @see Builder
 *
 */
public class ControlParamBuilder implements Builder<ControlParam> {

    private Uint64 _currentValue;
    private String _description;
    private String _groupTag;
    private String _id;
    private Uint64 _maxValue;
    private HttpMethod _method;
    private Uint64 _minValue;
    private String _name;
    private String _payload;
    private Uint64 _stepValue;
    private String _units;
    private Uri _url;
    private WidgetType _widgetType;
    private ControlParamKey key;


    Map<Class<? extends Augmentation<ControlParam>>, Augmentation<ControlParam>> augmentation = Collections.emptyMap();

    public ControlParamBuilder() {
    }

    public ControlParamBuilder(ControlParam base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ControlParam>>, Augmentation<ControlParam>> aug =((AugmentationHolder<ControlParam>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._currentValue = base.getCurrentValue();
        this._description = base.getDescription();
        this._groupTag = base.getGroupTag();
        this._maxValue = base.getMaxValue();
        this._method = base.getMethod();
        this._minValue = base.getMinValue();
        this._name = base.getName();
        this._payload = base.getPayload();
        this._stepValue = base.getStepValue();
        this._units = base.getUnits();
        this._url = base.getUrl();
        this._widgetType = base.getWidgetType();
    }


    public ControlParamKey key() {
        return key;
    }
    
    public Uint64 getCurrentValue() {
        return _currentValue;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getGroupTag() {
        return _groupTag;
    }
    
    public String getId() {
        return _id;
    }
    
    public Uint64 getMaxValue() {
        return _maxValue;
    }
    
    public HttpMethod getMethod() {
        return _method;
    }
    
    public Uint64 getMinValue() {
        return _minValue;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getPayload() {
        return _payload;
    }
    
    public Uint64 getStepValue() {
        return _stepValue;
    }
    
    public String getUnits() {
        return _units;
    }
    
    public Uri getUrl() {
        return _url;
    }
    
    public WidgetType getWidgetType() {
        return _widgetType;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ControlParam>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ControlParamBuilder withKey(final ControlParamKey key) {
        this.key = key;
        return this;
    }
    
    public ControlParamBuilder setCurrentValue(final Uint64 value) {
        this._currentValue = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCurrentValue(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public ControlParamBuilder setCurrentValue(final BigInteger value) {
        return setCurrentValue(CodeHelpers.compatUint(value));
    }
    
    public ControlParamBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public ControlParamBuilder setGroupTag(final String value) {
        this._groupTag = value;
        return this;
    }
    
    public ControlParamBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public ControlParamBuilder setMaxValue(final Uint64 value) {
        this._maxValue = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setMaxValue(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public ControlParamBuilder setMaxValue(final BigInteger value) {
        return setMaxValue(CodeHelpers.compatUint(value));
    }
    
    public ControlParamBuilder setMethod(final HttpMethod value) {
        this._method = value;
        return this;
    }
    
    public ControlParamBuilder setMinValue(final Uint64 value) {
        this._minValue = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setMinValue(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public ControlParamBuilder setMinValue(final BigInteger value) {
        return setMinValue(CodeHelpers.compatUint(value));
    }
    
    public ControlParamBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ControlParamBuilder setPayload(final String value) {
        this._payload = value;
        return this;
    }
    
    public ControlParamBuilder setStepValue(final Uint64 value) {
        this._stepValue = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setStepValue(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public ControlParamBuilder setStepValue(final BigInteger value) {
        return setStepValue(CodeHelpers.compatUint(value));
    }
    
    public ControlParamBuilder setUnits(final String value) {
        this._units = value;
        return this;
    }
    
    public ControlParamBuilder setUrl(final Uri value) {
        this._url = value;
        return this;
    }
    
    public ControlParamBuilder setWidgetType(final WidgetType value) {
        this._widgetType = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ControlParamBuilder addAugmentation(Augmentation<ControlParam> augmentation) {
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
    public ControlParamBuilder addAugmentation(Class<? extends Augmentation<ControlParam>> augmentationType, Augmentation<ControlParam> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ControlParamBuilder removeAugmentation(Class<? extends Augmentation<ControlParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ControlParamBuilder doAddAugmentation(Class<? extends Augmentation<ControlParam>> augmentationType, Augmentation<ControlParam> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ControlParam build() {
        return new ControlParamImpl(this);
    }

    private static final class ControlParamImpl
        extends AbstractAugmentable<ControlParam>
        implements ControlParam {
    
        private final Uint64 _currentValue;
        private final String _description;
        private final String _groupTag;
        private final String _id;
        private final Uint64 _maxValue;
        private final HttpMethod _method;
        private final Uint64 _minValue;
        private final String _name;
        private final String _payload;
        private final Uint64 _stepValue;
        private final String _units;
        private final Uri _url;
        private final WidgetType _widgetType;
        private final ControlParamKey key;
    
        ControlParamImpl(ControlParamBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ControlParamKey(base.getId());
            }
            this._id = key.getId();
            this._currentValue = base.getCurrentValue();
            this._description = base.getDescription();
            this._groupTag = base.getGroupTag();
            this._maxValue = base.getMaxValue();
            this._method = base.getMethod();
            this._minValue = base.getMinValue();
            this._name = base.getName();
            this._payload = base.getPayload();
            this._stepValue = base.getStepValue();
            this._units = base.getUnits();
            this._url = base.getUrl();
            this._widgetType = base.getWidgetType();
        }
    
        @Override
        public ControlParamKey key() {
            return key;
        }
        
        @Override
        public Uint64 getCurrentValue() {
            return _currentValue;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getGroupTag() {
            return _groupTag;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Uint64 getMaxValue() {
            return _maxValue;
        }
        
        @Override
        public HttpMethod getMethod() {
            return _method;
        }
        
        @Override
        public Uint64 getMinValue() {
            return _minValue;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getPayload() {
            return _payload;
        }
        
        @Override
        public Uint64 getStepValue() {
            return _stepValue;
        }
        
        @Override
        public String getUnits() {
            return _units;
        }
        
        @Override
        public Uri getUrl() {
            return _url;
        }
        
        @Override
        public WidgetType getWidgetType() {
            return _widgetType;
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
            result = prime * result + Objects.hashCode(_currentValue);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_groupTag);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_maxValue);
            result = prime * result + Objects.hashCode(_method);
            result = prime * result + Objects.hashCode(_minValue);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_payload);
            result = prime * result + Objects.hashCode(_stepValue);
            result = prime * result + Objects.hashCode(_units);
            result = prime * result + Objects.hashCode(_url);
            result = prime * result + Objects.hashCode(_widgetType);
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
            if (!ControlParam.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ControlParam other = (ControlParam)obj;
            if (!Objects.equals(_currentValue, other.getCurrentValue())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_groupTag, other.getGroupTag())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_maxValue, other.getMaxValue())) {
                return false;
            }
            if (!Objects.equals(_method, other.getMethod())) {
                return false;
            }
            if (!Objects.equals(_minValue, other.getMinValue())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_payload, other.getPayload())) {
                return false;
            }
            if (!Objects.equals(_stepValue, other.getStepValue())) {
                return false;
            }
            if (!Objects.equals(_units, other.getUnits())) {
                return false;
            }
            if (!Objects.equals(_url, other.getUrl())) {
                return false;
            }
            if (!Objects.equals(_widgetType, other.getWidgetType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ControlParamImpl otherImpl = (ControlParamImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ControlParam>>, Augmentation<ControlParam>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ControlParam");
            CodeHelpers.appendValue(helper, "_currentValue", _currentValue);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_groupTag", _groupTag);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_maxValue", _maxValue);
            CodeHelpers.appendValue(helper, "_method", _method);
            CodeHelpers.appendValue(helper, "_minValue", _minValue);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_payload", _payload);
            CodeHelpers.appendValue(helper, "_stepValue", _stepValue);
            CodeHelpers.appendValue(helper, "_units", _units);
            CodeHelpers.appendValue(helper, "_url", _url);
            CodeHelpers.appendValue(helper, "_widgetType", _widgetType);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
