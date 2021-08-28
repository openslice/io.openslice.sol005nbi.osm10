package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.secondary.id;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.SecondaryId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

public interface SecondaryNsProfile
    extends
    DataObject,
    Augmentable<SecondaryNsProfile>,
    SecondaryId
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("secondary-ns-profile");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.secondary.id.SecondaryNsProfile> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.dependencies.secondary.id.SecondaryNsProfile.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>secondaryNsProfile</code>, or <code>null</code> if not present
     */
    @Nullable String getSecondaryNsProfile();

}

