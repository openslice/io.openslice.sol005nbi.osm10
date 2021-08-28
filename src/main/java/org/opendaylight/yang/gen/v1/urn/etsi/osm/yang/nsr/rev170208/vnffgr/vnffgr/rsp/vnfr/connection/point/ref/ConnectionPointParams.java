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
 * container connection-point-params {
 *   leaf mgmt-address {
 *     type inet:ip-address;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf port-id {
 *     type string;
 *   }
 *   leaf vm-id {
 *     type string;
 *   }
 *   leaf address {
 *     type inet:ip-address;
 *   }
 *   leaf port {
 *     type inet:port-number;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr/rsp/vnfr-connection-point-ref/connection-point-params</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointParamsBuilder}.
 * @see ConnectionPointParamsBuilder
 *
 */
public interface ConnectionPointParams
    extends
    ChildOf<VnfrConnectionPointRef>,
    Augmentable<ConnectionPointParams>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point-params");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams.class;
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>mgmtAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getMgmtAddress();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>portId</code>, or <code>null</code> if not present
     */
    @Nullable String getPortId();
    
    /**
     * @return <code>java.lang.String</code> <code>vmId</code>, or <code>null</code> if not present
     */
    @Nullable String getVmId();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>address</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getAddress();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    @Nullable PortNumber getPort();

}

