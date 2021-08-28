package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMapsKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * input input {
 *   leaf name {
 *     type string;
 *   }
 *   uses manotypes:rpc-project-name;
 *   leaf nsd_id_ref {
 *     type leafref {
 *       path /osm-project:project[osm-project:name=current()/../project-name]/project-nsd:nsd-catalog/project-nsd:nsd/project-nsd:id;
 *     }
 *   }
 *   uses ns-instance-config-params-common;
 *   list vnfd-placement-group-maps {
 *     key "placement-group-ref vnfd-id-ref";
 *     leaf vnfd-id-ref {
 *       type yang:uuid;
 *     }
 *     leaf placement-group-ref {
 *       type leafref {
 *         path "/osm-project:project[osm-project:name=current()/../../project-name]/project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:placement-groups/project-vnfd:name";
 *       }
 *     }
 *     uses manotypes:placement-group-input;
 *     list ssh-authorized-key {
 *       key key-pair-ref;
 *       leaf key-pair-ref {
 *         type leafref {
 *           path /osm-project:project[osm-project:name=current()/../../../project-name]/key-pair/name;
 *         }
 *       }
 *     }
 *     list user {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf user-info {
 *         type string;
 *       }
 *       list ssh-authorized-key {
 *         key key-pair-ref;
 *         leaf key-pair-ref {
 *           type leafref {
 *             path /osm-project:project[osm-project:name=current()/../../../../project-name]/key-pair/name;
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/input</i>
 * 
 * <p>To create instances of this class use {@link StartNetworkServiceInputBuilder}.
 * @see StartNetworkServiceInputBuilder
 *
 */
public interface StartNetworkServiceInput
    extends
    RpcProjectName,
    NsInstanceConfigParamsCommon,
    RpcInput,
    Augmentable<StartNetworkServiceInput>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.StartNetworkServiceInput> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.StartNetworkServiceInput.class;
    }
    
    /**
     * Name of the Network Service
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Reference to NSD ID ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getNsdIdRef();
    
    /**
     * Mapping from mano-placement groups construct from VNFD to cloud platform
     * placement group construct
     *
     *
     *
     * @return <code>java.util.Map</code> <code>vnfdPlacementGroupMaps</code>, or <code>null</code> if not present
     */
    @Nullable Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps();
    
    /**
     * @return <code>java.util.Map</code> <code>vnfdPlacementGroupMaps</code>, or an empty list if it is not present
     */
    default @NonNull Map<VnfdPlacementGroupMapsKey, VnfdPlacementGroupMaps> nonnullVnfdPlacementGroupMaps() {
        return CodeHelpers.nonnull(getVnfdPlacementGroupMaps());
    }

}

