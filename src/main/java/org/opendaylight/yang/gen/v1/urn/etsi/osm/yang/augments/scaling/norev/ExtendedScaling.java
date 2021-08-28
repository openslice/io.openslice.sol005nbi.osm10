package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.ScalingConfigAction;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.ScalingConfigActionKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.ScalingPolicy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.extended.scaling.ScalingPolicyKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>scaling</b>
 * <pre>
 * grouping extended-scaling {
 *   list scaling-policy {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf scaling-type {
 *       type common:scaling-policy-type;
 *     }
 *     leaf enabled {
 *       type boolean;
 *       default true;
 *     }
 *     leaf scale-in-operation-type {
 *       type common:scaling-criteria-operation;
 *       default AND;
 *     }
 *     leaf scale-out-operation-type {
 *       type common:scaling-criteria-operation;
 *       default OR;
 *     }
 *     leaf threshold-time {
 *       type uint32;
 *     }
 *     leaf cooldown-time {
 *       type uint32;
 *     }
 *     list scaling-criteria {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf scale-in-threshold {
 *         type decimal64 {
 *           fraction-digits 10;
 *         }
 *       }
 *       leaf scale-in-relational-operation {
 *         type common:relational-operation-type;
 *         default LE;
 *       }
 *       leaf scale-out-threshold {
 *         type decimal64 {
 *           fraction-digits 10;
 *         }
 *       }
 *       leaf scale-out-relational-operation {
 *         type common:relational-operation-type;
 *         default GE;
 *       }
 *       leaf vnf-monitoring-param-ref {
 *         type string;
 *       }
 *     }
 *   }
 *   list scaling-config-action {
 *     key trigger;
 *     leaf trigger {
 *       type common:scaling-trigger;
 *     }
 *     leaf vnf-config-primitive-name-ref {
 *       type leafref {
 *         path /vnfd:vnfd/vnfd:df/vnfd:lcm-operations-configuration/vnfd:operate-vnf-op-config/day1-2:day1-2/day1-2:config-primitive/day1-2:name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>scaling/extended-scaling</i>
 *
 */
public interface ExtendedScaling
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-scaling");

    @Override
    Class<? extends ExtendedScaling> implementedInterface();
    
    /**
     * @return <code>java.util.Map</code> <code>scalingPolicy</code>, or <code>null</code> if not present
     */
    @Nullable Map<ScalingPolicyKey, ScalingPolicy> getScalingPolicy();
    
    /**
     * @return <code>java.util.Map</code> <code>scalingPolicy</code>, or an empty list if it is not present
     */
    default @NonNull Map<ScalingPolicyKey, ScalingPolicy> nonnullScalingPolicy() {
        return CodeHelpers.nonnull(getScalingPolicy());
    }
    
    /**
     * List of scaling config actions
     *
     *
     *
     * @return <code>java.util.Map</code> <code>scalingConfigAction</code>, or <code>null</code> if not present
     */
    @Nullable Map<ScalingConfigActionKey, ScalingConfigAction> getScalingConfigAction();
    
    /**
     * @return <code>java.util.Map</code> <code>scalingConfigAction</code>, or an empty list if it is not present
     */
    default @NonNull Map<ScalingConfigActionKey, ScalingConfigAction> nonnullScalingConfigAction() {
        return CodeHelpers.nonnull(getScalingConfigAction());
    }

}

