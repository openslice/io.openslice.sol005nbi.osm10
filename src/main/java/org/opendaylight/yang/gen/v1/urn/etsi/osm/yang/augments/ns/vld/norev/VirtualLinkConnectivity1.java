package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.vnf.profile.VirtualLinkConnectivity;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface VirtualLinkConnectivity1
    extends
    Augmentation<VirtualLinkConnectivity>,
    DeviatedConstituentCpdId
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.VirtualLinkConnectivity1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.VirtualLinkConnectivity1.class;
    }

}

