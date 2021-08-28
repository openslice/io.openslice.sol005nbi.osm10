package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The NSD information element is a deployment template whose instances are used 
 * the NFVO for the lifecycle management of NSs.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-nsd</b>
 * <pre>
 * list nsd {
 *   key id;
 *   max-elements 1;
 *   uses vnf:nsd;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-nsd/nsd/nsd</i>
 * 
 * <p>To create instances of this class use {@link NsdBuilder}.
 * @see NsdBuilder
 * @see NsdKey
 *
 */
public interface Nsd
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.Nsd>,
    Augmentable<Nsd>,
    org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd,
    Identifiable<NsdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Nsd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.Nsd.class;
    }
    
    @Override
    NsdKey key();

}

