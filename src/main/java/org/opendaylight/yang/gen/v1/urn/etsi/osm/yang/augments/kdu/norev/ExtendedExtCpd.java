package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>kdu</b>
 * <pre>
 * grouping extended-ext-cpd {
 *   leaf k8s-cluster-net {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>kdu/extended-ext-cpd</i>
 *
 */
public interface ExtendedExtCpd
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-ext-cpd");

    @Override
    Class<? extends ExtendedExtCpd> implementedInterface();
    
    /**
     * Reference to the K8s cluster network to which CPs instantiated from this
     * external CP Descriptor (CPD) connect.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>k8sClusterNet</code>, or <code>null</code> if not present
     */
    @Nullable String getK8sClusterNet();

}

