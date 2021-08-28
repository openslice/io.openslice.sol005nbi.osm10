package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.InternalVldParams;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list internal-connection-point {
 *   key id-ref;
 *   leaf id-ref {
 *     type string;
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/internal_vld_params/internal-connection-point</i>
 * 
 * <p>To create instances of this class use {@link InternalConnectionPointBuilder}.
 * @see InternalConnectionPointBuilder
 * @see InternalConnectionPointKey
 *
 */
public interface InternalConnectionPoint
    extends
    ChildOf<InternalVldParams>,
    Augmentable<InternalConnectionPoint>,
    Identifiable<InternalConnectionPointKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("internal-connection-point");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params.InternalConnectionPoint> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params.InternalConnectionPoint.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>idRef</code>, or <code>null</code> if not present
     */
    @Nullable String getIdRef();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getIpAddress();
    
    @Override
    InternalConnectionPointKey key();

}

