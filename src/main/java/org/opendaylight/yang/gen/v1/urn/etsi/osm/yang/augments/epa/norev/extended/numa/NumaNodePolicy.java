package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedNuma;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.Node;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.NodeKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint16;

/**
 * This policy defines NUMA topology of the guest. Specifically identifies if the 
 * guest should be run on a host with one NUMA node or multiple NUMA nodes. As an 
 * example a guest might need 8 VCPUs and 4 GB of memory. However, it might need 
 * the VCPUs and memory distributed across multiple NUMA nodes. In this scenario, 
 * NUMA node 1 could run with 6 VCPUs and 3GB, and NUMA node 2 could run with 2 
 * VCPUs and 1GB.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * container numa-node-policy {
 *   leaf node-cnt {
 *     type uint16;
 *   }
 *   leaf mem-policy {
 *     type enumeration {
 *       enum STRICT;
 *       enum PREFERRED;
 *     }
 *   }
 *   list node {
 *     key id;
 *     leaf id {
 *       type uint64;
 *     }
 *     list vcpu {
 *       key id;
 *       leaf id {
 *         type uint64;
 *       }
 *     }
 *     leaf memory-mb {
 *       type uint64;
 *     }
 *     choice om-numa-type {
 *       case cores {
 *         leaf num-cores {
 *           type uint8;
 *         }
 *       }
 *       case paired-threads {
 *         container paired-threads {
 *           leaf num-paired-threads {
 *             type uint8;
 *           }
 *           list paired-thread-ids {
 *             max-elements 16;
 *             key thread-a;
 *             leaf thread-a {
 *               type uint8;
 *             }
 *             leaf thread-b {
 *               type uint8;
 *             }
 *           }
 *         }
 *       }
 *       case threads {
 *         leaf num-threads {
 *           type uint8;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-numa/numa-node-policy</i>
 * 
 * <p>To create instances of this class use {@link NumaNodePolicyBuilder}.
 * @see NumaNodePolicyBuilder
 *
 */
public interface NumaNodePolicy
    extends
    ChildOf<ExtendedNuma>,
    Augmentable<NumaNodePolicy>
{


    public enum MemPolicy implements Enumeration {
        STRICT(0, "STRICT"),
        
        PREFERRED(1, "PREFERRED")
        ;
    
        private static final Map<String, MemPolicy> NAME_MAP;
        private static final Map<Integer, MemPolicy> VALUE_MAP;
    
        static {
            final Builder<String, MemPolicy> nb = ImmutableMap.builder();
            final Builder<Integer, MemPolicy> vb = ImmutableMap.builder();
            for (MemPolicy enumItem : MemPolicy.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private MemPolicy(int value, String name) {
            this.value = value;
            this.name = name;
        }
    
        @Override
        public String getName() {
            return name;
        }
    
        @Override
        public int getIntValue() {
            return value;
        }
    
        /**
         * Return the enumeration member whose {@link #getName()} matches specified value.
         *
         * @param name YANG assigned name
         * @return corresponding MemPolicy item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<MemPolicy> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding MemPolicy item, or null if no such item exists
         */
        public static MemPolicy forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("numa-node-policy");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.NumaNodePolicy> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.NumaNodePolicy.class;
    }
    
    /**
     * The number of NUMA nodes to expose to the VM.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>nodeCnt</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getNodeCnt();
    
    /**
     * This policy specifies how the memory should be allocated in a multi-node
     * scenario. STRICT : The memory must be allocated strictly from the memory
     * attached to the NUMA node. PREFERRED : The memory should be allocated
     * preferentially from the memory attached to the NUMA node
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.NumaNodePolicy.MemPolicy</code> <code>memPolicy</code>, or <code>null</code> if not present
     */
    @Nullable MemPolicy getMemPolicy();
    
    /**
     * @return <code>java.util.Map</code> <code>node</code>, or <code>null</code> if not present
     */
    @Nullable Map<NodeKey, Node> getNode();
    
    /**
     * @return <code>java.util.Map</code> <code>node</code>, or an empty list if it is not present
     */
    default @NonNull Map<NodeKey, Node> nonnullNode() {
        return CodeHelpers.nonnull(getNode());
    }

}

