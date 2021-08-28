package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ui.primitive.group.ParameterGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ui.primitive.group.ParameterGroupKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping ui-primitive-group {
 *   list parameter-group {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     list parameter {
 *       key name;
 *       uses manotypes:primitive-parameter;
 *     }
 *     leaf mandatory {
 *       type boolean;
 *       default true;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ui-primitive-group</i>
 *
 */
public interface UiPrimitiveGroup
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ui-primitive-group");

    @Override
    Class<? extends UiPrimitiveGroup> implementedInterface();
    
    /**
     * Grouping of parameters which are logically grouped in UI
     *
     *
     *
     * @return <code>java.util.Map</code> <code>parameterGroup</code>, or <code>null</code> if not present
     */
    @Nullable Map<ParameterGroupKey, ParameterGroup> getParameterGroup();
    
    /**
     * @return <code>java.util.Map</code> <code>parameterGroup</code>, or an empty list if it is not present
     */
    default @NonNull Map<ParameterGroupKey, ParameterGroup> nonnullParameterGroup() {
        return CodeHelpers.nonnull(getParameterGroup());
    }

}

