package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.config;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.InputParameter;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.InputParameterKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config.SshAuthorizedKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config.SshAuthorizedKeyKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config.User;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config.UserKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.VnfdPlacementGroupMaps;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.VnfdPlacementGroupMapsKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMapsKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.ScalingGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.config.nsr.Nsd;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NsrBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NsrBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NsrBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NsrBuilder, as instances can be freely passed around without
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
 * @see NsrBuilder
 * @see Builder
 *
 */
public class NsrBuilder implements Builder<Nsr> {

    private Nsr.AdminStatus _adminStatus;
    private String _description;
    private Uuid _id;
    private Map<InputParameterKey, InputParameter> _inputParameter;
    private String _name;
    private Nsd _nsd;
    private Map<NsdPlacementGroupMapsKey, NsdPlacementGroupMaps> _nsdPlacementGroupMaps;
    private Map<ScalingGroupKey, ScalingGroup> _scalingGroup;
    private String _schemaVersion;
    private String _shortName;
    private Map<SshAuthorizedKeyKey, SshAuthorizedKey> _sshAuthorizedKey;
    private Map<UserKey, User> _user;
    private Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> _vnfdPlacementGroupMaps;
    private NsrKey key;


    Map<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> augmentation = Collections.emptyMap();

    public NsrBuilder() {
    }
    public NsrBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParams arg) {
        this._vnfdPlacementGroupMaps = arg.getVnfdPlacementGroupMaps();
        this._scalingGroup = arg.getScalingGroup();
        this._nsdPlacementGroupMaps = arg.getNsdPlacementGroupMaps();
        this._inputParameter = arg.getInputParameter();
        this._sshAuthorizedKey = arg.getSshAuthorizedKey();
        this._user = arg.getUser();
    }
    public NsrBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon arg) {
        this._scalingGroup = arg.getScalingGroup();
        this._nsdPlacementGroupMaps = arg.getNsdPlacementGroupMaps();
        this._inputParameter = arg.getInputParameter();
    }
    public NsrBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameter arg) {
        this._inputParameter = arg.getInputParameter();
    }
    public NsrBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.CloudConfig arg) {
        this._sshAuthorizedKey = arg.getSshAuthorizedKey();
        this._user = arg.getUser();
    }

    public NsrBuilder(Nsr base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> aug =((AugmentationHolder<Nsr>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._adminStatus = base.getAdminStatus();
        this._description = base.getDescription();
        this._inputParameter = base.getInputParameter();
        this._name = base.getName();
        this._nsd = base.getNsd();
        this._nsdPlacementGroupMaps = base.getNsdPlacementGroupMaps();
        this._scalingGroup = base.getScalingGroup();
        this._schemaVersion = base.getSchemaVersion();
        this._shortName = base.getShortName();
        this._sshAuthorizedKey = base.getSshAuthorizedKey();
        this._user = base.getUser();
        this._vnfdPlacementGroupMaps = base.getVnfdPlacementGroupMaps();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.CloudConfig</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameter</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.CloudConfig) {
            this._sshAuthorizedKey = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.CloudConfig)arg).getSshAuthorizedKey();
            this._user = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.CloudConfig)arg).getUser();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon) {
            this._scalingGroup = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon)arg).getScalingGroup();
            this._nsdPlacementGroupMaps = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon)arg).getNsdPlacementGroupMaps();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameter) {
            this._inputParameter = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameter)arg).getInputParameter();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParams) {
            this._vnfdPlacementGroupMaps = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParams)arg).getVnfdPlacementGroupMaps();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.CloudConfig, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameter, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParams]");
    }

    public NsrKey key() {
        return key;
    }
    
    public Nsr.AdminStatus getAdminStatus() {
        return _adminStatus;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public Map<InputParameterKey, InputParameter> getInputParameter() {
        return _inputParameter;
    }
    
    public String getName() {
        return _name;
    }
    
    public Nsd getNsd() {
        return _nsd;
    }
    
    public Map<NsdPlacementGroupMapsKey, NsdPlacementGroupMaps> getNsdPlacementGroupMaps() {
        return _nsdPlacementGroupMaps;
    }
    
    public Map<ScalingGroupKey, ScalingGroup> getScalingGroup() {
        return _scalingGroup;
    }
    
    public String getSchemaVersion() {
        return _schemaVersion;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public Map<SshAuthorizedKeyKey, SshAuthorizedKey> getSshAuthorizedKey() {
        return _sshAuthorizedKey;
    }
    
    public Map<UserKey, User> getUser() {
        return _user;
    }
    
    public Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps() {
        return _vnfdPlacementGroupMaps;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Nsr>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NsrBuilder withKey(final NsrKey key) {
        this.key = key;
        return this;
    }
    
    public NsrBuilder setAdminStatus(final Nsr.AdminStatus value) {
        this._adminStatus = value;
        return this;
    }
    
    public NsrBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public NsrBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    public NsrBuilder setInputParameter(final Map<InputParameterKey, InputParameter> values) {
        this._inputParameter = values;
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
      * @deprecated Use {#link #setInputParameter(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsrBuilder setInputParameter(final List<InputParameter> values) {
        return setInputParameter(CodeHelpers.compatMap(values));
    }
    
    public NsrBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public NsrBuilder setNsd(final Nsd value) {
        this._nsd = value;
        return this;
    }
    public NsrBuilder setNsdPlacementGroupMaps(final Map<NsdPlacementGroupMapsKey, NsdPlacementGroupMaps> values) {
        this._nsdPlacementGroupMaps = values;
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
      * @deprecated Use {#link #setNsdPlacementGroupMaps(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsrBuilder setNsdPlacementGroupMaps(final List<NsdPlacementGroupMaps> values) {
        return setNsdPlacementGroupMaps(CodeHelpers.compatMap(values));
    }
    public NsrBuilder setScalingGroup(final Map<ScalingGroupKey, ScalingGroup> values) {
        this._scalingGroup = values;
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
      * @deprecated Use {#link #setScalingGroup(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsrBuilder setScalingGroup(final List<ScalingGroup> values) {
        return setScalingGroup(CodeHelpers.compatMap(values));
    }
    
    public NsrBuilder setSchemaVersion(final String value) {
        this._schemaVersion = value;
        return this;
    }
    
    public NsrBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    public NsrBuilder setSshAuthorizedKey(final Map<SshAuthorizedKeyKey, SshAuthorizedKey> values) {
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
    public NsrBuilder setSshAuthorizedKey(final List<SshAuthorizedKey> values) {
        return setSshAuthorizedKey(CodeHelpers.compatMap(values));
    }
    public NsrBuilder setUser(final Map<UserKey, User> values) {
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
    public NsrBuilder setUser(final List<User> values) {
        return setUser(CodeHelpers.compatMap(values));
    }
    public NsrBuilder setVnfdPlacementGroupMaps(final Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> values) {
        this._vnfdPlacementGroupMaps = values;
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
      * @deprecated Use {#link #setVnfdPlacementGroupMaps(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsrBuilder setVnfdPlacementGroupMaps(final List<VnfdPlacementGroupMaps> values) {
        return setVnfdPlacementGroupMaps(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NsrBuilder addAugmentation(Augmentation<Nsr> augmentation) {
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
    public NsrBuilder addAugmentation(Class<? extends Augmentation<Nsr>> augmentationType, Augmentation<Nsr> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NsrBuilder removeAugmentation(Class<? extends Augmentation<Nsr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NsrBuilder doAddAugmentation(Class<? extends Augmentation<Nsr>> augmentationType, Augmentation<Nsr> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Nsr build() {
        return new NsrImpl(this);
    }

    private static final class NsrImpl
        extends AbstractAugmentable<Nsr>
        implements Nsr {
    
        private final Nsr.AdminStatus _adminStatus;
        private final String _description;
        private final Uuid _id;
        private final Map<InputParameterKey, InputParameter> _inputParameter;
        private final String _name;
        private final Nsd _nsd;
        private final Map<NsdPlacementGroupMapsKey, NsdPlacementGroupMaps> _nsdPlacementGroupMaps;
        private final Map<ScalingGroupKey, ScalingGroup> _scalingGroup;
        private final String _schemaVersion;
        private final String _shortName;
        private final Map<SshAuthorizedKeyKey, SshAuthorizedKey> _sshAuthorizedKey;
        private final Map<UserKey, User> _user;
        private final Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> _vnfdPlacementGroupMaps;
        private final NsrKey key;
    
        NsrImpl(NsrBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NsrKey(base.getId());
            }
            this._id = key.getId();
            this._adminStatus = base.getAdminStatus();
            this._description = base.getDescription();
            this._inputParameter = CodeHelpers.emptyToNull(base.getInputParameter());
            this._name = base.getName();
            this._nsd = base.getNsd();
            this._nsdPlacementGroupMaps = CodeHelpers.emptyToNull(base.getNsdPlacementGroupMaps());
            this._scalingGroup = CodeHelpers.emptyToNull(base.getScalingGroup());
            this._schemaVersion = base.getSchemaVersion();
            this._shortName = base.getShortName();
            this._sshAuthorizedKey = CodeHelpers.emptyToNull(base.getSshAuthorizedKey());
            this._user = CodeHelpers.emptyToNull(base.getUser());
            this._vnfdPlacementGroupMaps = CodeHelpers.emptyToNull(base.getVnfdPlacementGroupMaps());
        }
    
        @Override
        public NsrKey key() {
            return key;
        }
        
        @Override
        public Nsr.AdminStatus getAdminStatus() {
            return _adminStatus;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public Map<InputParameterKey, InputParameter> getInputParameter() {
            return _inputParameter;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Nsd getNsd() {
            return _nsd;
        }
        
        @Override
        public Map<NsdPlacementGroupMapsKey, NsdPlacementGroupMaps> getNsdPlacementGroupMaps() {
            return _nsdPlacementGroupMaps;
        }
        
        @Override
        public Map<ScalingGroupKey, ScalingGroup> getScalingGroup() {
            return _scalingGroup;
        }
        
        @Override
        public String getSchemaVersion() {
            return _schemaVersion;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public Map<SshAuthorizedKeyKey, SshAuthorizedKey> getSshAuthorizedKey() {
            return _sshAuthorizedKey;
        }
        
        @Override
        public Map<UserKey, User> getUser() {
            return _user;
        }
        
        @Override
        public Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps() {
            return _vnfdPlacementGroupMaps;
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
            result = prime * result + Objects.hashCode(_adminStatus);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_inputParameter);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsd);
            result = prime * result + Objects.hashCode(_nsdPlacementGroupMaps);
            result = prime * result + Objects.hashCode(_scalingGroup);
            result = prime * result + Objects.hashCode(_schemaVersion);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_sshAuthorizedKey);
            result = prime * result + Objects.hashCode(_user);
            result = prime * result + Objects.hashCode(_vnfdPlacementGroupMaps);
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
            if (!Nsr.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Nsr other = (Nsr)obj;
            if (!Objects.equals(_adminStatus, other.getAdminStatus())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_inputParameter, other.getInputParameter())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsd, other.getNsd())) {
                return false;
            }
            if (!Objects.equals(_nsdPlacementGroupMaps, other.getNsdPlacementGroupMaps())) {
                return false;
            }
            if (!Objects.equals(_scalingGroup, other.getScalingGroup())) {
                return false;
            }
            if (!Objects.equals(_schemaVersion, other.getSchemaVersion())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_sshAuthorizedKey, other.getSshAuthorizedKey())) {
                return false;
            }
            if (!Objects.equals(_user, other.getUser())) {
                return false;
            }
            if (!Objects.equals(_vnfdPlacementGroupMaps, other.getVnfdPlacementGroupMaps())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsrImpl otherImpl = (NsrImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nsr");
            CodeHelpers.appendValue(helper, "_adminStatus", _adminStatus);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_inputParameter", _inputParameter);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsd", _nsd);
            CodeHelpers.appendValue(helper, "_nsdPlacementGroupMaps", _nsdPlacementGroupMaps);
            CodeHelpers.appendValue(helper, "_scalingGroup", _scalingGroup);
            CodeHelpers.appendValue(helper, "_schemaVersion", _schemaVersion);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_sshAuthorizedKey", _sshAuthorizedKey);
            CodeHelpers.appendValue(helper, "_user", _user);
            CodeHelpers.appendValue(helper, "_vnfdPlacementGroupMaps", _vnfdPlacementGroupMaps);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
