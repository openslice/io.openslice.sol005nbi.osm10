package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Vnffgd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.ConstituentBaseElementId;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.ConstituentCpdId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes a pool of descriptors of connection points attached to one of the 
 * constituent VNFs and PNFs and/or one of the SAPs of the parent NS or of a 
 * NS.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list cpd-pool {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   choice constituent-base-element-id {
 *     case vnf-profile {
 *       container vnf-profile {
 *         leaf vnf-profile-id {
 *           type leafref {
 *             path ../../../../../nsd/df/vnf-profile/id;
 *           }
 *         }
 *       }
 *     }
 *     case pnf-profile {
 *       container pnf-profile {
 *         leaf pnf-profile-id {
 *           type leafref {
 *             path ../../../../../nsd/df/pnf-profile/id;
 *           }
 *         }
 *       }
 *     }
 *     case ns-profile {
 *       container ns-profile {
 *         leaf ns-profile-id {
 *           type leafref {
 *             path ../../../../../nsd/df/ns-profile/id;
 *           }
 *         }
 *       }
 *     }
 *   }
 *   choice constituent-cpd-id {
 *     case vnf {
 *       container vnf {
 *         leaf vnfd-id {
 *           type leafref {
 *             path ../../../../../vnfd/id;
 *           }
 *         }
 *         leaf cpd-id {
 *           type leafref {
 *             path deref(../vnfd-id)/../ext-cpd/id;
 *           }
 *         }
 *       }
 *     }
 *     case pnf {
 *       container pnf {
 *         leaf pnfd-id {
 *           type leafref {
 *             path ../../../../../pnfd/id;
 *           }
 *         }
 *         leaf pnf-cpd-id {
 *           type leafref {
 *             path deref(../pnfd-id)/../ext-cpd/id;
 *           }
 *         }
 *       }
 *     }
 *     case ns {
 *       container ns {
 *         leaf nsd-id {
 *           type leafref {
 *             path ../../../../../nsd/id;
 *           }
 *         }
 *         leaf sap-cpd-id {
 *           type leafref {
 *             path deref(../nsd-id)/../sapd/id;
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/vnffgd/cpd-pool</i>
 * 
 * <p>To create instances of this class use {@link CpdPoolBuilder}.
 * @see CpdPoolBuilder
 * @see CpdPoolKey
 *
 */
public interface CpdPool
    extends
    ChildOf<Vnffgd>,
    Augmentable<CpdPool>,
    Identifiable<CpdPoolKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cpd-pool");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.CpdPool> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.CpdPool.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Reference to the profile of an NS constituent.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.ConstituentBaseElementId</code> <code>constituentBaseElementId</code>, or <code>null</code> if not present
     */
    @Nullable ConstituentBaseElementId getConstituentBaseElementId();
    
    /**
     * A reference to the descriptor of a connection point attached to one of the
     * constituent VNFs and PNFs or to the descriptor of a NS SAP.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.ConstituentCpdId</code> <code>constituentCpdId</code>, or <code>null</code> if not present
     */
    @Nullable ConstituentCpdId getConstituentCpdId();
    
    @Override
    CpdPoolKey key();

}

