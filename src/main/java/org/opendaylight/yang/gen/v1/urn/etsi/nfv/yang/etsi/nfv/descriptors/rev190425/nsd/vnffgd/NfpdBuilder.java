package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.PositionDescId;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.PositionDescIdKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NfpdBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NfpdBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NfpdBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NfpdBuilder, as instances can be freely passed around without
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
 * @see NfpdBuilder
 * @see Builder
 *
 */
public class NfpdBuilder implements Builder<Nfpd> {

    private String _id;
    private Map<PositionDescIdKey, PositionDescId> _positionDescId;
    private String _rule;
    private NfpdKey key;


    Map<Class<? extends Augmentation<Nfpd>>, Augmentation<Nfpd>> augmentation = Collections.emptyMap();

    public NfpdBuilder() {
    }

    public NfpdBuilder(Nfpd base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Nfpd>>, Augmentation<Nfpd>> aug =((AugmentationHolder<Nfpd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._positionDescId = base.getPositionDescId();
        this._rule = base.getRule();
    }


    public NfpdKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public Map<PositionDescIdKey, PositionDescId> getPositionDescId() {
        return _positionDescId;
    }
    
    public String getRule() {
        return _rule;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Nfpd>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NfpdBuilder withKey(final NfpdKey key) {
        this.key = key;
        return this;
    }
    
    public NfpdBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public NfpdBuilder setPositionDescId(final Map<PositionDescIdKey, PositionDescId> values) {
        this._positionDescId = values;
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
      * @deprecated Use {#link #setPositionDescId(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NfpdBuilder setPositionDescId(final List<PositionDescId> values) {
        return setPositionDescId(CodeHelpers.compatMap(values));
    }
    
    public NfpdBuilder setRule(final String value) {
        this._rule = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NfpdBuilder addAugmentation(Augmentation<Nfpd> augmentation) {
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
    public NfpdBuilder addAugmentation(Class<? extends Augmentation<Nfpd>> augmentationType, Augmentation<Nfpd> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NfpdBuilder removeAugmentation(Class<? extends Augmentation<Nfpd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NfpdBuilder doAddAugmentation(Class<? extends Augmentation<Nfpd>> augmentationType, Augmentation<Nfpd> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Nfpd build() {
        return new NfpdImpl(this);
    }

    private static final class NfpdImpl
        extends AbstractAugmentable<Nfpd>
        implements Nfpd {
    
        private final String _id;
        private final Map<PositionDescIdKey, PositionDescId> _positionDescId;
        private final String _rule;
        private final NfpdKey key;
    
        NfpdImpl(NfpdBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NfpdKey(base.getId());
            }
            this._id = key.getId();
            this._positionDescId = CodeHelpers.emptyToNull(base.getPositionDescId());
            this._rule = base.getRule();
        }
    
        @Override
        public NfpdKey key() {
            return key;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Map<PositionDescIdKey, PositionDescId> getPositionDescId() {
            return _positionDescId;
        }
        
        @Override
        public String getRule() {
            return _rule;
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_positionDescId);
            result = prime * result + Objects.hashCode(_rule);
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
            if (!Nfpd.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Nfpd other = (Nfpd)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_positionDescId, other.getPositionDescId())) {
                return false;
            }
            if (!Objects.equals(_rule, other.getRule())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NfpdImpl otherImpl = (NfpdImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Nfpd>>, Augmentation<Nfpd>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nfpd");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_positionDescId", _positionDescId);
            CodeHelpers.appendValue(helper, "_rule", _rule);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
