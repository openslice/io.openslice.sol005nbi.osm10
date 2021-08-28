package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.NfviMetrics;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container external-ports {
 *   leaf label {
 *     type string;
 *     default "EXTERNAL PORTS";
 *   }
 *   leaf total {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/external-ports</i>
 * 
 * <p>To create instances of this class use {@link ExternalPortsBuilder}.
 * @see ExternalPortsBuilder
 *
 */
public interface ExternalPorts
    extends
    ChildOf<NfviMetrics>,
    Augmentable<ExternalPorts>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("external-ports");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.ExternalPorts> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.ExternalPorts.class;
    }
    
    /**
     * Label to show in UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    @Nullable String getLabel();
    
    /**
     * The total number of external ports.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>total</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getTotal();

}

