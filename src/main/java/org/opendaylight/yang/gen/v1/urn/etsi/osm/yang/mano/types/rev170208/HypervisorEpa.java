package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping hypervisor-epa {
 *   container hypervisor-epa {
 *     leaf type {
 *       type enumeration {
 *         enum PREFER_KVM;
 *         enum REQUIRE_KVM;
 *       }
 *     }
 *     leaf version {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/hypervisor-epa</i>
 *
 */
public interface HypervisorEpa
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("hypervisor-epa");

    @Override
    Class<? extends HypervisorEpa> implementedInterface();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.hypervisor.epa.HypervisorEpa</code> <code>hypervisorEpa</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.hypervisor.epa.@Nullable HypervisorEpa getHypervisorEpa();

}

