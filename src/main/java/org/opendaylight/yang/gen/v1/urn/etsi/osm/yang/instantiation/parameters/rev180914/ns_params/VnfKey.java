package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfKey
 implements Identifier<Vnf> {
    private static final long serialVersionUID = 9000601702153835321L;
    private final String _memberVnfIndex;


    public VnfKey(String _memberVnfIndex) {
    
        this._memberVnfIndex = _memberVnfIndex;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfKey(VnfKey source) {
        this._memberVnfIndex = source._memberVnfIndex;
    }


    public String getMemberVnfIndex() {
        return _memberVnfIndex;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_memberVnfIndex);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VnfKey)) {
            return false;
        }
        final VnfKey other = (VnfKey) obj;
        if (!Objects.equals(_memberVnfIndex, other._memberVnfIndex)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfKey.class);
        CodeHelpers.appendValue(helper, "_memberVnfIndex", _memberVnfIndex);
        return helper.toString();
    }
}

