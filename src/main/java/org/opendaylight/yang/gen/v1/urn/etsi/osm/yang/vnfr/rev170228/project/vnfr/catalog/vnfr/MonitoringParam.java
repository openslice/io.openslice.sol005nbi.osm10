package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.Vnfr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.MonitoringType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of monitoring parameters at the network service level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list monitoring-param {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   uses manotypes:monitoring-param-aggregation;
 *   choice monitoring-type {
 *     case vdu-monitoring-param {
 *       container vdu-monitoring-param {
 *         leaf vdu-ref {
 *           type leafref {
 *             path ../../../vdur/id;
 *           }
 *         }
 *         leaf vdu-monitoring-param-ref {
 *           type leafref {
 *             path "../../../vdur[id = current()/../vdu-ref]/monitoring-param/id";
 *           }
 *         }
 *       }
 *     }
 *     case vnf-metric {
 *       container vnf-metric {
 *         leaf vnf-metric-name-ref {
 *           type leafref {
 *             path ../../../vnf-configuration/metrics/name;
 *           }
 *         }
 *       }
 *     }
 *     case vdu-metric {
 *       container vdu-metric {
 *         leaf vdu-ref {
 *           type leafref {
 *             path ../../../vdur/id;
 *           }
 *         }
 *         leaf vdu-metric-name-ref {
 *           type leafref {
 *             path "../../../vdur[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:etsi:osm:yang:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParamBuilder}.
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
public interface MonitoringParam
    extends
    ChildOf<Vnfr>,
    Augmentable<MonitoringParam>,
    MonitoringParamAggregation,
    Identifiable<MonitoringParamKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.MonitoringParam> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.MonitoringParam.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Defines the type of monitoring param to be used: * vdu-monitorin-param:
     * VDU-related metric (from NFVI) * vnf-metric: VNF-related metric (from VCA) *
     * vdu-metric: VDU-related metric (from VCA) 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.MonitoringType</code> <code>monitoringType</code>, or <code>null</code> if not present
     */
    @Nullable MonitoringType getMonitoringType();
    
    @Override
    MonitoringParamKey key();

}

