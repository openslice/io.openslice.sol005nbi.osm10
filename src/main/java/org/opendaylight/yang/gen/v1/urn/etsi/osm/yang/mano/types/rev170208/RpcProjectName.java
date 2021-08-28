package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping rpc-project-name {
 *   leaf project-name {
 *     default default;
 *     type leafref {
 *       path /osm-project:project/osm-project:name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/rpc-project-name</i>
 *
 */
public interface RpcProjectName
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("rpc-project-name");

    @Override
    Class<? extends RpcProjectName> implementedInterface();
    
    /**
     * Project to which this belongs
     *
     *
     *
     * @return <code>java.lang.String</code> <code>projectName</code>, or <code>null</code> if not present
     */
    @Nullable String getProjectName();

}

