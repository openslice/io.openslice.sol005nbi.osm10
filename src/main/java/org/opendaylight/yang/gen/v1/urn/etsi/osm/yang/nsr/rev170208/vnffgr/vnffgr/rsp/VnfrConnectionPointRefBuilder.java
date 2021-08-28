package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ServiceFunctionForwarder;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * Class that builds {@link VnfrConnectionPointRefBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VnfrConnectionPointRefBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VnfrConnectionPointRefBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VnfrConnectionPointRefBuilder, as instances can be freely passed around without
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
 * @see VnfrConnectionPointRefBuilder
 * @see Builder
 *
 */
public class VnfrConnectionPointRefBuilder implements Builder<VnfrConnectionPointRef> {

    private ConnectionPointParams _connectionPointParams;
    private Uint8 _hopNumber;
    private String _memberVnfIndexRef;
    private ServiceFunctionForwarder _serviceFunctionForwarder;
    private String _serviceFunctionType;
    private Uint8 _serviceIndex;
    private String _vnfdIdRef;
    private Object _vnfrEgressConnectionPointRef;
    private Object _vnfrIdRef;
    private Object _vnfrIngressConnectionPointRef;
    private Object _vnfrNameRef;
    private VnfrConnectionPointRefKey key;


    Map<Class<? extends Augmentation<VnfrConnectionPointRef>>, Augmentation<VnfrConnectionPointRef>> augmentation = Collections.emptyMap();

    public VnfrConnectionPointRefBuilder() {
    }

    public VnfrConnectionPointRefBuilder(VnfrConnectionPointRef base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfrConnectionPointRef>>, Augmentation<VnfrConnectionPointRef>> aug =((AugmentationHolder<VnfrConnectionPointRef>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._hopNumber = base.getHopNumber();
        this._connectionPointParams = base.getConnectionPointParams();
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._serviceFunctionForwarder = base.getServiceFunctionForwarder();
        this._serviceFunctionType = base.getServiceFunctionType();
        this._serviceIndex = base.getServiceIndex();
        this._vnfdIdRef = base.getVnfdIdRef();
        this._vnfrEgressConnectionPointRef = base.getVnfrEgressConnectionPointRef();
        this._vnfrIdRef = base.getVnfrIdRef();
        this._vnfrIngressConnectionPointRef = base.getVnfrIngressConnectionPointRef();
        this._vnfrNameRef = base.getVnfrNameRef();
    }


    public VnfrConnectionPointRefKey key() {
        return key;
    }
    
    public ConnectionPointParams getConnectionPointParams() {
        return _connectionPointParams;
    }
    
    public Uint8 getHopNumber() {
        return _hopNumber;
    }
    
    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public ServiceFunctionForwarder getServiceFunctionForwarder() {
        return _serviceFunctionForwarder;
    }
    
    public String getServiceFunctionType() {
        return _serviceFunctionType;
    }
    
    public Uint8 getServiceIndex() {
        return _serviceIndex;
    }
    
    public String getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    public Object getVnfrEgressConnectionPointRef() {
        return _vnfrEgressConnectionPointRef;
    }
    
    public Object getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    public Object getVnfrIngressConnectionPointRef() {
        return _vnfrIngressConnectionPointRef;
    }
    
    public Object getVnfrNameRef() {
        return _vnfrNameRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VnfrConnectionPointRef>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VnfrConnectionPointRefBuilder withKey(final VnfrConnectionPointRefKey key) {
        this.key = key;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder setConnectionPointParams(final ConnectionPointParams value) {
        this._connectionPointParams = value;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder setHopNumber(final Uint8 value) {
        this._hopNumber = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setHopNumber(Uint8)} instead.
     */
    @Deprecated(forRemoval = true)
    public VnfrConnectionPointRefBuilder setHopNumber(final Short value) {
        return setHopNumber(CodeHelpers.compatUint(value));
    }
    
    public VnfrConnectionPointRefBuilder setMemberVnfIndexRef(final String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder setServiceFunctionForwarder(final ServiceFunctionForwarder value) {
        this._serviceFunctionForwarder = value;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder setServiceFunctionType(final String value) {
        this._serviceFunctionType = value;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder setServiceIndex(final Uint8 value) {
        this._serviceIndex = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setServiceIndex(Uint8)} instead.
     */
    @Deprecated(forRemoval = true)
    public VnfrConnectionPointRefBuilder setServiceIndex(final Short value) {
        return setServiceIndex(CodeHelpers.compatUint(value));
    }
    
    public VnfrConnectionPointRefBuilder setVnfdIdRef(final String value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder setVnfrEgressConnectionPointRef(final Object value) {
        this._vnfrEgressConnectionPointRef = value;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder setVnfrIdRef(final Object value) {
        this._vnfrIdRef = value;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder setVnfrIngressConnectionPointRef(final Object value) {
        this._vnfrIngressConnectionPointRef = value;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder setVnfrNameRef(final Object value) {
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
    public VnfrConnectionPointRefBuilder addAugmentation(Augmentation<VnfrConnectionPointRef> augmentation) {
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
    public VnfrConnectionPointRefBuilder addAugmentation(Class<? extends Augmentation<VnfrConnectionPointRef>> augmentationType, Augmentation<VnfrConnectionPointRef> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VnfrConnectionPointRefBuilder removeAugmentation(Class<? extends Augmentation<VnfrConnectionPointRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VnfrConnectionPointRefBuilder doAddAugmentation(Class<? extends Augmentation<VnfrConnectionPointRef>> augmentationType, Augmentation<VnfrConnectionPointRef> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VnfrConnectionPointRef build() {
        return new VnfrConnectionPointRefImpl(this);
    }

    private static final class VnfrConnectionPointRefImpl
        extends AbstractAugmentable<VnfrConnectionPointRef>
        implements VnfrConnectionPointRef {
    
        private final ConnectionPointParams _connectionPointParams;
        private final Uint8 _hopNumber;
        private final String _memberVnfIndexRef;
        private final ServiceFunctionForwarder _serviceFunctionForwarder;
        private final String _serviceFunctionType;
        private final Uint8 _serviceIndex;
        private final String _vnfdIdRef;
        private final Object _vnfrEgressConnectionPointRef;
        private final Object _vnfrIdRef;
        private final Object _vnfrIngressConnectionPointRef;
        private final Object _vnfrNameRef;
        private final VnfrConnectionPointRefKey key;
    
        VnfrConnectionPointRefImpl(VnfrConnectionPointRefBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfrConnectionPointRefKey(base.getHopNumber());
            }
            this._hopNumber = key.getHopNumber();
            this._connectionPointParams = base.getConnectionPointParams();
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            this._serviceFunctionForwarder = base.getServiceFunctionForwarder();
            this._serviceFunctionType = base.getServiceFunctionType();
            this._serviceIndex = base.getServiceIndex();
            this._vnfdIdRef = base.getVnfdIdRef();
            this._vnfrEgressConnectionPointRef = base.getVnfrEgressConnectionPointRef();
            this._vnfrIdRef = base.getVnfrIdRef();
            this._vnfrIngressConnectionPointRef = base.getVnfrIngressConnectionPointRef();
            this._vnfrNameRef = base.getVnfrNameRef();
        }
    
        @Override
        public VnfrConnectionPointRefKey key() {
            return key;
        }
        
        @Override
        public ConnectionPointParams getConnectionPointParams() {
            return _connectionPointParams;
        }
        
        @Override
        public Uint8 getHopNumber() {
            return _hopNumber;
        }
        
        @Override
        public String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public ServiceFunctionForwarder getServiceFunctionForwarder() {
            return _serviceFunctionForwarder;
        }
        
        @Override
        public String getServiceFunctionType() {
            return _serviceFunctionType;
        }
        
        @Override
        public Uint8 getServiceIndex() {
            return _serviceIndex;
        }
        
        @Override
        public String getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @Override
        public Object getVnfrEgressConnectionPointRef() {
            return _vnfrEgressConnectionPointRef;
        }
        
        @Override
        public Object getVnfrIdRef() {
            return _vnfrIdRef;
        }
        
        @Override
        public Object getVnfrIngressConnectionPointRef() {
            return _vnfrIngressConnectionPointRef;
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
            result = prime * result + Objects.hashCode(_connectionPointParams);
            result = prime * result + Objects.hashCode(_hopNumber);
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_serviceFunctionForwarder);
            result = prime * result + Objects.hashCode(_serviceFunctionType);
            result = prime * result + Objects.hashCode(_serviceIndex);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
            result = prime * result + Objects.hashCode(_vnfrEgressConnectionPointRef);
            result = prime * result + Objects.hashCode(_vnfrIdRef);
            result = prime * result + Objects.hashCode(_vnfrIngressConnectionPointRef);
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
            if (!VnfrConnectionPointRef.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VnfrConnectionPointRef other = (VnfrConnectionPointRef)obj;
            if (!Objects.equals(_connectionPointParams, other.getConnectionPointParams())) {
                return false;
            }
            if (!Objects.equals(_hopNumber, other.getHopNumber())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_serviceFunctionForwarder, other.getServiceFunctionForwarder())) {
                return false;
            }
            if (!Objects.equals(_serviceFunctionType, other.getServiceFunctionType())) {
                return false;
            }
            if (!Objects.equals(_serviceIndex, other.getServiceIndex())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrEgressConnectionPointRef, other.getVnfrEgressConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrIdRef, other.getVnfrIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrIngressConnectionPointRef, other.getVnfrIngressConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrNameRef, other.getVnfrNameRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrConnectionPointRefImpl otherImpl = (VnfrConnectionPointRefImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfrConnectionPointRef>>, Augmentation<VnfrConnectionPointRef>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfrConnectionPointRef");
            CodeHelpers.appendValue(helper, "_connectionPointParams", _connectionPointParams);
            CodeHelpers.appendValue(helper, "_hopNumber", _hopNumber);
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_serviceFunctionForwarder", _serviceFunctionForwarder);
            CodeHelpers.appendValue(helper, "_serviceFunctionType", _serviceFunctionType);
            CodeHelpers.appendValue(helper, "_serviceIndex", _serviceIndex);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "_vnfrEgressConnectionPointRef", _vnfrEgressConnectionPointRef);
            CodeHelpers.appendValue(helper, "_vnfrIdRef", _vnfrIdRef);
            CodeHelpers.appendValue(helper, "_vnfrIngressConnectionPointRef", _vnfrIngressConnectionPointRef);
            CodeHelpers.appendValue(helper, "_vnfrNameRef", _vnfrNameRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
