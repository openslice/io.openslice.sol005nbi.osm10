package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.ConfigMethod;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentListKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of Execution Environments to configure or monitor VNF or VDU.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * case execution-environment-list {
 *   list execution-environment-list {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     choice execution-environment-model {
 *       case juju {
 *         container juju {
 *           leaf charm {
 *             type string;
 *           }
 *           leaf proxy {
 *             type boolean;
 *             default true;
 *           }
 *           leaf cloud {
 *             type enumeration {
 *               enum lxd;
 *               enum k8s;
 *             }
 *             default lxd;
 *           }
 *         }
 *       }
 *       case helm-chart {
 *         leaf helm-chart {
 *           type string;
 *         }
 *         leaf helm-version {
 *           type enumeration {
 *             enum v2;
 *             enum v3;
 *           }
 *           default v3;
 *         }
 *       }
 *     }
 *     leaf metric-service {
 *       type string;
 *     }
 *     leaf external-connection-point-ref {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/configuration-method/config-method/execution-environment-list</i>
 *
 */
public interface ExecutionEnvironmentList
    extends
    DataObject,
    Augmentable<ExecutionEnvironmentList>,
    ConfigMethod
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("execution-environment-list");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.ExecutionEnvironmentList> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.ExecutionEnvironmentList.class;
    }
    
    /**
     * @return <code>java.util.Map</code> <code>executionEnvironmentList</code>, or <code>null</code> if not present
     */
    @Nullable Map<ExecutionEnvironmentListKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentList> getExecutionEnvironmentList();
    
    /**
     * @return <code>java.util.Map</code> <code>executionEnvironmentList</code>, or an empty list if it is not present
     */
    default @NonNull Map<ExecutionEnvironmentListKey, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentList> nonnullExecutionEnvironmentList() {
        return CodeHelpers.nonnull(getExecutionEnvironmentList());
    }

}

