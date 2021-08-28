package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * grouping monitoring-parameter {
 *   leaf name {
 *     type string;
 *   }
 *   leaf performance-metric {
 *     type string;
 *   }
 *   leaf collection-period {
 *     type uint64;
 *     units ms;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/monitoring-parameter</i>
 *
 */
public interface MonitoringParameter
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-parameter");

    @Override
    Class<? extends MonitoringParameter> implementedInterface();
    
    /**
     * Human readable name of the monitoring parameter.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Performance metric that is monitored. This attribute shall contain the related
     * 'Measurement Name' value as defined in clause 7.2 of ETSI GS NFV-IFA 027
     *
     *
     *
     * @return <code>java.lang.String</code> <code>performanceMetric</code>, or <code>null</code> if not present
     */
    @Nullable String getPerformanceMetric();
    
    /**
     * An attribute that describes the recommended periodicity at which to collect the
     * performance information. VNFM determines if this parameter is considered. The
     * vendor may provide this information as a guidance for creating PmJobs if needed.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>collectionPeriod</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getCollectionPeriod();

}

