package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.action.param;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HttpMethod;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ActionParamBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ActionParamBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ActionParamBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ActionParamBuilder, as instances can be freely passed around without
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
 * @see ActionParamBuilder
 * @see Builder
 *
 */
public class ActionParamBuilder implements Builder<ActionParam> {

    private String _description;
    private String _groupTag;
    private String _id;
    private HttpMethod _method;
    private String _name;
    private String _payload;
    private Uri _url;
    private ActionParamKey key;


    Map<Class<? extends Augmentation<ActionParam>>, Augmentation<ActionParam>> augmentation = Collections.emptyMap();

    public ActionParamBuilder() {
    }

    public ActionParamBuilder(ActionParam base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ActionParam>>, Augmentation<ActionParam>> aug =((AugmentationHolder<ActionParam>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._description = base.getDescription();
        this._groupTag = base.getGroupTag();
        this._method = base.getMethod();
        this._name = base.getName();
        this._payload = base.getPayload();
        this._url = base.getUrl();
    }


    public ActionParamKey key() {
        return key;
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
    
    public HttpMethod getMethod() {
        return _method;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getPayload() {
        return _payload;
    }
    
    public Uri getUrl() {
        return _url;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<ActionParam>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ActionParamBuilder withKey(final ActionParamKey key) {
        this.key = key;
        return this;
    }
    
    public ActionParamBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public ActionParamBuilder setGroupTag(final String value) {
        this._groupTag = value;
        return this;
    }
    
    public ActionParamBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public ActionParamBuilder setMethod(final HttpMethod value) {
        this._method = value;
        return this;
    }
    
    public ActionParamBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ActionParamBuilder setPayload(final String value) {
        this._payload = value;
        return this;
    }
    
    public ActionParamBuilder setUrl(final Uri value) {
        this._url = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ActionParamBuilder addAugmentation(Augmentation<ActionParam> augmentation) {
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
    public ActionParamBuilder addAugmentation(Class<? extends Augmentation<ActionParam>> augmentationType, Augmentation<ActionParam> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ActionParamBuilder removeAugmentation(Class<? extends Augmentation<ActionParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ActionParamBuilder doAddAugmentation(Class<? extends Augmentation<ActionParam>> augmentationType, Augmentation<ActionParam> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public ActionParam build() {
        return new ActionParamImpl(this);
    }

    private static final class ActionParamImpl
        extends AbstractAugmentable<ActionParam>
        implements ActionParam {
    
        private final String _description;
        private final String _groupTag;
        private final String _id;
        private final HttpMethod _method;
        private final String _name;
        private final String _payload;
        private final Uri _url;
        private final ActionParamKey key;
    
        ActionParamImpl(ActionParamBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ActionParamKey(base.getId());
            }
            this._id = key.getId();
            this._description = base.getDescription();
            this._groupTag = base.getGroupTag();
            this._method = base.getMethod();
            this._name = base.getName();
            this._payload = base.getPayload();
            this._url = base.getUrl();
        }
    
        @Override
        public ActionParamKey key() {
            return key;
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
        public HttpMethod getMethod() {
            return _method;
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
        public Uri getUrl() {
            return _url;
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
            result = prime * result + Objects.hashCode(_groupTag);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_method);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_payload);
            result = prime * result + Objects.hashCode(_url);
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
            if (!ActionParam.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            ActionParam other = (ActionParam)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_groupTag, other.getGroupTag())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_method, other.getMethod())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_payload, other.getPayload())) {
                return false;
            }
            if (!Objects.equals(_url, other.getUrl())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ActionParamImpl otherImpl = (ActionParamImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ActionParam>>, Augmentation<ActionParam>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ActionParam");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_groupTag", _groupTag);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_method", _method);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_payload", _payload);
            CodeHelpers.appendValue(helper, "_url", _url);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
