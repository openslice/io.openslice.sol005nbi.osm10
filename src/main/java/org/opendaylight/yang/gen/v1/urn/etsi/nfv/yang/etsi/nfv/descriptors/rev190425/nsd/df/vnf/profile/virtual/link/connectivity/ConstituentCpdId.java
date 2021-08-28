package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.virtual.link.connectivity;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.VirtualLinkConnectivity;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes a connection point on a VNF/PNF or a SAP which connects to virtual 
 * links instantiated from the profile identified in the virtualLinkProfileId 
 * attribute.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list constituent-cpd-id {
 *   key constituent-base-element-id;
 *   leaf constituent-base-element-id {
 *     type leafref {
 *       path ../../../id;
 *     }
 *   }
 *   leaf constituent-cpd-id {
 *     type leafref {
 *       path deref(../../../vnfd-id)/../ext-cpd/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/vnf-profile/virtual-link-connectivity/constituent-cpd-id</i>
 * 
 * <p>To create instances of this class use {@link ConstituentCpdIdBuilder}.
 * @see ConstituentCpdIdBuilder
 * @see ConstituentCpdIdKey
 *
 */
public interface ConstituentCpdId
    extends
    ChildOf<VirtualLinkConnectivity>,
    Augmentable<ConstituentCpdId>,
    Identifiable<ConstituentCpdIdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("constituent-cpd-id");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.virtual.link.connectivity.ConstituentCpdId> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.virtual.link.connectivity.ConstituentCpdId.class;
    }
    
    /**
     * Reference to the profile of an NS constituent.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>constituentBaseElementId</code>, or <code>null</code> if not present
     */
    @Nullable String getConstituentBaseElementId();
    
    /**
     * A reference to the descriptor of a connection point attached to one of the
     * constituent VNFs and PNFs or to the descriptor of a NS SAP.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>constituentCpdId</code>, or <code>null</code> if not present
     */
    @Nullable Object getConstituentCpdId();
    
    @Override
    ConstituentCpdIdKey key();

}

