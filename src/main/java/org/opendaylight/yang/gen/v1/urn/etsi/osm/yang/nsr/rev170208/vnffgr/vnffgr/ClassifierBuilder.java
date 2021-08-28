package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr;
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
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ClassifierBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     ClassifierBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new ClassifierBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of ClassifierBuilder, as instances can be freely passed around without
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
 * @see ClassifierBuilder
 * @see Builder
 *
 */
public class ClassifierBuilder implements Builder<Classifier> {

    private List<Uuid> _classifierId;
    private Uuid _id;
    private String _ipAddress;
    private String _name;
    private String _portId;
    private Uuid _rspIdRef;
    private String _rspName;
    private String _sffName;
    private String _vmId;
    private Object _vnfrConnectionPointRef;
    private Object _vnfrIdRef;
    private Object _vnfrNameRef;
    private ClassifierKey key;


    Map<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> augmentation = Collections.emptyMap();

    public ClassifierBuilder() {
    }

    public ClassifierBuilder(Classifier base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> aug =((AugmentationHolder<Classifier>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._classifierId = base.getClassifierId();
        this._ipAddress = base.getIpAddress();
        this._name = base.getName();
        this._portId = base.getPortId();
        this._rspIdRef = base.getRspIdRef();
        this._rspName = base.getRspName();
        this._sffName = base.getSffName();
        this._vmId = base.getVmId();
        this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
        this._vnfrIdRef = base.getVnfrIdRef();
        this._vnfrNameRef = base.getVnfrNameRef();
    }


    public ClassifierKey key() {
        return key;
    }
    
    public List<Uuid> getClassifierId() {
        return _classifierId;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public String getIpAddress() {
        return _ipAddress;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getPortId() {
        return _portId;
    }
    
    public Uuid getRspIdRef() {
        return _rspIdRef;
    }
    
    public String getRspName() {
        return _rspName;
    }
    
    public String getSffName() {
        return _sffName;
    }
    
    public String getVmId() {
        return _vmId;
    }
    
    public Object getVnfrConnectionPointRef() {
        return _vnfrConnectionPointRef;
    }
    
    public Object getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    public Object getVnfrNameRef() {
        return _vnfrNameRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Classifier>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public ClassifierBuilder withKey(final ClassifierKey key) {
        this.key = key;
        return this;
    }
    public ClassifierBuilder setClassifierId(final List<Uuid> values) {
        this._classifierId = values;
        return this;
    }
    
    
    public ClassifierBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
    public ClassifierBuilder setIpAddress(final String value) {
        this._ipAddress = value;
        return this;
    }
    
    public ClassifierBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ClassifierBuilder setPortId(final String value) {
        this._portId = value;
        return this;
    }
    
    public ClassifierBuilder setRspIdRef(final Uuid value) {
        this._rspIdRef = value;
        return this;
    }
    
    public ClassifierBuilder setRspName(final String value) {
        this._rspName = value;
        return this;
    }
    
    public ClassifierBuilder setSffName(final String value) {
        this._sffName = value;
        return this;
    }
    
    public ClassifierBuilder setVmId(final String value) {
        this._vmId = value;
        return this;
    }
    
    public ClassifierBuilder setVnfrConnectionPointRef(final Object value) {
        this._vnfrConnectionPointRef = value;
        return this;
    }
    
    public ClassifierBuilder setVnfrIdRef(final Object value) {
        this._vnfrIdRef = value;
        return this;
    }
    
    public ClassifierBuilder setVnfrNameRef(final Object value) {
        this._vnfrNameRef = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public ClassifierBuilder addAugmentation(Augmentation<Classifier> augmentation) {
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
    public ClassifierBuilder addAugmentation(Class<? extends Augmentation<Classifier>> augmentationType, Augmentation<Classifier> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public ClassifierBuilder removeAugmentation(Class<? extends Augmentation<Classifier>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private ClassifierBuilder doAddAugmentation(Class<? extends Augmentation<Classifier>> augmentationType, Augmentation<Classifier> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Classifier build() {
        return new ClassifierImpl(this);
    }

    private static final class ClassifierImpl
        extends AbstractAugmentable<Classifier>
        implements Classifier {
    
        private final List<Uuid> _classifierId;
        private final Uuid _id;
        private final String _ipAddress;
        private final String _name;
        private final String _portId;
        private final Uuid _rspIdRef;
        private final String _rspName;
        private final String _sffName;
        private final String _vmId;
        private final Object _vnfrConnectionPointRef;
        private final Object _vnfrIdRef;
        private final Object _vnfrNameRef;
        private final ClassifierKey key;
    
        ClassifierImpl(ClassifierBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ClassifierKey(base.getId());
            }
            this._id = key.getId();
            this._classifierId = base.getClassifierId();
            this._ipAddress = base.getIpAddress();
            this._name = base.getName();
            this._portId = base.getPortId();
            this._rspIdRef = base.getRspIdRef();
            this._rspName = base.getRspName();
            this._sffName = base.getSffName();
            this._vmId = base.getVmId();
            this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
            this._vnfrIdRef = base.getVnfrIdRef();
            this._vnfrNameRef = base.getVnfrNameRef();
        }
    
        @Override
        public ClassifierKey key() {
            return key;
        }
        
        @Override
        public List<Uuid> getClassifierId() {
            return _classifierId;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public String getIpAddress() {
            return _ipAddress;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getPortId() {
            return _portId;
        }
        
        @Override
        public Uuid getRspIdRef() {
            return _rspIdRef;
        }
        
        @Override
        public String getRspName() {
            return _rspName;
        }
        
        @Override
        public String getSffName() {
            return _sffName;
        }
        
        @Override
        public String getVmId() {
            return _vmId;
        }
        
        @Override
        public Object getVnfrConnectionPointRef() {
            return _vnfrConnectionPointRef;
        }
        
        @Override
        public Object getVnfrIdRef() {
            return _vnfrIdRef;
        }
        
        @Override
        public Object getVnfrNameRef() {
            return _vnfrNameRef;
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
            result = prime * result + Objects.hashCode(_classifierId);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ipAddress);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_portId);
            result = prime * result + Objects.hashCode(_rspIdRef);
            result = prime * result + Objects.hashCode(_rspName);
            result = prime * result + Objects.hashCode(_sffName);
            result = prime * result + Objects.hashCode(_vmId);
            result = prime * result + Objects.hashCode(_vnfrConnectionPointRef);
            result = prime * result + Objects.hashCode(_vnfrIdRef);
            result = prime * result + Objects.hashCode(_vnfrNameRef);
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
            if (!Classifier.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Classifier other = (Classifier)obj;
            if (!Objects.equals(_classifierId, other.getClassifierId())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_portId, other.getPortId())) {
                return false;
            }
            if (!Objects.equals(_rspIdRef, other.getRspIdRef())) {
                return false;
            }
            if (!Objects.equals(_rspName, other.getRspName())) {
                return false;
            }
            if (!Objects.equals(_sffName, other.getSffName())) {
                return false;
            }
            if (!Objects.equals(_vmId, other.getVmId())) {
                return false;
            }
            if (!Objects.equals(_vnfrConnectionPointRef, other.getVnfrConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrIdRef, other.getVnfrIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrNameRef, other.getVnfrNameRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ClassifierImpl otherImpl = (ClassifierImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Classifier");
            CodeHelpers.appendValue(helper, "_classifierId", _classifierId);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_portId", _portId);
            CodeHelpers.appendValue(helper, "_rspIdRef", _rspIdRef);
            CodeHelpers.appendValue(helper, "_rspName", _rspName);
            CodeHelpers.appendValue(helper, "_sffName", _sffName);
            CodeHelpers.appendValue(helper, "_vmId", _vmId);
            CodeHelpers.appendValue(helper, "_vnfrConnectionPointRef", _vnfrConnectionPointRef);
            CodeHelpers.appendValue(helper, "_vnfrIdRef", _vnfrIdRef);
            CodeHelpers.appendValue(helper, "_vnfrNameRef", _vnfrNameRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
