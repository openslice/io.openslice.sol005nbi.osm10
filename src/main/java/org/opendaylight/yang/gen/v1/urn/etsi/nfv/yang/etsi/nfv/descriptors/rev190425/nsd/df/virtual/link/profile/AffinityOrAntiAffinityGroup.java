package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VirtualLinkProfile;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Identifies an affinity or anti-affinity group the VLs instantiated according to 
 * the VlProfile belong to.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list affinity-or-anti-affinity-group {
 *   key id;
 *   leaf id {
 *     type leafref {
 *       path ../../../affinity-or-anti-affinity-group/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/virtual-link-profile/affinity-or-anti-affinity-group</i>
 * 
 * <p>To create instances of this class use {@link AffinityOrAntiAffinityGroupBuilder}.
 * @see AffinityOrAntiAffinityGroupBuilder
 * @see AffinityOrAntiAffinityGroupKey
 *
 */
public interface AffinityOrAntiAffinityGroup
    extends
    ChildOf<VirtualLinkProfile>,
    Augmentable<AffinityOrAntiAffinityGroup>,
    Identifiable<AffinityOrAntiAffinityGroupKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("affinity-or-anti-affinity-group");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.AffinityOrAntiAffinityGroup> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.virtual.link.profile.AffinityOrAntiAffinityGroup.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    @Override
    AffinityOrAntiAffinityGroupKey key();

}

