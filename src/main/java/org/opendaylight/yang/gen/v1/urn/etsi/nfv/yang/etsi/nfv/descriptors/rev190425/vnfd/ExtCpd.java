package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.VirtualNetworkInterfaceRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ext.cpd.CpConnection;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes an external interface exposed by this VNF enabling connection with a 
 * Virual Link
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list ext-cpd {
 *   key id;
 *   min-elements 1;
 *   choice cp-connection {
 *     case int-virtual-link-desc {
 *       leaf int-virtual-link-desc {
 *         type leafref {
 *           path ../../int-virtual-link-desc/id;
 *         }
 *       }
 *     }
 *     case int-cpd {
 *       container int-cpd {
 *         leaf vdu-id {
 *           type leafref {
 *             path ../../../vdu/id;
 *           }
 *         }
 *         leaf cpd {
 *           type string;
 *         }
 *       }
 *     }
 *     case k8s-cluster-net {
 *       leaf k8s-cluster-net {
 *         type string;
 *       }
 *     }
 *   }
 *   uses virtual-network-interface-requirements;
 *   leaf nicio-requirements {
 *     type leafref {
 *       path ../../virtual-compute-desc/id;
 *     }
 *   }
 *   uses cpd;
 *   leaf security-group-rule-id {
 *     type leafref {
 *       path ../../security-group-rule/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/ext-cpd</i>
 * 
 * <p>To create instances of this class use {@link ExtCpdBuilder}.
 * @see ExtCpdBuilder
 * @see ExtCpdKey
 *
 */
public interface ExtCpd
    extends
    ChildOf<Vnfd>,
    Augmentable<ExtCpd>,
    VirtualNetworkInterfaceRequirements,
    Cpd,
    Identifiable<ExtCpdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ext-cpd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ExtCpd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ExtCpd.class;
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ext.cpd.CpConnection</code> <code>cpConnection</code>, or <code>null</code> if not present
     */
    @Nullable CpConnection getCpConnection();
    
    /**
     * This references (couples) the CPD with any logical node I/O requirements (for
     * network devices) that may have been created. Linking these attributes is
     * necessary so that so that I/O requirements that need to be articulated at the
     * logical node level can be associated with the network interface requirements
     * associated with the CPD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nicioRequirements</code>, or <code>null</code> if not present
     */
    @Nullable String getNicioRequirements();
    
    /**
     * Reference of the security group rules bound to this CPD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>securityGroupRuleId</code>, or <code>null</code> if not present
     */
    @Nullable String getSecurityGroupRuleId();
    
    @Override
    ExtCpdKey key();

}

