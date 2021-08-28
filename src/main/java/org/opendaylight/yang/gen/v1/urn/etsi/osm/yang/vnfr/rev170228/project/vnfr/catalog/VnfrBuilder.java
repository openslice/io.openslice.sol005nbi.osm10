package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VnfOperationalStatus;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.placement.group.info.PlacementGroupsInfo;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.placement.group.info.PlacementGroupsInfoKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.CloudConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.ConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.ConnectionPointKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlrKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.MgmtInterface;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.MonitoringParamKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.VdurKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.Vnfd;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Class that builds {@link VnfrBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VnfrBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VnfrBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VnfrBuilder, as instances can be freely passed around without
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
 * @see VnfrBuilder
 * @see Builder
 *
 */
public class VnfrBuilder implements Builder<Vnfr> {

    private CloudConfig _cloudConfig;
    private Vnfr.ConfigStatus _configStatus;
    private Map<ConnectionPointKey, ConnectionPoint> _connectionPoint;
    private Uint32 _createTime;
    private Uri _dashboardUrl;
    private String _description;
    private Uuid _id;
    private Map<InternalVlrKey, InternalVlr> _internalVlr;
    private String _memberVnfIndexRef;
    private MgmtInterface _mgmtInterface;
    private Map<MonitoringParamKey, MonitoringParam> _monitoringParam;
    private String _name;
    private Uuid _nsrIdRef;
    private VnfOperationalStatus _operationalStatus;
    private Map<PlacementGroupsInfoKey, PlacementGroupsInfo> _placementGroupsInfo;
    private String _shortName;
    private Uint32 _uptime;
    private Map<VdurKey, Vdur> _vdur;
    private String _vendor;
    private String _version;
    private VnfConfiguration _vnfConfiguration;
    private Vnfd _vnfd;
    private String _vnfdRef;
    private VnfrKey key;


    Map<Class<? extends Augmentation<Vnfr>>, Augmentation<Vnfr>> augmentation = Collections.emptyMap();

    public VnfrBuilder() {
    }
    public VnfrBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.PlacementGroupInfo arg) {
        this._placementGroupsInfo = arg.getPlacementGroupsInfo();
    }

    public VnfrBuilder(Vnfr base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vnfr>>, Augmentation<Vnfr>> aug =((AugmentationHolder<Vnfr>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._cloudConfig = base.getCloudConfig();
        this._configStatus = base.getConfigStatus();
        this._connectionPoint = base.getConnectionPoint();
        this._createTime = base.getCreateTime();
        this._dashboardUrl = base.getDashboardUrl();
        this._description = base.getDescription();
        this._internalVlr = base.getInternalVlr();
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._mgmtInterface = base.getMgmtInterface();
        this._monitoringParam = base.getMonitoringParam();
        this._name = base.getName();
        this._nsrIdRef = base.getNsrIdRef();
        this._operationalStatus = base.getOperationalStatus();
        this._placementGroupsInfo = base.getPlacementGroupsInfo();
        this._shortName = base.getShortName();
        this._uptime = base.getUptime();
        this._vdur = base.getVdur();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vnfConfiguration = base.getVnfConfiguration();
        this._vnfd = base.getVnfd();
        this._vnfdRef = base.getVnfdRef();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.PlacementGroupInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.PlacementGroupInfo) {
            this._placementGroupsInfo = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.PlacementGroupInfo)arg).getPlacementGroupsInfo();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.PlacementGroupInfo]");
    }

    public VnfrKey key() {
        return key;
    }
    
    public CloudConfig getCloudConfig() {
        return _cloudConfig;
    }
    
    public Vnfr.ConfigStatus getConfigStatus() {
        return _configStatus;
    }
    
    public Map<ConnectionPointKey, ConnectionPoint> getConnectionPoint() {
        return _connectionPoint;
    }
    
    public Uint32 getCreateTime() {
        return _createTime;
    }
    
    public Uri getDashboardUrl() {
        return _dashboardUrl;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public Map<InternalVlrKey, InternalVlr> getInternalVlr() {
        return _internalVlr;
    }
    
    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public MgmtInterface getMgmtInterface() {
        return _mgmtInterface;
    }
    
    public Map<MonitoringParamKey, MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public String getName() {
        return _name;
    }
    
    public Uuid getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public VnfOperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public Map<PlacementGroupsInfoKey, PlacementGroupsInfo> getPlacementGroupsInfo() {
        return _placementGroupsInfo;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public Uint32 getUptime() {
        return _uptime;
    }
    
    public Map<VdurKey, Vdur> getVdur() {
        return _vdur;
    }
    
    public String getVendor() {
        return _vendor;
    }
    
    public String getVersion() {
        return _version;
    }
    
    public VnfConfiguration getVnfConfiguration() {
        return _vnfConfiguration;
    }
    
    public Vnfd getVnfd() {
        return _vnfd;
    }
    
    public String getVnfdRef() {
        return _vnfdRef;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Vnfr>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VnfrBuilder withKey(final VnfrKey key) {
        this.key = key;
        return this;
    }
    
    public VnfrBuilder setCloudConfig(final CloudConfig value) {
        this._cloudConfig = value;
        return this;
    }
    
    public VnfrBuilder setConfigStatus(final Vnfr.ConfigStatus value) {
        this._configStatus = value;
        return this;
    }
    public VnfrBuilder setConnectionPoint(final Map<ConnectionPointKey, ConnectionPoint> values) {
        this._connectionPoint = values;
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
      * @deprecated Use {#link #setConnectionPoint(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfrBuilder setConnectionPoint(final List<ConnectionPoint> values) {
        return setConnectionPoint(CodeHelpers.compatMap(values));
    }
    
    public VnfrBuilder setCreateTime(final Uint32 value) {
        this._createTime = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCreateTime(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public VnfrBuilder setCreateTime(final Long value) {
        return setCreateTime(CodeHelpers.compatUint(value));
    }
    
    public VnfrBuilder setDashboardUrl(final Uri value) {
        this._dashboardUrl = value;
        return this;
    }
    
    public VnfrBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public VnfrBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    public VnfrBuilder setInternalVlr(final Map<InternalVlrKey, InternalVlr> values) {
        this._internalVlr = values;
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
      * @deprecated Use {#link #setInternalVlr(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfrBuilder setInternalVlr(final List<InternalVlr> values) {
        return setInternalVlr(CodeHelpers.compatMap(values));
    }
    
    public VnfrBuilder setMemberVnfIndexRef(final String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
    public VnfrBuilder setMgmtInterface(final MgmtInterface value) {
        this._mgmtInterface = value;
        return this;
    }
    public VnfrBuilder setMonitoringParam(final Map<MonitoringParamKey, MonitoringParam> values) {
        this._monitoringParam = values;
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
      * @deprecated Use {#link #setMonitoringParam(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfrBuilder setMonitoringParam(final List<MonitoringParam> values) {
        return setMonitoringParam(CodeHelpers.compatMap(values));
    }
    
    public VnfrBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VnfrBuilder setNsrIdRef(final Uuid value) {
        this._nsrIdRef = value;
        return this;
    }
    
    public VnfrBuilder setOperationalStatus(final VnfOperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    public VnfrBuilder setPlacementGroupsInfo(final Map<PlacementGroupsInfoKey, PlacementGroupsInfo> values) {
        this._placementGroupsInfo = values;
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
      * @deprecated Use {#link #setPlacementGroupsInfo(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfrBuilder setPlacementGroupsInfo(final List<PlacementGroupsInfo> values) {
        return setPlacementGroupsInfo(CodeHelpers.compatMap(values));
    }
    
    public VnfrBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public VnfrBuilder setUptime(final Uint32 value) {
        this._uptime = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setUptime(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public VnfrBuilder setUptime(final Long value) {
        return setUptime(CodeHelpers.compatUint(value));
    }
    public VnfrBuilder setVdur(final Map<VdurKey, Vdur> values) {
        this._vdur = values;
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
      * @deprecated Use {#link #setVdur(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VnfrBuilder setVdur(final List<Vdur> values) {
        return setVdur(CodeHelpers.compatMap(values));
    }
    
    public VnfrBuilder setVendor(final String value) {
        this._vendor = value;
        return this;
    }
    
    public VnfrBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    public VnfrBuilder setVnfConfiguration(final VnfConfiguration value) {
        this._vnfConfiguration = value;
        return this;
    }
    
    public VnfrBuilder setVnfd(final Vnfd value) {
        this._vnfd = value;
        return this;
    }
    
    private static void check_vnfdRefLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 63) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..63]]", value);
    }
    
    public VnfrBuilder setVnfdRef(final String value) {
        if (value != null) {
            check_vnfdRefLength(value);
            
        }
        this._vnfdRef = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VnfrBuilder addAugmentation(Augmentation<Vnfr> augmentation) {
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
    public VnfrBuilder addAugmentation(Class<? extends Augmentation<Vnfr>> augmentationType, Augmentation<Vnfr> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VnfrBuilder removeAugmentation(Class<? extends Augmentation<Vnfr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VnfrBuilder doAddAugmentation(Class<? extends Augmentation<Vnfr>> augmentationType, Augmentation<Vnfr> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Vnfr build() {
        return new VnfrImpl(this);
    }

    private static final class VnfrImpl
        extends AbstractAugmentable<Vnfr>
        implements Vnfr {
    
        private final CloudConfig _cloudConfig;
        private final Vnfr.ConfigStatus _configStatus;
        private final Map<ConnectionPointKey, ConnectionPoint> _connectionPoint;
        private final Uint32 _createTime;
        private final Uri _dashboardUrl;
        private final String _description;
        private final Uuid _id;
        private final Map<InternalVlrKey, InternalVlr> _internalVlr;
        private final String _memberVnfIndexRef;
        private final MgmtInterface _mgmtInterface;
        private final Map<MonitoringParamKey, MonitoringParam> _monitoringParam;
        private final String _name;
        private final Uuid _nsrIdRef;
        private final VnfOperationalStatus _operationalStatus;
        private final Map<PlacementGroupsInfoKey, PlacementGroupsInfo> _placementGroupsInfo;
        private final String _shortName;
        private final Uint32 _uptime;
        private final Map<VdurKey, Vdur> _vdur;
        private final String _vendor;
        private final String _version;
        private final VnfConfiguration _vnfConfiguration;
        private final Vnfd _vnfd;
        private final String _vnfdRef;
        private final VnfrKey key;
    
        VnfrImpl(VnfrBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfrKey(base.getId());
            }
            this._id = key.getId();
            this._cloudConfig = base.getCloudConfig();
            this._configStatus = base.getConfigStatus();
            this._connectionPoint = CodeHelpers.emptyToNull(base.getConnectionPoint());
            this._createTime = base.getCreateTime();
            this._dashboardUrl = base.getDashboardUrl();
            this._description = base.getDescription();
            this._internalVlr = CodeHelpers.emptyToNull(base.getInternalVlr());
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            this._mgmtInterface = base.getMgmtInterface();
            this._monitoringParam = CodeHelpers.emptyToNull(base.getMonitoringParam());
            this._name = base.getName();
            this._nsrIdRef = base.getNsrIdRef();
            this._operationalStatus = base.getOperationalStatus();
            this._placementGroupsInfo = CodeHelpers.emptyToNull(base.getPlacementGroupsInfo());
            this._shortName = base.getShortName();
            this._uptime = base.getUptime();
            this._vdur = CodeHelpers.emptyToNull(base.getVdur());
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vnfConfiguration = base.getVnfConfiguration();
            this._vnfd = base.getVnfd();
            this._vnfdRef = base.getVnfdRef();
        }
    
        @Override
        public VnfrKey key() {
            return key;
        }
        
        @Override
        public CloudConfig getCloudConfig() {
            return _cloudConfig;
        }
        
        @Override
        public Vnfr.ConfigStatus getConfigStatus() {
            return _configStatus;
        }
        
        @Override
        public Map<ConnectionPointKey, ConnectionPoint> getConnectionPoint() {
            return _connectionPoint;
        }
        
        @Override
        public Uint32 getCreateTime() {
            return _createTime;
        }
        
        @Override
        public Uri getDashboardUrl() {
            return _dashboardUrl;
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
        public Map<InternalVlrKey, InternalVlr> getInternalVlr() {
            return _internalVlr;
        }
        
        @Override
        public String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public MgmtInterface getMgmtInterface() {
            return _mgmtInterface;
        }
        
        @Override
        public Map<MonitoringParamKey, MonitoringParam> getMonitoringParam() {
            return _monitoringParam;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Uuid getNsrIdRef() {
            return _nsrIdRef;
        }
        
        @Override
        public VnfOperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public Map<PlacementGroupsInfoKey, PlacementGroupsInfo> getPlacementGroupsInfo() {
            return _placementGroupsInfo;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public Uint32 getUptime() {
            return _uptime;
        }
        
        @Override
        public Map<VdurKey, Vdur> getVdur() {
            return _vdur;
        }
        
        @Override
        public String getVendor() {
            return _vendor;
        }
        
        @Override
        public String getVersion() {
            return _version;
        }
        
        @Override
        public VnfConfiguration getVnfConfiguration() {
            return _vnfConfiguration;
        }
        
        @Override
        public Vnfd getVnfd() {
            return _vnfd;
        }
        
        @Override
        public String getVnfdRef() {
            return _vnfdRef;
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
            result = prime * result + Objects.hashCode(_cloudConfig);
            result = prime * result + Objects.hashCode(_configStatus);
            result = prime * result + Objects.hashCode(_connectionPoint);
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_dashboardUrl);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_internalVlr);
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_mgmtInterface);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_placementGroupsInfo);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_uptime);
            result = prime * result + Objects.hashCode(_vdur);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vnfConfiguration);
            result = prime * result + Objects.hashCode(_vnfd);
            result = prime * result + Objects.hashCode(_vnfdRef);
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
            if (!Vnfr.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Vnfr other = (Vnfr)obj;
            if (!Objects.equals(_cloudConfig, other.getCloudConfig())) {
                return false;
            }
            if (!Objects.equals(_configStatus, other.getConfigStatus())) {
                return false;
            }
            if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_dashboardUrl, other.getDashboardUrl())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_internalVlr, other.getInternalVlr())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_mgmtInterface, other.getMgmtInterface())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_placementGroupsInfo, other.getPlacementGroupsInfo())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_uptime, other.getUptime())) {
                return false;
            }
            if (!Objects.equals(_vdur, other.getVdur())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vnfConfiguration, other.getVnfConfiguration())) {
                return false;
            }
            if (!Objects.equals(_vnfd, other.getVnfd())) {
                return false;
            }
            if (!Objects.equals(_vnfdRef, other.getVnfdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrImpl otherImpl = (VnfrImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vnfr>>, Augmentation<Vnfr>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vnfr");
            CodeHelpers.appendValue(helper, "_cloudConfig", _cloudConfig);
            CodeHelpers.appendValue(helper, "_configStatus", _configStatus);
            CodeHelpers.appendValue(helper, "_connectionPoint", _connectionPoint);
            CodeHelpers.appendValue(helper, "_createTime", _createTime);
            CodeHelpers.appendValue(helper, "_dashboardUrl", _dashboardUrl);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_internalVlr", _internalVlr);
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_mgmtInterface", _mgmtInterface);
            CodeHelpers.appendValue(helper, "_monitoringParam", _monitoringParam);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsrIdRef", _nsrIdRef);
            CodeHelpers.appendValue(helper, "_operationalStatus", _operationalStatus);
            CodeHelpers.appendValue(helper, "_placementGroupsInfo", _placementGroupsInfo);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_uptime", _uptime);
            CodeHelpers.appendValue(helper, "_vdur", _vdur);
            CodeHelpers.appendValue(helper, "_vendor", _vendor);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "_vnfConfiguration", _vnfConfiguration);
            CodeHelpers.appendValue(helper, "_vnfd", _vnfd);
            CodeHelpers.appendValue(helper, "_vnfdRef", _vnfdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
