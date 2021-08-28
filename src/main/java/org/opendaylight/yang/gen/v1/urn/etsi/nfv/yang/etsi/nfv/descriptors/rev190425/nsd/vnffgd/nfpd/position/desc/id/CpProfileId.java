package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.position.desc.id;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.PositionDescId;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.position.desc.id.cp.profile.id.ConstituentProfileElements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.position.desc.id.cp.profile.id.ConstituentProfileElementsKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * References the profile of a connection point to be traversed by the traffic 
 * flows matching the criteria. This shall be a connection point attached to one 
 * the constituent VNFs and PNFs of the parent VNFFG, or a SAP of one of the 
 * constituent nested NSs of the parent VNFFG.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list cp-profile-id {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   list constituent-profile-elements {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf cpd-id {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/vnffgd/nfpd/position-desc-id/cp-profile-id</i>
 * 
 * <p>To create instances of this class use {@link CpProfileIdBuilder}.
 * @see CpProfileIdBuilder
 * @see CpProfileIdKey
 *
 */
public interface CpProfileId
    extends
    ChildOf<PositionDescId>,
    Augmentable<CpProfileId>,
    Identifiable<CpProfileIdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cp-profile-id");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.position.desc.id.CpProfileId> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.position.desc.id.CpProfileId.class;
    }
    
    /**
     * Identifier of this CpProfile information element. It uniquely identifies a
     * CpProfile.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Specifies the constituents of the CpProfile.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>constituentProfileElements</code>, or <code>null</code> if not present
     */
    @Nullable Map<ConstituentProfileElementsKey, ConstituentProfileElements> getConstituentProfileElements();
    
    /**
     * @return <code>java.util.Map</code> <code>constituentProfileElements</code>, or an empty list if it is not present
     */
    default @NonNull Map<ConstituentProfileElementsKey, ConstituentProfileElements> nonnullConstituentProfileElements() {
        return CodeHelpers.nonnull(getConstituentProfileElements());
    }
    
    @Override
    CpProfileIdKey key();

}

