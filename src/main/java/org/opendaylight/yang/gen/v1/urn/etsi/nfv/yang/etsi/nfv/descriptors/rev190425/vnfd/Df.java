package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SupportedOperation;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.DfBuilder.DfImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.AffinityOrAntiAffinityGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.AffinityOrAntiAffinityGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.Indicator;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.IndicatorKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.InstantiationLevel;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.InstantiationLevelKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.LcmOperationsConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.MonitoringParameter;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.MonitoringParameterKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.ScalingAspect;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.ScalingAspectKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.SupportedVnfInterfaces;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.SupportedVnfInterfacesKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VduProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VduProfileKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VirtualLinkProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VirtualLinkProfileKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Describes a specific Deployment Flavour (DF) of a VNF with specific 
 * for capacity and performance.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list df {
 *   must "default-instantiation-level or count(instantiation-level) = 1";
 *   key id;
 *   min-elements 1;
 *   leaf id {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   list vdu-profile {
 *     key id;
 *     min-elements 1;
 *     leaf id {
 *       type leafref {
 *         path ../../../vdu/id;
 *       }
 *     }
 *     leaf min-number-of-instances {
 *       type uint16;
 *       default 1;
 *     }
 *     leaf max-number-of-instances {
 *       type uint16;
 *       default 1;
 *       must ". &gt;= ../min-number-of-instances";
 *     }
 *     uses local-affinity-or-anti-affinity-rule;
 *     list affinity-or-anti-affinity-group {
 *       key id;
 *       leaf id {
 *         type leafref {
 *           path ../../../affinity-or-anti-affinity-group/id;
 *         }
 *       }
 *     }
 *   }
 *   list virtual-link-profile {
 *     key "id flavour";
 *     leaf id {
 *       type leafref {
 *         path ../../../int-virtual-link-desc/id;
 *       }
 *     }
 *     leaf flavour {
 *       type leafref {
 *         path ../../../flavour/id;
 *       }
 *     }
 *     uses local-affinity-or-anti-affinity-rule;
 *     list affinity-or-anti-affinity-group {
 *       key id;
 *       leaf id {
 *         type leafref {
 *           path ../../../affinity-or-anti-affinity-group/id;
 *         }
 *       }
 *     }
 *     container max-bit-rate-requirements {
 *       leaf root {
 *         type uint32;
 *       }
 *       leaf leaf {
 *         type uint32;
 *       }
 *     }
 *     container min-bit-rate-requirements {
 *       leaf root {
 *         type uint32;
 *       }
 *       leaf leaf {
 *         type uint32;
 *       }
 *     }
 *     container virtual-link-protocol-data {
 *       leaf associated-layer-protocol {
 *         type identityref {
 *           base layer-protocol;
 *         }
 *       }
 *       container l2-protocol-data {
 *         when "(../associated-layer-protocol = 'Ethernet') or (../associated-layer-protocol = 'MPLS') or (../associated-layer-protocol = 'ODU2') or (../associated-layer-protocol = 'Pseudo-Wire')";
 *         leaf name {
 *           type string;
 *         }
 *         leaf network-type {
 *           type enumeration {
 *             enum flat;
 *             enum vlan;
 *             enum vxlan;
 *             enum gre;
 *           }
 *         }
 *         leaf vlan-transparent {
 *           type boolean;
 *         }
 *         leaf mtu {
 *           type uint16;
 *         }
 *       }
 *       container l3-protocol-data {
 *         when "(../associated-layer-protocol = 'IPv4') or (../associated-layer-protocol = 'IPv6')";
 *         leaf name {
 *           type string;
 *         }
 *         leaf ip-version {
 *           type enumeration {
 *             enum ipv4;
 *             enum ipv6;
 *           }
 *           default ipv4;
 *         }
 *         leaf cidr {
 *           type string;
 *         }
 *         leaf-list ip-allocation-pools {
 *           type string;
 *         }
 *         leaf gateway-ip {
 *           type inet:ip-address;
 *         }
 *         leaf dhcp-enabled {
 *           type boolean;
 *           default true;
 *         }
 *         leaf ipv6-address-mode {
 *           when "../ip-version = 'ipv6'";
 *           type enumeration {
 *             enum slaac;
 *             enum dhcpv6-stateful;
 *             enum dhcpv6-stateless;
 *           }
 *         }
 *       }
 *     }
 *   }
 *   list instantiation-level {
 *     key id;
 *     min-elements 1;
 *     leaf id {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     list vdu-level {
 *       key vdu-id;
 *       min-elements 1;
 *       leaf vdu-id {
 *         type leafref {
 *           path ../../../../vdu/id;
 *         }
 *       }
 *       leaf number-of-instances {
 *         type uint16;
 *         must ". &lt;= ../../../../df/vdu-profile[id=current()/../vdu-id]/max-number-of-instances";
 *         must ". &gt;= ../../../../df/vdu-profile[id=current()/../vdu-id]/min-number-of-instances";
 *         default 1;
 *       }
 *     }
 *     list scaling-info {
 *       key scaling-aspect-id;
 *       leaf scaling-aspect-id {
 *         type leafref {
 *           path ../../../scaling-aspect/id;
 *         }
 *       }
 *       leaf scale-level {
 *         type uint32;
 *       }
 *     }
 *   }
 *   leaf default-instantiation-level {
 *     type leafref {
 *       path ../instantiation-level/id;
 *     }
 *   }
 *   leaf-list supported-operation {
 *     type identityref {
 *       base supported-operation;
 *     }
 *   }
 *   container lcm-operations-configuration {
 *     container instantiate-vnf-op-config {
 *       list parameter {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *     container scale-vnf-op-config {
 *       list parameter {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *       leaf scaling-by-more-than-one-step-supported {
 *         type boolean;
 *         default false;
 *       }
 *     }
 *     container scale-vnf-to-level-op-config {
 *       list parameter {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *       leaf arbitrary-target-levels-supported {
 *         type boolean;
 *         default false;
 *       }
 *     }
 *     container heal-vnf-op-config {
 *       list parameter {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *       leaf-list cause {
 *         type string;
 *       }
 *     }
 *     container terminate-vnf-op-config {
 *       leaf min-graceful-termination {
 *         type yang:timeticks;
 *         default 1;
 *       }
 *       leaf max-recommended-graceful-termination {
 *         type yang:timeticks;
 *       }
 *       list parameter {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *     container operate-vnf-op-config {
 *       leaf min-graceful-stop-timeout {
 *         type yang:timeticks;
 *         default 1;
 *       }
 *       leaf max-recommended-graceful-stop-timeout {
 *         type yang:timeticks;
 *       }
 *       list parameter {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *     container change-vnf-flavour-op-config {
 *       list parameter {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *     container change-ext-vnf-connectivity-op-config {
 *       list parameter {
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 *   list affinity-or-anti-affinity-group {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf type {
 *       type affinity-type;
 *     }
 *     leaf scope {
 *       type affinity-scope;
 *     }
 *   }
 *   list indicator {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf indicator-value {
 *       type string;
 *     }
 *     leaf source {
 *       type enumeration {
 *         enum vnf;
 *         enum em;
 *         enum both;
 *       }
 *     }
 *   }
 *   list supported-vnf-interfaces {
 *     key name;
 *     leaf name {
 *       type enumeration {
 *         enum vnf-configuration;
 *         enum vnf-indicator;
 *       }
 *     }
 *     leaf-list cpd-id {
 *       type leafref {
 *         path ../../../ext-cpd/id;
 *       }
 *     }
 *     list interface-details {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 *   list monitoring-parameter {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     uses monitoring-parameter;
 *   }
 *   list scaling-aspect {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf max-scale-level {
 *       type uint32 {
 *         range 1..max;
 *       }
 *     }
 *     container aspect-delta-details {
 *       list deltas {
 *         key id;
 *         min-elements 1;
 *         leaf id {
 *           type string;
 *         }
 *         list vdu-delta {
 *           key id;
 *           leaf id {
 *             type leafref {
 *               path ../../../../../../vdu/id;
 *             }
 *           }
 *           leaf number-of-instances {
 *             type uint32 {
 *               range 0..max;
 *             }
 *           }
 *         }
 *         list virtual-link-bit-rate-delta {
 *           key id;
 *           leaf id {
 *             type string;
 *           }
 *           container bit-rate-requirements {
 *             leaf root {
 *               type uint32;
 *               units bits/sec;
 *             }
 *             leaf leaf {
 *               type uint32;
 *               units bits/sec;
 *             }
 *           }
 *         }
 *       }
 *       leaf step-deltas {
 *         type leafref {
 *           path ../deltas/id;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df</i>
 * 
 * <p>To create instances of this class use {@link DfBuilder}.
 * @see DfBuilder
 * @see DfKey
 *
 */
@JsonDeserialize(as = DfImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Df
    extends
    ChildOf<Vnfd>,
    Augmentable<Df>,
    Identifiable<DfKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("df");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Df> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Df.class;
    }
    
    /**
     * Identifier of this DF within the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Human readable description of the deployment flavour
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * The Vduprofile describes additional instantiation data for a given VDU used in a
     * deployment flavour.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vduProfile</code>, or <code>null</code> if not present
     */
    @Nullable Map<VduProfileKey, VduProfile> getVduProfile();
    
    /**
     * @return <code>java.util.Map</code> <code>vduProfile</code>, or an empty list if it is not present
     */
    default @NonNull Map<VduProfileKey, VduProfile> nonnullVduProfile() {
        return CodeHelpers.nonnull(getVduProfile());
    }
    
    /**
     * Defines the internal VLD along with additional data which is used in this DF.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>virtualLinkProfile</code>, or <code>null</code> if not present
     */
    @JsonDeserialize(keyUsing = VirtualLinkProfileKey.class)
    @Nullable Map<VirtualLinkProfileKey, VirtualLinkProfile> getVirtualLinkProfile();
    
    /**
     * @return <code>java.util.Map</code> <code>virtualLinkProfile</code>, or an empty list if it is not present
     */
    default @NonNull Map<VirtualLinkProfileKey, VirtualLinkProfile> nonnullVirtualLinkProfile() {
        return CodeHelpers.nonnull(getVirtualLinkProfile());
    }
    
    /**
     * Describes the various levels of resources that can be used to instantiate the
     * VNF using this flavour. Examples: Small, Medium, Large. If there is only one
     * 'instantiationLevel' entry, it shall be treated as the default instantiation
     * level for this DF. The InstantiationLevel information element describes a given
     * level of resources to be instantiated within a deployment flavour in term of the
     * number of VNFC instances to be created from each VDU. All the VDUs referenced in
     * the level shall be part of the corresponding deployment flavour and their number
     * shall be within the range (min/max) for this deployment flavour.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>instantiationLevel</code>, or <code>null</code> if not present
     */
    @Nullable Map<InstantiationLevelKey, InstantiationLevel> getInstantiationLevel();
    
    /**
     * @return <code>java.util.Map</code> <code>instantiationLevel</code>, or an empty list if it is not present
     */
    default @NonNull Map<InstantiationLevelKey, InstantiationLevel> nonnullInstantiationLevel() {
        return CodeHelpers.nonnull(getInstantiationLevel());
    }
    
    /**
     * This attribute references the 'instantiationLevel' entry which defines the
     * default instantiation level for this DF. It shall be present if there are
     * multiple 'instantiationLevel' entries.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>defaultInstantiationLevel</code>, or <code>null</code> if not present
     */
    @Nullable String getDefaultInstantiationLevel();
    
    /**
     * Indicates which operations are available for this DF via the VNF LCM interface.
     * Instantiate VNF, Query VNF and Terminate VNF are supported in all DF and
     * therefore need not be included in this list.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportedOperation</code>, or <code>null</code> if not present
     */
    @Nullable List<Class<? extends SupportedOperation>> getSupportedOperation();
    
    /**
     * This information element is a container for all attributes that affect the
     * invocation of the VNF Lifecycle Management operations, structured by operation.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.LcmOperationsConfiguration</code> <code>lcmOperationsConfiguration</code>, or <code>null</code> if not present
     */
    @Nullable LcmOperationsConfiguration getLcmOperationsConfiguration();
    
    /**
     * The AffinityOrAntiAffinityGroup describes the affinity or anti-affinity
     * relationship applicable between the virtualization containers to be created
     * based on different VDUs, or between internal VLs to be created based on
     * different VnfVirtualLinkDesc(s). Per VNF, the affinity/anti-affinity rules
     * defined using this information element, using the
     * LocalAffinityOrAntiAffinityRule information element, and using the placement
     * constraints in the GrantLifecycleOperation as defined in ETSI GS NFV-IFA 007
     * [i.3] should be conflict-free. In case of conflicts, the placement constraints
     * in the GrantLifecycleOperation shall take precedence.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>affinityOrAntiAffinityGroup</code>, or <code>null</code> if not present
     */
    @Nullable Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> getAffinityOrAntiAffinityGroup();
    
    /**
     * @return <code>java.util.Map</code> <code>affinityOrAntiAffinityGroup</code>, or an empty list if it is not present
     */
    default @NonNull Map<AffinityOrAntiAffinityGroupKey, AffinityOrAntiAffinityGroup> nonnullAffinityOrAntiAffinityGroup() {
        return CodeHelpers.nonnull(getAffinityOrAntiAffinityGroup());
    }
    
    /**
     * Declares the VNF indicators that are supported by this VNF (specific to this
     * DF).
     *
     *
     *
     * @return <code>java.util.Map</code> <code>indicator</code>, or <code>null</code> if not present
     */
    @Nullable Map<IndicatorKey, Indicator> getIndicator();
    
    /**
     * @return <code>java.util.Map</code> <code>indicator</code>, or an empty list if it is not present
     */
    default @NonNull Map<IndicatorKey, Indicator> nonnullIndicator() {
        return CodeHelpers.nonnull(getIndicator());
    }
    
    /**
     * Indicates which interfaces the VNF produces and provides additional details on
     * how to access the interface endpoints.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>supportedVnfInterfaces</code>, or <code>null</code> if not present
     */
    @JsonDeserialize(keyUsing = SupportedVnfInterfacesKey.class)    
    @Nullable Map<SupportedVnfInterfacesKey, SupportedVnfInterfaces> getSupportedVnfInterfaces();
    
    /**
     * @return <code>java.util.Map</code> <code>supportedVnfInterfaces</code>, or an empty list if it is not present
     */
    default @NonNull Map<SupportedVnfInterfacesKey, SupportedVnfInterfaces> nonnullSupportedVnfInterfaces() {
        return CodeHelpers.nonnull(getSupportedVnfInterfaces());
    }
    
    /**
     * Defines the virtualised resources monitoring parameters on VNF level.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>monitoringParameter</code>, or <code>null</code> if not present
     */
    @Nullable Map<MonitoringParameterKey, MonitoringParameter> getMonitoringParameter();
    
    /**
     * @return <code>java.util.Map</code> <code>monitoringParameter</code>, or an empty list if it is not present
     */
    default @NonNull Map<MonitoringParameterKey, MonitoringParameter> nonnullMonitoringParameter() {
        return CodeHelpers.nonnull(getMonitoringParameter());
    }
    
    /**
     * The scaling aspects supported by this DF of the VNF. scalingAspect shall be
     * present if the VNF supports scaling.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>scalingAspect</code>, or <code>null</code> if not present
     */
    @Nullable Map<ScalingAspectKey, ScalingAspect> getScalingAspect();
    
    /**
     * @return <code>java.util.Map</code> <code>scalingAspect</code>, or an empty list if it is not present
     */
    default @NonNull Map<ScalingAspectKey, ScalingAspect> nonnullScalingAspect() {
        return CodeHelpers.nonnull(getScalingAspect());
    }
    
    @Override
    DfKey key();

}

