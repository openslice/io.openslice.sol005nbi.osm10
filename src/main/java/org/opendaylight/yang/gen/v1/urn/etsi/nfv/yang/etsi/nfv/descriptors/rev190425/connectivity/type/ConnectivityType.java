package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.connectivity.type;
import java.lang.Class;
import java.lang.Override;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.FlowPattern;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LayerProtocol;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container connectivity-type {
 *   leaf-list layer-protocol {
 *     type identityref {
 *       base layer-protocol;
 *     }
 *   }
 *   leaf flow-pattern {
 *     type flow-pattern;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/connectivity-type/connectivity-type</i>
 * 
 * <p>To create instances of this class use {@link ConnectivityTypeBuilder}.
 * @see ConnectivityTypeBuilder
 *
 */
public interface ConnectivityType
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.ConnectivityType>,
    Augmentable<ConnectivityType>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("connectivity-type");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.connectivity.type.ConnectivityType> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.connectivity.type.ConnectivityType.class;
    }
    
    /**
     * Identifies the protocols that the VL uses (Ethernet, MPLS, ODU2, IPV4, IPV6,
     * Pseudo-Wire). The top layer protocol of the VL protocol stack shall always be
     * provided. The lower layer protocols may be included when there are specific
     * requirements on these layers.
     *
     *
     *
     * @return <code>java.util.List</code> <code>layerProtocol</code>, or <code>null</code> if not present
     */
    @Nullable List<Class<? extends LayerProtocol>> getLayerProtocol();
    
    /**
     * Identifies the flow pattern of the connectivity (Line, Tree, Mesh).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.FlowPattern</code> <code>flowPattern</code>, or <code>null</code> if not present
     */
    @Nullable FlowPattern getFlowPattern();

}

