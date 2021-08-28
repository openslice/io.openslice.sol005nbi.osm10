package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LocalAffinityOrAntiAffinityRule;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.NsdBuilder.NsdImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VnfProfileBuilder.VnfProfileImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.AffinityOrAntiAffinityGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.AffinityOrAntiAffinityGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.VirtualLinkConnectivity;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.VirtualLinkConnectivityKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint16;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * VNF profile to be used for the NS flavour.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list vnf-profile {
 *   must "min-number-of-instances &lt;= max-number-of-instances";
 *   must boolean(../../vnfd-id[.=current()/vnfd-id]) {
 *     error-message
 *       "VNFDs in the profile has to be listed as a dependency of the network service descriptor.";
 *   }
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf vnfd-id {
 *     type leafref {
 *       path ../../../../vnfd/id;
 *     }
 *   }
 *   leaf flavour-id {
 *     type leafref {
 *       path deref(../vnfd-id)/../df/id;
 *     }
 *   }
 *   leaf instantiation-level {
 *     type leafref {
 *       path deref(../flavour-id)/../instantiation-level/id;
 *     }
 *   }
 *   leaf min-number-of-instances {
 *     default 1;
 *     type uint16;
 *   }
 *   leaf max-number-of-instances {
 *     default 1;
 *     type uint16;
 *   }
 *   uses local-affinity-or-anti-affinity-rule;
 *   list affinity-or-anti-affinity-group {
 *     key id;
 *     leaf id {
 *       type leafref {
 *         path ../../../affinity-or-anti-affinity-group/id;
 *       }
 *     }
 *   }
 *   list virtual-link-connectivity {
 *     key virtual-link-profile-id;
 *     leaf virtual-link-profile-id {
 *       type leafref {
 *         path ../../../virtual-link-profile/id;
 *       }
 *     }
 *     list constituent-cpd-id {
 *       key constituent-base-element-id;
 *       leaf constituent-base-element-id {
 *         type leafref {
 *           path ../../../id;
 *         }
 *       }
 *       leaf constituent-cpd-id {
 *         type leafref {
 *           path deref(../../../vnfd-id)/../ext-cpd/id;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/vnf-profile</i>
 * 
 * <p>To create instances of this class use {@link VnfProfileBuilder}.
 * @see VnfProfileBuilder
 * @see VnfProfileKey
 *
 */
@JsonDeserialize(as = VnfProfileImpl.class)
@JsonIgnoreProperties(value = {"localAffinityOrAntiAffinityRule"}, ignoreUnknown = true)
//@JsonIgnoreProperties(value= {"virtualStorageDesc","extCpd","securityGroupRule","indicator","swImageDesc"}, ignoreUnknown = true)
public interface VnfProfile
    extends
    ChildOf<Df>,
    Augmentable<VnfProfile>,
    LocalAffinityOrAntiAffinityRule,
    Identifiable<VnfProfileKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-profile");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VnfProfile> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VnfProfile.class;
    }
    
    /**
     * Identifier of this vnfProfile information element. It uniquely identifies a
     * VnfProfile.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * References a VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdId</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfdId();
    
    /**
     * Identifies a flavour within the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>flavourId</code>, or <code>null</code> if not present
     */
    @Nullable String getFlavourId();
    
    /**
     * Identifier of the instantiation level of the VNF DF to be used for
     * instantiation. If not present, the default instantiation level as declared in
     * the VNFD shall be used.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>instantiationLevel</code>, or <code>null</code> if not present
     */
    @Nullable String getInstantiationLevel();
    
    /**
     * Minimum number of instances of the VNF based on this VNFD that is permitted to
     * exist for this VnfProfile.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>minNumberOfInstances</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getMinNumberOfInstances();
    
    /**
     * Maximum number of instances of the VNF based on this VNFD that is permitted to
     * exist for this VnfProfile.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>maxNumberOfInstances</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getMaxNumberOfInstances();
    
    /**
     * Identifier(s) of the affinity or anti-affinity group(s) the VnfProfile belongs
     * to.
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
     * Defines the connection information of the VNF, it contains connection
     * relationship between a VNF connection point and a NS Virtual Link.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>virtualLinkConnectivity</code>, or <code>null</code> if not present
     */
    @Nullable Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> getVirtualLinkConnectivity();
    
    /**
     * @return <code>java.util.Map</code> <code>virtualLinkConnectivity</code>, or an empty list if it is not present
     */
    default @NonNull Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> nonnullVirtualLinkConnectivity() {
        return CodeHelpers.nonnull(getVirtualLinkConnectivity());
    }
    
    @Override
    VnfProfileKey key();

}

