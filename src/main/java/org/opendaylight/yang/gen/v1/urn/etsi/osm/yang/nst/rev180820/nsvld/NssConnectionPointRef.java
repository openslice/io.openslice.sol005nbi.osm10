package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.nsvld;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Nsvld;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A list of references to connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * list nss-connection-point-ref {
 *   key "nss-ref nsd-connection-point-ref";
 *   leaf nss-ref {
 *     type leafref {
 *       path /nst:nst/nst:netslice-subnet/nst:id;
 *     }
 *   }
 *   leaf nsd-connection-point-ref {
 *     type leafref {
 *       path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *     }
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/nsvld/nss-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link NssConnectionPointRefBuilder}.
 * @see NssConnectionPointRefBuilder
 * @see NssConnectionPointRefKey
 *
 */
public interface NssConnectionPointRef
    extends
    ChildOf<Nsvld>,
    Augmentable<NssConnectionPointRef>,
    Identifiable<NssConnectionPointRefKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nss-connection-point-ref");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.nsvld.NssConnectionPointRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.nsvld.NssConnectionPointRef.class;
    }
    
    /**
     * Reference to nsd
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nssRef</code>, or <code>null</code> if not present
     */
    @Nullable String getNssRef();
    
    /**
     * A reference to a connection point name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable String getNsdConnectionPointRef();
    
    /**
     * IP address of the connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getIpAddress();
    
    @Override
    NssConnectionPointRefKey key();

}

