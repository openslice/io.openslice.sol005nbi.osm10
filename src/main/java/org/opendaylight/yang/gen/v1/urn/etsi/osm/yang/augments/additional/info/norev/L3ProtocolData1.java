package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.additional.info.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.virtual.link.profile.virtual.link.protocol.data.L3ProtocolData;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.Description;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface L3ProtocolData1
    extends
    Augmentation<L3ProtocolData>,
    Description
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.additional.info.norev.L3ProtocolData1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.additional.info.norev.L3ProtocolData1.class;
    }

}

