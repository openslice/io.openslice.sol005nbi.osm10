package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.vdu;
import com.google.common.base.MoreObjects;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yangtools.yang.common.Uint32;

public class BootOrderKey
 implements Identifier<BootOrder> {
    private static final long serialVersionUID = -3236633096323482894L;
    private final Uint32 _key;


    public BootOrderKey(Uint32 _key) {
    
        this._key = _key;
    }
    
    /**
     * Utility migration constructor.
     *
     * @param _key key in legacy Java type
     * @deprecated Use {#link BootOrderKey(Uint32)} instead.
     */
    @Deprecated(forRemoval = true)
    public BootOrderKey(Long _key) {
        this(CodeHelpers.compatUint(_key));
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public BootOrderKey(BootOrderKey source) {
        this._key = source._key;
    }


    public Uint32 getKey() {
        return _key;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_key);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BootOrderKey)) {
            return false;
        }
        final BootOrderKey other = (BootOrderKey) obj;
        if (!Objects.equals(_key, other._key)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(BootOrderKey.class);
        CodeHelpers.appendValue(helper, "_key", _key);
        return helper.toString();
    }
}

