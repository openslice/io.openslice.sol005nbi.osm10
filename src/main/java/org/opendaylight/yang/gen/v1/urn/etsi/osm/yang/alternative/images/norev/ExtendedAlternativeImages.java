package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>alternative-images</b>
 * <pre>
 * grouping extended-alternative-images {
 *   leaf-list alternative-sw-image-desc {
 *     type leafref {
 *       path /vnfd:vnfd/vnfd:sw-image-desc/vnfd:id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>alternative-images/extended-alternative-images</i>
 *
 */
public interface ExtendedAlternativeImages
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-alternative-images");

    @Override
    Class<? extends ExtendedAlternativeImages> implementedInterface();
    
    /**
     * List of alternative images per VIM type. Different images can be used for
     * specific types of VIMs instead of the default image. This allows deployments in
     * sites where the image identifier in the VIM is given by the VIM provider and
     * cannot be modified. If an alternative image is specified for a VIM type, it will
     * prevail over the default image
     *
     *
     *
     * @return <code>java.util.List</code> <code>alternativeSwImageDesc</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getAlternativeSwImageDesc();

}

