package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.nsvld;
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
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NssConnectionPointRefBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NssConnectionPointRefBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NssConnectionPointRefBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NssConnectionPointRefBuilder, as instances can be freely passed around without
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
 * @see NssConnectionPointRefBuilder
 * @see Builder
 *
 */
public class NssConnectionPointRefBuilder implements Builder<NssConnectionPointRef> {

    private IpAddress _ipAddress;
    private String _nsdConnectionPointRef;
    private String _nssRef;
    private NssConnectionPointRefKey key;


    Map<Class<? extends Augmentation<NssConnectionPointRef>>, Augmentation<NssConnectionPointRef>> augmentation = Collections.emptyMap();

    public NssConnectionPointRefBuilder() {
    }

    public NssConnectionPointRefBuilder(NssConnectionPointRef base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NssConnectionPointRef>>, Augmentation<NssConnectionPointRef>> aug =((AugmentationHolder<NssConnectionPointRef>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._nsdConnectionPointRef = base.getNsdConnectionPointRef();
        this._nssRef = base.getNssRef();
        this._ipAddress = base.getIpAddress();
    }


    public NssConnectionPointRefKey key() {
        return key;
    }
    
    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    public String getNsdConnectionPointRef() {
        return _nsdConnectionPointRef;
    }
    
    public String getNssRef() {
        return _nssRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<NssConnectionPointRef>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NssConnectionPointRefBuilder withKey(final NssConnectionPointRefKey key) {
        this.key = key;
        return this;
    }
    
    public NssConnectionPointRefBuilder setIpAddress(final IpAddress value) {
        this._ipAddress = value;
        return this;
    }
    
    public NssConnectionPointRefBuilder setNsdConnectionPointRef(final String value) {
        this._nsdConnectionPointRef = value;
        return this;
    }
    
    private static void check_nssRefLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 63) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..63]]", value);
    }
    
    public NssConnectionPointRefBuilder setNssRef(final String value) {
        if (value != null) {
            check_nssRefLength(value);
            
        }
        this._nssRef = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NssConnectionPointRefBuilder addAugmentation(Augmentation<NssConnectionPointRef> augmentation) {
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
    public NssConnectionPointRefBuilder addAugmentation(Class<? extends Augmentation<NssConnectionPointRef>> augmentationType, Augmentation<NssConnectionPointRef> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NssConnectionPointRefBuilder removeAugmentation(Class<? extends Augmentation<NssConnectionPointRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NssConnectionPointRefBuilder doAddAugmentation(Class<? extends Augmentation<NssConnectionPointRef>> augmentationType, Augmentation<NssConnectionPointRef> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public NssConnectionPointRef build() {
        return new NssConnectionPointRefImpl(this);
    }

    private static final class NssConnectionPointRefImpl
        extends AbstractAugmentable<NssConnectionPointRef>
        implements NssConnectionPointRef {
    
        private final IpAddress _ipAddress;
        private final String _nsdConnectionPointRef;
        private final String _nssRef;
        private final NssConnectionPointRefKey key;
    
        NssConnectionPointRefImpl(NssConnectionPointRefBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NssConnectionPointRefKey(base.getNsdConnectionPointRef(), base.getNssRef());
            }
            this._nsdConnectionPointRef = key.getNsdConnectionPointRef();
            this._nssRef = key.getNssRef();
            this._ipAddress = base.getIpAddress();
        }
    
        @Override
        public NssConnectionPointRefKey key() {
            return key;
        }
        
        @Override
        public IpAddress getIpAddress() {
            return _ipAddress;
        }
        
        @Override
        public String getNsdConnectionPointRef() {
            return _nsdConnectionPointRef;
        }
        
        @Override
        public String getNssRef() {
            return _nssRef;
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
            result = prime * result + Objects.hashCode(_ipAddress);
            result = prime * result + Objects.hashCode(_nsdConnectionPointRef);
            result = prime * result + Objects.hashCode(_nssRef);
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
            if (!NssConnectionPointRef.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            NssConnectionPointRef other = (NssConnectionPointRef)obj;
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (!Objects.equals(_nsdConnectionPointRef, other.getNsdConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_nssRef, other.getNssRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NssConnectionPointRefImpl otherImpl = (NssConnectionPointRefImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NssConnectionPointRef>>, Augmentation<NssConnectionPointRef>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NssConnectionPointRef");
            CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
            CodeHelpers.appendValue(helper, "_nsdConnectionPointRef", _nsdConnectionPointRef);
            CodeHelpers.appendValue(helper, "_nssRef", _nssRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
