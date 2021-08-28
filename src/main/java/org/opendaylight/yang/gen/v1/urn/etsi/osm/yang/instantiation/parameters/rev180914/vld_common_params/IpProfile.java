package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_common_params;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.IpProfileUpdateSchema;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * container ip-profile {
 *   uses ip-profile-update-schema;
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vld_common_params/ip-profile</i>
 * 
 * <p>To create instances of this class use {@link IpProfileBuilder}.
 * @see IpProfileBuilder
 *
 */
public interface IpProfile
    extends
    ChildOf<VldCommonParams>,
    Augmentable<IpProfile>,
    IpProfileUpdateSchema
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profile");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_common_params.IpProfile> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_common_params.IpProfile.class;
    }

}

