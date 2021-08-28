package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config.SshAuthorizedKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config.SshAuthorizedKeyKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config.User;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config.UserKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of cloud config parameters
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping cloud-config {
 *   list ssh-authorized-key {
 *     key key-pair-ref;
 *     leaf key-pair-ref {
 *       type leafref {
 *         path ../../../../key-pair/name;
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
 *           path ../../../../../key-pair/name;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/cloud-config</i>
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
     * Used to configure the list of public keys to be injected as part of ns
     * instantiation
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

