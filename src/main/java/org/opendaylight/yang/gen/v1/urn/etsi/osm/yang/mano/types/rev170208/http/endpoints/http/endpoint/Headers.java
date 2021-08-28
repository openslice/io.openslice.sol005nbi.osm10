package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.http.endpoint;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.HttpEndpoint;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Custom HTTP headers to put on HTTP request
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list headers {
 *   key key;
 *   leaf key {
 *     type string;
 *   }
 *   leaf value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/http-endpoints/http-endpoint/headers</i>
 * 
 * <p>To create instances of this class use {@link HeadersBuilder}.
 * @see HeadersBuilder
 * @see HeadersKey
 *
 */
public interface Headers
    extends
    ChildOf<HttpEndpoint>,
    Augmentable<Headers>,
    Identifiable<HeadersKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("headers");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.http.endpoint.Headers> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.http.endpoint.Headers.class;
    }
    
    /**
     * HTTP header key
     *
     *
     *
     * @return <code>java.lang.String</code> <code>key</code>, or <code>null</code> if not present
     */
    @Nullable String getKey();
    
    /**
     * HTTP header value
     *
     *
     *
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable String getValue();
    
    @Override
    HeadersKey key();

}

