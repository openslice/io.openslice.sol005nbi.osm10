package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.OperateVnfOpConfig;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface OperateVnfOpConfig1
    extends
    Augmentation<OperateVnfOpConfig>,
    ExtendedVnfConfiguration
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.OperateVnfOpConfig1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.day1._2.norev.OperateVnfOpConfig1.class;
    }

}

