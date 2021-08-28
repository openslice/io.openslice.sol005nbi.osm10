package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.AssociatedVirtualCps;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.Vnfr;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List for external connection points. Each VNF has one or more external 
 * connection points. As the name implies that external connection points are used 
 * for connecting the VNF to other VNFs or to external networks. Each VNF exposes 
 * these connection points to the orchestrator. The orchestrator can construct 
 * network services by connecting the connection points between different VNFs. 
 * NFVO will use VLDs and VNFFGs at the network service level to construct network 
 * services.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list connection-point {
 *   key name;
 *   uses vnfd-base:common-connection-point;
 *   leaf vlr-ref {
 *     type leafref {
 *       path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *     }
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 *   leaf mac-address {
 *     type string;
 *   }
 *   leaf connection-point-id {
 *     type string;
 *   }
 *   uses associated-virtual-cps;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:etsi:osm:yang:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/connection-point</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointBuilder}.
 * @see ConnectionPointBuilder
 * @see ConnectionPointKey
 *
 */
public interface ConnectionPoint
    extends
    ChildOf<Vnfr>,
    Augmentable<ConnectionPoint>,
    CommonConnectionPoint,
    AssociatedVirtualCps,
    Identifiable<ConnectionPointKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.ConnectionPoint> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.ConnectionPoint.class;
    }
    
    /**
     * Reference to the VLR associated with this connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vlrRef</code>, or <code>null</code> if not present
     */
    @Nullable Uuid getVlrRef();
    
    /**
     * IP address assigned to the external connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getIpAddress();
    
    /**
     * MAC address assigned to the external connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    @Nullable String getMacAddress();
    
    /**
     * @return <code>java.lang.String</code> <code>connectionPointId</code>, or <code>null</code> if not present
     */
    @Nullable String getConnectionPointId();
    
    @Override
    ConnectionPointKey key();

}

