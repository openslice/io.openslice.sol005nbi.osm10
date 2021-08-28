package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.flavour;
import java.lang.Class;
import java.lang.Override;
import java.math.BigDecimal;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.Flavour;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * QoS of the VL.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container qos {
 *   presence "VL QoS parameters";
 *   leaf latency {
 *     type uint32;
 *     units ms;
 *   }
 *   leaf packet-delay-variation {
 *     type uint32;
 *     units ms;
 *   }
 *   leaf packet-loss-ratio {
 *     type decimal64 {
 *       fraction-digits 2;
 *       range 0..1.00;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/int-virtual-link-desc/flavour/qos</i>
 * 
 * <p>To create instances of this class use {@link QosBuilder}.
 * @see QosBuilder
 *
 */
public interface Qos
    extends
    ChildOf<Flavour>,
    Augmentable<Qos>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("qos");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.flavour.Qos> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.flavour.Qos.class;
    }
    
    /**
     * Specifies the maximum latency in ms.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>latency</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getLatency();
    
    /**
     * Specifies the maximum jitter in ms.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>packetDelayVariation</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getPacketDelayVariation();
    
    /**
     * Specifies the maximum packet loss ratio.
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>packetLossRatio</code>, or <code>null</code> if not present
     */
    @Nullable BigDecimal getPacketLossRatio();

}

