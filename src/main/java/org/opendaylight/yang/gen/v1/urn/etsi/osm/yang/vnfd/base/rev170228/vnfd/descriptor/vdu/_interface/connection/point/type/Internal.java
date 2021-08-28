package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.ConnectionPointType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case internal {
 *   leaf internal-connection-point-ref {
 *     type leafref {
 *       path ../../internal-connection-point/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/interface/connection-point-type/internal</i>
 *
 */
public interface Internal
    extends
    DataObject,
    Augmentable<Internal>,
    ConnectionPointType
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("internal");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal.class;
    }
    
    /**
     * Leaf Ref to the particular internal connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>internalConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable String getInternalConnectionPointRef();

}

