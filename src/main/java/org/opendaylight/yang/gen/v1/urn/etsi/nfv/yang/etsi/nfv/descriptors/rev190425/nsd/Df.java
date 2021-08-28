package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.DfBuilder.DfImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.AffinityOrAntiAffinityGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.AffinityOrAntiAffinityGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.Dependencies;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.DependenciesKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.MonitoredInfo;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.MonitoredInfoKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsInstantiationLevel;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsInstantiationLevelKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsProfileKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.PnfProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.PnfProfileKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ScalingAspect;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ScalingAspectKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VirtualLinkProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VirtualLinkProfileKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VnfProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VnfProfileKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Identifies a DF within the scope of an NSD.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list df {
 *   min-elements 1;
 *   must "default-instantiation-level or count(ns-instantiation-level) = 1" {
 *     error-message
 *       "default-instantiation-level must be present if there multiple instantion-level";
 *   }
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf flavour-key {
 *     type leafref {
 *       path ../monitored-info/id;
 *     }
 *   }
 *   list vnf-profile {
 *     must "min-number-of-instances &lt;= max-number-of-instances";
 *     must boolean(../../vnfd-id[.=current()/vnfd-id]) {
 *       error-message
 *         "VNFDs in the profile has to be listed as a dependency of the network service descriptor.";
 *     }
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf vnfd-id {
 *       type leafref {
 *         path ../../../../vnfd/id;
 *       }
 *     }
 *     leaf flavour-id {
 *       type leafref {
 *         path deref(../vnfd-id)/../df/id;
 *       }
 *     }
 *     leaf instantiation-level {
 *       type leafref {
 *         path deref(../flavour-id)/../instantiation-level/id;
 *       }
 *     }
 *     leaf min-number-of-instances {
 *       default 1;
 *       type uint16;
 *     }
 *     leaf max-number-of-instances {
 *       default 1;
 *       type uint16;
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
 *     list virtual-link-connectivity {
 *       key virtual-link-profile-id;
 *       leaf virtual-link-profile-id {
 *         type leafref {
 *           path ../../../virtual-link-profile/id;
 *         }
 *       }
 *       list constituent-cpd-id {
 *         key constituent-base-element-id;
 *         leaf constituent-base-element-id {
 *           type leafref {
 *             path ../../../id;
 *           }
 *         }
 *         leaf constituent-cpd-id {
 *           type leafref {
 *             path deref(../../../vnfd-id)/../ext-cpd/id;
 *           }
 *         }
 *       }
 *     }
 *   }
 *   list pnf-profile {
 *     key id;
 *     must boolean(../../pnfd-id[.=current()/pnfd-id]) {
 *       error-message
 *         "PNFDs in the profile has to be listed as a dependency of the network service descriptor.";
 *     }
 *     leaf id {
 *       type string;
 *     }
 *     leaf pnfd-id {
 *       type leafref {
 *         path ../../../../pnfd/id;
 *       }
 *     }
 *     list virtual-link-connectivity {
 *       key virtual-link-profile-id;
 *       leaf virtual-link-profile-id {
 *         type leafref {
 *           path ../../../virtual-link-profile/id;
 *         }
 *       }
 *       list constituent-cpd-id {
 *         key constituent-base-element-id;
 *         leaf constituent-base-element-id {
 *           type leafref {
 *             path ../../../id;
 *           }
 *         }
 *         leaf constituent-cpd-id {
 *           type leafref {
 *             path deref(../../../pnfd-id)/../ext-cpd/id;
 *           }
 *         }
 *       }
 *     }
 *   }
 *   list virtual-link-profile {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf virtual-link-desc-id {
 *       type leafref {
 *         path ../../../virtual-link-desc/id;
 *       }
 *     }
 *     leaf flavour-id {
 *       type leafref {
 *         path deref(../virtual-link-desc-id)/../df/id;
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
 *     container max-bitrate-requirements {
 *       uses link-bitrate-requirements;
 *     }
 *     container min-bitrate-requirements {
 *       uses link-bitrate-requirements;
 *     }
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
 *     leaf scaling-level {
 *       type leafref {
 *         path ../../ns-instantiation-level/id;
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
 *   list ns-instantiation-level {
 *     min-elements 1;
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     list vnf-to-level-mapping {
 *       key vnf-profile-id;
 *       leaf vnf-profile-id {
 *         type leafref {
 *           path ../../../vnf-profile/id;
 *         }
 *       }
 *       leaf number-of-instances {
 *         default 1;
 *         type uint32;
 *       }
 *     }
 *     list virtual-link-to-level-mapping {
 *       key virtual-link-profile-id;
 *       leaf virtual-link-profile-id {
 *         type leafref {
 *           path ../../../virtual-link-profile/id;
 *         }
 *       }
 *       uses link-bitrate-requirements;
 *     }
 *     list ns-to-level-mapping {
 *       key ns-profile-id;
 *       leaf ns-profile-id {
 *         type leafref {
 *           path ../../../ns-profile/id;
 *         }
 *       }
 *       leaf number-of-instances {
 *         default 1;
 *         type uint32;
 *       }
 *     }
 *     must "(count(vnf-to-level-mapping) + count(virtual-link-to-level-mapping) + count(ns-to-level-mapping)) &gt; 0" {
 *       error-message
 *         "At least one attribute between vnf-to-level-mapping, virtual-link-to-level-mapping and ns-to-level-mapping shall be present.";
 *     }
 *   }
 *   leaf default-instantiation-level {
 *     type leafref {
 *       path ../ns-instantiation-level/id;
 *     }
 *   }
 *   list ns-profile {
 *     must "min-number-of-instances &lt;= max-number-of-instances" {
 *       error-message
 *         "min-number-of-instances has to be less than or equalmax-number-of-instances.";
 *     }
 *     must boolean(../../nested-nsd-id[.=current()/nsd-id]) {
 *       error-message
 *         "PNFDs in the profile has to be listed as a dependency of the network service descriptor.";
 *     }
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf nsd-id {
 *       type leafref {
 *         path ../../../../nsd/id;
 *       }
 *     }
 *     leaf ns-df-id {
 *       type leafref {
 *         path deref(../nsd-id)/../df/id;
 *       }
 *     }
 *     leaf instantiation-level-id {
 *       type leafref {
 *         path deref(../ns-df-id)/../ns-instantiation-level/id;
 *       }
 *     }
 *     leaf min-number-of-instances {
 *       type uint16;
 *       default 1;
 *     }
 *     leaf max-number-of-instances {
 *       type uint16;
 *       default 1;
 *     }
 *     list affinity-or-anti-affinity-group-id {
 *       key id;
 *       leaf id {
 *         type leafref {
 *           path ../../../affinity-or-anti-affinity-group/id;
 *         }
 *       }
 *     }
 *     list virtual-link-connectivity {
 *       key virtual-link-profile-id;
 *       leaf virtual-link-profile-id {
 *         type leafref {
 *           path ../../../virtual-link-profile/id;
 *         }
 *       }
 *       list constituent-cpd-id {
 *         key constituent-base-element-id;
 *         leaf constituent-base-element-id {
 *           type leafref {
 *             path ../../../id;
 *           }
 *         }
 *         leaf constituent-cpd-id {
 *           type leafref {
 *             path deref(../../../nsd-id)/../sapd/id;
 *           }
 *         }
 *       }
 *     }
 *   }
 *   list dependencies {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     choice primary-id {
 *       case primary-vnf-profile {
 *         leaf primary-vnf-profile {
 *           type leafref {
 *             path ../../vnf-profile/vnfd-id;
 *           }
 *         }
 *       }
 *       case primary-ns-profile {
 *         leaf primary-ns-profile {
 *           type leafref {
 *             path ../../ns-profile/nsd-id;
 *           }
 *         }
 *       }
 *     }
 *     choice secondary-id {
 *       case secondary-vnf-profile {
 *         leaf secondary-vnf-profile {
 *           type leafref {
 *             path ../../vnf-profile/vnfd-id;
 *           }
 *         }
 *       }
 *       case secondary-ns-profile {
 *         leaf secondary-ns-profile {
 *           type leafref {
 *             path ../../ns-profile/nsd-id;
 *           }
 *         }
 *       }
 *     }
 *   }
 *   list monitored-info {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     container vnf-indicator-info {
 *       leaf vnfd-id {
 *         type leafref {
 *           path ../../../../../vnfd/id;
 *         }
 *       }
 *       leaf vnf-indicator {
 *         type leafref {
 *           path deref(../vnfd-id)/../indicator/id;
 *         }
 *       }
 *     }
 *     container monitoring-parameter {
 *       leaf id {
 *         type string;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       leaf performance-metric {
 *         type string;
 *       }
 *       leaf collection-period {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df</i>
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
    ChildOf<Nsd>,
    Augmentable<Df>,
    Identifiable<DfKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("df");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df.class;
    }
    
    /**
     * Identifies this NsDf information element. It identifies a NS DF within the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Assurance parameter against which this flavour is being described. The key can
     * be a combination of multiple assurance parameters with a logical relationship
     * between them. The parameters should be present as a monitoredInfo attribute in
     * the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>flavourKey</code>, or <code>null</code> if not present
     */
    @Nullable String getFlavourKey();
    
    /**
     * VNF profile to be used for the NS flavour.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfProfile</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfProfileKey, VnfProfile> getVnfProfile();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfProfile</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfProfileKey, VnfProfile> nonnullVnfProfile() {
        return CodeHelpers.nonnull(getVnfProfile());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>pnfProfile</code>, or <code>null</code> if not present
     */
    @Nullable Map<PnfProfileKey, PnfProfile> getPnfProfile();
    
    /**
     * @return <code>java.util.Map</code> <code>pnfProfile</code>, or an empty list if it is not present
     */
    default @NonNull Map<PnfProfileKey, PnfProfile> nonnullPnfProfile() {
        return CodeHelpers.nonnull(getPnfProfile());
    }
    
    /**
     * VL profile to be used for the NS flavour.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>virtualLinkProfile</code>, or <code>null</code> if not present
     */
    @Nullable Map<VirtualLinkProfileKey, VirtualLinkProfile> getVirtualLinkProfile();
    
    /**
     * @return <code>java.util.Map</code> <code>virtualLinkProfile</code>, or an empty list if it is not present
     */
    default @NonNull Map<VirtualLinkProfileKey, VirtualLinkProfile> nonnullVirtualLinkProfile() {
        return CodeHelpers.nonnull(getVirtualLinkProfile());
    }
    
    /**
     * The scaling aspects supported by this DF of the NS.
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
    
    /**
     * Specifies affinity or anti-affinity relationship applicable between the VNF
     * instances created using different VNFDs, the Virtual Link instances created
     * using different NsVirtualLinkDescs or the nested NS instances created using
     * different NSDs in the same affinity or anti-affinity group.
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
     * Describes the details of an NS level.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>nsInstantiationLevel</code>, or <code>null</code> if not present
     */
    @Nullable Map<NsInstantiationLevelKey, NsInstantiationLevel> getNsInstantiationLevel();
    
    /**
     * @return <code>java.util.Map</code> <code>nsInstantiationLevel</code>, or an empty list if it is not present
     */
    default @NonNull Map<NsInstantiationLevelKey, NsInstantiationLevel> nonnullNsInstantiationLevel() {
        return CodeHelpers.nonnull(getNsInstantiationLevel());
    }
    
    /**
     * Identifies the NS level which represents the default NS instantiation level for
     * this DF. It shall be present if there are multiple 'nsIinstantiationLevel'
     * entries.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>defaultInstantiationLevel</code>, or <code>null</code> if not present
     */
    @Nullable String getDefaultInstantiationLevel();
    
    /**
     * Specifies a NS Profile supported by this NS DF.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>nsProfile</code>, or <code>null</code> if not present
     */
    @Nullable Map<NsProfileKey, NsProfile> getNsProfile();
    
    /**
     * @return <code>java.util.Map</code> <code>nsProfile</code>, or an empty list if it is not present
     */
    default @NonNull Map<NsProfileKey, NsProfile> nonnullNsProfile() {
        return CodeHelpers.nonnull(getNsProfile());
    }
    
    /**
     * Specifies the order in which instances of the VNFs and/or nested NSs have to be
     * created.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>dependencies</code>, or <code>null</code> if not present
     */
    @Nullable Map<DependenciesKey, Dependencies> getDependencies();
    
    /**
     * @return <code>java.util.Map</code> <code>dependencies</code>, or an empty list if it is not present
     */
    default @NonNull Map<DependenciesKey, Dependencies> nonnullDependencies() {
        return CodeHelpers.nonnull(getDependencies());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>monitoredInfo</code>, or <code>null</code> if not present
     */
    @Nullable Map<MonitoredInfoKey, MonitoredInfo> getMonitoredInfo();
    
    /**
     * @return <code>java.util.Map</code> <code>monitoredInfo</code>, or an empty list if it is not present
     */
    default @NonNull Map<MonitoredInfoKey, MonitoredInfo> nonnullMonitoredInfo() {
        return CodeHelpers.nonnull(getMonitoredInfo());
    }
    
    @Override
    DfKey key();

}

