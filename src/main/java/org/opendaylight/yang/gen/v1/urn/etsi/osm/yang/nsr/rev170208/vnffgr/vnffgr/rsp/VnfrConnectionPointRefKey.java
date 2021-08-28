package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.vnffgr.rsp;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yangtools.yang.common.Uint8;

public class VnfrConnectionPointRefKey
 implements Identifier<VnfrConnectionPointRef> {
    private static final long serialVersionUID = -1518245190494016078L;
    private final Uint8 _hopNumber;


    public VnfrConnectionPointRefKey(Uint8 _hopNumber) {
    
        this._hopNumber = _hopNumber;
    }
    
    /**
     * Utility migration constructor.
     *
     * @param _hopNumber hopNumber in legacy Java type
     * @deprecated Use {#link VnfrConnectionPointRefKey(Uint8)} instead.
     */
    @Deprecated(forRemoval = true)
    public VnfrConnectionPointRefKey(Short _hopNumber) {
        this(CodeHelpers.compatUint(_hopNumber));
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfrConnectionPointRefKey(VnfrConnectionPointRefKey source) {
        this._hopNumber = source._hopNumber;
    }


    public Uint8 getHopNumber() {
        return _hopNumber;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_hopNumber);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VnfrConnectionPointRefKey)) {
            return false;
        }
        final VnfrConnectionPointRefKey other = (VnfrConnectionPointRefKey) obj;
        if (!Objects.equals(_hopNumber, other._hopNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfrConnectionPointRefKey.class);
        CodeHelpers.appendValue(helper, "_hopNumber", _hopNumber);
        return helper.toString();
    }
}

