package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class SshAuthorizedKeyKey
 implements Identifier<SshAuthorizedKey> {
    private static final long serialVersionUID = -5653155718725020794L;
    private final Object _keyPairRef;


    public SshAuthorizedKeyKey(Object _keyPairRef) {
    
        this._keyPairRef = _keyPairRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SshAuthorizedKeyKey(SshAuthorizedKeyKey source) {
        this._keyPairRef = source._keyPairRef;
    }


    public Object getKeyPairRef() {
        return _keyPairRef;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_keyPairRef);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SshAuthorizedKeyKey)) {
            return false;
        }
        final SshAuthorizedKeyKey other = (SshAuthorizedKeyKey) obj;
        if (!Objects.equals(_keyPairRef, other._keyPairRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(SshAuthorizedKeyKey.class);
        CodeHelpers.appendValue(helper, "_keyPairRef", _keyPairRef);
        return helper.toString();
    }
}

