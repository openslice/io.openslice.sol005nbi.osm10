package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.alarm.properties.actions;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class OkKey
 implements Identifier<Ok> {
    private static final long serialVersionUID = -3239917283088943717L;
    private final String _url;


    public OkKey(String _url) {
    
        this._url = _url;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public OkKey(OkKey source) {
        this._url = source._url;
    }


    public String getUrl() {
        return _url;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_url);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OkKey)) {
            return false;
        }
        final OkKey other = (OkKey) obj;
        if (!Objects.equals(_url, other._url)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(OkKey.class);
        CodeHelpers.appendValue(helper, "_url", _url);
        return helper.toString();
    }
}

