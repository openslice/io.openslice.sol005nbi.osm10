package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vdu.config.access.config.access;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
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
 * Class that builds {@link SshAccessBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     SshAccessBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new SshAccessBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of SshAccessBuilder, as instances can be freely passed around without
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
 * @see SshAccessBuilder
 * @see Builder
 *
 */
public class SshAccessBuilder implements Builder<SshAccess> {

    private String _defaultUser;
    private Boolean _required;


    Map<Class<? extends Augmentation<SshAccess>>, Augmentation<SshAccess>> augmentation = Collections.emptyMap();

    public SshAccessBuilder() {
    }

    public SshAccessBuilder(SshAccess base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<SshAccess>>, Augmentation<SshAccess>> aug =((AugmentationHolder<SshAccess>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._defaultUser = base.getDefaultUser();
        this._required = base.isRequired();
    }


    public String getDefaultUser() {
        return _defaultUser;
    }
    
    public Boolean isRequired() {
        return _required;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<SshAccess>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public SshAccessBuilder setDefaultUser(final String value) {
        this._defaultUser = value;
        return this;
    }
    
    public SshAccessBuilder setRequired(final Boolean value) {
        this._required = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public SshAccessBuilder addAugmentation(Augmentation<SshAccess> augmentation) {
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
    public SshAccessBuilder addAugmentation(Class<? extends Augmentation<SshAccess>> augmentationType, Augmentation<SshAccess> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public SshAccessBuilder removeAugmentation(Class<? extends Augmentation<SshAccess>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private SshAccessBuilder doAddAugmentation(Class<? extends Augmentation<SshAccess>> augmentationType, Augmentation<SshAccess> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public SshAccess build() {
        return new SshAccessImpl(this);
    }

    private static final class SshAccessImpl
        extends AbstractAugmentable<SshAccess>
        implements SshAccess {
    
        private final String _defaultUser;
        private final Boolean _required;
    
        SshAccessImpl(SshAccessBuilder base) {
            super(base.augmentation);
            this._defaultUser = base.getDefaultUser();
            this._required = base.isRequired();
        }
    
        @Override
        public String getDefaultUser() {
            return _defaultUser;
        }
        
        @Override
        public Boolean isRequired() {
            return _required;
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
            result = prime * result + Objects.hashCode(_defaultUser);
            result = prime * result + Objects.hashCode(_required);
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
            if (!SshAccess.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            SshAccess other = (SshAccess)obj;
            if (!Objects.equals(_defaultUser, other.getDefaultUser())) {
                return false;
            }
            if (!Objects.equals(_required, other.isRequired())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SshAccessImpl otherImpl = (SshAccessImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SshAccess>>, Augmentation<SshAccess>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SshAccess");
            CodeHelpers.appendValue(helper, "_defaultUser", _defaultUser);
            CodeHelpers.appendValue(helper, "_required", _required);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
