package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev;
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
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * grouping description {
 *   leaf description {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/description</i>
 *
 */
public interface Description
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("description");

    @Override
    Class<? extends Description> implementedInterface();
    
    /**
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();

}

