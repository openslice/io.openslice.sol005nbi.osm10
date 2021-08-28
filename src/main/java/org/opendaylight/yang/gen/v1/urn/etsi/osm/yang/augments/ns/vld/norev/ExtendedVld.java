package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.extended.vld.ProviderNetwork;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ns-vld</b>
 * <pre>
 * grouping extended-vld {
 *   container provider-network {
 *     leaf physical-network {
 *       type string;
 *     }
 *     leaf segmentation_id {
 *       type uint32;
 *     }
 *   }
 *   leaf mgmt-network {
 *     type boolean;
 *     default false;
 *   }
 *   leaf vim-network-name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ns-vld/extended-vld</i>
 *
 */
public interface ExtendedVld
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-vld");

    @Override
    Class<? extends ExtendedVld> implementedInterface();
    
    /**
     * Container for the provider network.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.extended.vld.ProviderNetwork</code> <code>providerNetwork</code>, or <code>null</code> if not present
     */
    @Nullable ProviderNetwork getProviderNetwork();
    
    /**
     * Flag indicating whether this network is a VIM management network
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mgmtNetwork</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isMgmtNetwork();
    
    /**
     * Name of network in VIM account. This is used to indicate pre-provisioned network
     * name in cloud account.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vimNetworkName</code>, or <code>null</code> if not present
     */
    @Nullable String getVimNetworkName();

}

