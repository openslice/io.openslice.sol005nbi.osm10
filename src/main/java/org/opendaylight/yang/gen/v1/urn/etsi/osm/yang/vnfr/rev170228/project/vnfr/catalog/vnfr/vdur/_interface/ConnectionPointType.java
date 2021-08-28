package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Interface;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * choice connection-point-type {
 *   case internal {
 *     leaf internal-connection-point-ref {
 *       type leafref {
 *         path ../../internal-connection-point/id;
 *       }
 *     }
 *   }
 *   case external {
 *     leaf external-connection-point-ref {
 *       type leafref {
 *         path ../../../connection-point/name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:etsi:osm:yang:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur/interface/connection-point-type</i>
 *
 */
public interface ConnectionPointType
    extends
    ChoiceIn<Interface>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point-type");


}

