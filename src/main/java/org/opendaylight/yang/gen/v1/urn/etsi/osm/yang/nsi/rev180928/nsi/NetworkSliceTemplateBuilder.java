package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceConnectionPointKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceSubnet;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceSubnetKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceVld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceVldKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.Netslicefgd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetslicefgdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.QualityOfService;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.SNSSAIIdentifier;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetworkSliceTemplateBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NetworkSliceTemplateBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NetworkSliceTemplateBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NetworkSliceTemplateBuilder, as instances can be freely passed around without
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
 * @see NetworkSliceTemplateBuilder
 * @see Builder
 *
 */
public class NetworkSliceTemplateBuilder implements Builder<NetworkSliceTemplate> {

    private String _id;
    private String _name;
    private Map<NetsliceConnectionPointKey, NetsliceConnectionPoint> _netsliceConnectionPoint;
    private Map<NetsliceSubnetKey, NetsliceSubnet> _netsliceSubnet;
    private Map<NetsliceVldKey, NetsliceVld> _netsliceVld;
    private Map<NetslicefgdKey, Netslicefgd> _netslicefgd;
    private QualityOfService _qualityOfService;
    private SNSSAIIdentifier _sNSSAIIdentifier;


    Map<Class<? extends Augmentation<NetworkSliceTemplate>>, Augmentation<NetworkSliceTemplate>> augmentation = Collections.emptyMap();

