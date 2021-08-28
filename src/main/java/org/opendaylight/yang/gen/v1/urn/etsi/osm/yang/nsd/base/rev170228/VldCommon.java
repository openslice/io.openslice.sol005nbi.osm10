package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VirtualLinkType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * List of Virtual Link Descriptors.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping vld-common {
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf short-name {
 *     type string;
 *   }
 *   leaf vendor {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf version {
 *     type string;
 *   }
 *   leaf type {
 *     type manotypes:virtual-link-type;
 *   }
 *   leaf root-bandwidth {
 *     type uint64;
 *   }
 *   leaf leaf-bandwidth {
 *     type uint64;
 *   }
 *   uses manotypes:provider-network;
 *   leaf mgmt-network {
 *     type boolean;
 *     default false;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/vld-common</i>
 *
 */
public interface VldCommon
    extends
    DataObject,
    ProviderNetwork
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vld-common");

    @Override
    Class<? extends VldCommon> implementedInterface();
    
    /**
     * Identifier for the VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Virtual Link Descriptor (VLD) name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Short name to appear as label in the UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    @Nullable String getShortName();
    
    /**
     * Provider of the VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    @Nullable String getVendor();
    
    /**
     * Description of the VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * Version of the VLD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    @Nullable String getVersion();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VirtualLinkType</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable VirtualLinkType getType();
    
    /**
     * For ELAN this is the aggregate bandwidth.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>rootBandwidth</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getRootBandwidth();
    
    /**
     * For ELAN this is the bandwidth of branches.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>leafBandwidth</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getLeafBandwidth();
    
    /**
     * Flag indicating whether this network is a VIM management network
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mgmtNetwork</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isMgmtNetwork();

}

