package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container service-function-forwarder {
 *   leaf name {
 *     type string;
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 *   leaf port {
 *     type inet:port-number;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr/rsp/vnfr-connection-point-ref/service-function-forwarder</i>
 * 
 * <p>To create instances of this class use {@link ServiceFunctionForwarderBuilder}.
 * @see ServiceFunctionForwarderBuilder
 *
 */
public interface ServiceFunctionForwarder
    extends
    ChildOf<VnfrConnectionPointRef>,
    Augmentable<ServiceFunctionForwarder>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("service-function-forwarder");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ServiceFunctionForwarder> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ServiceFunctionForwarder.class;
    }
    
    /**
     * Service Function Forwarder name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Data Plane IP Address of the SFF
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getIpAddress();
    
    /**
     * Data Plane Port of the SFF
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    @Nullable PortNumber getPort();

}

