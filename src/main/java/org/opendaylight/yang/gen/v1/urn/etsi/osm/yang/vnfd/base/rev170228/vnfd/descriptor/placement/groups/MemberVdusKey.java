package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.placement.groups;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class MemberVdusKey
 implements Identifier<MemberVdus> {
    private static final long serialVersionUID = 8868330271211804398L;
    private final String _memberVduRef;


    public MemberVdusKey(String _memberVduRef) {
    
        this._memberVduRef = _memberVduRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MemberVdusKey(MemberVdusKey source) {
        this._memberVduRef = source._memberVduRef;
    }


    public String getMemberVduRef() {
        return _memberVduRef;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_memberVduRef);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemberVdusKey)) {
            return false;
        }
        final MemberVdusKey other = (MemberVdusKey) obj;
        if (!Objects.equals(_memberVduRef, other._memberVduRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(MemberVdusKey.class);
        CodeHelpers.appendValue(helper, "_memberVduRef", _memberVduRef);
        return helper.toString();
    }
}

