package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>netslice-instantiation-parameters</b>
 * <pre>
 * grouping netslice_subnet_params {
 *   leaf id {
 *     type string;
 *   }
 *   uses instantiation-parameters:ns_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>netslice-instantiation-parameters/netslice_subnet_params</i>
 *
 */
public interface NetsliceSubnetParams
    extends
    DataObject,
    NsParams
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("netslice_subnet_params");

    @Override
    Class<? extends NetsliceSubnetParams> implementedInterface();
    
    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();

}

