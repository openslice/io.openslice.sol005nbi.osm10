package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.ip.profile.params;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.IpProfileParams;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list dns-server {
 *   key address;
 *   leaf address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ip-profile-info/ip-profile-params/dns-server</i>
 * 
 * <p>To create instances of this class use {@link DnsServerBuilder}.
 * @see DnsServerBuilder
 * @see DnsServerKey
 *
 */
public interface DnsServer
    extends
    ChildOf<IpProfileParams>,
    Augmentable<DnsServer>,
    Identifiable<DnsServerKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("dns-server");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer.class;
    }
    
    /**
     * List of DNS Servers associated with IP Profile
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>address</code>, or <code>null</code> if not present
     */
    @Nullable IpAddress getAddress();
    
    @Override
    DnsServerKey key();

}

