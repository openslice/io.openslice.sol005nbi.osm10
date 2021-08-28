package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.catalog;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.xpath.InputParameterXpath;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.xpath.InputParameterXpathKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.list.IpProfiles;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.list.IpProfilesKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ConnectionPointKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.KeyPair;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.KeyPairKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.NsConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ParameterPool;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ParameterPoolKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptorKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.User;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.UserKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.Vnffgd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.VnffgdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.monitoring.param.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.monitoring.param.MonitoringParamKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.placement.groups.PlacementGroups;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.placement.groups.PlacementGroupsKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.vld.Vld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.vld.VldKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.vnf.dependency.VnfDependency;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.vnf.dependency.VnfDependencyKey;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NsdBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     NsdBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new NsdBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of NsdBuilder, as instances can be freely passed around without
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
 * @see NsdBuilder
 * @see Builder
 *
 */
public class NsdBuilder implements Builder<Nsd> {

    private Map<ConnectionPointKey, ConnectionPoint> _connectionPoint;
    private Map<ConstituentVnfdKey, ConstituentVnfd> _constituentVnfd;
    private String _description;
    private String _id;
    private Map<InputParameterXpathKey, InputParameterXpath> _inputParameterXpath;
    private Map<IpProfilesKey, IpProfiles> _ipProfiles;
    private Map<KeyPairKey, KeyPair> _keyPair;
    private String _logo;
    private Map<MonitoringParamKey, MonitoringParam> _monitoringParam;
    private String _name;
    private NsConfiguration _nsConfiguration;
    private Map<ParameterPoolKey, ParameterPool> _parameterPool;
    private Map<PlacementGroupsKey, PlacementGroups> _placementGroups;
    private Map<ScalingGroupDescriptorKey, ScalingGroupDescriptor> _scalingGroupDescriptor;
    private String _shortName;
    private Map<UserKey, User> _user;
    private String _vendor;
    private String _version;
    private Map<VldKey, Vld> _vld;
    private Map<VnfDependencyKey, VnfDependency> _vnfDependency;
    private Map<VnffgdKey, Vnffgd> _vnffgd;
    private NsdKey key;


    Map<Class<? extends Augmentation<Nsd>>, Augmentation<Nsd>> augmentation = Collections.emptyMap();

