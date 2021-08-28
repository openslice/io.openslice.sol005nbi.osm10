package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * SHA-512.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity sha-512 {
 *   base checksum-algorithm;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/sha-512</i>
 *
 */
public interface Sha512
    extends
    ChecksumAlgorithm
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("sha-512");


}

