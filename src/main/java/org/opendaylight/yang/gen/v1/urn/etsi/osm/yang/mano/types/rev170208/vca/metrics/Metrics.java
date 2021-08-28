package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.metrics;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of VCA related metrics
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list metrics {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf execution-environment-ref {
 *     type leafref {
 *       path ../../execution-environment-list/id;
 *     }
 *   }
 *   leaf execution-environment-metric {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-metrics/metrics</i>
 * 
 * <p>To create instances of this class use {@link MetricsBuilder}.
 * @see MetricsBuilder
 * @see MetricsKey
 *
 */
public interface Metrics
    extends
    ChildOf<VcaMetrics>,
    Augmentable<Metrics>,
    Identifiable<MetricsKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("metrics");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.metrics.Metrics> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.metrics.Metrics.class;
    }
    
    /**
     * Name of the metric, as defined in the Juju charm.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Leaf reference to the particular execution environment getting that metric
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>executionEnvironmentRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getExecutionEnvironmentRef();
    
    /**
     * Metric in the execution environment referenced by execution-environment-ref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionEnvironmentMetric</code>, or <code>null</code> if not present
     */
    @Nullable String getExecutionEnvironmentMetric();
    
    @Override
    MetricsKey key();

}

