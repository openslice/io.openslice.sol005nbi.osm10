package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.control.param.ControlParamKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping control-param {
 *   list control-param {
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
 *     leaf min-value {
 *       type uint64;
 *     }
 *     leaf max-value {
 *       type uint64;
 *     }
 *     leaf current-value {
 *       type uint64;
 *     }
 *     leaf step-value {
 *       type uint64;
 *     }
 *     leaf units {
 *       type string;
 *     }
 *     leaf widget-type {
 *       type manotypes:widget-type;
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
 * <i>mano-types/control-param</i>
 *
 */
public interface ControlParam
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("control-param");

    @Override
    Class<? extends ControlParam> implementedInterface();
    
    /**
     * List of control parameters to manage and update the running configuration of the
     * VNF
     *
     *
     *
     * @return <code>java.util.Map</code> <code>controlParam</code>, or <code>null</code> if not present
     */
    @Nullable Map<ControlParamKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.control.param.ControlParam> getControlParam();
    
    /**
     * @return <code>java.util.Map</code> <code>controlParam</code>, or an empty list if it is not present
     */
    default @NonNull Map<ControlParamKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.control.param.ControlParam> nonnullControlParam() {
        return CodeHelpers.nonnull(getControlParam());
    }

}

