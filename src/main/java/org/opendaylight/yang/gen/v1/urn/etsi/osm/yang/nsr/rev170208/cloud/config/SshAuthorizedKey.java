package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.CloudConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of authorized ssh keys as part of cloud-config
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list ssh-authorized-key {
 *   key key-pair-ref;
 *   leaf key-pair-ref {
 *     type leafref {
 *       path ../../../../key-pair/name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/cloud-config/ssh-authorized-key</i>
 * 
 * <p>To create instances of this class use {@link SshAuthorizedKeyBuilder}.
 * @see SshAuthorizedKeyBuilder
 * @see SshAuthorizedKeyKey
 *
 */
public interface SshAuthorizedKey
    extends
    ChildOf<CloudConfig>,
    Augmentable<SshAuthorizedKey>,
    Identifiable<SshAuthorizedKeyKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ssh-authorized-key");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config.SshAuthorizedKey> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.cloud.config.SshAuthorizedKey.class;
    }
    
    /**
     * A reference to the key pair entry in the global key pair table
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>keyPairRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getKeyPairRef();
    
    @Override
    SshAuthorizedKeyKey key();

}

