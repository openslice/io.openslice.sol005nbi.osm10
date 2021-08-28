package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This operation terminates a VNF. A VNF can be terminated gracefully or 
 * forcefully. Graceful termination means that the VNFM arranges to take the VNF 
 * out of service, e.g. by asking the VNF's EM to take the VNF out of service, and 
 * only after that shuts down the VNF and releases the resources. Forceful 
 * termination means that the VNFM immediately shuts down the VNF and releases the 
 * resources. A time interval can be specified for taking the VNF out of service, 
 * after which the VNF is shut down if taking it out of service has not completed.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity terminate-vnf {
 *   base supported-operation;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/terminate-vnf</i>
 *
 */
public interface TerminateVnf
    extends
    SupportedOperation
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("terminate-vnf");


}

