package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.profile;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.NsProfile;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Identifies an affinity or anti-affinity group the NSs created according to this 
 * NsProfile belongs to.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list affinity-or-anti-affinity-group-id {
 *   key id;
 *   leaf id {
 *     type leafref {
 *       path ../../../affinity-or-anti-affinity-group/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/ns-profile/affinity-or-anti-affinity-group-id</i>
 * 
 * <p>To create instances of this class use {@link AffinityOrAntiAffinityGroupIdBuilder}.
 * @see AffinityOrAntiAffinityGroupIdBuilder
 * @see AffinityOrAntiAffinityGroupIdKey
 *
 */
public interface AffinityOrAntiAffinityGroupId
    extends
    ChildOf<NsProfile>,
    Augmentable<AffinityOrAntiAffinityGroupId>,
    Identifiable<AffinityOrAntiAffinityGroupIdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("affinity-or-anti-affinity-group-id");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.profile.AffinityOrAntiAffinityGroupId> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.profile.AffinityOrAntiAffinityGroupId.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    @Override
    AffinityOrAntiAffinityGroupIdKey key();

}

