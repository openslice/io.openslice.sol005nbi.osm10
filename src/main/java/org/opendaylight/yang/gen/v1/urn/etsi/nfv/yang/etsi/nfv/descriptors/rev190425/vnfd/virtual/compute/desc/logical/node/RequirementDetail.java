package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.logical.node;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.LogicalNode;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The logical node-level compute, memory and I/O requirements. An array of 
 * key-value pairs that articulate the deployment requirements. This could include 
 * the number of CPU cores on this logical node, a memory configuration specific 
 * a logical node (e.g. such as available in the Linux kernel via the libnuma 
 * library) or a requirement related to the association of an I/O device with the 
 * logical node.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list requirement-detail {
 *   key key;
 *   leaf key {
 *     type string;
 *   }
 *   leaf value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/virtual-compute-desc/logical-node/requirement-detail</i>
 * 
 * <p>To create instances of this class use {@link RequirementDetailBuilder}.
 * @see RequirementDetailBuilder
 * @see RequirementDetailKey
 *
 */
public interface RequirementDetail
    extends
    ChildOf<LogicalNode>,
    Augmentable<RequirementDetail>,
    Identifiable<RequirementDetailKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("requirement-detail");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.logical.node.RequirementDetail> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.logical.node.RequirementDetail.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>key</code>, or <code>null</code> if not present
     */
    @Nullable String getKey();
    
    /**
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable String getValue();
    
    @Override
    RequirementDetailKey key();

}

