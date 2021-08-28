package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
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
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * grouping link-bitrate-requirements {
 *   leaf root {
 *     type uint64;
 *     units Mbps;
 *   }
 *   leaf leaf {
 *     type uint64;
 *     units Mbps;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/link-bitrate-requirements</i>
 *
 */
public interface LinkBitrateRequirements
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("link-bitrate-requirements");

    @Override
    Class<? extends LinkBitrateRequirements> implementedInterface();
    
    /**
     * Specifies the throughput requirement of the link (e.g. bitrate of E-Line, root
     * bitrate of E-Tree, aggregate capacity of E-LAN).
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>root</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getRoot();
    
    /**
     * Specifies the throughput requirement of leaf connections to the link when
     * applicable to the connectivity type (e.g. for E-Tree and E-LAN branches).
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>leaf</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getLeaf();

}

