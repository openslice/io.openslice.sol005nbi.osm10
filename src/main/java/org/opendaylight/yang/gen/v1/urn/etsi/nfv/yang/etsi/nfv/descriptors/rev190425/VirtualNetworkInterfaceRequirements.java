package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.VirtualNetworkInterfaceRequirement;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.VirtualNetworkInterfaceRequirementKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * grouping virtual-network-interface-requirements {
 *   list virtual-network-interface-requirement {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf support-mandatory {
 *       default false;
 *       type boolean;
 *     }
 *     list network-interface-requirements {
 *       key key;
 *       min-elements 1;
 *       max-elements 1;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/virtual-network-interface-requirements</i>
 *
 */
public interface VirtualNetworkInterfaceRequirements
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-network-interface-requirements");

    @Override
    Class<? extends VirtualNetworkInterfaceRequirements> implementedInterface();
    
    /**
     * Specifies requirements on a virtual network interface realising the CPs
     * instantiated from this CPD.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>virtualNetworkInterfaceRequirement</code>, or <code>null</code> if not present
     */
    @Nullable Map<VirtualNetworkInterfaceRequirementKey, VirtualNetworkInterfaceRequirement> getVirtualNetworkInterfaceRequirement();
    
    /**
     * @return <code>java.util.Map</code> <code>virtualNetworkInterfaceRequirement</code>, or an empty list if it is not present
     */
    default @NonNull Map<VirtualNetworkInterfaceRequirementKey, VirtualNetworkInterfaceRequirement> nonnullVirtualNetworkInterfaceRequirement() {
        return CodeHelpers.nonnull(getVirtualNetworkInterfaceRequirement());
    }

}

