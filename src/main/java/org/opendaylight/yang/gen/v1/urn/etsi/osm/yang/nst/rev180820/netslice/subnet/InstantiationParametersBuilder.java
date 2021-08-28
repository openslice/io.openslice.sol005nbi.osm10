package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslice.subnet;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params.Vld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params.VldKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params.Vnf;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params.VnfKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link InstantiationParametersBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     InstantiationParametersBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new InstantiationParametersBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of InstantiationParametersBuilder, as instances can be freely passed around without
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
 * @see InstantiationParametersBuilder
 * @see Builder
 *
 */
public class InstantiationParametersBuilder implements Builder<InstantiationParameters> {

    private String _sshKeys;
    private String _vimAccountId;
    private Map<VldKey, Vld> _vld;
    private Map<VnfKey, Vnf> _vnf;


    Map<Class<? extends Augmentation<InstantiationParameters>>, Augmentation<InstantiationParameters>> augmentation = Collections.emptyMap();

    public InstantiationParametersBuilder() {
    }
    public InstantiationParametersBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams arg) {
        this._vimAccountId = arg.getVimAccountId();
        this._sshKeys = arg.getSshKeys();
        this._vnf = arg.getVnf();
        this._vld = arg.getVld();
    }

    public InstantiationParametersBuilder(InstantiationParameters base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<InstantiationParameters>>, Augmentation<InstantiationParameters>> aug =((AugmentationHolder<InstantiationParameters>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._sshKeys = base.getSshKeys();
        this._vimAccountId = base.getVimAccountId();
        this._vld = base.getVld();
        this._vnf = base.getVnf();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams) {
            this._vimAccountId = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams)arg).getVimAccountId();
            this._sshKeys = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams)arg).getSshKeys();
            this._vnf = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams)arg).getVnf();
            this._vld = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams)arg).getVld();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams]");
    }

    public String getSshKeys() {
        return _sshKeys;
    }
    
    public String getVimAccountId() {
        return _vimAccountId;
    }
    
    public Map<VldKey, Vld> getVld() {
        return _vld;
    }
    
    public Map<VnfKey, Vnf> getVnf() {
        return _vnf;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<InstantiationParameters>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public InstantiationParametersBuilder setSshKeys(final String value) {
        this._sshKeys = value;
        return this;
    }
    
    public InstantiationParametersBuilder setVimAccountId(final String value) {
        this._vimAccountId = value;
        return this;
    }
    public InstantiationParametersBuilder setVld(final Map<VldKey, Vld> values) {
        this._vld = values;
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
      * @deprecated Use {#link #setVld(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public InstantiationParametersBuilder setVld(final List<Vld> values) {
        return setVld(CodeHelpers.compatMap(values));
    }
    public InstantiationParametersBuilder setVnf(final Map<VnfKey, Vnf> values) {
        this._vnf = values;
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
      * @deprecated Use {#link #setVnf(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public InstantiationParametersBuilder setVnf(final List<Vnf> values) {
        return setVnf(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public InstantiationParametersBuilder addAugmentation(Augmentation<InstantiationParameters> augmentation) {
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
    public InstantiationParametersBuilder addAugmentation(Class<? extends Augmentation<InstantiationParameters>> augmentationType, Augmentation<InstantiationParameters> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public InstantiationParametersBuilder removeAugmentation(Class<? extends Augmentation<InstantiationParameters>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private InstantiationParametersBuilder doAddAugmentation(Class<? extends Augmentation<InstantiationParameters>> augmentationType, Augmentation<InstantiationParameters> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public InstantiationParameters build() {
        return new InstantiationParametersImpl(this);
    }

    private static final class InstantiationParametersImpl
        extends AbstractAugmentable<InstantiationParameters>
        implements InstantiationParameters {
    
        private final String _sshKeys;
        private final String _vimAccountId;
        private final Map<VldKey, Vld> _vld;
        private final Map<VnfKey, Vnf> _vnf;
    
        InstantiationParametersImpl(InstantiationParametersBuilder base) {
            super(base.augmentation);
            this._sshKeys = base.getSshKeys();
            this._vimAccountId = base.getVimAccountId();
            this._vld = CodeHelpers.emptyToNull(base.getVld());
            this._vnf = CodeHelpers.emptyToNull(base.getVnf());
        }
    
        @Override
        public String getSshKeys() {
            return _sshKeys;
        }
        
        @Override
        public String getVimAccountId() {
            return _vimAccountId;
        }
        
        @Override
        public Map<VldKey, Vld> getVld() {
            return _vld;
        }
        
        @Override
        public Map<VnfKey, Vnf> getVnf() {
            return _vnf;
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
            result = prime * result + Objects.hashCode(_sshKeys);
            result = prime * result + Objects.hashCode(_vimAccountId);
            result = prime * result + Objects.hashCode(_vld);
            result = prime * result + Objects.hashCode(_vnf);
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
            if (!InstantiationParameters.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            InstantiationParameters other = (InstantiationParameters)obj;
            if (!Objects.equals(_sshKeys, other.getSshKeys())) {
                return false;
            }
            if (!Objects.equals(_vimAccountId, other.getVimAccountId())) {
                return false;
            }
            if (!Objects.equals(_vld, other.getVld())) {
                return false;
            }
            if (!Objects.equals(_vnf, other.getVnf())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InstantiationParametersImpl otherImpl = (InstantiationParametersImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InstantiationParameters>>, Augmentation<InstantiationParameters>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InstantiationParameters");
            CodeHelpers.appendValue(helper, "_sshKeys", _sshKeys);
            CodeHelpers.appendValue(helper, "_vimAccountId", _vimAccountId);
            CodeHelpers.appendValue(helper, "_vld", _vld);
            CodeHelpers.appendValue(helper, "_vnf", _vnf);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
