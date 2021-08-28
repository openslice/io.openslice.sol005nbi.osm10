package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.disk.io.quota.DiskIoQuota;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * grouping extended-disk-io-quota {
 *   container disk-io-quota {
 *     uses allocation-properties;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-disk-io-quota</i>
 *
 */
public interface ExtendedDiskIoQuota
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-disk-io-quota");

    @Override
    Class<? extends ExtendedDiskIoQuota> implementedInterface();
    
    /**
     * Disk IO quota describes the disk IO operations resource allocation policy. Limit
     * and Reserve values are defined in IOPS
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.disk.io.quota.DiskIoQuota</code> <code>diskIoQuota</code>, or <code>null</code> if not present
     */
    @Nullable DiskIoQuota getDiskIoQuota();

}

