package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.pnf.profile.VirtualLinkConnectivity;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.pnf.profile.VirtualLinkConnectivityKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list pnf-profile {
 *   key id;
 *   must boolean(../../pnfd-id[.=current()/pnfd-id]) {
 *     error-message
 *       "PNFDs in the profile has to be listed as a dependency of the network service descriptor.";
 *   }
 *   leaf id {
 *     type string;
 *   }
 *   leaf pnfd-id {
 *     type leafref {
 *       path ../../../../pnfd/id;
 *     }
 *   }
 *   list virtual-link-connectivity {
 *     key virtual-link-profile-id;
 *     leaf virtual-link-profile-id {
 *       type leafref {
 *         path ../../../virtual-link-profile/id;
 *       }
 *     }
 *     list constituent-cpd-id {
 *       key constituent-base-element-id;
 *       leaf constituent-base-element-id {
 *         type leafref {
 *           path ../../../id;
 *         }
 *       }
 *       leaf constituent-cpd-id {
 *         type leafref {
 *           path deref(../../../pnfd-id)/../ext-cpd/id;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/pnf-profile</i>
 * 
 * <p>To create instances of this class use {@link PnfProfileBuilder}.
 * @see PnfProfileBuilder
 * @see PnfProfileKey
 *
 */
public interface PnfProfile
    extends
    ChildOf<Df>,
    Augmentable<PnfProfile>,
    Identifiable<PnfProfileKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("pnf-profile");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.PnfProfile> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.PnfProfile.class;
    }
    
    /**
     * Identifier of this PnfProfile information element. It uniquely identifies a
     * PnfProfile.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * References a PNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>pnfdId</code>, or <code>null</code> if not present
     */
    @Nullable String getPnfdId();
    
    /**
     * Defines the connection information of the PNF, it contains connection
     * relationship between a PNF connection point and a NS Virtual Link.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>virtualLinkConnectivity</code>, or <code>null</code> if not present
     */
    @Nullable Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> getVirtualLinkConnectivity();
    
    /**
     * @return <code>java.util.Map</code> <code>virtualLinkConnectivity</code>, or an empty list if it is not present
     */
    default @NonNull Map<VirtualLinkConnectivityKey, VirtualLinkConnectivity> nonnullVirtualLinkConnectivity() {
        return CodeHelpers.nonnull(getVirtualLinkConnectivity());
    }
    
    @Override
    PnfProfileKey key();

}

