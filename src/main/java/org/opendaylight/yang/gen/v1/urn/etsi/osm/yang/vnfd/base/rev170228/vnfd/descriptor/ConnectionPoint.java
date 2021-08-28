package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.CommonConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List for external connection points. Each VNF has one or more external 
 * connection points that connect the VNF to other VNFs or to external networks. 
 * Each VNF exposes connection points to the orchestrator, which can construct 
 * network services by connecting the connection points between different VNFs. 
 * NFVO will use VLDs and VNFFGs at the network service level to construct network 
 * services.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list connection-point {
 *   key name;
 *   uses common-connection-point;
 *   leaf internal-vld-ref {
 *     type leafref {
 *       path ../../internal-vld/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/connection-point</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointBuilder}.
 * @see ConnectionPointBuilder
 * @see ConnectionPointKey
 *
 */
public interface ConnectionPoint
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<ConnectionPoint>,
    CommonConnectionPoint,
    Identifiable<ConnectionPointKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint.class;
    }
    
    /**
     * Reference to an internal VLD of the VNF. This field is optional. It allows
     * exposing an internal VLD through a connection point. When building a NS, this
     * VNF CP might be connected to a NS VLD, then both VLDs (the i-VLD of the VNF and
     * the VLD of the NS) will become the same network and the IP profile will be the
     * one configured at NS level.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>internalVldRef</code>, or <code>null</code> if not present
     */
    @Nullable String getInternalVldRef();
    
    @Override
    ConnectionPointKey key();

}

