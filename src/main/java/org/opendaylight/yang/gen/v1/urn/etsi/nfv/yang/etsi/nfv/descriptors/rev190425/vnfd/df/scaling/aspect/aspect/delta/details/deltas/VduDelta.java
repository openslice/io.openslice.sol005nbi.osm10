package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.Deltas;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * The number of VNFC instances based on particular VDUs to be created or removed.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list vdu-delta {
 *   key id;
 *   leaf id {
 *     type leafref {
 *       path ../../../../../../vdu/id;
 *     }
 *   }
 *   leaf number-of-instances {
 *     type uint32 {
 *       range 0..max;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/scaling-aspect/aspect-delta-details/deltas/vdu-delta</i>
 * 
 * <p>To create instances of this class use {@link VduDeltaBuilder}.
 * @see VduDeltaBuilder
 * @see VduDeltaKey
 *
 */
public interface VduDelta
    extends
    ChildOf<Deltas>,
    Augmentable<VduDelta>,
    Identifiable<VduDeltaKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-delta");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas.VduDelta> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas.VduDelta.class;
    }
    
    /**
     * Uniquely identifies a VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Number of instances of VNFC based on this VDU to deploy for an instantiation
     * level or for a scaling delta. Shall be zero or greater.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>numberOfInstances</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getNumberOfInstances();
    
    @Override
    VduDeltaKey key();

}

