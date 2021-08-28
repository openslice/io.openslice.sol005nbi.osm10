package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.extended.vld.ProviderNetwork;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>various</b>
 * <pre>
 * grouping extended-vld {
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
 * <i>various/extended-vld</i>
 *
 */
public interface ExtendedVld
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-vld");

    @Override
    Class<? extends ExtendedVld> implementedInterface();
    
    /**
     * Container for the provider network.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.extended.vld.ProviderNetwork</code> <code>providerNetwork</code>, or <code>null</code> if not present
     */
    @Nullable ProviderNetwork getProviderNetwork();

}

