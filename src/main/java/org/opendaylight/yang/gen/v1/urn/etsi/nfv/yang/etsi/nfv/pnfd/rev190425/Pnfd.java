package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.pnfd.rev190425;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-pnfd</b>
 * <pre>
 * container pnfd {
 *   presence "PNFD container.";
 *   uses vnf:pnfd;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-pnfd/pnfd</i>
 * 
 * <p>To create instances of this class use {@link PnfdBuilder}.
 * @see PnfdBuilder
 *
 */
public interface Pnfd
    extends
    ChildOf<EtsiNfvPnfdData>,
    Augmentable<Pnfd>,
    org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("pnfd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.pnfd.rev190425.Pnfd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.pnfd.rev190425.Pnfd.class;
    }

}

