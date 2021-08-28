package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.monitored.info;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.MonitoredInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container monitoring-parameter {
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf performance-metric {
 *     type string;
 *   }
 *   leaf collection-period {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/monitored-info/monitoring-parameter</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParameterBuilder}.
 * @see MonitoringParameterBuilder
 *
 */
public interface MonitoringParameter
    extends
    ChildOf<MonitoredInfo>,
    Augmentable<MonitoringParameter>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-parameter");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.monitored.info.MonitoringParameter> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.monitored.info.MonitoringParameter.class;
    }
    
    /**
     * Unique identifier of this monitoring parameter information element.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Human readable name of the monitoring parameter.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Defines the virtualised resource-related performance metric.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>performanceMetric</code>, or <code>null</code> if not present
     */
    @Nullable String getPerformanceMetric();
    
    /**
     * An attribute that describes the periodicity at which to collect the performance
     * information.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>collectionPeriod</code>, or <code>null</code> if not present
     */
    @Nullable String getCollectionPeriod();

}

