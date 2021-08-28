package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.monitoring.param.monitoring.param;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.monitoring.param.MonitoringParam;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A list of VNFD monitoring params
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list vnfd-monitoring-param {
 *   key "member-vnf-index-ref vnfd-monitoring-param-ref";
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *     }
 *   }
 *   leaf vnfd-monitoring-param-ref {
 *     type leafref {
 *       path "../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:monitoring-param/project-vnfd:id";
 *     }
 *   }
 *   leaf member-vnf-index-ref {
 *     type leafref {
 *       path ../../../constituent-vnfd/member-vnf-index;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-monitoring-param/monitoring-param/vnfd-monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link VnfdMonitoringParamBuilder}.
 * @see VnfdMonitoringParamBuilder
 * @see VnfdMonitoringParamKey
 *
 */
public interface VnfdMonitoringParam
    extends
    ChildOf<MonitoringParam>,
    Augmentable<VnfdMonitoringParam>,
    Identifiable<VnfdMonitoringParamKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-monitoring-param");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam.class;
    }
    
    /**
     * A reference to a vnfd. This is a leafref to path:
     * ../../../../nsd:constituent-vnfd + [nsd:id = current()/../nsd:id-ref] +
     * /nsd:vnfd-id-ref NOTE: An issue with confd is preventing the use of xpath. Seems
     * to be an issue with leafref to leafref, whose target is in a different module.
     * Once that is resolved this will switched to use leafref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfdIdRef();
    
    /**
     * A reference to the VNFD monitoring param
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdMonitoringParamRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfdMonitoringParamRef();
    
    /**
     * Optional reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getMemberVnfIndexRef();
    
    @Override
    VnfdMonitoringParamKey key();

}

