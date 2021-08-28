package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VlrKey
 implements Identifier<Vlr> {
    private static final long serialVersionUID = -2500942180813186283L;
    private final Uuid _vlrRef;


    public VlrKey(Uuid _vlrRef) {
    
        this._vlrRef = _vlrRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VlrKey(VlrKey source) {
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
        if (!(obj instanceof VlrKey)) {
            return false;
        }
        final VlrKey other = (VlrKey) obj;
        if (!Objects.equals(_vlrRef, other._vlrRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VlrKey.class);
        CodeHelpers.appendValue(helper, "_vlrRef", _vlrRef);
        return helper.toString();
    }
}

