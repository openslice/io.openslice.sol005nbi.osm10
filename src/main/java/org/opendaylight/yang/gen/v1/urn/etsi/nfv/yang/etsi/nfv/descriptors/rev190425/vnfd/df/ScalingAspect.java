package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.AspectDeltaDetails;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * The scaling aspects supported by this DF of the VNF. scalingAspect shall be 
 * present if the VNF supports scaling.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list scaling-aspect {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf max-scale-level {
 *     type uint32 {
 *       range 1..max;
 *     }
 *   }
 *   container aspect-delta-details {
 *     list deltas {
 *       key id;
 *       min-elements 1;
 *       leaf id {
 *         type string;
 *       }
 *       list vdu-delta {
 *         key id;
 *         leaf id {
 *           type leafref {
 *             path ../../../../../../vdu/id;
 *           }
 *         }
 *         leaf number-of-instances {
 *           type uint32 {
 *             range 0..max;
 *           }
 *         }
 *       }
 *       list virtual-link-bit-rate-delta {
 *         key id;
 *         leaf id {
 *           type string;
 *         }
 *         container bit-rate-requirements {
 *           leaf root {
 *             type uint32;
 *             units bits/sec;
 *           }
 *           leaf leaf {
 *             type uint32;
 *             units bits/sec;
 *           }
 *         }
 *       }
 *     }
 *     leaf step-deltas {
 *       type leafref {
 *         path ../deltas/id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/scaling-aspect</i>
 * 
 * <p>To create instances of this class use {@link ScalingAspectBuilder}.
 * @see ScalingAspectBuilder
 * @see ScalingAspectKey
 *
 */
public interface ScalingAspect
    extends
    ChildOf<Df>,
    Augmentable<ScalingAspect>,
    Identifiable<ScalingAspectKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-aspect");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.ScalingAspect> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.ScalingAspect.class;
    }
    
    /**
     * Unique identifier of this aspect in the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Human readable name of the aspect.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Human readable description of the aspect.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * The maximum scaleLevel for total number of scaling steps that can be applied
     * w.r.t. this aspect. The value of this attribute corresponds to the number of
     * scaling steps can be applied to this aspect when scaling it from the minimum
     * scale level (i.e. 0) to the maximum scale level defined by this attribute.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>maxScaleLevel</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getMaxScaleLevel();
    
    /**
     * A specification of the deltas in terms of number of instances of VNFCs and
     * virtual link bit rates that correspond to the scaling steps of this aspect. A
     * cardinality of zero indicates that this mapping has to be specified in a
     * lifecycle management script or be otherwise known to the VNFM. The information
     * in this attribute, if provided, shall be consistent with the information
     * provided in the 'InstantiationLevel' information element. If this attribute is
     * provided, it shall be provided for all scaling aspects.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.AspectDeltaDetails</code> <code>aspectDeltaDetails</code>, or <code>null</code> if not present
     */
    @Nullable AspectDeltaDetails getAspectDeltaDetails();
    
    @Override
    ScalingAspectKey key();

}

