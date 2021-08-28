package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.HttpEndpoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.HttpEndpointKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping http-endpoints {
 *   list http-endpoint {
 *     key path;
 *     leaf path {
 *       type string;
 *     }
 *     leaf https {
 *       type boolean;
 *       default false;
 *     }
 *     leaf port {
 *       type inet:port-number;
 *     }
 *     leaf username {
 *       type string;
 *     }
 *     leaf password {
 *       type string;
 *     }
 *     leaf polling-interval-secs {
 *       type uint8;
 *       default 2;
 *     }
 *     leaf method {
 *       type manotypes:http-method;
 *       default GET;
 *     }
 *     list headers {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/http-endpoints</i>
 *
 */
public interface HttpEndpoints
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("http-endpoints");

    @Override
    Class<? extends HttpEndpoints> implementedInterface();
    
    /**
     * List of http endpoints to be used by monitoring params
     *
     *
     *
     * @return <code>java.util.Map</code> <code>httpEndpoint</code>, or <code>null</code> if not present
     */
    @Nullable Map<HttpEndpointKey, HttpEndpoint> getHttpEndpoint();
    
    /**
     * @return <code>java.util.Map</code> <code>httpEndpoint</code>, or an empty list if it is not present
     */
    default @NonNull Map<HttpEndpointKey, HttpEndpoint> nonnullHttpEndpoint() {
        return CodeHelpers.nonnull(getHttpEndpoint());
    }

}

