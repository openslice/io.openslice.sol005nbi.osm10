package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link SecurityBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     SecurityBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new SecurityBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of SecurityBuilder, as instances can be freely passed around without
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
 * @see SecurityBuilder
 * @see Builder
 *
 */
public class SecurityBuilder implements Builder<Security> {

    private String _algorithm;
    private String _certificate;
    private String _signature;
    private SecurityKey key;


    Map<Class<? extends Augmentation<Security>>, Augmentation<Security>> augmentation = Collections.emptyMap();

    public SecurityBuilder() {
    }
    public SecurityBuilder(org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters arg) {
        this._signature = arg.getSignature();
        this._algorithm = arg.getAlgorithm();
        this._certificate = arg.getCertificate();
    }

    public SecurityBuilder(Security base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Security>>, Augmentation<Security>> aug =((AugmentationHolder<Security>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._signature = base.getSignature();
        this._algorithm = base.getAlgorithm();
        this._certificate = base.getCertificate();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters) {
            this._signature = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters)arg).getSignature();
            this._algorithm = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters)arg).getAlgorithm();
            this._certificate = ((org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters)arg).getCertificate();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters]");
    }

    public SecurityKey key() {
        return key;
    }
    
    public String getAlgorithm() {
        return _algorithm;
    }
    
    public String getCertificate() {
        return _certificate;
    }
    
    public String getSignature() {
        return _signature;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Security>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public SecurityBuilder withKey(final SecurityKey key) {
        this.key = key;
        return this;
    }
    
    public SecurityBuilder setAlgorithm(final String value) {
        this._algorithm = value;
        return this;
    }
    
    public SecurityBuilder setCertificate(final String value) {
        this._certificate = value;
        return this;
    }
    
    public SecurityBuilder setSignature(final String value) {
        this._signature = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public SecurityBuilder addAugmentation(Augmentation<Security> augmentation) {
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
    public SecurityBuilder addAugmentation(Class<? extends Augmentation<Security>> augmentationType, Augmentation<Security> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public SecurityBuilder removeAugmentation(Class<? extends Augmentation<Security>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private SecurityBuilder doAddAugmentation(Class<? extends Augmentation<Security>> augmentationType, Augmentation<Security> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Security build() {
        return new SecurityImpl(this);
    }

    private static final class SecurityImpl
        extends AbstractAugmentable<Security>
        implements Security {
    
        private final String _algorithm;
        private final String _certificate;
        private final String _signature;
        private final SecurityKey key;
    
        SecurityImpl(SecurityBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new SecurityKey(base.getSignature());
            }
            this._signature = key.getSignature();
            this._algorithm = base.getAlgorithm();
            this._certificate = base.getCertificate();
        }
    
        @Override
        public SecurityKey key() {
            return key;
        }
        
        @Override
        public String getAlgorithm() {
            return _algorithm;
        }
        
        @Override
        public String getCertificate() {
            return _certificate;
        }
        
        @Override
        public String getSignature() {
            return _signature;
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
            result = prime * result + Objects.hashCode(_algorithm);
            result = prime * result + Objects.hashCode(_certificate);
            result = prime * result + Objects.hashCode(_signature);
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
            if (!Security.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Security other = (Security)obj;
            if (!Objects.equals(_algorithm, other.getAlgorithm())) {
                return false;
            }
            if (!Objects.equals(_certificate, other.getCertificate())) {
                return false;
            }
            if (!Objects.equals(_signature, other.getSignature())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SecurityImpl otherImpl = (SecurityImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Security>>, Augmentation<Security>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Security");
            CodeHelpers.appendValue(helper, "_algorithm", _algorithm);
            CodeHelpers.appendValue(helper, "_certificate", _certificate);
            CodeHelpers.appendValue(helper, "_signature", _signature);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
