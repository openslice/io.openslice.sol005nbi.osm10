package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsi</b>
 * <pre>
 * container instantiation-parameters {
 *   uses netslice-instantiation-parameters:netslice_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsi/nsi/instantiation-parameters</i>
 * 
 * <p>To create instances of this class use {@link InstantiationParametersBuilder}.
 * @see InstantiationParametersBuilder
 *
 */
public interface InstantiationParameters
    extends
    ChildOf<Nsi$G>,
    Augmentable<InstantiationParameters>,
    NetsliceParams
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("instantiation-parameters");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.InstantiationParameters> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.InstantiationParameters.class;
    }

}

