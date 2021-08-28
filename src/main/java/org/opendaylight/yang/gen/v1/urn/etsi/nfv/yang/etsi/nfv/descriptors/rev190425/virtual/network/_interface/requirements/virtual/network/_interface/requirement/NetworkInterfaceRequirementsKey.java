package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.virtual.network._interface.requirements.virtual.network._interface.requirement;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class NetworkInterfaceRequirementsKey
 implements Identifier<NetworkInterfaceRequirements> {
    private static final long serialVersionUID = -5518541956212500630L;
    private final String _key;


    public NetworkInterfaceRequirementsKey(String _key) {
    
        this._key = _key;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NetworkInterfaceRequirementsKey(NetworkInterfaceRequirementsKey source) {
        this._key = source._key;
    }


    public String getKey() {
        return _key;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_key);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkInterfaceRequirementsKey)) {
            return false;
        }
        final NetworkInterfaceRequirementsKey other = (NetworkInterfaceRequirementsKey) obj;
        if (!Objects.equals(_key, other._key)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NetworkInterfaceRequirementsKey.class);
        CodeHelpers.appendValue(helper, "_key", _key);
        return helper.toString();
    }
}

