package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.action.param.ActionParamKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping action-param {
 *   list action-param {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf group-tag {
 *       type string;
 *     }
 *     leaf url {
 *       type inet:uri;
 *     }
 *     leaf method {
 *       type manotypes:http-method;
 *       default POST;
 *     }
 *     leaf payload {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/action-param</i>
 *
 */
public interface ActionParam
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("action-param");

    @Override
    Class<? extends ActionParam> implementedInterface();
    
    /**
     * List of action parameters to control VNF
     *
     *
     *
     * @return <code>java.util.Map</code> <code>actionParam</code>, or <code>null</code> if not present
     */
    @Nullable Map<ActionParamKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.action.param.ActionParam> getActionParam();
    
    /**
     * @return <code>java.util.Map</code> <code>actionParam</code>, or an empty list if it is not present
     */
    default @NonNull Map<ActionParamKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.action.param.ActionParam> nonnullActionParam() {
        return CodeHelpers.nonnull(getActionParam());
    }

}

