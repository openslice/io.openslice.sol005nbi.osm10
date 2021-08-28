package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ip.profile.update.schema;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.IpProfileUpdateSchema;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * container dhcp-params {
 *   leaf enabled {
 *     type boolean;
 *   }
 *   leaf count {
 *     type uint8;
 *   }
 *   leaf start-address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/ip-profile-update-schema/dhcp-params</i>
 * 
 * <p>To create instances of this class use {@link DhcpParamsBuilder}.
 * @see DhcpParamsBuilder
 *
 */
public interface DhcpParams
    extends
    ChildOf<IpProfileUpdateSchema>,
    Augmentable<DhcpParams>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("dhcp-params");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ip.profile.update.schema.DhcpParams> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ip.profile.update.schema.DhcpParams.class;
    }
    
    /**
     * @return <code>java.lang.Boolean</code> <code>enabled</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isEnabled();
    
    /**
     * @return <code>org.opendaylight.yangtools.yang.common.Uint8</code> <code>count</code>, or <code>null</code> if not present
     */
    @Nullable Uint8 getCount();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>startAddress</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getStartAddress();

}

