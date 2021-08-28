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
 * Specifies the minimum bitrate requirements for a VL instantiated according to 
 * this profile.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container min-bitrate-requirements {
 *   uses link-bitrate-requirements;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/virtual-link-profile/min-bitrate-requirements</i>
 * 
 * <p>To create instances of this class use {@link MinBitrateRequirementsBuilder}.
 * @see MinBitrateRequirementsBuilder
 *
 */
public interface MinBitrateRequirements
    extends
    ChildOf<VirtualLinkProfile>,
    Augmentable<MinBitrateRequirements>,
    LinkBitrateRequirements
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("min-bitrate-requirements");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.MinBitrateRequirements> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.MinBitrateRequirements.class;
    }

}

