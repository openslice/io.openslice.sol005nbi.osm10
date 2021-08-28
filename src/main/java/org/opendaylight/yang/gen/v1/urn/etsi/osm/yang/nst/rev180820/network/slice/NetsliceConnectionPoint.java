package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.SliceConnectionPoints;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * list netslice-connection-point {
 *   key name;
 *   uses slice-connection-points;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/network-slice/netslice-connection-point</i>
 * 
 * <p>To create instances of this class use {@link NetsliceConnectionPointBuilder}.
 * @see NetsliceConnectionPointBuilder
 * @see NetsliceConnectionPointKey
 *
 */
public interface NetsliceConnectionPoint
    extends
    ChildOf<NetworkSlice>,
    Augmentable<NetsliceConnectionPoint>,
    SliceConnectionPoints,
    Identifiable<NetsliceConnectionPointKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-connection-point");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceConnectionPoint> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceConnectionPoint.class;
    }
    
    @Override
    NetsliceConnectionPointKey key();

}

