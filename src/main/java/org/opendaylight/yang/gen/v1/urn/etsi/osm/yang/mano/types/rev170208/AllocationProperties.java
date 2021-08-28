package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping allocation-properties {
 *   leaf limit {
 *     type uint64;
 *   }
 *   leaf reserve {
 *     type uint64;
 *   }
 *   leaf shares {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/allocation-properties</i>
 *
 */
public interface AllocationProperties
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("allocation-properties");

    @Override
    Class<? extends AllocationProperties> implementedInterface();
    
    /**
     * Defines the maximum allocation. The value 0 indicates that usage is not limited.
     * This parameter ensures that the instance never uses more than the defined amount
     * of resource.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>limit</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getLimit();
    
    /**
     * Defines the guaranteed minimum reservation. If needed, the machine will
     * definitely get allocated the reserved amount of resources.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>reserve</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getReserve();
    
    /**
     * Number of shares allocated. Specifies the proportional weighted share for the
     * domain. If this element is omitted, the service defaults to the OS provided
     * defaults
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>shares</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getShares();

}

