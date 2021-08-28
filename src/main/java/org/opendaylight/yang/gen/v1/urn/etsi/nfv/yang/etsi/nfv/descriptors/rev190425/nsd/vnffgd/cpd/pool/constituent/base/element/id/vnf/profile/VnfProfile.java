package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.constituent.base.element.id.vnf.profile;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.CpdPool;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container vnf-profile {
 *   leaf vnf-profile-id {
 *     type leafref {
 *       path ../../../../../nsd/df/vnf-profile/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/vnffgd/cpd-pool/constituent-base-element-id/vnf-profile/vnf-profile</i>
 * 
 * <p>To create instances of this class use {@link VnfProfileBuilder}.
 * @see VnfProfileBuilder
 *
 */
public interface VnfProfile
    extends
    ChildOf<CpdPool>,
    Augmentable<VnfProfile>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-profile");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.constituent.base.element.id.vnf.profile.VnfProfile> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.constituent.base.element.id.vnf.profile.VnfProfile.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>vnfProfileId</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfProfileId();

}

