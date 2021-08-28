package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameter;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMapsKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.ScalingGroupKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping ns-instance-config-params-common {
 *   uses manotypes:input-parameter;
 *   list scaling-group {
 *     key scaling-group-name-ref;
 *     leaf scaling-group-name-ref {
 *       type string;
 *     }
 *     list instance {
 *       key id;
 *       leaf id {
 *         type uint16;
 *       }
 *     }
 *   }
 *   list nsd-placement-group-maps {
 *     key placement-group-ref;
 *     leaf placement-group-ref {
 *       type string;
 *     }
 *     uses manotypes:placement-group-input;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common</i>
 *
 */
public interface NsInstanceConfigParamsCommon
    extends
    DataObject,
    InputParameter
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ns-instance-config-params-common");

    @Override
    Class<? extends NsInstanceConfigParamsCommon> implementedInterface();
    
    /**
     * List of ns scaling group instances
     *
     *
     *
     * @return <code>java.util.Map</code> <code>scalingGroup</code>, or <code>null</code> if not present
     */
    @Nullable Map<ScalingGroupKey, ScalingGroup> getScalingGroup();
    
    /**
     * @return <code>java.util.Map</code> <code>scalingGroup</code>, or an empty list if it is not present
     */
    default @NonNull Map<ScalingGroupKey, ScalingGroup> nonnullScalingGroup() {
        return CodeHelpers.nonnull(getScalingGroup());
    }
    
    /**
     * Mapping from mano-placement groups construct from NSD to cloud platform
     * placement group construct
     *
     *
     *
     * @return <code>java.util.Map</code> <code>nsdPlacementGroupMaps</code>, or <code>null</code> if not present
     */
    @Nullable Map<NsdPlacementGroupMapsKey, NsdPlacementGroupMaps> getNsdPlacementGroupMaps();
    
    /**
     * @return <code>java.util.Map</code> <code>nsdPlacementGroupMaps</code>, or an empty list if it is not present
     */
    default @NonNull Map<NsdPlacementGroupMapsKey, NsdPlacementGroupMaps> nonnullNsdPlacementGroupMaps() {
        return CodeHelpers.nonnull(getNsdPlacementGroupMaps());
    }

}

