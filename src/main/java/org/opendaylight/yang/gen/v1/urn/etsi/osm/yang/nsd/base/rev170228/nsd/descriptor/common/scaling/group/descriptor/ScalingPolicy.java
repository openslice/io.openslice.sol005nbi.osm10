package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ScalingCriteriaOperation;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ScalingPolicyType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteriaKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list scaling-policy {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf scaling-type {
 *     type manotypes:scaling-policy-type;
 *   }
 *   leaf enabled {
 *     type boolean;
 *     default true;
 *   }
 *   leaf scale-in-operation-type {
 *     type manotypes:scaling-criteria-operation;
 *     default AND;
 *   }
 *   leaf scale-out-operation-type {
 *     type manotypes:scaling-criteria-operation;
 *     default OR;
 *   }
 *   leaf threshold-time {
 *     type uint32;
 *   }
 *   leaf cooldown-time {
 *     type uint32;
 *   }
 *   list scaling-criteria {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf scale-in-threshold {
 *       type uint64;
 *     }
 *     leaf scale-in-relational-operation {
 *       type manotypes:relational-operation-type;
 *       default LE;
 *     }
 *     leaf scale-out-threshold {
 *       type uint64;
 *     }
 *     leaf scale-out-relational-operation {
 *       type manotypes:relational-operation-type;
 *       default GE;
 *     }
 *     leaf ns-monitoring-param-ref {
 *       type leafref {
 *         path ../../../../monitoring-param/id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor/scaling-policy</i>
 * 
 * <p>To create instances of this class use {@link ScalingPolicyBuilder}.
 * @see ScalingPolicyBuilder
 * @see ScalingPolicyKey
 *
 */
public interface ScalingPolicy
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<ScalingPolicy>,
    Identifiable<ScalingPolicyKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-policy");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy.class;
    }
    
    /**
     * Name of the scaling policy
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Type of scaling
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ScalingPolicyType</code> <code>scalingType</code>, or <code>null</code> if not present
     */
    @Nullable ScalingPolicyType getScalingType();
    
    /**
     * Specifies if the scaling policy can be applied
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enabled</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isEnabled();
    
    /**
     * Operation to be applied to check between scaling criterias to check if the scale
     * in threshold condition has been met. Defaults to AND
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ScalingCriteriaOperation</code> <code>scaleInOperationType</code>, or <code>null</code> if not present
     */
    @Nullable ScalingCriteriaOperation getScaleInOperationType();
    
    /**
     * Operation to be applied to check between scaling criterias to check if the scale
     * out threshold condition has been met. Defauls to OR
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ScalingCriteriaOperation</code> <code>scaleOutOperationType</code>, or <code>null</code> if not present
     */
    @Nullable ScalingCriteriaOperation getScaleOutOperationType();
    
    /**
     * The duration for which the criteria must hold true
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>thresholdTime</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getThresholdTime();
    
    /**
     * The duration after a scaling-in/scaling-out action has been triggered, for which
     * there will be no further optional
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>cooldownTime</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getCooldownTime();
    
    /**
     * list of conditions to be met for generating scaling requests
     *
     *
     *
     * @return <code>java.util.Map</code> <code>scalingCriteria</code>, or <code>null</code> if not present
     */
    @Nullable Map<ScalingCriteriaKey, ScalingCriteria> getScalingCriteria();
    
    /**
     * @return <code>java.util.Map</code> <code>scalingCriteria</code>, or an empty list if it is not present
     */
    default @NonNull Map<ScalingCriteriaKey, ScalingCriteria> nonnullScalingCriteria() {
        return CodeHelpers.nonnull(getScalingCriteria());
    }
    
    @Override
    ScalingPolicyKey key();

}

