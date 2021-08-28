package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.mgmt._interface;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.MgmtInterface;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * SSH key pair used for this VNF
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container ssh-key {
 *   leaf public-key {
 *     type string;
 *   }
 *   leaf private-key-file {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:etsi:osm:yang:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/mgmt-interface/ssh-key</i>
 * 
 * <p>To create instances of this class use {@link SshKeyBuilder}.
 * @see SshKeyBuilder
 *
 */
public interface SshKey
    extends
    ChildOf<MgmtInterface>,
    Augmentable<SshKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ssh-key");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.mgmt._interface.SshKey> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.mgmt._interface.SshKey.class;
    }
    
    /**
     * Public key configured on this VNF
     *
     *
     *
     * @return <code>java.lang.String</code> <code>publicKey</code>, or <code>null</code> if not present
     */
    @Nullable String getPublicKey();
    
    /**
     * Path to the private key file
     *
     *
     *
     * @return <code>java.lang.String</code> <code>privateKeyFile</code>, or <code>null</code> if not present
     */
    @Nullable String getPrivateKeyFile();

}

