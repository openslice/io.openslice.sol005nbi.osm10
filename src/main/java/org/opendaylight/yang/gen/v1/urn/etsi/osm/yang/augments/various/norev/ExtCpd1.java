package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ExtCpd;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface ExtCpd1
    extends
    Augmentation<ExtCpd>,
    ExtendedCpd
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.ExtCpd1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.various.norev.ExtCpd1.class;
    }

}

