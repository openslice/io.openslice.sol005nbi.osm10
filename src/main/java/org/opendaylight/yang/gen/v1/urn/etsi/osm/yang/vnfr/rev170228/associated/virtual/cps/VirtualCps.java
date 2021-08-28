package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.associated.virtual.cps;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.AssociatedVirtualCps;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list virtual-cps {
 *   key name;
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/associated-virtual-cps/virtual-cps</i>
 * 
 * <p>To create instances of this class use {@link VirtualCpsBuilder}.
 * @see VirtualCpsBuilder
 * @see VirtualCpsKey
 *
 */
public interface VirtualCps
    extends
    ChildOf<AssociatedVirtualCps>,
    Augmentable<VirtualCps>,
    CommonConnectionPoint,
    Identifiable<VirtualCpsKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-cps");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.associated.virtual.cps.VirtualCps> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.associated.virtual.cps.VirtualCps.class;
    }
    
    /**
     * IP address assigned to the virtual connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getIpAddress();
    
    /**
     * MAC address assigned to the virtual connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    @Nullable String getMacAddress();
    
    /**
     * VIM identifier for connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>connectionPointId</code>, or <code>null</code> if not present
     */
    @Nullable String getConnectionPointId();
    
    @Override
    VirtualCpsKey key();

}

