package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaRelations;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Information about NS configuration.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * container ns-configuration {
 *   uses manotypes:vca-configuration;
 *   uses manotypes:vca-relations;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/ns-configuration</i>
 * 
 * <p>To create instances of this class use {@link NsConfigurationBuilder}.
 * @see NsConfigurationBuilder
 *
 */
public interface NsConfiguration
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<NsConfiguration>,
    VcaConfiguration,
    VcaRelations
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ns-configuration");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.NsConfiguration> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.NsConfiguration.class;
    }

}

