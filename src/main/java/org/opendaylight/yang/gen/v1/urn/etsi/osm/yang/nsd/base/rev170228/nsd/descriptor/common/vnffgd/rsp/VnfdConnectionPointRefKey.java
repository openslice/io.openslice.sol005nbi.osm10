package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfdConnectionPointRefKey
 implements Identifier<VnfdConnectionPointRef> {
    private static final long serialVersionUID = 4604142757293548059L;
    private final Object _memberVnfIndexRef;


    public VnfdConnectionPointRefKey(Object _memberVnfIndexRef) {
    
        this._memberVnfIndexRef = _memberVnfIndexRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfdConnectionPointRefKey(VnfdConnectionPointRefKey source) {
        this._memberVnfIndexRef = source._memberVnfIndexRef;
    }


    public Object getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_memberVnfIndexRef);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VnfdConnectionPointRefKey)) {
            return false;
        }
        final VnfdConnectionPointRefKey other = (VnfdConnectionPointRefKey) obj;
        if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfdConnectionPointRefKey.class);
        CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
        return helper.toString();
    }
}

