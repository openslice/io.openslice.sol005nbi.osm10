package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * list netslicefgd {
 *   key id;
 *   uses netslicefgd;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice/netslicefgd</i>
 * 
 * <p>To create instances of this class use {@link NetslicefgdBuilder}.
 * @see NetslicefgdBuilder
 * @see NetslicefgdKey
 *
 */
public interface Netslicefgd
    extends
    ChildOf<NetworkSlice>,
    Augmentable<Netslicefgd>,
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd,
    Identifiable<NetslicefgdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("netslicefgd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.Netslicefgd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.Netslicefgd.class;
    }
    
    @Override
    NetslicefgdKey key();

}

