package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.config.access.config.access;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.config.access.ConfigAccess;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * If the xNF requires ssh and this parameter is set, SSH keys will be injected so 
 * that VCA can configure the xNF or xDU via ssh.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container ssh-access {
 *   leaf required {
 *     type boolean;
 *     default false;
 *   }
 *   leaf default-user {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-config-access/config-access/ssh-access</i>
 * 
 * <p>To create instances of this class use {@link SshAccessBuilder}.
 * @see SshAccessBuilder
 *
 */
public interface SshAccess
    extends
    ChildOf<ConfigAccess>,
    Augmentable<SshAccess>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ssh-access");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.config.access.config.access.SshAccess> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.config.access.config.access.SshAccess.class;
    }
    
    /**
     * whether ssh access is needed or not
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>required</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isRequired();
    
    /**
     * Default user for ssh
     *
     *
     *
     * @return <code>java.lang.String</code> <code>defaultUser</code>, or <code>null</code> if not present
     */
    @Nullable String getDefaultUser();

}

