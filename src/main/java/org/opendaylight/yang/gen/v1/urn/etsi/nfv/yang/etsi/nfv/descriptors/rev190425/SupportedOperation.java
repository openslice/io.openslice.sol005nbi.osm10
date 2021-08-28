package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.binding.BaseIdentity;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates which operations are available for this DF via the VNF LCM interface. 
 * Instantiate VNF, Query VNF and Terminate VNF are supported in all DF and 
 * therefore need not be included in this list.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity supported-operation {
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/supported-operation</i>
 *
 */
public interface SupportedOperation
    extends
    BaseIdentity
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("supported-operation");


}

