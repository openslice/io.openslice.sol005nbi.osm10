package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates the type of management endpoint.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * choice endpoint-type {
 *   case ip {
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 *   case vdu-id {
 *     leaf vdu-id {
 *       type leafref {
 *         path ../../vdu/id;
 *       }
 *     }
 *   }
 *   case cp {
 *     leaf cp {
 *       type leafref {
 *         path ../../connection-point/name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/endpoint-type</i>
 *
 */
public interface EndpointType
    extends
    ChoiceIn<MgmtInterface>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("endpoint-type");


}

