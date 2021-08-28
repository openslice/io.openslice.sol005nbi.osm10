package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr;
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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRefKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link RspBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     RspBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new RspBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of RspBuilder, as instances can be freely passed around without
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
 * @see RspBuilder
 * @see Builder
 *
 */
public class RspBuilder implements Builder<Rsp> {

    private String _classifierName;
    private Uuid _id;
    private String _name;
    private Uint32 _pathId;
    private Uuid _rspId;
    private Object _vnffgdRspIdRef;
    private Object _vnffgdRspNameRef;
    private Map<VnfrConnectionPointRefKey, VnfrConnectionPointRef> _vnfrConnectionPointRef;
    private RspKey key;


    Map<Class<? extends Augmentation<Rsp>>, Augmentation<Rsp>> augmentation = Collections.emptyMap();

    public RspBuilder() {
    }

    public RspBuilder(Rsp base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Rsp>>, Augmentation<Rsp>> aug =((AugmentationHolder<Rsp>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._classifierName = base.getClassifierName();
        this._name = base.getName();
        this._pathId = base.getPathId();
        this._rspId = base.getRspId();
        this._vnffgdRspIdRef = base.getVnffgdRspIdRef();
        this._vnffgdRspNameRef = base.getVnffgdRspNameRef();
        this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
    }


    public RspKey key() {
        return key;
    }
    
    public String getClassifierName() {
        return _classifierName;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public String getName() {
        return _name;
    }
    
    public Uint32 getPathId() {
        return _pathId;
    }
    
    public Uuid getRspId() {
        return _rspId;
    }
    
    public Object getVnffgdRspIdRef() {
        return _vnffgdRspIdRef;
    }
    
    public Object getVnffgdRspNameRef() {
        return _vnffgdRspNameRef;
    }
    
    public Map<VnfrConnectionPointRefKey, VnfrConnectionPointRef> getVnfrConnectionPointRef() {
        return _vnfrConnectionPointRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Rsp>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public RspBuilder withKey(final RspKey key) {
        this.key = key;
        return this;
    }
    
    public RspBuilder setClassifierName(final String value) {
        this._classifierName = value;
        return this;
    }
    
    public RspBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
    public RspBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public RspBuilder setPathId(final Uint32 value) {
        this._pathId = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setPathId(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public RspBuilder setPathId(final Long value) {
        return setPathId(CodeHelpers.compatUint(value));
    }
    
    public RspBuilder setRspId(final Uuid value) {
        this._rspId = value;
        return this;
    }
    
    public RspBuilder setVnffgdRspIdRef(final Object value) {
        this._vnffgdRspIdRef = value;
        return this;
    }
    
    public RspBuilder setVnffgdRspNameRef(final Object value) {
        this._vnffgdRspNameRef = value;
        return this;
    }
    public RspBuilder setVnfrConnectionPointRef(final Map<VnfrConnectionPointRefKey, VnfrConnectionPointRef> values) {
        this._vnfrConnectionPointRef = values;
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
      * @deprecated Use {#link #setVnfrConnectionPointRef(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public RspBuilder setVnfrConnectionPointRef(final List<VnfrConnectionPointRef> values) {
        return setVnfrConnectionPointRef(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public RspBuilder addAugmentation(Augmentation<Rsp> augmentation) {
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
    public RspBuilder addAugmentation(Class<? extends Augmentation<Rsp>> augmentationType, Augmentation<Rsp> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public RspBuilder removeAugmentation(Class<? extends Augmentation<Rsp>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private RspBuilder doAddAugmentation(Class<? extends Augmentation<Rsp>> augmentationType, Augmentation<Rsp> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Rsp build() {
        return new RspImpl(this);
    }

    private static final class RspImpl
        extends AbstractAugmentable<Rsp>
        implements Rsp {
    
        private final String _classifierName;
        private final Uuid _id;
        private final String _name;
        private final Uint32 _pathId;
        private final Uuid _rspId;
        private final Object _vnffgdRspIdRef;
        private final Object _vnffgdRspNameRef;
        private final Map<VnfrConnectionPointRefKey, VnfrConnectionPointRef> _vnfrConnectionPointRef;
        private final RspKey key;
    
        RspImpl(RspBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new RspKey(base.getId());
            }
            this._id = key.getId();
            this._classifierName = base.getClassifierName();
            this._name = base.getName();
            this._pathId = base.getPathId();
            this._rspId = base.getRspId();
            this._vnffgdRspIdRef = base.getVnffgdRspIdRef();
            this._vnffgdRspNameRef = base.getVnffgdRspNameRef();
            this._vnfrConnectionPointRef = CodeHelpers.emptyToNull(base.getVnfrConnectionPointRef());
        }
    
        @Override
        public RspKey key() {
            return key;
        }
        
        @Override
        public String getClassifierName() {
            return _classifierName;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Uint32 getPathId() {
            return _pathId;
        }
        
        @Override
        public Uuid getRspId() {
            return _rspId;
        }
        
        @Override
        public Object getVnffgdRspIdRef() {
            return _vnffgdRspIdRef;
        }
        
        @Override
        public Object getVnffgdRspNameRef() {
            return _vnffgdRspNameRef;
        }
        
        @Override
        public Map<VnfrConnectionPointRefKey, VnfrConnectionPointRef> getVnfrConnectionPointRef() {
            return _vnfrConnectionPointRef;
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
            result = prime * result + Objects.hashCode(_classifierName);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_pathId);
            result = prime * result + Objects.hashCode(_rspId);
            result = prime * result + Objects.hashCode(_vnffgdRspIdRef);
            result = prime * result + Objects.hashCode(_vnffgdRspNameRef);
            result = prime * result + Objects.hashCode(_vnfrConnectionPointRef);
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
            if (!Rsp.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Rsp other = (Rsp)obj;
            if (!Objects.equals(_classifierName, other.getClassifierName())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_pathId, other.getPathId())) {
                return false;
            }
            if (!Objects.equals(_rspId, other.getRspId())) {
                return false;
            }
            if (!Objects.equals(_vnffgdRspIdRef, other.getVnffgdRspIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnffgdRspNameRef, other.getVnffgdRspNameRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrConnectionPointRef, other.getVnfrConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RspImpl otherImpl = (RspImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Rsp>>, Augmentation<Rsp>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Rsp");
            CodeHelpers.appendValue(helper, "_classifierName", _classifierName);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_pathId", _pathId);
            CodeHelpers.appendValue(helper, "_rspId", _rspId);
            CodeHelpers.appendValue(helper, "_vnffgdRspIdRef", _vnffgdRspIdRef);
            CodeHelpers.appendValue(helper, "_vnffgdRspNameRef", _vnffgdRspNameRef);
            CodeHelpers.appendValue(helper, "_vnfrConnectionPointRef", _vnfrConnectionPointRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
