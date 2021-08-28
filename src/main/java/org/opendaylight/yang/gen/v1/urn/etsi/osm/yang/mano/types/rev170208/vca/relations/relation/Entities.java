package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.relations.relation;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.relations.Relation;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of two elements to be related. Elements to be related are identified by a 
 * pair (id, endpoint). The relation will relate (id1, endpoint1) to (id2, 
 * endpoint2).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list entities {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf endpoint {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-relations/relation/entities</i>
 * 
 * <p>To create instances of this class use {@link EntitiesBuilder}.
 * @see EntitiesBuilder
 * @see EntitiesKey
 *
 */
public interface Entities
    extends
    ChildOf<Relation>,
    Augmentable<Entities>,
    Identifiable<EntitiesKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("entities");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.relations.relation.Entities> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.relations.relation.Entities.class;
    }
    
    /**
     * A string, reference to the element id in the descriptor. It could be a vnfd-id
     * or a vdu-id in a VNFD, or a nsd-id or member-vnf-index in a NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Endpoint name defining the relation.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>endpoint</code>, or <code>null</code> if not present
     */
    @Nullable String getEndpoint();
    
    @Override
    EntitiesKey key();

}

