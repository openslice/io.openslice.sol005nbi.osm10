package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.monitoring.param;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container vdu-monitoring-param {
 *   leaf vdu-ref {
 *     type leafref {
 *       path ../../../vdur/id;
 *     }
 *   }
 *   leaf vdu-monitoring-param-ref {
 *     type leafref {
 *       path "../../../vdur[id = current()/../vdu-ref]/monitoring-param/id";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:etsi:osm:yang:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/monitoring-param/monitoring-type/vdu-monitoring-param/vdu-monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link VduMonitoringParamBuilder}.
 * @see VduMonitoringParamBuilder
 *
 */
public interface VduMonitoringParam
    extends
    ChildOf<MonitoringParam>,
    Augmentable<VduMonitoringParam>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-monitoring-param");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam.class;
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vduRef</code>, or <code>null</code> if not present
     */
    @Nullable Uuid getVduRef();
    
    /**
     * @return <code>java.lang.Object</code> <code>vduMonitoringParamRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVduMonitoringParamRef();

}

