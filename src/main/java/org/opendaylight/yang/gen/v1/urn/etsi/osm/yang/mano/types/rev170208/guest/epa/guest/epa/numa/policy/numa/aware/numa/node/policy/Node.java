package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.OmNumaType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.VcpuKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list node {
 *   key id;
 *   leaf id {
 *     type uint64;
 *   }
 *   list vcpu {
 *     key id;
 *     leaf id {
 *       type uint64;
 *     }
 *   }
 *   leaf memory-mb {
 *     type uint64;
 *   }
 *   choice om-numa-type {
 *     case cores {
 *       leaf num-cores {
 *         type uint8;
 *       }
 *     }
 *     case paired-threads {
 *       container paired-threads {
 *         leaf num-paired-threads {
 *           type uint8;
 *         }
 *         list paired-thread-ids {
 *           max-elements 16;
 *           key thread-a;
 *           leaf thread-a {
 *             type uint8;
 *           }
 *           leaf thread-b {
 *             type uint8;
 *           }
 *         }
 *       }
 *     }
 *     case threads {
 *       leaf num-threads {
 *         type uint8;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node</i>
 * 
 * <p>To create instances of this class use {@link NodeBuilder}.
 * @see NodeBuilder
 * @see NodeKey
 *
 */
public interface Node
    extends
    ChildOf<NumaNodePolicy>,
    Augmentable<Node>,
    Identifiable<NodeKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("node");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node.class;
    }
    
    /**
     * NUMA node identification. Typically it's 0 or 1
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getId();
    
    /**
     * List of VCPUs to allocate on this NUMA node.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vcpu</code>, or <code>null</code> if not present
     */
    @Nullable Map<VcpuKey, Vcpu> getVcpu();
    
    /**
     * @return <code>java.util.Map</code> <code>vcpu</code>, or an empty list if it is not present
     */
    default @NonNull Map<VcpuKey, Vcpu> nonnullVcpu() {
        return CodeHelpers.nonnull(getVcpu());
    }
    
    /**
     * Memory size expressed in MB for this NUMA node.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>memoryMb</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getMemoryMb();
    
    /**
     * OpenMANO Numa type selection
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.OmNumaType</code> <code>omNumaType</code>, or <code>null</code> if not present
     */
    @Nullable OmNumaType getOmNumaType();
    
    @Override
    NodeKey key();

}

