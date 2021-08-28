package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.binding.BaseIdentity;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes the type of the address to be assigned to the CP instantiated from 
 * parent CPD. Value: • MAC address. • IP address. • … The content type shall be 
 * aligned with the address type supported by the layerProtocol attribute of the 
 * parent CPD.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity address-type {
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/address-type</i>
 *
 */
public interface AddressType
    extends
    BaseIdentity
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("address-type");


}

