package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This operation allows updating information about a VNF instance.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity modify-vnf-information {
 *   base supported-operation;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/modify-vnf-information</i>
 *
 */
public interface ModifyVnfInformation
    extends
    SupportedOperation
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("modify-vnf-information");


}

