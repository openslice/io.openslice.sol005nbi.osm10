package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.InternalVld;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Extra parameters for VLD instantiation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * choice init-params {
 *   case vim-network-ref {
 *     leaf vim-network-name {
 *       type string;
 *     }
 *   }
 *   case vim-network-profile {
 *     leaf ip-profile-ref {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/internal-vld/init-params</i>
 *
 */
public interface InitParams
    extends
    ChoiceIn<InternalVld>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("init-params");


}

