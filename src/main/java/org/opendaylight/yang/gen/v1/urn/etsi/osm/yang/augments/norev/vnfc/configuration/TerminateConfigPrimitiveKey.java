package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yangtools.yang.common.Uint64;

public class TerminateConfigPrimitiveKey
 implements Identifier<TerminateConfigPrimitive> {
    private static final long serialVersionUID = -2002004714264740110L;
    private final Uint64 _seq;


    public TerminateConfigPrimitiveKey(Uint64 _seq) {
    
        this._seq = _seq;
    }
    
    /**
     * Utility migration constructor.
     *
     * @param _seq seq in legacy Java type
     * @deprecated Use {#link TerminateConfigPrimitiveKey(Uint64)} instead.
     */
    @Deprecated(forRemoval = true)
    public TerminateConfigPrimitiveKey(BigInteger _seq) {
        this(CodeHelpers.compatUint(_seq));
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TerminateConfigPrimitiveKey(TerminateConfigPrimitiveKey source) {
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
        if (!(obj instanceof TerminateConfigPrimitiveKey)) {
            return false;
        }
        final TerminateConfigPrimitiveKey other = (TerminateConfigPrimitiveKey) obj;
        if (!Objects.equals(_seq, other._seq)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(TerminateConfigPrimitiveKey.class);
        CodeHelpers.appendValue(helper, "_seq", _seq);
        return helper.toString();
    }
}

