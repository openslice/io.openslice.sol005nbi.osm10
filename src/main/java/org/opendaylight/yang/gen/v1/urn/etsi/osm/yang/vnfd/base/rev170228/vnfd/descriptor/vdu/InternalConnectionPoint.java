package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List for internal connection points. Each VNFC has zero or more internal 
 * connection points. Internal connection points are used for connecting the VNF 
 * with components internal to the VNF. If a VNF has only one VNFC, it may not 
 * any internal connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list internal-connection-point {
 *   key id;
 *   uses common-connection-point;
 *   leaf internal-vld-ref {
 *     type leafref {
 *       path ../../../internal-vld/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/internal-connection-point</i>
 * 
 * <p>To create instances of this class use {@link InternalConnectionPointBuilder}.
 * @see InternalConnectionPointBuilder
 * @see InternalConnectionPointKey
 *
 */
public interface InternalConnectionPoint
    extends
    ChildOf<Vdu>,
    Augmentable<InternalConnectionPoint>,
    CommonConnectionPoint,
    Identifiable<InternalConnectionPointKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("internal-connection-point");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.InternalConnectionPoint> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.InternalConnectionPoint.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>internalVldRef</code>, or <code>null</code> if not present
     */
    @Nullable String getInternalVldRef();
    
    @Override
    InternalConnectionPointKey key();

}

