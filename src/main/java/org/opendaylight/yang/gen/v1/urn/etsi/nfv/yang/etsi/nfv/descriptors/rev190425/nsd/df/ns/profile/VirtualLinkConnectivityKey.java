package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.profile;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VirtualLinkConnectivityKey
 implements Identifier<VirtualLinkConnectivity> {
    private static final long serialVersionUID = -1012322664145801683L;
    private final String _virtualLinkProfileId;


    public VirtualLinkConnectivityKey(String _virtualLinkProfileId) {
    
        this._virtualLinkProfileId = _virtualLinkProfileId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VirtualLinkConnectivityKey(VirtualLinkConnectivityKey source) {
        this._virtualLinkProfileId = source._virtualLinkProfileId;
    }


    public String getVirtualLinkProfileId() {
        return _virtualLinkProfileId;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_virtualLinkProfileId);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualLinkConnectivityKey)) {
            return false;
        }
        final VirtualLinkConnectivityKey other = (VirtualLinkConnectivityKey) obj;
        if (!Objects.equals(_virtualLinkProfileId, other._virtualLinkProfileId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VirtualLinkConnectivityKey.class);
        CodeHelpers.appendValue(helper, "_virtualLinkProfileId", _virtualLinkProfileId);
        return helper.toString();
    }
}

