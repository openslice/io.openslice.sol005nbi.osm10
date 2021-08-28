package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.AddressData;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Provides the information on the MAC addresses to be assigned to the CP(s) 
 * instantiated from the parent CPD. Shall be present when the addressType is MAC 
 * address.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container l2-address-data {
 *   when "../type='mac-address'";
 *   leaf mac-address-assignment {
 *     type boolean;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/cpd/protocol/address-data/l2-address-data</i>
 * 
 * <p>To create instances of this class use {@link L2AddressDataBuilder}.
 * @see L2AddressDataBuilder
 *
 */
public interface L2AddressData
    extends
    ChildOf<AddressData>,
    Augmentable<L2AddressData>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("l2-address-data");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data.L2AddressData> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd.protocol.address.data.L2AddressData.class;
    }
    
    /**
     * Specify if the MAC address assignment is the responsibility of management and
     * orchestration function or not. If it is set to True, it is the management and
     * orchestration function responsibility. If it is set to False, it will be
     * provided by an external entity, e.g. OSS/BSS.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>macAddressAssignment</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isMacAddressAssignment();

}

