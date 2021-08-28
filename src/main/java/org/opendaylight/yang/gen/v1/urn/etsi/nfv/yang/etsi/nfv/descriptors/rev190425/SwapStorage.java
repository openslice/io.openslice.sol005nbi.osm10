package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Swap type of storage.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity swap-storage {
 *   base storage-type;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/swap-storage</i>
 *
 */
public interface SwapStorage
    extends
    StorageType
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("swap-storage");


}

