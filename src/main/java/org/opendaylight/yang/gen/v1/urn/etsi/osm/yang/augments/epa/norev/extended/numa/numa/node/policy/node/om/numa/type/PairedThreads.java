package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.om.numa.type;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.OmNumaType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * case paired-threads {
 *   container paired-threads {
 *     leaf num-paired-threads {
 *       type uint8;
 *     }
 *     list paired-thread-ids {
 *       max-elements 16;
 *       key thread-a;
 *       leaf thread-a {
 *         type uint8;
 *       }
 *       leaf thread-b {
 *         type uint8;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-numa/numa-node-policy/node/om-numa-type/paired-threads</i>
 *
 */
public interface PairedThreads
    extends
    DataObject,
    Augmentable<PairedThreads>,
    OmNumaType
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("paired-threads");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.om.numa.type.PairedThreads> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.om.numa.type.PairedThreads.class;
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads</code> <code>pairedThreads</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.om.numa.type.paired.threads.@Nullable PairedThreads getPairedThreads();

}

