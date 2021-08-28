package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.SecurityParameters;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Provides a signature to prevent tampering. Editor's Note: While IFA014 does 
 * specify that the PNFD includes a security parameter. SOL001 does not have one. 
 * We need to harmonize SOL001 &amp; SOL006 on this point.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list security {
 *   key signature;
 *   uses security-parameters;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/pnfd/security</i>
 * 
 * <p>To create instances of this class use {@link SecurityBuilder}.
 * @see SecurityBuilder
 * @see SecurityKey
 *
 */
public interface Security
    extends
    ChildOf<Pnfd>,
    Augmentable<Security>,
    SecurityParameters,
    Identifiable<SecurityKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("security");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd.Security> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd.Security.class;
    }
    
    @Override
    SecurityKey key();

}

