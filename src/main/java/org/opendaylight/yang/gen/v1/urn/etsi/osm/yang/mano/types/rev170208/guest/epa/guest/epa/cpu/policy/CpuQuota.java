package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.CpuPolicy;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case cpu-quota {
 *   container cpu-quota {
 *     uses allocation-properties;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/cpu-policy/cpu-quota</i>
 *
 */
public interface CpuQuota
    extends
    DataObject,
    Augmentable<CpuQuota>,
    CpuPolicy
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cpu-quota");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.CpuQuota> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.CpuQuota.class;
    }
    
    /**
     * CPU quota describes the CPU resource allocation policy. Limit and Reserve values
     * are defined in MHz
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.cpu.quota.CpuQuota</code> <code>cpuQuota</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.cpu.quota.@Nullable CpuQuota getCpuQuota();

}