    public NsdBuilder() {
    }
    public NsdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._logo = arg.getLogo();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
        this._connectionPoint = arg.getConnectionPoint();
        this._scalingGroupDescriptor = arg.getScalingGroupDescriptor();
        this._vnffgd = arg.getVnffgd();
        this._nsConfiguration = arg.getNsConfiguration();
        this._parameterPool = arg.getParameterPool();
        this._keyPair = arg.getKeyPair();
        this._user = arg.getUser();
        this._ipProfiles = arg.getIpProfiles();
        this._inputParameterXpath = arg.getInputParameterXpath();
    }
    public NsdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileList arg) {
        this._ipProfiles = arg.getIpProfiles();
    }
    public NsdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameterXpath arg) {
        this._inputParameterXpath = arg.getInputParameterXpath();
    }
    public NsdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdVld arg) {
        this._vld = arg.getVld();
    }
    public NsdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdConstituentVnfd arg) {
        this._constituentVnfd = arg.getConstituentVnfd();
    }
    public NsdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdPlacementGroups arg) {
        this._placementGroups = arg.getPlacementGroups();
    }
    public NsdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdVnfDependency arg) {
        this._vnfDependency = arg.getVnfDependency();
    }
    public NsdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdMonitoringParam arg) {
        this._monitoringParam = arg.getMonitoringParam();
    }

    public NsdBuilder(Nsd base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Nsd>>, Augmentation<Nsd>> aug =((AugmentationHolder<Nsd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._id = base.getId();
        this._connectionPoint = base.getConnectionPoint();
        this._constituentVnfd = base.getConstituentVnfd();
        this._description = base.getDescription();
        this._inputParameterXpath = base.getInputParameterXpath();
        this._ipProfiles = base.getIpProfiles();
        this._keyPair = base.getKeyPair();
        this._logo = base.getLogo();
        this._monitoringParam = base.getMonitoringParam();
        this._name = base.getName();
        this._nsConfiguration = base.getNsConfiguration();
        this._parameterPool = base.getParameterPool();
        this._placementGroups = base.getPlacementGroups();
        this._scalingGroupDescriptor = base.getScalingGroupDescriptor();
        this._shortName = base.getShortName();
        this._user = base.getUser();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vld = base.getVld();
        this._vnfDependency = base.getVnfDependency();
        this._vnffgd = base.getVnffgd();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdMonitoringParam</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileList</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameterXpath</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdVld</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdConstituentVnfd</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdPlacementGroups</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdVnfDependency</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getName();
            this._shortName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getShortName();
            this._vendor = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getVendor();
            this._logo = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getLogo();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getDescription();
            this._version = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getVersion();
            this._connectionPoint = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getConnectionPoint();
            this._scalingGroupDescriptor = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getScalingGroupDescriptor();
            this._vnffgd = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getVnffgd();
            this._nsConfiguration = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getNsConfiguration();
            this._parameterPool = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getParameterPool();
            this._keyPair = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getKeyPair();
            this._user = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon)arg).getUser();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdMonitoringParam) {
            this._monitoringParam = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdMonitoringParam)arg).getMonitoringParam();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileList) {
            this._ipProfiles = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileList)arg).getIpProfiles();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameterXpath) {
            this._inputParameterXpath = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameterXpath)arg).getInputParameterXpath();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdVld) {
            this._vld = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdVld)arg).getVld();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdConstituentVnfd) {
            this._constituentVnfd = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdConstituentVnfd)arg).getConstituentVnfd();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdPlacementGroups) {
            this._placementGroups = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdPlacementGroups)arg).getPlacementGroups();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdVnfDependency) {
            this._vnfDependency = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdVnfDependency)arg).getVnfDependency();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdMonitoringParam, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.IpProfileList, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameterXpath, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdVld, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdConstituentVnfd, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdPlacementGroups, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdVnfDependency]");
    }

    public NsdKey key() {
        return key;
    }
    
    public Map<ConnectionPointKey, ConnectionPoint> getConnectionPoint() {
        return _connectionPoint;
    }
    
    public Map<ConstituentVnfdKey, ConstituentVnfd> getConstituentVnfd() {
        return _constituentVnfd;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public Map<InputParameterXpathKey, InputParameterXpath> getInputParameterXpath() {
        return _inputParameterXpath;
    }
    
    public Map<IpProfilesKey, IpProfiles> getIpProfiles() {
        return _ipProfiles;
    }
    
    public Map<KeyPairKey, KeyPair> getKeyPair() {
        return _keyPair;
    }
    
    public String getLogo() {
        return _logo;
    }
    
    public Map<MonitoringParamKey, MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public String getName() {
        return _name;
    }
    
    public NsConfiguration getNsConfiguration() {
        return _nsConfiguration;
    }
    
    public Map<ParameterPoolKey, ParameterPool> getParameterPool() {
        return _parameterPool;
    }
    
    public Map<PlacementGroupsKey, PlacementGroups> getPlacementGroups() {
        return _placementGroups;
    }
    
    public Map<ScalingGroupDescriptorKey, ScalingGroupDescriptor> getScalingGroupDescriptor() {
        return _scalingGroupDescriptor;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public Map<UserKey, User> getUser() {
        return _user;
    }
    
    public String getVendor() {
        return _vendor;
    }
    
    public String getVersion() {
        return _version;
    }
    
    public Map<VldKey, Vld> getVld() {
        return _vld;
    }
    
    public Map<VnfDependencyKey, VnfDependency> getVnfDependency() {
        return _vnfDependency;
    }
    
    public Map<VnffgdKey, Vnffgd> getVnffgd() {
        return _vnffgd;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<Nsd>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public NsdBuilder withKey(final NsdKey key) {
        this.key = key;
        return this;
    }
    public NsdBuilder setConnectionPoint(final Map<ConnectionPointKey, ConnectionPoint> values) {
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
    public NsdBuilder setConnectionPoint(final List<ConnectionPoint> values) {
        return setConnectionPoint(CodeHelpers.compatMap(values));
    }
    public NsdBuilder setConstituentVnfd(final Map<ConstituentVnfdKey, ConstituentVnfd> values) {
        this._constituentVnfd = values;
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
      * @deprecated Use {#link #setConstituentVnfd(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setConstituentVnfd(final List<ConstituentVnfd> values) {
        return setConstituentVnfd(CodeHelpers.compatMap(values));
    }
    
    public NsdBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    private static void check_idLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 63) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..63]]", value);
    }
    
    public NsdBuilder setId(final String value) {
        if (value != null) {
            check_idLength(value);
            
        }
        this._id = value;
        return this;
    }
    public NsdBuilder setInputParameterXpath(final Map<InputParameterXpathKey, InputParameterXpath> values) {
        this._inputParameterXpath = values;
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
      * @deprecated Use {#link #setInputParameterXpath(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setInputParameterXpath(final List<InputParameterXpath> values) {
        return setInputParameterXpath(CodeHelpers.compatMap(values));
    }
    public NsdBuilder setIpProfiles(final Map<IpProfilesKey, IpProfiles> values) {
        this._ipProfiles = values;
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
      * @deprecated Use {#link #setIpProfiles(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setIpProfiles(final List<IpProfiles> values) {
        return setIpProfiles(CodeHelpers.compatMap(values));
    }
    public NsdBuilder setKeyPair(final Map<KeyPairKey, KeyPair> values) {
        this._keyPair = values;
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
      * @deprecated Use {#link #setKeyPair(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setKeyPair(final List<KeyPair> values) {
        return setKeyPair(CodeHelpers.compatMap(values));
    }
    
    public NsdBuilder setLogo(final String value) {
        this._logo = value;
        return this;
    }
    public NsdBuilder setMonitoringParam(final Map<MonitoringParamKey, MonitoringParam> values) {
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
    public NsdBuilder setMonitoringParam(final List<MonitoringParam> values) {
        return setMonitoringParam(CodeHelpers.compatMap(values));
    }
    
    public NsdBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public NsdBuilder setNsConfiguration(final NsConfiguration value) {
        this._nsConfiguration = value;
        return this;
    }
    public NsdBuilder setParameterPool(final Map<ParameterPoolKey, ParameterPool> values) {
        this._parameterPool = values;
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
      * @deprecated Use {#link #setParameterPool(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setParameterPool(final List<ParameterPool> values) {
        return setParameterPool(CodeHelpers.compatMap(values));
    }
    public NsdBuilder setPlacementGroups(final Map<PlacementGroupsKey, PlacementGroups> values) {
        this._placementGroups = values;
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
      * @deprecated Use {#link #setPlacementGroups(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setPlacementGroups(final List<PlacementGroups> values) {
        return setPlacementGroups(CodeHelpers.compatMap(values));
    }
    public NsdBuilder setScalingGroupDescriptor(final Map<ScalingGroupDescriptorKey, ScalingGroupDescriptor> values) {
        this._scalingGroupDescriptor = values;
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
      * @deprecated Use {#link #setScalingGroupDescriptor(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setScalingGroupDescriptor(final List<ScalingGroupDescriptor> values) {
        return setScalingGroupDescriptor(CodeHelpers.compatMap(values));
    }
    
    public NsdBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    public NsdBuilder setUser(final Map<UserKey, User> values) {
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
    public NsdBuilder setUser(final List<User> values) {
        return setUser(CodeHelpers.compatMap(values));
    }
    
    public NsdBuilder setVendor(final String value) {
        this._vendor = value;
        return this;
    }
    
    public NsdBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    public NsdBuilder setVld(final Map<VldKey, Vld> values) {
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
    public NsdBuilder setVld(final List<Vld> values) {
        return setVld(CodeHelpers.compatMap(values));
    }
    public NsdBuilder setVnfDependency(final Map<VnfDependencyKey, VnfDependency> values) {
        this._vnfDependency = values;
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
      * @deprecated Use {#link #setVnfDependency(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setVnfDependency(final List<VnfDependency> values) {
        return setVnfDependency(CodeHelpers.compatMap(values));
    }
    public NsdBuilder setVnffgd(final Map<VnffgdKey, Vnffgd> values) {
        this._vnffgd = values;
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
      * @deprecated Use {#link #setVnffgd(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public NsdBuilder setVnffgd(final List<Vnffgd> values) {
        return setVnffgd(CodeHelpers.compatMap(values));
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public NsdBuilder addAugmentation(Augmentation<Nsd> augmentation) {
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
    public NsdBuilder addAugmentation(Class<? extends Augmentation<Nsd>> augmentationType, Augmentation<Nsd> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public NsdBuilder removeAugmentation(Class<? extends Augmentation<Nsd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private NsdBuilder doAddAugmentation(Class<? extends Augmentation<Nsd>> augmentationType, Augmentation<Nsd> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public Nsd build() {
        return new NsdImpl(this);
    }

    private static final class NsdImpl
        extends AbstractAugmentable<Nsd>
        implements Nsd {
    
        private final Map<ConnectionPointKey, ConnectionPoint> _connectionPoint;
        private final Map<ConstituentVnfdKey, ConstituentVnfd> _constituentVnfd;
        private final String _description;
        private final String _id;
        private final Map<InputParameterXpathKey, InputParameterXpath> _inputParameterXpath;
        private final Map<IpProfilesKey, IpProfiles> _ipProfiles;
        private final Map<KeyPairKey, KeyPair> _keyPair;
        private final String _logo;
        private final Map<MonitoringParamKey, MonitoringParam> _monitoringParam;
        private final String _name;
        private final NsConfiguration _nsConfiguration;
        private final Map<ParameterPoolKey, ParameterPool> _parameterPool;
        private final Map<PlacementGroupsKey, PlacementGroups> _placementGroups;
        private final Map<ScalingGroupDescriptorKey, ScalingGroupDescriptor> _scalingGroupDescriptor;
        private final String _shortName;
        private final Map<UserKey, User> _user;
        private final String _vendor;
        private final String _version;
        private final Map<VldKey, Vld> _vld;
        private final Map<VnfDependencyKey, VnfDependency> _vnfDependency;
        private final Map<VnffgdKey, Vnffgd> _vnffgd;
        private final NsdKey key;
    
        NsdImpl(NsdBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NsdKey(base.getId());
            }
            this._id = key.getId();
            this._connectionPoint = CodeHelpers.emptyToNull(base.getConnectionPoint());
            this._constituentVnfd = CodeHelpers.emptyToNull(base.getConstituentVnfd());
            this._description = base.getDescription();
            this._inputParameterXpath = CodeHelpers.emptyToNull(base.getInputParameterXpath());
            this._ipProfiles = CodeHelpers.emptyToNull(base.getIpProfiles());
            this._keyPair = CodeHelpers.emptyToNull(base.getKeyPair());
            this._logo = base.getLogo();
            this._monitoringParam = CodeHelpers.emptyToNull(base.getMonitoringParam());
            this._name = base.getName();
            this._nsConfiguration = base.getNsConfiguration();
            this._parameterPool = CodeHelpers.emptyToNull(base.getParameterPool());
            this._placementGroups = CodeHelpers.emptyToNull(base.getPlacementGroups());
            this._scalingGroupDescriptor = CodeHelpers.emptyToNull(base.getScalingGroupDescriptor());
            this._shortName = base.getShortName();
            this._user = CodeHelpers.emptyToNull(base.getUser());
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vld = CodeHelpers.emptyToNull(base.getVld());
            this._vnfDependency = CodeHelpers.emptyToNull(base.getVnfDependency());
            this._vnffgd = CodeHelpers.emptyToNull(base.getVnffgd());
        }
    
        @Override
        public NsdKey key() {
            return key;
        }
        
        @Override
        public Map<ConnectionPointKey, ConnectionPoint> getConnectionPoint() {
            return _connectionPoint;
        }
        
        @Override
        public Map<ConstituentVnfdKey, ConstituentVnfd> getConstituentVnfd() {
            return _constituentVnfd;
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
        public Map<InputParameterXpathKey, InputParameterXpath> getInputParameterXpath() {
            return _inputParameterXpath;
        }
        
        @Override
        public Map<IpProfilesKey, IpProfiles> getIpProfiles() {
            return _ipProfiles;
        }
        
        @Override
        public Map<KeyPairKey, KeyPair> getKeyPair() {
            return _keyPair;
        }
        
        @Override
        public String getLogo() {
            return _logo;
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
        public NsConfiguration getNsConfiguration() {
            return _nsConfiguration;
        }
        
        @Override
        public Map<ParameterPoolKey, ParameterPool> getParameterPool() {
            return _parameterPool;
        }
        
        @Override
        public Map<PlacementGroupsKey, PlacementGroups> getPlacementGroups() {
            return _placementGroups;
        }
        
        @Override
        public Map<ScalingGroupDescriptorKey, ScalingGroupDescriptor> getScalingGroupDescriptor() {
            return _scalingGroupDescriptor;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public Map<UserKey, User> getUser() {
            return _user;
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
        public Map<VldKey, Vld> getVld() {
            return _vld;
        }
        
        @Override
        public Map<VnfDependencyKey, VnfDependency> getVnfDependency() {
            return _vnfDependency;
        }
        
        @Override
        public Map<VnffgdKey, Vnffgd> getVnffgd() {
            return _vnffgd;
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
            result = prime * result + Objects.hashCode(_connectionPoint);
            result = prime * result + Objects.hashCode(_constituentVnfd);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_inputParameterXpath);
            result = prime * result + Objects.hashCode(_ipProfiles);
            result = prime * result + Objects.hashCode(_keyPair);
            result = prime * result + Objects.hashCode(_logo);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsConfiguration);
            result = prime * result + Objects.hashCode(_parameterPool);
            result = prime * result + Objects.hashCode(_placementGroups);
            result = prime * result + Objects.hashCode(_scalingGroupDescriptor);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_user);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vld);
            result = prime * result + Objects.hashCode(_vnfDependency);
            result = prime * result + Objects.hashCode(_vnffgd);
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
            if (!Nsd.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            Nsd other = (Nsd)obj;
            if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_constituentVnfd, other.getConstituentVnfd())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_inputParameterXpath, other.getInputParameterXpath())) {
                return false;
            }
            if (!Objects.equals(_ipProfiles, other.getIpProfiles())) {
                return false;
            }
            if (!Objects.equals(_keyPair, other.getKeyPair())) {
                return false;
            }
            if (!Objects.equals(_logo, other.getLogo())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsConfiguration, other.getNsConfiguration())) {
                return false;
            }
            if (!Objects.equals(_parameterPool, other.getParameterPool())) {
                return false;
            }
            if (!Objects.equals(_placementGroups, other.getPlacementGroups())) {
                return false;
            }
            if (!Objects.equals(_scalingGroupDescriptor, other.getScalingGroupDescriptor())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_user, other.getUser())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vld, other.getVld())) {
                return false;
            }
            if (!Objects.equals(_vnfDependency, other.getVnfDependency())) {
                return false;
            }
            if (!Objects.equals(_vnffgd, other.getVnffgd())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsdImpl otherImpl = (NsdImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Nsd>>, Augmentation<Nsd>> e : augmentations().entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nsd");
            CodeHelpers.appendValue(helper, "_connectionPoint", _connectionPoint);
            CodeHelpers.appendValue(helper, "_constituentVnfd", _constituentVnfd);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_inputParameterXpath", _inputParameterXpath);
            CodeHelpers.appendValue(helper, "_ipProfiles", _ipProfiles);
            CodeHelpers.appendValue(helper, "_keyPair", _keyPair);
            CodeHelpers.appendValue(helper, "_logo", _logo);
            CodeHelpers.appendValue(helper, "_monitoringParam", _monitoringParam);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsConfiguration", _nsConfiguration);
            CodeHelpers.appendValue(helper, "_parameterPool", _parameterPool);
            CodeHelpers.appendValue(helper, "_placementGroups", _placementGroups);
            CodeHelpers.appendValue(helper, "_scalingGroupDescriptor", _scalingGroupDescriptor);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_user", _user);
            CodeHelpers.appendValue(helper, "_vendor", _vendor);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "_vld", _vld);
            CodeHelpers.appendValue(helper, "_vnfDependency", _vnfDependency);
            CodeHelpers.appendValue(helper, "_vnffgd", _vnffgd);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
