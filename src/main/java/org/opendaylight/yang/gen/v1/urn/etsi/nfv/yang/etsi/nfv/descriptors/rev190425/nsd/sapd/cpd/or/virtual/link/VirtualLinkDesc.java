package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.sapd.cpd.or.virtual.link;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.sapd.CpdOrVirtualLink;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

public interface VirtualLinkDesc
    extends
    DataObject,
    Augmentable<VirtualLinkDesc>,
    CpdOrVirtualLink
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-link-desc");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.sapd.cpd.or.virtual.link.VirtualLinkDesc> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.sapd.cpd.or.virtual.link.VirtualLinkDesc.class;
    }
    
    /**
     * References the descriptor of the NS VL instance to which the SAP instantiated
     * from this SAPD connects to.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>virtualLinkDesc</code>, or <code>null</code> if not present
     */
    @Nullable String getVirtualLinkDesc();

}

