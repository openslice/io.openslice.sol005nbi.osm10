package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ext.cpd;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ExtCpd;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * choice cp-connection {
 *   case int-virtual-link-desc {
 *     leaf int-virtual-link-desc {
 *       type leafref {
 *         path ../../int-virtual-link-desc/id;
 *       }
 *     }
 *   }
 *   case int-cpd {
 *     container int-cpd {
 *       leaf vdu-id {
 *         type leafref {
 *           path ../../../vdu/id;
 *         }
 *       }
 *       leaf cpd {
 *         type string;
 *       }
 *     }
 *   }
 *   case k8s-cluster-net {
 *     leaf k8s-cluster-net {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/ext-cpd/cp-connection</i>
 *
 */
public interface CpConnection
    extends
    ChoiceIn<ExtCpd>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cp-connection");


}

