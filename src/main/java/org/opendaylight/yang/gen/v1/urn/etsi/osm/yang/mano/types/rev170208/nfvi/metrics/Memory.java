package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.NfviMetrics;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container memory {
 *   leaf label {
 *     type string;
 *     default MEMORY;
 *   }
 *   leaf used {
 *     type uint64;
 *   }
 *   leaf total {
 *     type uint64;
 *   }
 *   leaf utilization {
 *     type decimal64 {
 *       fraction-digits 2;
 *       range "0 .. 100";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/memory</i>
 * 
 * <p>To create instances of this class use {@link MemoryBuilder}.
 * @see MemoryBuilder
 *
 */
public interface Memory
    extends
    ChildOf<NfviMetrics>,
    Augmentable<Memory>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("memory");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.Memory> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.nfvi.metrics.Memory.class;
    }
    
    /**
     * Label to show in UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    @Nullable String getLabel();
    
    /**
     * The amount of memory (bytes) currently in use.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>used</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getUsed();
    
    /**
     * The amount of memory (bytes) available.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>total</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getTotal();
    
    /**
     * The memory utilization (percentage).
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>utilization</code>, or <code>null</code> if not present
     */
    @Nullable BigDecimal getUtilization();

}

