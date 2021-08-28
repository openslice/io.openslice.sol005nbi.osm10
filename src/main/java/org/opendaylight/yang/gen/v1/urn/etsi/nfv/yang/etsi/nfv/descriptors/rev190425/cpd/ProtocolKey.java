package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.cpd;
import com.google.common.base.MoreObjects;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.LayerProtocol;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ProtocolKey
 implements Identifier<Protocol> {
    private static final long serialVersionUID = -7029882376556824581L;
    private final Class<? extends LayerProtocol> _associatedLayerProtocol;


    public ProtocolKey(Class<? extends LayerProtocol> _associatedLayerProtocol) {
    
        this._associatedLayerProtocol = _associatedLayerProtocol;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ProtocolKey(ProtocolKey source) {
        this._associatedLayerProtocol = source._associatedLayerProtocol;
    }


    public Class<? extends LayerProtocol> getAssociatedLayerProtocol() {
        return _associatedLayerProtocol;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_associatedLayerProtocol);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolKey)) {
            return false;
        }
        final ProtocolKey other = (ProtocolKey) obj;
        if (!Objects.equals(_associatedLayerProtocol, other._associatedLayerProtocol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ProtocolKey.class);
        CodeHelpers.appendValue(helper, "_associatedLayerProtocol", _associatedLayerProtocol);
        return helper.toString();
    }
}

