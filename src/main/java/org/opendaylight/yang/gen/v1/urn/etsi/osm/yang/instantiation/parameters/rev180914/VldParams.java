package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_params.VnfdConnectionPointRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_params.VnfdConnectionPointRefKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * grouping vld_params {
 *   uses vld_common_params;
 *   list vnfd-connection-point-ref {
 *     key "member-vnf-index-ref vnfd-connection-point-ref";
 *     leaf member-vnf-index-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:constituent-vnfd/nsd:member-vnf-index;
 *       }
 *     }
 *     leaf vnfd-connection-point-ref {
 *       type leafref {
 *         path /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:connection-point/vnfd:name;
 *       }
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vld_params</i>
 *
 */
public interface VldParams
    extends
    DataObject,
    VldCommonParams
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vld_params");

    @Override
    Class<? extends VldParams> implementedInterface();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfdConnectionPointRefKey, VnfdConnectionPointRef> getVnfdConnectionPointRef();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfdConnectionPointRef</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfdConnectionPointRefKey, VnfdConnectionPointRef> nonnullVnfdConnectionPointRef() {
        return CodeHelpers.nonnull(getVnfdConnectionPointRef());
    }

}

