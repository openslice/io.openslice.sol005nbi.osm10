package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This operation changes the DF of a VNF instance.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * identity change-vnf-flavour {
 *   base supported-operation;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/change-vnf-flavour</i>
 *
 */
public interface ChangeVnfFlavour
    extends
    SupportedOperation
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("change-vnf-flavour");


}

