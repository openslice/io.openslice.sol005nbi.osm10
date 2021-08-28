package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
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
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * grouping resource-handle {
 *   leaf vim-id {
 *     type string;
 *   }
 *   leaf resource-provider-id {
 *     type string;
 *   }
 *   leaf resource-id {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/resource-handle</i>
 *
 */
public interface ResourceHandle
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("resource-handle");

    @Override
    Class<? extends ResourceHandle> implementedInterface();
    
    /**
     * @return <code>java.lang.String</code> <code>vimId</code>, or <code>null</code> if not present
     */
    @Nullable String getVimId();
    
    /**
     * @return <code>java.lang.String</code> <code>resourceProviderId</code>, or <code>null</code> if not present
     */
    @Nullable String getResourceProviderId();
    
    /**
     * @return <code>java.lang.String</code> <code>resourceId</code>, or <code>null</code> if not present
     */
    @Nullable String getResourceId();

}

