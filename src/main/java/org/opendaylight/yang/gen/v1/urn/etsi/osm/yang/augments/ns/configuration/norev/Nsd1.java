package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Nsd;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface Nsd1
    extends
    Augmentation<Nsd>,
    ExtendedNsConfiguration
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.Nsd1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.Nsd1.class;
    }

}