    public NetworkSliceTemplateBuilder() {
    }
    public NetworkSliceTemplateBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._sNSSAIIdentifier = arg.getSNSSAIIdentifier();
        this._qualityOfService = arg.getQualityOfService();
        this._netsliceSubnet = arg.getNetsliceSubnet();
        this._netsliceConnectionPoint = arg.getNetsliceConnectionPoint();
        this._netsliceVld = arg.getNetsliceVld();
        this._netslicefgd = arg.getNetslicefgd();
    }

    public NetworkSliceTemplateBuilder(NetworkSliceTemplate base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NetworkSliceTemplate>>, Augmentation<NetworkSliceTemplate>> aug =((AugmentationHolder<NetworkSliceTemplate>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this._id = base.getId();
        this._name = base.getName();
        this._netsliceConnectionPoint = base.getNetsliceConnectionPoint();
        this._netsliceSubnet = base.getNetsliceSubnet();
        this._netsliceVld = base.getNetsliceVld();
        this._netslicefgd = base.getNetslicefgd();
        this._qualityOfService = base.getQualityOfService();
        this._sNSSAIIdentifier = base.getSNSSAIIdentifier();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getName();
            this._sNSSAIIdentifier = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getSNSSAIIdentifier();
            this._qualityOfService = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getQualityOfService();
            this._netsliceSubnet = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getNetsliceSubnet();
            this._netsliceConnectionPoint = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getNetsliceConnectionPoint();
            this._netsliceVld = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getNetsliceVld();
            this._netslicefgd = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getNetslicefgd();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice]");
    }

    public String getId() {
        return _id;
    }
    
    public String getName() {
        return _name;
    }
    
    public Map<NetsliceConnectionPointKey, NetsliceConnectionPoint> getNetsliceConnectionPoint() {
        return _netsliceConnectionPoint;
    }
    
    public Map<NetsliceSubnetKey, NetsliceSubnet> getNetsliceSubnet() {
        return _netsliceSubnet;
    }
    
    public Map<NetsliceVldKey, NetsliceVld> getNetsliceVld() {
        return _netsliceVld;
    }
    
    public Map<NetslicefgdKey, Netslicefgd> getNetslicefgd() {
        return _netslicefgd;
    }
    
    public QualityOfService getQualityOfService() {
        return _qualityOfService;
    }
    
    public SNSSAIIdentifier getSNSSAIIdentifier() {
        return _sNSSAIIdentifier;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<NetworkSliceTemplate>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    
    public NetworkSliceTemplateBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public NetworkSliceTemplateBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public NetworkSliceTemplateBuilder setNetsliceConnectionPoint(final Map<NetsliceConnectionPointKey, NetsliceConnectionPoint> values) {
        this._netsliceConnectionPoint = values;
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
      * @deprecated Use {#link #setNetsliceConnectionPoint(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NetworkSliceTemplateBuilder setNetsliceConnectionPoint(final List<NetsliceConnectionPoint> values) {
        return setNetsliceConnectionPoint(CodeHelpers.compatMap(values));
    }
    public NetworkSliceTemplateBuilder setNetsliceSubnet(final Map<NetsliceSubnetKey, NetsliceSubnet> values) {
        this._netsliceSubnet = values;
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
      * @deprecated Use {#link #setNetsliceSubnet(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NetworkSliceTemplateBuilder setNetsliceSubnet(final List<NetsliceSubnet> values) {
        return setNetsliceSubnet(CodeHelpers.compatMap(values));
    }
    public NetworkSliceTemplateBuilder setNetsliceVld(final Map<NetsliceVldKey, NetsliceVld> values) {
        this._netsliceVld = values;
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
      * @deprecated Use {#link #setNetsliceVld(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NetworkSliceTemplateBuilder setNetsliceVld(final List<NetsliceVld> values) {
        return setNetsliceVld(CodeHelpers.compatMap(values));
    }
    public NetworkSliceTemplateBuilder setNetslicefgd(final Map<NetslicefgdKey, Netslicefgd> values) {
        this._netslicefgd = values;
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
      * @deprecated Use {#link #setNetslicefgd(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NetworkSliceTemplateBuilder setNetslicefgd(final List<Netslicefgd> values) {
        return setNetslicefgd(CodeHelpers.compatMap(values));
    }
    
    public NetworkSliceTemplateBuilder setQualityOfService(final QualityOfService value) {
        this._qualityOfService = value;
        return this;
    }
    
    public NetworkSliceTemplateBuilder setSNSSAIIdentifier(final SNSSAIIdentifier value) {
        this._sNSSAIIdentifier = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NetworkSliceTemplateBuilder addAugmentation(Augmentation<NetworkSliceTemplate> augmentation) {
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
    public NetworkSliceTemplateBuilder addAugmentation(Class<? extends Augmentation<NetworkSliceTemplate>> augmentationType, Augmentation<NetworkSliceTemplate> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NetworkSliceTemplateBuilder removeAugmentation(Class<? extends Augmentation<NetworkSliceTemplate>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NetworkSliceTemplateBuilder doAddAugmentation(Class<? extends Augmentation<NetworkSliceTemplate>> augmentationType, Augmentation<NetworkSliceTemplate> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public NetworkSliceTemplate build() {
        return new NetworkSliceTemplateImpl(this);
    }

    private static final class NetworkSliceTemplateImpl
        extends AbstractAugmentable<NetworkSliceTemplate>
        implements NetworkSliceTemplate {
    
        private final String _id;
        private final String _name;
        private final Map<NetsliceConnectionPointKey, NetsliceConnectionPoint> _netsliceConnectionPoint;
        private final Map<NetsliceSubnetKey, NetsliceSubnet> _netsliceSubnet;
        private final Map<NetsliceVldKey, NetsliceVld> _netsliceVld;
        private final Map<NetslicefgdKey, Netslicefgd> _netslicefgd;
        private final QualityOfService _qualityOfService;
        private final SNSSAIIdentifier _sNSSAIIdentifier;
    
        NetworkSliceTemplateImpl(NetworkSliceTemplateBuilder base) {
            super(base.augmentation);
            this._id = base.getId();
            this._name = base.getName();
            this._netsliceConnectionPoint = CodeHelpers.emptyToNull(base.getNetsliceConnectionPoint());
            this._netsliceSubnet = CodeHelpers.emptyToNull(base.getNetsliceSubnet());
            this._netsliceVld = CodeHelpers.emptyToNull(base.getNetsliceVld());
            this._netslicefgd = CodeHelpers.emptyToNull(base.getNetslicefgd());
            this._qualityOfService = base.getQualityOfService();
            this._sNSSAIIdentifier = base.getSNSSAIIdentifier();
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
        public Map<NetsliceConnectionPointKey, NetsliceConnectionPoint> getNetsliceConnectionPoint() {
            return _netsliceConnectionPoint;
        }
        
        @Override
        public Map<NetsliceSubnetKey, NetsliceSubnet> getNetsliceSubnet() {
            return _netsliceSubnet;
        }
        
        @Override
        public Map<NetsliceVldKey, NetsliceVld> getNetsliceVld() {
            return _netsliceVld;
        }
        
        @Override
        public Map<NetslicefgdKey, Netslicefgd> getNetslicefgd() {
            return _netslicefgd;
        }
        
        @Override
        public QualityOfService getQualityOfService() {
            return _qualityOfService;
        }
        
        @Override
        public SNSSAIIdentifier getSNSSAIIdentifier() {
            return _sNSSAIIdentifier;
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_netsliceConnectionPoint);
            result = prime * result + Objects.hashCode(_netsliceSubnet);
            result = prime * result + Objects.hashCode(_netsliceVld);
            result = prime * result + Objects.hashCode(_netslicefgd);
            result = prime * result + Objects.hashCode(_qualityOfService);
            result = prime * result + Objects.hashCode(_sNSSAIIdentifier);
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
            if (!NetworkSliceTemplate.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            NetworkSliceTemplate other = (NetworkSliceTemplate)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_netsliceConnectionPoint, other.getNetsliceConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_netsliceSubnet, other.getNetsliceSubnet())) {
                return false;
            }
            if (!Objects.equals(_netsliceVld, other.getNetsliceVld())) {
                return false;
            }
            if (!Objects.equals(_netslicefgd, other.getNetslicefgd())) {
                return false;
            }
            if (!Objects.equals(_qualityOfService, other.getQualityOfService())) {
                return false;
            }
            if (!Objects.equals(_sNSSAIIdentifier, other.getSNSSAIIdentifier())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkSliceTemplateImpl otherImpl = (NetworkSliceTemplateImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NetworkSliceTemplate>>, Augmentation<NetworkSliceTemplate>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetworkSliceTemplate");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_netsliceConnectionPoint", _netsliceConnectionPoint);
            CodeHelpers.appendValue(helper, "_netsliceSubnet", _netsliceSubnet);
            CodeHelpers.appendValue(helper, "_netsliceVld", _netsliceVld);
            CodeHelpers.appendValue(helper, "_netslicefgd", _netslicefgd);
            CodeHelpers.appendValue(helper, "_qualityOfService", _qualityOfService);
            CodeHelpers.appendValue(helper, "_sNSSAIIdentifier", _sNSSAIIdentifier);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
