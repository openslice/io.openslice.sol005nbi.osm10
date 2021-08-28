package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.MonitoringType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * VDU-related metric from the infrastructure
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case vdu-monitoring-param {
 *   container vdu-monitoring-param {
 *     leaf vdu-ref {
 *       type leafref {
 *         path ../../../vdu/id;
 *       }
 *     }
 *     leaf vdu-monitoring-param-ref {
 *       type leafref {
 *         path "../../../vdu[id = current()/../vdu-ref]/monitoring-param/id";
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/monitoring-type/vdu-monitoring-param</i>
 *
 */
public interface VduMonitoringParam
    extends
    DataObject,
    Augmentable<VduMonitoringParam>,
    MonitoringType
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-monitoring-param");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.VduMonitoringParam> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.VduMonitoringParam.class;
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam</code> <code>vduMonitoringParam</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.monitoring.param.@Nullable VduMonitoringParam getVduMonitoringParam();

}

