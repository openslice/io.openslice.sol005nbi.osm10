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
 * grouping vm-flavor-name {
 *   leaf vm-flavor-name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vm-flavor-name</i>
 *
 */
public interface VmFlavorName
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vm-flavor-name");

    @Override
    Class<? extends VmFlavorName> implementedInterface();
    
    /**
     * flavor name to be used while creating vm using cloud account
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vmFlavorName</code>, or <code>null</code> if not present
     */
    @Nullable String getVmFlavorName();

}

