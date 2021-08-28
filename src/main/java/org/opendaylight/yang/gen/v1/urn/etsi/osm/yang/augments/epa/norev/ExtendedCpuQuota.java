package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.cpu.quota.CpuQuota;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * grouping extended-cpu-quota {
 *   container cpu-quota {
 *     uses allocation-properties;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-cpu-quota</i>
 *
 */
public interface ExtendedCpuQuota
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-cpu-quota");

    @Override
    Class<? extends ExtendedCpuQuota> implementedInterface();
    
    /**
     * CPU quota describes the CPU resource allocation policy. Limit and Reserve values
     * are defined in MHz
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.cpu.quota.CpuQuota</code> <code>cpuQuota</code>, or <code>null</code> if not present
     */
    @Nullable CpuQuota getCpuQuota();

}

