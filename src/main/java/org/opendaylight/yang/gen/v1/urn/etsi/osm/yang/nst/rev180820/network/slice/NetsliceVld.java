package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Nsvld;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * list netslice-vld {
 *   key id;
 *   uses nsvld;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice/netslice-vld</i>
 * 
 * <p>To create instances of this class use {@link NetsliceVldBuilder}.
 * @see NetsliceVldBuilder
 * @see NetsliceVldKey
 *
 */
public interface NetsliceVld
    extends
    ChildOf<NetworkSlice>,
    Augmentable<NetsliceVld>,
    Nsvld,
    Identifiable<NetsliceVldKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-vld");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceVld> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceVld.class;
    }
    
    @Override
    NetsliceVldKey key();

}

