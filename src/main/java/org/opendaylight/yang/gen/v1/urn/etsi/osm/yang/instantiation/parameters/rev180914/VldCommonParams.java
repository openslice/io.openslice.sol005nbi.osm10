package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_common_params.IpProfile;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * grouping vld_common_params {
 *   leaf name {
 *     type string;
 *   }
 *   leaf vim-network-name {
 *     type string;
 *   }
 *   container ip-profile {
 *     uses ip-profile-update-schema;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vld_common_params</i>
 *
 */
public interface VldCommonParams
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vld_common_params");

    @Override
    Class<? extends VldCommonParams> implementedInterface();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>vimNetworkName</code>, or <code>null</code> if not present
     */
    @Nullable String getVimNetworkName();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_common_params.IpProfile</code> <code>ipProfile</code>, or <code>null</code> if not present
     */
    @Nullable IpProfile getIpProfile();

}

