package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamUiData;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamValue;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.Nsr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRefKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of NS level params.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list monitoring-param {
 *   key id;
 *   uses manotypes:monitoring-param-value;
 *   uses manotypes:monitoring-param-ui-data;
 *   uses manotypes:monitoring-param-aggregation;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf nsd-mon-param-ref {
 *     type leafref {
 *       path "../../../../project-nsd:nsd-catalog/project-nsd:nsd[project-nsd:id = current()/../../nsd-ref]/project-nsd:monitoring-param/project-nsd:id";
 *     }
 *   }
 *   list vnfr-mon-param-ref {
 *     key "vnfr-id-ref vnfr-mon-param-ref";
 *     leaf vnfr-id-ref {
 *       type yang:uuid;
 *     }
 *     leaf vnfr-mon-param-ref {
 *       type leafref {
 *         path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:monitoring-param/vnfr:id";
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:etsi:osm:yang:nsr?revision=2017-02-08)ns-instance-opdata/nsr/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParamBuilder}.
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
public interface MonitoringParam
    extends
    ChildOf<Nsr>,
    Augmentable<MonitoringParam>,
    MonitoringParamValue,
    MonitoringParamUiData,
    MonitoringParamAggregation,
    Identifiable<MonitoringParamKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParam> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParam.class;
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
     * Reference to the NSD monitoring param descriptor that produced this result
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsdMonParamRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getNsdMonParamRef();
    
    /**
     * A list of VNFR monitoring params associated with this monp
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfrMonParamRef</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfrMonParamRefKey, VnfrMonParamRef> getVnfrMonParamRef();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfrMonParamRef</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfrMonParamRefKey, VnfrMonParamRef> nonnullVnfrMonParamRef() {
        return CodeHelpers.nonnull(getVnfrMonParamRef());
    }
    
    @Override
    MonitoringParamKey key();

}

