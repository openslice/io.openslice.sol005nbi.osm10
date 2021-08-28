package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LayerProtocol;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.AddressData;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.AddressDataKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Identifies the protocol layering information the CP uses for connectivity 
 * purposes and associated information. There shall be one cpProtocol for each 
 * layer protocol as indicated by the attribute layerProtocol. When a PnfExtCpd as 
 * defined in ETSI GS NFV-IFA 014 [i.8] is inherited from this Cpd, the 
 * is set to 0.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list protocol {
 *   key associated-layer-protocol;
 *   leaf associated-layer-protocol {
 *     type identityref {
 *       base layer-protocol;
 *     }
 *   }
 *   list address-data {
 *     key type;
 *     leaf type {
 *       type identityref {
 *         base address-type;
 *       }
 *     }
 *     container l2-address-data {
 *       when "../type='mac-address'";
 *       leaf mac-address-assignment {
 *         type boolean;
 *       }
 *     }
 *     container l3-address-data {
 *       when "../type='ip-address'";
 *       leaf ip-address-assignment {
 *         type boolean;
 *       }
 *       leaf floating-ip-activated {
 *         type boolean;
 *       }
 *       leaf ip-address-type {
 *         type enumeration {
 *           enum ipv4;
 *           enum ipv6;
 *         }
 *       }
 *       leaf number-of-ip-addresses {
 *         type uint32;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/cpd/protocol</i>
 * 
 * <p>To create instances of this class use {@link ProtocolBuilder}.
 * @see ProtocolBuilder
 * @see ProtocolKey
 *
 */
public interface Protocol
    extends
    ChildOf<Cpd>,
    Augmentable<Protocol>,
    Identifiable<ProtocolKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("protocol");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.Protocol> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.Protocol.class;
    }
    
    /**
     * One of the values of the attribute layerProtocol of the Cpd IE.
     *
     *
     *
     * @return <code>java.lang.Class</code> <code>associatedLayerProtocol</code>, or <code>null</code> if not present
     */
    @Nullable Class<? extends LayerProtocol> getAssociatedLayerProtocol();
    
    /**
     * Provides information on the addresses to be assigned to the CP(s) instantiated
     * from the CPD.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>addressData</code>, or <code>null</code> if not present
     */
    @Nullable Map<AddressDataKey, AddressData> getAddressData();
    
    /**
     * @return <code>java.util.Map</code> <code>addressData</code>, or an empty list if it is not present
     */
    default @NonNull Map<AddressDataKey, AddressData> nonnullAddressData() {
        return CodeHelpers.nonnull(getAddressData());
    }
    
    @Override
    ProtocolKey key();

}

