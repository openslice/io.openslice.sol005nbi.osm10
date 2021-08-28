package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.binding.BaseIdentity;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Identifies the algorithms supported for the purpose of calculating the checksum.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity checksum-algorithm {
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/checksum-algorithm</i>
 *
 */
public interface ChecksumAlgorithm
    extends
    BaseIdentity
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("checksum-algorithm");


}

