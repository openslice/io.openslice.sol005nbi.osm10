package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yangtools.yang.common.Uint64;

public class NodeKey
 implements Identifier<Node> {
    private static final long serialVersionUID = 7805731164917659700L;
    private final Uint64 _id;


    public NodeKey(Uint64 _id) {
    
        this._id = _id;
    }
    
    /**
     * Utility migration constructor.
     *
     * @param _id id in legacy Java type
     * @deprecated Use {#link NodeKey(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public NodeKey(BigInteger _id) {
        this(CodeHelpers.compatUint(_id));
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NodeKey(NodeKey source) {
        this._id = source._id;
    }


    public Uint64 getId() {
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
        if (!(obj instanceof NodeKey)) {
            return false;
        }
        final NodeKey other = (NodeKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NodeKey.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        return helper.toString();
    }
}

