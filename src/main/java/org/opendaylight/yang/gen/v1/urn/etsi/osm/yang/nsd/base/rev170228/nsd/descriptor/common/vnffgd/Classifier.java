package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.Vnffgd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of classifier rules.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list classifier {
 *   key id;
 *   uses classifier-common;
 *   leaf member-vnf-index-ref {
 *     type leafref {
 *       path ../../../constituent-vnfd/member-vnf-index;
 *     }
 *   }
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *     }
 *   }
 *   leaf vnfd-connection-point-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd/classifier</i>
 * 
 * <p>To create instances of this class use {@link ClassifierBuilder}.
 * @see ClassifierBuilder
 * @see ClassifierKey
 *
 */
public interface Classifier
    extends
    ChildOf<Vnffgd>,
    Augmentable<Classifier>,
    ClassifierCommon,
    Identifiable<ClassifierKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("classifier");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier.class;
    }
    
    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getMemberVnfIndexRef();
    
    /**
     * A reference to a vnfd. This is a leafref to path: ../../../nsd:constituent-vnfd
     * + [nsd:id = current()/../nsd:id-ref] + /nsd:vnfd-id-ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfdIdRef();
    
    /**
     * A reference to a connection point name in a vnfd. This is a leafref to path:
     * /vnfd:vnfd-catalog/vnfd:vnfd + [vnfd:id = current()/../nsd:vnfd-id-ref] +
     * /vnfd:connection-point/vnfd:name NOTE: An issue with confd is preventing the use
     * of xpath. Seems to be an issue with leafref to leafref, whose target is in a
     * different module. Once that is resolved this will switched to use leafref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable String getVnfdConnectionPointRef();
    
    @Override
    ClassifierKey key();

}

