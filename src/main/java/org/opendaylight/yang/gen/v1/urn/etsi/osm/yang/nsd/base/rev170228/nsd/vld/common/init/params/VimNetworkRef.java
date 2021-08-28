package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.vld.common.init.params;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.vld.common.InitParams;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * case vim-network-ref {
 *   leaf vim-network-name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-vld-common/init-params/vim-network-ref</i>
 *
 */
public interface VimNetworkRef
    extends
    DataObject,
    Augmentable<VimNetworkRef>,
    InitParams
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vim-network-ref");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkRef.class;
    }
    
    /**
     * Name of network in VIM account. This is used to indicate pre-provisioned network
     * name in cloud account.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vimNetworkName</code>, or <code>null</code> if not present
     */
    @Nullable String getVimNetworkName();

}

