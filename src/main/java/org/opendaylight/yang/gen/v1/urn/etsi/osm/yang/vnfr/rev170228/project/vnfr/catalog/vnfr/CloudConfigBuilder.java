package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.KeyPair;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.KeyPairKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.User;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.UserKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link CloudConfigBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     CloudConfigBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new CloudConfigBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of CloudConfigBuilder, as instances can be freely passed around without
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
 * @see CloudConfigBuilder
 * @see Builder
 *
 */
public class CloudConfigBuilder implements Builder<CloudConfig> {

    private Map<KeyPairKey, KeyPair> _keyPair;
    private Map<UserKey, User> _user;


    Map<Class<? extends Augmentation<CloudConfig>>, Augmentation<CloudConfig>> augmentation = Collections.emptyMap();

    public CloudConfigBuilder() {
    }
    public CloudConfigBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig arg) {
        this._keyPair = arg.getKeyPair();
        this._user = arg.getUser();
    }

    public CloudConfigBuilder(CloudConfig base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CloudConfig>>, Augmentation<CloudConfig>> aug =((AugmentationHolder<CloudConfig>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._keyPair = base.getKeyPair();
        this._user = base.getUser();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig) {
            this._keyPair = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig)arg).getKeyPair();
            this._user = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig)arg).getUser();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig]");
    }

    public Map<KeyPairKey, KeyPair> getKeyPair() {
        return _keyPair;
    }
    
    public Map<UserKey, User> getUser() {
        return _user;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<CloudConfig>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public CloudConfigBuilder setKeyPair(final Map<KeyPairKey, KeyPair> values) {
        this._keyPair = values;
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
      * @deprecated Use {#link #setKeyPair(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public CloudConfigBuilder setKeyPair(final List<KeyPair> values) {
        return setKeyPair(CodeHelpers.compatMap(values));
    }
    public CloudConfigBuilder setUser(final Map<UserKey, User> values) {
        this._user = values;
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
      * @deprecated Use {#link #setUser(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public CloudConfigBuilder setUser(final List<User> values) {
        return setUser(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public CloudConfigBuilder addAugmentation(Augmentation<CloudConfig> augmentation) {
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
    public CloudConfigBuilder addAugmentation(Class<? extends Augmentation<CloudConfig>> augmentationType, Augmentation<CloudConfig> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public CloudConfigBuilder removeAugmentation(Class<? extends Augmentation<CloudConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private CloudConfigBuilder doAddAugmentation(Class<? extends Augmentation<CloudConfig>> augmentationType, Augmentation<CloudConfig> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public CloudConfig build() {
        return new CloudConfigImpl(this);
    }

    private static final class CloudConfigImpl
        extends AbstractAugmentable<CloudConfig>
        implements CloudConfig {
    
        private final Map<KeyPairKey, KeyPair> _keyPair;
        private final Map<UserKey, User> _user;
    
        CloudConfigImpl(CloudConfigBuilder base) {
            super(base.augmentation);
            this._keyPair = CodeHelpers.emptyToNull(base.getKeyPair());
            this._user = CodeHelpers.emptyToNull(base.getUser());
        }
    
        @Override
        public Map<KeyPairKey, KeyPair> getKeyPair() {
            return _keyPair;
        }
        
        @Override
        public Map<UserKey, User> getUser() {
            return _user;
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
            result = prime * result + Objects.hashCode(_keyPair);
            result = prime * result + Objects.hashCode(_user);
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
            if (!CloudConfig.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            CloudConfig other = (CloudConfig)obj;
            if (!Objects.equals(_keyPair, other.getKeyPair())) {
                return false;
            }
            if (!Objects.equals(_user, other.getUser())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CloudConfigImpl otherImpl = (CloudConfigImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CloudConfig>>, Augmentation<CloudConfig>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CloudConfig");
            CodeHelpers.appendValue(helper, "_keyPair", _keyPair);
            CodeHelpers.appendValue(helper, "_user", _user);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
