package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * output output {
 *   leaf instance-id {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-scale-in/output</i>
 * 
 * <p>To create instances of this class use {@link ExecScaleInOutputBuilder}.
 * @see ExecScaleInOutputBuilder
 *
 */
public interface ExecScaleInOutput
    extends
    RpcOutput,
    Augmentable<ExecScaleInOutput>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ExecScaleInOutput> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ExecScaleInOutput.class;
    }
    
    /**
     * id of the scaling group
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>instanceId</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getInstanceId();

}

