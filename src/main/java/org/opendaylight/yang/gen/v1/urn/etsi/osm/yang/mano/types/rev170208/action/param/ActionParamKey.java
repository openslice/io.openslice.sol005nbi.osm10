package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.action.param;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ActionParamKey
 implements Identifier<ActionParam> {
    private static final long serialVersionUID = 6070761796971686087L;
    private final String _id;


    public ActionParamKey(String _id) {
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ActionParamKey(ActionParamKey source) {
        this._id = source._id;
    }


    public String getId() {
        return _id;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_id);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionParamKey)) {
            return false;
        }
        final ActionParamKey other = (ActionParamKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ActionParamKey.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        return helper.toString();
    }
}

