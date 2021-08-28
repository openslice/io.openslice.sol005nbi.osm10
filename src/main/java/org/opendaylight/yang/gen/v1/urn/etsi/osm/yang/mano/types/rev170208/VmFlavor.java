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
 * grouping vm-flavor {
 *   container vm-flavor {
 *     leaf vcpu-count {
 *       type uint16;
 *     }
 *     leaf memory-mb {
 *       type uint64;
 *     }
 *     leaf storage-gb {
 *       type uint64;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vm-flavor</i>
 *
 */
public interface VmFlavor
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vm-flavor");

    @Override
    Class<? extends VmFlavor> implementedInterface();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vm.flavor.VmFlavor</code> <code>vmFlavor</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vm.flavor.@Nullable VmFlavor getVmFlavor();

}

