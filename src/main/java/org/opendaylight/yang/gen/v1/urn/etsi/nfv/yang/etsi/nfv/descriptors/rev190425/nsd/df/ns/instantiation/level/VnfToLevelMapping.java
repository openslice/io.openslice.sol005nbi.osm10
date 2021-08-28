package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsInstantiationLevel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * Specifies the profile of the VNFs involved in this NS level and, for each of 
 * them, the required number of instances.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list vnf-to-level-mapping {
 *   key vnf-profile-id;
 *   leaf vnf-profile-id {
 *     type leafref {
 *       path ../../../vnf-profile/id;
 *     }
 *   }
 *   leaf number-of-instances {
 *     default 1;
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/ns-instantiation-level/vnf-to-level-mapping</i>
 * 
 * <p>To create instances of this class use {@link VnfToLevelMappingBuilder}.
 * @see VnfToLevelMappingBuilder
 * @see VnfToLevelMappingKey
 *
 */
public interface VnfToLevelMapping
    extends
    ChildOf<NsInstantiationLevel>,
    Augmentable<VnfToLevelMapping>,
    Identifiable<VnfToLevelMappingKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-to-level-mapping");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.VnfToLevelMapping> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.VnfToLevelMapping.class;
    }
    
    /**
     * Identifies the profile to be used for a VNF involved in an NS level.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfProfileId</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfProfileId();
    
    /**
     * Specifies the number of VNF instances required for an NS level.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>numberOfInstances</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getNumberOfInstances();
    
    @Override
    VnfToLevelMappingKey key();

}

