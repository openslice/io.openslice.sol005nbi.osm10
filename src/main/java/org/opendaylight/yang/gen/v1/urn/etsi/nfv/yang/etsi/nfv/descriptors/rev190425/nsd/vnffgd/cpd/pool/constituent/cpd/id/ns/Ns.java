package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.constituent.cpd.id.ns;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.CpdPool;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container ns {
 *   leaf nsd-id {
 *     type leafref {
 *       path ../../../../../nsd/id;
 *     }
 *   }
 *   leaf sap-cpd-id {
 *     type leafref {
 *       path deref(../nsd-id)/../sapd/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/vnffgd/cpd-pool/constituent-cpd-id/ns/ns</i>
 * 
 * <p>To create instances of this class use {@link NsBuilder}.
 * @see NsBuilder
 *
 */
public interface Ns
    extends
    ChildOf<CpdPool>,
    Augmentable<Ns>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ns");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.constituent.cpd.id.ns.Ns> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.constituent.cpd.id.ns.Ns.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>nsdId</code>, or <code>null</code> if not present
     */
    @Nullable String getNsdId();
    
    /**
     * @return <code>java.lang.String</code> <code>sapCpdId</code>, or <code>null</code> if not present
     */
    @Nullable String getSapCpdId();

}

