package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Cpd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Pnfd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Specifies the characteristics of one or more connection points where to connect 
 * the PNF to a VL.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * list ext-cpd {
 *   key id;
 *   uses cpd;
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/pnfd/ext-cpd</i>
 * 
 * <p>To create instances of this class use {@link ExtCpdBuilder}.
 * @see ExtCpdBuilder
 * @see ExtCpdKey
 *
 */
public interface ExtCpd
    extends
    ChildOf<Pnfd>,
    Augmentable<ExtCpd>,
    Cpd,
    Identifiable<ExtCpdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ext-cpd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd.ExtCpd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd.ExtCpd.class;
    }
    
    @Override
    ExtCpdKey key();

}

