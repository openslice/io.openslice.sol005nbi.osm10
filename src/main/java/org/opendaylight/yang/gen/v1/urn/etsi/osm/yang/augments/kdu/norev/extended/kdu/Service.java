package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.ExtendedKdu;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of Kubernetes services exposed by the KDU. If empty, all services are 
 * assumed to be exposed in the CP associated to the first network in 
 * k8s-cluster.nets.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>kdu</b>
 * <pre>
 * list service {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf mgmt-service {
 *     type boolean;
 *     default false;
 *   }
 *   leaf external-connection-point-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>kdu/extended-kdu/service</i>
 * 
 * <p>To create instances of this class use {@link ServiceBuilder}.
 * @see ServiceBuilder
 * @see ServiceKey
 *
 */
public interface Service
    extends
    ChildOf<ExtendedKdu>,
    Augmentable<Service>,
    Identifiable<ServiceKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("service");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.Service> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.Service.class;
    }
    
    /**
     * Name of the Kubernetes service exposed by he KDU model
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Flag to indicate that this Kubernetes service is a mgmt service to be used for
     * KDU configuration. Defaults to false (if no present). All services with
     * mgmt-service set to true will be passed to the execution environment in charge
     * of the KDU configuration.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mgmtService</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isMgmtService();
    
    /**
     * String representing a leaf reference to the particular external connection
     * point. This field should match
     * /etsi-nfv-vnfd:vnfd/etsi-nfv-vnfd:ext-cpd/etsi-nfv-vnfd:id 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>externalConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable String getExternalConnectionPointRef();
    
    @Override
    ServiceKey key();

}

