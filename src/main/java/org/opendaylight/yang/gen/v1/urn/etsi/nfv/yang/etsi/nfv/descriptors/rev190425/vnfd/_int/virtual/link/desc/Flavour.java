package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.IntVirtualLinkDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.flavour.Qos;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes a specific flavour of the VL with specific bitrate requirements.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list flavour {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   container qos {
 *     presence "VL QoS parameters";
 *     leaf latency {
 *       type uint32;
 *       units ms;
 *     }
 *     leaf packet-delay-variation {
 *       type uint32;
 *       units ms;
 *     }
 *     leaf packet-loss-ratio {
 *       type decimal64 {
 *         fraction-digits 2;
 *         range 0..1.00;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/int-virtual-link-desc/flavour</i>
 * 
 * <p>To create instances of this class use {@link FlavourBuilder}.
 * @see FlavourBuilder
 * @see FlavourKey
 *
 */
public interface Flavour
    extends
    ChildOf<IntVirtualLinkDesc>,
    Augmentable<Flavour>,
    Identifiable<FlavourKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("flavour");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.Flavour> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.Flavour.class;
    }
    
    /**
     * Identifies a flavour within a VnfVirtualLinkDesc.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * QoS of the VL.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.flavour.Qos</code> <code>qos</code>, or <code>null</code> if not present
     */
    @Nullable Qos getQos();
    
    @Override
    FlavourKey key();

}

