package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints;
import com.google.common.base.MoreObjects;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HttpMethod;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.http.endpoint.Headers;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints.http.endpoint.HeadersKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.AbstractAugmentable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.Uint8;

/**
 * Class that builds {@link HttpEndpointBuilder} instances. Overall design of the class is that of a
 * <a href="https://en.wikipedia.org/wiki/Fluent_interface">fluent interface</a>, where method chaining is used.
 * 
 * <p>
 * In general, this class is supposed to be used like this template:
 * <pre>
 *   <code>
 *     HttpEndpointBuilder createTarget(int fooXyzzy, int barBaz) {
 *         return new HttpEndpointBuilderBuilder()
 *             .setFoo(new FooBuilder().setXyzzy(fooXyzzy).build())
 *             .setBar(new BarBuilder().setBaz(barBaz).build())
 *             .build();
 *     }
 *   </code>
 * </pre>
 * 
 * <p>
 * This pattern is supported by the immutable nature of HttpEndpointBuilder, as instances can be freely passed around without
 * worrying about synchronization issues.
 * 
 * <p>
 * As a side note: method chaining results in:
 * <ul>
 *   <li>very efficient Java bytecode, as the method invocation result, in this case the Builder reference, is
 *       on the stack, so further method invocations just need to fill method arguments for the next method
 *       invocation, which is terminated by {@link #build()}, which is then returned from the method</li>
 *   <li>better understanding by humans, as the scope of mutable state (the builder) is kept to a minimum and is
 *       very localized</li>
 *   <li>better optimization oportunities, as the object scope is minimized in terms of invocation (rather than
 *       method) stack, making <a href="https://en.wikipedia.org/wiki/Escape_analysis">escape analysis</a> a lot
 *       easier. Given enough compiler (JIT/AOT) prowess, the cost of th builder object can be completely
 *       eliminated</li>
 * </ul>
 * 
 * @see HttpEndpointBuilder
 * @see Builder
 *
 */
public class HttpEndpointBuilder implements Builder<HttpEndpoint> {

    private Map<HeadersKey, Headers> _headers;
    private HttpMethod _method;
    private String _password;
    private String _path;
    private Uint8 _pollingIntervalSecs;
    private PortNumber _port;
    private String _username;
    private Boolean _https;
    private HttpEndpointKey key;


    Map<Class<? extends Augmentation<HttpEndpoint>>, Augmentation<HttpEndpoint>> augmentation = Collections.emptyMap();

    public HttpEndpointBuilder() {
    }

