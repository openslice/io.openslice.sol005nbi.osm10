package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.volume.info.volume.source;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.volume.info.VolumeSource;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Empty;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case ephemeral {
 *   leaf ephemeral {
 *     type empty;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/volume-info/volume-source/ephemeral</i>
 *
 */
public interface Ephemeral
    extends
    DataObject,
    Augmentable<Ephemeral>,
    VolumeSource
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ephemeral");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.volume.info.volume.source.Ephemeral> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.volume.info.volume.source.Ephemeral.class;
    }
    
    /**
     * @return <code>org.opendaylight.yangtools.yang.common.Empty</code> <code>ephemeral</code>, or <code>null</code> if not present
     */
    @Nullable Empty getEphemeral();

}

