package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.k8s.cluster;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.K8sCluster;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of required networks in the K8s cluster. The cluster where the KDUs will 
 * deployed will have to use one of these CNI plugins.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>kdu</b>
 * <pre>
 * list nets {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>kdu/extended-kdu/k8s-cluster/nets</i>
 * 
 * <p>To create instances of this class use {@link NetsBuilder}.
 * @see NetsBuilder
 * @see NetsKey
 *
 */
public interface Nets
    extends
    ChildOf<K8sCluster>,
    Augmentable<Nets>,
    Identifiable<NetsKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nets");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.k8s.cluster.Nets> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.k8s.cluster.Nets.class;
    }
    
    /**
     * Internal identifier for the K8s cluster network in this VNF
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();
    
    @Override
    NetsKey key();

}

