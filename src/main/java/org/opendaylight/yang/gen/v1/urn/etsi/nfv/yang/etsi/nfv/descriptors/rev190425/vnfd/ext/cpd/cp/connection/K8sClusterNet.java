package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ext.cpd.cp.connection;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ext.cpd.CpConnection;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

public interface K8sClusterNet
    extends
    DataObject,
    Augmentable<K8sClusterNet>,
    CpConnection
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("k8s-cluster-net");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ext.cpd.cp.connection.K8sClusterNet> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ext.cpd.cp.connection.K8sClusterNet.class;
    }
    
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

