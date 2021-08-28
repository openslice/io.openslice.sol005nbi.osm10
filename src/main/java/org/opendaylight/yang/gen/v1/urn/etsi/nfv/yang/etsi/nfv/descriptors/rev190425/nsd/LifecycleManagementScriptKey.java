package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class LifecycleManagementScriptKey
 implements Identifier<LifecycleManagementScript> {
    private static final long serialVersionUID = -7557130487871185497L;
    private final String _event;


    public LifecycleManagementScriptKey(String _event) {
    
        this._event = _event;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LifecycleManagementScriptKey(LifecycleManagementScriptKey source) {
        this._event = source._event;
    }


    public String getEvent() {
        return _event;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_event);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifecycleManagementScriptKey)) {
            return false;
        }
        final LifecycleManagementScriptKey other = (LifecycleManagementScriptKey) obj;
        if (!Objects.equals(_event, other._event)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(LifecycleManagementScriptKey.class);
        CodeHelpers.appendValue(helper, "_event", _event);
        return helper.toString();
    }
}

