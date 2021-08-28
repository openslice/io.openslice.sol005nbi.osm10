package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.StartNetworkServiceInput;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.SshAuthorizedKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.SshAuthorizedKeyKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.User;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.UserKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
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
 *       path "/osm-project:project[osm-project:name=current()/../../project-name]/project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:placement-groups/project-vnfd:name";
 *     }
 *   }
 *   uses manotypes:placement-group-input;
 *   list ssh-authorized-key {
 *     key key-pair-ref;
 *     leaf key-pair-ref {
 *       type leafref {
 *         path /osm-project:project[osm-project:name=current()/../../../project-name]/key-pair/name;
 *       }
 *     }
 *   }
 *   list user {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf user-info {
 *       type string;
 *     }
 *     list ssh-authorized-key {
 *       key key-pair-ref;
 *       leaf key-pair-ref {
 *         type leafref {
 *           path /osm-project:project[osm-project:name=current()/../../../../project-name]/key-pair/name;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/input/vnfd-placement-group-maps</i>
 * 
 * <p>To create instances of this class use {@link VnfdPlacementGroupMapsBuilder}.
 * @see VnfdPlacementGroupMapsBuilder
 * @see VnfdPlacementGroupMapsKey
 *
 */
public interface VnfdPlacementGroupMaps
    extends
    ChildOf<StartNetworkServiceInput>,
    Augmentable<VnfdPlacementGroupMaps>,
    PlacementGroupInput,
    Identifiable<VnfdPlacementGroupMapsKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-placement-group-maps");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps.class;
    }
    
    /**
     * A reference to a vnfd. This is a leafref to path:
     * ../../../../project-nsd:constituent-vnfd + [id =
     * current()/../project-nsd:id-ref] + /project-nsd:vnfd-id-ref NOTE: An issue with
     * confd is preventing the use of xpath. Seems to be an issue with leafref to
     * leafref, whose target is in a different module. Once that is resovled this will
     * switched to use leafref
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
    
    /**
     * List of authorized ssh keys as part of cloud-config
     *
     *
     *
     * @return <code>java.util.Map</code> <code>sshAuthorizedKey</code>, or <code>null</code> if not present
     */
    @Nullable Map<SshAuthorizedKeyKey, SshAuthorizedKey> getSshAuthorizedKey();
    
    /**
     * @return <code>java.util.Map</code> <code>sshAuthorizedKey</code>, or an empty list if it is not present
     */
    default @NonNull Map<SshAuthorizedKeyKey, SshAuthorizedKey> nonnullSshAuthorizedKey() {
        return CodeHelpers.nonnull(getSshAuthorizedKey());
    }
    
    /**
     * List of users to be added through cloud-config
     *
     *
     *
     * @return <code>java.util.Map</code> <code>user</code>, or <code>null</code> if not present
     */
    @Nullable Map<UserKey, User> getUser();
    
    /**
     * @return <code>java.util.Map</code> <code>user</code>, or an empty list if it is not present
     */
    default @NonNull Map<UserKey, User> nonnullUser() {
        return CodeHelpers.nonnull(getUser());
    }
    
    @Override
    VnfdPlacementGroupMapsKey key();

}

