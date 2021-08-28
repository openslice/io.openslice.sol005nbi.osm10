package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.slice.connection.points;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.SliceConnectionPoints;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Logical connection of the CP to a NSVLD or to a NSD CP
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * choice connection {
 *   case netslice-vld-ref {
 *     leaf netslice-vld-id-ref {
 *       type leafref {
 *         path ../../netslice-vld/id;
 *       }
 *     }
 *   }
 *   case nsd-connection-point-ref {
 *     leaf nsd-id-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *       }
 *     }
 *     leaf nsd-connection-point-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/slice-connection-points/connection</i>
 *
 */
public interface Connection
    extends
    ChoiceIn<SliceConnectionPoints>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("connection");


}

