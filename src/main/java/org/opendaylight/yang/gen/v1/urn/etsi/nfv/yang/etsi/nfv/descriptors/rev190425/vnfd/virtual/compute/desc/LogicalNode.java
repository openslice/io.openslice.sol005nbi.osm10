package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualComputeDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.logical.node.RequirementDetail;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.logical.node.RequirementDetailKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The logical node requirements.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list logical-node {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   list requirement-detail {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/virtual-compute-desc/logical-node</i>
 * 
 * <p>To create instances of this class use {@link LogicalNodeBuilder}.
 * @see LogicalNodeBuilder
 * @see LogicalNodeKey
 *
 */
public interface LogicalNode
    extends
    ChildOf<VirtualComputeDesc>,
    Augmentable<LogicalNode>,
    Identifiable<LogicalNodeKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("logical-node");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.LogicalNode> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.LogicalNode.class;
    }
    
    /**
     * Identifies this set of logical node requirements.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * The logical node-level compute, memory and I/O requirements. An array of
     * key-value pairs that articulate the deployment requirements. This could include
     * the number of CPU cores on this logical node, a memory configuration specific to
     * a logical node (e.g. such as available in the Linux kernel via the libnuma
     * library) or a requirement related to the association of an I/O device with the
     * logical node.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>requirementDetail</code>, or <code>null</code> if not present
     */
    @Nullable Map<RequirementDetailKey, RequirementDetail> getRequirementDetail();
    
    /**
     * @return <code>java.util.Map</code> <code>requirementDetail</code>, or an empty list if it is not present
     */
    default @NonNull Map<RequirementDetailKey, RequirementDetail> nonnullRequirementDetail() {
        return CodeHelpers.nonnull(getRequirementDetail());
    }
    
    @Override
    LogicalNodeKey key();

}

