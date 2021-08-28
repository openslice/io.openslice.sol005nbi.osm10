package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.KeyPair;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.KeyPairKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.User;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.UserKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping cloud-config {
 *   list key-pair {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf key {
 *       type string;
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
 *     list key-pair {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf key {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/cloud-config</i>
 *
 */
public interface CloudConfig
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cloud-config");

    @Override
    Class<? extends CloudConfig> implementedInterface();
    
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

}

