package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HttpEndpoints;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HttpMethod;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.http.endpoint.Headers;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.http.endpoint.HeadersKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * List of http endpoints to be used by monitoring params
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list http-endpoint {
 *   key path;
 *   leaf path {
 *     type string;
 *   }
 *   leaf https {
 *     type boolean;
 *     default false;
 *   }
 *   leaf port {
 *     type inet:port-number;
 *   }
 *   leaf username {
 *     type string;
 *   }
 *   leaf password {
 *     type string;
 *   }
 *   leaf polling-interval-secs {
 *     type uint8;
 *     default 2;
 *   }
 *   leaf method {
 *     type manotypes:http-method;
 *     default GET;
 *   }
 *   list headers {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/http-endpoints/http-endpoint</i>
 * 
 * <p>To create instances of this class use {@link HttpEndpointBuilder}.
 * @see HttpEndpointBuilder
 * @see HttpEndpointKey
 *
 */
public interface HttpEndpoint
    extends
    ChildOf<HttpEndpoints>,
    Augmentable<HttpEndpoint>,
    Identifiable<HttpEndpointKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("http-endpoint");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.HttpEndpoint> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.HttpEndpoint.class;
    }
    
    /**
     * The HTTP path on the management server
     *
     *
     *
     * @return <code>java.lang.String</code> <code>path</code>, or <code>null</code> if not present
     */
    @Nullable String getPath();
    
    /**
     * Pick HTTPS instead of HTTP , Default is false
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>https</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isHttps();
    
    /**
     * The HTTP port to connect to
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    @Nullable PortNumber getPort();
    
    /**
     * The HTTP basic auth username
     *
     *
     *
     * @return <code>java.lang.String</code> <code>username</code>, or <code>null</code> if not present
     */
    @Nullable String getUsername();
    
    /**
     * The HTTP basic auth password
     *
     *
     *
     * @return <code>java.lang.String</code> <code>password</code>, or <code>null</code> if not present
     */
    @Nullable String getPassword();
    
    /**
     * The HTTP polling interval in seconds
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint8</code> <code>pollingIntervalSecs</code>, or <code>null</code> if not present
     */
    @Nullable Uint8 getPollingIntervalSecs();
    
    /**
     * Method that the URI should perform. Deafult action is GET.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HttpMethod</code> <code>method</code>, or <code>null</code> if not present
     */
    @Nullable HttpMethod getMethod();
    
    /**
     * Custom HTTP headers to put on HTTP request
     *
     *
     *
     * @return <code>java.util.Map</code> <code>headers</code>, or <code>null</code> if not present
     */
    @Nullable Map<HeadersKey, Headers> getHeaders();
    
    /**
     * @return <code>java.util.Map</code> <code>headers</code>, or an empty list if it is not present
     */
    default @NonNull Map<HeadersKey, Headers> nonnullHeaders() {
        return CodeHelpers.nonnull(getHeaders());
    }
    
    @Override
    HttpEndpointKey key();

}

