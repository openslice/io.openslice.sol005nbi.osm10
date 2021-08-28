package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.pnf.profile;
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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.pnf.profile.virtual.link.connectivity.ConstituentCpdId;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.pnf.profile.virtual.link.connectivity.ConstituentCpdIdKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VirtualLinkConnectivityBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VirtualLinkConnectivityBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VirtualLinkConnectivityBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VirtualLinkConnectivityBuilder, as instances can be freely passed around without
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
 * @see VirtualLinkConnectivityBuilder
 * @see Builder
 *
 */
public class VirtualLinkConnectivityBuilder implements Builder<VirtualLinkConnectivity> {

    private Map<ConstituentCpdIdKey, ConstituentCpdId> _constituentCpdId;
    private String _virtualLinkProfileId;
    private VirtualLinkConnectivityKey key;


    Map<Class<? extends Augmentation<VirtualLinkConnectivity>>, Augmentation<VirtualLinkConnectivity>> augmentation = Collections.emptyMap();

    public VirtualLinkConnectivityBuilder() {
    }

    public VirtualLinkConnectivityBuilder(VirtualLinkConnectivity base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VirtualLinkConnectivity>>, Augmentation<VirtualLinkConnectivity>> aug =((AugmentationHolder<VirtualLinkConnectivity>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._virtualLinkProfileId = base.getVirtualLinkProfileId();
        this._constituentCpdId = base.getConstituentCpdId();
    }


    public VirtualLinkConnectivityKey key() {
        return key;
    }
    
    public Map<ConstituentCpdIdKey, ConstituentCpdId> getConstituentCpdId() {
        return _constituentCpdId;
    }
    
    public String getVirtualLinkProfileId() {
        return _virtualLinkProfileId;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<VirtualLinkConnectivity>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VirtualLinkConnectivityBuilder withKey(final VirtualLinkConnectivityKey key) {
        this.key = key;
        return this;
    }
    public VirtualLinkConnectivityBuilder setConstituentCpdId(final Map<ConstituentCpdIdKey, ConstituentCpdId> values) {
        this._constituentCpdId = values;
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
      * @deprecated Use {#link #setConstituentCpdId(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VirtualLinkConnectivityBuilder setConstituentCpdId(final List<ConstituentCpdId> values) {
        return setConstituentCpdId(CodeHelpers.compatMap(values));
    }
    
    public VirtualLinkConnectivityBuilder setVirtualLinkProfileId(final String value) {
        this._virtualLinkProfileId = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VirtualLinkConnectivityBuilder addAugmentation(Augmentation<VirtualLinkConnectivity> augmentation) {
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
    public VirtualLinkConnectivityBuilder addAugmentation(Class<? extends Augmentation<VirtualLinkConnectivity>> augmentationType, Augmentation<VirtualLinkConnectivity> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VirtualLinkConnectivityBuilder removeAugmentation(Class<? extends Augmentation<VirtualLinkConnectivity>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VirtualLinkConnectivityBuilder doAddAugmentation(Class<? extends Augmentation<VirtualLinkConnectivity>> augmentationType, Augmentation<VirtualLinkConnectivity> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public VirtualLinkConnectivity build() {
        return new VirtualLinkConnectivityImpl(this);
    }

    private static final class VirtualLinkConnectivityImpl
        extends AbstractAugmentable<VirtualLinkConnectivity>
        implements VirtualLinkConnectivity {
    
        private final Map<ConstituentCpdIdKey, ConstituentCpdId> _constituentCpdId;
        private final String _virtualLinkProfileId;
        private final VirtualLinkConnectivityKey key;
    
        VirtualLinkConnectivityImpl(VirtualLinkConnectivityBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VirtualLinkConnectivityKey(base.getVirtualLinkProfileId());
            }
            this._virtualLinkProfileId = key.getVirtualLinkProfileId();
            this._constituentCpdId = CodeHelpers.emptyToNull(base.getConstituentCpdId());
        }
    
        @Override
        public VirtualLinkConnectivityKey key() {
            return key;
        }
        
        @Override
        public Map<ConstituentCpdIdKey, ConstituentCpdId> getConstituentCpdId() {
            return _constituentCpdId;
        }
        
        @Override
        public String getVirtualLinkProfileId() {
            return _virtualLinkProfileId;
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
            result = prime * result + Objects.hashCode(_constituentCpdId);
            result = prime * result + Objects.hashCode(_virtualLinkProfileId);
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
            if (!VirtualLinkConnectivity.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            VirtualLinkConnectivity other = (VirtualLinkConnectivity)obj;
            if (!Objects.equals(_constituentCpdId, other.getConstituentCpdId())) {
                return false;
            }
            if (!Objects.equals(_virtualLinkProfileId, other.getVirtualLinkProfileId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualLinkConnectivityImpl otherImpl = (VirtualLinkConnectivityImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VirtualLinkConnectivity>>, Augmentation<VirtualLinkConnectivity>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualLinkConnectivity");
            CodeHelpers.appendValue(helper, "_constituentCpdId", _constituentCpdId);
            CodeHelpers.appendValue(helper, "_virtualLinkProfileId", _virtualLinkProfileId);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
