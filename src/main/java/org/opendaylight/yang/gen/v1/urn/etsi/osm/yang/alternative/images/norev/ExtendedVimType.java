package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev;
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
 * This class represents the following YANG schema fragment defined in module <b>alternative-images</b>
 * <pre>
 * grouping extended-vim-type {
 *   leaf vim-type {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>alternative-images/extended-vim-type</i>
 *
 */
public interface ExtendedVimType
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-vim-type");

    @Override
    Class<? extends ExtendedVimType> implementedInterface();
    
    /**
     * VIM type: openvim, openstack, vmware, aws, etc.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vimType</code>, or <code>null</code> if not present
     */
    @Nullable String getVimType();

}

