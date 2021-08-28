package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This operation enables the NFVO to request a VNFM to perform a VNF healing 
 * procedure.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity heal-vnf {
 *   base supported-operation;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/heal-vnf</i>
 *
 */
public interface HealVnf
    extends
    SupportedOperation
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("heal-vnf");


}

