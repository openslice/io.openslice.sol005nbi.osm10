package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.execution.environment.list.ExecutionEnvironmentModel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Interact with the VNF or xDU through Juju.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * case juju {
 *   container juju {
 *     leaf charm {
 *       type string;
 *     }
 *     leaf proxy {
 *       type boolean;
 *       default true;
 *     }
 *     leaf cloud {
 *       type enumeration {
 *         enum lxd;
 *         enum k8s;
 *       }
 *       default lxd;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/configuration-method/config-method/execution-environment-list/execution-environment-list/execution-environment-model/juju</i>
 *
 */
public interface Juju
    extends
    DataObject,
    Augmentable<Juju>,
    ExecutionEnvironmentModel
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("juju");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model.Juju> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model.Juju.class;
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model.juju.Juju</code> <code>juju</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list.execution.environment.list.execution.environment.model.juju.@Nullable Juju getJuju();

}

