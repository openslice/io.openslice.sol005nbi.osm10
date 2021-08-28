package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.cloud.init.norev;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.cloud.init.norev.extended.cloud.init.CloudInitInput;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>cloud-init</b>
 * <pre>
 * grouping extended-cloud-init {
 *   choice cloud-init-input {
 *     case inline {
 *       leaf cloud-init {
 *         type string;
 *       }
 *     }
 *     case filename {
 *       leaf cloud-init-file {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>cloud-init/extended-cloud-init</i>
 *
 */
public interface ExtendedCloudInit
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-cloud-init");

    @Override
    Class<? extends ExtendedCloudInit> implementedInterface();
    
    /**
     * Indicates how the contents of cloud-init script are provided. There are 2
     * choices - inline or in a file
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.cloud.init.norev.extended.cloud.init.CloudInitInput</code> <code>cloudInitInput</code>, or <code>null</code> if not present
     */
    @Nullable CloudInitInput getCloudInitInput();

}

