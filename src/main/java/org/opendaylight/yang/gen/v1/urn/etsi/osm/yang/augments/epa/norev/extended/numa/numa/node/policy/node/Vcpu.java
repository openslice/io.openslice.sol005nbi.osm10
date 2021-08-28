package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.Node;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * List of VCPUs to allocate on this NUMA node.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * list vcpu {
 *   key id;
 *   leaf id {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-numa/numa-node-policy/node/vcpu</i>
 * 
 * <p>To create instances of this class use {@link VcpuBuilder}.
 * @see VcpuBuilder
 * @see VcpuKey
 *
 */
public interface Vcpu
    extends
    ChildOf<Node>,
    Augmentable<Vcpu>,
    Identifiable<VcpuKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vcpu");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.Vcpu> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.Vcpu.class;
    }
    
    /**
     * List of VCPUs ids to allocate on this NUMA node
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getId();
    
    @Override
    VcpuKey key();

}

