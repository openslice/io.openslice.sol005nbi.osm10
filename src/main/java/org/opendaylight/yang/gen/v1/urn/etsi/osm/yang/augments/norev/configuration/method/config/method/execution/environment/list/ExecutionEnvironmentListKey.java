package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.execution.environment.list;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ExecutionEnvironmentListKey
 implements Identifier<ExecutionEnvironmentList> {
    private static final long serialVersionUID = -3279265385720619574L;
    private final String _id;


    public ExecutionEnvironmentListKey(String _id) {
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ExecutionEnvironmentListKey(ExecutionEnvironmentListKey source) {
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
        if (!(obj instanceof ExecutionEnvironmentListKey)) {
            return false;
        }
        final ExecutionEnvironmentListKey other = (ExecutionEnvironmentListKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ExecutionEnvironmentListKey.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        return helper.toString();
    }
}

