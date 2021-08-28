package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.GuestEpa;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Disk IO quota describes the disk IO operations resource allocation policy. 
 * and Reserve values are defined in IOPS
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container disk-io-quota {
 *   uses allocation-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/disk-io-quota</i>
 * 
 * <p>To create instances of this class use {@link DiskIoQuotaBuilder}.
 * @see DiskIoQuotaBuilder
 *
 */
public interface DiskIoQuota
    extends
    ChildOf<GuestEpa>,
    Augmentable<DiskIoQuota>,
    AllocationProperties
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("disk-io-quota");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.DiskIoQuota> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.DiskIoQuota.class;
    }

}

