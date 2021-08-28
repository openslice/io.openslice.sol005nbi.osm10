package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigActionKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicyKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMemberKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * scaling group descriptor within this network service. The scaling group defines 
 * a group of VNFs, and the ratio of VNFs in the network service that is used as 
 * target for scaling action
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list scaling-group-descriptor {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   list scaling-policy {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf scaling-type {
 *       type manotypes:scaling-policy-type;
 *     }
 *     leaf enabled {
 *       type boolean;
 *       default true;
 *     }
 *     leaf scale-in-operation-type {
 *       type manotypes:scaling-criteria-operation;
 *       default AND;
 *     }
 *     leaf scale-out-operation-type {
 *       type manotypes:scaling-criteria-operation;
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
 *         type uint64;
 *       }
 *       leaf scale-in-relational-operation {
 *         type manotypes:relational-operation-type;
 *         default LE;
 *       }
 *       leaf scale-out-threshold {
 *         type uint64;
 *       }
 *       leaf scale-out-relational-operation {
 *         type manotypes:relational-operation-type;
 *         default GE;
 *       }
 *       leaf ns-monitoring-param-ref {
 *         type leafref {
 *           path ../../../../monitoring-param/id;
 *         }
 *       }
 *     }
 *   }
 *   list vnfd-member {
 *     key member-vnf-index-ref;
 *     leaf member-vnf-index-ref {
 *       type leafref {
 *         path ../../../constituent-vnfd/member-vnf-index;
 *       }
 *     }
 *     leaf count {
 *       type uint32;
 *       default 1;
 *     }
 *   }
 *   leaf min-instance-count {
 *     type uint32;
 *     default 0;
 *   }
 *   leaf max-instance-count {
 *     type uint32;
 *     default 10;
 *   }
 *   list scaling-config-action {
 *     key trigger;
 *     leaf trigger {
 *       type manotypes:scaling-trigger;
 *     }
 *     leaf ns-config-primitive-name-ref {
 *       type leafref {
 *         path ../../../ns-configuration/config-primitive/name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor</i>
 * 
 * <p>To create instances of this class use {@link ScalingGroupDescriptorBuilder}.
 * @see ScalingGroupDescriptorBuilder
 * @see ScalingGroupDescriptorKey
 *
 */
public interface ScalingGroupDescriptor
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<ScalingGroupDescriptor>,
    Identifiable<ScalingGroupDescriptorKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-group-descriptor");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor.class;
    }
    
    /**
     * Name of this scaling group.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
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
     * List of VNFs in this scaling group
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfdMember</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfdMemberKey, VnfdMember> getVnfdMember();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfdMember</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfdMemberKey, VnfdMember> nonnullVnfdMember() {
        return CodeHelpers.nonnull(getVnfdMember());
    }
    
    /**
     * Minimum instances of the scaling group which are allowed. These instances are
     * created by default when the network service is instantiated.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>minInstanceCount</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getMinInstanceCount();
    
    /**
     * Maximum instances of this scaling group that are allowed in a single network
     * service. The network service scaling will fail, when the number of service group
     * instances exceed the max-instance-count specified.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>maxInstanceCount</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getMaxInstanceCount();
    
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
    
    @Override
    ScalingGroupDescriptorKey key();

}

