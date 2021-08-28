package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.position.desc.id.cp.profile.id;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.position.desc.id.CpProfileId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Specifies the constituents of the CpProfile.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list constituent-profile-elements {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf cpd-id {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/vnffgd/nfpd/position-desc-id/cp-profile-id/constituent-profile-elements</i>
 * 
 * <p>To create instances of this class use {@link ConstituentProfileElementsBuilder}.
 * @see ConstituentProfileElementsBuilder
 * @see ConstituentProfileElementsKey
 *
 */
public interface ConstituentProfileElements
    extends
    ChildOf<CpProfileId>,
    Augmentable<ConstituentProfileElements>,
    Identifiable<ConstituentProfileElementsKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("constituent-profile-elements");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.position.desc.id.cp.profile.id.ConstituentProfileElements> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.position.desc.id.cp.profile.id.ConstituentProfileElements.class;
    }
    
    /**
     * Specifies the constituents of the CpProfile.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * References the VNF external CPD for a given VnfProfile, or the PNF external CPD
     * for a given PnfProfile, or a NS SAPD for a give NsProfile identified by the
     * constituentBasedElementId.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cpdId</code>, or <code>null</code> if not present
     */
    @Nullable String getCpdId();
    
    @Override
    ConstituentProfileElementsKey key();

}

