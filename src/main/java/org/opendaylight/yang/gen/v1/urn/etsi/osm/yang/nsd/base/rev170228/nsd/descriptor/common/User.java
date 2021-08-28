package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.user.KeyPair;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.user.KeyPairKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of users to be added through cloud-config
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list user {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf user-info {
 *     type string;
 *   }
 *   list key-pair {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf key {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/user</i>
 * 
 * <p>To create instances of this class use {@link UserBuilder}.
 * @see UserBuilder
 * @see UserKey
 *
 */
public interface User
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<User>,
    Identifiable<UserKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("user");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.User> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.User.class;
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
     * @return <code>java.util.Map</code> <code>keyPair</code>, or <code>null</code> if not present
     */
    @Nullable Map<KeyPairKey, KeyPair> getKeyPair();
    
    /**
     * @return <code>java.util.Map</code> <code>keyPair</code>, or an empty list if it is not present
     */
    default @NonNull Map<KeyPairKey, KeyPair> nonnullKeyPair() {
        return CodeHelpers.nonnull(getKeyPair());
    }
    
    @Override
    UserKey key();

}

