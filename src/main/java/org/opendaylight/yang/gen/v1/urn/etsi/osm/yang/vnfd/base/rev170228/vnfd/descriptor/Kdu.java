package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.KduConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.KduModel;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.Service;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.ServiceKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of K8s Deployment Units
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list kdu {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   container kdu-configuration {
 *     uses manotypes:vca-configuration;
 *     uses manotypes:vca-config-access;
 *     leaf-list blacklist-config-primitive {
 *       type enumeration {
 *         enum upgrade;
 *         enum rollback;
 *       }
 *     }
 *   }
 *   choice kdu-model {
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
 *     case juju-bundle {
 *       leaf juju-bundle {
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
 * <i>vnfd-base/vnfd-descriptor/kdu</i>
 * 
 * <p>To create instances of this class use {@link KduBuilder}.
 * @see KduBuilder
 * @see KduKey
 *
 */
public interface Kdu
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<Kdu>,
    Identifiable<KduKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("kdu");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Kdu> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Kdu.class;
    }
    
    /**
     * Unique name for the KDU
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Description of the KDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.KduConfiguration</code> <code>kduConfiguration</code>, or <code>null</code> if not present
     */
    @Nullable KduConfiguration getKduConfiguration();
    
    /**
     * Indicates the KDU model, either as a helm-chart or as a juju-bundle.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.KduModel</code> <code>kduModel</code>, or <code>null</code> if not present
     */
    @Nullable KduModel getKduModel();
    
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
    
    @Override
    KduKey key();

}

