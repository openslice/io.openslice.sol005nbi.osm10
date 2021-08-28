package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.mem.quota.MemQuota;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * grouping extended-mem-quota {
 *   container mem-quota {
 *     uses allocation-properties;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-mem-quota</i>
 *
 */
public interface ExtendedMemQuota
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-mem-quota");

    @Override
    Class<? extends ExtendedMemQuota> implementedInterface();
    
    /**
     * Memory quota describes the memory resource allocation policy. Limit and Reserve
     * values are defined in MB
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.mem.quota.MemQuota</code> <code>memQuota</code>, or <code>null</code> if not present
     */
    @Nullable MemQuota getMemQuota();

}

