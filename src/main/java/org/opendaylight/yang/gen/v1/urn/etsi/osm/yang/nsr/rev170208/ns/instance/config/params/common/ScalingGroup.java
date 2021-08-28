package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParamsCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.scaling.group.InstanceKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of ns scaling group instances
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list scaling-group {
 *   key scaling-group-name-ref;
 *   leaf scaling-group-name-ref {
 *     type string;
 *   }
 *   list instance {
 *     key id;
 *     leaf id {
 *       type uint16;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common/scaling-group</i>
 * 
 * <p>To create instances of this class use {@link ScalingGroupBuilder}.
 * @see ScalingGroupBuilder
 * @see ScalingGroupKey
 *
 */
public interface ScalingGroup
    extends
    ChildOf<NsInstanceConfigParamsCommon>,
    Augmentable<ScalingGroup>,
    Identifiable<ScalingGroupKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-group");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.ScalingGroup> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.ScalingGroup.class;
    }
    
    /**
     * name of the scaling group leafref path ../nsd/scaling-group-descriptor/name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>scalingGroupNameRef</code>, or <code>null</code> if not present
     */
    @Nullable String getScalingGroupNameRef();
    
    /**
     * The instance of the scaling group
     *
     *
     *
     * @return <code>java.util.Map</code> <code>instance</code>, or <code>null</code> if not present
     */
    @Nullable Map<InstanceKey, Instance> getInstance();
    
    /**
     * @return <code>java.util.Map</code> <code>instance</code>, or an empty list if it is not present
     */
    default @NonNull Map<InstanceKey, Instance> nonnullInstance() {
        return CodeHelpers.nonnull(getInstance());
    }
    
    @Override
    ScalingGroupKey key();

}

