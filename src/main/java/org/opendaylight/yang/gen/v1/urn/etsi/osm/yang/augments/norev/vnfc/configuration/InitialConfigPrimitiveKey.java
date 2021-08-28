package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yangtools.yang.common.Uint64;

public class InitialConfigPrimitiveKey
 implements Identifier<InitialConfigPrimitive> {
    private static final long serialVersionUID = -4777051358093348125L;
    private final Uint64 _seq;


    public InitialConfigPrimitiveKey(Uint64 _seq) {
    
        this._seq = _seq;
    }
    
    /**
     * Utility migration constructor.
     *
     * @param _seq seq in legacy Java type
     * @deprecated Use {#link InitialConfigPrimitiveKey(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public InitialConfigPrimitiveKey(BigInteger _seq) {
        this(CodeHelpers.compatUint(_seq));
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InitialConfigPrimitiveKey(InitialConfigPrimitiveKey source) {
        this._seq = source._seq;
    }


    public Uint64 getSeq() {
        return _seq;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_seq);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitialConfigPrimitiveKey)) {
            return false;
        }
        final InitialConfigPrimitiveKey other = (InitialConfigPrimitiveKey) obj;
        if (!Objects.equals(_seq, other._seq)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(InitialConfigPrimitiveKey.class);
        CodeHelpers.appendValue(helper, "_seq", _seq);
        return helper.toString();
    }
}

