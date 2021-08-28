package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.extended.ns.configuration.NsConfiguration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ns-configuration</b>
 * <pre>
 * grouping extended-ns-configuration {
 *   container ns-configuration {
 *     uses common:vnfc-configuration;
 *     uses common:vnfc-relations;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ns-configuration/extended-ns-configuration</i>
 *
 */
public interface ExtendedNsConfiguration
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("extended-ns-configuration");

    @Override
    Class<? extends ExtendedNsConfiguration> implementedInterface();
    
    /**
     * Information about NS configuration.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.ns.configuration.norev.extended.ns.configuration.NsConfiguration</code> <code>nsConfiguration</code>, or <code>null</code> if not present
     */
    @Nullable NsConfiguration getNsConfiguration();

}

