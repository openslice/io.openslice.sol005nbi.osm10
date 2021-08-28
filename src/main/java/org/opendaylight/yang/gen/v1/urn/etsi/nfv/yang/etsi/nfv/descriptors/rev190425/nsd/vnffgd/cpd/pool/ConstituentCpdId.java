package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.CpdPool;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A reference to the descriptor of a connection point attached to one of the 
 * constituent VNFs and PNFs or to the descriptor of a NS SAP.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * choice constituent-cpd-id {
 *   case vnf {
 *     container vnf {
 *       leaf vnfd-id {
 *         type leafref {
 *           path ../../../../../vnfd/id;
 *         }
 *       }
 *       leaf cpd-id {
 *         type leafref {
 *           path deref(../vnfd-id)/../ext-cpd/id;
 *         }
 *       }
 *     }
 *   }
 *   case pnf {
 *     container pnf {
 *       leaf pnfd-id {
 *         type leafref {
 *           path ../../../../../pnfd/id;
 *         }
 *       }
 *       leaf pnf-cpd-id {
 *         type leafref {
 *           path deref(../pnfd-id)/../ext-cpd/id;
 *         }
 *       }
 *     }
 *   }
 *   case ns {
 *     container ns {
 *       leaf nsd-id {
 *         type leafref {
 *           path ../../../../../nsd/id;
 *         }
 *       }
 *       leaf sap-cpd-id {
 *         type leafref {
 *           path deref(../nsd-id)/../sapd/id;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/vnffgd/cpd-pool/constituent-cpd-id</i>
 *
 */
public interface ConstituentCpdId
    extends
    ChoiceIn<CpdPool>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("constituent-cpd-id");


}

