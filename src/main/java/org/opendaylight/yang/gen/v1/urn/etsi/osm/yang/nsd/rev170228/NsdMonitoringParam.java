package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.monitoring.param.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.monitoring.param.MonitoringParamKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * grouping nsd-monitoring-param {
 *   list monitoring-param {
 *     key id;
 *     uses nsd-base:monitoring-param-common;
 *     list vnfd-monitoring-param {
 *       key "member-vnf-index-ref vnfd-monitoring-param-ref";
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *         }
 *       }
 *       leaf vnfd-monitoring-param-ref {
 *         type leafref {
 *           path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:monitoring-param/vnfd:id";
 *         }
 *       }
 *       leaf member-vnf-index-ref {
 *         type leafref {
 *           path ../../../constituent-vnfd/member-vnf-index;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-monitoring-param</i>
 *
 */
public interface NsdMonitoringParam
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-monitoring-param");

    @Override
    Class<? extends NsdMonitoringParam> implementedInterface();
    
    /**
     * @return <code>java.util.Map</code> <code>monitoringParam</code>, or <code>null</code> if not present
     */
    @Nullable Map<MonitoringParamKey, MonitoringParam> getMonitoringParam();
    
    /**
     * @return <code>java.util.Map</code> <code>monitoringParam</code>, or an empty list if it is not present
     */
    default @NonNull Map<MonitoringParamKey, MonitoringParam> nonnullMonitoringParam() {
        return CodeHelpers.nonnull(getMonitoringParam());
    }

}

