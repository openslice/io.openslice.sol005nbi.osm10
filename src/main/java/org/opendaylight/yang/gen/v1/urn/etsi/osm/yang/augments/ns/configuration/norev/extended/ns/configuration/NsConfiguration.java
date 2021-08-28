package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.extended.ns.configuration;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.VnfcRelations;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.ExtendedNsConfiguration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Information about NS configuration.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ns-configuration</b>
 * <pre>
 * container ns-configuration {
 *   uses common:vnfc-configuration;
 *   uses common:vnfc-relations;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ns-configuration/extended-ns-configuration/ns-configuration</i>
 * 
 * <p>To create instances of this class use {@link NsConfigurationBuilder}.
 * @see NsConfigurationBuilder
 *
 */
public interface NsConfiguration
    extends
    ChildOf<ExtendedNsConfiguration>,
    Augmentable<NsConfiguration>,
    VnfcConfiguration,
    VnfcRelations
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ns-configuration");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.extended.ns.configuration.NsConfiguration> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.extended.ns.configuration.NsConfiguration.class;
    }

}

