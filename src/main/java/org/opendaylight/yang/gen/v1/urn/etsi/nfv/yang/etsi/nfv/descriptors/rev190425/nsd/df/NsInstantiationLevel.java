package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.NsToLevelMapping;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.NsToLevelMappingKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.VirtualLinkToLevelMapping;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.VirtualLinkToLevelMappingKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.VnfToLevelMapping;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.VnfToLevelMappingKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes the details of an NS level.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list ns-instantiation-level {
 *   min-elements 1;
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   list vnf-to-level-mapping {
 *     key vnf-profile-id;
 *     leaf vnf-profile-id {
 *       type leafref {
 *         path ../../../vnf-profile/id;
 *       }
 *     }
 *     leaf number-of-instances {
 *       default 1;
 *       type uint32;
 *     }
 *   }
 *   list virtual-link-to-level-mapping {
 *     key virtual-link-profile-id;
 *     leaf virtual-link-profile-id {
 *       type leafref {
 *         path ../../../virtual-link-profile/id;
 *       }
 *     }
 *     uses link-bitrate-requirements;
 *   }
 *   list ns-to-level-mapping {
 *     key ns-profile-id;
 *     leaf ns-profile-id {
 *       type leafref {
 *         path ../../../ns-profile/id;
 *       }
 *     }
 *     leaf number-of-instances {
 *       default 1;
 *       type uint32;
 *     }
 *   }
 *   must "(count(vnf-to-level-mapping) + count(virtual-link-to-level-mapping) + count(ns-to-level-mapping)) &gt; 0" {
 *     error-message
 *       "At least one attribute between vnf-to-level-mapping, virtual-link-to-level-mapping and ns-to-level-mapping shall be present.";
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/ns-instantiation-level</i>
 * 
 * <p>To create instances of this class use {@link NsInstantiationLevelBuilder}.
 * @see NsInstantiationLevelBuilder
 * @see NsInstantiationLevelKey
 *
 */
public interface NsInstantiationLevel
    extends
    ChildOf<Df>,
    Augmentable<NsInstantiationLevel>,
    Identifiable<NsInstantiationLevelKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ns-instantiation-level");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsInstantiationLevel> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsInstantiationLevel.class;
    }
    
    /**
     * Identifier of this NsLevel information element. It uniquely identifies an NS
     * level within the DF.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Human readable description of the NS level.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * Specifies the profile of the VNFs involved in this NS level and, for each of
     * them, the required number of instances.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfToLevelMapping</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfToLevelMappingKey, VnfToLevelMapping> getVnfToLevelMapping();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfToLevelMapping</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfToLevelMappingKey, VnfToLevelMapping> nonnullVnfToLevelMapping() {
        return CodeHelpers.nonnull(getVnfToLevelMapping());
    }
    
    /**
     * Specifies the profile of the VLs involved in this NS level and, for each of
     * them, the needed bandwidth.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>virtualLinkToLevelMapping</code>, or <code>null</code> if not present
     */
    @Nullable Map<VirtualLinkToLevelMappingKey, VirtualLinkToLevelMapping> getVirtualLinkToLevelMapping();
    
    /**
     * @return <code>java.util.Map</code> <code>virtualLinkToLevelMapping</code>, or an empty list if it is not present
     */
    default @NonNull Map<VirtualLinkToLevelMappingKey, VirtualLinkToLevelMapping> nonnullVirtualLinkToLevelMapping() {
        return CodeHelpers.nonnull(getVirtualLinkToLevelMapping());
    }
    
    /**
     * Specifies the profile of the nested NSs involved in this NS level and, for each
     * of them, the required number of instances.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>nsToLevelMapping</code>, or <code>null</code> if not present
     */
    @Nullable Map<NsToLevelMappingKey, NsToLevelMapping> getNsToLevelMapping();
    
    /**
     * @return <code>java.util.Map</code> <code>nsToLevelMapping</code>, or an empty list if it is not present
     */
    default @NonNull Map<NsToLevelMappingKey, NsToLevelMapping> nonnullNsToLevelMapping() {
        return CodeHelpers.nonnull(getNsToLevelMapping());
    }
    
    @Override
    NsInstantiationLevelKey key();

}

