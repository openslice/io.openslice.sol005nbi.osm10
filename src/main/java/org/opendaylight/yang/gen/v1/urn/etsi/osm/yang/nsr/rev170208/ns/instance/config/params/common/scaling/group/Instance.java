package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.scaling.group;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint16;

/**
 * The instance of the scaling group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list instance {
 *   key id;
 *   leaf id {
 *     type uint16;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common/scaling-group/instance</i>
 * 
 * <p>To create instances of this class use {@link InstanceBuilder}.
 * @see InstanceBuilder
 * @see InstanceKey
 *
 */
public interface Instance
    extends
    ChildOf<ScalingGroup>,
    Augmentable<Instance>,
    Identifiable<InstanceKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("instance");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance.class;
    }
    
    /**
     * Scaling group instance uuid
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getId();
    
    @Override
    InstanceKey key();

}

