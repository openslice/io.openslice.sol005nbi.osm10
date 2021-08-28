package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of Rendered Service Paths (RSP).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * list rsp {
 *   key id;
 *   uses rsp;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/netslicefgd/rsp</i>
 * 
 * <p>To create instances of this class use {@link RspBuilder}.
 * @see RspBuilder
 * @see RspKey
 *
 */
public interface Rsp
    extends
    ChildOf<Netslicefgd>,
    Augmentable<Rsp>,
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Rsp,
    Identifiable<RspKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("rsp");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.Rsp> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.Rsp.class;
    }
    
    @Override
    RspKey key();

}

