package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.Dependencies;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * References a VnfProfile or NsProfile.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * choice primary-id {
 *   case primary-vnf-profile {
 *     leaf primary-vnf-profile {
 *       type leafref {
 *         path ../../vnf-profile/vnfd-id;
 *       }
 *     }
 *   }
 *   case primary-ns-profile {
 *     leaf primary-ns-profile {
 *       type leafref {
 *         path ../../ns-profile/nsd-id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/dependencies/primary-id</i>
 *
 */
public interface PrimaryId
    extends
    ChoiceIn<Dependencies>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("primary-id");


}

