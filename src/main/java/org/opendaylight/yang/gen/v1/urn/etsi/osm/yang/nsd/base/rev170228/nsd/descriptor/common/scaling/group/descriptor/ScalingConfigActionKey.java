package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ScalingTrigger;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ScalingConfigActionKey
 implements Identifier<ScalingConfigAction> {
    private static final long serialVersionUID = -656924485068871764L;
    private final ScalingTrigger _trigger;


    public ScalingConfigActionKey(ScalingTrigger _trigger) {
    
        this._trigger = _trigger;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ScalingConfigActionKey(ScalingConfigActionKey source) {
        this._trigger = source._trigger;
    }


    public ScalingTrigger getTrigger() {
        return _trigger;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_trigger);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScalingConfigActionKey)) {
            return false;
        }
        final ScalingConfigActionKey other = (ScalingConfigActionKey) obj;
        if (!Objects.equals(_trigger, other._trigger)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ScalingConfigActionKey.class);
        CodeHelpers.appendValue(helper, "_trigger", _trigger);
        return helper.toString();
    }
}

