package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.pnf.profile;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.PnfProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.pnf.profile.virtual.link.connectivity.ConstituentCpdId;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.pnf.profile.virtual.link.connectivity.ConstituentCpdIdKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Defines the connection information of the PNF, it contains connection 
 * relationship between a PNF connection point and a NS Virtual Link.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list virtual-link-connectivity {
 *   key virtual-link-profile-id;
 *   leaf virtual-link-profile-id {
 *     type leafref {
 *       path ../../../virtual-link-profile/id;
 *     }
 *   }
 *   list constituent-cpd-id {
 *     key constituent-base-element-id;
 *     leaf constituent-base-element-id {
 *       type leafref {
 *         path ../../../id;
 *       }
 *     }
 *     leaf constituent-cpd-id {
 *       type leafref {
 *         path deref(../../../pnfd-id)/../ext-cpd/id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/pnf-profile/virtual-link-connectivity</i>
 * 
 * <p>To create instances of this class use {@link VirtualLinkConnectivityBuilder}.
 * @see VirtualLinkConnectivityBuilder
 * @see VirtualLinkConnectivityKey
 *
 */
public interface VirtualLinkConnectivity
    extends
    ChildOf<PnfProfile>,
    Augmentable<VirtualLinkConnectivity>,
    Identifiable<VirtualLinkConnectivityKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-link-connectivity");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.pnf.profile.VirtualLinkConnectivity> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.pnf.profile.VirtualLinkConnectivity.class;
    }
    
    /**
     * Reference an NS VL profile.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>virtualLinkProfileId</code>, or <code>null</code> if not present
     */
    @Nullable String getVirtualLinkProfileId();
    
    /**
     * Describes a connection point on a VNF/PNF or a SAP which connects to virtual
     * links instantiated from the profile identified in the virtualLinkProfileId
     * attribute.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>constituentCpdId</code>, or <code>null</code> if not present
     */
    @Nullable Map<ConstituentCpdIdKey, ConstituentCpdId> getConstituentCpdId();
    
    /**
     * @return <code>java.util.Map</code> <code>constituentCpdId</code>, or an empty list if it is not present
     */
    default @NonNull Map<ConstituentCpdIdKey, ConstituentCpdId> nonnullConstituentCpdId() {
        return CodeHelpers.nonnull(getConstituentCpdId());
    }
    
    @Override
    VirtualLinkConnectivityKey key();

}

