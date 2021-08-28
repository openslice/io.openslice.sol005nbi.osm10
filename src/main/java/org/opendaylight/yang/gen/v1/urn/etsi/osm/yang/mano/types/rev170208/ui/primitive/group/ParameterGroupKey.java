package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ui.primitive.group;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ParameterGroupKey
 implements Identifier<ParameterGroup> {
    private static final long serialVersionUID = -6631383738471596453L;
    private final String _name;


    public ParameterGroupKey(String _name) {
    
        this._name = _name;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ParameterGroupKey(ParameterGroupKey source) {
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
        if (!(obj instanceof ParameterGroupKey)) {
            return false;
        }
        final ParameterGroupKey other = (ParameterGroupKey) obj;
        if (!Objects.equals(_name, other._name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ParameterGroupKey.class);
        CodeHelpers.appendValue(helper, "_name", _name);
        return helper.toString();
    }
}

