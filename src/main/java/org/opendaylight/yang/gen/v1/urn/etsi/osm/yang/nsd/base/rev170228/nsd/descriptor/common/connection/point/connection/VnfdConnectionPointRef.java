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
 * case vnfd-connection-point-ref {
 *   leaf member-vnf-index-ref {
 *     type leafref {
 *       path ../../constituent-vnfd/member-vnf-index;
 *     }
 *   }
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path "../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *     }
 *   }
 *   leaf vnfd-connection-point-ref {
 *     type leafref {
 *       path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:connection-point/vnfd:name";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/connection-point/connection/vnfd-connection-point-ref</i>
 *
 */
public interface VnfdConnectionPointRef
    extends
    DataObject,
    Augmentable<VnfdConnectionPointRef>,
    Connection
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-connection-point-ref");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.connection.point.connection.VnfdConnectionPointRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.connection.point.connection.VnfdConnectionPointRef.class;
    }
    
    /**
     * Reference to member-vnf within constituent-vnfd
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getMemberVnfIndexRef();
    
    /**
     * A reference to a vnfd. This is a leafref to path: ../../nsd:constituent-vnfd +
     * [nsd:id = current()/../nsd:id-ref] + /nsd:vnfd-id-ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfdIdRef();
    
    /**
     * A reference to a connection point name in a vnfd. This is a leafref to path:
     * /vnfd:vnfd-catalog/vnfd:vnfd + [vnfd:id = current()/../nsd:vnfd-id-ref] +
     * /vnfd:connection-point/vnfd:name
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfdConnectionPointRef();

}

