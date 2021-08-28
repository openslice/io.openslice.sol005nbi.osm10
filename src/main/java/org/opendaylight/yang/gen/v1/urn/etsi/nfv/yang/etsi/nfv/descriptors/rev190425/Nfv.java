package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.Nsd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.NsdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.Pnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.PnfdKey;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.VnfdKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container nfv {
 *   list vnfd {
 *     key id;
 *     uses vnfd;
 *   }
 *   list nsd {
 *     key id;
 *     uses nsd;
 *   }
 *   list pnfd {
 *     key id;
 *     uses pnfd;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nfv</i>
 * 
 * <p>To create instances of this class use {@link NfvBuilder}.
 * @see NfvBuilder
 *
 */
public interface Nfv
    extends
    ChildOf<EtsiNfvDescriptorsData>,
    Augmentable<Nfv>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nfv");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nfv> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nfv.class;
    }
    
    /**
     * A VNF Descriptor (VNFD) is a deployment template which describes a VNF in terms
     * of deployment and operational behaviour requirements. It also contains
     * connectivity, interface and virtualised resource requirements
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfd</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfdKey, Vnfd> getVnfd();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfd</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfdKey, Vnfd> nonnullVnfd() {
        return CodeHelpers.nonnull(getVnfd());
    }
    
    /**
     * The NSD information element is a deployment template whose instances are used by
     * the NFVO for the lifecycle management of NSs.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>nsd</code>, or <code>null</code> if not present
     */
    @Nullable Map<NsdKey, Nsd> getNsd();
    
    /**
     * @return <code>java.util.Map</code> <code>nsd</code>, or an empty list if it is not present
     */
    default @NonNull Map<NsdKey, Nsd> nonnullNsd() {
        return CodeHelpers.nonnull(getNsd());
    }
    
    /**
     * The Pnfd information element is a deployment template enabling on-boarding PNFs
     * and referencing them from an NSD. It focuses on connectivity aspects only.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>pnfd</code>, or <code>null</code> if not present
     */
    @Nullable Map<PnfdKey, Pnfd> getPnfd();
    
    /**
     * @return <code>java.util.Map</code> <code>pnfd</code>, or an empty list if it is not present
     */
    default @NonNull Map<PnfdKey, Pnfd> nonnullPnfd() {
        return CodeHelpers.nonnull(getPnfd());
    }

}

