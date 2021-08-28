package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AddressType;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.Protocol;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data.L2AddressData;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data.L3AddressData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Provides information on the addresses to be assigned to the CP(s) instantiated 
 * from the CPD.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list address-data {
 *   key type;
 *   leaf type {
 *     type identityref {
 *       base address-type;
 *     }
 *   }
 *   container l2-address-data {
 *     when "../type='mac-address'";
 *     leaf mac-address-assignment {
 *       type boolean;
 *     }
 *   }
 *   container l3-address-data {
 *     when "../type='ip-address'";
 *     leaf ip-address-assignment {
 *       type boolean;
 *     }
 *     leaf floating-ip-activated {
 *       type boolean;
 *     }
 *     leaf ip-address-type {
 *       type enumeration {
 *         enum ipv4;
 *         enum ipv6;
 *       }
 *     }
 *     leaf number-of-ip-addresses {
 *       type uint32;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/cpd/protocol/address-data</i>
 * 
 * <p>To create instances of this class use {@link AddressDataBuilder}.
 * @see AddressDataBuilder
 * @see AddressDataKey
 *
 */
public interface AddressData
    extends
    ChildOf<Protocol>,
    Augmentable<AddressData>,
    Identifiable<AddressDataKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("address-data");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.AddressData> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.AddressData.class;
    }
    
    /**
     * Describes the type of the address to be assigned to the CP instantiated from the
     * parent CPD. Value: • MAC address. • IP address. • Etc. The content type shall be
     * aligned with the address type supported by the layerProtocol attribute of the
     * parent CPD.
     *
     *
     *
     * @return <code>java.lang.Class</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable Class<? extends AddressType> getType();
    
    /**
     * Provides the information on the MAC addresses to be assigned to the CP(s)
     * instantiated from the parent CPD. Shall be present when the addressType is MAC
     * address.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data.L2AddressData</code> <code>l2AddressData</code>, or <code>null</code> if not present
     */
    @Nullable L2AddressData getL2AddressData();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data.L3AddressData</code> <code>l3AddressData</code>, or <code>null</code> if not present
     */
    @Nullable L3AddressData getL3AddressData();
    
    @Override
    AddressDataKey key();

}

