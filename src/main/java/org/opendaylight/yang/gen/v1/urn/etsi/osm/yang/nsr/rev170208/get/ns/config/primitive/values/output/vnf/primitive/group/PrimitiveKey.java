package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.vnf.primitive.group;
import com.google.common.base.MoreObjects;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yangtools.yang.common.Uint32;

public class PrimitiveKey
 implements Identifier<Primitive> {
    private static final long serialVersionUID = 1371649572639759292L;
    private final Uint32 _index;


    public PrimitiveKey(Uint32 _index) {
    
        this._index = _index;
    }
    
    /**
     * Utility migration constructor.
     *
     * @param _index index in legacy Java type
     * @deprecated Use {#link PrimitiveKey(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public PrimitiveKey(Long _index) {
        this(CodeHelpers.compatUint(_index));
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PrimitiveKey(PrimitiveKey source) {
        this._index = source._index;
    }


    public Uint32 getIndex() {
        return _index;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_index);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrimitiveKey)) {
            return false;
        }
        final PrimitiveKey other = (PrimitiveKey) obj;
        if (!Objects.equals(_index, other._index)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(PrimitiveKey.class);
        CodeHelpers.appendValue(helper, "_index", _index);
        return helper.toString();
    }
}

