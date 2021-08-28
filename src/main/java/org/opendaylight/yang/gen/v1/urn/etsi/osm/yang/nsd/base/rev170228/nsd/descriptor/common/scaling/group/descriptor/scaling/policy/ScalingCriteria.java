package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RelationalOperationType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * list of conditions to be met for generating scaling requests
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list scaling-criteria {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf scale-in-threshold {
 *     type uint64;
 *   }
 *   leaf scale-in-relational-operation {
 *     type manotypes:relational-operation-type;
 *     default LE;
 *   }
 *   leaf scale-out-threshold {
 *     type uint64;
 *   }
 *   leaf scale-out-relational-operation {
 *     type manotypes:relational-operation-type;
 *     default GE;
 *   }
 *   leaf ns-monitoring-param-ref {
 *     type leafref {
 *       path ../../../../monitoring-param/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor/scaling-policy/scaling-criteria</i>
 * 
 * <p>To create instances of this class use {@link ScalingCriteriaBuilder}.
 * @see ScalingCriteriaBuilder
 * @see ScalingCriteriaKey
 *
 */
public interface ScalingCriteria
    extends
    ChildOf<ScalingPolicy>,
    Augmentable<ScalingCriteria>,
    Identifiable<ScalingCriteriaKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-criteria");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Value below which scale-in requests are generated
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>scaleInThreshold</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getScaleInThreshold();
    
    /**
     * The relational operator used to compare the monitoring param against the
     * scale-in-threshold.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RelationalOperationType</code> <code>scaleInRelationalOperation</code>, or <code>null</code> if not present
     */
    @Nullable RelationalOperationType getScaleInRelationalOperation();
    
    /**
     * Value above which scale-out requests are generated
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>scaleOutThreshold</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getScaleOutThreshold();
    
    /**
     * The relational operator used to compare the monitoring param against the
     * scale-out-threshold.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RelationalOperationType</code> <code>scaleOutRelationalOperation</code>, or <code>null</code> if not present
     */
    @Nullable RelationalOperationType getScaleOutRelationalOperation();
    
    /**
     * Reference to the NS level monitoring parameter that is aggregated
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsMonitoringParamRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getNsMonitoringParamRef();
    
    @Override
    ScalingCriteriaKey key();

}

