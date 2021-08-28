package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Kdu;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates the KDU model, either as a helm-chart or as a juju-bundle.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * choice kdu-model {
 *   case helm-chart {
 *     leaf helm-chart {
 *       type string;
 *     }
 *     leaf helm-version {
 *       type enumeration {
 *         enum v2;
 *         enum v3;
 *       }
 *       default v3;
 *     }
 *   }
 *   case juju-bundle {
 *     leaf juju-bundle {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/kdu/kdu-model</i>
 *
 */
public interface KduModel
    extends
    ChoiceIn<Kdu>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("kdu-model");


}

