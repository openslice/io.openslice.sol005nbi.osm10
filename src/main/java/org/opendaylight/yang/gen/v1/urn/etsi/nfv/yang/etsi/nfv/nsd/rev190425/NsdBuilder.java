package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.NsdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Pnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.PnfdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.VnfdKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NsdBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NsdBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NsdBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NsdBuilder, as instances can be freely passed around without
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
 * @see NsdBuilder
 * @see Builder
 *
 */
public class NsdBuilder implements Builder<Nsd> {

    private Map<NsdKey, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Nsd> _nsd;
    private Map<PnfdKey, Pnfd> _pnfd;
    private Map<VnfdKey, Vnfd> _vnfd;


    Map<Class<? extends Augmentation<Nsd>>, Augmentation<Nsd>> augmentation = Collections.emptyMap();

    public NsdBuilder() {
    }

    public NsdBuilder(Nsd base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Nsd>>, Augmentation<Nsd>> aug =((AugmentationHolder<Nsd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._nsd = base.getNsd();
        this._pnfd = base.getPnfd();
        this._vnfd = base.getVnfd();
    }


    public Map<NsdKey, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Nsd> getNsd() {
        return _nsd;
    }
    
    public Map<PnfdKey, Pnfd> getPnfd() {
        return _pnfd;
    }
    
    public Map<VnfdKey, Vnfd> getVnfd() {
        return _vnfd;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Nsd>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NsdBuilder setNsd(final Map<NsdKey, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Nsd> values) {
        this._nsd = values;
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
      * @deprecated Use {#link #setNsd(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setNsd(final List<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Nsd> values) {
        return setNsd(CodeHelpers.compatMap(values));
    }
    public NsdBuilder setPnfd(final Map<PnfdKey, Pnfd> values) {
        this._pnfd = values;
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
      * @deprecated Use {#link #setPnfd(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setPnfd(final List<Pnfd> values) {
        return setPnfd(CodeHelpers.compatMap(values));
    }
    public NsdBuilder setVnfd(final Map<VnfdKey, Vnfd> values) {
        this._vnfd = values;
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
      * @deprecated Use {#link #setVnfd(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setVnfd(final List<Vnfd> values) {
        return setVnfd(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NsdBuilder addAugmentation(Augmentation<Nsd> augmentation) {
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
    public NsdBuilder addAugmentation(Class<? extends Augmentation<Nsd>> augmentationType, Augmentation<Nsd> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NsdBuilder removeAugmentation(Class<? extends Augmentation<Nsd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NsdBuilder doAddAugmentation(Class<? extends Augmentation<Nsd>> augmentationType, Augmentation<Nsd> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Nsd build() {
        return new NsdImpl(this);
    }

    private static final class NsdImpl
        extends AbstractAugmentable<Nsd>
        implements Nsd {
    
        private final Map<NsdKey, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Nsd> _nsd;
        private final Map<PnfdKey, Pnfd> _pnfd;
        private final Map<VnfdKey, Vnfd> _vnfd;
    
        NsdImpl(NsdBuilder base) {
            super(base.augmentation);
            this._nsd = CodeHelpers.emptyToNull(base.getNsd());
            this._pnfd = CodeHelpers.emptyToNull(base.getPnfd());
            this._vnfd = CodeHelpers.emptyToNull(base.getVnfd());
        }
    
        @Override
        public Map<NsdKey, org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Nsd> getNsd() {
            return _nsd;
        }
        
        @Override
        public Map<PnfdKey, Pnfd> getPnfd() {
            return _pnfd;
        }
        
        @Override
        public Map<VnfdKey, Vnfd> getVnfd() {
            return _vnfd;
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
            result = prime * result + Objects.hashCode(_nsd);
            result = prime * result + Objects.hashCode(_pnfd);
            result = prime * result + Objects.hashCode(_vnfd);
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
            if (!Nsd.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Nsd other = (Nsd)obj;
            if (!Objects.equals(_nsd, other.getNsd())) {
                return false;
            }
            if (!Objects.equals(_pnfd, other.getPnfd())) {
                return false;
            }
            if (!Objects.equals(_vnfd, other.getVnfd())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsdImpl otherImpl = (NsdImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Nsd>>, Augmentation<Nsd>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nsd");
            CodeHelpers.appendValue(helper, "_nsd", _nsd);
            CodeHelpers.appendValue(helper, "_pnfd", _pnfd);
            CodeHelpers.appendValue(helper, "_vnfd", _vnfd);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
