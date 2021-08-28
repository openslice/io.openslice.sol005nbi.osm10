package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.alarm.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.Vdu;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface Vdu1
    extends
    Augmentation<Vdu>,
    ExtendedAlarm
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.alarm.norev.Vdu1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.alarm.norev.Vdu1.class;
    }

}

