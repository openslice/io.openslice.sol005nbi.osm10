package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nfv;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The Pnfd information element is a deployment template enabling on-boarding PNFs 
 * and referencing them from an NSD. It focuses on connectivity aspects only.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list pnfd {
 *   key id;
 *   uses pnfd;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nfv/pnfd</i>
 * 
 * <p>To create instances of this class use {@link PnfdBuilder}.
 * @see PnfdBuilder
 * @see PnfdKey
 *
 */
public interface Pnfd
    extends
    ChildOf<Nfv>,
    Augmentable<Pnfd>,
    org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd,
    Identifiable<PnfdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("pnfd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.Pnfd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.Pnfd.class;
    }
    
    @Override
    PnfdKey key();

}

