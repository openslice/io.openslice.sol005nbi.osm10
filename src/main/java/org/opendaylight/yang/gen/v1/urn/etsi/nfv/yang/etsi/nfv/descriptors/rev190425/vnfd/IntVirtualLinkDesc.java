package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.ConnectivityType;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.Flavour;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.FlavourKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.MonitoringParameters;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd._int.virtual.link.desc.MonitoringParametersKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Represents the type of network connectivity mandated by the VNF provider 
 * two or more CPs which includes at least one internal CP.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list int-virtual-link-desc {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   list flavour {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     container qos {
 *       presence "VL QoS parameters";
 *       leaf latency {
 *         type uint32;
 *         units ms;
 *       }
 *       leaf packet-delay-variation {
 *         type uint32;
 *         units ms;
 *       }
 *       leaf packet-loss-ratio {
 *         type decimal64 {
 *           fraction-digits 2;
 *           range 0..1.00;
 *         }
 *       }
 *     }
 *   }
 *   uses connectivity-type;
 *   leaf-list test-access {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   list monitoring-parameters {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     uses monitoring-parameter;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/int-virtual-link-desc</i>
 * 
 * <p>To create instances of this class use {@link IntVirtualLinkDescBuilder}.
 * @see IntVirtualLinkDescBuilder
 * @see IntVirtualLinkDescKey
 *
 */
public interface IntVirtualLinkDesc
    extends
    ChildOf<Vnfd>,
    Augmentable<IntVirtualLinkDesc>,
    ConnectivityType,
    Identifiable<IntVirtualLinkDescKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("int-virtual-link-desc");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.IntVirtualLinkDesc> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.IntVirtualLinkDesc.class;
    }
    
    /**
     * Unique identifier of this internal VLD in VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Describes a specific flavour of the VL with specific bitrate requirements.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>flavour</code>, or <code>null</code> if not present
     */
    @Nullable Map<FlavourKey, Flavour> getFlavour();
    
    /**
     * @return <code>java.util.Map</code> <code>flavour</code>, or an empty list if it is not present
     */
    default @NonNull Map<FlavourKey, Flavour> nonnullFlavour() {
        return CodeHelpers.nonnull(getFlavour());
    }
    
    /**
     * Specifies test access facilities expected on the VL (e.g. none, passive
     * monitoring, or active (intrusive) loopbacks at endpoints.
     *
     *
     *
     * @return <code>java.util.List</code> <code>testAccess</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getTestAccess();
    
    /**
     * Provides human-readable information on the purpose of the VL (e.g. control plane
     * traffic).
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * @return <code>java.util.Map</code> <code>monitoringParameters</code>, or <code>null</code> if not present
     */
    @Nullable Map<MonitoringParametersKey, MonitoringParameters> getMonitoringParameters();
    
    /**
     * @return <code>java.util.Map</code> <code>monitoringParameters</code>, or an empty list if it is not present
     */
    default @NonNull Map<MonitoringParametersKey, MonitoringParameters> nonnullMonitoringParameters() {
        return CodeHelpers.nonnull(getMonitoringParameters());
    }
    
    @Override
    IntVirtualLinkDescKey key();

}

