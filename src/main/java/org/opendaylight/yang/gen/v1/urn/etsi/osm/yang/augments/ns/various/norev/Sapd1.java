package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.various.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Sapd;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface Sapd1
    extends
    Augmentation<Sapd>,
    ExtendedFloatingIp
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.various.norev.Sapd1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.various.norev.Sapd1.class;
    }

}

