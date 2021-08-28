package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.GuestEpa;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice cpu-policy {
 *   case cpu-pinning {
 *     leaf cpu-pinning-policy {
 *       type enumeration {
 *         enum DEDICATED;
 *         enum SHARED;
 *         enum ANY;
 *       }
 *       default ANY;
 *     }
 *     leaf cpu-thread-pinning-policy {
 *       type enumeration {
 *         enum AVOID;
 *         enum SEPARATE;
 *         enum ISOLATE;
 *         enum PREFER;
 *       }
 *     }
 *   }
 *   case cpu-quota {
 *     container cpu-quota {
 *       uses allocation-properties;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/cpu-policy</i>
 *
 */
public interface CpuPolicy
    extends
    ChoiceIn<GuestEpa>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cpu-policy");


}

