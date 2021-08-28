package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.K8sCluster;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.Kdu;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.KduKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.Service;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.ServiceKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>kdu</b>
 * <pre>
 * grouping extended-kdu {
 *   list kdu {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     choice kdu-model {
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
 *       case juju-bundle {
 *         leaf juju-bundle {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 *   container k8s-cluster {
 *     leaf-list version {
 *       type string;
 *     }
 *     leaf-list cni {
 *       type enumeration {
 *         enum calico;
 *         enum flannel;
 *         enum multus;
 *       }
 *     }
 *     list nets {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *     }
 *   }
 *   list service {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf mgmt-service {
 *       type boolean;
 *       default false;
 *     }
 *     leaf external-connection-point-ref {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>kdu/extended-kdu</i>
 *
 */
public interface ExtendedKdu
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-kdu");

    @Override
    Class<? extends ExtendedKdu> implementedInterface();
    
    /**
     * List of K8s Deployment Units
     *
     *
     *
     * @return <code>java.util.Map</code> <code>kdu</code>, or <code>null</code> if not present
     */
    @Nullable Map<KduKey, Kdu> getKdu();
    
    /**
     * @return <code>java.util.Map</code> <code>kdu</code>, or an empty list if it is not present
     */
    default @NonNull Map<KduKey, Kdu> nonnullKdu() {
        return CodeHelpers.nonnull(getKdu());
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.K8sCluster</code> <code>k8sCluster</code>, or <code>null</code> if not present
     */
    @Nullable K8sCluster getK8sCluster();
    
    /**
     * List of Kubernetes services exposed by the KDU. If empty, all services are
     * assumed to be exposed in the CP associated to the first network in
     * k8s-cluster.nets.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>service</code>, or <code>null</code> if not present
     */
    @Nullable Map<ServiceKey, Service> getService();
    
    /**
     * @return <code>java.util.Map</code> <code>service</code>, or an empty list if it is not present
     */
    default @NonNull Map<ServiceKey, Service> nonnullService() {
        return CodeHelpers.nonnull(getService());
    }

}

