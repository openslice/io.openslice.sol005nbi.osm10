package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.metric;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.MonitoringParam;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container vdu-metric {
 *   leaf vdu-ref {
 *     type leafref {
 *       path ../../../vdu/id;
 *     }
 *   }
 *   leaf vdu-metric-name-ref {
 *     type leafref {
 *       path "../../../vdu[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/monitoring-type/vdu-metric/vdu-metric</i>
 * 
 * <p>To create instances of this class use {@link VduMetricBuilder}.
 * @see VduMetricBuilder
 *
 */
public interface VduMetric
    extends
    ChildOf<MonitoringParam>,
    Augmentable<VduMetric>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-metric");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.metric.VduMetric> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.metric.VduMetric.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>vduRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVduRef();
    
    /**
     * @return <code>java.lang.Object</code> <code>vduMetricNameRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVduMetricNameRef();

}

