package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.metrics.Metrics;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.metrics.MetricsKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Information about the VNF or VDU metrics
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * grouping vnfc-metrics {
 *   list metrics {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/vnfc-metrics</i>
 *
 */
public interface VnfcMetrics
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfc-metrics");

    @Override
    Class<? extends VnfcMetrics> implementedInterface();
    
    /**
     * List of VNFC related metrics
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

