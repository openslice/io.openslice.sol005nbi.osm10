package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.Node;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * OpenMANO Numa type selection
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * choice om-numa-type {
 *   case cores {
 *     leaf num-cores {
 *       type uint8;
 *     }
 *   }
 *   case paired-threads {
 *     container paired-threads {
 *       leaf num-paired-threads {
 *         type uint8;
 *       }
 *       list paired-thread-ids {
 *         max-elements 16;
 *         key thread-a;
 *         leaf thread-a {
 *           type uint8;
 *         }
 *         leaf thread-b {
 *           type uint8;
 *         }
 *       }
 *     }
 *   }
 *   case threads {
 *     leaf num-threads {
 *       type uint8;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-numa/numa-node-policy/node/om-numa-type</i>
 *
 */
public interface OmNumaType
    extends
    ChoiceIn<Node>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("om-numa-type");


}

