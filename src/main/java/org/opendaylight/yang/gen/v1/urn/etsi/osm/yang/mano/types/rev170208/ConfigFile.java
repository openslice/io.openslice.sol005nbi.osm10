package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.config.file.ConfigFileKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping for files needed to be mounted into an additional drive
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping config-file {
 *   list config-file {
 *     key source;
 *     leaf source {
 *       type string;
 *     }
 *     leaf dest {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/config-file</i>
 *
 */
public interface ConfigFile
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("config-file");

    @Override
    Class<? extends ConfigFile> implementedInterface();
    
    /**
     * List of configuration files to be written on an additional drive
     *
     *
     *
     * @return <code>java.util.Map</code> <code>configFile</code>, or <code>null</code> if not present
     */
    @Nullable Map<ConfigFileKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.config.file.ConfigFile> getConfigFile();
    
    /**
     * @return <code>java.util.Map</code> <code>configFile</code>, or an empty list if it is not present
     */
    default @NonNull Map<ConfigFileKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.config.file.ConfigFile> nonnullConfigFile() {
        return CodeHelpers.nonnull(getConfigFile());
    }

}

