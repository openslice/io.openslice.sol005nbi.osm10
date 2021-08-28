package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820;
import com.google.common.base.MoreObjects;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import javax.management.ConstructorParameters;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.ScalarTypeObject;

public class ConnectionPoints
 implements ScalarTypeObject<String>, Serializable {
    private static final long serialVersionUID = -2864741398064210872L;
    private final String _value;


    @ConstructorParameters("value")
    @ConstructorProperties("value")
    public ConnectionPoints(String _value) {
        
        CodeHelpers.requireValue(_value);
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConnectionPoints(ConnectionPoints source) {
        this._value = source._value;
    }

    public static ConnectionPoints getDefaultInstance(final String defaultValue) {
        return new ConnectionPoints(defaultValue);
    }

    @Override
    public String getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_value);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionPoints)) {
            return false;
        }
        final ConnectionPoints other = (ConnectionPoints) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ConnectionPoints.class);
        CodeHelpers.appendValue(helper, "_value", _value);
        return helper.toString();
    }
}

