package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.profile.AffinityOrAntiAffinityGroupId;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.profile.AffinityOrAntiAffinityGroupIdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.profile.VirtualLinkConnectivity;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.profile.VirtualLinkConnectivityKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint16;

/**
 * Specifies a NS Profile supported by this NS DF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list ns-profile {
 *   must "min-number-of-instances &lt;= max-number-of-instances" {
 *     error-message
 *       "min-number-of-instances has to be less than or equalmax-number-of-instances.";
 *   }
 *   must boolean(../../nested-nsd-id[.=current()/nsd-id]) {
 *     error-message
 *       "PNFDs in the profile has to be listed as a dependency of the network service descriptor.";
 *   }
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf nsd-id {
 *     type leafref {
 *       path ../../../../nsd/id;
 *     }
 *   }
 *   leaf ns-df-id {
 *     type leafref {
 *       path deref(../nsd-id)/../df/id;
 *     }
 *   }
 *   leaf instantiation-level-id {
 *     type leafref {
 *       path deref(../ns-df-id)/../ns-instantiation-level/id;
 *     }
 *   }
 *   leaf min-number-of-instances {
 *     type uint16;
 *     default 1;
 *   }
 *   leaf max-number-of-instances {
 *     type uint16;
 *     default 1;
 *   }
 *   list affinity-or-anti-affinity-group-id {
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
 *           path deref(../../../nsd-id)/../sapd/id;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/ns-profile</i>
 * 
 * <p>To create instances of this class use {@link NsProfileBuilder}.
 * @see NsProfileBuilder
 * @see NsProfileKey
 *
 */
public interface NsProfile
    extends
    ChildOf<Df>,
    Augmentable<NsProfile>,
    Identifiable<NsProfileKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ns-profile");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsProfile> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsProfile.class;
    }
    
    /**
     * Identifies an NS profile.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Identifies the NSD applicable to NS instantiated according to this profile.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsdId</code>, or <code>null</code> if not present
     */
    @Nullable String getNsdId();
    
    /**
     * Identifies the applicable network service DF within the scope of the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsDfId</code>, or <code>null</code> if not present
     */
    @Nullable String getNsDfId();
    
    /**
     * Identifies the NS level within the referenced NS DF to be used in the context of
     * the parent NS instantiation. If not present, the default NS instantiation level
     * as declared in the referenced NSD shall be used.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>instantiationLevelId</code>, or <code>null</code> if not present
     */
    @Nullable String getInstantiationLevelId();
    
    /**
     * Minimum number of nested NS instances based on the referenced NSD that is
     * permitted to exist for this NsProfile.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>minNumberOfInstances</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getMinNumberOfInstances();
    
    /**
     * Maximum number of nested NS instances based on the referenced NSD that is
     * permitted to exist for this NsProfile.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>maxNumberOfInstances</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getMaxNumberOfInstances();
    
    /**
     * Identifies an affinity or anti-affinity group the NSs created according to this
     * NsProfile belongs to.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>affinityOrAntiAffinityGroupId</code>, or <code>null</code> if not present
     */
    @Nullable Map<AffinityOrAntiAffinityGroupIdKey, AffinityOrAntiAffinityGroupId> getAffinityOrAntiAffinityGroupId();
    
    /**
     * @return <code>java.util.Map</code> <code>affinityOrAntiAffinityGroupId</code>, or an empty list if it is not present
     */
    default @NonNull Map<AffinityOrAntiAffinityGroupIdKey, AffinityOrAntiAffinityGroupId> nonnullAffinityOrAntiAffinityGroupId() {
        return CodeHelpers.nonnull(getAffinityOrAntiAffinityGroupId());
    }
    
    /**
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
    NsProfileKey key();

}

