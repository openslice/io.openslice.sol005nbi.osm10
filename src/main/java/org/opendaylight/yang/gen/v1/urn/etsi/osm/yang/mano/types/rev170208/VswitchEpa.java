package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vswitch-epa {
 *   container vswitch-epa {
 *     leaf ovs-acceleration {
 *       type enumeration {
 *         enum MANDATORY;
 *         enum PREFERRED;
 *         enum DISABLED;
 *       }
 *     }
 *     leaf ovs-offload {
 *       type enumeration {
 *         enum MANDATORY;
 *         enum PREFERRED;
 *         enum DISABLED;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vswitch-epa</i>
 *
 */
public interface VswitchEpa
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vswitch-epa");

    @Override
    Class<? extends VswitchEpa> implementedInterface();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vswitch.epa.VswitchEpa</code> <code>vswitchEpa</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vswitch.epa.@Nullable VswitchEpa getVswitchEpa();

}

