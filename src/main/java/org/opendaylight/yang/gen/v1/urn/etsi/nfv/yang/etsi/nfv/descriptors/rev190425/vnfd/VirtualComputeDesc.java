package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDescBuilder.VirtualComputeDescImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.LogicalNode;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.LogicalNodeKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.RequestAdditionalCapability;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.RequestAdditionalCapabilityKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualCpu;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualMemory;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Defines descriptors of virtual compute resources to be used by the VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list virtual-compute-desc {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   list logical-node {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     list requirement-detail {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 *   list request-additional-capability {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf support-mandatory {
 *       type boolean;
 *     }
 *     leaf min-version {
 *       type string;
 *     }
 *     leaf preferred-version {
 *       type string;
 *     }
 *     list target-performance-parameters {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 *   leaf compute-requirements {
 *     type string;
 *   }
 *   container virtual-memory {
 *     leaf size {
 *       type decimal64 {
 *         fraction-digits 1;
 *         range 0..max;
 *       }
 *       units GB;
 *       default 1;
 *     }
 *     leaf over-subscription-policy {
 *       type string;
 *     }
 *     list vdu-mem-requirements {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *     leaf numa-enabled {
 *       type boolean;
 *     }
 *   }
 *   container virtual-cpu {
 *     leaf cpu-architecture {
 *       type string;
 *     }
 *     leaf num-virtual-cpu {
 *       type uint16 {
 *         range 1..max;
 *       }
 *       default 1;
 *     }
 *     leaf clock {
 *       type uint32;
 *       units MHz;
 *     }
 *     leaf oversubscription-policy {
 *       type string;
 *     }
 *     list vdu-cpu-requirements {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *     container pinning {
 *       presence "Set to specify CPU pinning.";
 *       leaf policy {
 *         default dynamic;
 *         type enumeration {
 *           enum static;
 *           enum dynamic;
 *         }
 *       }
 *       list rule {
 *         when "../policy = 'static'";
 *         key key;
 *         leaf key {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/virtual-compute-desc</i>
 * 
 * <p>To create instances of this class use {@link VirtualComputeDescBuilder}.
 * @see VirtualComputeDescBuilder
 * @see VirtualComputeDescKey
 *
 */
@JsonDeserialize(as = VirtualComputeDescImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface VirtualComputeDesc
    extends
    ChildOf<Vnfd>,
    Augmentable<VirtualComputeDesc>,
    Identifiable<VirtualComputeDescKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-compute-desc");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDesc> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDesc.class;
    }
    
    /**
     * Unique identifier of this VirtualComputeDesc in the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * The logical node requirements.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>logicalNode</code>, or <code>null</code> if not present
     */
    @Nullable Map<LogicalNodeKey, LogicalNode> getLogicalNode();
    
    /**
     * @return <code>java.util.Map</code> <code>logicalNode</code>, or an empty list if it is not present
     */
    default @NonNull Map<LogicalNodeKey, LogicalNode> nonnullLogicalNode() {
        return CodeHelpers.nonnull(getLogicalNode());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>requestAdditionalCapability</code>, or <code>null</code> if not present
     */
    @Nullable Map<RequestAdditionalCapabilityKey, RequestAdditionalCapability> getRequestAdditionalCapability();
    
    /**
     * @return <code>java.util.Map</code> <code>requestAdditionalCapability</code>, or an empty list if it is not present
     */
    default @NonNull Map<RequestAdditionalCapabilityKey, RequestAdditionalCapability> nonnullRequestAdditionalCapability() {
        return CodeHelpers.nonnull(getRequestAdditionalCapability());
    }
    
    /**
     * Specifies compute requirements.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>computeRequirements</code>, or <code>null</code> if not present
     */
    @Nullable String getComputeRequirements();
    
    /**
     * The virtual memory of the virtualised compute.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualMemory</code> <code>virtualMemory</code>, or <code>null</code> if not present
     */
    @Nullable VirtualMemory getVirtualMemory();
    
    /**
     * The virtual CPU(s)of the virtualised compute.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualCpu</code> <code>virtualCpu</code>, or <code>null</code> if not present
     */
    @Nullable VirtualCpu getVirtualCpu();
    
    @Override
    VirtualComputeDescKey key();

}

