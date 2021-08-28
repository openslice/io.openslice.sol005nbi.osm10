package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.vnfd.rev190318.Vnfd;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface Vnfd1
    extends
    Augmentation<Vnfd>,
    ExtendedVip
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.Vnfd1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.Vnfd1.class;
    }

}

