package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This operation scales an instantiated VNF of a particular DF to a target size. 
 * The target size is either expressed as an instantiation level of that DF as 
 * defined in the VNFD, or given as a list of scale levels, one per scaling aspect 
 * of that DF. Instantiation levels and scaling aspects are declared in the VNFD. 
 * Typically, the result of this operation is adding and/or removing Network 
 * Functions Virtualization Infrastructure (NFVI) resources to/from the VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity scale-vnf-to-level {
 *   base supported-operation;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/scale-vnf-to-level</i>
 *
 */
public interface ScaleVnfToLevel
    extends
    SupportedOperation
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("scale-vnf-to-level");


}

