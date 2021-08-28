package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslice.subnet;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * container instantiation-parameters {
 *   uses instantiation-parameters:ns_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/netslice-subnet/instantiation-parameters</i>
 * 
 * <p>To create instances of this class use {@link InstantiationParametersBuilder}.
 * @see InstantiationParametersBuilder
 *
 */
public interface InstantiationParameters
    extends
    ChildOf<NetsliceSubnet>,
    Augmentable<InstantiationParameters>,
    NsParams
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("instantiation-parameters");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslice.subnet.InstantiationParameters> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslice.subnet.InstantiationParameters.class;
    }

}

