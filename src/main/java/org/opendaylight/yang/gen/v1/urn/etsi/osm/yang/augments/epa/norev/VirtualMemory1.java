package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.VirtualMemory;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface VirtualMemory1
    extends
    Augmentation<VirtualMemory>,
    ExtendedNuma,
    ExtendedMempageSize,
    ExtendedMemQuota
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.VirtualMemory1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.VirtualMemory1.class;
    }

}

