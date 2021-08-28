package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.constituent.cpd.id.vnf;
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
 * container vnf {
 *   leaf vnfd-id {
 *     type leafref {
 *       path ../../../../../vnfd/id;
 *     }
 *   }
 *   leaf cpd-id {
 *     type leafref {
 *       path deref(../vnfd-id)/../ext-cpd/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/nsd/vnffgd/cpd-pool/constituent-cpd-id/vnf/vnf</i>
 * 
 * <p>To create instances of this class use {@link VnfBuilder}.
 * @see VnfBuilder
 *
 */
public interface Vnf
    extends
    ChildOf<CpdPool>,
    Augmentable<Vnf>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnf");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.constituent.cpd.id.vnf.Vnf> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.vnffgd.cpd.pool.constituent.cpd.id.vnf.Vnf.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>vnfdId</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfdId();
    
    /**
     * @return <code>java.lang.String</code> <code>cpdId</code>, or <code>null</code> if not present
     */
    @Nullable String getCpdId();

}

