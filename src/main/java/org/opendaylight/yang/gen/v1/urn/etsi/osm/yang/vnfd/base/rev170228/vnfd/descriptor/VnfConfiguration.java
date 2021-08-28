package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfigAccess;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaRelations;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container vnf-configuration {
 *   uses manotypes:vca-configuration;
 *   uses manotypes:vca-relations;
 *   uses manotypes:vca-config-access;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vnf-configuration</i>
 * 
 * <p>To create instances of this class use {@link VnfConfigurationBuilder}.
 * @see VnfConfigurationBuilder
 *
 */
public interface VnfConfiguration
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<VnfConfiguration>,
    VcaConfiguration,
    VcaRelations,
    VcaConfigAccess
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-configuration");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.VnfConfiguration> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.VnfConfiguration.class;
    }

}

