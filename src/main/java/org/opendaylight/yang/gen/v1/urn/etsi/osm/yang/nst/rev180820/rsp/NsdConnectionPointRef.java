package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.rsp;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Rsp;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * A list of references to connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * list nsd-connection-point-ref {
 *   key nsd-ref;
 *   leaf nsd-ref {
 *     type leafref {
 *       path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *     }
 *   }
 *   leaf order {
 *     type uint8;
 *   }
 *   leaf nsd-connection-point-ref {
 *     type leafref {
 *       path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/rsp/nsd-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link NsdConnectionPointRefBuilder}.
 * @see NsdConnectionPointRefBuilder
 * @see NsdConnectionPointRefKey
 *
 */
public interface NsdConnectionPointRef
    extends
    ChildOf<Rsp>,
    Augmentable<NsdConnectionPointRef>,
    Identifiable<NsdConnectionPointRefKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-connection-point-ref");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.rsp.NsdConnectionPointRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.rsp.NsdConnectionPointRef.class;
    }
    
    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsdRef</code>, or <code>null</code> if not present
     */
    @Nullable String getNsdRef();
    
    /**
     * A number that denotes the order of a NSD in a chain
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint8</code> <code>order</code>, or <code>null</code> if not present
     */
    @Nullable Uint8 getOrder();
    
    /**
     * @return <code>java.lang.String</code> <code>nsdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable String getNsdConnectionPointRef();
    
    @Override
    NsdConnectionPointRefKey key();

}

