package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.placement.groups.placement.groups;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class MemberVnfdKey
 implements Identifier<MemberVnfd> {
    private static final long serialVersionUID = 519011361002322048L;
    private final Object _memberVnfIndexRef;


    public MemberVnfdKey(Object _memberVnfIndexRef) {
    
        this._memberVnfIndexRef = _memberVnfIndexRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MemberVnfdKey(MemberVnfdKey source) {
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
        if (!(obj instanceof MemberVnfdKey)) {
            return false;
        }
        final MemberVnfdKey other = (MemberVnfdKey) obj;
        if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(MemberVnfdKey.class);
        CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
        return helper.toString();
    }
}

