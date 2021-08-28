package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.Nsd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A VNF Descriptor (VNFD) is a deployment template which describes a VNF in terms 
 * of deployment and operational behaviour requirements. It also contains 
 * connectivity, interface and virtualised resource requirements
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-nsd</b>
 * <pre>
 * list vnfd {
 *   key id;
 *   uses vnf:vnfd;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-nsd/nsd/vnfd</i>
 * 
 * <p>To create instances of this class use {@link VnfdBuilder}.
 * @see VnfdBuilder
 * @see VnfdKey
 *
 */
public interface Vnfd
    extends
    ChildOf<Nsd>,
    Augmentable<Vnfd>,
    org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd,
    Identifiable<VnfdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Vnfd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Vnfd.class;
    }
    
    @Override
    VnfdKey key();

}

