package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config.user.SshAuthorizedKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config.user.SshAuthorizedKeyKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link UserBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     UserBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new UserBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of UserBuilder, as instances can be freely passed around without
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
 * @see UserBuilder
 * @see Builder
 *
 */
public class UserBuilder implements Builder<User> {

    private String _name;
    private Map<SshAuthorizedKeyKey, SshAuthorizedKey> _sshAuthorizedKey;
    private String _userInfo;
    private UserKey key;


    Map<Class<? extends Augmentation<User>>, Augmentation<User>> augmentation = Collections.emptyMap();

    public UserBuilder() {
    }

    public UserBuilder(User base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<User>>, Augmentation<User>> aug =((AugmentationHolder<User>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._name = base.getName();
        this._sshAuthorizedKey = base.getSshAuthorizedKey();
        this._userInfo = base.getUserInfo();
    }


    public UserKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    public Map<SshAuthorizedKeyKey, SshAuthorizedKey> getSshAuthorizedKey() {
        return _sshAuthorizedKey;
    }
    
    public String getUserInfo() {
        return _userInfo;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<User>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public UserBuilder withKey(final UserKey key) {
        this.key = key;
        return this;
    }
    
    public UserBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public UserBuilder setSshAuthorizedKey(final Map<SshAuthorizedKeyKey, SshAuthorizedKey> values) {
        this._sshAuthorizedKey = values;
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
      * @deprecated Use {#link #setSshAuthorizedKey(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public UserBuilder setSshAuthorizedKey(final List<SshAuthorizedKey> values) {
        return setSshAuthorizedKey(CodeHelpers.compatMap(values));
    }
    
    public UserBuilder setUserInfo(final String value) {
        this._userInfo = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public UserBuilder addAugmentation(Augmentation<User> augmentation) {
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
    public UserBuilder addAugmentation(Class<? extends Augmentation<User>> augmentationType, Augmentation<User> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public UserBuilder removeAugmentation(Class<? extends Augmentation<User>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private UserBuilder doAddAugmentation(Class<? extends Augmentation<User>> augmentationType, Augmentation<User> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public User build() {
        return new UserImpl(this);
    }

    private static final class UserImpl
        extends AbstractAugmentable<User>
        implements User {
    
        private final String _name;
        private final Map<SshAuthorizedKeyKey, SshAuthorizedKey> _sshAuthorizedKey;
        private final String _userInfo;
        private final UserKey key;
    
        UserImpl(UserBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new UserKey(base.getName());
            }
            this._name = key.getName();
            this._sshAuthorizedKey = CodeHelpers.emptyToNull(base.getSshAuthorizedKey());
            this._userInfo = base.getUserInfo();
        }
    
        @Override
        public UserKey key() {
            return key;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Map<SshAuthorizedKeyKey, SshAuthorizedKey> getSshAuthorizedKey() {
            return _sshAuthorizedKey;
        }
        
        @Override
        public String getUserInfo() {
            return _userInfo;
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_sshAuthorizedKey);
            result = prime * result + Objects.hashCode(_userInfo);
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
            if (!User.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            User other = (User)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_sshAuthorizedKey, other.getSshAuthorizedKey())) {
                return false;
            }
            if (!Objects.equals(_userInfo, other.getUserInfo())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UserImpl otherImpl = (UserImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<User>>, Augmentation<User>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("User");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_sshAuthorizedKey", _sshAuthorizedKey);
            CodeHelpers.appendValue(helper, "_userInfo", _userInfo);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
