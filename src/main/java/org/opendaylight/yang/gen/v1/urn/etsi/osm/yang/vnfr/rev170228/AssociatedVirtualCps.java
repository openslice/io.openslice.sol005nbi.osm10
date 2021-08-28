package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.associated.virtual.cps.VirtualCps;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.associated.virtual.cps.VirtualCpsKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * grouping associated-virtual-cps {
 *   list virtual-cps {
 *     key name;
 *     uses vnfd-base:common-connection-point;
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf mac-address {
 *       type string;
 *     }
 *     leaf connection-point-id {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/associated-virtual-cps</i>
 *
 */
public interface AssociatedVirtualCps
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("associated-virtual-cps");

    @Override
    Class<? extends AssociatedVirtualCps> implementedInterface();
    
    /**
     * @return <code>java.util.Map</code> <code>virtualCps</code>, or <code>null</code> if not present
     */
    @Nullable Map<VirtualCpsKey, VirtualCps> getVirtualCps();
    
    /**
     * @return <code>java.util.Map</code> <code>virtualCps</code>, or an empty list if it is not present
     */
    default @NonNull Map<VirtualCpsKey, VirtualCps> nonnullVirtualCps() {
        return CodeHelpers.nonnull(getVirtualCps());
    }

}

