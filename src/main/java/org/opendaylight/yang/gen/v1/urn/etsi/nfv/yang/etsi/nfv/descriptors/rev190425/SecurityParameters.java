package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * grouping security-parameters {
 *   leaf signature {
 *     type string;
 *   }
 *   leaf algorithm {
 *     type string;
 *   }
 *   leaf certificate {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/security-parameters</i>
 *
 */
public interface SecurityParameters
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("security-parameters");

    @Override
    Class<? extends SecurityParameters> implementedInterface();
    
    /**
     * Provides the signature of the signed part of the descriptor.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>signature</code>, or <code>null</code> if not present
     */
    @Nullable String getSignature();
    
    /**
     * Identifies the algorithm used to compute the signature.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>algorithm</code>, or <code>null</code> if not present
     */
    @Nullable String getAlgorithm();
    
    /**
     * Provides a certificate or a reference to a certificate to validate the
     * signature.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>certificate</code>, or <code>null</code> if not present
     */
    @Nullable String getCertificate();

}

