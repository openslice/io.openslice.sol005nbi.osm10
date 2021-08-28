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
 * list netslice-subnet {
 *   key id;
 *   uses netslice-subnet;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice/netslice-subnet</i>
 * 
 * <p>To create instances of this class use {@link NetsliceSubnetBuilder}.
 * @see NetsliceSubnetBuilder
 * @see NetsliceSubnetKey
 *
 */
public interface NetsliceSubnet
    extends
    ChildOf<NetworkSlice>,
    Augmentable<NetsliceSubnet>,
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet,
    Identifiable<NetsliceSubnetKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-subnet");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceSubnet> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceSubnet.class;
    }
    
    @Override
    NetsliceSubnetKey key();

}

