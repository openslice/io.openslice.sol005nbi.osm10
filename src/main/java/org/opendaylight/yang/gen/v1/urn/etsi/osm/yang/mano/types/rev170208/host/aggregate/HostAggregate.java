package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.aggregate;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Name of the Host Aggregate
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list host-aggregate {
 *   key metadata-key;
 *   leaf metadata-key {
 *     type string;
 *   }
 *   leaf metadata-value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/host-aggregate/host-aggregate</i>
 * 
 * <p>To create instances of this class use {@link HostAggregateBuilder}.
 * @see HostAggregateBuilder
 * @see HostAggregateKey
 *
 */
public interface HostAggregate
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostAggregate>,
    Augmentable<HostAggregate>,
    Identifiable<HostAggregateKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("host-aggregate");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.aggregate.HostAggregate> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.aggregate.HostAggregate.class;
    }
    
    /**
     * Name of the additional information attached to the host-aggregate
     *
     *
     *
     * @return <code>java.lang.String</code> <code>metadataKey</code>, or <code>null</code> if not present
     */
    @Nullable String getMetadataKey();
    
    /**
     * Value of the corresponding metadata-key
     *
     *
     *
     * @return <code>java.lang.String</code> <code>metadataValue</code>, or <code>null</code> if not present
     */
    @Nullable String getMetadataValue();
    
    @Override
    HostAggregateKey key();

}

