package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VduBuilder.VduImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualCpuBuilder.VirtualCpuImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.Pinning;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.VduCpuRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.VduCpuRequirementsKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint16;
import org.opendaylight.yangtools.yang.common.Uint32;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * The virtual CPU(s)of the virtualised compute.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container virtual-cpu {
 *   leaf cpu-architecture {
 *     type string;
 *   }
 *   leaf num-virtual-cpu {
 *     type uint16 {
 *       range 1..max;
 *     }
 *     default 1;
 *   }
 *   leaf clock {
 *     type uint32;
 *     units MHz;
 *   }
 *   leaf oversubscription-policy {
 *     type string;
 *   }
 *   list vdu-cpu-requirements {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 *   container pinning {
 *     presence "Set to specify CPU pinning.";
 *     leaf policy {
 *       default dynamic;
 *       type enumeration {
 *         enum static;
 *         enum dynamic;
 *       }
 *     }
 *     list rule {
 *       when "../policy = 'static'";
 *       key key;
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
 * <i>etsi-nfv-descriptors/vnfd/virtual-compute-desc/virtual-cpu</i>
 * 
 * <p>To create instances of this class use {@link VirtualCpuBuilder}.
 * @see VirtualCpuBuilder
 *
 */
@JsonDeserialize(as = VirtualCpuImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface VirtualCpu
    extends
    ChildOf<VirtualComputeDesc>,
    Augmentable<VirtualCpu>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-cpu");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualCpu> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualCpu.class;
    }
    
    /**
     * CPU architecture type. Examples are x86, ARM. The cardinality can be 0 during
     * the allocation request, if no particular CPU architecture type is requested.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cpuArchitecture</code>, or <code>null</code> if not present
     */
    @Nullable String getCpuArchitecture();
    
    /**
     * Number of virtual CPUs.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>numVirtualCpu</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getNumVirtualCpu();
    
    /**
     * Minimum virtual CPU clock rate (e.g. in MHz). The cardinality can be 0 during
     * the allocation request, if no particular value is requested.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>clock</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getClock();
    
    /**
     * The CPU core oversubscription policy e.g. the relation of virtual CPU cores to
     * physical CPU cores/threads. The cardinality can be 0 during the allocation
     * request, if no particular value is requested.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>oversubscriptionPolicy</code>, or <code>null</code> if not present
     */
    @Nullable String getOversubscriptionPolicy();
    
    /**
     * Array of key-value pair requirements on the compute (CPU) for the VDU.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vduCpuRequirements</code>, or <code>null</code> if not present
     */
    @Nullable Map<VduCpuRequirementsKey, VduCpuRequirements> getVduCpuRequirements();
    
    /**
     * @return <code>java.util.Map</code> <code>vduCpuRequirements</code>, or an empty list if it is not present
     */
    default @NonNull Map<VduCpuRequirementsKey, VduCpuRequirements> nonnullVduCpuRequirements() {
        return CodeHelpers.nonnull(getVduCpuRequirements());
    }
    
    /**
     * The virtual CPU pinning configuration for the virtualised compute resource.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.Pinning</code> <code>pinning</code>, or <code>null</code> if not present
     */
    @Nullable Pinning getPinning();

}

