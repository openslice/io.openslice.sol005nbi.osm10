package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.monitored.info.MonitoringParameter;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.monitored.info.VnfIndicatorInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list monitored-info {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   container vnf-indicator-info {
 *     leaf vnfd-id {
 *       type leafref {
 *         path ../../../../../vnfd/id;
 *       }
 *     }
 *     leaf vnf-indicator {
 *       type leafref {
 *         path deref(../vnfd-id)/../indicator/id;
 *       }
 *     }
 *   }
 *   container monitoring-parameter {
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf performance-metric {
 *       type string;
 *     }
 *     leaf collection-period {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/df/monitored-info</i>
 * 
 * <p>To create instances of this class use {@link MonitoredInfoBuilder}.
 * @see MonitoredInfoBuilder
 * @see MonitoredInfoKey
 *
 */
public interface MonitoredInfo
    extends
    ChildOf<Df>,
    Augmentable<MonitoredInfo>,
    Identifiable<MonitoredInfoKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("monitored-info");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.MonitoredInfo> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.MonitoredInfo.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Uniquely identifies this VNF Indicator information element.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.monitored.info.VnfIndicatorInfo</code> <code>vnfIndicatorInfo</code>, or <code>null</code> if not present
     */
    @Nullable VnfIndicatorInfo getVnfIndicatorInfo();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.monitored.info.MonitoringParameter</code> <code>monitoringParameter</code>, or <code>null</code> if not present
     */
    @Nullable MonitoringParameter getMonitoringParameter();
    
    @Override
    MonitoredInfoKey key();

}

