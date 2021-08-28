package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InitParams;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case vim-network-profile {
 *   leaf ip-profile-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/internal-vld/init-params/vim-network-profile</i>
 *
 */
public interface VimNetworkProfile
    extends
    DataObject,
    Augmentable<VimNetworkProfile>,
    InitParams
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vim-network-profile");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkProfile> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkProfile.class;
    }
    
    /**
     * Named reference to IP-profile object
     *
     *
     *
     * @return <code>java.lang.String</code> <code>ipProfileRef</code>, or <code>null</code> if not present
     */
    @Nullable String getIpProfileRef();

}

