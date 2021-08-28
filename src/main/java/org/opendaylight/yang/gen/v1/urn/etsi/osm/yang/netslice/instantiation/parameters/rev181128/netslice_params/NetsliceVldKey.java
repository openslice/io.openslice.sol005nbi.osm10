package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class NetsliceVldKey
 implements Identifier<NetsliceVld> {
    private static final long serialVersionUID = -6608776541746405452L;
    private final String _name;


    public NetsliceVldKey(String _name) {
    
        this._name = _name;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NetsliceVldKey(NetsliceVldKey source) {
        this._name = source._name;
    }


    public String getName() {
        return _name;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_name);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetsliceVldKey)) {
            return false;
        }
        final NetsliceVldKey other = (NetsliceVldKey) obj;
        if (!Objects.equals(_name, other._name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NetsliceVldKey.class);
        CodeHelpers.appendValue(helper, "_name", _name);
        return helper.toString();
    }
}

