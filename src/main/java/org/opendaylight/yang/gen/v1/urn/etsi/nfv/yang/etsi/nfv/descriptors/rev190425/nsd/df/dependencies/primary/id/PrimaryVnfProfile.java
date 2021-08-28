package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.primary.id;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.PrimaryId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

public interface PrimaryVnfProfile
    extends
    DataObject,
    Augmentable<PrimaryVnfProfile>,
    PrimaryId
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("primary-vnf-profile");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.primary.id.PrimaryVnfProfile> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.primary.id.PrimaryVnfProfile.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>primaryVnfProfile</code>, or <code>null</code> if not present
     */
    @Nullable String getPrimaryVnfProfile();

}

