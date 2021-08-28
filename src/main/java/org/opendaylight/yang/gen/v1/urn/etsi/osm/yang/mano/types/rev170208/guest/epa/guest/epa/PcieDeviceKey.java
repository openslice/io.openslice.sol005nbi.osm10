package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class PcieDeviceKey
 implements Identifier<PcieDevice> {
    private static final long serialVersionUID = 7216332045478460566L;
    private final String _deviceId;


    public PcieDeviceKey(String _deviceId) {
    
        this._deviceId = _deviceId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PcieDeviceKey(PcieDeviceKey source) {
        this._deviceId = source._deviceId;
    }


    public String getDeviceId() {
        return _deviceId;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_deviceId);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcieDeviceKey)) {
            return false;
        }
        final PcieDeviceKey other = (PcieDeviceKey) obj;
        if (!Objects.equals(_deviceId, other._deviceId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(PcieDeviceKey.class);
        CodeHelpers.appendValue(helper, "_deviceId", _deviceId);
        return helper.toString();
    }
}

