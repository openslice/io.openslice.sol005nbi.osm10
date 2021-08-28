package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * input input {
 *   uses rpc-common;
 *   leaf scaling-group-name-ref {
 *     type leafref {
 *       path /osm-project:project[osm-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:nsd/nsr:scaling-group-descriptor/nsr:name;
 *     }
 *   }
 *   leaf instance-id {
 *     type leafref {
 *       path /osm-project:project[osm-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:scaling-group[nsr:scaling-group-name-ref=current()/../nsr:scaling-group-name-ref]/nsr:instance/nsr:id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-scale-in/input</i>
 * 
 * <p>To create instances of this class use {@link ExecScaleInInputBuilder}.
 * @see ExecScaleInInputBuilder
 *
 */
public interface ExecScaleInInput
    extends
    RpcCommon,
    RpcInput,
    Augmentable<ExecScaleInInput>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ExecScaleInInput> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ExecScaleInInput.class;
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
     * id of the scaling group
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>instanceId</code>, or <code>null</code> if not present
     */
    @Nullable Object getInstanceId();

}

