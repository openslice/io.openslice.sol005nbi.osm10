package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.monitoring.param;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.MonitoringParamCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.NsdMonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParamKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list monitoring-param {
 *   key id;
 *   uses nsd-base:monitoring-param-common;
 *   list vnfd-monitoring-param {
 *     key "member-vnf-index-ref vnfd-monitoring-param-ref";
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *       }
 *     }
 *     leaf vnfd-monitoring-param-ref {
 *       type leafref {
 *         path "../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:monitoring-param/project-vnfd:id";
 *       }
 *     }
 *     leaf member-vnf-index-ref {
 *       type leafref {
 *         path ../../../constituent-vnfd/member-vnf-index;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-monitoring-param/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParamBuilder}.
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
public interface MonitoringParam
    extends
    ChildOf<NsdMonitoringParam>,
    Augmentable<MonitoringParam>,
    MonitoringParamCommon,
    Identifiable<MonitoringParamKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.monitoring.param.MonitoringParam> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.monitoring.param.MonitoringParam.class;
    }
    
    /**
     * A list of VNFD monitoring params
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfdMonitoringParam</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfdMonitoringParamKey, VnfdMonitoringParam> getVnfdMonitoringParam();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfdMonitoringParam</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfdMonitoringParamKey, VnfdMonitoringParam> nonnullVnfdMonitoringParam() {
        return CodeHelpers.nonnull(getVnfdMonitoringParam());
    }
    
    @Override
    MonitoringParamKey key();

}

