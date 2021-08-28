package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.sapd;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Sapd;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * choice cpd-or-virtual-link {
 *   case virtual-link-desc {
 *     leaf virtual-link-desc {
 *       type leafref {
 *         path ../../virtual-link-desc/id;
 *       }
 *     }
 *   }
 *   case vnf {
 *     container vnf {
 *       leaf vnfd-id {
 *         type leafref {
 *           path ../../../../vnfd/id;
 *         }
 *         must boolean(../../../vnfd-id[.=current()]);
 *       }
 *       leaf ext-cpd-id {
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
 *           path ../../../../pnfd/id;
 *         }
 *         must boolean(../pnfd-id[.=current()]);
 *       }
 *       leaf ext-cpd-id {
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
 *           path ../../../../nsd/id;
 *         }
 *         must boolean(../nsd-id[.=current()]);
 *       }
 *       leaf ext-cpd-id {
 *         type leafref {
 *           path deref(../nsd-id)/../sapd/id;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/sapd/cpd-or-virtual-link</i>
 *
 */
public interface CpdOrVirtualLink
    extends
    ChoiceIn<Sapd>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cpd-or-virtual-link");


}

