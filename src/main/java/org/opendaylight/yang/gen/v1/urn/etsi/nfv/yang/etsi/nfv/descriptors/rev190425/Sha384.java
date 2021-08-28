package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * SHA-384.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity sha-384 {
 *   base checksum-algorithm;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/sha-384</i>
 *
 */
public interface Sha384
    extends
    ChecksumAlgorithm
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("sha-384");


}

