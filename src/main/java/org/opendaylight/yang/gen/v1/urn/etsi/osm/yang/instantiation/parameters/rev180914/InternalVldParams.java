package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params.InternalConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params.InternalConnectionPointKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params.IpProfile;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * grouping internal_vld_params {
 *   leaf name {
 *     type string;
 *   }
 *   leaf vim-network-name {
 *     type string;
 *   }
 *   container ip-profile {
 *     uses ip-profile-update-schema;
 *   }
 *   list internal-connection-point {
 *     key id-ref;
 *     leaf id-ref {
 *       type string;
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/internal_vld_params</i>
 *
 */
public interface InternalVldParams
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("internal_vld_params");

    @Override
    Class<? extends InternalVldParams> implementedInterface();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>vimNetworkName</code>, or <code>null</code> if not present
     */
    @Nullable String getVimNetworkName();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params.IpProfile</code> <code>ipProfile</code>, or <code>null</code> if not present
     */
    @Nullable IpProfile getIpProfile();
    
    /**
     * @return <code>java.util.Map</code> <code>internalConnectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable Map<InternalConnectionPointKey, InternalConnectionPoint> getInternalConnectionPoint();
    
    /**
     * @return <code>java.util.Map</code> <code>internalConnectionPoint</code>, or an empty list if it is not present
     */
    default @NonNull Map<InternalConnectionPointKey, InternalConnectionPoint> nonnullInternalConnectionPoint() {
        return CodeHelpers.nonnull(getInternalConnectionPoint());
    }

}

