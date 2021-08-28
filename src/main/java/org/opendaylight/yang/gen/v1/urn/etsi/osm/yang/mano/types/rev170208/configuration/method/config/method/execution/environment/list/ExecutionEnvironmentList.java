package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list.execution.environment.list.ExecutionEnvironmentModel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list execution-environment-list {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   choice execution-environment-model {
 *     case juju {
 *       container juju {
 *         leaf charm {
 *           type string;
 *         }
 *         leaf proxy {
 *           type boolean;
 *           default true;
 *         }
 *         leaf cloud {
 *           type enumeration {
 *             enum lxd;
 *             enum k8s;
 *           }
 *           default lxd;
 *         }
 *       }
 *     }
 *     case helm-chart {
 *       leaf helm-chart {
 *         type string;
 *       }
 *       leaf helm-version {
 *         type enumeration {
 *           enum v2;
 *           enum v3;
 *         }
 *         default v3;
 *       }
 *     }
 *   }
 *   leaf metric-service {
 *     type string;
 *   }
 *   leaf connection-point-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/configuration-method/config-method/execution-environment-list/execution-environment-list</i>
 * 
 * <p>To create instances of this class use {@link ExecutionEnvironmentListBuilder}.
 * @see ExecutionEnvironmentListBuilder
 * @see ExecutionEnvironmentListKey
 *
 */
public interface ExecutionEnvironmentList
    extends
    ChildOf<ConfigurationMethod>,
    Augmentable<ExecutionEnvironmentList>,
    Identifiable<ExecutionEnvironmentListKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("execution-environment-list");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentList> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentList.class;
    }
    
    /**
     * Execution environment identifier.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    /**
     * Execution environment model (juju, helm-chart)
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.execution.environment.list.execution.environment.list.ExecutionEnvironmentModel</code> <code>executionEnvironmentModel</code>, or <code>null</code> if not present
     */
    @Nullable ExecutionEnvironmentModel getExecutionEnvironmentModel();
    
    /**
     * Service name in the execution environment. For helm charts, it will be the name
     * of the kubernetes service used by the exporter to expose metrics to the OSM
     * collector. 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>metricService</code>, or <code>null</code> if not present
     */
    @Nullable String getMetricService();
    
    /**
     * String representing a leaf reference to the particular external connection point
     * This field should match
     * /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:id/vnfd:connection-point/vnfd:name 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>connectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable String getConnectionPointRef();
    
    @Override
    ExecutionEnvironmentListKey key();

}

