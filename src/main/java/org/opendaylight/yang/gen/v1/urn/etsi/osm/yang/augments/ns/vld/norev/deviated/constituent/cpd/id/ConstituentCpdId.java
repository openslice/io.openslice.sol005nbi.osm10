package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.deviated.constituent.cpd.id;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.DeviatedConstituentCpdId;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
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
 * This class represents the following YANG schema fragment defined in module <b>ns-vld</b>
 * <pre>
 * list constituent-cpd-id {
 *   key "constituent-base-element-id constituent-cpd-id";
 *   leaf constituent-base-element-id {
 *     type leafref {
 *       path ../../../nsd:id;
 *     }
 *   }
 *   leaf constituent-cpd-id {
 *     type leafref {
 *       path ../nsd:ext-cpd/nsd:id;
 *     }
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ns-vld/deviated-constituent-cpd-id/constituent-cpd-id</i>
 * 
 * <p>To create instances of this class use {@link ConstituentCpdIdBuilder}.
 * @see ConstituentCpdIdBuilder
 * @see ConstituentCpdIdKey
 *
 */
public interface ConstituentCpdId
    extends
    ChildOf<DeviatedConstituentCpdId>,
    Augmentable<ConstituentCpdId>,
    Identifiable<ConstituentCpdIdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("constituent-cpd-id");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.deviated.constituent.cpd.id.ConstituentCpdId> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.deviated.constituent.cpd.id.ConstituentCpdId.class;
    }
    
    /**
     * Reference to the profile of an NS constituent.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>constituentBaseElementId</code>, or <code>null</code> if not present
     */
    @Nullable Object getConstituentBaseElementId();
    
    /**
     * A reference to the descriptor of a connection point attached to one of the
     * constituent VNFs and PNFs or to the descriptor of a NS SAP.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>constituentCpdId</code>, or <code>null</code> if not present
     */
    @Nullable Object getConstituentCpdId();
    
    /**
     * IP address assigned to the internal connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getIpAddress();
    
    @Override
    ConstituentCpdIdKey key();

}

