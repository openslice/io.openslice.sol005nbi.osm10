package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VduLevelKey
 implements Identifier<VduLevel> {
    private static final long serialVersionUID = 7472299403991418175L;
    private final String _vduId;


    public VduLevelKey(String _vduId) {
    
        this._vduId = _vduId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VduLevelKey(VduLevelKey source) {
        this._vduId = source._vduId;
    }


    public String getVduId() {
        return _vduId;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_vduId);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VduLevelKey)) {
            return false;
        }
        final VduLevelKey other = (VduLevelKey) obj;
        if (!Objects.equals(_vduId, other._vduId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VduLevelKey.class);
        CodeHelpers.appendValue(helper, "_vduId", _vduId);
        return helper.toString();
    }
}

