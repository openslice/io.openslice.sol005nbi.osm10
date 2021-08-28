package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class NsToLevelMappingKey
 implements Identifier<NsToLevelMapping> {
    private static final long serialVersionUID = -4492263105637618798L;
    private final String _nsProfileId;


    public NsToLevelMappingKey(String _nsProfileId) {
    
        this._nsProfileId = _nsProfileId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NsToLevelMappingKey(NsToLevelMappingKey source) {
        this._nsProfileId = source._nsProfileId;
    }


    public String getNsProfileId() {
        return _nsProfileId;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_nsProfileId);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NsToLevelMappingKey)) {
            return false;
        }
        final NsToLevelMappingKey other = (NsToLevelMappingKey) obj;
        if (!Objects.equals(_nsProfileId, other._nsProfileId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NsToLevelMappingKey.class);
        CodeHelpers.appendValue(helper, "_nsProfileId", _nsProfileId);
        return helper.toString();
    }
}

