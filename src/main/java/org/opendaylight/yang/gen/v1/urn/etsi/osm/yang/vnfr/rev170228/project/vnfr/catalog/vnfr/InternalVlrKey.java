package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class InternalVlrKey
 implements Identifier<InternalVlr> {
    private static final long serialVersionUID = -7211991255967391674L;
    private final Uuid _vlrRef;


    public InternalVlrKey(Uuid _vlrRef) {
    
        this._vlrRef = _vlrRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InternalVlrKey(InternalVlrKey source) {
        this._vlrRef = source._vlrRef;
    }


    public Uuid getVlrRef() {
        return _vlrRef;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_vlrRef);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalVlrKey)) {
            return false;
        }
        final InternalVlrKey other = (InternalVlrKey) obj;
        if (!Objects.equals(_vlrRef, other._vlrRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(InternalVlrKey.class);
        CodeHelpers.appendValue(helper, "_vlrRef", _vlrRef);
        return helper.toString();
    }
}

