package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.RspCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.Vnffgd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRefKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of Rendered Service Paths (RSP).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list rsp {
 *   key id;
 *   uses rsp-common;
 *   list vnfd-connection-point-ref {
 *     key member-vnf-index-ref;
 *     leaf member-vnf-index-ref {
 *       type leafref {
 *         path ../../../../constituent-vnfd/member-vnf-index;
 *       }
 *     }
 *     leaf order {
 *       type uint8;
 *     }
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path "../../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *       }
 *     }
 *     leaf vnfd-ingress-connection-point-ref {
 *       type string;
 *     }
 *     leaf vnfd-egress-connection-point-ref {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd/rsp</i>
 * 
 * <p>To create instances of this class use {@link RspBuilder}.
 * @see RspBuilder
 * @see RspKey
 *
 */
public interface Rsp
    extends
    ChildOf<Vnffgd>,
    Augmentable<Rsp>,
    RspCommon,
    Identifiable<RspKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("rsp");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp.class;
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
    RspKey key();

}

