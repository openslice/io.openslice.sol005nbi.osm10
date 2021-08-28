package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LocalAffinityOrAntiAffinityRule;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.AffinityOrAntiAffinityGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.AffinityOrAntiAffinityGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.MaxBitrateRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.MinBitrateRequirements;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * VL profile to be used for the NS flavour.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list virtual-link-profile {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf virtual-link-desc-id {
 *     type leafref {
 *       path ../../../virtual-link-desc/id;
 *     }
 *   }
 *   leaf flavour-id {
 *     type leafref {
 *       path deref(../virtual-link-desc-id)/../df/id;
 *     }
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
 *   container max-bitrate-requirements {
 *     uses link-bitrate-requirements;
 *   }
 *   container min-bitrate-requirements {
 *     uses link-bitrate-requirements;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/virtual-link-profile</i>
 * 
 * <p>To create instances of this class use {@link VirtualLinkProfileBuilder}.
 * @see VirtualLinkProfileBuilder
 * @see VirtualLinkProfileKey
 *
 */
public interface VirtualLinkProfile
    extends
    ChildOf<Df>,
    Augmentable<VirtualLinkProfile>,
    LocalAffinityOrAntiAffinityRule,
    Identifiable<VirtualLinkProfileKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-link-profile");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VirtualLinkProfile> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VirtualLinkProfile.class;
    }
    
    /**
     * Uniquely identifies this VirtualLinkProfile information element.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Uniquely references a VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>virtualLinkDescId</code>, or <code>null</code> if not present
     */
    @Nullable String getVirtualLinkDescId();
    
    /**
     * Identifies a flavour within the VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>flavourId</code>, or <code>null</code> if not present
     */
    @Nullable String getFlavourId();
    
    /**
     * Identifies an affinity or anti-affinity group the VLs instantiated according to
     * the VlProfile belong to.
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
     * Specifies the maximum bitrate requirements for a VL instantiated according to
     * this profile.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.MaxBitrateRequirements</code> <code>maxBitrateRequirements</code>, or <code>null</code> if not present
     */
    @Nullable MaxBitrateRequirements getMaxBitrateRequirements();
    
    /**
     * Specifies the minimum bitrate requirements for a VL instantiated according to
     * this profile.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.MinBitrateRequirements</code> <code>minBitrateRequirements</code>, or <code>null</code> if not present
     */
    @Nullable MinBitrateRequirements getMinBitrateRequirements();
    
    @Override
    VirtualLinkProfileKey key();

}

