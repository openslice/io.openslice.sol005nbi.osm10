package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.VirtualLinkProfile;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Specifies the maximum bitrate requirements for a VL instantiated according to 
 * this profile.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container max-bit-rate-requirements {
 *   leaf root {
 *     type uint32;
 *   }
 *   leaf leaf {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/virtual-link-profile/max-bit-rate-requirements</i>
 * 
 * <p>To create instances of this class use {@link MaxBitRateRequirementsBuilder}.
 * @see MaxBitRateRequirementsBuilder
 *
 */
public interface MaxBitRateRequirements
    extends
    ChildOf<VirtualLinkProfile>,
    Augmentable<MaxBitRateRequirements>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("max-bit-rate-requirements");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.MaxBitRateRequirements> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.MaxBitRateRequirements.class;
    }
    
    /**
     * Throughput requirement of the link (e.g. bitrate of E-Line, root bitrate of
     * E-Tree, aggregate capacity of E-LAN).
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>root</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getRoot();
    
    /**
     * Throughput requirement of leaf connections to the link when applicable to the
     * connectivity type (e.g. for E-Tree and E-LAN branches).
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>leaf</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getLeaf();

}

