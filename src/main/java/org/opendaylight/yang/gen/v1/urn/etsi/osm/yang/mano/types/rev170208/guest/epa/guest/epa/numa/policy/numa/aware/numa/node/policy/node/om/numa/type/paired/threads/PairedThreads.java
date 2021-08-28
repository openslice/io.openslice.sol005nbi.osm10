package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads.PairedThreadIds;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads.PairedThreadIdsKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container paired-threads {
 *   leaf num-paired-threads {
 *     type uint8;
 *   }
 *   list paired-thread-ids {
 *     max-elements 16;
 *     key thread-a;
 *     leaf thread-a {
 *       type uint8;
 *     }
 *     leaf thread-b {
 *       type uint8;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node/om-numa-type/paired-threads/paired-threads</i>
 * 
 * <p>To create instances of this class use {@link PairedThreadsBuilder}.
 * @see PairedThreadsBuilder
 *
 */
public interface PairedThreads
    extends
    ChildOf<Node>,
    Augmentable<PairedThreads>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("paired-threads");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads.class;
    }
    
    /**
     * @return <code>org.opendaylight.yangtools.yang.common.Uint8</code> <code>numPairedThreads</code>, or <code>null</code> if not present
     */
    @Nullable Uint8 getNumPairedThreads();
    
    /**
     * List of thread pairs to use in case of paired-thread NUMA
     *
     *
     *
     * @return <code>java.util.Map</code> <code>pairedThreadIds</code>, or <code>null</code> if not present
     */
    @Nullable Map<PairedThreadIdsKey, PairedThreadIds> getPairedThreadIds();
    
    /**
     * @return <code>java.util.Map</code> <code>pairedThreadIds</code>, or an empty list if it is not present
     */
    default @NonNull Map<PairedThreadIdsKey, PairedThreadIds> nonnullPairedThreadIds() {
        return CodeHelpers.nonnull(getPairedThreadIds());
    }

}

