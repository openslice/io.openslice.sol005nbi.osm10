package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.juju;
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
 * Class that builds {@link JujuBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     JujuBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new JujuBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of JujuBuilder, as instances can be freely passed around without
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
 * @see JujuBuilder
 * @see Builder
 *
 */
public class JujuBuilder implements Builder<Juju> {

    private String _charm;
    private Juju.Cloud _cloud;
    private Boolean _proxy;


    Map<Class<? extends Augmentation<Juju>>, Augmentation<Juju>> augmentation = Collections.emptyMap();

    public JujuBuilder() {
    }

    public JujuBuilder(Juju base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Juju>>, Augmentation<Juju>> aug =((AugmentationHolder<Juju>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._charm = base.getCharm();
        this._cloud = base.getCloud();
        this._proxy = base.isProxy();
    }


    public String getCharm() {
        return _charm;
    }
    
    public Juju.Cloud getCloud() {
        return _cloud;
    }
    
    public Boolean isProxy() {
        return _proxy;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Juju>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public JujuBuilder setCharm(final String value) {
        this._charm = value;
        return this;
    }
    
    public JujuBuilder setCloud(final Juju.Cloud value) {
        this._cloud = value;
        return this;
    }
    
    public JujuBuilder setProxy(final Boolean value) {
        this._proxy = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public JujuBuilder addAugmentation(Augmentation<Juju> augmentation) {
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
    public JujuBuilder addAugmentation(Class<? extends Augmentation<Juju>> augmentationType, Augmentation<Juju> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public JujuBuilder removeAugmentation(Class<? extends Augmentation<Juju>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private JujuBuilder doAddAugmentation(Class<? extends Augmentation<Juju>> augmentationType, Augmentation<Juju> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Juju build() {
        return new JujuImpl(this);
    }

    private static final class JujuImpl
        extends AbstractAugmentable<Juju>
        implements Juju {
    
        private final String _charm;
        private final Juju.Cloud _cloud;
        private final Boolean _proxy;
    
        JujuImpl(JujuBuilder base) {
            super(base.augmentation);
            this._charm = base.getCharm();
            this._cloud = base.getCloud();
            this._proxy = base.isProxy();
        }
    
        @Override
        public String getCharm() {
            return _charm;
        }
        
        @Override
        public Juju.Cloud getCloud() {
            return _cloud;
        }
        
        @Override
        public Boolean isProxy() {
            return _proxy;
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
            result = prime * result + Objects.hashCode(_charm);
            result = prime * result + Objects.hashCode(_cloud);
            result = prime * result + Objects.hashCode(_proxy);
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
            if (!Juju.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Juju other = (Juju)obj;
            if (!Objects.equals(_charm, other.getCharm())) {
                return false;
            }
            if (!Objects.equals(_cloud, other.getCloud())) {
                return false;
            }
            if (!Objects.equals(_proxy, other.isProxy())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                JujuImpl otherImpl = (JujuImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Juju>>, Augmentation<Juju>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Juju");
            CodeHelpers.appendValue(helper, "_charm", _charm);
            CodeHelpers.appendValue(helper, "_cloud", _cloud);
            CodeHelpers.appendValue(helper, "_proxy", _proxy);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
