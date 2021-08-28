package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LocalAffinityOrAntiAffinityRule;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VduBuilder.VduImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VirtualLinkProfileBuilder.VirtualLinkProfileImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.AffinityOrAntiAffinityGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.AffinityOrAntiAffinityGroupKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.MaxBitRateRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.MinBitRateRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.VirtualLinkProtocolData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Defines the internal VLD along with additional data which is used in this DF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list virtual-link-profile {
 *   key "id flavour";
 *   leaf id {
 *     type leafref {
 *       path ../../../int-virtual-link-desc/id;
 *     }
 *   }
 *   leaf flavour {
 *     type leafref {
 *       path ../../../flavour/id;
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
 *   container max-bit-rate-requirements {
 *     leaf root {
 *       type uint32;
 *     }
 *     leaf leaf {
 *       type uint32;
 *     }
 *   }
 *   container min-bit-rate-requirements {
 *     leaf root {
 *       type uint32;
 *     }
 *     leaf leaf {
 *       type uint32;
 *     }
 *   }
 *   container virtual-link-protocol-data {
 *     leaf associated-layer-protocol {
 *       type identityref {
 *         base layer-protocol;
 *       }
 *     }
 *     container l2-protocol-data {
 *       when "(../associated-layer-protocol = 'Ethernet') or (../associated-layer-protocol = 'MPLS') or (../associated-layer-protocol = 'ODU2') or (../associated-layer-protocol = 'Pseudo-Wire')";
 *       leaf name {
 *         type string;
 *       }
 *       leaf network-type {
 *         type enumeration {
 *           enum flat;
 *           enum vlan;
 *           enum vxlan;
 *           enum gre;
 *         }
 *       }
 *       leaf vlan-transparent {
 *         type boolean;
 *       }
 *       leaf mtu {
 *         type uint16;
 *       }
 *     }
 *     container l3-protocol-data {
 *       when "(../associated-layer-protocol = 'IPv4') or (../associated-layer-protocol = 'IPv6')";
 *       leaf name {
 *         type string;
 *       }
 *       leaf ip-version {
 *         type enumeration {
 *           enum ipv4;
 *           enum ipv6;
 *         }
 *         default ipv4;
 *       }
 *       leaf cidr {
 *         type string;
 *       }
 *       leaf-list ip-allocation-pools {
 *         type string;
 *       }
 *       leaf gateway-ip {
 *         type inet:ip-address;
 *       }
 *       leaf dhcp-enabled {
 *         type boolean;
 *         default true;
 *       }
 *       leaf ipv6-address-mode {
 *         when "../ip-version = 'ipv6'";
 *         type enumeration {
 *           enum slaac;
 *           enum dhcpv6-stateful;
 *           enum dhcpv6-stateless;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/virtual-link-profile</i>
 * 
 * <p>To create instances of this class use {@link VirtualLinkProfileBuilder}.
 * @see VirtualLinkProfileBuilder
 * @see VirtualLinkProfileKey
 *
 */
@JsonDeserialize(as = VirtualLinkProfileImpl.class)
@JsonIgnoreProperties(value = {"localAffinityOrAntiAffinityRule"}, ignoreUnknown = true)
public interface VirtualLinkProfile
    extends
    ChildOf<Df>,
    Augmentable<VirtualLinkProfile>,
    LocalAffinityOrAntiAffinityRule,
    Identifiable<VirtualLinkProfileKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-link-profile");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VirtualLinkProfile> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VirtualLinkProfile.class;
    }
    
    /**
     * Uniquely identifies a Vnf VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Identifies a flavour within the VnfVirtualLinkDesc.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>flavour</code>, or <code>null</code> if not present
     */
    @Nullable Object getFlavour();
    
    /**
     * Identifier(s) of the affinity or anti-affinity group(s) the VnfVirtualLinkDesc
     * belongs to.
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.MaxBitRateRequirements</code> <code>maxBitRateRequirements</code>, or <code>null</code> if not present
     */
    @Nullable MaxBitRateRequirements getMaxBitRateRequirements();
    
    /**
     * Specifies the minimum bitrate requirements for a VL instantiated according to
     * this profile.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.MinBitRateRequirements</code> <code>minBitRateRequirements</code>, or <code>null</code> if not present
     */
    @Nullable MinBitRateRequirements getMinBitRateRequirements();
    
    /**
     * Specifies the protocol data for a VL instantiated according to this profile.
     * Cardinality 0 is used when no protocol data needs to be specified.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.VirtualLinkProtocolData</code> <code>virtualLinkProtocolData</code>, or <code>null</code> if not present
     */
    @Nullable VirtualLinkProtocolData getVirtualLinkProtocolData();
    
    @Override
    VirtualLinkProfileKey key();

}

