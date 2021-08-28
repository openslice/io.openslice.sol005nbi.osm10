package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.vnfd.rev190318;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-vnfd</b>
 * <pre>
 * container vnfd {
 *   presence "VNFD container.";
 *   uses vnf:vnfd;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-vnfd/vnfd</i>
 * 
 * <p>To create instances of this class use {@link VnfdBuilder}.
 * @see VnfdBuilder
 *
 */
public interface Vnfd
    extends
    ChildOf<EtsiNfvVnfdData>,
    Augmentable<Vnfd>,
    org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.vnfd.rev190318.Vnfd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.vnfd.rev190318.Vnfd.class;
    }

}

