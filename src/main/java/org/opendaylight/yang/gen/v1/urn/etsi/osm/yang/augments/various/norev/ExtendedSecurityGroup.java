package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev;
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
 * This class represents the following YANG schema fragment defined in module <b>various</b>
 * <pre>
 * grouping extended-security-group {
 *   leaf security-group {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>various/extended-security-group</i>
 *
 */
public interface ExtendedSecurityGroup
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-security-group");

    @Override
    Class<? extends ExtendedSecurityGroup> implementedInterface();
    
    /**
     * Name of the security group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>securityGroup</code>, or <code>null</code> if not present
     */
    @Nullable String getSecurityGroup();

}

