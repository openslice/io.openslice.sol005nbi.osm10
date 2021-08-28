package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Vnffgd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.PositionDescId;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.nfpd.PositionDescIdKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The network forwarding path associated to the VNFFG.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list nfpd {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf rule {
 *     type string;
 *   }
 *   list position-desc-id {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     list cp-profile-id {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       list constituent-profile-elements {
 *         key id;
 *         leaf id {
 *           type string;
 *         }
 *         leaf cpd-id {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/vnffgd/nfpd</i>
 * 
 * <p>To create instances of this class use {@link NfpdBuilder}.
 * @see NfpdBuilder
 * @see NfpdKey
 *
 */
public interface Nfpd
    extends
    ChildOf<Vnffgd>,
    Augmentable<Nfpd>,
    Identifiable<NfpdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nfpd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.Nfpd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.Nfpd.class;
    }
    
    /**
     * Identifies this nfpd information element within a VNFFGD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Provides an NFP classification and selection rule. The rule may be expressed as
     * a criteria constructed out of atomic assertions linked by Boolean operators AND,
     * OR and NOT.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>rule</code>, or <code>null</code> if not present
     */
    @Nullable String getRule();
    
    /**
     * Describes a position in the NFP in terms of one or more CP profiles and rules
     * for distributing the traffic among CP and SAP instances created from the CPD or
     * SAPD associated to these profiles. This shall be connection point profile, which
     * is either a CPD associated with the VnfProfile of a constituent VNF, or a CPD
     * associated with the PnfProfile of a constituent PNF, or a SAPD associated with
     * the NsProfile of a nested NS. The related VnfProfile, PnfProfile and NsProfile
     * shall be included in the parent VNFFGD.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>positionDescId</code>, or <code>null</code> if not present
     */
    @Nullable Map<PositionDescIdKey, PositionDescId> getPositionDescId();
    
    /**
     * @return <code>java.util.Map</code> <code>positionDescId</code>, or an empty list if it is not present
     */
    default @NonNull Map<PositionDescIdKey, PositionDescId> nonnullPositionDescId() {
        return CodeHelpers.nonnull(getPositionDescId());
    }
    
    @Override
    NfpdKey key();

}

