package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.PrimaryId;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.SecondaryId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Specifies the order in which instances of the VNFs and/or nested NSs have to be 
 * created.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list dependencies {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   choice primary-id {
 *     case primary-vnf-profile {
 *       leaf primary-vnf-profile {
 *         type leafref {
 *           path ../../vnf-profile/vnfd-id;
 *         }
 *       }
 *     }
 *     case primary-ns-profile {
 *       leaf primary-ns-profile {
 *         type leafref {
 *           path ../../ns-profile/nsd-id;
 *         }
 *       }
 *     }
 *   }
 *   choice secondary-id {
 *     case secondary-vnf-profile {
 *       leaf secondary-vnf-profile {
 *         type leafref {
 *           path ../../vnf-profile/vnfd-id;
 *         }
 *       }
 *     }
 *     case secondary-ns-profile {
 *       leaf secondary-ns-profile {
 *         type leafref {
 *           path ../../ns-profile/nsd-id;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/dependencies</i>
 * 
 * <p>To create instances of this class use {@link DependenciesBuilder}.
 * @see DependenciesBuilder
 * @see DependenciesKey
 *
 */
public interface Dependencies
    extends
    ChildOf<Df>,
    Augmentable<Dependencies>,
    Identifiable<DependenciesKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("dependencies");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.Dependencies> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.Dependencies.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * References a VnfProfile or NsProfile.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.PrimaryId</code> <code>primaryId</code>, or <code>null</code> if not present
     */
    @Nullable PrimaryId getPrimaryId();
    
    /**
     * References a VnfProfile or NsProfile.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.SecondaryId</code> <code>secondaryId</code>, or <code>null</code> if not present
     */
    @Nullable SecondaryId getSecondaryId();
    
    @Override
    DependenciesKey key();

}

