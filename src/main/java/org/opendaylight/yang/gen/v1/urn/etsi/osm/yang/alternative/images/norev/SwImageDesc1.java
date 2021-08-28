package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.SwImageDesc;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface SwImageDesc1
    extends
    Augmentation<SwImageDesc>,
    ExtendedVimType
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev.SwImageDesc1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.alternative.images.norev.SwImageDesc1.class;
    }

}

