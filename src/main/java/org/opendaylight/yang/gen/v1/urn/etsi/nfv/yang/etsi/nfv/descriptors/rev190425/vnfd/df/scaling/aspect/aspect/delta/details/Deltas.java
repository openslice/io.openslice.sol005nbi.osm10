package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.AspectDeltaDetails;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas.VduDelta;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas.VduDeltaKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas.VirtualLinkBitRateDelta;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas.VirtualLinkBitRateDeltaKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Declares different scaling deltas, each of which is applied for one or more 
 * scaling steps of this aspect.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list deltas {
 *   key id;
 *   min-elements 1;
 *   leaf id {
 *     type string;
 *   }
 *   list vdu-delta {
 *     key id;
 *     leaf id {
 *       type leafref {
 *         path ../../../../../../vdu/id;
 *       }
 *     }
 *     leaf number-of-instances {
 *       type uint32 {
 *         range 0..max;
 *       }
 *     }
 *   }
 *   list virtual-link-bit-rate-delta {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     container bit-rate-requirements {
 *       leaf root {
 *         type uint32;
 *         units bits/sec;
 *       }
 *       leaf leaf {
 *         type uint32;
 *         units bits/sec;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/scaling-aspect/aspect-delta-details/deltas</i>
 * 
 * <p>To create instances of this class use {@link DeltasBuilder}.
 * @see DeltasBuilder
 * @see DeltasKey
 *
 */
public interface Deltas
    extends
    ChildOf<AspectDeltaDetails>,
    Augmentable<Deltas>,
    Identifiable<DeltasKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("deltas");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.Deltas> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.Deltas.class;
    }
    
    /**
     * Identifier of this scaling delta.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * The number of VNFC instances based on particular VDUs to be created or removed.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vduDelta</code>, or <code>null</code> if not present
     */
    @Nullable Map<VduDeltaKey, VduDelta> getVduDelta();
    
    /**
     * @return <code>java.util.Map</code> <code>vduDelta</code>, or an empty list if it is not present
     */
    default @NonNull Map<VduDeltaKey, VduDelta> nonnullVduDelta() {
        return CodeHelpers.nonnull(getVduDelta());
    }
    
    /**
     * The bitrate to be added or removed to virtual links created from particular
     * virtual link descriptors.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>virtualLinkBitRateDelta</code>, or <code>null</code> if not present
     */
    @Nullable Map<VirtualLinkBitRateDeltaKey, VirtualLinkBitRateDelta> getVirtualLinkBitRateDelta();
    
    /**
     * @return <code>java.util.Map</code> <code>virtualLinkBitRateDelta</code>, or an empty list if it is not present
     */
    default @NonNull Map<VirtualLinkBitRateDeltaKey, VirtualLinkBitRateDelta> nonnullVirtualLinkBitRateDelta() {
        return CodeHelpers.nonnull(getVirtualLinkBitRateDelta());
    }
    
    @Override
    DeltasKey key();

}

