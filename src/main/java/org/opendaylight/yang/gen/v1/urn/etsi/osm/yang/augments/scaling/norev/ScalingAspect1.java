package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.ScalingAspect;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface ScalingAspect1
    extends
    Augmentation<ScalingAspect>,
    ExtendedScaling
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.ScalingAspect1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.scaling.norev.ScalingAspect1.class;
    }

}

