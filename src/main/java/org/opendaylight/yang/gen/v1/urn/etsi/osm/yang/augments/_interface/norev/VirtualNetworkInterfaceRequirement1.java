package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments._interface.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.VirtualNetworkInterfaceRequirement;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface VirtualNetworkInterfaceRequirement1
    extends
    Augmentation<VirtualNetworkInterfaceRequirement>,
    ExtendedInterface
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments._interface.norev.VirtualNetworkInterfaceRequirement1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments._interface.norev.VirtualNetworkInterfaceRequirement1.class;
    }

}

