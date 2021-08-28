package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.sapd.cpd.or.virtual.link.pnf;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Sapd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container pnf {
 *   leaf pnfd-id {
 *     type leafref {
 *       path ../../../../pnfd/id;
 *     }
 *     must boolean(../pnfd-id[.=current()]);
 *   }
 *   leaf ext-cpd-id {
 *     type leafref {
 *       path deref(../pnfd-id)/../ext-cpd/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/sapd/cpd-or-virtual-link/pnf/pnf</i>
 * 
 * <p>To create instances of this class use {@link PnfBuilder}.
 * @see PnfBuilder
 *
 */
public interface Pnf
    extends
    ChildOf<Sapd>,
    Augmentable<Pnf>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("pnf");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.sapd.cpd.or.virtual.link.pnf.Pnf> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.sapd.cpd.or.virtual.link.pnf.Pnf.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>pnfdId</code>, or <code>null</code> if not present
     */
    @Nullable String getPnfdId();
    
    /**
     * @return <code>java.lang.String</code> <code>extCpdId</code>, or <code>null</code> if not present
     */
    @Nullable String getExtCpdId();

}

