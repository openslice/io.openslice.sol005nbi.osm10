package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityScope;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityType;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Specifies affinity or anti-affinity relationship applicable between the VNF 
 * instances created using different VNFDs, the Virtual Link instances created 
 * using different NsVirtualLinkDescs or the nested NS instances created using 
 * different NSDs in the same affinity or anti-affinity group.
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
 * <i>etsi-nfv-descriptors/nsd/df/affinity-or-anti-affinity-group</i>
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
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.AffinityOrAntiAffinityGroup> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.AffinityOrAntiAffinityGroup.class;
    }
    
    /**
     * Identifier of Identifier of this AffinityOrAntiAffinityGroup information
     * element.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Specifies the type of relationship that the members of the group have:
     * 'affinity' or 'anti-affinity.'
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityType</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable AffinityType getType();
    
    /**
     * Specifies the scope of the affinity or anti-affinity relationship e.g. a NFVI
     * node, an NFVI PoP, etc.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.AffinityScope</code> <code>scope</code>, or <code>null</code> if not present
     */
    @Nullable AffinityScope getScope();
    
    @Override
    AffinityOrAntiAffinityGroupKey key();

}

