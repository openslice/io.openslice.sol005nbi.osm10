package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.vld.common;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdVldCommon;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Extra parameters for VLD instantiation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * choice init-params {
 *   case vim-network-ref {
 *     leaf vim-network-name {
 *       type string;
 *     }
 *   }
 *   case vim-network-profile {
 *     leaf ip-profile-ref {
 *       type leafref {
 *         path ../../ip-profiles/name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-vld-common/init-params</i>
 *
 */
public interface InitParams
    extends
    ChoiceIn<NsdVldCommon>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("init-params");


}

