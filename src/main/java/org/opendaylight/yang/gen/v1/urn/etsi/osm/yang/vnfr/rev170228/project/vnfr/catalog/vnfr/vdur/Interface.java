package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.InterfaceType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VirtualInterface;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.ConnectionPointType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * List of interfaces (internal and external) for the VNF
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list interface {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf position {
 *     type uint32;
 *   }
 *   leaf type {
 *     type vnfd-base:interface-type;
 *     default EXTERNAL;
 *   }
 *   choice connection-point-type {
 *     case internal {
 *       leaf internal-connection-point-ref {
 *         type leafref {
 *           path ../../internal-connection-point/id;
 *         }
 *       }
 *     }
 *     case external {
 *       leaf external-connection-point-ref {
 *         type leafref {
 *           path ../../../connection-point/name;
 *         }
 *       }
 *     }
 *   }
 *   uses virtual-interface;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:etsi:osm:yang:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur/interface</i>
 * 
 * <p>To create instances of this class use {@link InterfaceBuilder}.
 * @see InterfaceBuilder
 * @see InterfaceKey
 *
 */
public interface Interface
    extends
    ChildOf<Vdur>,
    Augmentable<Interface>,
    VirtualInterface,
    Identifiable<InterfaceKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("interface");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Interface> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Interface.class;
    }
    
    /**
     * Name of the interface. Note that this name has only local significance to the
     * VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Explicit Position of the interface within the list
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>position</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getPosition();
    
    /**
     * Type of the Interface
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.InterfaceType</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable InterfaceType getType();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.ConnectionPointType</code> <code>connectionPointType</code>, or <code>null</code> if not present
     */
    @Nullable ConnectionPointType getConnectionPointType();
    
    @Override
    InterfaceKey key();

}

