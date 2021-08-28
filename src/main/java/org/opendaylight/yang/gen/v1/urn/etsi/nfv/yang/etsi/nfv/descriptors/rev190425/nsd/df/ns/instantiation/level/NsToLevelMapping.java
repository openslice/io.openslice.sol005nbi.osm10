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
 * Specifies the profile of the nested NSs involved in this NS level and, for each 
 * of them, the required number of instances.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list ns-to-level-mapping {
 *   key ns-profile-id;
 *   leaf ns-profile-id {
 *     type leafref {
 *       path ../../../ns-profile/id;
 *     }
 *   }
 *   leaf number-of-instances {
 *     default 1;
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/ns-instantiation-level/ns-to-level-mapping</i>
 * 
 * <p>To create instances of this class use {@link NsToLevelMappingBuilder}.
 * @see NsToLevelMappingBuilder
 * @see NsToLevelMappingKey
 *
 */
public interface NsToLevelMapping
    extends
    ChildOf<NsInstantiationLevel>,
    Augmentable<NsToLevelMapping>,
    Identifiable<NsToLevelMappingKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ns-to-level-mapping");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.NsToLevelMapping> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level.NsToLevelMapping.class;
    }
    
    /**
     * Identifies the profile to be used for a nested NS involved in the NS level.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsProfileId</code>, or <code>null</code> if not present
     */
    @Nullable String getNsProfileId();
    
    /**
     * Specifies the number of nested NS instances required for the NS scale level.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>numberOfInstances</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getNumberOfInstances();
    
    @Override
    NsToLevelMappingKey key();

}

