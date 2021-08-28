package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping provider-network {
 *   container provider-network {
 *     leaf physical-network {
 *       type string;
 *     }
 *     leaf segmentation_id {
 *       type uint32;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/provider-network</i>
 *
 */
public interface ProviderNetwork
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("provider-network");

    @Override
    Class<? extends ProviderNetwork> implementedInterface();
    
    /**
     * Container for the provider network.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.provider.network.ProviderNetwork</code> <code>providerNetwork</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.provider.network.@Nullable ProviderNetwork getProviderNetwork();

}

