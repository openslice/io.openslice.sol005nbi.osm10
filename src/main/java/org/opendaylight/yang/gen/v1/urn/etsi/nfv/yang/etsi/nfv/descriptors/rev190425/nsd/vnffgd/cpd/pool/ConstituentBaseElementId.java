package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.CpdPool;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Reference to the profile of an NS constituent.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * choice constituent-base-element-id {
 *   case vnf-profile {
 *     container vnf-profile {
 *       leaf vnf-profile-id {
 *         type leafref {
 *           path ../../../../../nsd/df/vnf-profile/id;
 *         }
 *       }
 *     }
 *   }
 *   case pnf-profile {
 *     container pnf-profile {
 *       leaf pnf-profile-id {
 *         type leafref {
 *           path ../../../../../nsd/df/pnf-profile/id;
 *         }
 *       }
 *     }
 *   }
 *   case ns-profile {
 *     container ns-profile {
 *       leaf ns-profile-id {
 *         type leafref {
 *           path ../../../../../nsd/df/ns-profile/id;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/vnffgd/cpd-pool/constituent-base-element-id</i>
 *
 */
public interface ConstituentBaseElementId
    extends
    ChoiceIn<CpdPool>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("constituent-base-element-id");


}

