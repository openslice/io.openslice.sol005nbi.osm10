package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping rpc-common {
 *   uses manotypes:rpc-project-name;
 *   leaf nsr_id_ref {
 *     type leafref {
 *       path /osm-project:project[osm-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr/nsr:id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/rpc-common</i>
 *
 */
public interface RpcCommon
    extends
    DataObject,
    RpcProjectName
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("rpc-common");

    @Override
    Class<? extends RpcCommon> implementedInterface();
    
    /**
     * Reference to NSR ID ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsrIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getNsrIdRef();

}

