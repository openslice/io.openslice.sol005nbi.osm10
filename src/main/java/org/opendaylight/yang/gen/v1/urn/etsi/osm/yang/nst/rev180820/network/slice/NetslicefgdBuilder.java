package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.Classifier;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.ClassifierKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.Rsp;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.RspKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetslicefgdBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NetslicefgdBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NetslicefgdBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NetslicefgdBuilder, as instances can be freely passed around without
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
 * @see NetslicefgdBuilder
 * @see Builder
 *
 */
public class NetslicefgdBuilder implements Builder<Netslicefgd> {

    private Map<ClassifierKey, Classifier> _classifier;
    private String _description;
    private String _id;
    private String _name;
    private Map<RspKey, Rsp> _rsp;
    private String _shortName;
    private String _vendor;
    private String _version;
    private NetslicefgdKey key;


    Map<Class<? extends Augmentation<Netslicefgd>>, Augmentation<Netslicefgd>> augmentation = Collections.emptyMap();

    public NetslicefgdBuilder() {
    }
    public NetslicefgdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd arg) {
        this._rsp = arg.getRsp();
        this._classifier = arg.getClassifier();
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
    }
    public NetslicefgdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
    }

    public NetslicefgdBuilder(Netslicefgd base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Netslicefgd>>, Augmentation<Netslicefgd>> aug =((AugmentationHolder<Netslicefgd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._classifier = base.getClassifier();
        this._description = base.getDescription();
        this._name = base.getName();
        this._rsp = base.getRsp();
        this._shortName = base.getShortName();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon)arg).getName();
            this._shortName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon)arg).getShortName();
            this._vendor = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon)arg).getVendor();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon)arg).getDescription();
            this._version = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon)arg).getVersion();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd) {
            this._rsp = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd)arg).getRsp();
            this._classifier = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd)arg).getClassifier();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd]");
    }

    public NetslicefgdKey key() {
        return key;
    }
    
    public Map<ClassifierKey, Classifier> getClassifier() {
        return _classifier;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getName() {
        return _name;
    }
    
    public Map<RspKey, Rsp> getRsp() {
        return _rsp;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public String getVendor() {
        return _vendor;
    }
    
    public String getVersion() {
        return _version;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Netslicefgd>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NetslicefgdBuilder withKey(final NetslicefgdKey key) {
        this.key = key;
        return this;
    }
    public NetslicefgdBuilder setClassifier(final Map<ClassifierKey, Classifier> values) {
        this._classifier = values;
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
      * @deprecated Use {#link #setClassifier(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NetslicefgdBuilder setClassifier(final List<Classifier> values) {
        return setClassifier(CodeHelpers.compatMap(values));
    }
    
    public NetslicefgdBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public NetslicefgdBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public NetslicefgdBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public NetslicefgdBuilder setRsp(final Map<RspKey, Rsp> values) {
        this._rsp = values;
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
      * @deprecated Use {#link #setRsp(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NetslicefgdBuilder setRsp(final List<Rsp> values) {
        return setRsp(CodeHelpers.compatMap(values));
    }
    
    public NetslicefgdBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public NetslicefgdBuilder setVendor(final String value) {
        this._vendor = value;
        return this;
    }
    
    public NetslicefgdBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NetslicefgdBuilder addAugmentation(Augmentation<Netslicefgd> augmentation) {
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
    public NetslicefgdBuilder addAugmentation(Class<? extends Augmentation<Netslicefgd>> augmentationType, Augmentation<Netslicefgd> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NetslicefgdBuilder removeAugmentation(Class<? extends Augmentation<Netslicefgd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NetslicefgdBuilder doAddAugmentation(Class<? extends Augmentation<Netslicefgd>> augmentationType, Augmentation<Netslicefgd> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Netslicefgd build() {
        return new NetslicefgdImpl(this);
    }

    private static final class NetslicefgdImpl
        extends AbstractAugmentable<Netslicefgd>
        implements Netslicefgd {
    
        private final Map<ClassifierKey, Classifier> _classifier;
        private final String _description;
        private final String _id;
        private final String _name;
        private final Map<RspKey, Rsp> _rsp;
        private final String _shortName;
        private final String _vendor;
        private final String _version;
        private final NetslicefgdKey key;
    
        NetslicefgdImpl(NetslicefgdBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetslicefgdKey(base.getId());
            }
            this._id = key.getId();
            this._classifier = CodeHelpers.emptyToNull(base.getClassifier());
            this._description = base.getDescription();
            this._name = base.getName();
            this._rsp = CodeHelpers.emptyToNull(base.getRsp());
            this._shortName = base.getShortName();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
        }
    
        @Override
        public NetslicefgdKey key() {
            return key;
        }
        
        @Override
        public Map<ClassifierKey, Classifier> getClassifier() {
            return _classifier;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Map<RspKey, Rsp> getRsp() {
            return _rsp;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public String getVendor() {
            return _vendor;
        }
        
        @Override
        public String getVersion() {
            return _version;
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
            result = prime * result + Objects.hashCode(_classifier);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_rsp);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
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
            if (!Netslicefgd.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Netslicefgd other = (Netslicefgd)obj;
            if (!Objects.equals(_classifier, other.getClassifier())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_rsp, other.getRsp())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetslicefgdImpl otherImpl = (NetslicefgdImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Netslicefgd>>, Augmentation<Netslicefgd>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Netslicefgd");
            CodeHelpers.appendValue(helper, "_classifier", _classifier);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_rsp", _rsp);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_vendor", _vendor);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
