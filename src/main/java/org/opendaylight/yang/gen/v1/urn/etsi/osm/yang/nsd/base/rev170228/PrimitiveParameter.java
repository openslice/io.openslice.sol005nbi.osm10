package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ParameterDataType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping primitive-parameter {
 *   leaf name {
 *     type string;
 *   }
 *   leaf data-type {
 *     type manotypes:parameter-data-type;
 *   }
 *   leaf mandatory {
 *     type boolean;
 *     default false;
 *   }
 *   leaf default-value {
 *     type string;
 *   }
 *   leaf parameter-pool {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/primitive-parameter</i>
 *
 */
public interface PrimitiveParameter
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("primitive-parameter");

    @Override
    Class<? extends PrimitiveParameter> implementedInterface();
    
    /**
     * Name of the parameter.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Data type associated with the name.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ParameterDataType</code> <code>dataType</code>, or <code>null</code> if not present
     */
    @Nullable ParameterDataType getDataType();
    
    /**
     * Is this field mandatory
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mandatory</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isMandatory();
    
    /**
     * The default value for this field
     *
     *
     *
     * @return <code>java.lang.String</code> <code>defaultValue</code>, or <code>null</code> if not present
     */
    @Nullable String getDefaultValue();
    
    /**
     * NSD parameter pool name to use for this parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>parameterPool</code>, or <code>null</code> if not present
     */
    @Nullable String getParameterPool();

}

