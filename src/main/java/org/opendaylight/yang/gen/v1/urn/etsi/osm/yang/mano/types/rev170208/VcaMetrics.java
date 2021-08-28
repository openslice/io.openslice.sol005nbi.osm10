package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.metrics.Metrics;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.metrics.MetricsKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Information about the VNF or VDU metrics
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vca-metrics {
 *   list metrics {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf execution-environment-ref {
 *       type leafref {
 *         path ../../execution-environment-list/id;
 *       }
 *     }
 *     leaf execution-environment-metric {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-metrics</i>
 *
 */
public interface VcaMetrics
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vca-metrics");

    @Override
    Class<? extends VcaMetrics> implementedInterface();
    
    /**
     * List of VCA related metrics
     *
     *
     *
     * @return <code>java.util.Map</code> <code>metrics</code>, or <code>null</code> if not present
     */
    @Nullable Map<MetricsKey, Metrics> getMetrics();
    
    /**
     * @return <code>java.util.Map</code> <code>metrics</code>, or an empty list if it is not present
     */
    default @NonNull Map<MetricsKey, Metrics> nonnullMetrics() {
        return CodeHelpers.nonnull(getMetrics());
    }

}

