package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityScope;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityType;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Df;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The AffinityOrAntiAffinityGroup describes the affinity or anti-affinity 
 * relationship applicable between the virtualization containers to be created 
 * based on different VDUs, or between internal VLs to be created based on 
 * different VnfVirtualLinkDesc(s). Per VNF, the affinity/anti-affinity rules 
 * defined using this information element, using the 
 * LocalAffinityOrAntiAffinityRule information element, and using the placement 
 * constraints in the GrantLifecycleOperation as defined in ETSI GS NFV-IFA 007 
 * [i.3] should be conflict-free. In case of conflicts, the placement constraints 
 * in the GrantLifecycleOperation shall take precedence.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list affinity-or-anti-affinity-group {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf type {
 *     type affinity-type;
 *   }
 *   leaf scope {
 *     type affinity-scope;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/affinity-or-anti-affinity-group</i>
 * 
 * <p>To create instances of this class use {@link AffinityOrAntiAffinityGroupBuilder}.
 * @see AffinityOrAntiAffinityGroupBuilder
 * @see AffinityOrAntiAffinityGroupKey
 *
 */
public interface AffinityOrAntiAffinityGroup
    extends
    ChildOf<Df>,
    Augmentable<AffinityOrAntiAffinityGroup>,
    Identifiable<AffinityOrAntiAffinityGroupKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("affinity-or-anti-affinity-group");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.AffinityOrAntiAffinityGroup> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.AffinityOrAntiAffinityGroup.class;
    }
    
    /**
     * Identifies an affinity or anti-affinity group to which the affinity or
     * anti-affinity rule applies.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Specifies whether the rule is an affinity rule or an anti-affinity rule.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityType</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable AffinityType getType();
    
    /**
     * Specifies the scope of the rule, possible values are 'NFVI-PoP', 'Zone',
     * 'ZoneGroup', 'NFVI-node'.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityScope</code> <code>scope</code>, or <code>null</code> if not present
     */
    @Nullable AffinityScope getScope();
    
    @Override
    AffinityOrAntiAffinityGroupKey key();

}

