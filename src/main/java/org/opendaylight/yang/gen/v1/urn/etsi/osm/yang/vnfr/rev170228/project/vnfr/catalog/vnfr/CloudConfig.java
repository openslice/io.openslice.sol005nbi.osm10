package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.Vnfr;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container cloud-config {
 *   uses manotypes:cloud-config;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:etsi:osm:yang:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/cloud-config</i>
 * 
 * <p>To create instances of this class use {@link CloudConfigBuilder}.
 * @see CloudConfigBuilder
 *
 */
public interface CloudConfig
    extends
    ChildOf<Vnfr>,
    Augmentable<CloudConfig>,
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cloud-config");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.CloudConfig> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.CloudConfig.class;
    }

}

