package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.InterfaceType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VirtualInterface;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.ConnectionPointType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * List of Interfaces (external and internal) for the VNF
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list interface {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf position {
 *     type uint32;
 *   }
 *   leaf mgmt-interface {
 *     type boolean;
 *     default false;
 *   }
 *   leaf type {
 *     type interface-type;
 *     default EXTERNAL;
 *   }
 *   leaf mac-address {
 *     type string;
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
 * <i>vnfd-base/vnfd-descriptor/vdu/interface</i>
 * 
 * <p>To create instances of this class use {@link InterfaceBuilder}.
 * @see InterfaceBuilder
 * @see InterfaceKey
 *
 */
public interface Interface
    extends
    ChildOf<Vdu>,
    Augmentable<Interface>,
    VirtualInterface,
    Identifiable<InterfaceKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("interface");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface.class;
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
     * Flag to indicate that this is the mgmt interface to be used for VDU
     * configuration
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mgmtInterface</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isMgmtInterface();
    
    /**
     * Type of the Interface
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.InterfaceType</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable InterfaceType getType();
    
    /**
     * MAC address of the interface. Some VNFs require a specific MAC address to be
     * configured in the interface. While this is not recommended at all in NFV
     * environments, this parameter exists to allow those scenarios. This parameter
     * will be likely deprecated in the future.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    @Nullable String getMacAddress();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.ConnectionPointType</code> <code>connectionPointType</code>, or <code>null</code> if not present
     */
    @Nullable ConnectionPointType getConnectionPointType();
    
    @Override
    InterfaceKey key();

}

