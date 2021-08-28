package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.vip.norev.extended.vip.vip;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class PairedInterfacesKey
 implements Identifier<PairedInterfaces> {
    private static final long serialVersionUID = 6208625942144063381L;
    private final String _vduIdRef;


    public PairedInterfacesKey(String _vduIdRef) {
    
        this._vduIdRef = _vduIdRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PairedInterfacesKey(PairedInterfacesKey source) {
        this._vduIdRef = source._vduIdRef;
    }


    public String getVduIdRef() {
        return _vduIdRef;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_vduIdRef);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PairedInterfacesKey)) {
            return false;
        }
        final PairedInterfacesKey other = (PairedInterfacesKey) obj;
        if (!Objects.equals(_vduIdRef, other._vduIdRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(PairedInterfacesKey.class);
        CodeHelpers.appendValue(helper, "_vduIdRef", _vduIdRef);
        return helper.toString();
    }
}

