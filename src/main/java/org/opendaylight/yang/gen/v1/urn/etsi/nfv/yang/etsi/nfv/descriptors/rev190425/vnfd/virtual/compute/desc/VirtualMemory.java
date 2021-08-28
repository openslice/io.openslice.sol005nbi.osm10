package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualCpuBuilder.VirtualCpuImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualMemoryBuilder.VirtualMemoryImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.memory.VduMemRequirements;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.memory.VduMemRequirementsKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * The virtual memory of the virtualised compute.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container virtual-memory {
 *   leaf size {
 *     type decimal64 {
 *       fraction-digits 1;
 *       range 0..max;
 *     }
 *     units GB;
 *     default 1;
 *   }
 *   leaf over-subscription-policy {
 *     type string;
 *   }
 *   list vdu-mem-requirements {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 *   leaf numa-enabled {
 *     type boolean;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/virtual-compute-desc/virtual-memory</i>
 * 
 * <p>To create instances of this class use {@link VirtualMemoryBuilder}.
 * @see VirtualMemoryBuilder
 *
 */
@JsonDeserialize(as = VirtualMemoryImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface VirtualMemory
    extends
    ChildOf<VirtualComputeDesc>,
    Augmentable<VirtualMemory>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-memory");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualMemory> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualMemory.class;
    }
    
    /**
     * Amount of virtual memory in GB.
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>size</code>, or <code>null</code> if not present
     */
    @Nullable BigDecimal getSize();
    
    /**
     * The memory core oversubscription policy in terms of virtual memory to physical
     * memory on the platform. The cardinality can be 0 during the allocation request,
     * if no particular value is requested.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>overSubscriptionPolicy</code>, or <code>null</code> if not present
     */
    @Nullable String getOverSubscriptionPolicy();
    
    /**
     * Array of key-value pair requirements on the memory for the VDU.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vduMemRequirements</code>, or <code>null</code> if not present
     */
    @Nullable Map<VduMemRequirementsKey, VduMemRequirements> getVduMemRequirements();
    
    /**
     * @return <code>java.util.Map</code> <code>vduMemRequirements</code>, or an empty list if it is not present
     */
    default @NonNull Map<VduMemRequirementsKey, VduMemRequirements> nonnullVduMemRequirements() {
        return CodeHelpers.nonnull(getVduMemRequirements());
    }
    
    /**
     * It specifies the memory allocation to be cognisant of the relevant process/core
     * allocation. The cardinality can be 0 during the allocation request, if no
     * particular value is requested.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>numaEnabled</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isNumaEnabled();

}

