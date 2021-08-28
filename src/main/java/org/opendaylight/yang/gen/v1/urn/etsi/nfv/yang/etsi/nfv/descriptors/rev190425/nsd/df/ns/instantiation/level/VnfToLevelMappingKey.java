package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.ns.instantiation.level;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfToLevelMappingKey
 implements Identifier<VnfToLevelMapping> {
    private static final long serialVersionUID = -4936475184729003839L;
    private final String _vnfProfileId;


    public VnfToLevelMappingKey(String _vnfProfileId) {
    
        this._vnfProfileId = _vnfProfileId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfToLevelMappingKey(VnfToLevelMappingKey source) {
        this._vnfProfileId = source._vnfProfileId;
    }


    public String getVnfProfileId() {
        return _vnfProfileId;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_vnfProfileId);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VnfToLevelMappingKey)) {
            return false;
        }
        final VnfToLevelMappingKey other = (VnfToLevelMappingKey) obj;
        if (!Objects.equals(_vnfProfileId, other._vnfProfileId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfToLevelMappingKey.class);
        CodeHelpers.appendValue(helper, "_vnfProfileId", _vnfProfileId);
        return helper.toString();
    }
}

