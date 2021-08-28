package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.epa.norev.extended.numa.numa.node.policy.node.om.numa.type.paired.threads.paired.threads;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yangtools.yang.common.Uint8;

public class PairedThreadIdsKey
 implements Identifier<PairedThreadIds> {
    private static final long serialVersionUID = 5657393331481948923L;
    private final Uint8 _threadA;


    public PairedThreadIdsKey(Uint8 _threadA) {
    
        this._threadA = _threadA;
    }
    
    /**
     * Utility migration constructor.
     *
     * @param _threadA threadA in legacy Java type
     * @deprecated Use {#link PairedThreadIdsKey(Uint8)} instead.
     */
    @Deprecated(forRemoval = true)
    public PairedThreadIdsKey(Short _threadA) {
        this(CodeHelpers.compatUint(_threadA));
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PairedThreadIdsKey(PairedThreadIdsKey source) {
        this._threadA = source._threadA;
    }


    public Uint8 getThreadA() {
        return _threadA;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_threadA);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PairedThreadIdsKey)) {
            return false;
        }
        final PairedThreadIdsKey other = (PairedThreadIdsKey) obj;
        if (!Objects.equals(_threadA, other._threadA)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(PairedThreadIdsKey.class);
        CodeHelpers.appendValue(helper, "_threadA", _threadA);
        return helper.toString();
    }
}

