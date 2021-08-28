package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.internal.vld;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class InternalConnectionPointKey
 implements Identifier<InternalConnectionPoint> {
    private static final long serialVersionUID = -7496980910000592960L;
    private final String _idRef;


    public InternalConnectionPointKey(String _idRef) {
    
        this._idRef = _idRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InternalConnectionPointKey(InternalConnectionPointKey source) {
        this._idRef = source._idRef;
    }


    public String getIdRef() {
        return _idRef;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_idRef);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalConnectionPointKey)) {
            return false;
        }
        final InternalConnectionPointKey other = (InternalConnectionPointKey) obj;
        if (!Objects.equals(_idRef, other._idRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(InternalConnectionPointKey.class);
        CodeHelpers.appendValue(helper, "_idRef", _idRef);
        return helper.toString();
    }
}

