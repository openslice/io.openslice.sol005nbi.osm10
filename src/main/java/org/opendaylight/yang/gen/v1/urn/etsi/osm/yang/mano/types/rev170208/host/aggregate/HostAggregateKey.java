package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.aggregate;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class HostAggregateKey
 implements Identifier<HostAggregate> {
    private static final long serialVersionUID = -2962347543593449709L;
    private final String _metadataKey;


    public HostAggregateKey(String _metadataKey) {
    
        this._metadataKey = _metadataKey;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public HostAggregateKey(HostAggregateKey source) {
        this._metadataKey = source._metadataKey;
    }


    public String getMetadataKey() {
        return _metadataKey;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_metadataKey);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAggregateKey)) {
            return false;
        }
        final HostAggregateKey other = (HostAggregateKey) obj;
        if (!Objects.equals(_metadataKey, other._metadataKey)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(HostAggregateKey.class);
        CodeHelpers.appendValue(helper, "_metadataKey", _metadataKey);
        return helper.toString();
    }
}

