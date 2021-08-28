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
 * grouping image-properties {
 *   leaf image {
 *     type string;
 *   }
 *   leaf image-checksum {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/image-properties</i>
 *
 */
public interface ImageProperties
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("image-properties");

    @Override
    Class<? extends ImageProperties> implementedInterface();
    
    /**
     * Image name for the software image. If the image name is found within the VNF
     * package it will be uploaded to all VIM accounts during onboarding process.
     * Otherwise, the image must be added to the VIM account with the same name as
     * entered here. 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>image</code>, or <code>null</code> if not present
     */
    @Nullable String getImage();
    
    /**
     * Image md5sum for the software image. The md5sum, if provided, along with the
     * image name uniquely identifies an image uploaded to the CAL. 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>imageChecksum</code>, or <code>null</code> if not present
     */
    @Nullable String getImageChecksum();

}

