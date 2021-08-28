package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsInstanceConfigParams;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Mapping from mano-placement groups construct from VNFD to cloud platform 
 * placement group construct
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnfd-placement-group-maps {
 *   key "placement-group-ref vnfd-id-ref";
 *   leaf vnfd-id-ref {
 *     type yang:uuid;
 *   }
 *   leaf placement-group-ref {
 *     type leafref {
 *       path "../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:placement-groups/project-vnfd:name";
 *     }
 *   }
 *   uses manotypes:placement-group-input;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params/vnfd-placement-group-maps</i>
 * 
 * <p>To create instances of this class use {@link VnfdPlacementGroupMapsBuilder}.
 * @see VnfdPlacementGroupMapsBuilder
 * @see VnfdPlacementGroupMapsKey
 *
 */
public interface VnfdPlacementGroupMaps
    extends
    ChildOf<NsInstanceConfigParams>,
    Augmentable<VnfdPlacementGroupMaps>,
    PlacementGroupInput,
    Identifiable<VnfdPlacementGroupMapsKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-placement-group-maps");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.VnfdPlacementGroupMaps> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.VnfdPlacementGroupMaps.class;
    }
    
    /**
     * A reference to a vnfd. This is a leafref to path:
     * ../../../../project-nsd:constituent-vnfd + [id = current()/../id-ref] +
     * /project-nsd:vnfd-id-ref NOTE: An issue with confd is preventing the use of
     * xpath. Seems to be an issue with leafref to leafref, whose target is in a
     * different module. Once that is resolved this will switched to use leafref
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Uuid getVnfdIdRef();
    
    /**
     * A reference to VNFD placement group
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>placementGroupRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getPlacementGroupRef();
    
    @Override
    VnfdPlacementGroupMapsKey key();

}

