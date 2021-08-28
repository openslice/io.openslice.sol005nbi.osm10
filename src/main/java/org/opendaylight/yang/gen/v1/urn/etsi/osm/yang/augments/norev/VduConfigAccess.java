package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vdu.config.access.ConfigAccess;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * grouping vdu-config-access {
 *   container config-access {
 *     container ssh-access {
 *       leaf required {
 *         type boolean;
 *         default false;
 *       }
 *       leaf default-user {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/vdu-config-access</i>
 *
 */
public interface VduConfigAccess
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-config-access");

    @Override
    Class<? extends VduConfigAccess> implementedInterface();
    
    /**
     * Indicates the way to access to the xNF or xDU for VCA configuration. For the
     * moment there is a single way (ssh-access).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vdu.config.access.ConfigAccess</code> <code>configAccess</code>, or <code>null</code> if not present
     */
    @Nullable ConfigAccess getConfigAccess();

}

