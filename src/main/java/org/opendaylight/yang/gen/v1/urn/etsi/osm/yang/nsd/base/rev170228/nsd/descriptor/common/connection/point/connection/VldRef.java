package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.connection.point.connection;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.connection.point.Connection;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * case vld-ref {
 *   leaf vld-id-ref {
 *     type leafref {
 *       path ../../vld/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/connection-point/connection/vld-ref</i>
 *
 */
public interface VldRef
    extends
    DataObject,
    Augmentable<VldRef>,
    Connection
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vld-ref");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.connection.point.connection.VldRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.connection.point.connection.VldRef.class;
    }
    
    /**
     * ID reference to a VLD in the NS
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vldIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVldIdRef();

}

