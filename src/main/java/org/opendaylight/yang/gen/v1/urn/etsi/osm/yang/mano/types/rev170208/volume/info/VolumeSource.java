package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.volume.info;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VolumeInfo;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Defines the source of the volume. Possible options are 1. Ephemeral -- Empty 
 * disk 2. Image -- Refer to image to be used for volume 3. Volume -- Reference of 
 * pre-existing volume to be used 
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice volume-source {
 *   case ephemeral {
 *     leaf ephemeral {
 *       type empty;
 *     }
 *   }
 *   case image {
 *     uses image-properties;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/volume-info/volume-source</i>
 *
 */
public interface VolumeSource
    extends
    ChoiceIn<VolumeInfo>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("volume-source");


}

