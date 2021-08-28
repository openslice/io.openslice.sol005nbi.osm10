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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.GuestEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa.HostEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.hypervisor.epa.HypervisorEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.supplemental.boot.data.SupplementalBootData;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vm.flavor.VmFlavor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vswitch.epa.VswitchEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VduOperationalStatus;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.placement.group.info.PlacementGroupsInfo;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.placement.group.info.PlacementGroupsInfoKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Interface;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InterfaceKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InternalConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InternalConnectionPointKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.MonitoringParamKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VolumesKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VdurBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VdurBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VdurBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VdurBuilder, as instances can be freely passed around without
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
 * @see VdurBuilder
 * @see Builder
 *
 */
public class VdurBuilder implements Builder<Vdur> {

    private Uri _consoleUrl;
    private String _flavorId;
    private GuestEpa _guestEpa;
    private HostEpa _hostEpa;
    private HypervisorEpa _hypervisorEpa;
    private Uuid _id;
    private String _imageId;
    private Map<InterfaceKey, Interface> _interface;
    private Map<InternalConnectionPointKey, InternalConnectionPoint> _internalConnectionPoint;
    private IpAddress _managementIp;
    private Map<MonitoringParamKey, MonitoringParam> _monitoringParam;
    private String _name;
    private VduOperationalStatus _operationalStatus;
    private Map<PlacementGroupsInfoKey, PlacementGroupsInfo> _placementGroupsInfo;
    private SupplementalBootData _supplementalBootData;
    private String _uniqueShortName;
    private VduConfiguration _vduConfiguration;
    private String _vduIdRef;
    private String _vimId;
    private VmFlavor _vmFlavor;
    private IpAddress _vmManagementIp;
    private Map<VolumesKey, Volumes> _volumes;
    private VswitchEpa _vswitchEpa;
    private VdurKey key;


    Map<Class<? extends Augmentation<Vdur>>, Augmentation<Vdur>> augmentation = Collections.emptyMap();

