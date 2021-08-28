package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.CpdPool;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.CpdPoolKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.Nfpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.NfpdKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Provides the descriptors of the applicable forwarding graphs.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list vnffgd {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf-list vnf-profile-id {
 *     type leafref {
 *       path ../../df/vnf-profile/id;
 *     }
 *   }
 *   leaf-list pnf-profile-id {
 *     type leafref {
 *       path ../../df/pnf-profile/id;
 *     }
 *   }
 *   leaf-list nested-ns-profile-id {
 *     type leafref {
 *       path ../../df/ns-profile/id;
 *     }
 *   }
 *   leaf virtual-link-profile-id {
 *     type leafref {
 *       path ../../df/virtual-link-profile/id;
 *     }
 *   }
 *   list cpd-pool {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     choice constituent-base-element-id {
 *       case vnf-profile {
 *         container vnf-profile {
 *           leaf vnf-profile-id {
 *             type leafref {
 *               path ../../../../../nsd/df/vnf-profile/id;
 *             }
 *           }
 *         }
 *       }
 *       case pnf-profile {
 *         container pnf-profile {
 *           leaf pnf-profile-id {
 *             type leafref {
 *               path ../../../../../nsd/df/pnf-profile/id;
 *             }
 *           }
 *         }
 *       }
 *       case ns-profile {
 *         container ns-profile {
 *           leaf ns-profile-id {
 *             type leafref {
 *               path ../../../../../nsd/df/ns-profile/id;
 *             }
 *           }
 *         }
 *       }
 *     }
 *     choice constituent-cpd-id {
 *       case vnf {
 *         container vnf {
 *           leaf vnfd-id {
 *             type leafref {
 *               path ../../../../../vnfd/id;
 *             }
 *           }
 *           leaf cpd-id {
 *             type leafref {
 *               path deref(../vnfd-id)/../ext-cpd/id;
 *             }
 *           }
 *         }
 *       }
 *       case pnf {
 *         container pnf {
 *           leaf pnfd-id {
 *             type leafref {
 *               path ../../../../../pnfd/id;
 *             }
 *           }
 *           leaf pnf-cpd-id {
 *             type leafref {
 *               path deref(../pnfd-id)/../ext-cpd/id;
 *             }
 *           }
 *         }
 *       }
 *       case ns {
 *         container ns {
 *           leaf nsd-id {
 *             type leafref {
 *               path ../../../../../nsd/id;
 *             }
 *           }
 *           leaf sap-cpd-id {
 *             type leafref {
 *               path deref(../nsd-id)/../sapd/id;
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 *   list nfpd {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf rule {
 *       type string;
 *     }
 *     list position-desc-id {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       list cp-profile-id {
 *         key id;
 *         leaf id {
 *           type string;
 *         }
 *         list constituent-profile-elements {
 *           key id;
 *           leaf id {
 *             type string;
 *           }
 *           leaf cpd-id {
 *             type string;
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/vnffgd</i>
 * 
 * <p>To create instances of this class use {@link VnffgdBuilder}.
 * @see VnffgdBuilder
 * @see VnffgdKey
 *
 */
public interface Vnffgd
    extends
    ChildOf<Nsd>,
    Augmentable<Vnffgd>,
    Identifiable<VnffgdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Vnffgd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Vnffgd.class;
    }
    
    /**
     * Identifier of this Vnffgd information element. It uniquely identifies a VNFFGD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * References the VnfProfile of a constituent VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfProfileId</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getVnfProfileId();
    
    /**
     * References the PnfProfile of a constituent PNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pnfProfileId</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getPnfProfileId();
    
    /**
     * References the NsProfile of a nestedNS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>nestedNsProfileId</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getNestedNsProfileId();
    
    /**
     * References the Virtual Link Profile of a constituent VL.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>virtualLinkProfileId</code>, or <code>null</code> if not present
     */
    @Nullable String getVirtualLinkProfileId();
    
    /**
     * Describes a pool of descriptors of connection points attached to one of the
     * constituent VNFs and PNFs and/or one of the SAPs of the parent NS or of a nested
     * NS.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>cpdPool</code>, or <code>null</code> if not present
     */
    @Nullable Map<CpdPoolKey, CpdPool> getCpdPool();
    
    /**
     * @return <code>java.util.Map</code> <code>cpdPool</code>, or an empty list if it is not present
     */
    default @NonNull Map<CpdPoolKey, CpdPool> nonnullCpdPool() {
        return CodeHelpers.nonnull(getCpdPool());
    }
    
    /**
     * The network forwarding path associated to the VNFFG.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>nfpd</code>, or <code>null</code> if not present
     */
    @Nullable Map<NfpdKey, Nfpd> getNfpd();
    
    /**
     * @return <code>java.util.Map</code> <code>nfpd</code>, or an empty list if it is not present
     */
    default @NonNull Map<NfpdKey, Nfpd> nonnullNfpd() {
        return CodeHelpers.nonnull(getNfpd());
    }
    
    @Override
    VnffgdKey key();

}

