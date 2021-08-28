package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VirtualLinkProfile;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface VirtualLinkProfile1
    extends
    Augmentation<VirtualLinkProfile>,
    ExtendedVldProtocolData
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.VirtualLinkProfile1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.VirtualLinkProfile1.class;
    }

}

