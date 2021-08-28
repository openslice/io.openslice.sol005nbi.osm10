package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.monitoring.param;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.MonitoringParam;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container vdu-monitoring-param {
 *   leaf vdu-ref {
 *     type leafref {
 *       path ../../../vdu/id;
 *     }
 *   }
 *   leaf vdu-monitoring-param-ref {
 *     type leafref {
 *       path "../../../vdu[id = current()/../vdu-ref]/monitoring-param/id";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/monitoring-type/vdu-monitoring-param/vdu-monitoring-param</i>
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
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>vduRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVduRef();
    
    /**
     * @return <code>java.lang.Object</code> <code>vduMonitoringParamRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVduMonitoringParamRef();

}

