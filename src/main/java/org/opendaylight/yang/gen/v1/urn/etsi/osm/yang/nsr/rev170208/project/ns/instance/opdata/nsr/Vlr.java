package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.Nsr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRefKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vlr {
 *   key vlr-ref;
 *   leaf vlr-ref {
 *     type leafref {
 *       path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *     }
 *   }
 *   list vnfr-connection-point-ref {
 *     key vnfr-id;
 *     leaf vnfr-id {
 *       type leafref {
 *         path ../../../../../vnfr:vnfr-catalog/vnfr:vnfr/vnfr:id;
 *       }
 *     }
 *     leaf connection-point {
 *       type leafref {
 *         path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id]/vnfr:connection-point/vnfr:name";
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:etsi:osm:yang:nsr?revision=2017-02-08)ns-instance-opdata/nsr/vlr</i>
 * 
 * <p>To create instances of this class use {@link VlrBuilder}.
 * @see VlrBuilder
 * @see VlrKey
 *
 */
public interface Vlr
    extends
    ChildOf<Nsr>,
    Augmentable<Vlr>,
    Identifiable<VlrKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vlr");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.Vlr> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.Vlr.class;
    }
    
    /**
     * Reference to a VLR record in the VLR catalog
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vlrRef</code>, or <code>null</code> if not present
     */
    @Nullable Uuid getVlrRef();
    
    /**
     * A list of references to connection points.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfrConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfrConnectionPointRefKey, VnfrConnectionPointRef> getVnfrConnectionPointRef();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfrConnectionPointRef</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfrConnectionPointRefKey, VnfrConnectionPointRef> nonnullVnfrConnectionPointRef() {
        return CodeHelpers.nonnull(getVnfrConnectionPointRef());
    }
    
    @Override
    VlrKey key();

}

