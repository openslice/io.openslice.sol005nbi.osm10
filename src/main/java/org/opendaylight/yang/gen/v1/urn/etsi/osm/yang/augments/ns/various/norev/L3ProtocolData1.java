package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.various.norev;
import java.lang.Class;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ip.profiles.norev.extended.vld.protocol.data.virtual.link.protocol.data.L3ProtocolData;
import org.opendaylight.yangtools.yang.binding.Augmentation;

public interface L3ProtocolData1
    extends
    Augmentation<L3ProtocolData>,
    ExtendedSecurityGroup
{




    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.various.norev.L3ProtocolData1> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.various.norev.L3ProtocolData1.class;
    }

}

