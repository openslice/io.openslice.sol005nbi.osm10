package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.Nsr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.InstanceKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of scaling group records
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list scaling-group-record {
 *   key scaling-group-name-ref;
 *   leaf scaling-group-name-ref {
 *     type leafref {
 *       path ../../../../ns-instance-config/nsr[id=current()/../../ns-instance-config-ref]/nsd/scaling-group-descriptor/name;
 *     }
 *   }
 *   list instance {
 *     key instance-id;
 *     leaf instance-id {
 *       type uint16;
 *     }
 *     leaf is-default {
 *       type boolean;
 *     }
 *     leaf op-status {
 *       type enumeration {
 *         enum init;
 *         enum vnf-init-phase;
 *         enum running;
 *         enum terminate;
 *         enum vnf-terminate-phase;
 *         enum terminated;
 *         enum failed;
 *       }
 *     }
 *     leaf config-status {
 *       type config-states;
 *     }
 *     leaf error-msg {
 *       type string;
 *     }
 *     leaf create-time {
 *       type uint32;
 *     }
 *     leaf-list vnfrs {
 *       type leafref {
 *         path ../../../constituent-vnfr-ref/vnfr-id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:etsi:osm:yang:nsr?revision=2017-02-08)ns-instance-opdata/nsr/scaling-group-record</i>
 * 
 * <p>To create instances of this class use {@link ScalingGroupRecordBuilder}.
 * @see ScalingGroupRecordBuilder
 * @see ScalingGroupRecordKey
 *
 */
public interface ScalingGroupRecord
    extends
    ChildOf<Nsr>,
    Augmentable<ScalingGroupRecord>,
    Identifiable<ScalingGroupRecordKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-group-record");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecord> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecord.class;
    }
    
    /**
     * name of the scaling group
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>scalingGroupNameRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getScalingGroupNameRef();
    
    /**
     * Reference to scaling group instance record
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
    ScalingGroupRecordKey key();

}

