package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.VirtualLinkDesc;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface VirtualLinkDesc1
    extends
    Augmentation<VirtualLinkDesc>,
    ExtendedVld
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.VirtualLinkDesc1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.vld.norev.VirtualLinkDesc1.class;
    }

}

