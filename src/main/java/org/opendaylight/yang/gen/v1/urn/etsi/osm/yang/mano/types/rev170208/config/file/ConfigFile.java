package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.config.file;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of configuration files to be written on an additional drive
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list config-file {
 *   key source;
 *   leaf source {
 *     type string;
 *   }
 *   leaf dest {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/config-file/config-file</i>
 * 
 * <p>To create instances of this class use {@link ConfigFileBuilder}.
 * @see ConfigFileBuilder
 * @see ConfigFileKey
 *
 */
public interface ConfigFile
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigFile>,
    Augmentable<ConfigFile>,
    Identifiable<ConfigFileKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("config-file");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.config.file.ConfigFile> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.config.file.ConfigFile.class;
    }
    
    /**
     * Name of the configuration file
     *
     *
     *
     * @return <code>java.lang.String</code> <code>source</code>, or <code>null</code> if not present
     */
    @Nullable String getSource();
    
    /**
     * Full path of the destination in the guest
     *
     *
     *
     * @return <code>java.lang.String</code> <code>dest</code>, or <code>null</code> if not present
     */
    @Nullable String getDest();
    
    @Override
    ConfigFileKey key();

}

