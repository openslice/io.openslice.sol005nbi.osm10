package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.sapd.CpdOrVirtualLink;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Provides the descriptor of a service access point of the network service.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list sapd {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf address-assignment {
 *     type boolean;
 *   }
 *   choice cpd-or-virtual-link {
 *     case virtual-link-desc {
 *       leaf virtual-link-desc {
 *         type leafref {
 *           path ../../virtual-link-desc/id;
 *         }
 *       }
 *     }
 *     case vnf {
 *       container vnf {
 *         leaf vnfd-id {
 *           type leafref {
 *             path ../../../../vnfd/id;
 *           }
 *           must boolean(../../../vnfd-id[.=current()]);
 *         }
 *         leaf ext-cpd-id {
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
 *             path ../../../../pnfd/id;
 *           }
 *           must boolean(../pnfd-id[.=current()]);
 *         }
 *         leaf ext-cpd-id {
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
 *             path ../../../../nsd/id;
 *           }
 *           must boolean(../nsd-id[.=current()]);
 *         }
 *         leaf ext-cpd-id {
 *           type leafref {
 *             path deref(../nsd-id)/../sapd/id;
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/sapd</i>
 * 
 * <p>To create instances of this class use {@link SapdBuilder}.
 * @see SapdBuilder
 * @see SapdKey
 *
 */
public interface Sapd
    extends
    ChildOf<Nsd>,
    Augmentable<Sapd>,
    Identifiable<SapdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("sapd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Sapd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Sapd.class;
    }
    
    /**
     * Identifier of this Cpd information element.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Specify whether the SAP address assignment is under the responsibility of
     * management and orchestration functions or not. If it is set to True, management
     * and orchestration functions are responsible for assigning addresses to the
     * access points instantiated from this SAPD.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>addressAssignment</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isAddressAssignment();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.sapd.CpdOrVirtualLink</code> <code>cpdOrVirtualLink</code>, or <code>null</code> if not present
     */
    @Nullable CpdOrVirtualLink getCpdOrVirtualLink();
    
    @Override
    SapdKey key();

}

