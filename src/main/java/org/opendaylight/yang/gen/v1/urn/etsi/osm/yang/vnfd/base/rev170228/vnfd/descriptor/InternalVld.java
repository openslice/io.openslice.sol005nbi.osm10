package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VirtualLinkType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InitParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPointKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * List of Internal Virtual Link Descriptors (VLD). The internal VLD describes the 
 * basic topology of the connectivity such as E-LAN, E-Line, E-Tree. between 
 * internal VNF components of the system.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list internal-vld {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf short-name {
 *     type string;
 *   }
 *   leaf description {
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
 *   list internal-connection-point {
 *     key id-ref;
 *     leaf id-ref {
 *       type leafref {
 *         path ../../../vdu/internal-connection-point/id;
 *       }
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 *   uses manotypes:provider-network;
 *   choice init-params {
 *     case vim-network-ref {
 *       leaf vim-network-name {
 *         type string;
 *       }
 *     }
 *     case vim-network-profile {
 *       leaf ip-profile-ref {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/internal-vld</i>
 * 
 * <p>To create instances of this class use {@link InternalVldBuilder}.
 * @see InternalVldBuilder
 * @see InternalVldKey
 *
 */
public interface InternalVld
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<InternalVld>,
    ProviderNetwork,
    Identifiable<InternalVldKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("internal-vld");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.InternalVld> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.InternalVld.class;
    }
    
    /**
     * Identifier for the VLD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Name of the internal VLD
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
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
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
     * List of internal connection points in this VLD
     *
     *
     *
     * @return <code>java.util.Map</code> <code>internalConnectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable Map<InternalConnectionPointKey, InternalConnectionPoint> getInternalConnectionPoint();
    
    /**
     * @return <code>java.util.Map</code> <code>internalConnectionPoint</code>, or an empty list if it is not present
     */
    default @NonNull Map<InternalConnectionPointKey, InternalConnectionPoint> nonnullInternalConnectionPoint() {
        return CodeHelpers.nonnull(getInternalConnectionPoint());
    }
    
    /**
     * Extra parameters for VLD instantiation
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InitParams</code> <code>initParams</code>, or <code>null</code> if not present
     */
    @Nullable InitParams getInitParams();
    
    @Override
    InternalVldKey key();

}

