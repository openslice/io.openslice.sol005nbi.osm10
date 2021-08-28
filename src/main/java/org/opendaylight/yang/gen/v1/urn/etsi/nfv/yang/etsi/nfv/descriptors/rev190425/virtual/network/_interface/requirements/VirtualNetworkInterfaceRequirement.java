package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.VirtualNetworkInterfaceRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.virtual.network._interface.requirement.NetworkInterfaceRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.virtual.network._interface.requirement.NetworkInterfaceRequirementsKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Specifies requirements on a virtual network interface realising the CPs 
 * instantiated from this CPD.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list virtual-network-interface-requirement {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf support-mandatory {
 *     default false;
 *     type boolean;
 *   }
 *   list network-interface-requirements {
 *     key key;
 *     min-elements 1;
 *     max-elements 1;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/virtual-network-interface-requirements/virtual-network-interface-requirement</i>
 * 
 * <p>To create instances of this class use {@link VirtualNetworkInterfaceRequirementBuilder}.
 * @see VirtualNetworkInterfaceRequirementBuilder
 * @see VirtualNetworkInterfaceRequirementKey
 *
 */
public interface VirtualNetworkInterfaceRequirement
    extends
    ChildOf<VirtualNetworkInterfaceRequirements>,
    Augmentable<VirtualNetworkInterfaceRequirement>,
    Identifiable<VirtualNetworkInterfaceRequirementKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-network-interface-requirement");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.VirtualNetworkInterfaceRequirement> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.VirtualNetworkInterfaceRequirement.class;
    }
    
    /**
     * Provides a human readable name for the requirement.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Provides a human readable description of the requirement.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * Indicates whether fulfilling the constraint is mandatory (true) for successful
     * operation or desirable (false).
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>supportMandatory</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isSupportMandatory();
    
    /**
     * The network interface requirements. An element from an array of key-value pairs
     * that articulate the network interface deployment requirements.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>networkInterfaceRequirements</code>, or <code>null</code> if not present
     */
    @Nullable Map<NetworkInterfaceRequirementsKey, NetworkInterfaceRequirements> getNetworkInterfaceRequirements();
    
    /**
     * @return <code>java.util.Map</code> <code>networkInterfaceRequirements</code>, or an empty list if it is not present
     */
    default @NonNull Map<NetworkInterfaceRequirementsKey, NetworkInterfaceRequirements> nonnullNetworkInterfaceRequirements() {
        return CodeHelpers.nonnull(getNetworkInterfaceRequirements());
    }
    
    @Override
    VirtualNetworkInterfaceRequirementKey key();

}

