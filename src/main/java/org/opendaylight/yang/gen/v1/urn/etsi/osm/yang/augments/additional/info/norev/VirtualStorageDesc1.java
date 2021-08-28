package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.additional.info.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.VirtualStorageDesc;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.Description;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface VirtualStorageDesc1
    extends
    Augmentation<VirtualStorageDesc>,
    Description
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.additional.info.norev.VirtualStorageDesc1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.additional.info.norev.VirtualStorageDesc1.class;
    }

}

