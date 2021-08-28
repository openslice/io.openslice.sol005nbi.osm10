package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class AlarmKey
 implements Identifier<Alarm> {
    private static final long serialVersionUID = 6949511475175144069L;
    private final String _alarmId;


    public AlarmKey(String _alarmId) {
    
        this._alarmId = _alarmId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AlarmKey(AlarmKey source) {
        this._alarmId = source._alarmId;
    }


    public String getAlarmId() {
        return _alarmId;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_alarmId);
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
        if (!Objects.equals(_alarmId, other._alarmId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(AlarmKey.class);
        CodeHelpers.appendValue(helper, "_alarmId", _alarmId);
        return helper.toString();
    }
}

