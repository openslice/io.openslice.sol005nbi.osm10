package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfdMemberKey
 implements Identifier<VnfdMember> {
    private static final long serialVersionUID = -3252525076835844968L;
    private final Object _memberVnfIndexRef;


    public VnfdMemberKey(Object _memberVnfIndexRef) {
    
        this._memberVnfIndexRef = _memberVnfIndexRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfdMemberKey(VnfdMemberKey source) {
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
        if (!(obj instanceof VnfdMemberKey)) {
            return false;
        }
        final VnfdMemberKey other = (VnfdMemberKey) obj;
        if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfdMemberKey.class);
        CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
        return helper.toString();
    }
}

