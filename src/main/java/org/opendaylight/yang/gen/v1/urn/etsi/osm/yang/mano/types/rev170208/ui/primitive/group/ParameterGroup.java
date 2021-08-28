package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ui.primitive.group;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.UiPrimitiveGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ui.primitive.group.parameter.group.Parameter;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ui.primitive.group.parameter.group.ParameterKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping of parameters which are logically grouped in UI
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list parameter-group {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   list parameter {
 *     key name;
 *     uses manotypes:primitive-parameter;
 *   }
 *   leaf mandatory {
 *     type boolean;
 *     default true;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ui-primitive-group/parameter-group</i>
 * 
 * <p>To create instances of this class use {@link ParameterGroupBuilder}.
 * @see ParameterGroupBuilder
 * @see ParameterGroupKey
 *
 */
public interface ParameterGroup
    extends
    ChildOf<UiPrimitiveGroup>,
    Augmentable<ParameterGroup>,
    Identifiable<ParameterGroupKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("parameter-group");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ui.primitive.group.ParameterGroup> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ui.primitive.group.ParameterGroup.class;
    }
    
    /**
     * Name of the parameter group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * List of parameters for the service primitive.
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
    
    /**
     * Is this parameter group mandatory
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mandatory</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isMandatory();
    
    @Override
    ParameterGroupKey key();

}

