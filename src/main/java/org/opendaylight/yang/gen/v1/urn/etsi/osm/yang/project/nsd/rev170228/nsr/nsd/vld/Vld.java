package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.vld;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdVldCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.NsrNsdVld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.vld.vld.VnfdConnectionPointRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.vld.vld.VnfdConnectionPointRefKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list vld {
 *   key id;
 *   uses nsd-base:nsd-vld-common;
 *   list vnfd-connection-point-ref {
 *     key "member-vnf-index-ref vnfd-connection-point-ref";
 *     leaf member-vnf-index-ref {
 *       type leafref {
 *         path ../../../constituent-vnfd/member-vnf-index;
 *       }
 *     }
 *     leaf vnfd-id-ref {
 *       type string;
 *     }
 *     leaf vnfd-connection-point-ref {
 *       type leafref {
 *         path "../../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:connection-point/project-vnfd:name";
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-vld/vld</i>
 * 
 * <p>To create instances of this class use {@link VldBuilder}.
 * @see VldBuilder
 * @see VldKey
 *
 */
public interface Vld
    extends
    ChildOf<NsrNsdVld>,
    Augmentable<Vld>,
    NsdVldCommon,
    Identifiable<VldKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vld");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.vld.Vld> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.vld.Vld.class;
    }
    
    /**
     * A list of references to connection points.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfdConnectionPointRefKey, VnfdConnectionPointRef> getVnfdConnectionPointRef();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfdConnectionPointRef</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfdConnectionPointRefKey, VnfdConnectionPointRef> nonnullVnfdConnectionPointRef() {
        return CodeHelpers.nonnull(getVnfdConnectionPointRef());
    }
    
    @Override
    VldKey key();

}

