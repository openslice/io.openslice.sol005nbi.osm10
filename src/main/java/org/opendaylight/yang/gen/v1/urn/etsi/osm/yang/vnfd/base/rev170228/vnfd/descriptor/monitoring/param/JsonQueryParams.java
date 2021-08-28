package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.MonitoringParam;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container json-query-params {
 *   leaf json-path {
 *     type string;
 *   }
 *   leaf object-path {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/json-query-params</i>
 * 
 * <p>To create instances of this class use {@link JsonQueryParamsBuilder}.
 * @see JsonQueryParamsBuilder
 *
 */
public interface JsonQueryParams
    extends
    ChildOf<MonitoringParam>,
    Augmentable<JsonQueryParams>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("json-query-params");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.JsonQueryParams> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.JsonQueryParams.class;
    }
    
    /**
     * The jsonpath to use to extract value from JSON structure
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jsonPath</code>, or <code>null</code> if not present
     */
    @Nullable String getJsonPath();
    
    /**
     * The objectpath to use to extract value from JSON structure
     *
     *
     *
     * @return <code>java.lang.String</code> <code>objectPath</code>, or <code>null</code> if not present
     */
    @Nullable String getObjectPath();

}

