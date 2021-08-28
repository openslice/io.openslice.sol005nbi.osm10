package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads;
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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads.PairedThreadIds;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads.PairedThreadIdsKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * Class that builds {@link PairedThreadsBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     PairedThreadsBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new PairedThreadsBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of PairedThreadsBuilder, as instances can be freely passed around without
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
 * @see PairedThreadsBuilder
 * @see Builder
 *
 */
public class PairedThreadsBuilder implements Builder<PairedThreads> {

    private Uint8 _numPairedThreads;
    private Map<PairedThreadIdsKey, PairedThreadIds> _pairedThreadIds;


    Map<Class<? extends Augmentation<PairedThreads>>, Augmentation<PairedThreads>> augmentation = Collections.emptyMap();

    public PairedThreadsBuilder() {
    }

    public PairedThreadsBuilder(PairedThreads base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<PairedThreads>>, Augmentation<PairedThreads>> aug =((AugmentationHolder<PairedThreads>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._numPairedThreads = base.getNumPairedThreads();
        this._pairedThreadIds = base.getPairedThreadIds();
    }


    public Uint8 getNumPairedThreads() {
        return _numPairedThreads;
    }
    
    public Map<PairedThreadIdsKey, PairedThreadIds> getPairedThreadIds() {
        return _pairedThreadIds;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<PairedThreads>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public PairedThreadsBuilder setNumPairedThreads(final Uint8 value) {
        this._numPairedThreads = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setNumPairedThreads(Uint8)} instead.
     */
    @Deprecated(forRemoval = true)
    public PairedThreadsBuilder setNumPairedThreads(final Short value) {
        return setNumPairedThreads(CodeHelpers.compatUint(value));
    }
    public PairedThreadsBuilder setPairedThreadIds(final Map<PairedThreadIdsKey, PairedThreadIds> values) {
        this._pairedThreadIds = values;
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
      * @deprecated Use {#link #setPairedThreadIds(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public PairedThreadsBuilder setPairedThreadIds(final List<PairedThreadIds> values) {
        return setPairedThreadIds(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public PairedThreadsBuilder addAugmentation(Augmentation<PairedThreads> augmentation) {
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
    public PairedThreadsBuilder addAugmentation(Class<? extends Augmentation<PairedThreads>> augmentationType, Augmentation<PairedThreads> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public PairedThreadsBuilder removeAugmentation(Class<? extends Augmentation<PairedThreads>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private PairedThreadsBuilder doAddAugmentation(Class<? extends Augmentation<PairedThreads>> augmentationType, Augmentation<PairedThreads> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public PairedThreads build() {
        return new PairedThreadsImpl(this);
    }

    private static final class PairedThreadsImpl
        extends AbstractAugmentable<PairedThreads>
        implements PairedThreads {
    
        private final Uint8 _numPairedThreads;
        private final Map<PairedThreadIdsKey, PairedThreadIds> _pairedThreadIds;
    
        PairedThreadsImpl(PairedThreadsBuilder base) {
            super(base.augmentation);
            this._numPairedThreads = base.getNumPairedThreads();
            this._pairedThreadIds = CodeHelpers.emptyToNull(base.getPairedThreadIds());
        }
    
        @Override
        public Uint8 getNumPairedThreads() {
            return _numPairedThreads;
        }
        
        @Override
        public Map<PairedThreadIdsKey, PairedThreadIds> getPairedThreadIds() {
            return _pairedThreadIds;
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
            result = prime * result + Objects.hashCode(_numPairedThreads);
            result = prime * result + Objects.hashCode(_pairedThreadIds);
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
            if (!PairedThreads.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            PairedThreads other = (PairedThreads)obj;
            if (!Objects.equals(_numPairedThreads, other.getNumPairedThreads())) {
                return false;
            }
            if (!Objects.equals(_pairedThreadIds, other.getPairedThreadIds())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PairedThreadsImpl otherImpl = (PairedThreadsImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<PairedThreads>>, Augmentation<PairedThreads>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("PairedThreads");
            CodeHelpers.appendValue(helper, "_numPairedThreads", _numPairedThreads);
            CodeHelpers.appendValue(helper, "_pairedThreadIds", _pairedThreadIds);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
