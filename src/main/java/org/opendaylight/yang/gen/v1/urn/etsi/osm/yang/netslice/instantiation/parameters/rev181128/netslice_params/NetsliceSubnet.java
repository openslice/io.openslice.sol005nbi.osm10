package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceSubnetParams;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>netslice-instantiation-parameters</b>
 * <pre>
 * list netslice-subnet {
 *   key id;
 *   uses netslice_subnet_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>netslice-instantiation-parameters/netslice_params/netslice-subnet</i>
 * 
 * <p>To create instances of this class use {@link NetsliceSubnetBuilder}.
 * @see NetsliceSubnetBuilder
 * @see NetsliceSubnetKey
 *
 */
public interface NetsliceSubnet
    extends
    ChildOf<NetsliceParams>,
    Augmentable<NetsliceSubnet>,
    NetsliceSubnetParams,
    Identifiable<NetsliceSubnetKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-subnet");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceSubnet> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceSubnet.class;
    }
    
    @Override
    NetsliceSubnetKey key();

}

