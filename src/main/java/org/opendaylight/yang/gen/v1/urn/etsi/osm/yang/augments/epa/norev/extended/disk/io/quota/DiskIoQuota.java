package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.disk.io.quota;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.AllocationProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedDiskIoQuota;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Disk IO quota describes the disk IO operations resource allocation policy. 
 * and Reserve values are defined in IOPS
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * container disk-io-quota {
 *   uses allocation-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-disk-io-quota/disk-io-quota</i>
 * 
 * <p>To create instances of this class use {@link DiskIoQuotaBuilder}.
 * @see DiskIoQuotaBuilder
 *
 */
public interface DiskIoQuota
    extends
    ChildOf<ExtendedDiskIoQuota>,
    Augmentable<DiskIoQuota>,
    AllocationProperties
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("disk-io-quota");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.disk.io.quota.DiskIoQuota> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.disk.io.quota.DiskIoQuota.class;
    }

}

