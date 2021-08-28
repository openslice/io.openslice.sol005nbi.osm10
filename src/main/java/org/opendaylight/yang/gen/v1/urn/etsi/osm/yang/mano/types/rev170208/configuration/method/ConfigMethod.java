package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Defines the configuration method for the VNF or VDU.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice config-method {
 *   case script {
 *     container script {
 *       leaf script-type {
 *         type enumeration {
 *           enum rift;
 *         }
 *       }
 *     }
 *   }
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
 *   case execution-environment-list {
 *     list execution-environment-list {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       choice execution-environment-model {
 *         case juju {
 *           container juju {
 *             leaf charm {
 *               type string;
 *             }
 *             leaf proxy {
 *               type boolean;
 *               default true;
 *             }
 *             leaf cloud {
 *               type enumeration {
 *                 enum lxd;
 *                 enum k8s;
 *               }
 *               default lxd;
 *             }
 *           }
 *         }
 *         case helm-chart {
 *           leaf helm-chart {
 *             type string;
 *           }
 *           leaf helm-version {
 *             type enumeration {
 *               enum v2;
 *               enum v3;
 *             }
 *             default v3;
 *           }
 *         }
 *       }
 *       leaf metric-service {
 *         type string;
 *       }
 *       leaf connection-point-ref {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/configuration-method/config-method</i>
 *
 */
public interface ConfigMethod
    extends
    ChoiceIn<ConfigurationMethod>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("config-method");


}

