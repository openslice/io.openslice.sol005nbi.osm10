package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.Deltas;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas.virtual.link.bit.rate.delta.BitRateRequirements;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The bitrate to be added or removed to virtual links created from particular 
 * virtual link descriptors.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list virtual-link-bit-rate-delta {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   container bit-rate-requirements {
 *     leaf root {
 *       type uint32;
 *       units bits/sec;
 *     }
 *     leaf leaf {
 *       type uint32;
 *       units bits/sec;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/scaling-aspect/aspect-delta-details/deltas/virtual-link-bit-rate-delta</i>
 * 
 * <p>To create instances of this class use {@link VirtualLinkBitRateDeltaBuilder}.
 * @see VirtualLinkBitRateDeltaBuilder
 * @see VirtualLinkBitRateDeltaKey
 *
 */
public interface VirtualLinkBitRateDelta
    extends
    ChildOf<Deltas>,
    Augmentable<VirtualLinkBitRateDelta>,
    Identifiable<VirtualLinkBitRateDeltaKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-link-bit-rate-delta");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas.VirtualLinkBitRateDelta> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas.VirtualLinkBitRateDelta.class;
    }
    
    /**
     * Uniquely identifies a VnfVirtualLinkDesc.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Bitrate requirements for an instantiation level or bitrate delta for a scaling
     * step.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas.virtual.link.bit.rate.delta.BitRateRequirements</code> <code>bitRateRequirements</code>, or <code>null</code> if not present
     */
    @Nullable BitRateRequirements getBitRateRequirements();
    
    @Override
    VirtualLinkBitRateDeltaKey key();

}

