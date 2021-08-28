package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceVldParams;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>netslice-instantiation-parameters</b>
 * <pre>
 * list netslice-vld {
 *   key name;
 *   uses netslice_vld_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>netslice-instantiation-parameters/netslice_params/netslice-vld</i>
 * 
 * <p>To create instances of this class use {@link NetsliceVldBuilder}.
 * @see NetsliceVldBuilder
 * @see NetsliceVldKey
 *
 */
public interface NetsliceVld
    extends
    ChildOf<NetsliceParams>,
    Augmentable<NetsliceVld>,
    NetsliceVldParams,
    Identifiable<NetsliceVldKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-vld");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceVld> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceVld.class;
    }
    
    @Override
    NetsliceVldKey key();

}

