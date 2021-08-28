package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.vld.common.InitParams;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping nsd-vld-common {
 *   uses vld-common;
 *   choice init-params {
 *     case vim-network-ref {
 *       leaf vim-network-name {
 *         type string;
 *       }
 *     }
 *     case vim-network-profile {
 *       leaf ip-profile-ref {
 *         type leafref {
 *           path ../../ip-profiles/name;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-vld-common</i>
 *
 */
public interface NsdVldCommon
    extends
    DataObject,
    VldCommon
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-vld-common");

    @Override
    Class<? extends NsdVldCommon> implementedInterface();
    
    /**
     * Extra parameters for VLD instantiation
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.vld.common.InitParams</code> <code>initParams</code>, or <code>null</code> if not present
     */
    @Nullable InitParams getInitParams();

}

