package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.virtual.compute.desc.virtual.cpu.Pinning;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface Pinning1
    extends
    Augmentation<Pinning>,
    ExtendedCpuPolicy
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.Pinning1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.Pinning1.class;
    }

}

