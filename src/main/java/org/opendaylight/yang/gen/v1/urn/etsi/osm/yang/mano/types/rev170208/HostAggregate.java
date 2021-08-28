package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.aggregate.HostAggregateKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping host-aggregate {
 *   list host-aggregate {
 *     key metadata-key;
 *     leaf metadata-key {
 *       type string;
 *     }
 *     leaf metadata-value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/host-aggregate</i>
 *
 */
public interface HostAggregate
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("host-aggregate");

    @Override
    Class<? extends HostAggregate> implementedInterface();
    
    /**
     * Name of the Host Aggregate
     *
     *
     *
     * @return <code>java.util.Map</code> <code>hostAggregate</code>, or <code>null</code> if not present
     */
    @Nullable Map<HostAggregateKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.aggregate.HostAggregate> getHostAggregate();
    
    /**
     * @return <code>java.util.Map</code> <code>hostAggregate</code>, or an empty list if it is not present
     */
    default @NonNull Map<HostAggregateKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.aggregate.HostAggregate> nonnullHostAggregate() {
        return CodeHelpers.nonnull(getHostAggregate());
    }

}

