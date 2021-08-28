package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.NfviMetricType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of VDU-related monitoring parameters at NFVI level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list monitoring-param {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf nfvi-metric {
 *     type manotypes:nfvi-metric-type;
 *   }
 *   leaf interface-name-ref {
 *     type leafref {
 *       path ../../interface/name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:etsi:osm:yang:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParamBuilder}.
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
public interface MonitoringParam
    extends
    ChildOf<Vdur>,
    Augmentable<MonitoringParam>,
    Identifiable<MonitoringParamKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.MonitoringParam> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.MonitoringParam.class;
    }
    
    /**
     * The unique id of the monitoring param at VDU level
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * The associated NFVI metric to be monitored
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.NfviMetricType</code> <code>nfviMetric</code>, or <code>null</code> if not present
     */
    @Nullable NfviMetricType getNfviMetric();
    
    /**
     * Reference to a VDU interface name. Applicable only when the nfvi-metric refers
     * to an interface and not to the VM
     *
     *
     *
     * @return <code>java.lang.String</code> <code>interfaceNameRef</code>, or <code>null</code> if not present
     */
    @Nullable String getInterfaceNameRef();
    
    @Override
    MonitoringParamKey key();

}

