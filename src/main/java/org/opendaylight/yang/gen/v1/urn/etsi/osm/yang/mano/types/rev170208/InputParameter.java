package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.InputParameterKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of input parameters that can be specified when instantiating a network 
 * service.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping input-parameter {
 *   list input-parameter {
 *     key xpath;
 *     leaf xpath {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter</i>
 *
 */
public interface InputParameter
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("input-parameter");

    @Override
    Class<? extends InputParameter> implementedInterface();
    
    /**
     * List of input parameters
     *
     *
     *
     * @return <code>java.util.Map</code> <code>inputParameter</code>, or <code>null</code> if not present
     */
    @Nullable Map<InputParameterKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.InputParameter> getInputParameter();
    
    /**
     * @return <code>java.util.Map</code> <code>inputParameter</code>, or an empty list if it is not present
     */
    default @NonNull Map<InputParameterKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.InputParameter> nonnullInputParameter() {
        return CodeHelpers.nonnull(getInputParameter());
    }

}

