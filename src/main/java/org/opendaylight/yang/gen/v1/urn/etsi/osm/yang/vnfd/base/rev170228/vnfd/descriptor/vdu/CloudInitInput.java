package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates how the contents of cloud-init script are provided. There are 2 
 * choices - inline or in a file
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
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
 * <i>vnfd-base/vnfd-descriptor/vdu/cloud-init-input</i>
 *
 */
public interface CloudInitInput
    extends
    ChoiceIn<Vdu>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cloud-init-input");


}

