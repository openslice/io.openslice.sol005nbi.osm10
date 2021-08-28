package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vm.flavor;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint16;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container vm-flavor {
 *   leaf vcpu-count {
 *     type uint16;
 *   }
 *   leaf memory-mb {
 *     type uint64;
 *   }
 *   leaf storage-gb {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vm-flavor/vm-flavor</i>
 * 
 * <p>To create instances of this class use {@link VmFlavorBuilder}.
 * @see VmFlavorBuilder
 *
 */
public interface VmFlavor
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor>,
    Augmentable<VmFlavor>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vm-flavor");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vm.flavor.VmFlavor> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vm.flavor.VmFlavor.class;
    }
    
    /**
     * Number of VCPUs for the VM.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint16</code> <code>vcpuCount</code>, or <code>null</code> if not present
     */
    @Nullable Uint16 getVcpuCount();
    
    /**
     * Amount of memory in MB.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>memoryMb</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getMemoryMb();
    
    /**
     * Amount of disk space in GB.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>storageGb</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getStorageGb();

}

