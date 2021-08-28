package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.CloudProvider;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Empty;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case mock {
 *   leaf mock-construct {
 *     type empty;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider/mock</i>
 *
 */
public interface Mock
    extends
    DataObject,
    Augmentable<Mock>,
    CloudProvider
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("mock");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider.Mock> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider.Mock.class;
    }
    
    /**
     * @return <code>org.opendaylight.yangtools.yang.common.Empty</code> <code>mockConstruct</code>, or <code>null</code> if not present
     */
    @Nullable Empty getMockConstruct();

}

