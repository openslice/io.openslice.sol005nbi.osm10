package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.cpu.quota;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.AllocationProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.ExtendedCpuQuota;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * CPU quota describes the CPU resource allocation policy. Limit and Reserve 
 * are defined in MHz
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>epa</b>
 * <pre>
 * container cpu-quota {
 *   uses allocation-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>epa/extended-cpu-quota/cpu-quota</i>
 * 
 * <p>To create instances of this class use {@link CpuQuotaBuilder}.
 * @see CpuQuotaBuilder
 *
 */
public interface CpuQuota
    extends
    ChildOf<ExtendedCpuQuota>,
    Augmentable<CpuQuota>,
    AllocationProperties
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cpu-quota");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.cpu.quota.CpuQuota> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.cpu.quota.CpuQuota.class;
    }

}

