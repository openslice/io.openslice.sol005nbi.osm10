package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.actions;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class AlarmKey
 implements Identifier<Alarm> {
    private static final long serialVersionUID = 5352316849637502229L;
    private final String _url;


    public AlarmKey(String _url) {
    
        this._url = _url;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AlarmKey(AlarmKey source) {
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
        if (!(obj instanceof AlarmKey)) {
            return false;
        }
        final AlarmKey other = (AlarmKey) obj;
        if (!Objects.equals(_url, other._url)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(AlarmKey.class);
        CodeHelpers.appendValue(helper, "_url", _url);
        return helper.toString();
    }
}