    public VdurBuilder() {
    }
    public VdurBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor arg) {
        this._vmFlavor = arg.getVmFlavor();
    }
    public VdurBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.GuestEpa arg) {
        this._guestEpa = arg.getGuestEpa();
    }
    public VdurBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VswitchEpa arg) {
        this._vswitchEpa = arg.getVswitchEpa();
    }
    public VdurBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HypervisorEpa arg) {
        this._hypervisorEpa = arg.getHypervisorEpa();
    }
    public VdurBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostEpa arg) {
        this._hostEpa = arg.getHostEpa();
    }
    public VdurBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.SupplementalBootData arg) {
        this._supplementalBootData = arg.getSupplementalBootData();
    }
    public VdurBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.PlacementGroupInfo arg) {
        this._placementGroupsInfo = arg.getPlacementGroupsInfo();
    }

    public VdurBuilder(Vdur base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vdur>>, Augmentation<Vdur>> aug =((AugmentationHolder<Vdur>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._consoleUrl = base.getConsoleUrl();
        this._flavorId = base.getFlavorId();
        this._guestEpa = base.getGuestEpa();
        this._hostEpa = base.getHostEpa();
        this._hypervisorEpa = base.getHypervisorEpa();
        this._imageId = base.getImageId();
        this._interface = base.getInterface();
        this._internalConnectionPoint = base.getInternalConnectionPoint();
        this._managementIp = base.getManagementIp();
        this._monitoringParam = base.getMonitoringParam();
        this._name = base.getName();
        this._operationalStatus = base.getOperationalStatus();
        this._placementGroupsInfo = base.getPlacementGroupsInfo();
        this._supplementalBootData = base.getSupplementalBootData();
        this._uniqueShortName = base.getUniqueShortName();
        this._vduConfiguration = base.getVduConfiguration();
        this._vduIdRef = base.getVduIdRef();
        this._vimId = base.getVimId();
        this._vmFlavor = base.getVmFlavor();
        this._vmManagementIp = base.getVmManagementIp();
        this._volumes = base.getVolumes();
        this._vswitchEpa = base.getVswitchEpa();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.GuestEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VswitchEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HypervisorEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.SupplementalBootData</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.PlacementGroupInfo</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.GuestEpa) {
            this._guestEpa = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.GuestEpa)arg).getGuestEpa();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VswitchEpa) {
            this._vswitchEpa = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VswitchEpa)arg).getVswitchEpa();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HypervisorEpa) {
            this._hypervisorEpa = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HypervisorEpa)arg).getHypervisorEpa();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.SupplementalBootData) {
            this._supplementalBootData = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.SupplementalBootData)arg).getSupplementalBootData();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.PlacementGroupInfo) {
            this._placementGroupsInfo = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.PlacementGroupInfo)arg).getPlacementGroupsInfo();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostEpa) {
            this._hostEpa = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostEpa)arg).getHostEpa();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor) {
            this._vmFlavor = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor)arg).getVmFlavor();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.GuestEpa, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VswitchEpa, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HypervisorEpa, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.SupplementalBootData, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.PlacementGroupInfo, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostEpa, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor]");
    }

    public VdurKey key() {
        return key;
    }
    
    public Uri getConsoleUrl() {
        return _consoleUrl;
    }
    
    public String getFlavorId() {
        return _flavorId;
    }
    
    public GuestEpa getGuestEpa() {
        return _guestEpa;
    }
    
    public HostEpa getHostEpa() {
        return _hostEpa;
    }
    
    public HypervisorEpa getHypervisorEpa() {
        return _hypervisorEpa;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public String getImageId() {
        return _imageId;
    }
    
    public Map<InterfaceKey, Interface> getInterface() {
        return _interface;
    }
    
    public Map<InternalConnectionPointKey, InternalConnectionPoint> getInternalConnectionPoint() {
        return _internalConnectionPoint;
    }
    
    public IpAddress getManagementIp() {
        return _managementIp;
    }
    
    public Map<MonitoringParamKey, MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public String getName() {
        return _name;
    }
    
    public VduOperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public Map<PlacementGroupsInfoKey, PlacementGroupsInfo> getPlacementGroupsInfo() {
        return _placementGroupsInfo;
    }
    
    public SupplementalBootData getSupplementalBootData() {
        return _supplementalBootData;
    }
    
    public String getUniqueShortName() {
        return _uniqueShortName;
    }
    
    public VduConfiguration getVduConfiguration() {
        return _vduConfiguration;
    }
    
    public String getVduIdRef() {
        return _vduIdRef;
    }
    
    public String getVimId() {
        return _vimId;
    }
    
    public VmFlavor getVmFlavor() {
        return _vmFlavor;
    }
    
    public IpAddress getVmManagementIp() {
        return _vmManagementIp;
    }
    
    public Map<VolumesKey, Volumes> getVolumes() {
        return _volumes;
    }
    
    public VswitchEpa getVswitchEpa() {
        return _vswitchEpa;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Vdur>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VdurBuilder withKey(final VdurKey key) {
        this.key = key;
        return this;
    }
    
    public VdurBuilder setConsoleUrl(final Uri value) {
        this._consoleUrl = value;
        return this;
    }
    
    public VdurBuilder setFlavorId(final String value) {
        this._flavorId = value;
        return this;
    }
    
    public VdurBuilder setGuestEpa(final GuestEpa value) {
        this._guestEpa = value;
        return this;
    }
    
    public VdurBuilder setHostEpa(final HostEpa value) {
        this._hostEpa = value;
        return this;
    }
    
    public VdurBuilder setHypervisorEpa(final HypervisorEpa value) {
        this._hypervisorEpa = value;
        return this;
    }
    
    public VdurBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
    public VdurBuilder setImageId(final String value) {
        this._imageId = value;
        return this;
    }
    public VdurBuilder setInterface(final Map<InterfaceKey, Interface> values) {
        this._interface = values;
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
      * @deprecated Use {#link #setInterface(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VdurBuilder setInterface(final List<Interface> values) {
        return setInterface(CodeHelpers.compatMap(values));
    }
    public VdurBuilder setInternalConnectionPoint(final Map<InternalConnectionPointKey, InternalConnectionPoint> values) {
        this._internalConnectionPoint = values;
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
      * @deprecated Use {#link #setInternalConnectionPoint(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VdurBuilder setInternalConnectionPoint(final List<InternalConnectionPoint> values) {
        return setInternalConnectionPoint(CodeHelpers.compatMap(values));
    }
    
    public VdurBuilder setManagementIp(final IpAddress value) {
        this._managementIp = value;
        return this;
    }
    public VdurBuilder setMonitoringParam(final Map<MonitoringParamKey, MonitoringParam> values) {
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
    public VdurBuilder setMonitoringParam(final List<MonitoringParam> values) {
        return setMonitoringParam(CodeHelpers.compatMap(values));
    }
    
    public VdurBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VdurBuilder setOperationalStatus(final VduOperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    public VdurBuilder setPlacementGroupsInfo(final Map<PlacementGroupsInfoKey, PlacementGroupsInfo> values) {
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
    public VdurBuilder setPlacementGroupsInfo(final List<PlacementGroupsInfo> values) {
        return setPlacementGroupsInfo(CodeHelpers.compatMap(values));
    }
    
    public VdurBuilder setSupplementalBootData(final SupplementalBootData value) {
        this._supplementalBootData = value;
        return this;
    }
    
    public VdurBuilder setUniqueShortName(final String value) {
        this._uniqueShortName = value;
        return this;
    }
    
    public VdurBuilder setVduConfiguration(final VduConfiguration value) {
        this._vduConfiguration = value;
        return this;
    }
    
    public VdurBuilder setVduIdRef(final String value) {
        this._vduIdRef = value;
        return this;
    }
    
    public VdurBuilder setVimId(final String value) {
        this._vimId = value;
        return this;
    }
    
    public VdurBuilder setVmFlavor(final VmFlavor value) {
        this._vmFlavor = value;
        return this;
    }
    
    public VdurBuilder setVmManagementIp(final IpAddress value) {
        this._vmManagementIp = value;
        return this;
    }
    public VdurBuilder setVolumes(final Map<VolumesKey, Volumes> values) {
        this._volumes = values;
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
      * @deprecated Use {#link #setVolumes(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VdurBuilder setVolumes(final List<Volumes> values) {
        return setVolumes(CodeHelpers.compatMap(values));
    }
    
    public VdurBuilder setVswitchEpa(final VswitchEpa value) {
        this._vswitchEpa = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public VdurBuilder addAugmentation(Augmentation<Vdur> augmentation) {
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
    public VdurBuilder addAugmentation(Class<? extends Augmentation<Vdur>> augmentationType, Augmentation<Vdur> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VdurBuilder removeAugmentation(Class<? extends Augmentation<Vdur>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VdurBuilder doAddAugmentation(Class<? extends Augmentation<Vdur>> augmentationType, Augmentation<Vdur> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Vdur build() {
        return new VdurImpl(this);
    }

    private static final class VdurImpl
        extends AbstractAugmentable<Vdur>
        implements Vdur {
    
        private final Uri _consoleUrl;
        private final String _flavorId;
        private final GuestEpa _guestEpa;
        private final HostEpa _hostEpa;
        private final HypervisorEpa _hypervisorEpa;
        private final Uuid _id;
        private final String _imageId;
        private final Map<InterfaceKey, Interface> _interface;
        private final Map<InternalConnectionPointKey, InternalConnectionPoint> _internalConnectionPoint;
        private final IpAddress _managementIp;
        private final Map<MonitoringParamKey, MonitoringParam> _monitoringParam;
        private final String _name;
        private final VduOperationalStatus _operationalStatus;
        private final Map<PlacementGroupsInfoKey, PlacementGroupsInfo> _placementGroupsInfo;
        private final SupplementalBootData _supplementalBootData;
        private final String _uniqueShortName;
        private final VduConfiguration _vduConfiguration;
        private final String _vduIdRef;
        private final String _vimId;
        private final VmFlavor _vmFlavor;
        private final IpAddress _vmManagementIp;
        private final Map<VolumesKey, Volumes> _volumes;
        private final VswitchEpa _vswitchEpa;
        private final VdurKey key;
    
        VdurImpl(VdurBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VdurKey(base.getId());
            }
            this._id = key.getId();
            this._consoleUrl = base.getConsoleUrl();
            this._flavorId = base.getFlavorId();
            this._guestEpa = base.getGuestEpa();
            this._hostEpa = base.getHostEpa();
            this._hypervisorEpa = base.getHypervisorEpa();
            this._imageId = base.getImageId();
            this._interface = CodeHelpers.emptyToNull(base.getInterface());
            this._internalConnectionPoint = CodeHelpers.emptyToNull(base.getInternalConnectionPoint());
            this._managementIp = base.getManagementIp();
            this._monitoringParam = CodeHelpers.emptyToNull(base.getMonitoringParam());
            this._name = base.getName();
            this._operationalStatus = base.getOperationalStatus();
            this._placementGroupsInfo = CodeHelpers.emptyToNull(base.getPlacementGroupsInfo());
            this._supplementalBootData = base.getSupplementalBootData();
            this._uniqueShortName = base.getUniqueShortName();
            this._vduConfiguration = base.getVduConfiguration();
            this._vduIdRef = base.getVduIdRef();
            this._vimId = base.getVimId();
            this._vmFlavor = base.getVmFlavor();
            this._vmManagementIp = base.getVmManagementIp();
            this._volumes = CodeHelpers.emptyToNull(base.getVolumes());
            this._vswitchEpa = base.getVswitchEpa();
        }
    
        @Override
        public VdurKey key() {
            return key;
        }
        
        @Override
        public Uri getConsoleUrl() {
            return _consoleUrl;
        }
        
        @Override
        public String getFlavorId() {
            return _flavorId;
        }
        
        @Override
        public GuestEpa getGuestEpa() {
            return _guestEpa;
        }
        
        @Override
        public HostEpa getHostEpa() {
            return _hostEpa;
        }
        
        @Override
        public HypervisorEpa getHypervisorEpa() {
            return _hypervisorEpa;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public String getImageId() {
            return _imageId;
        }
        
        @Override
        public Map<InterfaceKey, Interface> getInterface() {
            return _interface;
        }
        
        @Override
        public Map<InternalConnectionPointKey, InternalConnectionPoint> getInternalConnectionPoint() {
            return _internalConnectionPoint;
        }
        
        @Override
        public IpAddress getManagementIp() {
            return _managementIp;
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
        public VduOperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public Map<PlacementGroupsInfoKey, PlacementGroupsInfo> getPlacementGroupsInfo() {
            return _placementGroupsInfo;
        }
        
        @Override
        public SupplementalBootData getSupplementalBootData() {
            return _supplementalBootData;
        }
        
        @Override
        public String getUniqueShortName() {
            return _uniqueShortName;
        }
        
        @Override
        public VduConfiguration getVduConfiguration() {
            return _vduConfiguration;
        }
        
        @Override
        public String getVduIdRef() {
            return _vduIdRef;
        }
        
        @Override
        public String getVimId() {
            return _vimId;
        }
        
        @Override
        public VmFlavor getVmFlavor() {
            return _vmFlavor;
        }
        
        @Override
        public IpAddress getVmManagementIp() {
            return _vmManagementIp;
        }
        
        @Override
        public Map<VolumesKey, Volumes> getVolumes() {
            return _volumes;
        }
        
        @Override
        public VswitchEpa getVswitchEpa() {
            return _vswitchEpa;
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
            result = prime * result + Objects.hashCode(_consoleUrl);
            result = prime * result + Objects.hashCode(_flavorId);
            result = prime * result + Objects.hashCode(_guestEpa);
            result = prime * result + Objects.hashCode(_hostEpa);
            result = prime * result + Objects.hashCode(_hypervisorEpa);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_imageId);
            result = prime * result + Objects.hashCode(_interface);
            result = prime * result + Objects.hashCode(_internalConnectionPoint);
            result = prime * result + Objects.hashCode(_managementIp);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_placementGroupsInfo);
            result = prime * result + Objects.hashCode(_supplementalBootData);
            result = prime * result + Objects.hashCode(_uniqueShortName);
            result = prime * result + Objects.hashCode(_vduConfiguration);
            result = prime * result + Objects.hashCode(_vduIdRef);
            result = prime * result + Objects.hashCode(_vimId);
            result = prime * result + Objects.hashCode(_vmFlavor);
            result = prime * result + Objects.hashCode(_vmManagementIp);
            result = prime * result + Objects.hashCode(_volumes);
            result = prime * result + Objects.hashCode(_vswitchEpa);
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
            if (!Vdur.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Vdur other = (Vdur)obj;
            if (!Objects.equals(_consoleUrl, other.getConsoleUrl())) {
                return false;
            }
            if (!Objects.equals(_flavorId, other.getFlavorId())) {
                return false;
            }
            if (!Objects.equals(_guestEpa, other.getGuestEpa())) {
                return false;
            }
            if (!Objects.equals(_hostEpa, other.getHostEpa())) {
                return false;
            }
            if (!Objects.equals(_hypervisorEpa, other.getHypervisorEpa())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_imageId, other.getImageId())) {
                return false;
            }
            if (!Objects.equals(_interface, other.getInterface())) {
                return false;
            }
            if (!Objects.equals(_internalConnectionPoint, other.getInternalConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_managementIp, other.getManagementIp())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_placementGroupsInfo, other.getPlacementGroupsInfo())) {
                return false;
            }
            if (!Objects.equals(_supplementalBootData, other.getSupplementalBootData())) {
                return false;
            }
            if (!Objects.equals(_uniqueShortName, other.getUniqueShortName())) {
                return false;
            }
            if (!Objects.equals(_vduConfiguration, other.getVduConfiguration())) {
                return false;
            }
            if (!Objects.equals(_vduIdRef, other.getVduIdRef())) {
                return false;
            }
            if (!Objects.equals(_vimId, other.getVimId())) {
                return false;
            }
            if (!Objects.equals(_vmFlavor, other.getVmFlavor())) {
                return false;
            }
            if (!Objects.equals(_vmManagementIp, other.getVmManagementIp())) {
                return false;
            }
            if (!Objects.equals(_volumes, other.getVolumes())) {
                return false;
            }
            if (!Objects.equals(_vswitchEpa, other.getVswitchEpa())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VdurImpl otherImpl = (VdurImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vdur>>, Augmentation<Vdur>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vdur");
            CodeHelpers.appendValue(helper, "_consoleUrl", _consoleUrl);
            CodeHelpers.appendValue(helper, "_flavorId", _flavorId);
            CodeHelpers.appendValue(helper, "_guestEpa", _guestEpa);
            CodeHelpers.appendValue(helper, "_hostEpa", _hostEpa);
            CodeHelpers.appendValue(helper, "_hypervisorEpa", _hypervisorEpa);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_imageId", _imageId);
            CodeHelpers.appendValue(helper, "_interface", _interface);
            CodeHelpers.appendValue(helper, "_internalConnectionPoint", _internalConnectionPoint);
            CodeHelpers.appendValue(helper, "_managementIp", _managementIp);
            CodeHelpers.appendValue(helper, "_monitoringParam", _monitoringParam);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_operationalStatus", _operationalStatus);
            CodeHelpers.appendValue(helper, "_placementGroupsInfo", _placementGroupsInfo);
            CodeHelpers.appendValue(helper, "_supplementalBootData", _supplementalBootData);
            CodeHelpers.appendValue(helper, "_uniqueShortName", _uniqueShortName);
            CodeHelpers.appendValue(helper, "_vduConfiguration", _vduConfiguration);
            CodeHelpers.appendValue(helper, "_vduIdRef", _vduIdRef);
            CodeHelpers.appendValue(helper, "_vimId", _vimId);
            CodeHelpers.appendValue(helper, "_vmFlavor", _vmFlavor);
            CodeHelpers.appendValue(helper, "_vmManagementIp", _vmManagementIp);
            CodeHelpers.appendValue(helper, "_volumes", _volumes);
            CodeHelpers.appendValue(helper, "_vswitchEpa", _vswitchEpa);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
