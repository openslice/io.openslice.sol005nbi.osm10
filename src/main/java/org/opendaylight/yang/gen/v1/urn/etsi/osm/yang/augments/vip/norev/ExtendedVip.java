package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.extended.vip.Vip;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.extended.vip.VipKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vip</b>
 * <pre>
 * grouping extended-vip {
 *   list vip {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     list paired-interfaces {
 *       key vdu-id-ref;
 *       leaf vdu-id-ref {
 *         type leafref {
 *           path /vnfd:vnfd/vnfd:vdu/vnfd:id;
 *         }
 *       }
 *       leaf interface-ref {
 *         type leafref {
 *           path /vnfd:vnfd/vnfd:vdu/vnfd:int-cpd/vnfd:virtual-network-interface-requirement/vnfd:name;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vip/extended-vip</i>
 *
 */
public interface ExtendedVip
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-vip");

    @Override
    Class<? extends ExtendedVip> implementedInterface();
    
    /**
     * Paired interfaces from different VDUs that share a Virtual IP
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vip</code>, or <code>null</code> if not present
     */
    @Nullable Map<VipKey, Vip> getVip();
    
    /**
     * @return <code>java.util.Map</code> <code>vip</code>, or an empty list if it is not present
     */
    default @NonNull Map<VipKey, Vip> nonnullVip() {
        return CodeHelpers.nonnull(getVip());
    }

}

