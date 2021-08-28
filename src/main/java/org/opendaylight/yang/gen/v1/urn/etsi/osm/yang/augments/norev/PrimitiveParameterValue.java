package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.primitive.parameter.value.Parameter;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.primitive.parameter.value.ParameterKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * grouping primitive-parameter-value {
 *   list parameter {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf data-type {
 *       type common:parameter-data-type;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/primitive-parameter-value</i>
 *
 */
public interface PrimitiveParameterValue
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("primitive-parameter-value");

    @Override
    Class<? extends PrimitiveParameterValue> implementedInterface();
    
    /**
     * List of parameters to the configuration primitive.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>parameter</code>, or <code>null</code> if not present
     */
    @Nullable Map<ParameterKey, Parameter> getParameter();
    
    /**
     * @return <code>java.util.Map</code> <code>parameter</code>, or an empty list if it is not present
     */
    default @NonNull Map<ParameterKey, Parameter> nonnullParameter() {
        return CodeHelpers.nonnull(getParameter());
    }

}

