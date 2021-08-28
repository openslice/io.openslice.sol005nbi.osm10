package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConnectionPointType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.Nsr;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List for external connection points. Each NS has one or more external 
 * points. As the name implies that external connection points are used for 
 * connecting the NS to other NS or to external networks. Each NS exposes these 
 * connection points to the orchestrator. The orchestrator can construct network 
 * service chains by connecting the connection points between different NS.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list connection-point {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf type {
 *     type manotypes:connection-point-type;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:etsi:osm:yang:nsr?revision=2017-02-08)ns-instance-opdata/nsr/connection-point</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointBuilder}.
 * @see ConnectionPointBuilder
 * @see ConnectionPointKey
 *
 */
public interface ConnectionPoint
    extends
    ChildOf<Nsr>,
    Augmentable<ConnectionPoint>,
    Identifiable<ConnectionPointKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConnectionPoint> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConnectionPoint.class;
    }
    
    /**
     * Name of the NS connection point.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Type of the connection point.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConnectionPointType</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable ConnectionPointType getType();
    
    @Override
    ConnectionPointKey key();

}

