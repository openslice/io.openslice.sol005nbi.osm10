package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.ScalingAspect;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.Deltas;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.DeltasKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A specification of the deltas in terms of number of instances of VNFCs and 
 * virtual link bit rates that correspond to the scaling steps of this aspect. A 
 * cardinality of zero indicates that this mapping has to be specified in a 
 * lifecycle management script or be otherwise known to the VNFM. The information 
 * in this attribute, if provided, shall be consistent with the information 
 * provided in the 'InstantiationLevel' information element. If this attribute is 
 * provided, it shall be provided for all scaling aspects.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container aspect-delta-details {
 *   list deltas {
 *     key id;
 *     min-elements 1;
 *     leaf id {
 *       type string;
 *     }
 *     list vdu-delta {
 *       key id;
 *       leaf id {
 *         type leafref {
 *           path ../../../../../../vdu/id;
 *         }
 *       }
 *       leaf number-of-instances {
 *         type uint32 {
 *           range 0..max;
 *         }
 *       }
 *     }
 *     list virtual-link-bit-rate-delta {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       container bit-rate-requirements {
 *         leaf root {
 *           type uint32;
 *           units bits/sec;
 *         }
 *         leaf leaf {
 *           type uint32;
 *           units bits/sec;
 *         }
 *       }
 *     }
 *   }
 *   leaf step-deltas {
 *     type leafref {
 *       path ../deltas/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/scaling-aspect/aspect-delta-details</i>
 * 
 * <p>To create instances of this class use {@link AspectDeltaDetailsBuilder}.
 * @see AspectDeltaDetailsBuilder
 *
 */
public interface AspectDeltaDetails
    extends
    ChildOf<ScalingAspect>,
    Augmentable<AspectDeltaDetails>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("aspect-delta-details");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.AspectDeltaDetails> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.AspectDeltaDetails.class;
    }
    
    /**
     * Declares different scaling deltas, each of which is applied for one or more
     * scaling steps of this aspect.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>deltas</code>, or <code>null</code> if not present
     */
    @Nullable Map<DeltasKey, Deltas> getDeltas();
    
    /**
     * @return <code>java.util.Map</code> <code>deltas</code>, or an empty list if it is not present
     */
    default @NonNull Map<DeltasKey, Deltas> nonnullDeltas() {
        return CodeHelpers.nonnull(getDeltas());
    }
    
    /**
     * Identifiers of the individual scaling deltas to be applied for the subsequent
     * scaling steps of this aspect. The first entry in the array shall correspond to
     * the first scaling step (between scale levels 0 to 1) and the last entry in the
     * array shall correspond to the last scaling step (between maxScaleLevel-1 and
     * maxScaleLevel). Each referenced scaling delta shall be declared in the 'deltas'
     * attribute.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>stepDeltas</code>, or <code>null</code> if not present
     */
    @Nullable String getStepDeltas();

}

