package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record;
import com.google.common.base.MoreObjects;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yangtools.yang.common.Uint16;

public class InstanceKey
 implements Identifier<Instance> {
    private static final long serialVersionUID = -3732073864253176254L;
    private final Uint16 _instanceId;


    public InstanceKey(Uint16 _instanceId) {
    
        this._instanceId = _instanceId;
    }
    
    /**
     * Utility migration constructor.
     *
     * @param _instanceId instanceId in legacy Java type
     * @deprecated Use {#link InstanceKey(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public InstanceKey(Integer _instanceId) {
        this(CodeHelpers.compatUint(_instanceId));
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InstanceKey(InstanceKey source) {
        this._instanceId = source._instanceId;
    }


    public Uint16 getInstanceId() {
        return _instanceId;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_instanceId);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstanceKey)) {
            return false;
        }
        final InstanceKey other = (InstanceKey) obj;
        if (!Objects.equals(_instanceId, other._instanceId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(InstanceKey.class);
        CodeHelpers.appendValue(helper, "_instanceId", _instanceId);
        return helper.toString();
    }
}

