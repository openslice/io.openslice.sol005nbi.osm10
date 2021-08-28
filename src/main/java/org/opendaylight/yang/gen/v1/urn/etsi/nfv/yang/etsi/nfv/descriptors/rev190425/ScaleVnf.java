package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This operation provides methods to request scaling a VNF in multiple ways: • 
 * horizontal scaling: - scale out: adding additional VNFC instances to the VNF to 
 * increase capacity - scale in: removing VNFC instances from the VNF, in order to 
 * release unused capacity
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity scale-vnf {
 *   base supported-operation;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/scale-vnf</i>
 *
 */
public interface ScaleVnf
    extends
    SupportedOperation
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("scale-vnf");


}

