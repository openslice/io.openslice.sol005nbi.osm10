package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.AlarmKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImagesKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.CloudInitInput;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.InterfaceKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.InternalConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.InternalConnectionPointKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.MonitoringParamKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.VduConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.Volumes;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.VolumesKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Class that builds {@link VduBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     VduBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new VduBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of VduBuilder, as instances can be freely passed around without
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
 * @see VduBuilder
 * @see Builder
 *
 */
public class VduBuilder implements Builder<Vdu> {

    private Map<AlarmKey, Alarm> _alarm;
    private Map<AlternativeImagesKey, AlternativeImages> _alternativeImages;
    private CloudInitInput _cloudInitInput;
    private Uint64 _count;
    private String _description;
    private GuestEpa _guestEpa;
    private HostEpa _hostEpa;
    private HypervisorEpa _hypervisorEpa;
    private String _id;
    private String _image;
    private String _imageChecksum;
    private Map<InterfaceKey, Interface> _interface;
    private Map<InternalConnectionPointKey, InternalConnectionPoint> _internalConnectionPoint;
    private String _mgmtVpci;
    private Map<MonitoringParamKey, MonitoringParam> _monitoringParam;
    private String _name;
    private String _pduType;
    private SupplementalBootData _supplementalBootData;
    private VduConfiguration _vduConfiguration;
    private VmFlavor _vmFlavor;
    private Map<VolumesKey, Volumes> _volumes;
    private VswitchEpa _vswitchEpa;
    private VduKey key;


    Map<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> augmentation = Collections.emptyMap();

    public VduBuilder() {
    }
    public VduBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor arg) {
        this._vmFlavor = arg.getVmFlavor();
    }
    public VduBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.GuestEpa arg) {
        this._guestEpa = arg.getGuestEpa();
    }
    public VduBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VswitchEpa arg) {
        this._vswitchEpa = arg.getVswitchEpa();
    }
    public VduBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HypervisorEpa arg) {
        this._hypervisorEpa = arg.getHypervisorEpa();
    }
    public VduBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostEpa arg) {
        this._hostEpa = arg.getHostEpa();
    }
    public VduBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties arg) {
        this._image = arg.getImage();
        this._imageChecksum = arg.getImageChecksum();
    }
    public VduBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.SupplementalBootData arg) {
        this._supplementalBootData = arg.getSupplementalBootData();
    }

    public VduBuilder(Vdu base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> aug =((AugmentationHolder<Vdu>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._alarm = base.getAlarm();
        this._alternativeImages = base.getAlternativeImages();
        this._cloudInitInput = base.getCloudInitInput();
        this._count = base.getCount();
        this._description = base.getDescription();
        this._guestEpa = base.getGuestEpa();
        this._hostEpa = base.getHostEpa();
        this._hypervisorEpa = base.getHypervisorEpa();
        this._image = base.getImage();
        this._imageChecksum = base.getImageChecksum();
        this._interface = base.getInterface();
        this._internalConnectionPoint = base.getInternalConnectionPoint();
        this._mgmtVpci = base.getMgmtVpci();
        this._monitoringParam = base.getMonitoringParam();
        this._name = base.getName();
        this._pduType = base.getPduType();
        this._supplementalBootData = base.getSupplementalBootData();
        this._vduConfiguration = base.getVduConfiguration();
        this._vmFlavor = base.getVmFlavor();
        this._volumes = base.getVolumes();
        this._vswitchEpa = base.getVswitchEpa();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.GuestEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VswitchEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HypervisorEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.SupplementalBootData</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties) {
            this._image = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties)arg).getImage();
            this._imageChecksum = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties)arg).getImageChecksum();
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostEpa) {
            this._hostEpa = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostEpa)arg).getHostEpa();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor) {
            this._vmFlavor = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor)arg).getVmFlavor();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.GuestEpa, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VswitchEpa, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HypervisorEpa, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.SupplementalBootData, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostEpa, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor]");
    }

    public VduKey key() {
        return key;
    }
    
    public Map<AlarmKey, Alarm> getAlarm() {
        return _alarm;
    }
    
    public Map<AlternativeImagesKey, AlternativeImages> getAlternativeImages() {
        return _alternativeImages;
    }
    
    public CloudInitInput getCloudInitInput() {
        return _cloudInitInput;
    }
    
    public Uint64 getCount() {
        return _count;
    }
    
    public String getDescription() {
        return _description;
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
    
    public String getId() {
        return _id;
    }
    
    public String getImage() {
        return _image;
    }
    
    public String getImageChecksum() {
        return _imageChecksum;
    }
    
    public Map<InterfaceKey, Interface> getInterface() {
        return _interface;
    }
    
    public Map<InternalConnectionPointKey, InternalConnectionPoint> getInternalConnectionPoint() {
        return _internalConnectionPoint;
    }
    
    public String getMgmtVpci() {
        return _mgmtVpci;
    }
    
    public Map<MonitoringParamKey, MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getPduType() {
        return _pduType;
    }
    
    public SupplementalBootData getSupplementalBootData() {
        return _supplementalBootData;
    }
    
    public VduConfiguration getVduConfiguration() {
        return _vduConfiguration;
    }
    
    public VmFlavor getVmFlavor() {
        return _vmFlavor;
    }
    
    public Map<VolumesKey, Volumes> getVolumes() {
        return _volumes;
    }
    
    public VswitchEpa getVswitchEpa() {
        return _vswitchEpa;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Vdu>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public VduBuilder withKey(final VduKey key) {
        this.key = key;
        return this;
    }
    public VduBuilder setAlarm(final Map<AlarmKey, Alarm> values) {
        this._alarm = values;
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
      * @deprecated Use {#link #setAlarm(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VduBuilder setAlarm(final List<Alarm> values) {
        return setAlarm(CodeHelpers.compatMap(values));
    }
    public VduBuilder setAlternativeImages(final Map<AlternativeImagesKey, AlternativeImages> values) {
        this._alternativeImages = values;
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
      * @deprecated Use {#link #setAlternativeImages(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public VduBuilder setAlternativeImages(final List<AlternativeImages> values) {
        return setAlternativeImages(CodeHelpers.compatMap(values));
    }
    
    public VduBuilder setCloudInitInput(final CloudInitInput value) {
        this._cloudInitInput = value;
        return this;
    }
    
    public VduBuilder setCount(final Uint64 value) {
        this._count = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setCount(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public VduBuilder setCount(final BigInteger value) {
        return setCount(CodeHelpers.compatUint(value));
    }
    
    public VduBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public VduBuilder setGuestEpa(final GuestEpa value) {
        this._guestEpa = value;
        return this;
    }
    
    public VduBuilder setHostEpa(final HostEpa value) {
        this._hostEpa = value;
        return this;
    }
    
    public VduBuilder setHypervisorEpa(final HypervisorEpa value) {
        this._hypervisorEpa = value;
        return this;
    }
    
    public VduBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public VduBuilder setImage(final String value) {
        this._image = value;
        return this;
    }
    
    public VduBuilder setImageChecksum(final String value) {
        this._imageChecksum = value;
        return this;
    }
    public VduBuilder setInterface(final Map<InterfaceKey, Interface> values) {
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
    public VduBuilder setInterface(final List<Interface> values) {
        return setInterface(CodeHelpers.compatMap(values));
    }
    public VduBuilder setInternalConnectionPoint(final Map<InternalConnectionPointKey, InternalConnectionPoint> values) {
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
    public VduBuilder setInternalConnectionPoint(final List<InternalConnectionPoint> values) {
        return setInternalConnectionPoint(CodeHelpers.compatMap(values));
    }
    
    public VduBuilder setMgmtVpci(final String value) {
        this._mgmtVpci = value;
        return this;
    }
    public VduBuilder setMonitoringParam(final Map<MonitoringParamKey, MonitoringParam> values) {
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
    public VduBuilder setMonitoringParam(final List<MonitoringParam> values) {
        return setMonitoringParam(CodeHelpers.compatMap(values));
    }
    
    public VduBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VduBuilder setPduType(final String value) {
        this._pduType = value;
        return this;
    }
    
    public VduBuilder setSupplementalBootData(final SupplementalBootData value) {
        this._supplementalBootData = value;
        return this;
    }
    
    public VduBuilder setVduConfiguration(final VduConfiguration value) {
        this._vduConfiguration = value;
        return this;
    }
    
    public VduBuilder setVmFlavor(final VmFlavor value) {
        this._vmFlavor = value;
        return this;
    }
    public VduBuilder setVolumes(final Map<VolumesKey, Volumes> values) {
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
    public VduBuilder setVolumes(final List<Volumes> values) {
        return setVolumes(CodeHelpers.compatMap(values));
    }
    
    public VduBuilder setVswitchEpa(final VswitchEpa value) {
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
    public VduBuilder addAugmentation(Augmentation<Vdu> augmentation) {
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
    public VduBuilder addAugmentation(Class<? extends Augmentation<Vdu>> augmentationType, Augmentation<Vdu> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public VduBuilder removeAugmentation(Class<? extends Augmentation<Vdu>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private VduBuilder doAddAugmentation(Class<? extends Augmentation<Vdu>> augmentationType, Augmentation<Vdu> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Vdu build() {
        return new VduImpl(this);
    }

    private static final class VduImpl
        extends AbstractAugmentable<Vdu>
        implements Vdu {
    
        private final Map<AlarmKey, Alarm> _alarm;
        private final Map<AlternativeImagesKey, AlternativeImages> _alternativeImages;
        private final CloudInitInput _cloudInitInput;
        private final Uint64 _count;
        private final String _description;
        private final GuestEpa _guestEpa;
        private final HostEpa _hostEpa;
        private final HypervisorEpa _hypervisorEpa;
        private final String _id;
        private final String _image;
        private final String _imageChecksum;
        private final Map<InterfaceKey, Interface> _interface;
        private final Map<InternalConnectionPointKey, InternalConnectionPoint> _internalConnectionPoint;
        private final String _mgmtVpci;
        private final Map<MonitoringParamKey, MonitoringParam> _monitoringParam;
        private final String _name;
        private final String _pduType;
        private final SupplementalBootData _supplementalBootData;
        private final VduConfiguration _vduConfiguration;
        private final VmFlavor _vmFlavor;
        private final Map<VolumesKey, Volumes> _volumes;
        private final VswitchEpa _vswitchEpa;
        private final VduKey key;
    
        VduImpl(VduBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VduKey(base.getId());
            }
            this._id = key.getId();
            this._alarm = CodeHelpers.emptyToNull(base.getAlarm());
            this._alternativeImages = CodeHelpers.emptyToNull(base.getAlternativeImages());
            this._cloudInitInput = base.getCloudInitInput();
            this._count = base.getCount();
            this._description = base.getDescription();
            this._guestEpa = base.getGuestEpa();
            this._hostEpa = base.getHostEpa();
            this._hypervisorEpa = base.getHypervisorEpa();
            this._image = base.getImage();
            this._imageChecksum = base.getImageChecksum();
            this._interface = CodeHelpers.emptyToNull(base.getInterface());
            this._internalConnectionPoint = CodeHelpers.emptyToNull(base.getInternalConnectionPoint());
            this._mgmtVpci = base.getMgmtVpci();
            this._monitoringParam = CodeHelpers.emptyToNull(base.getMonitoringParam());
            this._name = base.getName();
            this._pduType = base.getPduType();
            this._supplementalBootData = base.getSupplementalBootData();
            this._vduConfiguration = base.getVduConfiguration();
            this._vmFlavor = base.getVmFlavor();
            this._volumes = CodeHelpers.emptyToNull(base.getVolumes());
            this._vswitchEpa = base.getVswitchEpa();
        }
    
        @Override
        public VduKey key() {
            return key;
        }
        
        @Override
        public Map<AlarmKey, Alarm> getAlarm() {
            return _alarm;
        }
        
        @Override
        public Map<AlternativeImagesKey, AlternativeImages> getAlternativeImages() {
            return _alternativeImages;
        }
        
        @Override
        public CloudInitInput getCloudInitInput() {
            return _cloudInitInput;
        }
        
        @Override
        public Uint64 getCount() {
            return _count;
        }
        
        @Override
        public String getDescription() {
            return _description;
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
        public String getId() {
            return _id;
        }
        
        @Override
        public String getImage() {
            return _image;
        }
        
        @Override
        public String getImageChecksum() {
            return _imageChecksum;
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
        public String getMgmtVpci() {
            return _mgmtVpci;
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
        public String getPduType() {
            return _pduType;
        }
        
        @Override
        public SupplementalBootData getSupplementalBootData() {
            return _supplementalBootData;
        }
        
        @Override
        public VduConfiguration getVduConfiguration() {
            return _vduConfiguration;
        }
        
        @Override
        public VmFlavor getVmFlavor() {
            return _vmFlavor;
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
            result = prime * result + Objects.hashCode(_alarm);
            result = prime * result + Objects.hashCode(_alternativeImages);
            result = prime * result + Objects.hashCode(_cloudInitInput);
            result = prime * result + Objects.hashCode(_count);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_guestEpa);
            result = prime * result + Objects.hashCode(_hostEpa);
            result = prime * result + Objects.hashCode(_hypervisorEpa);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_image);
            result = prime * result + Objects.hashCode(_imageChecksum);
            result = prime * result + Objects.hashCode(_interface);
            result = prime * result + Objects.hashCode(_internalConnectionPoint);
            result = prime * result + Objects.hashCode(_mgmtVpci);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_pduType);
            result = prime * result + Objects.hashCode(_supplementalBootData);
            result = prime * result + Objects.hashCode(_vduConfiguration);
            result = prime * result + Objects.hashCode(_vmFlavor);
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
            if (!Vdu.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Vdu other = (Vdu)obj;
            if (!Objects.equals(_alarm, other.getAlarm())) {
                return false;
            }
            if (!Objects.equals(_alternativeImages, other.getAlternativeImages())) {
                return false;
            }
            if (!Objects.equals(_cloudInitInput, other.getCloudInitInput())) {
                return false;
            }
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
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
            if (!Objects.equals(_image, other.getImage())) {
                return false;
            }
            if (!Objects.equals(_imageChecksum, other.getImageChecksum())) {
                return false;
            }
            if (!Objects.equals(_interface, other.getInterface())) {
                return false;
            }
            if (!Objects.equals(_internalConnectionPoint, other.getInternalConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_mgmtVpci, other.getMgmtVpci())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_pduType, other.getPduType())) {
                return false;
            }
            if (!Objects.equals(_supplementalBootData, other.getSupplementalBootData())) {
                return false;
            }
            if (!Objects.equals(_vduConfiguration, other.getVduConfiguration())) {
                return false;
            }
            if (!Objects.equals(_vmFlavor, other.getVmFlavor())) {
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
                VduImpl otherImpl = (VduImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vdu");
            CodeHelpers.appendValue(helper, "_alarm", _alarm);
            CodeHelpers.appendValue(helper, "_alternativeImages", _alternativeImages);
            CodeHelpers.appendValue(helper, "_cloudInitInput", _cloudInitInput);
            CodeHelpers.appendValue(helper, "_count", _count);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_guestEpa", _guestEpa);
            CodeHelpers.appendValue(helper, "_hostEpa", _hostEpa);
            CodeHelpers.appendValue(helper, "_hypervisorEpa", _hypervisorEpa);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_image", _image);
            CodeHelpers.appendValue(helper, "_imageChecksum", _imageChecksum);
            CodeHelpers.appendValue(helper, "_interface", _interface);
            CodeHelpers.appendValue(helper, "_internalConnectionPoint", _internalConnectionPoint);
            CodeHelpers.appendValue(helper, "_mgmtVpci", _mgmtVpci);
            CodeHelpers.appendValue(helper, "_monitoringParam", _monitoringParam);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_pduType", _pduType);
            CodeHelpers.appendValue(helper, "_supplementalBootData", _supplementalBootData);
            CodeHelpers.appendValue(helper, "_vduConfiguration", _vduConfiguration);
            CodeHelpers.appendValue(helper, "_vmFlavor", _vmFlavor);
            CodeHelpers.appendValue(helper, "_volumes", _volumes);
            CodeHelpers.appendValue(helper, "_vswitchEpa", _vswitchEpa);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
