package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceSubnet;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceSubnetKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceVld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceVldKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>netslice-instantiation-parameters</b>
 * <pre>
 * grouping netslice_params {
 *   leaf vimAccountId {
 *     type string;
 *   }
 *   leaf ssh_keys {
 *     type string;
 *   }
 *   list netslice-subnet {
 *     key id;
 *     uses netslice_subnet_params;
 *   }
 *   list netslice-vld {
 *     key name;
 *     uses netslice_vld_params;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>netslice-instantiation-parameters/netslice_params</i>
 *
 */
public interface NetsliceParams
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("netslice_params");

    @Override
    Class<? extends NetsliceParams> implementedInterface();
    
    /**
     * @return <code>java.lang.String</code> <code>vimAccountId</code>, or <code>null</code> if not present
     */
    @Nullable String getVimAccountId();
    
    /**
     * @return <code>java.lang.String</code> <code>sshKeys</code>, or <code>null</code> if not present
     */
    @Nullable String getSshKeys();
    
    /**
     * @return <code>java.util.Map</code> <code>netsliceSubnet</code>, or <code>null</code> if not present
     */
    @Nullable Map<NetsliceSubnetKey, NetsliceSubnet> getNetsliceSubnet();
    
    /**
     * @return <code>java.util.Map</code> <code>netsliceSubnet</code>, or an empty list if it is not present
     */
    default @NonNull Map<NetsliceSubnetKey, NetsliceSubnet> nonnullNetsliceSubnet() {
        return CodeHelpers.nonnull(getNetsliceSubnet());
    }
    
    /**
     * @return <code>java.util.Map</code> <code>netsliceVld</code>, or <code>null</code> if not present
     */
    @Nullable Map<NetsliceVldKey, NetsliceVld> getNetsliceVld();
    
    /**
     * @return <code>java.util.Map</code> <code>netsliceVld</code>, or an empty list if it is not present
     */
    default @NonNull Map<NetsliceVldKey, NetsliceVld> nonnullNetsliceVld() {
        return CodeHelpers.nonnull(getNetsliceVld());
    }

}

