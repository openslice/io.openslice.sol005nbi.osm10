package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vdu_params;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VduParams;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list interface {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 *   leaf mac-address {
 *     type ietf-yang:mac-address;
 *   }
 *   leaf floating-ip-required {
 *     type boolean;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vdu_params/interface</i>
 * 
 * <p>To create instances of this class use {@link InterfaceBuilder}.
 * @see InterfaceBuilder
 * @see InterfaceKey
 *
 */
public interface Interface
    extends
    ChildOf<VduParams>,
    Augmentable<Interface>,
    Identifiable<InterfaceKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("interface");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vdu_params.Interface> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vdu_params.Interface.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getIpAddress();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    @Nullable MacAddress getMacAddress();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>floatingIpRequired</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isFloatingIpRequired();
    
    @Override
    InterfaceKey key();

}

