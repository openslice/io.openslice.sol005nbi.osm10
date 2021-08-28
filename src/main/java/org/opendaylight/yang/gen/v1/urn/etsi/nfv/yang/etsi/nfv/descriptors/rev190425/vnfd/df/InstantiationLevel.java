package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level.ScalingInfo;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level.ScalingInfoKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level.VduLevel;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level.VduLevelKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes the various levels of resources that can be used to instantiate the 
 * VNF using this flavour. Examples: Small, Medium, Large. If there is only one 
 * 'instantiationLevel' entry, it shall be treated as the default instantiation 
 * level for this DF. The InstantiationLevel information element describes a given 
 * level of resources to be instantiated within a deployment flavour in term of 
 * number of VNFC instances to be created from each VDU. All the VDUs referenced 
 * the level shall be part of the corresponding deployment flavour and their 
 * shall be within the range (min/max) for this deployment flavour.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list instantiation-level {
 *   key id;
 *   min-elements 1;
 *   leaf id {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   list vdu-level {
 *     key vdu-id;
 *     min-elements 1;
 *     leaf vdu-id {
 *       type leafref {
 *         path ../../../../vdu/id;
 *       }
 *     }
 *     leaf number-of-instances {
 *       type uint16;
 *       must ". &lt;= ../../../../df/vdu-profile[id=current()/../vdu-id]/max-number-of-instances";
 *       must ". &gt;= ../../../../df/vdu-profile[id=current()/../vdu-id]/min-number-of-instances";
 *       default 1;
 *     }
 *   }
 *   list scaling-info {
 *     key scaling-aspect-id;
 *     leaf scaling-aspect-id {
 *       type leafref {
 *         path ../../../scaling-aspect/id;
 *       }
 *     }
 *     leaf scale-level {
 *       type uint32;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/instantiation-level</i>
 * 
 * <p>To create instances of this class use {@link InstantiationLevelBuilder}.
 * @see InstantiationLevelBuilder
 * @see InstantiationLevelKey
 *
 */
public interface InstantiationLevel
    extends
    ChildOf<Df>,
    Augmentable<InstantiationLevel>,
    Identifiable<InstantiationLevelKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("instantiation-level");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.InstantiationLevel> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.InstantiationLevel.class;
    }
    
    /**
     * Uniquely identifies a level with the DF.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Human readable description of the instantiation level
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * Sets the number of instances for the VDU in this instantiation level.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vduLevel</code>, or <code>null</code> if not present
     */
    @Nullable Map<VduLevelKey, VduLevel> getVduLevel();
    
    /**
     * @return <code>java.util.Map</code> <code>vduLevel</code>, or an empty list if it is not present
     */
    default @NonNull Map<VduLevelKey, VduLevel> nonnullVduLevel() {
        return CodeHelpers.nonnull(getVduLevel());
    }
    
    /**
     * The InstantiationLevel information element describes a given level of resources
     * to be instantiated within a DF in term of the number of VNFC instances to be
     * created from each VDU.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>scalingInfo</code>, or <code>null</code> if not present
     */
    @Nullable Map<ScalingInfoKey, ScalingInfo> getScalingInfo();
    
    /**
     * @return <code>java.util.Map</code> <code>scalingInfo</code>, or an empty list if it is not present
     */
    default @NonNull Map<ScalingInfoKey, ScalingInfo> nonnullScalingInfo() {
        return CodeHelpers.nonnull(getScalingInfo());
    }
    
    @Override
    InstantiationLevelKey key();

}

