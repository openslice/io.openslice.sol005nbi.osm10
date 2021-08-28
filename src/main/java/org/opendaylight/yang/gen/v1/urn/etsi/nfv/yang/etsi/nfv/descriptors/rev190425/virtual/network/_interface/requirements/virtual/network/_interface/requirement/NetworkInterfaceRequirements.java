package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.virtual.network._interface.requirement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.VirtualNetworkInterfaceRequirement;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The network interface requirements. An element from an array of key-value pairs 
 * that articulate the network interface deployment requirements.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list network-interface-requirements {
 *   key key;
 *   min-elements 1;
 *   max-elements 1;
 *   leaf key {
 *     type string;
 *   }
 *   leaf value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/virtual-network-interface-requirements/virtual-network-interface-requirement/network-interface-requirements</i>
 * 
 * <p>To create instances of this class use {@link NetworkInterfaceRequirementsBuilder}.
 * @see NetworkInterfaceRequirementsBuilder
 * @see NetworkInterfaceRequirementsKey
 *
 */
public interface NetworkInterfaceRequirements
    extends
    ChildOf<VirtualNetworkInterfaceRequirement>,
    Augmentable<NetworkInterfaceRequirements>,
    Identifiable<NetworkInterfaceRequirementsKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("network-interface-requirements");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.virtual.network._interface.requirement.NetworkInterfaceRequirements> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.virtual.network._interface.requirement.NetworkInterfaceRequirements.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>key</code>, or <code>null</code> if not present
     */
    @Nullable String getKey();
    
    /**
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable String getValue();
    
    @Override
    NetworkInterfaceRequirementsKey key();

}

