package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.execution.environment.list;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.ExecutionEnvironmentList;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Execution environment model (juju, helm-chart)
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * choice execution-environment-model {
 *   case juju {
 *     container juju {
 *       leaf charm {
 *         type string;
 *       }
 *       leaf proxy {
 *         type boolean;
 *         default true;
 *       }
 *       leaf cloud {
 *         type enumeration {
 *           enum lxd;
 *           enum k8s;
 *         }
 *         default lxd;
 *       }
 *     }
 *   }
 *   case helm-chart {
 *     leaf helm-chart {
 *       type string;
 *     }
 *     leaf helm-version {
 *       type enumeration {
 *         enum v2;
 *         enum v3;
 *       }
 *       default v3;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/configuration-method/config-method/execution-environment-list/execution-environment-list/execution-environment-model</i>
 *
 */
public interface ExecutionEnvironmentModel
    extends
    ChoiceIn<ExecutionEnvironmentList>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("execution-environment-model");


}

