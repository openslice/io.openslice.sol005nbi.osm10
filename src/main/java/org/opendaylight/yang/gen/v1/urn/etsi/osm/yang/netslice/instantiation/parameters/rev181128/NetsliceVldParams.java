package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_vld_params.NssConnectionPointRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_vld_params.NssConnectionPointRefKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>netslice-instantiation-parameters</b>
 * <pre>
 * grouping netslice_vld_params {
 *   uses instantiation-parameters:vld_common_params;
 *   list nss-connection-point-ref {
 *     key "nss-ref nsd-connection-point-ref";
 *     leaf nss-ref {
 *       type leafref {
 *         path /nst:nst/nst:netslice-subnet/nst:id;
 *       }
 *     }
 *     leaf nsd-connection-point-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *       }
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>netslice-instantiation-parameters/netslice_vld_params</i>
 *
 */
public interface NetsliceVldParams
    extends
    DataObject,
    VldCommonParams
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("netslice_vld_params");

    @Override
    Class<? extends NetsliceVldParams> implementedInterface();
    
    /**
     * @return <code>java.util.Map</code> <code>nssConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable Map<NssConnectionPointRefKey, NssConnectionPointRef> getNssConnectionPointRef();
    
    /**
     * @return <code>java.util.Map</code> <code>nssConnectionPointRef</code>, or an empty list if it is not present
     */
    default @NonNull Map<NssConnectionPointRefKey, NssConnectionPointRef> nonnullNssConnectionPointRef() {
        return CodeHelpers.nonnull(getNssConnectionPointRef());
    }

}

