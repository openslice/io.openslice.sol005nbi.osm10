package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.NumaNodePolicy;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * grouping extended-numa {
 *   container numa-node-policy {
 *     leaf node-cnt {
 *       type uint16;
 *     }
 *     leaf mem-policy {
 *       type enumeration {
 *         enum STRICT;
 *         enum PREFERRED;
 *       }
 *     }
 *     list node {
 *       key id;
 *       leaf id {
 *         type uint64;
 *       }
 *       list vcpu {
 *         key id;
 *         leaf id {
 *           type uint64;
 *         }
 *       }
 *       leaf memory-mb {
 *         type uint64;
 *       }
 *       choice om-numa-type {
 *         case cores {
 *           leaf num-cores {
 *             type uint8;
 *           }
 *         }
 *         case paired-threads {
 *           container paired-threads {
 *             leaf num-paired-threads {
 *               type uint8;
 *             }
 *             list paired-thread-ids {
 *               max-elements 16;
 *               key thread-a;
 *               leaf thread-a {
 *                 type uint8;
 *               }
 *               leaf thread-b {
 *                 type uint8;
 *               }
 *             }
 *           }
 *         }
 *         case threads {
 *           leaf num-threads {
 *             type uint8;
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-numa</i>
 *
 */
public interface ExtendedNuma
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-numa");

    @Override
    Class<? extends ExtendedNuma> implementedInterface();
    
    /**
     * This policy defines NUMA topology of the guest. Specifically identifies if the
     * guest should be run on a host with one NUMA node or multiple NUMA nodes. As an
     * example a guest might need 8 VCPUs and 4 GB of memory. However, it might need
     * the VCPUs and memory distributed across multiple NUMA nodes. In this scenario,
     * NUMA node 1 could run with 6 VCPUs and 3GB, and NUMA node 2 could run with 2
     * VCPUs and 1GB.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.NumaNodePolicy</code> <code>numaNodePolicy</code>, or <code>null</code> if not present
     */
    @Nullable NumaNodePolicy getNumaNodePolicy();

}

