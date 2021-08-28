package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.Nfpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.position.desc.id.CpProfileId;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.position.desc.id.CpProfileIdKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes a position in the NFP in terms of one or more CP profiles and rules 
 * for distributing the traffic among CP and SAP instances created from the CPD or 
 * SAPD associated to these profiles. This shall be connection point profile, 
 * is either a CPD associated with the VnfProfile of a constituent VNF, or a CPD 
 * associated with the PnfProfile of a constituent PNF, or a SAPD associated with 
 * the NsProfile of a nested NS. The related VnfProfile, PnfProfile and NsProfile 
 * shall be included in the parent VNFFGD.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list position-desc-id {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   list cp-profile-id {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     list constituent-profile-elements {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf cpd-id {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/vnffgd/nfpd/position-desc-id</i>
 * 
 * <p>To create instances of this class use {@link PositionDescIdBuilder}.
 * @see PositionDescIdBuilder
 * @see PositionDescIdKey
 *
 */
public interface PositionDescId
    extends
    ChildOf<Nfpd>,
    Augmentable<PositionDescId>,
    Identifiable<PositionDescIdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("position-desc-id");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.PositionDescId> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.PositionDescId.class;
    }
    
    /**
     * Identifier of this NfpPositionDesc element.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * References the profile of a connection point to be traversed by the traffic
     * flows matching the criteria. This shall be a connection point attached to one of
     * the constituent VNFs and PNFs of the parent VNFFG, or a SAP of one of the
     * constituent nested NSs of the parent VNFFG.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>cpProfileId</code>, or <code>null</code> if not present
     */
    @Nullable Map<CpProfileIdKey, CpProfileId> getCpProfileId();
    
    /**
     * @return <code>java.util.Map</code> <code>cpProfileId</code>, or an empty list if it is not present
     */
    default @NonNull Map<CpProfileIdKey, CpProfileId> nonnullCpProfileId() {
        return CodeHelpers.nonnull(getCpProfileId());
    }
    
    @Override
    PositionDescIdKey key();

}

