package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.InstantiationLevel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * The InstantiationLevel information element describes a given level of resources 
 * to be instantiated within a DF in term of the number of VNFC instances to be 
 * created from each VDU.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list scaling-info {
 *   key scaling-aspect-id;
 *   leaf scaling-aspect-id {
 *     type leafref {
 *       path ../../../scaling-aspect/id;
 *     }
 *   }
 *   leaf scale-level {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/instantiation-level/scaling-info</i>
 * 
 * <p>To create instances of this class use {@link ScalingInfoBuilder}.
 * @see ScalingInfoBuilder
 * @see ScalingInfoKey
 *
 */
public interface ScalingInfo
    extends
    ChildOf<InstantiationLevel>,
    Augmentable<ScalingInfo>,
    Identifiable<ScalingInfoKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-info");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level.ScalingInfo> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level.ScalingInfo.class;
    }
    
    /**
     * Identifier of the scaling aspect.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>scalingAspectId</code>, or <code>null</code> if not present
     */
    @Nullable String getScalingAspectId();
    
    /**
     * The scale level, greater than or equal to 0.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>scaleLevel</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getScaleLevel();
    
    @Override
    ScalingInfoKey key();

}

