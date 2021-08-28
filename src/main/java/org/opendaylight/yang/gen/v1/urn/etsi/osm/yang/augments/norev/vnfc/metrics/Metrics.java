package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.metrics;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcMetrics;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of VNFC related metrics
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * list metrics {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/vnfc-metrics/metrics</i>
 * 
 * <p>To create instances of this class use {@link MetricsBuilder}.
 * @see MetricsBuilder
 * @see MetricsKey
 *
 */
public interface Metrics
    extends
    ChildOf<VnfcMetrics>,
    Augmentable<Metrics>,
    Identifiable<MetricsKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("metrics");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.metrics.Metrics> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.metrics.Metrics.class;
    }
    
    /**
     * Name of the metric, as defined in the Juju charm.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    @Override
    MetricsKey key();

}

