package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.constituent.vnfd;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.NsdConstituentVnfd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of VNFDs that are part of this network service.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list constituent-vnfd {
 *   key member-vnf-index;
 *   leaf member-vnf-index {
 *     type string;
 *   }
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path "/osm-project:project[osm-project:name = current()/../../../../osm-project:name]/project-vnfd:vnfd-catalog/project-vnfd:vnfd/project-vnfd:id";
 *     }
 *   }
 *   leaf start-by-default {
 *     type boolean;
 *     default true;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-constituent-vnfd/constituent-vnfd</i>
 * 
 * <p>To create instances of this class use {@link ConstituentVnfdBuilder}.
 * @see ConstituentVnfdBuilder
 * @see ConstituentVnfdKey
 *
 */
public interface ConstituentVnfd
    extends
    ChildOf<NsdConstituentVnfd>,
    Augmentable<ConstituentVnfd>,
    Identifiable<ConstituentVnfdKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("constituent-vnfd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd.class;
    }
    
    /**
     * Identifier/index for the VNFD. This separate id is required to ensure that
     * multiple VNFs can be part of single NS
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndex</code>, or <code>null</code> if not present
     */
    @Nullable String getMemberVnfIndex();
    
    /**
     * Identifier for the VNFD.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getVnfdIdRef();
    
    /**
     * VNFD is started as part of the NS instantiation
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>startByDefault</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isStartByDefault();
    
    @Override
    ConstituentVnfdKey key();

}

