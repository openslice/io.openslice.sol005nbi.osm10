package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.VirtualNetworkInterfaceRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Vdu;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * A internal-connection-point element is a type of connection point and describes 
 * network connectivity between a VDU instance and an internal Virtual Link or an 
 * external connection point.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list int-cpd {
 *   key id;
 *   min-elements 1;
 *   leaf int-virtual-link-desc {
 *     type leafref {
 *       path ../../../int-virtual-link-desc/id;
 *     }
 *   }
 *   leaf bitrate-requirement {
 *     type uint64;
 *     units Mbps;
 *   }
 *   uses virtual-network-interface-requirements;
 *   leaf nicio-requirements {
 *     type leafref {
 *       path ../../../virtual-compute-desc/id;
 *     }
 *   }
 *   leaf-list order {
 *     type uint32;
 *   }
 *   uses cpd;
 *   leaf security-group-rule-id {
 *     type leafref {
 *       path ../../../security-group-rule/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/vdu/int-cpd</i>
 * 
 * <p>To create instances of this class use {@link IntCpdBuilder}.
 * @see IntCpdBuilder
 * @see IntCpdKey
 *
 */
public interface IntCpd
    extends
    ChildOf<Vdu>,
    Augmentable<IntCpd>,
    VirtualNetworkInterfaceRequirements,
    Cpd,
    Identifiable<IntCpdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("int-cpd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.IntCpd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.IntCpd.class;
    }
    
    /**
     * Reference of the internal VLD which this internal CPD connects to.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>intVirtualLinkDesc</code>, or <code>null</code> if not present
     */
    @Nullable String getIntVirtualLinkDesc();
    
    /**
     * Bitrate requirement on this CP.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>bitrateRequirement</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getBitrateRequirement();
    
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
     * The order of the NIC to be assigned on the compute instance (e.g. 2 for eth2).
     * Note: when binding more than one port to a single compute (aka multi vNICs) and
     * ordering is desired, it is mandatory that all ports will be set with an order
     * value. The order values shall represent a positive, arithmetic progression that
     * starts with 0 (i.e. 0, 1, 2,..., n). If the property is not present, it shall be
     * left to the VIM to assign a value when creating the instance.
     *
     *
     *
     * @return <code>java.util.List</code> <code>order</code>, or <code>null</code> if not present
     */
    @Nullable List<Uint32> getOrder();
    
    /**
     * Reference of the security group rules bound to this CPD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>securityGroupRuleId</code>, or <code>null</code> if not present
     */
    @Nullable String getSecurityGroupRuleId();
    
    @Override
    IntCpdKey key();

}

