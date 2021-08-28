package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.NsdBuilder.NsdImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.VnfdBuilder.VnfdImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.DfKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.LifecycleManagementScript;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.LifecycleManagementScriptKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Sapd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.SapdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.VirtualLinkDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.VirtualLinkDescKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Vnffgd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.VnffgdKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * grouping nsd {
 *   leaf id {
 *     type string;
 *   }
 *   leaf designer {
 *     type string;
 *   }
 *   leaf version {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf invariant-id {
 *     type string;
 *   }
 *   leaf-list nested-nsd-id {
 *     must ". != ../id";
 *     type leafref {
 *       path ../../nsd/id;
 *     }
 *   }
 *   leaf-list vnfd-id {
 *     type leafref {
 *       path ../../vnfd/id;
 *     }
 *   }
 *   leaf-list pnfd-id {
 *     type leafref {
 *       path ../../pnfd/id;
 *     }
 *   }
 *   list sapd {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf address-assignment {
 *       type boolean;
 *     }
 *     choice cpd-or-virtual-link {
 *       case virtual-link-desc {
 *         leaf virtual-link-desc {
 *           type leafref {
 *             path ../../virtual-link-desc/id;
 *           }
 *         }
 *       }
 *       case vnf {
 *         container vnf {
 *           leaf vnfd-id {
 *             type leafref {
 *               path ../../../../vnfd/id;
 *             }
 *             must boolean(../../../vnfd-id[.=current()]);
 *           }
 *           leaf ext-cpd-id {
 *             type leafref {
 *               path deref(../vnfd-id)/../ext-cpd/id;
 *             }
 *           }
 *         }
 *       }
 *       case pnf {
 *         container pnf {
 *           leaf pnfd-id {
 *             type leafref {
 *               path ../../../../pnfd/id;
 *             }
 *             must boolean(../pnfd-id[.=current()]);
 *           }
 *           leaf ext-cpd-id {
 *             type leafref {
 *               path deref(../pnfd-id)/../ext-cpd/id;
 *             }
 *           }
 *         }
 *       }
 *       case ns {
 *         container ns {
 *           leaf nsd-id {
 *             type leafref {
 *               path ../../../../nsd/id;
 *             }
 *             must boolean(../nsd-id[.=current()]);
 *           }
 *           leaf ext-cpd-id {
 *             type leafref {
 *               path deref(../nsd-id)/../sapd/id;
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 *   list virtual-link-desc {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     uses connectivity-type;
 *     list df {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       container qos {
 *         presence "VL QoS parameters";
 *         leaf latency {
 *           type uint32;
 *           units ms;
 *         }
 *         leaf packet-delay-variation {
 *           type uint32;
 *           units ms;
 *         }
 *         leaf packet-loss-ratio {
 *           type decimal64 {
 *             fraction-digits 2;
 *             range 0..1.00;
 *           }
 *         }
 *         leaf priority {
 *           type uint32;
 *         }
 *       }
 *       leaf service-availability-level {
 *         type enumeration {
 *           enum level-1;
 *           enum level-2;
 *           enum level-3;
 *         }
 *       }
 *     }
 *     leaf test-access {
 *       type enumeration {
 *         enum none;
 *         enum passive-monitoring;
 *         enum active;
 *       }
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     uses security-parameters;
 *   }
 *   list vnffgd {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf-list vnf-profile-id {
 *       type leafref {
 *         path ../../df/vnf-profile/id;
 *       }
 *     }
 *     leaf-list pnf-profile-id {
 *       type leafref {
 *         path ../../df/pnf-profile/id;
 *       }
 *     }
 *     leaf-list nested-ns-profile-id {
 *       type leafref {
 *         path ../../df/ns-profile/id;
 *       }
 *     }
 *     leaf virtual-link-profile-id {
 *       type leafref {
 *         path ../../df/virtual-link-profile/id;
 *       }
 *     }
 *     list cpd-pool {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       choice constituent-base-element-id {
 *         case vnf-profile {
 *           container vnf-profile {
 *             leaf vnf-profile-id {
 *               type leafref {
 *                 path ../../../../../nsd/df/vnf-profile/id;
 *               }
 *             }
 *           }
 *         }
 *         case pnf-profile {
 *           container pnf-profile {
 *             leaf pnf-profile-id {
 *               type leafref {
 *                 path ../../../../../nsd/df/pnf-profile/id;
 *               }
 *             }
 *           }
 *         }
 *         case ns-profile {
 *           container ns-profile {
 *             leaf ns-profile-id {
 *               type leafref {
 *                 path ../../../../../nsd/df/ns-profile/id;
 *               }
 *             }
 *           }
 *         }
 *       }
 *       choice constituent-cpd-id {
 *         case vnf {
 *           container vnf {
 *             leaf vnfd-id {
 *               type leafref {
 *                 path ../../../../../vnfd/id;
 *               }
 *             }
 *             leaf cpd-id {
 *               type leafref {
 *                 path deref(../vnfd-id)/../ext-cpd/id;
 *               }
 *             }
 *           }
 *         }
 *         case pnf {
 *           container pnf {
 *             leaf pnfd-id {
 *               type leafref {
 *                 path ../../../../../pnfd/id;
 *               }
 *             }
 *             leaf pnf-cpd-id {
 *               type leafref {
 *                 path deref(../pnfd-id)/../ext-cpd/id;
 *               }
 *             }
 *           }
 *         }
 *         case ns {
 *           container ns {
 *             leaf nsd-id {
 *               type leafref {
 *                 path ../../../../../nsd/id;
 *               }
 *             }
 *             leaf sap-cpd-id {
 *               type leafref {
 *                 path deref(../nsd-id)/../sapd/id;
 *               }
 *             }
 *           }
 *         }
 *       }
 *     }
 *     list nfpd {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf rule {
 *         type string;
 *       }
 *       list position-desc-id {
 *         key id;
 *         leaf id {
 *           type string;
 *         }
 *         list cp-profile-id {
 *           key id;
 *           leaf id {
 *             type string;
 *           }
 *           list constituent-profile-elements {
 *             key id;
 *             leaf id {
 *               type string;
 *             }
 *             leaf cpd-id {
 *               type string;
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 *   leaf-list autoscale-rule {
 *     type string;
 *   }
 *   list lifecycle-management-script {
 *     key event;
 *     leaf event {
 *       type string;
 *     }
 *     leaf script {
 *       type string;
 *     }
 *   }
 *   list df {
 *     min-elements 1;
 *     must "default-instantiation-level or count(ns-instantiation-level) = 1" {
 *       error-message
 *         "default-instantiation-level must be present if there multiple instantion-level";
 *     }
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf flavour-key {
 *       type leafref {
 *         path ../monitored-info/id;
 *       }
 *     }
 *     list vnf-profile {
 *       must "min-number-of-instances &lt;= max-number-of-instances";
 *       must boolean(../../vnfd-id[.=current()/vnfd-id]) {
 *         error-message
 *           "VNFDs in the profile has to be listed as a dependency of the network service descriptor.";
 *       }
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf vnfd-id {
 *         type leafref {
 *           path ../../../../vnfd/id;
 *         }
 *       }
 *       leaf flavour-id {
 *         type leafref {
 *           path deref(../vnfd-id)/../df/id;
 *         }
 *       }
 *       leaf instantiation-level {
 *         type leafref {
 *           path deref(../flavour-id)/../instantiation-level/id;
 *         }
 *       }
 *       leaf min-number-of-instances {
 *         default 1;
 *         type uint16;
 *       }
 *       leaf max-number-of-instances {
 *         default 1;
 *         type uint16;
 *       }
 *       uses local-affinity-or-anti-affinity-rule;
 *       list affinity-or-anti-affinity-group {
 *         key id;
 *         leaf id {
 *           type leafref {
 *             path ../../../affinity-or-anti-affinity-group/id;
 *           }
 *         }
 *       }
 *       list virtual-link-connectivity {
 *         key virtual-link-profile-id;
 *         leaf virtual-link-profile-id {
 *           type leafref {
 *             path ../../../virtual-link-profile/id;
 *           }
 *         }
 *         list constituent-cpd-id {
 *           key constituent-base-element-id;
 *           leaf constituent-base-element-id {
 *             type leafref {
 *               path ../../../id;
 *             }
 *           }
 *           leaf constituent-cpd-id {
 *             type leafref {
 *               path deref(../../../vnfd-id)/../ext-cpd/id;
 *             }
 *           }
 *         }
 *       }
 *     }
 *     list pnf-profile {
 *       key id;
 *       must boolean(../../pnfd-id[.=current()/pnfd-id]) {
 *         error-message
 *           "PNFDs in the profile has to be listed as a dependency of the network service descriptor.";
 *       }
 *       leaf id {
 *         type string;
 *       }
 *       leaf pnfd-id {
 *         type leafref {
 *           path ../../../../pnfd/id;
 *         }
 *       }
 *       list virtual-link-connectivity {
 *         key virtual-link-profile-id;
 *         leaf virtual-link-profile-id {
 *           type leafref {
 *             path ../../../virtual-link-profile/id;
 *           }
 *         }
 *         list constituent-cpd-id {
 *           key constituent-base-element-id;
 *           leaf constituent-base-element-id {
 *             type leafref {
 *               path ../../../id;
 *             }
 *           }
 *           leaf constituent-cpd-id {
 *             type leafref {
 *               path deref(../../../pnfd-id)/../ext-cpd/id;
 *             }
 *           }
 *         }
 *       }
 *     }
 *     list virtual-link-profile {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf virtual-link-desc-id {
 *         type leafref {
 *           path ../../../virtual-link-desc/id;
 *         }
 *       }
 *       leaf flavour-id {
 *         type leafref {
 *           path deref(../virtual-link-desc-id)/../df/id;
 *         }
 *       }
 *       uses local-affinity-or-anti-affinity-rule;
 *       list affinity-or-anti-affinity-group {
 *         key id;
 *         leaf id {
 *           type leafref {
 *             path ../../../affinity-or-anti-affinity-group/id;
 *           }
 *         }
 *       }
 *       container max-bitrate-requirements {
 *         uses link-bitrate-requirements;
 *       }
 *       container min-bitrate-requirements {
 *         uses link-bitrate-requirements;
 *       }
 *     }
 *     list scaling-aspect {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       leaf description {
 *         type string;
 *       }
 *       leaf scaling-level {
 *         type leafref {
 *           path ../../ns-instantiation-level/id;
 *         }
 *       }
 *     }
 *     list affinity-or-anti-affinity-group {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf type {
 *         type affinity-type;
 *       }
 *       leaf scope {
 *         type affinity-scope;
 *       }
 *     }
 *     list ns-instantiation-level {
 *       min-elements 1;
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf description {
 *         type string;
 *       }
 *       list vnf-to-level-mapping {
 *         key vnf-profile-id;
 *         leaf vnf-profile-id {
 *           type leafref {
 *             path ../../../vnf-profile/id;
 *           }
 *         }
 *         leaf number-of-instances {
 *           default 1;
 *           type uint32;
 *         }
 *       }
 *       list virtual-link-to-level-mapping {
 *         key virtual-link-profile-id;
 *         leaf virtual-link-profile-id {
 *           type leafref {
 *             path ../../../virtual-link-profile/id;
 *           }
 *         }
 *         uses link-bitrate-requirements;
 *       }
 *       list ns-to-level-mapping {
 *         key ns-profile-id;
 *         leaf ns-profile-id {
 *           type leafref {
 *             path ../../../ns-profile/id;
 *           }
 *         }
 *         leaf number-of-instances {
 *           default 1;
 *           type uint32;
 *         }
 *       }
 *       must "(count(vnf-to-level-mapping) + count(virtual-link-to-level-mapping) + count(ns-to-level-mapping)) &gt; 0" {
 *         error-message
 *           "At least one attribute between vnf-to-level-mapping, virtual-link-to-level-mapping and ns-to-level-mapping shall be present.";
 *       }
 *     }
 *     leaf default-instantiation-level {
 *       type leafref {
 *         path ../ns-instantiation-level/id;
 *       }
 *     }
 *     list ns-profile {
 *       must "min-number-of-instances &lt;= max-number-of-instances" {
 *         error-message
 *           "min-number-of-instances has to be less than or equalmax-number-of-instances.";
 *       }
 *       must boolean(../../nested-nsd-id[.=current()/nsd-id]) {
 *         error-message
 *           "PNFDs in the profile has to be listed as a dependency of the network service descriptor.";
 *       }
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf nsd-id {
 *         type leafref {
 *           path ../../../../nsd/id;
 *         }
 *       }
 *       leaf ns-df-id {
 *         type leafref {
 *           path deref(../nsd-id)/../df/id;
 *         }
 *       }
 *       leaf instantiation-level-id {
 *         type leafref {
 *           path deref(../ns-df-id)/../ns-instantiation-level/id;
 *         }
 *       }
 *       leaf min-number-of-instances {
 *         type uint16;
 *         default 1;
 *       }
 *       leaf max-number-of-instances {
 *         type uint16;
 *         default 1;
 *       }
 *       list affinity-or-anti-affinity-group-id {
 *         key id;
 *         leaf id {
 *           type leafref {
 *             path ../../../affinity-or-anti-affinity-group/id;
 *           }
 *         }
 *       }
 *       list virtual-link-connectivity {
 *         key virtual-link-profile-id;
 *         leaf virtual-link-profile-id {
 *           type leafref {
 *             path ../../../virtual-link-profile/id;
 *           }
 *         }
 *         list constituent-cpd-id {
 *           key constituent-base-element-id;
 *           leaf constituent-base-element-id {
 *             type leafref {
 *               path ../../../id;
 *             }
 *           }
 *           leaf constituent-cpd-id {
 *             type leafref {
 *               path deref(../../../nsd-id)/../sapd/id;
 *             }
 *           }
 *         }
 *       }
 *     }
 *     list dependencies {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       choice primary-id {
 *         case primary-vnf-profile {
 *           leaf primary-vnf-profile {
 *             type leafref {
 *               path ../../vnf-profile/vnfd-id;
 *             }
 *           }
 *         }
 *         case primary-ns-profile {
 *           leaf primary-ns-profile {
 *             type leafref {
 *               path ../../ns-profile/nsd-id;
 *             }
 *           }
 *         }
 *       }
 *       choice secondary-id {
 *         case secondary-vnf-profile {
 *           leaf secondary-vnf-profile {
 *             type leafref {
 *               path ../../vnf-profile/vnfd-id;
 *             }
 *           }
 *         }
 *         case secondary-ns-profile {
 *           leaf secondary-ns-profile {
 *             type leafref {
 *               path ../../ns-profile/nsd-id;
 *             }
 *           }
 *         }
 *       }
 *     }
 *     list monitored-info {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       container vnf-indicator-info {
 *         leaf vnfd-id {
 *           type leafref {
 *             path ../../../../../vnfd/id;
 *           }
 *         }
 *         leaf vnf-indicator {
 *           type leafref {
 *             path deref(../vnfd-id)/../indicator/id;
 *           }
 *         }
 *       }
 *       container monitoring-parameter {
 *         leaf id {
 *           type string;
 *         }
 *         leaf name {
 *           type string;
 *         }
 *         leaf performance-metric {
 *           type string;
 *         }
 *         leaf collection-period {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 *   uses security-parameters;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd</i>
 *
 */
@JsonDeserialize(as = NsdImpl.class)
@JsonIgnoreProperties(value= {"virtualStorageDesc","extCpd","securityGroupRule","indicator","swImageDesc"}, ignoreUnknown = true)
public interface Nsd
    extends
    DataObject,
    SecurityParameters
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd");

    @Override
    Class<? extends Nsd> implementedInterface();
    
    /**
     * Identifier of this NSD information element. It Globally uniquely identifies an
     * instance of the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Identifies the designer of the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>designer</code>, or <code>null</code> if not present
     */
    @Nullable String getDesigner();
    
    /**
     * Identifies the version of the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    @Nullable String getVersion();
    
    /**
     * Provides the human readable name of the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Identifies an NSD in a version independent manner. This attribute is invariant
     * across versions of the network service descriptor.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>invariantId</code>, or <code>null</code> if not present
     */
    @Nullable String getInvariantId();
    
    /**
     * References the NSD of a constituent nested NS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>nestedNsdId</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getNestedNsdId();
    
    /**
     * References the VNFD of a constituent VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdId</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getVnfdId();
    
    /**
     * References the PNFD of a constituent PNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pnfdId</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getPnfdId();
    
    /**
     * Provides the descriptor of a service access point of the network service.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>sapd</code>, or <code>null</code> if not present
     */
    @Nullable Map<SapdKey, Sapd> getSapd();
    
    /**
     * @return <code>java.util.Map</code> <code>sapd</code>, or an empty list if it is not present
     */
    default @NonNull Map<SapdKey, Sapd> nonnullSapd() {
        return CodeHelpers.nonnull(getSapd());
    }
    
    /**
     * Provides the constituent VLDs.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>virtualLinkDesc</code>, or <code>null</code> if not present
     */
    @Nullable Map<VirtualLinkDescKey, VirtualLinkDesc> getVirtualLinkDesc();
    
    /**
     * @return <code>java.util.Map</code> <code>virtualLinkDesc</code>, or an empty list if it is not present
     */
    default @NonNull Map<VirtualLinkDescKey, VirtualLinkDesc> nonnullVirtualLinkDesc() {
        return CodeHelpers.nonnull(getVirtualLinkDesc());
    }
    
    /**
     * Provides the descriptors of the applicable forwarding graphs.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnffgd</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnffgdKey, Vnffgd> getVnffgd();
    
    /**
     * @return <code>java.util.Map</code> <code>vnffgd</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnffgdKey, Vnffgd> nonnullVnffgd() {
        return CodeHelpers.nonnull(getVnffgd());
    }
    
    /**
     * @return <code>java.util.List</code> <code>autoscaleRule</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getAutoscaleRule();
    
    /**
     * @return <code>java.util.Map</code> <code>lifecycleManagementScript</code>, or <code>null</code> if not present
     */
    @Nullable Map<LifecycleManagementScriptKey, LifecycleManagementScript> getLifecycleManagementScript();
    
    /**
     * @return <code>java.util.Map</code> <code>lifecycleManagementScript</code>, or an empty list if it is not present
     */
    default @NonNull Map<LifecycleManagementScriptKey, LifecycleManagementScript> nonnullLifecycleManagementScript() {
        return CodeHelpers.nonnull(getLifecycleManagementScript());
    }
    
    /**
     * Identifies a DF within the scope of an NSD.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>df</code>, or <code>null</code> if not present
     */
    @Nullable Map<DfKey, Df> getDf();
    
    /**
     * @return <code>java.util.Map</code> <code>df</code>, or an empty list if it is not present
     */
    default @NonNull Map<DfKey, Df> nonnullDf() {
        return CodeHelpers.nonnull(getDf());
    }

}

