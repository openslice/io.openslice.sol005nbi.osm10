package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ScalingGroupRecordKey
 implements Identifier<ScalingGroupRecord> {
    private static final long serialVersionUID = -7106677205929662975L;
    private final Object _scalingGroupNameRef;


    public ScalingGroupRecordKey(Object _scalingGroupNameRef) {
    
        this._scalingGroupNameRef = _scalingGroupNameRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ScalingGroupRecordKey(ScalingGroupRecordKey source) {
        this._scalingGroupNameRef = source._scalingGroupNameRef;
    }


    public Object getScalingGroupNameRef() {
        return _scalingGroupNameRef;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_scalingGroupNameRef);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScalingGroupRecordKey)) {
            return false;
        }
        final ScalingGroupRecordKey other = (ScalingGroupRecordKey) obj;
        if (!Objects.equals(_scalingGroupNameRef, other._scalingGroupNameRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ScalingGroupRecordKey.class);
        CodeHelpers.appendValue(helper, "_scalingGroupNameRef", _scalingGroupNameRef);
        return helper.toString();
    }
}

