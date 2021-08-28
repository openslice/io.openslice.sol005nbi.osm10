package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ns.instance.config.params.common.scaling.group;
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
    private static final long serialVersionUID = 4078509346566946712L;
    private final Uint16 _id;


    public InstanceKey(Uint16 _id) {
    
        this._id = _id;
    }
    
    /**
     * Utility migration constructor.
     *
     * @param _id id in legacy Java type
     * @deprecated Use {#link InstanceKey(Uint16)} instead.
     */
    @Deprecated(forRemoval = true)
    public InstanceKey(Integer _id) {
        this(CodeHelpers.compatUint(_id));
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InstanceKey(InstanceKey source) {
        this._id = source._id;
    }


    public Uint16 getId() {
        return _id;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_id);
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
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(InstanceKey.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        return helper.toString();
    }
}

