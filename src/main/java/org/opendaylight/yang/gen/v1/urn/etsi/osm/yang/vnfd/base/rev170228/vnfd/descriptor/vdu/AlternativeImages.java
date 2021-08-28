package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of alternative images per VIM type. Different images can be used for 
 * specific types of VIMs instead of the default image. This allows deployments in 
 * sites where the image identifier in the VIM is given by the VIM provider and 
 * cannot be modified. If an alternative image is specified for a VIM type, it 
 * prevail over the default image
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list alternative-images {
 *   key vim-type;
 *   leaf vim-type {
 *     type string;
 *   }
 *   uses manotypes:image-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/alternative-images</i>
 * 
 * <p>To create instances of this class use {@link AlternativeImagesBuilder}.
 * @see AlternativeImagesBuilder
 * @see AlternativeImagesKey
 *
 */
public interface AlternativeImages
    extends
    ChildOf<Vdu>,
    Augmentable<AlternativeImages>,
    ImageProperties,
    Identifiable<AlternativeImagesKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("alternative-images");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages.class;
    }
    
    /**
     * VIM type: openvim, openstack, vmware, aws, etc.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vimType</code>, or <code>null</code> if not present
     */
    @Nullable String getVimType();
    
    @Override
    AlternativeImagesKey key();

}

