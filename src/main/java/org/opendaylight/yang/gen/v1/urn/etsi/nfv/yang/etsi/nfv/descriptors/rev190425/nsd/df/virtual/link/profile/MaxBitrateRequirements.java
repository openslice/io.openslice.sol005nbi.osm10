package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LinkBitrateRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VirtualLinkProfile;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Specifies the maximum bitrate requirements for a VL instantiated according to 
 * this profile.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container max-bitrate-requirements {
 *   uses link-bitrate-requirements;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/virtual-link-profile/max-bitrate-requirements</i>
 * 
 * <p>To create instances of this class use {@link MaxBitrateRequirementsBuilder}.
 * @see MaxBitrateRequirementsBuilder
 *
 */
public interface MaxBitrateRequirements
    extends
    ChildOf<VirtualLinkProfile>,
    Augmentable<MaxBitrateRequirements>,
    LinkBitrateRequirements
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("max-bitrate-requirements");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.MaxBitrateRequirements> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.MaxBitrateRequirements.class;
    }

}

