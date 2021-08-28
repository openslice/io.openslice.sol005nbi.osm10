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

public interface IntVirtualLinkDesc
    extends
    DataObject,
    Augmentable<IntVirtualLinkDesc>,
    CpConnection
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("int-virtual-link-desc");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ext.cpd.cp.connection.IntVirtualLinkDesc> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ext.cpd.cp.connection.IntVirtualLinkDesc.class;
    }
    
    /**
     * Reference to the internal Virtual Link Descriptor (VLD) to which CPs
     * instantiated from this external CP Descriptor (CPD) connect. Either
     * intVirtualLinkDesc or intCpd shall be present.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>intVirtualLinkDesc</code>, or <code>null</code> if not present
     */
    @Nullable String getIntVirtualLinkDesc();

}

