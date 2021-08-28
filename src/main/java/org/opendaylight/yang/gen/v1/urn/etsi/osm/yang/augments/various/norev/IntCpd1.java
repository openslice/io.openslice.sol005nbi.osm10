package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu.IntCpd;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface IntCpd1
    extends
    Augmentation<IntCpd>,
    ExtendedCpd
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.IntCpd1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.IntCpd1.class;
    }

}

