package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.slice.connection.points.connection;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.slice.connection.points.Connection;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * case netslice-vld-ref {
 *   leaf netslice-vld-id-ref {
 *     type leafref {
 *       path ../../netslice-vld/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/slice-connection-points/connection/netslice-vld-ref</i>
 *
 */
public interface NetsliceVldRef
    extends
    DataObject,
    Augmentable<NetsliceVldRef>,
    Connection
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-vld-ref");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.slice.connection.points.connection.NetsliceVldRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.slice.connection.points.connection.NetsliceVldRef.class;
    }
    
    /**
     * ID reference to a NSVLD in the NS
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>netsliceVldIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getNetsliceVldIdRef();

}

