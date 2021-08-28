package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.mgmt._interface.norev;
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
 * This class represents the following YANG schema fragment defined in module <b>mgmt-interface</b>
 * <pre>
 * grouping extended-mgmt-interface {
 *   leaf mgmt-cp {
 *     type leafref {
 *       path /vnfd:vnfd/vnfd:ext-cpd/vnfd:id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mgmt-interface/extended-mgmt-interface</i>
 *
 */
public interface ExtendedMgmtInterface
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-mgmt-interface");

    @Override
    Class<? extends ExtendedMgmtInterface> implementedInterface();
    
    /**
     * Connection point over which the VNF is managed.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mgmtCp</code>, or <code>null</code> if not present
     */
    @Nullable String getMgmtCp();

}

