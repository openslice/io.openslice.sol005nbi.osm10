package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.Protocol;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.ProtocolKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A Cpd information element describes network connectivity to a compute resource 
 * or a VL.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * grouping cpd {
 *   leaf id {
 *     type string;
 *   }
 *   leaf-list layer-protocol {
 *     default ethernet;
 *     type identityref {
 *       base layer-protocol;
 *     }
 *   }
 *   leaf role {
 *     type identityref {
 *       base cp-role;
 *     }
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   list protocol {
 *     key associated-layer-protocol;
 *     leaf associated-layer-protocol {
 *       type identityref {
 *         base layer-protocol;
 *       }
 *     }
 *     list address-data {
 *       key type;
 *       leaf type {
 *         type identityref {
 *           base address-type;
 *         }
 *       }
 *       container l2-address-data {
 *         when "../type='mac-address'";
 *         leaf mac-address-assignment {
 *           type boolean;
 *         }
 *       }
 *       container l3-address-data {
 *         when "../type='ip-address'";
 *         leaf ip-address-assignment {
 *           type boolean;
 *         }
 *         leaf floating-ip-activated {
 *           type boolean;
 *         }
 *         leaf ip-address-type {
 *           type enumeration {
 *             enum ipv4;
 *             enum ipv6;
 *           }
 *         }
 *         leaf number-of-ip-addresses {
 *           type uint32;
 *         }
 *       }
 *     }
 *   }
 *   leaf trunk-mode {
 *     type boolean;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/cpd</i>
 *
 */
public interface Cpd
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cpd");

    @Override
    Class<? extends Cpd> implementedInterface();
    
    /**
     * Identifier of this Cpd information element.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Identifies a protocol that the connection points corresponding to the CPD
     * support for connectivity purposes (e.g. Ethernet, MPLS, ODU2, IPV4, IPV6,
     * Pseudo-Wire, etc.).
     *
     *
     *
     * @return <code>java.util.List</code> <code>layerProtocol</code>, or <code>null</code> if not present
     */
    @Nullable List<Class<? extends LayerProtocol>> getLayerProtocol();
    
    /**
     * Identifies the role of the connection points corresponding to the CPD in the
     * context of the traffic flow patterns in the VNF, PNF or NS. For example an NS
     * with a tree flow pattern within the NS will have legal cpRoles of ROOT and LEAF.
     *
     *
     *
     * @return <code>java.lang.Class</code> <code>role</code>, or <code>null</code> if not present
     */
    @Nullable Class<? extends CpRole> getRole();
    
    /**
     * Provides human-readable information on the purpose of the connection point (e.g.
     * connection point for control plane traffic).
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * Identifies the protocol layering information the CP uses for connectivity
     * purposes and associated information. There shall be one cpProtocol for each
     * layer protocol as indicated by the attribute layerProtocol. When a PnfExtCpd as
     * defined in ETSI GS NFV-IFA 014 [i.8] is inherited from this Cpd, the cardinality
     * is set to 0.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>protocol</code>, or <code>null</code> if not present
     */
    @Nullable Map<ProtocolKey, Protocol> getProtocol();
    
    /**
     * @return <code>java.util.Map</code> <code>protocol</code>, or an empty list if it is not present
     */
    default @NonNull Map<ProtocolKey, Protocol> nonnullProtocol() {
        return CodeHelpers.nonnull(getProtocol());
    }
    
    /**
     * Information about whether the Cp instantiated from this CPD is in Trunk mode
     * (802.1Q or other). When operating in 'trunk mode', the Cp is capable of carrying
     * traffic for several VLANs. A cardinality of 0 implies that trunkMode is not
     * configured for the Cp i.e. It is equivalent to Boolean value 'false'.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>trunkMode</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isTrunkMode();

}