    public HttpEndpointBuilder(HttpEndpoint base) {
        if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<HttpEndpoint>>, Augmentation<HttpEndpoint>> aug =((AugmentationHolder<HttpEndpoint>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
        this.key = base.key();
        this._path = base.getPath();
        this._headers = base.getHeaders();
        this._method = base.getMethod();
        this._password = base.getPassword();
        this._pollingIntervalSecs = base.getPollingIntervalSecs();
        this._port = base.getPort();
        this._username = base.getUsername();
        this._https = base.isHttps();
    }


    public HttpEndpointKey key() {
        return key;
    }
    
    public Map<HeadersKey, Headers> getHeaders() {
        return _headers;
    }
    
    public HttpMethod getMethod() {
        return _method;
    }
    
    public String getPassword() {
        return _password;
    }
    
    public String getPath() {
        return _path;
    }
    
    public Uint8 getPollingIntervalSecs() {
        return _pollingIntervalSecs;
    }
    
    public PortNumber getPort() {
        return _port;
    }
    
    public String getUsername() {
        return _username;
    }
    
    public Boolean isHttps() {
        return _https;
    }

    @SuppressWarnings({ "unchecked", "checkstyle:methodTypeParameterName"})
    public <E$$ extends Augmentation<HttpEndpoint>> E$$ augmentation(Class<E$$> augmentationType) {
        return (E$$) augmentation.get(Objects.requireNonNull(augmentationType));
    }

    public HttpEndpointBuilder withKey(final HttpEndpointKey key) {
        this.key = key;
        return this;
    }
    public HttpEndpointBuilder setHeaders(final Map<HeadersKey, Headers> values) {
        this._headers = values;
        return this;
    }
    
    /**
      * Utility migration setter.
      *
      * <b>IMPORTANT NOTE</b>: This method does not completely match previous mechanics, as the list is processed as
      *                        during this method's execution. Any future modifications of the list are <b>NOT</b>
      *                        reflected in this builder nor its products.
      *
      * @param values Legacy List of values
      * @return this builder
      * @throws IllegalArgumentException if the list contains entries with the same key
      * @throws NullPointerException if the list contains a null entry
      * @deprecated Use {#link #setHeaders(Map)} instead.
      */
    @Deprecated(forRemoval = true)
    public HttpEndpointBuilder setHeaders(final List<Headers> values) {
        return setHeaders(CodeHelpers.compatMap(values));
    }
    
    public HttpEndpointBuilder setMethod(final HttpMethod value) {
        this._method = value;
        return this;
    }
    
    public HttpEndpointBuilder setPassword(final String value) {
        this._password = value;
        return this;
    }
    
    public HttpEndpointBuilder setPath(final String value) {
        this._path = value;
        return this;
    }
    
    public HttpEndpointBuilder setPollingIntervalSecs(final Uint8 value) {
        this._pollingIntervalSecs = value;
        return this;
    }
    
    /**
     * Utility migration setter.
     *
     * @param value field value in legacy type
     * @return this builder
     * @deprecated Use {#link setPollingIntervalSecs(Uint8)} instead.
     */
    @Deprecated(forRemoval = true)
    public HttpEndpointBuilder setPollingIntervalSecs(final Short value) {
        return setPollingIntervalSecs(CodeHelpers.compatUint(value));
    }
    
    public HttpEndpointBuilder setPort(final PortNumber value) {
        this._port = value;
        return this;
    }
    
    public HttpEndpointBuilder setUsername(final String value) {
        this._username = value;
        return this;
    }
    
    public HttpEndpointBuilder setHttps(final Boolean value) {
        this._https = value;
        return this;
    }
    
    /**
      * Add an augmentation to this builder's product.
      *
      * @param augmentation augmentation to be added
      * @return this builder
      * @throws NullPointerException if {@code augmentation} is null
      */
    public HttpEndpointBuilder addAugmentation(Augmentation<HttpEndpoint> augmentation) {
        return doAddAugmentation(augmentation.implementedInterface(), augmentation);
    }
    
    /**
      * Add or remove an augmentation to this builder's product.
      *
      * @param augmentationType augmentation type to be added or removed
      * @param augmentationValue augmentation value, null if the augmentation type should be removed
      * @return this builder
      * @deprecated Use either {@link #addAugmentation(Augmentation)} or {@link #removeAugmentation(Class)} instead.
      */
    @Deprecated(forRemoval = true)
    public HttpEndpointBuilder addAugmentation(Class<? extends Augmentation<HttpEndpoint>> augmentationType, Augmentation<HttpEndpoint> augmentationValue) {
        return augmentationValue == null ? removeAugmentation(augmentationType) : doAddAugmentation(augmentationType, augmentationValue);
    }
    
    /**
      * Remove an augmentation from this builder's product. If this builder does not track such an augmentation
      * type, this method does nothing.
      *
      * @param augmentationType augmentation type to be removed
      * @return this builder
      */
    public HttpEndpointBuilder removeAugmentation(Class<? extends Augmentation<HttpEndpoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }
    
    private HttpEndpointBuilder doAddAugmentation(Class<? extends Augmentation<HttpEndpoint>> augmentationType, Augmentation<HttpEndpoint> augmentationValue) {
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }

    @Override
    public HttpEndpoint build() {
        return new HttpEndpointImpl(this);
    }

    private static final class HttpEndpointImpl
        extends AbstractAugmentable<HttpEndpoint>
        implements HttpEndpoint {
    
        private final Map<HeadersKey, Headers> _headers;
        private final HttpMethod _method;
        private final String _password;
        private final String _path;
        private final Uint8 _pollingIntervalSecs;
        private final PortNumber _port;
        private final String _username;
        private final Boolean _https;
        private final HttpEndpointKey key;
    
        HttpEndpointImpl(HttpEndpointBuilder base) {
            super(base.augmentation);
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new HttpEndpointKey(base.getPath());
            }
            this._path = key.getPath();
            this._headers = CodeHelpers.emptyToNull(base.getHeaders());
            this._method = base.getMethod();
            this._password = base.getPassword();
            this._pollingIntervalSecs = base.getPollingIntervalSecs();
            this._port = base.getPort();
            this._username = base.getUsername();
            this._https = base.isHttps();
        }
    
        @Override
        public HttpEndpointKey key() {
            return key;
        }
        
        @Override
        public Map<HeadersKey, Headers> getHeaders() {
            return _headers;
        }
        
        @Override
        public HttpMethod getMethod() {
            return _method;
        }
        
        @Override
        public String getPassword() {
            return _password;
        }
        
        @Override
        public String getPath() {
            return _path;
        }
        
        @Override
        public Uint8 getPollingIntervalSecs() {
            return _pollingIntervalSecs;
        }
        
        @Override
        public PortNumber getPort() {
            return _port;
        }
        
        @Override
        public String getUsername() {
            return _username;
        }
        
        @Override
        public Boolean isHttps() {
            return _https;
        }
    
        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_headers);
            result = prime * result + Objects.hashCode(_method);
            result = prime * result + Objects.hashCode(_password);
            result = prime * result + Objects.hashCode(_path);
            result = prime * result + Objects.hashCode(_pollingIntervalSecs);
            result = prime * result + Objects.hashCode(_port);
            result = prime * result + Objects.hashCode(_username);
            result = prime * result + Objects.hashCode(_https);
            result = prime * result + Objects.hashCode(augmentations());
        
            hash = result;
            hashValid = true;
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!HttpEndpoint.class.equals(((DataObject)obj).implementedInterface())) {
                return false;
            }
            HttpEndpoint other = (HttpEndpoint)obj;
            if (!Objects.equals(_headers, other.getHeaders())) {
                return false;
            }
            if (!Objects.equals(_method, other.getMethod())) {
                return false;
            }
            if (!Objects.equals(_password, other.getPassword())) {
                return false;
            }
            if (!Objects.equals(_path, other.getPath())) {
                return false;
            }
            if (!Objects.equals(_pollingIntervalSecs, other.getPollingIntervalSecs())) {
                return false;
            }
            if (!Objects.equals(_port, other.getPort())) {
                return false;
            }
            if (!Objects.equals(_username, other.getUsername())) {
                return false;
            }
            if (!Objects.equals(_https, other.isHttps())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HttpEndpointImpl otherImpl = (HttpEndpointImpl) obj;
                if (!Objects.equals(augmentations(), otherImpl.augmentations())) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<HttpEndpoint>>, Augmentation<HttpEndpoint>> e : augmentations().entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("HttpEndpoint");
            CodeHelpers.appendValue(helper, "_headers", _headers);
            CodeHelpers.appendValue(helper, "_method", _method);
            CodeHelpers.appendValue(helper, "_password", _password);
            CodeHelpers.appendValue(helper, "_path", _path);
            CodeHelpers.appendValue(helper, "_pollingIntervalSecs", _pollingIntervalSecs);
            CodeHelpers.appendValue(helper, "_port", _port);
            CodeHelpers.appendValue(helper, "_username", _username);
            CodeHelpers.appendValue(helper, "_https", _https);
            CodeHelpers.appendValue(helper, "augmentation", augmentations().values());
            return helper.toString();
        }
    }
}
