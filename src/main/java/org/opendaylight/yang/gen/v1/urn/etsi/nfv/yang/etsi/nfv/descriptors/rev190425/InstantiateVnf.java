package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This operation instantiates a particular DF of a VNF based on the definition in 
 * the VNFD.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity instantiate-vnf {
 *   base supported-operation;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/instantiate-vnf</i>
 *
 */
public interface InstantiateVnf
    extends
    SupportedOperation
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("instantiate-vnf");


}

