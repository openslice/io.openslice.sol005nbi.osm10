package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * SHA-256.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity sha-256 {
 *   base checksum-algorithm;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/sha-256</i>
 *
 */
public interface Sha256
    extends
    ChecksumAlgorithm
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("sha-256");


}

