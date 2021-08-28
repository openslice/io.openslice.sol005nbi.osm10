package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ext.cpd.cp.connection._int.cpd;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ExtCpd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container int-cpd {
 *   leaf vdu-id {
 *     type leafref {
 *       path ../../../vdu/id;
 *     }
 *   }
 *   leaf cpd {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/ext-cpd/cp-connection/int-cpd/int-cpd</i>
 * 
 * <p>To create instances of this class use {@link IntCpdBuilder}.
 * @see IntCpdBuilder
 *
 */
public interface IntCpd
    extends
    ChildOf<ExtCpd>,
    Augmentable<IntCpd>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("int-cpd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ext.cpd.cp.connection._int.cpd.IntCpd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.ext.cpd.cp.connection._int.cpd.IntCpd.class;
    }
    
    /**
     * @return <code>java.lang.String</code> <code>vduId</code>, or <code>null</code> if not present
     */
    @Nullable String getVduId();
    
    /**
     * @return <code>java.lang.String</code> <code>cpd</code>, or <code>null</code> if not present
     */
    @Nullable String getCpd();

}

