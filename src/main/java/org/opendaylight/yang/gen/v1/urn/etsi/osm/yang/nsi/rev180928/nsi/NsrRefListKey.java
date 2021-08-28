package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class NsrRefListKey
 implements Identifier<NsrRefList> {
    private static final long serialVersionUID = -2298440075165040596L;
    private final Uuid _nsrRef;


    public NsrRefListKey(Uuid _nsrRef) {
    
        this._nsrRef = _nsrRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NsrRefListKey(NsrRefListKey source) {
        this._nsrRef = source._nsrRef;
    }


    public Uuid getNsrRef() {
        return _nsrRef;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_nsrRef);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NsrRefListKey)) {
            return false;
        }
        final NsrRefListKey other = (NsrRefListKey) obj;
        if (!Objects.equals(_nsrRef, other._nsrRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NsrRefListKey.class);
        CodeHelpers.appendValue(helper, "_nsrRef", _nsrRef);
        return helper.toString();
    }
}

