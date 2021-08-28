package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.extended.vld;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.ExtendedVld;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Container for the provider network.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>various</b>
 * <pre>
 * container provider-network {
 *   leaf physical-network {
 *     type string;
 *   }
 *   leaf segmentation_id {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>various/extended-vld/provider-network</i>
 * 
 * <p>To create instances of this class use {@link ProviderNetworkBuilder}.
 * @see ProviderNetworkBuilder
 *
 */
public interface ProviderNetwork
    extends
    ChildOf<ExtendedVld>,
    Augmentable<ProviderNetwork>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("provider-network");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.extended.vld.ProviderNetwork> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.extended.vld.ProviderNetwork.class;
    }
    
    /**
     * Name of the physical network on which the provider network is built.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>physicalNetwork</code>, or <code>null</code> if not present
     */
    @Nullable String getPhysicalNetwork();
    
    /**
     * ID of segregated virtual networks
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>segmentationId</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getSegmentationId();

}

