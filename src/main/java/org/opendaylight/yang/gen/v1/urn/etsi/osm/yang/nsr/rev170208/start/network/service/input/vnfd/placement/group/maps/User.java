package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.user.SshAuthorizedKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.user.SshAuthorizedKeyKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of users to be added through cloud-config
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list user {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf user-info {
 *     type string;
 *   }
 *   list ssh-authorized-key {
 *     key key-pair-ref;
 *     leaf key-pair-ref {
 *       type leafref {
 *         path /osm-project:project[osm-project:name=current()/../../../../project-name]/key-pair/name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/input/vnfd-placement-group-maps/user</i>
 * 
 * <p>To create instances of this class use {@link UserBuilder}.
 * @see UserBuilder
 * @see UserKey
 *
 */
public interface User
    extends
    ChildOf<VnfdPlacementGroupMaps>,
    Augmentable<User>,
    Identifiable<UserKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("user");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.User> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.User.class;
    }
    
    /**
     * Name of the user 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * The user name's real name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userInfo</code>, or <code>null</code> if not present
     */
    @Nullable String getUserInfo();
    
    /**
     * Used to configure the list of public keys to be injected as part of ns
     * instantiation
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
    
    @Override
    UserKey key();

}

