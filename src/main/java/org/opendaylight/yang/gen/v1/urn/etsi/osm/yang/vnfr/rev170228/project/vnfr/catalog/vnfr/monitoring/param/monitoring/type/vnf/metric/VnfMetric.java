package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vnf.metric;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.MonitoringParam;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container vnf-metric {
 *   leaf vnf-metric-name-ref {
 *     type leafref {
 *       path ../../../vnf-configuration/metrics/name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:etsi:osm:yang:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/monitoring-param/monitoring-type/vnf-metric/vnf-metric</i>
 * 
 * <p>To create instances of this class use {@link VnfMetricBuilder}.
 * @see VnfMetricBuilder
 *
 */
public interface VnfMetric
    extends
    ChildOf<MonitoringParam>,
    Augmentable<VnfMetric>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-metric");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vnf.metric.VnfMetric> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vnf.metric.VnfMetric.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>vnfMetricNameRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfMetricNameRef();

}

