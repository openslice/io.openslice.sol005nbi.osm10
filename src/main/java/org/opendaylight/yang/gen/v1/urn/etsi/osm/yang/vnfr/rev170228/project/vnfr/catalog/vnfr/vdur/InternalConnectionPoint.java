package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.AssociatedVirtualCps;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List for internal connection points. Each VNFC has zero or more internal 
 * connection points. Internal connection points are used for connecting the VNF 
 * components internal to the VNF. If a VNF has only one VNFC, it may not have any 
 * internal connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list internal-connection-point {
 *   key id;
 *   uses vnfd-base:common-connection-point;
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
 * <i>vnfr/project/(urn:etsi:osm:yang:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur/internal-connection-point</i>
 * 
 * <p>To create instances of this class use {@link InternalConnectionPointBuilder}.
 * @see InternalConnectionPointBuilder
 * @see InternalConnectionPointKey
 *
 */
public interface InternalConnectionPoint
    extends
    ChildOf<Vdur>,
    Augmentable<InternalConnectionPoint>,
    CommonConnectionPoint,
    AssociatedVirtualCps,
    Identifiable<InternalConnectionPointKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("internal-connection-point");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InternalConnectionPoint> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InternalConnectionPoint.class;
    }
    
    /**
     * IP address assigned to the internal connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getIpAddress();
    
    /**
     * MAC address assigned to the internal connection point
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
    InternalConnectionPointKey key();

}

