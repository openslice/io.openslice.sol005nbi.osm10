package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LinkBitrateRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsInstantiationLevel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Specifies the profile of the VLs involved in this NS level and, for each of 
 * them, the needed bandwidth.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list virtual-link-to-level-mapping {
 *   key virtual-link-profile-id;
 *   leaf virtual-link-profile-id {
 *     type leafref {
 *       path ../../../virtual-link-profile/id;
 *     }
 *   }
 *   uses link-bitrate-requirements;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/ns-instantiation-level/virtual-link-to-level-mapping</i>
 * 
 * <p>To create instances of this class use {@link VirtualLinkToLevelMappingBuilder}.
 * @see VirtualLinkToLevelMappingBuilder
 * @see VirtualLinkToLevelMappingKey
 *
 */
public interface VirtualLinkToLevelMapping
    extends
    ChildOf<NsInstantiationLevel>,
    Augmentable<VirtualLinkToLevelMapping>,
    LinkBitrateRequirements,
    Identifiable<VirtualLinkToLevelMappingKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-link-to-level-mapping");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.VirtualLinkToLevelMapping> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.VirtualLinkToLevelMapping.class;
    }
    
    /**
     * Identifies the profile to be used for a VL involved in an NS level.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>virtualLinkProfileId</code>, or <code>null</code> if not present
     */
    @Nullable String getVirtualLinkProfileId();
    
    @Override
    VirtualLinkToLevelMappingKey key();

}

