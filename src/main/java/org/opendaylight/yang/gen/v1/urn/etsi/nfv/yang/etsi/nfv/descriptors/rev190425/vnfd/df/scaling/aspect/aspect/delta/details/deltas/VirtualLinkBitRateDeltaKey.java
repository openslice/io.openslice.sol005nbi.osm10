package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.scaling.aspect.aspect.delta.details.deltas;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VirtualLinkBitRateDeltaKey
 implements Identifier<VirtualLinkBitRateDelta> {
    private static final long serialVersionUID = 1534832672872143650L;
    private final String _id;


    public VirtualLinkBitRateDeltaKey(String _id) {
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VirtualLinkBitRateDeltaKey(VirtualLinkBitRateDeltaKey source) {
        this._id = source._id;
    }


    public String getId() {
        return _id;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_id);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualLinkBitRateDeltaKey)) {
            return false;
        }
        final VirtualLinkBitRateDeltaKey other = (VirtualLinkBitRateDeltaKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VirtualLinkBitRateDeltaKey.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        return helper.toString();
    }
}

