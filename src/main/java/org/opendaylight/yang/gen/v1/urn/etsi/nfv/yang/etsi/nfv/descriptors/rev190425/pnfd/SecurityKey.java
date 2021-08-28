package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.pnfd;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class SecurityKey
 implements Identifier<Security> {
    private static final long serialVersionUID = -4666693731352198522L;
    private final String _signature;


    public SecurityKey(String _signature) {
    
        this._signature = _signature;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SecurityKey(SecurityKey source) {
        this._signature = source._signature;
    }


    public String getSignature() {
        return _signature;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_signature);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityKey)) {
            return false;
        }
        final SecurityKey other = (SecurityKey) obj;
        if (!Objects.equals(_signature, other._signature)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(SecurityKey.class);
        CodeHelpers.appendValue(helper, "_signature", _signature);
        return helper.toString();
    }
}

