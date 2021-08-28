package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.mgmt._interface;
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
 * Class that builds {@link SshKeyBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     SshKeyBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new SshKeyBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of SshKeyBuilder, as instances can be freely passed around without
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
 * @see SshKeyBuilder
 * @see Builder
 *
 */
public class SshKeyBuilder implements Builder<SshKey> {

    private String _privateKeyFile;
    private String _publicKey;


    Map<Class<? extends Augmentation<SshKey>>, Augmentation<SshKey>> augmentation = Collections.emptyMap();

    public SshKeyBuilder() {
    }

    public SshKeyBuilder(SshKey base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<SshKey>>, Augmentation<SshKey>> aug =((AugmentationHolder<SshKey>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._privateKeyFile = base.getPrivateKeyFile();
        this._publicKey = base.getPublicKey();
    }


    public String getPrivateKeyFile() {
        return _privateKeyFile;
    }
    
    public String getPublicKey() {
        return _publicKey;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<SshKey>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public SshKeyBuilder setPrivateKeyFile(final String value) {
        this._privateKeyFile = value;
        return this;
    }
    
    public SshKeyBuilder setPublicKey(final String value) {
        this._publicKey = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public SshKeyBuilder addAugmentation(Augmentation<SshKey> augmentation) {
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
    public SshKeyBuilder addAugmentation(Class<? extends Augmentation<SshKey>> augmentationType, Augmentation<SshKey> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public SshKeyBuilder removeAugmentation(Class<? extends Augmentation<SshKey>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private SshKeyBuilder doAddAugmentation(Class<? extends Augmentation<SshKey>> augmentationType, Augmentation<SshKey> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public SshKey build() {
        return new SshKeyImpl(this);
    }

    private static final class SshKeyImpl
        extends AbstractAugmentable<SshKey>
        implements SshKey {
    
        private final String _privateKeyFile;
        private final String _publicKey;
    
        SshKeyImpl(SshKeyBuilder base) {
            super(base.augmentation);
            this._privateKeyFile = base.getPrivateKeyFile();
            this._publicKey = base.getPublicKey();
        }
    
        @Override
        public String getPrivateKeyFile() {
            return _privateKeyFile;
        }
        
        @Override
        public String getPublicKey() {
            return _publicKey;
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
            result = prime * result + Objects.hashCode(_privateKeyFile);
            result = prime * result + Objects.hashCode(_publicKey);
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
            if (!SshKey.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            SshKey other = (SshKey)obj;
            if (!Objects.equals(_privateKeyFile, other.getPrivateKeyFile())) {
                return false;
            }
            if (!Objects.equals(_publicKey, other.getPublicKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SshKeyImpl otherImpl = (SshKeyImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SshKey>>, Augmentation<SshKey>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SshKey");
            CodeHelpers.appendValue(helper, "_privateKeyFile", _privateKeyFile);
            CodeHelpers.appendValue(helper, "_publicKey", _publicKey);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
