package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.cloud.init.norev.extended.cloud.init;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.cloud.init.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.cloud.init.norev.ExtendedCloudInit;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates how the contents of cloud-init script are provided. There are 2 
 * choices - inline or in a file
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>cloud-init</b>
 * <pre>
 * choice cloud-init-input {
 *   case inline {
 *     leaf cloud-init {
 *       type string;
 *     }
 *   }
 *   case filename {
 *     leaf cloud-init-file {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>cloud-init/extended-cloud-init/cloud-init-input</i>
 *
 */
public interface CloudInitInput
    extends
    ChoiceIn<ExtendedCloudInit>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cloud-init-input");


}

