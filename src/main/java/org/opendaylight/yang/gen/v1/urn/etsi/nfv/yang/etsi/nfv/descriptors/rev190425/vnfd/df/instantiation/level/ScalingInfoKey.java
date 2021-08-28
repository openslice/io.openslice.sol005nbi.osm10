package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.instantiation.level;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ScalingInfoKey
 implements Identifier<ScalingInfo> {
    private static final long serialVersionUID = -1279594473036189260L;
    private final String _scalingAspectId;


    public ScalingInfoKey(String _scalingAspectId) {
    
        this._scalingAspectId = _scalingAspectId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ScalingInfoKey(ScalingInfoKey source) {
        this._scalingAspectId = source._scalingAspectId;
    }


    public String getScalingAspectId() {
        return _scalingAspectId;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_scalingAspectId);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScalingInfoKey)) {
            return false;
        }
        final ScalingInfoKey other = (ScalingInfoKey) obj;
        if (!Objects.equals(_scalingAspectId, other._scalingAspectId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ScalingInfoKey.class);
        CodeHelpers.appendValue(helper, "_scalingAspectId", _scalingAspectId);
        return helper.toString();
    }
}

