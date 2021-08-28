package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Vdu;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface Vdu1
    extends
    Augmentation<Vdu>,
    ExtendedAlternativeImages
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev.Vdu1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev.Vdu1.class;
    }

}

